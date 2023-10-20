package com.calibermc.caliber.world.feature;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;

import java.util.List;

public class ModConfiguredFeatures {

    //Metal Ores
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TIN_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TIN_ORE = FeatureUtils.register("tin_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES, CaliberCommonConfigs.TIN_VEIN_SIZE.get()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.register("silver_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, CaliberCommonConfigs.SILVER_VEIN_SIZE.get()));

    //Stone
    public static final List<OreConfiguration.TargetBlockState> BLACK_GRANITE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.BLACK_GRANITE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MOD_GRANITE_ORE = FeatureUtils.register("black_granite_ore",
            Feature.ORE, new OreConfiguration(BLACK_GRANITE_ORE, 64));

    // TODO: Added remaining ores

//    public static final List<OreConfiguration.TargetBlockState> BROWN_GRANITE_ORE = List.of(
//            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.BLACK_GRANITE.get().defaultBlockState()));
//    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MOD_GRANITE_ORE = FeatureUtils.register("brown_granite_ore",
//            Feature.ORE, new OreConfiguration(BROWN_GRANITE_ORE, 64));

}
