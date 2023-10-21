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
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BLACK_GRANITE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.BLACK_GRANITE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLACK_GRANITE_ORE = FeatureUtils.register("black_granite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BLACK_GRANITE_ORE, 64));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BROWN_GRANITE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.BROWN_GRANITE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BROWN_GRANITE_ORE = FeatureUtils.register("brown_granite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BROWN_GRANITE_ORE, 64));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_GRAY_GRANITE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.GRAY_GRANITE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GRAY_GRANITE_ORE = FeatureUtils.register("gray_granite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_GRAY_GRANITE_ORE, 64));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PINK_GRANITE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.PINK_GRANITE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PINK_GRANITE_ORE = FeatureUtils.register("pink_granite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PINK_GRANITE_ORE, 64));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_WHITE_GRANITE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.WHITE_GRANITE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> WHITE_GRANITE_ORE = FeatureUtils.register("white_granite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_WHITE_GRANITE_ORE, 64));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_DARK_LIMESTONE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.DARK_LIMESTONE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DARK_LIMESTONE_ORE = FeatureUtils.register("black_granite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_DARK_LIMESTONE_ORE, 64));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_LIGHT_LIMESTONE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.LIGHT_LIMESTONE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LIGHT_LIMESTONE_ORE = FeatureUtils.register("light_limestone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_LIGHT_LIMESTONE_ORE, 64));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PINK_LIMESTONE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.PINK_LIMESTONE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PINK_LIMESTONE_ORE = FeatureUtils.register("pink_limestone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PINK_LIMESTONE_ORE, 64));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TAN_LIMESTONE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.TAN_LIMESTONE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TAN_LIMESTONE_ORE = FeatureUtils.register("tan_limestone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TAN_LIMESTONE_ORE, 64));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BLACK_MARBLE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.BLACK_MARBLE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLACK_MARBLE_ORE = FeatureUtils.register("black_marble_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BLACK_MARBLE_ORE, 32));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_GRAY_MARBLE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.GRAY_MARBLE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GRAY_MARBLE_ORE = FeatureUtils.register("gray_marble_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_GRAY_MARBLE_ORE, 32));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PINK_MARBLE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.PINK_MARBLE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PINK_MARBLE_ORE = FeatureUtils.register("pink_marble_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PINK_MARBLE_ORE, 32));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RED_MARBLE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.RED_MARBLE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RED_MARBLE_ORE = FeatureUtils.register("red_marble_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_RED_MARBLE_ORE, 32));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_WHITE_MARBLE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.WHITE_MARBLE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> WHITE_MARBLE_ORE = FeatureUtils.register("white_marble_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_WHITE_MARBLE_ORE, 32));



    // TODO: Added remaining ores

//    public static final List<OreConfiguration.TargetBlockState> BROWN_GRANITE_ORE = List.of(
//            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.BLACK_GRANITE.get().defaultBlockState()));
//    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MOD_GRANITE_ORE = FeatureUtils.register("brown_granite_ore",
//            Feature.ORE, new OreConfiguration(BROWN_GRANITE_ORE, 64));

}
