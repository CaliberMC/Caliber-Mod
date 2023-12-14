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
        /* Shapes */
        public static final TagKey<Block> arches = tag("shapes/arches");
        public static final TagKey<Block> arrowslits = tag("shapes/arrowslits");
        public static final TagKey<Block> balustrades = tag("shapes/balustrades");
        public static final TagKey<Block> horizontalBeams = tag("shapes/horizontal_beams");
        public static final TagKey<Block> lintelBeams = tag("shapes/lintel_beams");
        public static final TagKey<Block> postBeams = tag("shapes/post_beams");
        public static final TagKey<Block> verticalBeams = tag("shapes/vertical_beams");

        public static final TagKey<Block> capitals = tag("shapes/capitals");
//        public static final TagKey<Block> columns = tag("shapes/columns");
//        public static final TagKey<Block> cornices = tag("shapes/cornices");
        public static final TagKey<Block> corners = tag("shapes/corners");
        public static final TagKey<Block> doorFrames = tag("shapes/door_frames");
        public static final TagKey<Block> doorFrameLintels = tag("shapes/door_frame_lintels");

        public static final TagKey<Block> eighths = tag("shapes/eighths");
        public static final TagKey<Block> halfArches = tag("shapes/half_arches");
        public static final TagKey<Block> halfLargeArches= tag("shapes/half_large_arches");
        public static final TagKey<Block> halfWindows = tag("shapes/half_windows");
        public static final TagKey<Block> largeArches = tag("shapes/large_arches");
        public static final TagKey<Block> pillars = tag("shapes/pillars");
        public static final TagKey<Block> quarters = tag("shapes/quarters");
        public static final TagKey<Block> verticalCornerSlabs = tag("shapes/vertical_corner_slabs");
        public static final TagKey<Block> verticalQuarters = tag("shapes/vertical_quarters");
        public static final TagKey<Block> verticalSlabs = tag("shapes/vertical_slabs");
        public static final TagKey<Block> windows = tag("shapes/windows");

        /* Materials */
        public static final TagKey<Block> bricks = tag("materials/bricks");
        public static final TagKey<Block> cobblestone = tag("materials/cobblestone");
        public static final TagKey<Block> planks = tag("materials/planks");
        public static final TagKey<Block> smoothStone = tag("materials/smooth_stone");

        /* Forge Block Tags */
        public static final TagKey<Block> GRANITE = forgeTag("granite");
        public static final TagKey<Block> MARBLE = forgeTag("marble");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Caliber.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }

    public static class Items {
        /* Creative Tab Tags */
        public static final TagKey<Item> armorTab = tag("creative_tabs/armor_tab");
        public static final TagKey<Item> brewingTab = tag("creative_tabs/brewing_tab");
        public static final TagKey<Item> cobbleBricksTab = tag( "creative_tabs/cobble_bricks_tab");
        public static final TagKey<Item> craftingTab = tag("creative_tabs/crafting_tab");
        public static final TagKey<Item> cropsTab = tag("creative_tabs/crops_tab");
        public static final TagKey<Item> decorTab = tag("creative_tabs/decor_tab");
        public static final TagKey<Item> flowersPlantsTab = tag("creative_tabs/flowers_plants_tab");
        public static final TagKey<Item> foodTab = tag("creative_tabs/food_tab");
        public static final TagKey<Item> furnitureTab = tag("creative_tabs/furniture_tab");
        public static final TagKey<Item> glassWindowsTab = tag("creative_tabs/glass_windows_tab");
        public static final TagKey<Item> grassDirtTab = tag("creative_tabs/grass_dirt_tab");
        public static final TagKey<Item> halfTimberedWallTab = tag("creative_tabs/half_timbered_wall_tab");
        public static final TagKey<Item> leavesTab = tag("creative_tabs/leaves_tab");
        public static final TagKey<Item> lightingTab = tag("creative_tabs/lighting_tab");
        public static final TagKey<Item> logsTab = tag("creative_tabs/logs_tab");
        public static final TagKey<Item> metalsOresTab = tag("creative_tabs/metals_ores_tab");
        public static final TagKey<Item> miscTab = tag("creative_tabs/misc_tab");
        public static final TagKey<Item> planksBeamsTab = tag("creative_tabs/planks_beams_tab");
        public static final TagKey<Item> plasterStuccoTab = tag("creative_tabs/plaster_stucco_tab");
        public static final TagKey<Item> redstoneTab = tag("creative_tabs/redstone_tab");
        public static final TagKey<Item> roofingTab = tag("creative_tabs/roofing_tab");
        public static final TagKey<Item> sandGravelTab = tag("creative_tabs/sand_gravel_tab");
        public static final TagKey<Item> stoneTab = tag("creative_tabs/stone_tab");
        public static final TagKey<Item> storageTab = tag("creative_tabs/storage_tab");
        public static final TagKey<Item> tilesFlooringTab = tag("creative_tabs/tiles_flooring_tab");
        public static final TagKey<Item> toolsWeaponsTab = tag("creative_tabs/tools_weapons_tab");

        /* Forge Item Tags */
        public static final TagKey<Item> BRONZE_INGOTS = forgeTag("ingots/bronze_ingot");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Caliber.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
