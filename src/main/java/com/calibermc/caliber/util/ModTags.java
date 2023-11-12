package com.calibermc.caliber.util;

import com.calibermc.caliber.Caliber;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTags {


    public static class Blocks {


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Caliber.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }

    public static class Items {
        public static final TagKey<Item> armorTab = tag("armor_tab");
        public static final TagKey<Item> brewingTab = tag("brewing_tab");
        public static final TagKey<Item> cobbleBricksTab = tag( "cobble_bricks_tab");
        public static final TagKey<Item> craftingTab = tag("crafting_tab");
        public static final TagKey<Item> cropsTab = tag("crops_tab");
        public static final TagKey<Item> decorTab = tag("decor_tab");
        public static final TagKey<Item> flowersPlantsTab = tag("flowers_plants_tab");
        public static final TagKey<Item> foodTab = tag("food_tab");
        public static final TagKey<Item> furnitureTab = tag("furniture_tab");
        public static final TagKey<Item> glassWindowsTab = tag("glass_windows_tab");
        public static final TagKey<Item> grassDirtTab = tag("grass_dirt_tab");
        public static final TagKey<Item> halfTimberedWallTab = tag("half_timbered_wall_tab");
        public static final TagKey<Item> leavesTab = tag("leaves_tab");
        public static final TagKey<Item> lightingTab = tag("lighting_tab");
        public static final TagKey<Item> logsTab = tag("logs_tab");
        public static final TagKey<Item> metalsOresTab = tag("metals_ores_tab");
        public static final TagKey<Item> miscTab = tag("misc_tab");
        public static final TagKey<Item> planksBeamsTab = tag("planks_beams_tab");
        public static final TagKey<Item> plasterStuccoTab = tag("plaster_stucco_tab");
        public static final TagKey<Item> redstoneTab = tag("redstone_tab");
        public static final TagKey<Item> roofingTab = tag("roofing_tab");
        public static final TagKey<Item> sandGravelTab = tag("sand_gravel_tab");
        public static final TagKey<Item> stoneTab = tag("stone_tab");
        public static final TagKey<Item> storageTab = tag("storage_tab");
        public static final TagKey<Item> tilesFlooringTab = tag("tiles_flooring_tab");
        public static final TagKey<Item> toolsWeaponsTab = tag("tools_weapons_tab");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Caliber.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
