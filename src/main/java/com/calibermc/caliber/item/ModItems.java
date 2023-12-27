package com.calibermc.caliber.item;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.item.custom.Hammer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Caliber.MOD_ID);

    public static final RegistryObject<Hammer> HAMMER = ITEMS.register("hammer",
            () -> new Hammer(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));

    public static final RegistryObject<Item> NAILS = ITEMS.register("nails",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));

    public static final RegistryObject<Item> GRASS_STEMS = ITEMS.register("grass_stems",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));


    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModTiers.BRONZE, 3, -2.4f,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModTiers.BRONZE, 1, -2.8f,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModTiers.BRONZE, 1.5f, -3.0f,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModTiers.BRONZE, 6.0f, -3.0f,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModTiers.BRONZE, -2, -0.5f,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> BRONZE_LEGGING = ITEMS.register("bronze_leggings",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));





    public static final RegistryObject<Item> STAINED_ACACIA_SIGN = ITEMS.register("stained_acacia_sign",
            () -> new SignItem(new Item.Properties().tab(CreativeTabs.CALIBER_TAB).stacksTo(16), ModBlocks.STAINED_ACACIA_SIGN.get(), ModBlocks.STAINED_ACACIA_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_BIRCH_SIGN = ITEMS.register("stained_birch_sign",
            () -> new SignItem(new Item.Properties().tab(CreativeTabs.CALIBER_TAB).stacksTo(16), ModBlocks.STAINED_BIRCH_SIGN.get(), ModBlocks.STAINED_BIRCH_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_DARK_OAK_SIGN = ITEMS.register("stained_dark_oak_sign",
            () -> new SignItem(new Item.Properties().tab(CreativeTabs.CALIBER_TAB).stacksTo(16), ModBlocks.STAINED_DARK_OAK_SIGN.get(), ModBlocks.STAINED_DARK_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_JUNGLE_SIGN = ITEMS.register("stained_jungle_sign",
            () -> new SignItem(new Item.Properties().tab(CreativeTabs.CALIBER_TAB).stacksTo(16), ModBlocks.STAINED_JUNGLE_SIGN.get(), ModBlocks.STAINED_JUNGLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_OAK_SIGN = ITEMS.register("stained_oak_sign",
            () -> new SignItem(new Item.Properties().tab(CreativeTabs.CALIBER_TAB).stacksTo(16), ModBlocks.STAINED_OAK_SIGN.get(), ModBlocks.STAINED_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_SPRUCE_SIGN = ITEMS.register("stained_spruce_sign",
            () -> new SignItem(new Item.Properties().tab(CreativeTabs.CALIBER_TAB).stacksTo(16), ModBlocks.STAINED_SPRUCE_SIGN.get(), ModBlocks.STAINED_SPRUCE_WALL_SIGN.get()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
