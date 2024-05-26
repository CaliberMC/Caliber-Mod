package com.calibermc.caliber.compat.item;

import com.calibermc.caliber.Caliber;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

import java.util.List;

public class RegionsUnexploredItems {
    public static int itemCount = 0;

    public static List<Item> values() {
        return BuiltInRegistries.ITEM.stream().filter(f ->
                BuiltInRegistries.ITEM.getKey(f).getNamespace().equals("regions_unexplored")).toList();
    }

    public static void printItemCounts() {
        System.out.println("Regsions Unexplored Items Registered: " + itemCount);
    }
    public static void init() {
        itemCount ++;
        printItemCounts();
    }
}