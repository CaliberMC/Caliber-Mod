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

    public static final RegistryObject<Item> RESIN = ITEMS.register("resin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STAINED_ACACIA_SIGN = ITEMS.register("stained_acacia_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), CaliberBlocks.STAINED_ACACIA_SIGN.get(), CaliberBlocks.STAINED_ACACIA_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_ACACIA_HANGING_SIGN = ITEMS.register("stained_acacia_hanging_sign",
            () -> new HangingSignItem(CaliberBlocks.STAINED_ACACIA_HANGING_SIGN.get(), CaliberBlocks.STAINED_ACACIA_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_BIRCH_SIGN = ITEMS.register("stained_birch_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), CaliberBlocks.STAINED_BIRCH_SIGN.get(), CaliberBlocks.STAINED_BIRCH_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_BIRCH_HANGING_SIGN = ITEMS.register("stained_birch_hanging_sign",
            () -> new HangingSignItem(CaliberBlocks.STAINED_BIRCH_HANGING_SIGN.get(), CaliberBlocks.STAINED_BIRCH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_DARK_OAK_SIGN = ITEMS.register("stained_dark_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), CaliberBlocks.STAINED_DARK_OAK_SIGN.get(), CaliberBlocks.STAINED_DARK_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_DARK_OAK_HANGING_SIGN = ITEMS.register("stained_dark_oak_hanging_sign",
            () -> new HangingSignItem(CaliberBlocks.STAINED_DARK_OAK_HANGING_SIGN.get(), CaliberBlocks.STAINED_DARK_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_JUNGLE_SIGN = ITEMS.register("stained_jungle_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), CaliberBlocks.STAINED_JUNGLE_SIGN.get(), CaliberBlocks.STAINED_JUNGLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_JUNGLE_HANGING_SIGN = ITEMS.register("stained_jungle_hanging_sign",
            () -> new HangingSignItem(CaliberBlocks.STAINED_JUNGLE_HANGING_SIGN.get(), CaliberBlocks.STAINED_JUNGLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_OAK_SIGN = ITEMS.register("stained_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), CaliberBlocks.STAINED_OAK_SIGN.get(), CaliberBlocks.STAINED_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_OAK_HANGING_SIGN = ITEMS.register("stained_oak_hanging_sign",
            () -> new HangingSignItem(CaliberBlocks.STAINED_OAK_HANGING_SIGN.get(), CaliberBlocks.STAINED_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_SPRUCE_SIGN = ITEMS.register("stained_spruce_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), CaliberBlocks.STAINED_SPRUCE_SIGN.get(), CaliberBlocks.STAINED_SPRUCE_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_SPRUCE_HANGING_SIGN = ITEMS.register("stained_spruce_hanging_sign",
            () -> new HangingSignItem(CaliberBlocks.STAINED_SPRUCE_HANGING_SIGN.get(), CaliberBlocks.STAINED_SPRUCE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void printItemCounts() {
        System.out.println("Caliber Items Registered: " + itemCount);
    }
    public static void register(IEventBus eventBus) {
        itemCount ++;
        printItemCounts();
        ITEMS.register(eventBus);
    }
}
