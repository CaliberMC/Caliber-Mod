package com.calibermc.caliber.world.inventory;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

/**
 * Used to prevent items from being placed in a slot with block options, and scaling slots
 */
public class BlockPickerSlot extends Slot {

    protected float scale;

    public BlockPickerSlot(Container pContainer, int pSlot, int pX, int pY, float scale) {
        super(pContainer, pSlot, pX, pY);
        this.scale = scale;
    }

    @Override
    public ItemStack getItem() {
        return super.getItem().copy();
    }

    @Override
    public void onTake(Player pPlayer, ItemStack pStack) {
        if (!pPlayer.isCreative()) {
            pPlayer.getMainHandItem().shrink(1); // removing 1 block item, when variant of it was taken
        }
        super.onTake(pPlayer, pStack);
    }

    @Override
    public boolean mayPlace(ItemStack pStack) {
        return false;
    }

    @Override
    public boolean mayPickup(Player pPlayer) {
        if (this.container.getContainerSize() == 1 && this.index == 0) {
            return false;
        }

        return super.mayPickup(pPlayer);
    }

    @Override
    public void set(ItemStack pStack) {

    }

    @Override
    public ItemStack remove(int amount) {
        return getItem();
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }
}
