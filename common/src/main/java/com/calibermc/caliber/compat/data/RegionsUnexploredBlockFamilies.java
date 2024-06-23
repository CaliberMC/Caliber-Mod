package com.calibermc.caliber.compat.data;

import com.calibermc.caliberlib.data.ModBlockFamily;
import com.google.common.collect.Maps;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;
import java.util.stream.Stream;

public class RegionsUnexploredBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();

    static {
        init();
    }

    @ExpectPlatform
    public static void init() {

    }
    /* Stone */

    public static ModBlockFamily RU_ARGILLITE;
    public static ModBlockFamily RU_CHALK_BLOCK;
    public static ModBlockFamily RU_CHALK_BRICKS;
    public static ModBlockFamily RU_CHALK_PILLAR;
    public static ModBlockFamily RU_MOSSY_STONE;
    public static ModBlockFamily RU_POLISHED_CHALK;

    /* Planks */
    public static ModBlockFamily RU_BAOBAB_PLANKS;
    public static ModBlockFamily RU_BLACKWOOD_PLANKS;
    public static ModBlockFamily RU_BLUE_BIOSHROOM_PLANKS;
    public static ModBlockFamily RU_BRIMWOOD_PLANKS;
    public static ModBlockFamily RU_COBALT_PLANKS;
    public static ModBlockFamily RU_CYPRESS_PLANKS;
    public static ModBlockFamily RU_DEAD_PLANKS;
    public static ModBlockFamily RU_EUCALYPTUS_PLANKS;
    public static ModBlockFamily RU_GREEN_BIOSHROOM_PLANKS;
    public static ModBlockFamily RU_JOSHUA_PLANKS;
    public static ModBlockFamily RU_KAPOK_PLANKS;
    public static ModBlockFamily RU_LARCH_PLANKS;
    public static ModBlockFamily RU_MAGNOLIA_PLANKS;
    public static ModBlockFamily RU_MAPLE_PLANKS;
    public static ModBlockFamily RU_MAUVE_PLANKS;
    public static ModBlockFamily RU_PALM_PLANKS;
    public static ModBlockFamily RU_PINE_PLANKS;
    public static ModBlockFamily RU_PINK_BIOSHROOM_PLANKS;
    public static ModBlockFamily RU_REDWOOD_PLANKS;
    public static ModBlockFamily RU_SOCOTRA_PLANKS;
    public static ModBlockFamily RU_WILLOW_PLANKS;
    public static ModBlockFamily YRU_YELLOW_BIOSHROOM_PLANKS;

    /* Stripped Wood */
    public static ModBlockFamily RU_STRIPPED_BAOBAB;
    public static ModBlockFamily RU_STRIPPED_BLACKWOOD;
    public static ModBlockFamily RU_STRIPPED_BLUE_BIOSHROOM;
    public static ModBlockFamily RU_STRIPPED_BRIMWOOD;
    public static ModBlockFamily RU_STRIPPED_COBALT;
    public static ModBlockFamily RU_STRIPPED_CYPRESS;
    public static ModBlockFamily RU_STRIPPED_DEAD;
    public static ModBlockFamily RU_STRIPPED_EUCALYPTUS;
    public static ModBlockFamily RU_STRIPPED_GREEN_BIOSHROOM;
    public static ModBlockFamily RU_STRIPPED_JOSHUA;
    public static ModBlockFamily RU_STRIPPED_KAPOK;
    public static ModBlockFamily RU_STRIPPED_LARCH;
    public static ModBlockFamily RU_STRIPPED_MAGNOLIA;
    public static ModBlockFamily RU_STRIPPED_MAPLE;
    public static ModBlockFamily RU_STRIPPED_MAUVE;
    public static ModBlockFamily RU_STRIPPED_PALM;
    public static ModBlockFamily RU_STRIPPED_PINE;
    public static ModBlockFamily RU_STRIPPED_PINK_BIOSHROOM;
    public static ModBlockFamily RU_STRIPPED_REDWOOD;
    public static ModBlockFamily RU_STRIPPED_SOCOTRA;
    public static ModBlockFamily RU_STRIPPED_WILLOW;
    public static ModBlockFamily RU_STRIPPED_YELLOW_BIOSHROOM;

    /* Painted Planks */
    public static ModBlockFamily RU_BLACK_PAINTED_PLANKS;
    public static ModBlockFamily RU_BLUE_PAINTED_PLANKS;
    public static ModBlockFamily RU_BROWN_PAINTED_PLANKS;
    public static ModBlockFamily RU_CYAN_PAINTED_PLANKS;
    public static ModBlockFamily RU_GRAY_PAINTED_PLANKS;
    public static ModBlockFamily RU_GREEN_PAINTED_PLANKS;
    public static ModBlockFamily RU_LIGHT_BLUE_PAINTED_PLANKS;
    public static ModBlockFamily RU_LIGHT_GRAY_PAINTED_PLANKS;
    public static ModBlockFamily RU_LIME_PAINTED_PLANKS;
    public static ModBlockFamily RU_MAGENTA_PAINTED_PLANKS;
    public static ModBlockFamily RU_ORANGE_PAINTED_PLANKS;
    public static ModBlockFamily RU_PINK_PAINTED_PLANKS;
    public static ModBlockFamily RU_PURPLE_PAINTED_PLANKS;
    public static ModBlockFamily RU_RED_PAINTED_PLANKS;
    public static ModBlockFamily RU_WHITE_PAINTED_PLANKS;
    public static ModBlockFamily RU_YELLOW_PAINTED_PLANKS;


//    private static RegionsUnexploredBlockFamilies instance = null;
//
//    private RegionsUnexploredBlockFamilies() { }
//
//    public static RegionsUnexploredBlockFamilies getInstance() {
//        if (instance == null) {
//            instance = new RegionsUnexploredBlockFamilies();
//        }
//        return instance;
//    }
//}

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
