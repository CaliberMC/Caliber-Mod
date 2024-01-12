package com.calibermc.caliber.client.inventory;

import com.calibermc.buildify.networking.ModNetworking;
import com.calibermc.buildify.networking.ServerUpdateSlots;
import com.calibermc.caliber.util.InventorySortHelper;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.vertex.PoseStack;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public class SortingButton extends ImageButton {
    public final int initX;

    public SortingButton(AbstractContainerScreen<?> screen, int pX, int pY, boolean player, boolean alphabet) {
        super(pX, pY, 11, 11, alphabet ? 0 : 11, 0, 11, InventorySortHelper.SORTING, 22, 22, (button) -> {
            AbstractContainerMenu menu = screen.getMenu();
            List<ItemStack> list = Lists.newArrayListWithCapacity(menu.slots.size());
            for (Slot slot : menu.slots) {
                list.add(slot.getItem().copy());
            }

            Int2ObjectMap<ItemStack> map = new Int2ObjectOpenHashMap<>();
            // -------------------------------------------------------------------------------
            InventorySortHelper.sortInv(Minecraft.getInstance().player, player, alphabet);

            // -------------------------------------------------------------------------------

            for (int j = 0; j < list.size(); ++j) {
                ItemStack itemstack = list.get(j);
                ItemStack itemstack1 = menu.slots.get(j).getItem();
                if (!ItemStack.matches(itemstack, itemstack1)) {
                    map.put(j, itemstack1.copy());
                }
            }
            ModNetworking.INSTANCE.sendToServer(new ServerUpdateSlots(menu.containerId, menu.getStateId(), map));

        });
        this.initX = pX;
    }
}