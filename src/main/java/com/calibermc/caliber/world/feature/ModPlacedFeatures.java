package com.calibermc.caliber.world.feature;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;

public class ModPlacedFeatures {
//    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
//            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Caliber.MOD_ID);

    //Metal Ores
    public static final Holder<PlacedFeature> TIN_ORE_PLACED = PlacementUtils.register("tin_ore_placed",
            ModConfiguredFeatures.TIN_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.TIN_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.TIN_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.TIN_GEN_MAX.get()))));

    public static final Holder<PlacedFeature> SILVER_ORE_PLACED =  PlacementUtils.register("silver_ore_placed",
                    ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.SILVER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.SILVER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.SILVER_GEN_MAX.get()))));
    //Stone
    public static final Holder<PlacedFeature> BLACK_GRANITE_UPPER_PLACED =  PlacementUtils.register("black_granite_upper_placed",
                    ModConfiguredFeatures.BLACK_GRANITE_ORE, ModOrePlacement.rareOrePlacement(
                    CaliberCommonConfigs.GRANITE_UPPER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> BLACK_GRANITE_LOWER_PLACED =  PlacementUtils.register("black_granite_lower_placed",
                    ModConfiguredFeatures.BLACK_GRANITE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.GRANITE_LOWER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MAX.get()))));

    public static final Holder<PlacedFeature> BROWN_GRANITE_UPPER_PLACED =  PlacementUtils.register("brown_granite_upper_placed",
            ModConfiguredFeatures.BROWN_GRANITE_ORE, ModOrePlacement.rareOrePlacement(
                    CaliberCommonConfigs.GRANITE_UPPER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> BROWN_GRANITE_LOWER_PLACED =  PlacementUtils.register("brown_granite_lower_placed",
            ModConfiguredFeatures.BROWN_GRANITE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.GRANITE_LOWER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MAX.get()))));

    public static final Holder<PlacedFeature> GRAY_GRANITE_UPPER_PLACED =  PlacementUtils.register("gray_granite_upper_placed",
            ModConfiguredFeatures.GRAY_GRANITE_ORE, ModOrePlacement.rareOrePlacement(
                    CaliberCommonConfigs.GRANITE_UPPER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> GRAY_GRANITE_LOWER_PLACED =  PlacementUtils.register("gray_granite_lower_placed",
            ModConfiguredFeatures.GRAY_GRANITE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.GRANITE_LOWER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MAX.get()))));

    public static final Holder<PlacedFeature> PINK_GRANITE_UPPER_PLACED =  PlacementUtils.register("pink_granite_upper_placed",
            ModConfiguredFeatures.PINK_GRANITE_ORE, ModOrePlacement.rareOrePlacement(
                    CaliberCommonConfigs.GRANITE_UPPER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> PINK_GRANITE_LOWER_PLACED =  PlacementUtils.register("pink_granite_lower_placed",
            ModConfiguredFeatures.PINK_GRANITE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.GRANITE_LOWER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MAX.get()))));

    public static final Holder<PlacedFeature> WHITE_GRANITE_UPPER_PLACED =  PlacementUtils.register("white_granite_upper_placed",
            ModConfiguredFeatures.WHITE_GRANITE_ORE, ModOrePlacement.rareOrePlacement(
                    CaliberCommonConfigs.GRANITE_UPPER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> WHITE_GRANITE_LOWER_PLACED =  PlacementUtils.register("white_granite_lower_placed",
            ModConfiguredFeatures.WHITE_GRANITE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.GRANITE_LOWER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MAX.get()))));

    public static final Holder<PlacedFeature> DARK_LIMESTONE_PLACED =  PlacementUtils.register("dark_limestone_placed",
            ModConfiguredFeatures.DARK_LIMESTONE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.LIMESTONE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.LIMESTONE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.LIMESTONE_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> LIGHT_LIMESTONE_PLACED =  PlacementUtils.register("light_limestone_placed",
            ModConfiguredFeatures.LIGHT_LIMESTONE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.LIMESTONE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.LIMESTONE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.LIMESTONE_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> PINK_LIMESTONE_PLACED =  PlacementUtils.register("pink_limestone_placed",
            ModConfiguredFeatures.PINK_LIMESTONE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.LIMESTONE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.LIMESTONE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.LIMESTONE_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> TAN_LIMESTONE_PLACED =  PlacementUtils.register("tan_limestone_placed",
            ModConfiguredFeatures.TAN_LIMESTONE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.LIMESTONE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.LIMESTONE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.LIMESTONE_GEN_MAX.get()))));

    public static final Holder<PlacedFeature> BLACK_MARBLE_PLACED =  PlacementUtils.register("black_marble_placed",
            ModConfiguredFeatures.BLACK_MARBLE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.MARBLE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> GRAY_MARBLE_PLACED =  PlacementUtils.register("gray_marble_placed",
            ModConfiguredFeatures.GRAY_MARBLE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.MARBLE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> PINK_MARBLE_PLACED =  PlacementUtils.register("pink_marble_placed",
            ModConfiguredFeatures.PINK_MARBLE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.MARBLE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> RED_MARBLE_PLACED =  PlacementUtils.register("red_marble_placed",
            ModConfiguredFeatures.RED_MARBLE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.MARBLE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MAX.get()))));
    public static final Holder<PlacedFeature> WHITE_MARBLE_PLACED =  PlacementUtils.register("white_marble_placed",
            ModConfiguredFeatures.WHITE_MARBLE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.MARBLE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.MARBLE_GEN_MAX.get()))));
    
    

// TODO: Added remaining ores

//    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLACK_GRANITE = FeatureUtils.register("ore_granite", Feature.ORE, new OreConfiguration(NATURAL_STONE, Blocks.GRANITE.defaultBlockState(), 64));
//    public static void register(IEventBus eventBus) {
//        PLACED_FEATURES.register(eventBus);
//    }
}
