package com.calibermc.caliber.world.gen;

import com.calibermc.caliber.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        // Base Ore Generation
        base.add(ModPlacedFeatures.TIN_ORE_PLACED);
        base.add(ModPlacedFeatures.SILVER_ORE_PLACED);

        base.add(ModPlacedFeatures.BLACK_GRANITE_UPPER_PLACED);
        base.add(ModPlacedFeatures.BLACK_GRANITE_LOWER_PLACED);
        base.add(ModPlacedFeatures.BROWN_GRANITE_UPPER_PLACED);
        base.add(ModPlacedFeatures.BROWN_GRANITE_LOWER_PLACED);
        base.add(ModPlacedFeatures.GRAY_GRANITE_UPPER_PLACED);
        base.add(ModPlacedFeatures.GRAY_GRANITE_LOWER_PLACED);
        base.add(ModPlacedFeatures.PINK_GRANITE_UPPER_PLACED);
        base.add(ModPlacedFeatures.PINK_GRANITE_LOWER_PLACED);
        base.add(ModPlacedFeatures.WHITE_GRANITE_UPPER_PLACED);
        base.add(ModPlacedFeatures.WHITE_GRANITE_LOWER_PLACED);

        base.add(ModPlacedFeatures.DARK_LIMESTONE_PLACED);
        base.add(ModPlacedFeatures.LIGHT_LIMESTONE_PLACED);
        base.add(ModPlacedFeatures.PINK_LIMESTONE_PLACED);
        base.add(ModPlacedFeatures.TAN_LIMESTONE_PLACED);

        base.add(ModPlacedFeatures.BLACK_MARBLE_PLACED);
        base.add(ModPlacedFeatures.GRAY_MARBLE_PLACED);
        base.add(ModPlacedFeatures.PINK_MARBLE_PLACED);
        base.add(ModPlacedFeatures.RED_MARBLE_PLACED);
        base.add(ModPlacedFeatures.WHITE_MARBLE_PLACED);





        // Biome Based Ore Generation
        if(types.contains(BiomeDictionary.Type.PLAINS)) {

        }
    }
}
