package com.calibermc.caliber.mixin;

import com.calibermc.caliber.client.inventory.SortingButton;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.world.gen.ModOreGeneration;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.client.gui.screens.recipebook.RecipeUpdateListener;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.item.CreativeModeTab;
import org.apache.commons.compress.utils.Lists;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(AbstractContainerScreen.class)
public abstract class AbstractContainerScreenMixin<T extends AbstractContainerMenu> extends Screen {

    @Shadow protected int leftPos;

    @Shadow @Final protected T menu;

    @Shadow protected int imageHeight;

    @Shadow protected int imageWidth;

    @Shadow protected int topPos;

    @Shadow protected abstract void init();

    @Unique private final List<SortingButton> buildify$sortingButtonList = Lists.newArrayList();

    protected AbstractContainerScreenMixin(Component pTitle) {
        super(pTitle);
    }

    @Inject(method = "init", at = @At("RETURN"))
    public void mixin$init(CallbackInfo ci) {
        boolean displaySortingButtons = CaliberClientConfigs.DISPLAY_SORTING_BUTTONS.get();
        if (displaySortingButtons) {
            AbstractContainerScreen<?> screen = (AbstractContainerScreen<?>) (Object) this;
            int x = this.leftPos + this.imageWidth - 5;
            for (int i = 0; i < 2; i++) {
                boolean playerOnly = this.menu instanceof InventoryMenu || screen instanceof CreativeModeInventoryScreen;
                boolean alphabet = i == 0;
                x -= 13;
                int menuY = this.topPos + (playerOnly ? (this.imageHeight - 98) : 6);

                if (this.menu instanceof ChestMenu) {
                    menuY -= 1;
                }
                this.buildify$sortingButtonList.add(this.addRenderableWidget(new SortingButton(screen, x, menuY, playerOnly, alphabet)));

                if (!playerOnly) {
                    int y = 0;
                    if (!this.menu.slots.isEmpty()) {
                        y = this.menu.getSlot(this.menu.slots.size() - 36).y - 13;
                    }
                    this.buildify$sortingButtonList.add(this.addRenderableWidget(new SortingButton(screen, x, this.topPos + y, true, alphabet)));
                }
            }
            if (screen instanceof CreativeModeInventoryScreen s) {
                for (SortingButton button : this.buildify$sortingButtonList) {
                    button.visible = s.getSelectedTab() == CreativeModeTab.TAB_INVENTORY.getId();
                }
            }
        }
    }

    @Inject(method = "render", at = @At("HEAD"))
    public void mixin$render(CallbackInfo ci) {
        if ((Object) this instanceof CreativeModeInventoryScreen s) {
            for (SortingButton button : this.buildify$sortingButtonList) {
                button.visible = s.getSelectedTab() == CreativeModeTab.TAB_INVENTORY.getId();
            }
        }
        if ((Object) this instanceof RecipeUpdateListener s) {
            for (SortingButton button : this.buildify$sortingButtonList) {
                int x = button.initX;
                button.x = s.getRecipeBookComponent().isVisible() ? 78 + x : x;
            }
        }
    }
}
