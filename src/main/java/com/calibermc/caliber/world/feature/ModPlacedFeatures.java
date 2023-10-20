package com.calibermc.caliber.world.feature;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import static net.minecraft.data.worldgen.features.OreFeatures.NATURAL_STONE;

public class ModPlacedFeatures {
//    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
//            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Caliber.MOD_ID);

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

    public static final Holder<PlacedFeature> MOD_GRANITE_UPPER_PLACED =  PlacementUtils.register("mod_granite_upper_placed",
                    ModConfiguredFeatures.MOD_GRANITE_ORE, ModOrePlacement.rareOrePlacement(
                    CaliberCommonConfigs.GRANITE_UPPER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_UPPER_GEN_MAX.get()))));

    public static final Holder<PlacedFeature> MOD_GRANITE_LOWER_PLACED =  PlacementUtils.register("mod_granite_lower_placed",
                    ModConfiguredFeatures.MOD_GRANITE_ORE, ModOrePlacement.commonOrePlacement(
                    CaliberCommonConfigs.GRANITE_LOWER_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MIN.get()),
                            VerticalAnchor.absolute(CaliberCommonConfigs.GRANITE_LOWER_GEN_MAX.get()))));

// TODO: Added remaining ores

//    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLACK_GRANITE = FeatureUtils.register("ore_granite", Feature.ORE, new OreConfiguration(NATURAL_STONE, Blocks.GRANITE.defaultBlockState(), 64));
//    public static void register(IEventBus eventBus) {
//        PLACED_FEATURES.register(eventBus);
//    }
}
