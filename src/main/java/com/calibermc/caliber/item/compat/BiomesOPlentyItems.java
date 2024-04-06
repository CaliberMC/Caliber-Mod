package com.calibermc.caliber.item.compat;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomesOPlentyItems {
    public static int itemCount = 0;

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "biomesoplenty");


    public static void printItemCounts() {
        System.out.println("Biomes O Plenty Items Registered: " + itemCount);
    }
    public static void register(IEventBus eventBus) {
        itemCount ++;
        printItemCounts();
        ITEMS.register(eventBus);
    }
}
