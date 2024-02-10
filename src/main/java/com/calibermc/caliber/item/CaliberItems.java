package com.calibermc.caliber.item;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CaliberItems {
    public static int itemCount = 0;

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Caliber.MOD_ID);

//    public static final RegistryObject<Item> RESIN = ITEMS.register("resin",
//            () -> new Item(new Item.Properties()));

    public static void printItemCounts() {
        System.out.println("Caliber Items Registered: " + itemCount);
    }
    public static void register(IEventBus eventBus) {
        itemCount ++;
        printItemCounts();
        ITEMS.register(eventBus);
    }
}
