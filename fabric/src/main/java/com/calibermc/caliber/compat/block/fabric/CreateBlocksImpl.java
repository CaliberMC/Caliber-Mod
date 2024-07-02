package com.calibermc.caliber.compat.block.fabric;

import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static com.calibermc.caliber.compat.block.CreateBlocks.*;
import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;

public class CreateBlocksImpl {
    public static void init() {
        registerManagersFor("andesite", () -> BlockBehaviour.Properties.copy(Blocks.ANDESITE), AllPaletteStoneTypes.ANDESITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("asurine", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), AllPaletteStoneTypes.ASURINE, STONE_VARIANTS);
        registerManagersFor("calcite", () -> BlockBehaviour.Properties.copy(Blocks.CALCITE), AllPaletteStoneTypes.CALCITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("crimsite", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), AllPaletteStoneTypes.CRIMSITE, STONE_VARIANTS);
        registerManagersFor("deepslate", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), AllPaletteStoneTypes.DEEPSLATE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("diorite", () -> BlockBehaviour.Properties.copy(Blocks.DIORITE), AllPaletteStoneTypes.DIORITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("dripstone", () -> BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK), AllPaletteStoneTypes.DRIPSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("granite", () -> BlockBehaviour.Properties.copy(Blocks.GRANITE), AllPaletteStoneTypes.GRANITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("limestone", () -> BlockBehaviour.Properties.copy(Blocks.SANDSTONE), AllPaletteStoneTypes.LIMESTONE, STONE_VARIANTS);
        registerManagersFor("ochrum", () -> BlockBehaviour.Properties.copy(Blocks.CALCITE), AllPaletteStoneTypes.OCHRUM, STONE_VARIANTS);
        registerManagersFor("scoria", () -> BlockBehaviour.Properties.copy(Blocks.BLACKSTONE), AllPaletteStoneTypes.SCORIA, STONE_VARIANTS);
        registerManagersFor("scorchia", () -> BlockBehaviour.Properties.copy(Blocks.BLACKSTONE), AllPaletteStoneTypes.SCORCHIA, STONE_VARIANTS);
        registerManagersFor("tuff", () -> BlockBehaviour.Properties.copy(Blocks.TUFF), AllPaletteStoneTypes.TUFF, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("veridium", () -> BlockBehaviour.Properties.copy(Blocks.TUFF), AllPaletteStoneTypes.VERIDIUM, STONE_VARIANTS);
    }
}
