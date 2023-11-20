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
        /* Block Type Tags */
        public static final TagKey<Block> arches = tag("arches");
        public static final TagKey<Block> arrowslits = tag("arrowslits");
        public static final TagKey<Block> balustrades = tag("balustrades");
        public static final TagKey<Block> capitals = tag("capitals");
//        public static final TagKey<Block> columns = tag("columns");
//        public static final TagKey<Block> cornices = tag("cornices");
        public static final TagKey<Block> corners = tag("corners");
        public static final TagKey<Block> eighths = tag("eights");
        public static final TagKey<Block> halfArches = tag("half_arches");
        public static final TagKey<Block> halfLargeArches= tag("half_large_arches");
        public static final TagKey<Block> halfWindows = tag("half_windows");
        public static final TagKey<Block> largeArches = tag("large_arches");
        public static final TagKey<Block> pillars = tag("pillars");
        public static final TagKey<Block> quarters = tag("quarters");
        public static final TagKey<Block> verticalCornerSlabs = tag("vertical_corner_slabs");
        public static final TagKey<Block> verticalQuarters = tag("vertical_quarters");
        public static final TagKey<Block> verticalSlabs = tag("vertical_slabs");
        public static final TagKey<Block> windows = tag("windows");



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
