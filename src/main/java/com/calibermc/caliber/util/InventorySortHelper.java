package com.calibermc.caliber.util;

import com.calibermc.caliber.Caliber;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InventorySortHelper {

    public static final ResourceLocation SORTING = new ResourceLocation(Caliber.MOD_ID, "textures/gui/sorting.png");

    public static void sortInv(Player player, boolean sortPlayerInv, boolean alphabet) {
        if (sortPlayerInv) {
            sortInv(player.getInventory(), 9, 27, alphabet);
        } else {
            Container inv = player.containerMenu.getSlot(0).container;
            sortInv(inv, 0, inv.getContainerSize(), alphabet);
        }
    }

    static void sortInv(Container inv, int startSlot, int invSize, boolean alphabet) {
        List<ItemStack> stacks = new ArrayList<>();
        for (int i = 0; i < invSize; i++) {
            addStackWithMerge(stacks, inv.getItem(startSlot + i));
        }

        stacks.sort(Comparator.comparing(stack -> sortByString(stack, alphabet)));
        if (stacks.isEmpty()) {
            return;
        }
        for (int i = 0; i < invSize; i++) {
            inv.setItem(startSlot + i, i < stacks.size() ? stacks.get(i) : ItemStack.EMPTY);
        }
        inv.setChanged();
    }

    private static void addStackWithMerge(List<ItemStack> stacks, ItemStack newStack) {
        if (newStack.getItem() == Items.AIR) return;
        if (newStack.isStackable() && newStack.getCount() != newStack.getMaxStackSize())
            for (int j = stacks.size() - 1; j >= 0; j--) {
                ItemStack oldStack = stacks.get(j);
                if (oldStack.isStackable() && newStack.getDamageValue() == oldStack.getDamageValue()
                        && oldStack.getCount() != oldStack.getMaxStackSize() && ItemStack.isSameItemSameTags(newStack, oldStack)) {

                    if (newStack.getMaxStackSize() >= newStack.getCount() + oldStack.getCount()) {
                        newStack.grow(oldStack.getCount());
                        oldStack.setCount(0);
                    }
                    int maxInsertAmount = Math.min(newStack.getMaxStackSize() - newStack.getCount(), oldStack.getCount());

                    newStack.grow(maxInsertAmount);
                    oldStack.shrink(maxInsertAmount);

                    if (oldStack.getItem() == Items.AIR || oldStack.getCount() == 0)
                        stacks.remove(j);
                }
            }
        stacks.add(newStack);
    }

    static String sortByString(ItemStack stack, boolean alphabet) {
        Item item = stack.getItem();
        String itemName = item.toString();
        if (stack.getCount() < stack.getMaxStackSize()) {
            itemName += stack.getCount();
        }
        if (alphabet) {
            if (stack.hasCustomHoverName()) {
                return stack.getHoverName() + itemName;
            }
        } else {
            CreativeModeTab group = item.getItemCategory();
            if (group != null) {
                String n = group.getDisplayName().getString();
                try {
                    NonNullList<ItemStack> stacks = NonNullList.create();
                    group.fillItemList(stacks);
                    n += stacks.indexOf(stacks.stream().filter(p -> p.getItem().equals(stack.getItem())).findFirst().orElseThrow());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return n + itemName;
            }
            return "zzzzzzzzzzzzzzz" + itemName; // to end of list
        }
        return itemName;
    }
}
