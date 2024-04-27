package com.calibermc.caliber.compat.data;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliber.compat.block.CreateBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.google.common.collect.Maps;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Stream;

public class CreateBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();


    /* Stone */

    public static final ModBlockFamily CREATE_ASURINE = familyBuilder(AllPaletteStoneTypes.ASURINE.baseBlock.get())
            .fromManager(CreateBlocks.CREATE_ASURINE)
            .getFamily();

    public static final ModBlockFamily CREATE_CRIMSITE = familyBuilder(AllPaletteStoneTypes.CRIMSITE.baseBlock.get())
            .fromManager(CreateBlocks.CREATE_CRIMSITE)
            .getFamily();

    public static final ModBlockFamily CREATE_LIMESTONE = familyBuilder(AllPaletteStoneTypes.LIMESTONE.baseBlock.get())
            .fromManager(CreateBlocks.CREATE_LIMESTONE)
            .getFamily();

    public static final ModBlockFamily CREATE_OCHRUM = familyBuilder(AllPaletteStoneTypes.OCHRUM.baseBlock.get())
            .fromManager(CreateBlocks.CREATE_OCHRUM)
            .getFamily();

    public static final ModBlockFamily CREATE_SCORIA = familyBuilder(AllPaletteStoneTypes.SCORIA.baseBlock.get())
            .fromManager(CreateBlocks.CREATE_SCORIA)
            .getFamily();

    public static final ModBlockFamily CREATE_SCORCHIA = familyBuilder(AllPaletteStoneTypes.SCORCHIA.baseBlock.get())
            .fromManager(CreateBlocks.CREATE_SCORCHIA)
            .getFamily();

    public static final ModBlockFamily CREATE_VERIDIUM = familyBuilder(AllPaletteStoneTypes.VERIDIUM.baseBlock.get())
            .fromManager(CreateBlocks.CREATE_VERIDIUM)
            .getFamily();



    public static ModBlockFamily.Builder familyBuilder(Block pBaseBlock) {
        ModBlockFamily.Builder modBlockFamily$builder = new ModBlockFamily.Builder(pBaseBlock);
        ModBlockFamily modBlockFamily = MAP.put(pBaseBlock, modBlockFamily$builder.getFamily());
        if (modBlockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + ForgeRegistries.BLOCKS.getKey(pBaseBlock));
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

