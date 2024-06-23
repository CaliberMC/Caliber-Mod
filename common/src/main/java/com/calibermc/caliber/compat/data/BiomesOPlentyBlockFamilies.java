package com.calibermc.caliber.compat.data;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.google.common.collect.Maps;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

import java.util.Map;
import java.util.stream.Stream;

public class BiomesOPlentyBlockFamilies {
    /* Stone */
    public static ModBlockFamily BOP_BLACK_SANDSTONE;
    public static ModBlockFamily BOP_BRIMSTONE;
    public static ModBlockFamily BOP_BRIMSTONE_BRICKS;
    public static ModBlockFamily BOP_CHISELED_BLACK_SANDSTONE;
    public static ModBlockFamily BOP_CHISELED_BRIMSTONE_BRICKS;
    public static ModBlockFamily BOP_CHISELED_ORANGE_SANDSTONE;
    public static ModBlockFamily BOP_CHISELED_WHITE_SANDSTONE;
    public static ModBlockFamily BOP_CUT_BLACK_SANDSTONE;
    public static ModBlockFamily BOP_CUT_ORANGE_SANDSTONE;
    public static ModBlockFamily BOP_CUT_WHITE_SANDSTONE;
    public static ModBlockFamily BOP_SMOOTH_BLACK_SANDSTONE;
    public static ModBlockFamily BOP_SMOOTH_ORANGE_SANDSTONE;
    public static ModBlockFamily BOP_SMOOTH_WHITE_SANDSTONE;
    /* Planks */
    public static ModBlockFamily BOP_DEAD_PLANKS;
    public static ModBlockFamily BOP_FIR_PLANKS;
    public static ModBlockFamily BOP_HELLBARK_PLANKS;
    public static ModBlockFamily BOP_JACARANDA_PLANKS;
    public static ModBlockFamily BOP_MAGIC_PLANKS;
    public static ModBlockFamily BOP_MAHOGANY_PLANKS;
    public static ModBlockFamily BOP_PALM_PLANKS;
    public static ModBlockFamily BOP_REDWOOD_PLANKS;
    public static ModBlockFamily BOP_UMBRAN_PLANKS;
    public static ModBlockFamily BOP_WILLOW_PLANKS;
    /* Stripped Wood */
    public static ModBlockFamily BOP_STRIPPED_DEAD_WOOD;
    public static ModBlockFamily BOP_STRIPPED_FIR_WOOD;
    public static ModBlockFamily BOP_STRIPPED_HELLBARK_WOOD;
    public static ModBlockFamily BOP_STRIPPED_JACARANDA_WOOD;
    public static ModBlockFamily BOP_STRIPPED_MAGIC_WOOD;
    public static ModBlockFamily BOP_STRIPPED_MAHOGANY_WOOD;
    public static ModBlockFamily BOP_STRIPPED_PALM_WOOD;
    public static ModBlockFamily BOP_STRIPPED_REDWOOD_WOOD;
    public static ModBlockFamily BOP_STRIPPED_UMBRAN_WOOD;
    public static ModBlockFamily BOP_STRIPPED_WILLOW_WOOD;
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();

    static {
        init();
    }

    @ExpectPlatform
    public static void init() {

    }

    public static ModBlockFamily.Builder familyBuilder(Block pBaseBlock) {
        ModBlockFamily.Builder modBlockFamily$builder = new ModBlockFamily.Builder(pBaseBlock);
        ModBlockFamily modBlockFamily = MAP.put(pBaseBlock, modBlockFamily$builder.getFamily());
        if (modBlockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + BuiltInRegistries.BLOCK.getKey(pBaseBlock));
        } else {
            return modBlockFamily$builder;
        }
    }

    public static Stream<ModBlockFamily> getAllFamilies() {
        return MAP.values().stream();
    }

    public static Map getAllFamiliesAsMap() {
        return MAP;
    }
}

