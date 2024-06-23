package com.calibermc.caliber.compat.block;

import com.calibermc.caliberlib.block.management.BlockManager;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
//import io.github.uhq_games.regions_unexplored.block.RuBlocks;
import net.minecraft.world.level.block.Block;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

import java.util.function.Supplier;

public class RegionsUnexploredBlocks {
    private static int blockCount = 0;

    /* Stone */
    public static BlockManager RU_ARGILLITE;
    public static BlockManager RU_CHALK;
    public static BlockManager RU_CHALK_BRICKS;
    public static BlockManager RU_CHALK_PILLAR;
    public static BlockManager RU_MOSSY_STONE;
    public static BlockManager RU_POLISHED_CHALK;

    /* Planks */
    public static BlockManager RU_BAOBAB;
    public static BlockManager RU_BLACKWOOD;
    public static BlockManager RU_BLUE_BIOSHROOM;
    public static BlockManager RU_BRIMWOOD;
    public static BlockManager RU_COBALT;
    public static BlockManager RU_CYPRESS;
    public static BlockManager RU_DEAD;
    public static BlockManager RU_EUCALYPTUS;
    public static BlockManager RU_GREEN_BIOSHROOM;
    public static BlockManager RU_JOSHUA;
    public static BlockManager RU_KAPOK;
    public static BlockManager RU_LARCH;
    public static BlockManager RU_MAGNOLIA;
    public static BlockManager RU_MAPLE;
    public static BlockManager RU_MAUVE;
    public static BlockManager RU_PALM;
    public static BlockManager RU_PINE;
    public static BlockManager RU_PINK_BIOSHROOM;
    public static BlockManager RU_REDWOOD;
    public static BlockManager RU_SOCOTRA;
    public static BlockManager RU_WILLOW;
    public static BlockManager RU_YELLOW_BIOSHROOM;

    /* Roofing */
    public static BlockManager RU_BAOBAB_SHINGLES;
    public static BlockManager RU_BLACKWOOD_SHINGLES;
    public static BlockManager RU_BLUE_BIOSHROOM_SHINGLES;
    public static BlockManager RU_BRIMWOOD_SHINGLES;
    public static BlockManager RU_COBALT_SHINGLES;
    public static BlockManager RU_CYPRESS_SHINGLES;
    public static BlockManager RU_DEAD_SHINGLES;
    public static BlockManager RU_EUCALYPTUS_SHINGLES;
    public static BlockManager RU_GREEN_BIOSHROOM_SHINGLES;
    public static BlockManager RU_JOSHUA_SHINGLES;
    public static BlockManager RU_KAPOK_SHINGLES;
    public static BlockManager RU_LARCH_SHINGLES;
    public static BlockManager RU_MAGNOLIA_SHINGLES;
    public static BlockManager RU_MAPLE_SHINGLES;
    public static BlockManager RU_MAUVE_SHINGLES;
    public static BlockManager RU_PALM_SHINGLES;
    public static BlockManager RU_PINE_SHINGLES;
    public static BlockManager RU_PINK_BIOSHROOM_SHINGLES;
    public static BlockManager RU_REDWOOD_SHINGLES;
    public static BlockManager RU_SOCOTRA_SHINGLES;
    public static BlockManager RU_WILLOW_SHINGLES;
    public static BlockManager RU_YELLOW_BIOSHROOM_SHINGLES;

