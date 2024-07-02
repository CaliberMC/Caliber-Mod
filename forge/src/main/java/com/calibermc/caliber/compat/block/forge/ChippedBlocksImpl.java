package com.calibermc.caliber.compat.block.forge;

import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.mojang.datafixers.util.Pair;
import earth.terrarium.chipped.common.palette.IdType;
import earth.terrarium.chipped.common.palette.Palette;
import earth.terrarium.chipped.common.palette.Palettes;
import earth.terrarium.chipped.common.registry.ModBlocks;
import earth.terrarium.chipped.common.registry.base.ChippedPaletteRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

import static com.calibermc.caliber.compat.block.ChippedBlocks.CHIPPED_MANAGERS;
import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;
import static com.calibermc.caliberlib.block.management.ModBlockHelper.WOOL_VARIANTS;

public class ChippedBlocksImpl {
    public static void init() {
        registerManagersFor("amethyst_block", () -> BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK), ModBlocks.AMETHYST_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("coal_block", () -> BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK), ModBlocks.COAL_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("crying_obsidian", () -> BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN), ModBlocks.CRYING_OBSIDIAN, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("diamond_block", () -> BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), ModBlocks.DIAMOND_BLOCK, Palettes.DIAMOND_BLOCK, STONE_VARIANTS);
        registerManagersFor("emerald_block", () -> BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK), ModBlocks.EMERALD_BLOCK, Palettes.EMERALD_BLOCK, STONE_VARIANTS);
        registerManagersFor("gold_block", () -> BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK), ModBlocks.GOLD_BLOCK, Palettes.DIAMOND_BLOCK, STONE_VARIANTS);
        registerManagersFor("iron_block", () -> BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), ModBlocks.IRON_BLOCK, Palettes.METAL, STONE_VARIANTS);
        registerManagersFor("lapis_block", () -> BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK), ModBlocks.LAPIS_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("lodestone", () -> BlockBehaviour.Properties.copy(Blocks.LODESTONE), ModBlocks.LODESTONE, Palettes.LODESTONE, STONE_VARIANTS);
        registerManagersFor("netherite_block", () -> BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK), ModBlocks.NETHERITE_BLOCK, Palettes.NETHERITE_BLOCK, STONE_VARIANTS);
        registerManagersFor("waxed_copper_block", () -> BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK), ModBlocks.WAXED_COPPER_BLOCK, Palettes.COPPER_BLOCK, STONE_VARIANTS);
        registerManagersFor("waxed_exposed_copper", () -> BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER), ModBlocks.WAXED_EXPOSED_COPPER, Palettes.COPPER_BLOCK, STONE_VARIANTS);
        registerManagersFor("waxed_oxidized_copper", () -> BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER), ModBlocks.WAXED_OXIDIZED_COPPER, Palettes.COPPER_BLOCK, STONE_VARIANTS);
        registerManagersFor("waxed_weathered_copper", () -> BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER), ModBlocks.WAXED_WEATHERED_COPPER, Palettes.COPPER_BLOCK, STONE_VARIANTS);

        registerManagersFor("blue_ice", () -> BlockBehaviour.Properties.copy(Blocks.BLUE_ICE), ModBlocks.BLUE_ICE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("dirt", () -> BlockBehaviour.Properties.copy(Blocks.DIRT), ModBlocks.DIRT, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("ice", () -> BlockBehaviour.Properties.copy(Blocks.ICE), ModBlocks.ICE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("packed_ice", () -> BlockBehaviour.Properties.copy(Blocks.PACKED_ICE), ModBlocks.PACKED_ICE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("snow_block", () -> BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK), ModBlocks.SNOW_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("clay", () -> BlockBehaviour.Properties.copy(Blocks.CLAY), ModBlocks.CLAY, Palettes.CLAY, STONE_VARIANTS);
        registerManagersFor("mud", () -> BlockBehaviour.Properties.copy(Blocks.MUD), ModBlocks.MUD, Palettes.MUD, STONE_VARIANTS);
        registerManagersFor("packed_mud", () -> BlockBehaviour.Properties.copy(Blocks.PACKED_MUD), ModBlocks.PACKED_MUD, Palettes.MUD, STONE_VARIANTS);
        registerManagersFor("bone_block", () -> BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK), ModBlocks.BONE_BLOCK, Palettes.BONE_BLOCK, STONE_VARIANTS);
        registerManagersFor("brown_mushroom_block", () -> BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK), ModBlocks.BROWN_MUSHROOM_BLOCK, Palettes.MUSHROOM_BLOCK, STONE_VARIANTS);
        registerManagersFor("red_mushroom_block", () -> BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK), ModBlocks.RED_MUSHROOM_BLOCK, Palettes.RED_MUSHROOM_BLOCK, STONE_VARIANTS);
        registerManagersFor("mushroom_stem", () -> BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM), ModBlocks.MUSHROOM_STEM, Palettes.MUSHROOM_STEM, STONE_VARIANTS);

        registerManagersFor("acacia_planks", () -> BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("bamboo_planks", () -> BlockBehaviour.Properties.copy(Blocks.BAMBOO), ModBlocks.BAMBOO_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("birch_planks", () -> BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("cherry_planks", () -> BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), ModBlocks.CHERRY_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("crimson_planks", () -> BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("dark_oak_planks", () -> BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("mangrove_planks", () -> BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS), ModBlocks.MANGROVE_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("jungle_planks", () -> BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("oak_planks", () -> BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), ModBlocks.OAK_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("spruce_planks", () -> BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
        registerManagersFor("warped_planks", () -> BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS), ModBlocks.WARPED_PLANKS, Palettes.PLANKS, PLANK_VARIANTS);
//
//        registerManagersFor("acacia_log", () -> BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG), ModBlocks.ACACIA_LOG, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("birch_log", () -> BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG), ModBlocks.BIRCH_LOG, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("cherry_log", () -> BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG), ModBlocks.CHERRY_LOG, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("crimson_stem", () -> BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM), ModBlocks.CRIMSON_STEM, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("dark_oak_log", () -> BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG), ModBlocks.DARK_OAK_LOG, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("mangrove_log", () -> BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG), ModBlocks.MANGROVE_LOG, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("jungle_log", () -> BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG), ModBlocks.JUNGLE_LOG, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("oak_log", () -> BlockBehaviour.Properties.copy(Blocks.OAK_LOG), ModBlocks.OAK_LOG, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("spruce_log", () -> BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG), ModBlocks.SPRUCE_LOG, Palettes.LOG, STONE_VARIANTS);
//        registerManagersFor("warped_stem", () -> BlockBehaviour.Properties.copy(Blocks.WARPED_STEM), ModBlocks.WARPED_STEM, Palettes.LOG, STONE_VARIANTS);
//
//        registerManagersFor("stripped_acacia_log", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG), ModBlocks.STRIPPED_ACACIA_LOG, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_birch_log", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG), ModBlocks.STRIPPED_BIRCH_LOG, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_cherry_log", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG), ModBlocks.STRIPPED_CHERRY_LOG, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_crimson_stem", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM), ModBlocks.STRIPPED_CRIMSON_STEM, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_dark_oak_log", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG), ModBlocks.STRIPPED_DARK_OAK_LOG, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_mangrove_log", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG), ModBlocks.STRIPPED_MANGROVE_LOG, Palettes.STRIPPED_MANGROVE_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_jungle_log", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG), ModBlocks.STRIPPED_JUNGLE_LOG, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_oak_log", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG), ModBlocks.STRIPPED_OAK_LOG, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_spruce_log", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG), ModBlocks.STRIPPED_SPRUCE_LOG, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//        registerManagersFor("stripped_warped_stem", () -> BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_STEM), ModBlocks.STRIPPED_WARPED_STEM, Palettes.STRIPPED_LOG, STONE_VARIANTS);
//
        registerManagersFor("black_wool", () -> BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), ModBlocks.BLACK_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("blue_wool", () -> BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL), ModBlocks.BLUE_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("brown_wool", () -> BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL), ModBlocks.BROWN_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("cyan_wool", () -> BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL), ModBlocks.CYAN_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("gray_wool", () -> BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL), ModBlocks.GRAY_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("green_wool", () -> BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL), ModBlocks.GREEN_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("light_blue_wool", () -> BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL), ModBlocks.LIGHT_BLUE_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("light_gray_wool", () -> BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL), ModBlocks.LIGHT_GRAY_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("lime_wool", () -> BlockBehaviour.Properties.copy(Blocks.LIME_WOOL), ModBlocks.LIME_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("magenta_wool", () -> BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL), ModBlocks.MAGENTA_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("orange_wool", () -> BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL), ModBlocks.ORANGE_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("pink_wool", () -> BlockBehaviour.Properties.copy(Blocks.PINK_WOOL), ModBlocks.PINK_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("purple_wool", () -> BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL), ModBlocks.PURPLE_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("red_wool", () -> BlockBehaviour.Properties.copy(Blocks.RED_WOOL), ModBlocks.RED_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("white_wool", () -> BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), ModBlocks.WHITE_WOOL, Palettes.WOOL, WOOL_VARIANTS);
        registerManagersFor("yellow_wool", () -> BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL), ModBlocks.YELLOW_WOOL, Palettes.WOOL, WOOL_VARIANTS);
//
        registerManagersFor("andesite", () -> BlockBehaviour.Properties.copy(Blocks.ANDESITE), ModBlocks.ANDESITE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("basalt", () -> BlockBehaviour.Properties.copy(Blocks.BASALT), ModBlocks.BASALT, Palettes.BASALT, STONE_VARIANTS);
        registerManagersFor("blackstone", () -> BlockBehaviour.Properties.copy(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE, Palettes.BLACKSTONE, STONE_VARIANTS);
        registerManagersFor("calcite", () -> BlockBehaviour.Properties.copy(Blocks.CALCITE), ModBlocks.CALCITE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("cobblestone", () -> BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), ModBlocks.COBBLESTONE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("dark_prismarine", () -> BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE), ModBlocks.DARK_PRISMARINE, Palettes.DARK_PRISMARINE, STONE_VARIANTS);
        registerManagersFor("deepslate", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE, Palettes.DEEPSLATE, STONE_VARIANTS);
        registerManagersFor("diorite", () -> BlockBehaviour.Properties.copy(Blocks.DIORITE), ModBlocks.DIORITE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("dripstone_block", () -> BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK), ModBlocks.DRIPSTONE_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("end_stone", () -> BlockBehaviour.Properties.copy(Blocks.END_STONE), ModBlocks.END_STONE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("gilded_blackstone", () -> BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE, Palettes.GILDED_BLACKSTONE, STONE_VARIANTS);
        registerManagersFor("granite", () -> BlockBehaviour.Properties.copy(Blocks.GRANITE), ModBlocks.GRANITE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("magma_block", () -> BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK), ModBlocks.MAGMA_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("mossy_cobblestone", () -> BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE), ModBlocks.MOSSY_COBBLESTONE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("mossy_stone_bricks", () -> BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS), ModBlocks.MOSSY_STONE_BRICKS, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("nether_bricks", () -> BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS), ModBlocks.NETHER_BRICKS, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("netherrack", () -> BlockBehaviour.Properties.copy(Blocks.NETHERRACK), ModBlocks.NETHERRACK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("obsidian", () -> BlockBehaviour.Properties.copy(Blocks.OBSIDIAN), ModBlocks.OBSIDIAN, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("prismarine", () -> BlockBehaviour.Properties.copy(Blocks.PRISMARINE), ModBlocks.PRISMARINE, Palettes.PRISMARINE, STONE_VARIANTS);
        registerManagersFor("purpur_block", () -> BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK), ModBlocks.PURPUR_BLOCK, Palettes.PURPUR_BLOCK, STONE_VARIANTS);
        registerManagersFor("quartz_block", () -> BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_BLOCK, Palettes.QUARTZ_BLOCK, STONE_VARIANTS);
        registerManagersFor("raw_copper_block", () -> BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK), ModBlocks.RAW_COPPER_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("raw_gold_block", () -> BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK), ModBlocks.RAW_GOLD_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("raw_iron_block", () -> BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK), ModBlocks.RAW_IRON_BLOCK, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("red_nether_bricks", () -> BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS), ModBlocks.RED_NETHER_BRICKS, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("red_sandstone", () -> BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("sandstone", () -> BlockBehaviour.Properties.copy(Blocks.SANDSTONE), ModBlocks.SANDSTONE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("stone", () -> BlockBehaviour.Properties.copy(Blocks.STONE), ModBlocks.STONE, Palettes.BASE_STONE, STONE_VARIANTS);
        registerManagersFor("smooth_stone", () -> BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_STONE, Palettes.STONE, STONE_VARIANTS);
        registerManagersFor("tuff", () -> BlockBehaviour.Properties.copy(Blocks.TUFF), ModBlocks.TUFF, Palettes.STONE, STONE_VARIANTS);
//
        registerManagersFor("terracotta", () -> BlockBehaviour.Properties.copy(Blocks.TERRACOTTA), ModBlocks.TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("black_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA), ModBlocks.BLACK_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("blue_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA), ModBlocks.BLUE_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("brown_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA), ModBlocks.BROWN_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("cyan_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA), ModBlocks.CYAN_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("gray_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA), ModBlocks.GRAY_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("green_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA), ModBlocks.GREEN_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("light_blue_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA), ModBlocks.LIGHT_BLUE_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("light_gray_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA), ModBlocks.LIGHT_GRAY_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("lime_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA), ModBlocks.LIME_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("magenta_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA), ModBlocks.MAGENTA_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("orange_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA), ModBlocks.ORANGE_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("pink_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA), ModBlocks.PINK_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("purple_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA), ModBlocks.PURPLE_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("red_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA), ModBlocks.RED_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("white_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA), ModBlocks.WHITE_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);
        registerManagersFor("yellow_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA), ModBlocks.YELLOW_TERRACOTTA, Palettes.TERRACOTTA, STONE_VARIANTS);

//        registerManagersFor("black_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA), ModBlocks.BLACK_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("blue_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA), ModBlocks.BLUE_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("brown_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA), ModBlocks.BROWN_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("cyan_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA), ModBlocks.CYAN_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("gray_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA), ModBlocks.GRAY_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("green_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA), ModBlocks.GREEN_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("light_blue_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("light_gray_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("lime_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA), ModBlocks.LIME_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("magenta_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA), ModBlocks.MAGENTA_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("orange_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.ORANGE_GLAZED_TERRACOTTA), ModBlocks.ORANGE_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("pink_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA), ModBlocks.PINK_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("purple_glaed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA), ModBlocks.PURPLE_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("red_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA), ModBlocks.RED_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("white_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA), ModBlocks.WHITE_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//        registerManagersFor("yellow_glazed_terracotta", () -> BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA), ModBlocks.YELLOW_GLAZED_TERRACOTTA, Palettes.GLAZED_TERRACOTTA, STONE_VARIANTS);
//
        registerManagersFor("black_concrete", () -> BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE), ModBlocks.BLACK_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("blue_concrete", () -> BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE), ModBlocks.BLUE_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("brown_concrete", () -> BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE), ModBlocks.BROWN_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("cyan_concrete", () -> BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE), ModBlocks.CYAN_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("gray_concrete", () -> BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE), ModBlocks.GRAY_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("green_concrete", () -> BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE), ModBlocks.GREEN_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("light_blue_concrete", () -> BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE), ModBlocks.LIGHT_BLUE_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("light_gray_concrete", () -> BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE), ModBlocks.LIGHT_GRAY_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("lime_concrete", () -> BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE), ModBlocks.LIME_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("magenta_concrete", () -> BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE), ModBlocks.MAGENTA_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("orange_concrete", () -> BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE), ModBlocks.ORANGE_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("pink_concrete", () -> BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE), ModBlocks.PINK_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("purple_concrete", () -> BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE), ModBlocks.PURPLE_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("red_concrete", () -> BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE), ModBlocks.RED_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("white_concrete", () -> BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE), ModBlocks.WHITE_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
        registerManagersFor("yellow_concrete", () -> BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE), ModBlocks.YELLOW_CONCRETE, Palettes.CONCRETE, STONE_VARIANTS);
//
        registerManagersFor("bricks", () -> BlockBehaviour.Properties.copy(Blocks.BRICKS), ModBlocks.BRICKS, Palettes.BRICKS, STONE_VARIANTS);
        registerManagersFor("mud_bricks", () -> BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS), ModBlocks.MUD_BRICKS, Palettes.MUD, STONE_VARIANTS);
        registerManagersFor("redstone_block", () -> BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK), ModBlocks.REDSTONE_BLOCK, Palettes.STONE, STONE_VARIANTS);
    }

    public static void registerManagersFor(String name, Supplier<BlockBehaviour.Properties> properties, ChippedPaletteRegistry<Block> type, Palette palette, Collection<ModBlockFamily.Variant> variants) {
//        CHIPPED_MANAGERS.add(CaliberBlockManager.registerChipped("%s".formatted(name), properties, () -> type.getBase(), variants)); // Base block

        List<ModBlockFamily.Variant> none = new ArrayList<>();

        for (Pair<IdType, String> blockPalettes : type.getPalette().ids()) {
            String formatedName = blockPalettes.getSecond();
            String s = formatedName.replace("%", name);

            if (!(IdType.NONE == blockPalettes.getFirst())) {
                variants = none;
            }

            String finalS = s;
            CHIPPED_MANAGERS.add(CaliberBlockManager.registerChipped("%s".formatted(s), properties, () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("chipped", finalS)), variants));
        }
    }

}
