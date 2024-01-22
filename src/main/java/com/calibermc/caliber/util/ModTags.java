package com.calibermc.caliber.util;

import com.calibermc.caliber.Caliber;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {


    public static class Blocks {


        /* Shapes */
        public static final TagKey<Block> arches = tag("shapes/arches");
        public static final TagKey<Block> arrowslits = tag("shapes/arrowslits");
        public static final TagKey<Block> balustrades = tag("shapes/balustrades");
        public static final TagKey<Block> horizontalBeams = tag("shapes/horizontal_beams");
        public static final TagKey<Block> lintelBeams = tag("shapes/lintel_beams");
        public static final TagKey<Block> postBeams = tag("shapes/post_beams");
        public static final TagKey<Block> tallWoodenDoors = tag("shapes/tall_wooden_doors");
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