    /* Stripped Wood */
    public static BlockManager RU_STRIPPED_BAOBAB;
    public static BlockManager RU_STRIPPED_BLACKWOOD;
    public static BlockManager RU_STRIPPED_BLUE_BIOSHROOM;
    public static BlockManager RU_STRIPPED_BRIMWOOD;
    public static BlockManager RU_STRIPPED_COBALT;
    public static BlockManager RU_STRIPPED_CYPRESS;
    public static BlockManager RU_STRIPPED_DEAD;
    public static BlockManager RU_STRIPPED_EUCALYPTUS;
    public static BlockManager RU_STRIPPED_GREEN_BIOSHROOM;
    public static BlockManager RU_STRIPPED_JOSHUA;
    public static BlockManager RU_STRIPPED_KAPOK;
    public static BlockManager RU_STRIPPED_LARCH;
    public static BlockManager RU_STRIPPED_MAGNOLIA;
    public static BlockManager RU_STRIPPED_MAPLE;
    public static BlockManager RU_STRIPPED_MAUVE;
    public static BlockManager RU_STRIPPED_PALM;
    public static BlockManager RU_STRIPPED_PINE;
    public static BlockManager RU_STRIPPED_PINK_BIOSHROOM;
    public static BlockManager RU_STRIPPED_REDWOOD;
    public static BlockManager RU_STRIPPED_SOCOTRA;
    public static BlockManager RU_STRIPPED_WILLOW;
    public static BlockManager RU_STRIPPED_YELLOW_BIOSHROOM;
    public static BlockManager RU_BLACK_PAINTED;
    public static BlockManager RU_BLUE_PAINTED;
    public static BlockManager RU_BROWN_PAINTED;
    public static BlockManager RU_CYAN_PAINTED;
    public static BlockManager RU_GRAY_PAINTED;
    public static BlockManager RU_GREEN_PAINTED;
    public static BlockManager RU_LIGHT_BLUE_PAINTED;
    public static BlockManager RU_LIGHT_GRAY_PAINTED;
    public static BlockManager RU_LIME_PAINTED;
    public static BlockManager RU_MAGENTA_PAINTED;
    public static BlockManager RU_ORANGE_PAINTED;
    public static BlockManager RU_PINK_PAINTED;
    public static BlockManager RU_PURPLE_PAINTED;
    public static BlockManager RU_RED_PAINTED;
    public static BlockManager RU_WHITE_PAINTED;
    public static BlockManager RU_YELLOW_PAINTED;

    /* Painted Roofing */
    public static BlockManager RU_BLACK_PAINTED_SHINGLES;
    public static BlockManager RU_BLUE_PAINTED_SHINGLES;
    public static BlockManager RU_BROWN_PAINTED_SHINGLES;
    public static BlockManager RU_CYAN_PAINTED_SHINGLES;
    public static BlockManager RU_GRAY_PAINTED_SHINGLES;
    public static BlockManager RU_GREEN_PAINTED_SHINGLES;
    public static BlockManager RU_LIGHT_BLUE_PAINTED_SHINGLES;
    public static BlockManager RU_LIGHT_GRAY_PAINTED_SHINGLES;
    public static BlockManager RU_LIME_PAINTED_SHINGLES;
    public static BlockManager RU_MAGENTA_PAINTED_SHINGLES;
    public static BlockManager RU_ORANGE_PAINTED_SHINGLES;
    public static BlockManager RU_PINK_PAINTED_SHINGLES;
    public static BlockManager RU_PURPLE_PAINTED_SHINGLES;
    public static BlockManager RU_RED_PAINTED_SHINGLES;
    public static BlockManager RU_WHITE_PAINTED_SHINGLES;
    public static BlockManager RU_YELLOW_PAINTED_SHINGLES;

    @ExpectPlatform
    public static void init() {
    }

    public static void printBlockCounts() {
        System.out.println("Caliber Mod registered " + blockCount + " new Regions Unexplored blocks.");
    }

    private static <T extends Block> RegSupplier<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return RegHelper.registerBlock(new ResourceLocation("regions_unexplored", name), block);
    }

    public static <T extends Block> RegSupplier<T> registerBlock(String name, Supplier<T> block) {
        RegSupplier<T> toReturn = RegHelper.registerBlockWithItem(new ResourceLocation("regions_unexplored", name), block);
        blockCount++;
        return toReturn;
    }
}

