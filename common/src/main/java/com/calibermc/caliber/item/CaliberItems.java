package com.calibermc.caliber.item;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

import java.util.List;

public class CaliberItems {
    public static int itemCount = 0;

    public static List<Item> values() {
        return BuiltInRegistries.ITEM.stream().filter(f -> BuiltInRegistries.ITEM.getKey(f).getNamespace().equals(Caliber.MOD_ID)).toList();
    }

    public static void printItemCounts() {
        System.out.println("Caliber Items Registered: " + itemCount);
    }
    public static void init() {
        itemCount ++;
        printItemCounts();
    }
}
