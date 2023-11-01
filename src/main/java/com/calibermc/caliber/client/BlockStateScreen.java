package com.calibermc.caliber.client;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.world.inventory.BlockStateMenu;
import com.calibermc.caliber.world.inventory.BlockStateSlot;
import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.MenuAccess;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec2;
import net.minecraftforge.client.RenderProperties;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

import static net.minecraft.util.Mth.PI;

public class BlockStateScreen extends Screen implements MenuAccess<BlockStateMenu> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Caliber.MOD_ID, "textures/gui/blank.png");
    protected static final ResourceLocation SLOT_SHADOW = new ResourceLocation(Caliber.MOD_ID, "textures/gui/slot.png");
    protected static final int RADIUS = 56;
    public final BlockStateMenu menu;
    public final Map<Slot, Vec2> slotPositions = new HashMap<>();
    protected final Inventory playerInventory;
    protected int imageWidth = 176, imageHeight = 141;
    protected int leftPos, topPos;
    @Nullable
    private Slot hoveredSlot, clickedSlot, quickdropSlot, lastClickSlot;
    private boolean isSplittingStack;
    private ItemStack draggingItem = ItemStack.EMPTY;
    private long quickdropTime;
    private boolean skipNextRelease;
    private long lastClickTime;
    private int lastClickButton;
    private boolean doubleclick;

    public BlockStateScreen(BlockStateMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pTitle);
        this.menu = pMenu;
        this.playerInventory = pPlayerInventory;
        this.skipNextRelease = true;
    }

    @Override
    protected void init() {
        super.init();
        // 95 is half of scaled image
        this.leftPos = this.width / 2 - 95 + 7;
        this.topPos = this.height / 2 - 95 + 25;

        this.slotPositions.clear();

        // list without main slot and players hotbar to create radial slots
        var list = this.menu.slots.stream().filter(slot -> !slot.container.equals(this.playerInventory) && this.menu.slots.indexOf(slot) != 0).toList();
        for (Slot slot : this.menu.slots) {
            if (slot.container.equals(this.playerInventory)) {
                this.slotPositions.put(slot, new Vec2(slot.x, this.height - topPos - 19));
            } else {
                if (this.menu.slots.indexOf(slot) == 0) {
                    this.slotPositions.put(slot, new Vec2(this.width / 2F - leftPos - 8, this.height / 2F - topPos - 8));
                } else {
                    int i = list.indexOf(slot);
                    int stateCount = list.size();

                    float f = ((i * 2F - 1) / stateCount - 0.5F) * PI;
                    float x = this.width / 2F + Mth.cos(f) * RADIUS - 8;
                    float y = this.height / 2F + Mth.sin(f) * RADIUS - 8;
                    this.slotPositions.put(slot, new Vec2(x - leftPos, y - topPos));
                }
            }
        }
    }

    private void renderFloatingItem(ItemStack pStack, int pX, int pY) {
        PoseStack posestack = RenderSystem.getModelViewStack();
        posestack.translate(0.0D, 0.0D, 32.0D);
        RenderSystem.applyModelViewMatrix();
        this.setBlitOffset(200);
        this.itemRenderer.blitOffset = 200.0F;
        Font font = RenderProperties.get(pStack).getFont(pStack);
        if (font == null) font = this.font;
        this.itemRenderer.renderAndDecorateItem(pStack, pX, pY);
        this.itemRenderer.renderGuiItemDecorations(font, pStack, pX, pY - (this.draggingItem.isEmpty() ? 0 : 8));
        this.setBlitOffset(0);
        this.itemRenderer.blitOffset = 0.0F;

    }

    private void renderSlot(PoseStack pPoseStack, Slot pSlot, boolean renderShadow, double mouseX, double mouseY) {
        Vec2 slotPos = this.slotPositions.get(pSlot);
        int x = (int) slotPos.x;
        int y = (int) slotPos.y;
        ItemStack itemstack = pSlot.getItem();
        if (pSlot == this.clickedSlot && !this.draggingItem.isEmpty() && this.isSplittingStack && !itemstack.isEmpty()) {
            itemstack = itemstack.copy();
            itemstack.setCount(itemstack.getCount() / 2);
        }

        this.setBlitOffset(100);
        this.itemRenderer.blitOffset = 100.0F;

        float scale = 1;
        if (pSlot instanceof BlockStateSlot slot) {
            scale = slot.getScale(); // getting a basic size

            if (this.menu.slots.indexOf(slot) != 0) {
                // zooming
                double x1 = x + this.leftPos - mouseX;
                double y1 = y + this.topPos - mouseY;

                double distance = x1 * x1 + y1 * y1;
                float twoRad = RADIUS * RADIUS;
                double f = (twoRad - distance) / twoRad;
                float zoomingVal = 1;
                if (f > 0) {
                    scale += Math.max((f * f) * zoomingVal, 0);
                }
            }
        }


        PoseStack posestack = RenderSystem.getModelViewStack();
        posestack.pushPose();
        posestack.translate(x + 8, y + 8, 0.0D);
        posestack.scale(scale, scale, 1F); // scaling with pivot
        posestack.translate(-(x + 8), -(y + 8), 0.0D);
        RenderSystem.applyModelViewMatrix();
        {
            // render shadow
            if (renderShadow) {
                RenderSystem.enableBlend();
                RenderSystem.defaultBlendFunc();
                RenderSystem.setShaderTexture(0, SLOT_SHADOW);
                blit(pPoseStack, x, y + 2, 0, 0, 0, 16, 16, 16, 16);
            }

            //fill(pPoseStack, x, y, x + 16, y + 16, -2130706433); // to see a position and size of slot
            // render item
            RenderSystem.enableDepthTest();
            this.itemRenderer.renderAndDecorateItem(this.minecraft.player, itemstack, x, y, (int) (slotPos.x + slotPos.y * this.imageWidth));
            this.itemRenderer.renderGuiItemDecorations(this.font, itemstack, x, y, null);
        }

        posestack.popPose();
        RenderSystem.applyModelViewMatrix();

        this.itemRenderer.blitOffset = 0.0F;
        this.setBlitOffset(0);
    }

    @Nullable
    private Slot findSlot(double pMouseX, double pMouseY) {
        for (int i = 0; i < this.menu.slots.size(); ++i) {
            Slot slot = this.menu.slots.get(i);
            if (this.isHoveringSlot(slot, pMouseX, pMouseY) && slot.isActive()) {
                return slot;
            }
        }

        return null;
    }

    @Override
    public boolean mouseClicked(double pMouseX, double pMouseY, int pButton) {
        if (!super.mouseClicked(pMouseX, pMouseY, pButton)) {
            InputConstants.Key mouseKey = InputConstants.Type.MOUSE.getOrCreate(pButton);
            boolean flag = this.minecraft.options.keyPickItem.isActiveAndMatches(mouseKey);
            Slot slot = this.findSlot(pMouseX, pMouseY);
            long i = Util.getMillis();
            this.doubleclick = this.lastClickSlot == slot && i - this.lastClickTime < 250L && this.lastClickButton == pButton;
            this.skipNextRelease = false;
            if (pButton != 0 && pButton != 1 && !flag) {
                if (this.hoveredSlot != null && this.menu.getCarried().isEmpty()) {
                    for (int j = 0; j < 9; ++j) {
                        if (this.minecraft.options.keyHotbarSlots[j].matchesMouse(pButton)) {
                            this.slotClicked(this.hoveredSlot, this.hoveredSlot.index, j, ClickType.SWAP);
                        }
                    }
                }
            } else {
                int j = this.leftPos;
                int k = this.topPos;
                boolean flag1 = this.hasClickedOutside(pMouseX, pMouseY, j, k);
                if (slot != null)
                    flag1 = false; // Forge, prevent dropping of items through slots outside of GUI boundaries
                int l = -1;
                if (slot != null) {
                    l = slot.index;
                }

                if (flag1) {
                    l = -999;
                }

                if (this.minecraft.options.touchscreen && flag1 && this.menu.getCarried().isEmpty()) {
                    this.minecraft.setScreen(null);
                    return true;
                }

                if (l != -1) {
                    if (this.minecraft.options.touchscreen) {
                        if (slot != null && slot.hasItem()) {
                            this.clickedSlot = slot;
                            this.draggingItem = ItemStack.EMPTY;
                            this.isSplittingStack = pButton == 1;
                        } else {
                            this.clickedSlot = null;
                        }
                    } else {
                        if (this.menu.getCarried().isEmpty()) {
                            if (this.minecraft.options.keyPickItem.isActiveAndMatches(mouseKey)) {
                                this.slotClicked(slot, l, pButton, ClickType.CLONE);
                            } else {
                                ClickType clicktype = ClickType.PICKUP;
                                if (l == -999) {
                                    clicktype = ClickType.THROW;
                                }

                                this.slotClicked(slot, l, pButton, clicktype);
                            }

                            this.skipNextRelease = true;
                        }
                    }
                }
            }

            this.lastClickSlot = slot;
            this.lastClickTime = i;
            this.lastClickButton = pButton;
        }
        return true;
    }

    protected boolean hasClickedOutside(double pMouseX, double pMouseY, int pGuiLeft, int pGuiTop) {
        return pMouseX < (double) pGuiLeft || pMouseY < (double) pGuiTop || pMouseX >= (double) (pGuiLeft + this.imageWidth) || pMouseY >= (double) (pGuiTop + this.imageHeight);
    }

    @Override
    public boolean mouseDragged(double pMouseX, double pMouseY, int pButton, double pDragX, double pDragY) {
        Slot slot = this.findSlot(pMouseX, pMouseY);
        if (this.clickedSlot != null && this.minecraft.options.touchscreen) {
            if (pButton == 0 || pButton == 1) {
                if (this.draggingItem.isEmpty()) {
                    if (slot != this.clickedSlot && !this.clickedSlot.getItem().isEmpty()) {
                        this.draggingItem = this.clickedSlot.getItem().copy();
                    }
                } else if (this.draggingItem.getCount() > 1 && slot != null && AbstractContainerMenu.canItemQuickReplace(slot, this.draggingItem, false)) {
                    long i = Util.getMillis();
                    if (this.quickdropSlot == slot) {
                        if (i - this.quickdropTime > 500L) {
                            this.slotClicked(this.clickedSlot, this.clickedSlot.index, 0, ClickType.PICKUP);
                            this.slotClicked(slot, slot.index, 1, ClickType.PICKUP);
                            this.slotClicked(this.clickedSlot, this.clickedSlot.index, 0, ClickType.PICKUP);
                            this.quickdropTime = i + 750L;
                            this.draggingItem.shrink(1);
                        }
                    } else {
                        this.quickdropSlot = slot;
                        this.quickdropTime = i;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean mouseReleased(double pMouseX, double pMouseY, int pButton) {
        super.mouseReleased(pMouseX, pMouseY, pButton);
        Slot slot = this.findSlot(pMouseX, pMouseY);
        assert this.minecraft != null;
        boolean flag = this.hasClickedOutside(pMouseX, pMouseY, this.leftPos, this.topPos);
        if (slot != null) flag = false; // Forge, prevent dropping of items through slots outside of GUI boundaries
        InputConstants.Key mouseKey = InputConstants.Type.MOUSE.getOrCreate(pButton);
        int k = -1;
        if (slot != null) {
            k = slot.index;
        }

        if (flag) {
            k = -999;
        }

        if (this.doubleclick && slot != null && pButton == 0 && this.menu.canTakeItemForPickAll(ItemStack.EMPTY, slot)) {
            this.slotClicked(slot, k, pButton, ClickType.PICKUP_ALL);

            this.doubleclick = false;
            this.lastClickTime = 0L;
        } else {

            if (this.skipNextRelease) {
                this.skipNextRelease = false;
                return true;
            }

            if (!this.menu.getCarried().isEmpty()) {
                if (this.minecraft.options.keyPickItem.isActiveAndMatches(mouseKey)) {
                    this.slotClicked(slot, k, pButton, ClickType.CLONE);
                } else {
                    this.slotClicked(slot, k, pButton, ClickType.PICKUP);
                }
            }
        }

        if (this.menu.getCarried().isEmpty()) {
            this.lastClickTime = 0L;
        }
        return true;
    }

    private boolean isHoveringSlot(Slot pSlot, double pMouseX, double pMouseY) {
        Vec2 slotPos = this.slotPositions.get(pSlot);
        float scale = 16;
        if (pSlot instanceof BlockStateSlot slot) {
            scale *= slot.getScale();
        }
        return this.isHovering(slotPos.x, slotPos.y, scale, scale, pMouseX, pMouseY);
    }

    protected boolean isHovering(double pX, double pY, double pWidth, double pHeight, double pMouseX, double pMouseY) {
        pMouseX -= this.leftPos;
        pMouseY -= this.topPos;
        return pMouseX >= (pX - 1) && pMouseX < (pX + pWidth + 1) && pMouseY >= (pY - 1) && pMouseY < (pY + pHeight + 1);
    }

    protected void slotClicked(Slot pSlot, int pSlotId, int pMouseButton, ClickType pType) {
        if (pSlot != null) {
            pSlotId = pSlot.index;
        }

        this.minecraft.gameMode.handleInventoryMouseClick(this.menu.containerId, pSlotId, pMouseButton, pType, this.minecraft.player);
    }

    @Override
    public boolean keyPressed(int pKeyCode, int pScanCode, int pModifiers) {
        InputConstants.Key mouseKey = InputConstants.getKey(pKeyCode, pScanCode);
        if (super.keyPressed(pKeyCode, pScanCode, pModifiers)) {
            return true;
        } else if (this.minecraft.options.keyInventory.isActiveAndMatches(mouseKey)) {
            this.onClose();
            return true;
        } else {
            boolean handled = false;
            if (this.hoveredSlot != null) {
                // interacting with hotbar
                if (this.menu.getCarried().isEmpty()) {
                    for (int i = 0; i < 9; ++i) {
                        if (this.minecraft.options.keyHotbarSlots[i].isActiveAndMatches(InputConstants.getKey(pKeyCode, pScanCode))) {
                            this.slotClicked(this.hoveredSlot, this.hoveredSlot.index, i, ClickType.SWAP);
                            handled = true;
                        }
                    }
                }
                if (this.hoveredSlot.hasItem()) {
                    if (this.minecraft.options.keyPickItem.isActiveAndMatches(mouseKey)) {
                        this.slotClicked(this.hoveredSlot, this.hoveredSlot.index, 0, ClickType.CLONE);
                        handled = true;
                    } else if (this.minecraft.options.keyDrop.isActiveAndMatches(mouseKey)) {
                        this.slotClicked(this.hoveredSlot, this.hoveredSlot.index, hasControlDown() ? 1 : 0, ClickType.THROW);
                        handled = true;
                    }
                } else {
                    // if slot has no item, don't drop
                    if (this.minecraft.options.keyDrop.isActiveAndMatches(mouseKey)) {
                        handled = true;
                    }
                }
            }

            return handled;
        }
    }

    @Override
    public void removed() {
        if (this.minecraft != null && this.minecraft.player != null) {
            this.menu.removed(this.minecraft.player);
        }
    }

    @NotNull
    @Override
    public BlockStateMenu getMenu() {
        return this.menu;
    }

    @Override
    public void onClose() {
        if (this.minecraft != null && this.minecraft.player != null) {
            this.minecraft.player.closeContainer();
        }
        super.onClose();
    }

    @Override
    public void render(@NotNull PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        int width = this.width / 2;
        int height = this.height / 2;

        this.renderBackground(pPoseStack);

        // Rendering hotbar
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, AbstractWidget.WIDGETS_LOCATION);
        int blitOffset = this.getBlitOffset();
        this.setBlitOffset(-90);
        this.blit(pPoseStack, width - 91, this.height - 22, 0, 0, 182, 22);
        this.setBlitOffset(blitOffset);

        // Rendering image
        RenderSystem.setShaderTexture(0, TEXTURE);
        blit(pPoseStack, width - 95, height - 95, 190, 190, 0, 0, 380, 380, 380, 380);

        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);

        int i = this.leftPos;
        int j = this.topPos;
        RenderSystem.disableDepthTest();
        PoseStack posestack = RenderSystem.getModelViewStack();
        posestack.pushPose();
        posestack.translate(i, j, 0.0D);
        RenderSystem.applyModelViewMatrix();
        this.hoveredSlot = null; // reset so as not to have problems with the hovered slot
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        for (Slot slot : this.menu.slots) {
            if (slot.isActive()) {
                RenderSystem.setShader(GameRenderer::getPositionTexShader);
                this.renderSlot(pPoseStack, slot, !slot.container.equals(this.playerInventory), pMouseX, pMouseY);
                if (this.isHoveringSlot(slot, pMouseX, pMouseY)) {
                    this.hoveredSlot = slot;
                }
            }
        }

        ItemStack itemstack = this.draggingItem.isEmpty() ? this.menu.getCarried() : this.draggingItem;
        if (!itemstack.isEmpty()) {
            int i2 = this.draggingItem.isEmpty() ? 8 : 16;
            if (!this.draggingItem.isEmpty() && this.isSplittingStack) {
                itemstack = itemstack.copy();
                itemstack.setCount(Mth.ceil((float) itemstack.getCount() / 2.0F));
            }

            this.renderFloatingItem(itemstack, pMouseX - i - 8, pMouseY - j - i2);
        }

        posestack.popPose();
        RenderSystem.applyModelViewMatrix();
        RenderSystem.enableDepthTest();

        // render tooltip above hotbar
        if (this.menu.getCarried().isEmpty() && this.hoveredSlot != null && this.hoveredSlot.hasItem()) {
            ItemStack stack = this.hoveredSlot.getItem();
            MutableComponent mutablecomponent = (new TextComponent("")).append(stack.getHoverName()).withStyle(stack.getRarity().getStyleModifier());
            if (stack.hasCustomHoverName()) {
                mutablecomponent.withStyle(ChatFormatting.ITALIC);
            }
            Component highlightTip = stack.getHighlightTip(mutablecomponent);
            int w = width - this.font.width(highlightTip) / 2;
            int h = this.height - 22 - 10;
            this.font.drawShadow(pPoseStack, highlightTip, (float) w, (float) h, 16777215);
        }
        // default minecraft tooltip in guis
        /*if (this.menu.getCarried().isEmpty() && this.hoveredSlot != null && this.hoveredSlot.hasItem()) {
            this.renderTooltip(pPoseStack, this.hoveredSlot.getItem(), pMouseX, pMouseY);
        }*/
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
