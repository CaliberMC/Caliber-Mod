package com.calibermc.caliber.data;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.compat.data.BiomesOPlentyBlockFamilies;
import com.calibermc.caliber.compat.data.ChippedBlockFamilies;
import com.calibermc.caliber.compat.data.CreateBlockFamilies;
import com.calibermc.caliber.compat.data.RegionsUnexploredBlockFamilies;
import com.calibermc.caliber.compat.ModCompats;
import com.google.common.collect.Maps;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.registries.BuiltInRegistries;
import com.calibermc.caliberlib.data.ModBlockFamily;

import java.util.Map;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class CaliberBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();

    /* Andesite */
    public static final ModBlockFamily ANDESITE = familyBuilder(Blocks.ANDESITE)
            .fromManager(CaliberBlocks.ANDESITE)
            .slab(Blocks.ANDESITE_SLAB)
            .stairs(Blocks.ANDESITE_STAIRS)
            .wall(Blocks.ANDESITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_ANDESITE = familyBuilder(Blocks.POLISHED_ANDESITE)
            .fromManager(CaliberBlocks.POLISHED_ANDESITE)
            .slab(Blocks.POLISHED_ANDESITE_SLAB)
            .stairs(Blocks.POLISHED_ANDESITE_STAIRS)
            .getFamily();
    
    /* Basalt */
    public static final ModBlockFamily BASALT = familyBuilder(Blocks.BASALT)
            .fromManager(CaliberBlocks.BASALT)
            .getFamily();
    public static final ModBlockFamily SMOOTH_BASALT = familyBuilder(Blocks.SMOOTH_BASALT)
            .fromManager(CaliberBlocks.SMOOTH_BASALT)
            .getFamily();
    public static final ModBlockFamily POLISHED_BASALT = familyBuilder(Blocks.POLISHED_BASALT)
            .fromManager(CaliberBlocks.POLISHED_BASALT)
            .getFamily();
    
    /* Blackstone */
    public static final ModBlockFamily BLACKSTONE = familyBuilder(Blocks.BLACKSTONE)
            .fromManager(CaliberBlocks.BLACKSTONE)
            .slab(Blocks.BLACKSTONE_SLAB)
            .stairs(Blocks.BLACKSTONE_STAIRS)
            .wall(Blocks.BLACKSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily GILDED_BLACKSTONE = familyBuilder(Blocks.GILDED_BLACKSTONE)
            .fromManager(CaliberBlocks.GILDED_BLACKSTONE)
            .getFamily();
    public static final ModBlockFamily POLISHED_BLACKSTONE = familyBuilder(Blocks.POLISHED_BLACKSTONE)
            .fromManager(CaliberBlocks.POLISHED_BLACKSTONE)
            .slab(Blocks.POLISHED_BLACKSTONE_SLAB)
            .stairs(Blocks.POLISHED_BLACKSTONE_STAIRS)
            .wall(Blocks.POLISHED_BLACKSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily CHISELED_POLISHED_BLACKSTONE = familyBuilder(Blocks.CHISELED_POLISHED_BLACKSTONE)
            .fromManager(CaliberBlocks.CHISELED_POLISHED_BLACKSTONE)
            .getFamily();
    public static final ModBlockFamily POLISHED_BLACKSTONE_BRICK = familyBuilder(Blocks.POLISHED_BLACKSTONE_BRICKS)
            .fromManager(CaliberBlocks.POLISHED_BLACKSTONE_BRICK)
            .slab(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)
            .stairs(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
            .wall(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily CRACKED_POLISHED_BLACKSTONE_BRICK = familyBuilder(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
            .fromManager(CaliberBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK)
            .getFamily();


    /* Brick */
    public static final ModBlockFamily BRICKS = familyBuilder(Blocks.BRICKS)
            .fromManager(CaliberBlocks.BRICK)
            .slab(Blocks.BRICK_SLAB)
            .stairs(Blocks.BRICK_STAIRS)
            .wall(Blocks.BRICK_WALL)
            .getFamily();
    
    /* Calcite */
    public static final ModBlockFamily CALCITE = familyBuilder(Blocks.CALCITE)
            .fromManager(CaliberBlocks.CALCITE)
            .getFamily();
    
    /* Deepslate */
    public static final ModBlockFamily DEEPSLATE = familyBuilder(Blocks.DEEPSLATE)
            .fromManager(CaliberBlocks.DEEPSLATE)
            .getFamily();
    public static final ModBlockFamily DEEPSLATE_BRICKS = familyBuilder(Blocks.DEEPSLATE_BRICKS)
            .fromManager(CaliberBlocks.DEEPSLATE_BRICK)
            .slab(Blocks.DEEPSLATE_BRICK_SLAB)
            .stairs(Blocks.DEEPSLATE_BRICK_STAIRS)
            .wall(Blocks.DEEPSLATE_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily CRACKED_DEEPSLATE_BRICKS = familyBuilder(Blocks.CRACKED_DEEPSLATE_BRICKS)
            .fromManager(CaliberBlocks.CRACKED_DEEPSLATE_BRICK)
            .getFamily();
    public static final ModBlockFamily DEEPSLATE_TILES = familyBuilder(Blocks.DEEPSLATE_TILES)
            .fromManager(CaliberBlocks.DEEPSLATE_TILE)
            .slab(Blocks.DEEPSLATE_TILE_SLAB)
            .stairs(Blocks.DEEPSLATE_TILE_STAIRS)
            .wall(Blocks.DEEPSLATE_TILE_WALL)
            .fromManager(CaliberBlocks.SLATE_TILE)
            .getFamily();
    public static final ModBlockFamily CRACKED_DEEPSLATE_TILES = familyBuilder(Blocks.CRACKED_DEEPSLATE_TILES)
            .fromManager(CaliberBlocks.CRACKED_DEEPSLATE_TILE)
            .getFamily();
    public static final ModBlockFamily COBBLED_DEEPSLATE = familyBuilder(Blocks.COBBLED_DEEPSLATE)
            .fromManager(CaliberBlocks.COBBLED_DEEPSLATE)
            .slab(Blocks.COBBLED_DEEPSLATE_SLAB)
            .stairs(Blocks.COBBLED_DEEPSLATE_STAIRS)
            .wall(Blocks.COBBLED_DEEPSLATE_WALL)
            .getFamily();
    public static final ModBlockFamily CHISELED_DEEPSLATE = familyBuilder(Blocks.CHISELED_DEEPSLATE)
            .fromManager(CaliberBlocks.CHISELED_DEEPSLATE)
            .getFamily();
    public static final ModBlockFamily POLISHED_DEEPSLATE = familyBuilder(Blocks.POLISHED_DEEPSLATE)
            .fromManager(CaliberBlocks.POLISHED_DEEPSLATE)
            .slab(Blocks.POLISHED_DEEPSLATE_SLAB)
            .stairs(Blocks.POLISHED_DEEPSLATE_STAIRS)
            .wall(Blocks.POLISHED_DEEPSLATE_WALL)
            .getFamily();
    
    /* Diorite */
    public static final ModBlockFamily DIORITE = familyBuilder(Blocks.DIORITE)
            .fromManager(CaliberBlocks.DIORITE)
            .slab(Blocks.DIORITE_SLAB)
            .stairs(Blocks.DIORITE_STAIRS)
            .wall(Blocks.DIORITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_DIORITE = familyBuilder(Blocks.POLISHED_DIORITE)
            .fromManager(CaliberBlocks.POLISHED_DIORITE)
            .slab(Blocks.POLISHED_DIORITE_SLAB)
            .stairs(Blocks.POLISHED_DIORITE_STAIRS)
            .getFamily();
    
    /* Dripstone */
    public static final ModBlockFamily DRIPSTONE = familyBuilder(Blocks.DRIPSTONE_BLOCK)
            .fromManager(CaliberBlocks.DRIPSTONE)
            .getFamily();
    
    /* End Stone */
    public static final ModBlockFamily END_STONE = familyBuilder(Blocks.END_STONE)
            .fromManager(CaliberBlocks.END_STONE)
            .getFamily();
    public static final ModBlockFamily END_STONE_BRICK = familyBuilder(Blocks.END_STONE_BRICKS)
            .fromManager(CaliberBlocks.END_STONE_BRICK)
            .slab(Blocks.END_STONE_BRICK_SLAB)
            .stairs(Blocks.END_STONE_BRICK_STAIRS)
            .wall(Blocks.END_STONE_BRICK_WALL)
            .getFamily();

    /* Granite */
    public static final ModBlockFamily GRANITE = familyBuilder(Blocks.GRANITE)
            .fromManager(CaliberBlocks.GRANITE)
            .slab(Blocks.GRANITE_SLAB)
            .stairs(Blocks.GRANITE_STAIRS)
            .wall(Blocks.GRANITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_GRANITE = familyBuilder(Blocks.POLISHED_GRANITE)
            .fromManager(CaliberBlocks.POLISHED_GRANITE)
            .slab(Blocks.POLISHED_GRANITE_SLAB)
            .stairs(Blocks.POLISHED_GRANITE_STAIRS)
            .getFamily();
    
    /* Mud Bricks */
    public static final ModBlockFamily MUD_BRICKS = familyBuilder(Blocks.MUD_BRICKS)
            .fromManager(CaliberBlocks.MUD_BRICK)
            .slab(Blocks.MUD_BRICK_SLAB)
            .stairs(Blocks.MUD_BRICK_STAIRS)
            .wall(Blocks.MUD_BRICK_WALL)
            .getFamily();
    
    /* Netherite */
    public static final ModBlockFamily NETHERITE = familyBuilder(Blocks.NETHERITE_BLOCK)
            .fromManager(CaliberBlocks.NETHERITE)
            .getFamily();
    
    /* Nether Bricks */
    public static final ModBlockFamily NETHER_BRICKS = familyBuilder(Blocks.NETHER_BRICKS)
            .fromManager(CaliberBlocks.NETHER_BRICK)
            .slab(Blocks.NETHER_BRICK_SLAB)
            .stairs(Blocks.NETHER_BRICK_STAIRS)
            .wall(Blocks.NETHER_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily RED_NETHER_BRICKS = familyBuilder(Blocks.RED_NETHER_BRICKS)
            .fromManager(CaliberBlocks.RED_NETHER_BRICK)
            .slab(Blocks.RED_NETHER_BRICK_SLAB)
            .stairs(Blocks.RED_NETHER_BRICK_STAIRS)
            .wall(Blocks.RED_NETHER_BRICK_WALL)
            .getFamily();
    
    /* Obsidian */
    public static final ModBlockFamily OBSIDIAN = familyBuilder(Blocks.OBSIDIAN)
            .fromManager(CaliberBlocks.OBSIDIAN)
            .getFamily();
    
    /* Prismarine */
    public static final ModBlockFamily PRISMARINE = familyBuilder(Blocks.PRISMARINE)
            .fromManager(CaliberBlocks.PRISMARINE)
            .slab(Blocks.PRISMARINE_SLAB)
            .stairs(Blocks.PRISMARINE_STAIRS)
            .wall(Blocks.PRISMARINE_WALL)
            .getFamily();
    public static final ModBlockFamily PRISMARINE_BRICKS = familyBuilder(Blocks.PRISMARINE_BRICKS)
            .fromManager(CaliberBlocks.PRISMARINE_BRICK)
            .slab(Blocks.PRISMARINE_BRICK_SLAB)
            .stairs(Blocks.PRISMARINE_BRICK_STAIRS)
            .getFamily();
    public static final ModBlockFamily DARK_PRISMARINE = familyBuilder(Blocks.DARK_PRISMARINE)
            .fromManager(CaliberBlocks.DARK_PRISMARINE)
            .slab(Blocks.DARK_PRISMARINE_SLAB)
            .stairs(Blocks.DARK_PRISMARINE_STAIRS)
            .getFamily();
    
    /* Purpur */
    public static final ModBlockFamily PURPUR = familyBuilder(Blocks.PURPUR_BLOCK)
            .fromManager(CaliberBlocks.PURPUR)
            .slab(Blocks.PURPUR_SLAB)
            .stairs(Blocks.PURPUR_STAIRS)
            .getFamily();

    public static final ModBlockFamily PURPUR_PILLAR = familyBuilder(Blocks.PURPUR_PILLAR)
            .fromManager(CaliberBlocks.PURPUR_PILLAR)
            .getFamily();

    /* Quartz */
    public static final ModBlockFamily QUARTZ = familyBuilder(Blocks.QUARTZ_BLOCK)
            .fromManager(CaliberBlocks.QUARTZ)
            .slab(Blocks.QUARTZ_SLAB)
            .stairs(Blocks.QUARTZ_STAIRS)
            .getFamily();
    public static final ModBlockFamily QUARTZ_BRICKS = familyBuilder(Blocks.QUARTZ_BRICKS)
            .fromManager(CaliberBlocks.QUARTZ_BRICKS)
            .getFamily();
    public static final ModBlockFamily SMOOTH_QUARTZ = familyBuilder(Blocks.SMOOTH_QUARTZ)
            .fromManager(CaliberBlocks.SMOOTH_QUARTZ)
            .slab(Blocks.SMOOTH_QUARTZ_SLAB)
            .stairs(Blocks.SMOOTH_QUARTZ_STAIRS)
            .getFamily();

    /* Sandstone */
    public static final ModBlockFamily RED_SANDSTONE = familyBuilder(Blocks.RED_SANDSTONE)
            .fromManager(CaliberBlocks.RED_SANDSTONE)
            .slab(Blocks.RED_SANDSTONE_SLAB)
            .stairs(Blocks.RED_SANDSTONE_STAIRS)
            .wall(Blocks.RED_SANDSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily SANDSTONE = familyBuilder(Blocks.SANDSTONE)
            .fromManager(CaliberBlocks.SANDSTONE)
            .slab(Blocks.SANDSTONE_SLAB)
            .stairs(Blocks.SANDSTONE_STAIRS)
            .wall(Blocks.SANDSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily SMOOTH_RED_SANDSTONE = familyBuilder(Blocks.SMOOTH_RED_SANDSTONE)
            .fromManager(CaliberBlocks.SMOOTH_RED_SANDSTONE)
            .slab(Blocks.SMOOTH_RED_SANDSTONE_SLAB)
            .stairs(Blocks.SMOOTH_RED_SANDSTONE_STAIRS)
            .getFamily();
    public static final ModBlockFamily SMOOTH_SANDSTONE = familyBuilder(Blocks.SMOOTH_SANDSTONE)
            .fromManager(CaliberBlocks.SMOOTH_SANDSTONE)
            .slab(Blocks.SMOOTH_SANDSTONE_SLAB)
            .stairs(Blocks.SMOOTH_SANDSTONE_STAIRS)
            .getFamily();
    public static final ModBlockFamily CHISELED_RED_SANDSTONE = familyBuilder(Blocks.CHISELED_RED_SANDSTONE)
            .fromManager(CaliberBlocks.CHISELED_RED_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily CHISELED_SANDSTONE = familyBuilder(Blocks.CHISELED_SANDSTONE)
            .fromManager(CaliberBlocks.CHISELED_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily CUT_RED_SANDSTONE = familyBuilder(Blocks.CUT_RED_SANDSTONE)
            .fromManager(CaliberBlocks.CUT_RED_SANDSTONE)
            .slab(Blocks.CUT_RED_SANDSTONE_SLAB)
            .getFamily();
    public static final ModBlockFamily CUT_SANDSTONE = familyBuilder(Blocks.CUT_SANDSTONE)
            .fromManager(CaliberBlocks.CUT_SANDSTONE)
            .slab(Blocks.CUT_SANDSTONE_SLAB)
            .getFamily();


    /* Stone */
    public static final ModBlockFamily STONE = familyBuilder(Blocks.STONE)
            .fromManager(CaliberBlocks.STONE)
            .button(Blocks.STONE_BUTTON)
            .pressurePlate(Blocks.STONE_PRESSURE_PLATE)
            .slab(Blocks.STONE_SLAB)
            .stairs(Blocks.STONE_STAIRS)
            .getFamily();
    public static final ModBlockFamily COBBLESTONE = familyBuilder(Blocks.COBBLESTONE)
            .fromManager(CaliberBlocks.COBBLESTONE)
            .slab(Blocks.COBBLESTONE_SLAB)
            .stairs(Blocks.COBBLESTONE_STAIRS)
            .wall(Blocks.COBBLESTONE_WALL)
            .getFamily();
    public static final ModBlockFamily STONE_BRICKS = familyBuilder(Blocks.STONE_BRICKS)
            .fromManager(CaliberBlocks.STONE_BRICK)
            .slab(Blocks.STONE_BRICK_SLAB)
            .stairs(Blocks.STONE_BRICK_STAIRS)
            .wall(Blocks.STONE_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily CRACKED_STONE_BRICKS = familyBuilder(Blocks.CRACKED_STONE_BRICKS)
            .fromManager(CaliberBlocks.CRACKED_STONE_BRICK)
            .getFamily();
    public static final ModBlockFamily CHISELED_STONE_BRICKS = familyBuilder(Blocks.CHISELED_STONE_BRICKS)
            .fromManager(CaliberBlocks.CHISELED_STONE_BRICK)
            .getFamily();
    public static final ModBlockFamily MOSSY_STONE_BRICKS = familyBuilder(Blocks.MOSSY_STONE_BRICKS)
            .fromManager(CaliberBlocks.MOSSY_STONE_BRICK)
            .slab(Blocks.MOSSY_STONE_BRICK_SLAB)
            .stairs(Blocks.MOSSY_STONE_BRICK_STAIRS)
            .wall(Blocks.MOSSY_STONE_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily MOSSY_COBBLESTONE = familyBuilder(Blocks.MOSSY_COBBLESTONE)
            .fromManager(CaliberBlocks.MOSSY_COBBLESTONE)
            .slab(Blocks.MOSSY_COBBLESTONE_SLAB)
            .stairs(Blocks.MOSSY_COBBLESTONE_STAIRS)
            .wall(Blocks.MOSSY_COBBLESTONE_WALL)
            .getFamily();
    public static final ModBlockFamily SMOOTH_STONE = familyBuilder(Blocks.SMOOTH_STONE)
            .fromManager(CaliberBlocks.SMOOTH_STONE)
            .slab(Blocks.SMOOTH_STONE_SLAB)
            .getFamily();

    /* Stripped Wood */
    public static final ModBlockFamily STRIPPED_ACACIA_WOOD = familyBuilder(Blocks.STRIPPED_ACACIA_WOOD)
            .fromManager(CaliberBlocks.STRIPPED_ACACIA)
            .getFamily();
    public static final ModBlockFamily STRIPPED_BAMBOO_BLOCK = familyBuilder(Blocks.STRIPPED_BAMBOO_BLOCK)
            .fromManager(CaliberBlocks.STRIPPED_BAMBOO)
            .getFamily();
    public static final ModBlockFamily STRIPPED_BIRCH_WOOD = familyBuilder(Blocks.STRIPPED_BIRCH_WOOD)
            .fromManager(CaliberBlocks.STRIPPED_BIRCH)
            .getFamily();
    public static final ModBlockFamily STRIPPED_CHERRY_WOOD = familyBuilder(Blocks.STRIPPED_CHERRY_WOOD)
            .fromManager(CaliberBlocks.STRIPPED_CHERRY)
            .getFamily();
    public static final ModBlockFamily STRIPPED_DARK_OAK_WOOD = familyBuilder(Blocks.STRIPPED_DARK_OAK_WOOD)
            .fromManager(CaliberBlocks.STRIPPED_DARK_OAK)
            .getFamily();
    public static final ModBlockFamily STRIPPED_JUNGLE_WOOD = familyBuilder(Blocks.STRIPPED_JUNGLE_WOOD)
            .fromManager(CaliberBlocks.STRIPPED_JUNGLE)
            .getFamily();
    public static final ModBlockFamily STRIPPED_MANGROVE_WOOD = familyBuilder(Blocks.STRIPPED_MANGROVE_WOOD)
            .fromManager(CaliberBlocks.STRIPPED_MANGROVE)
            .getFamily();
    public static final ModBlockFamily STRIPPED_OAK_WOOD = familyBuilder(Blocks.STRIPPED_OAK_WOOD)
            .fromManager(CaliberBlocks.STRIPPED_OAK)
            .getFamily();
    public static final ModBlockFamily STRIPPED_SPRUCE_WOOD = familyBuilder(Blocks.STRIPPED_SPRUCE_WOOD)
            .fromManager(CaliberBlocks.STRIPPED_SPRUCE)
            .getFamily();
    public static final ModBlockFamily STRIPPED_CRIMSON_HYPHAE = familyBuilder(Blocks.STRIPPED_CRIMSON_HYPHAE)
            .fromManager(CaliberBlocks.STRIPPED_CRIMSON)
            .getFamily();
    public static final ModBlockFamily STRIPPED_WARPED_HYPHAE = familyBuilder(Blocks.STRIPPED_WARPED_HYPHAE)
            .fromManager(CaliberBlocks.STRIPPED_WARPED)
            .getFamily();

    /* Tuff */
    public static final ModBlockFamily TUFF = familyBuilder(Blocks.TUFF)
            .fromManager(CaliberBlocks.TUFF)
            .getFamily();

    /* Wood Planks */
    public static final ModBlockFamily ACACIA_PLANKS = familyBuilder(Blocks.ACACIA_PLANKS)
            .fromManager(CaliberBlocks.ACACIA)
            .fromManager(CaliberBlocks.ACACIA_SHINGLES)
            .button(Blocks.ACACIA_BUTTON)
            .door(Blocks.ACACIA_DOOR)
            .fence(Blocks.ACACIA_FENCE)
            .fenceGate(Blocks.ACACIA_FENCE_GATE)
            .pressurePlate(Blocks.ACACIA_PRESSURE_PLATE)
            .sign(Blocks.ACACIA_SIGN, Blocks.ACACIA_WALL_SIGN)
            .slab(Blocks.ACACIA_SLAB)
            .stairs(Blocks.ACACIA_STAIRS)
            .trapdoor(Blocks.ACACIA_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily BAMBOO_PLANKS = familyBuilder(Blocks.BAMBOO_PLANKS)
            .fromManager(CaliberBlocks.BAMBOO)
            .fromManager(CaliberBlocks.BAMBOO_SHINGLES)
            .button(Blocks.BAMBOO_BUTTON)
            .door(Blocks.BAMBOO_DOOR)
            .fence(Blocks.BAMBOO_FENCE)
            .fenceGate(Blocks.BAMBOO_FENCE_GATE)
            .pressurePlate(Blocks.BAMBOO_PRESSURE_PLATE)
            .sign(Blocks.BAMBOO_SIGN, Blocks.BAMBOO_WALL_SIGN)
            .slab(Blocks.BAMBOO_SLAB)
            .stairs(Blocks.BAMBOO_STAIRS)
            .trapdoor(Blocks.BAMBOO_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily BAMBOO_MOSAIC = familyBuilder(Blocks.BAMBOO_MOSAIC)
            .fromManager(CaliberBlocks.BAMBOO_MOSAIC)
            .slab(Blocks.BAMBOO_MOSAIC_SLAB)
            .stairs(Blocks.BAMBOO_MOSAIC_STAIRS)
            .getFamily();
    public static final ModBlockFamily BIRCH_PLANKS = familyBuilder(Blocks.BIRCH_PLANKS)
            .fromManager(CaliberBlocks.BIRCH)
            .fromManager(CaliberBlocks.BIRCH_SHINGLES)
            .button(Blocks.BIRCH_BUTTON)
            .door(Blocks.BIRCH_DOOR)
            .fence(Blocks.BIRCH_FENCE)
            .fenceGate(Blocks.BIRCH_FENCE_GATE)
            .pressurePlate(Blocks.BIRCH_PRESSURE_PLATE)
            .sign(Blocks.BIRCH_SIGN, Blocks.BIRCH_WALL_SIGN)
            .slab(Blocks.BIRCH_SLAB)
            .stairs(Blocks.BIRCH_STAIRS)
            .trapdoor(Blocks.BIRCH_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily CHERRY_PLANKS = familyBuilder(Blocks.CHERRY_PLANKS)
            .fromManager(CaliberBlocks.CHERRY)
            .fromManager(CaliberBlocks.CHERRY_SHINGLES)
            .button(Blocks.CHERRY_BUTTON)
            .door(Blocks.CHERRY_DOOR)
            .fence(Blocks.CHERRY_FENCE)
            .fenceGate(Blocks.CHERRY_FENCE_GATE)
            .pressurePlate(Blocks.CHERRY_PRESSURE_PLATE)
            .sign(Blocks.CHERRY_SIGN, Blocks.CHERRY_WALL_SIGN)
            .slab(Blocks.CHERRY_SLAB)
            .stairs(Blocks.CHERRY_STAIRS)
            .trapdoor(Blocks.CHERRY_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily DARK_OAK_PLANKS = familyBuilder(Blocks.DARK_OAK_PLANKS)
            .fromManager(CaliberBlocks.DARK_OAK)
            .fromManager(CaliberBlocks.DARK_OAK_SHINGLES)
            .button(Blocks.DARK_OAK_BUTTON)
            .door(Blocks.DARK_OAK_DOOR)
            .fence(Blocks.DARK_OAK_FENCE)
            .fenceGate(Blocks.DARK_OAK_FENCE_GATE)
            .pressurePlate(Blocks.DARK_OAK_PRESSURE_PLATE)
            .sign(Blocks.DARK_OAK_SIGN, Blocks.DARK_OAK_WALL_SIGN)
            .slab(Blocks.DARK_OAK_SLAB)
            .stairs(Blocks.DARK_OAK_STAIRS)
            .trapdoor(Blocks.DARK_OAK_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily JUNGLE_PLANKS = familyBuilder(Blocks.JUNGLE_PLANKS)
            .fromManager(CaliberBlocks.JUNGLE)
            .fromManager(CaliberBlocks.JUNGLE_SHINGLES)
            .button(Blocks.JUNGLE_BUTTON)
            .door(Blocks.JUNGLE_DOOR)
            .fence(Blocks.JUNGLE_FENCE)
            .fenceGate(Blocks.JUNGLE_FENCE_GATE)
            .pressurePlate(Blocks.JUNGLE_PRESSURE_PLATE)
            .sign(Blocks.JUNGLE_SIGN, Blocks.JUNGLE_WALL_SIGN)
            .slab(Blocks.JUNGLE_SLAB)
            .stairs(Blocks.JUNGLE_STAIRS)
            .trapdoor(Blocks.JUNGLE_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily MANGROVE_PLANKS = familyBuilder(Blocks.MANGROVE_PLANKS)
            .fromManager(CaliberBlocks.MANGROVE)
            .fromManager(CaliberBlocks.MANGROVE_SHINGLES)
            .button(Blocks.MANGROVE_BUTTON)
            .door(Blocks.MANGROVE_DOOR)
            .fence(Blocks.MANGROVE_FENCE)
            .fenceGate(Blocks.MANGROVE_FENCE_GATE)
            .pressurePlate(Blocks.MANGROVE_PRESSURE_PLATE)
            .sign(Blocks.MANGROVE_SIGN, Blocks.MANGROVE_WALL_SIGN)
            .slab(Blocks.MANGROVE_SLAB)
            .stairs(Blocks.MANGROVE_STAIRS)
            .trapdoor(Blocks.MANGROVE_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily OAK_PLANKS = familyBuilder(Blocks.OAK_PLANKS)
            .fromManager(CaliberBlocks.OAK)
            .fromManager(CaliberBlocks.OAK_SHINGLES)
            .button(Blocks.OAK_BUTTON)
            .door(Blocks.OAK_DOOR)
            .fence(Blocks.OAK_FENCE)
            .fenceGate(Blocks.OAK_FENCE_GATE)
            .pressurePlate(Blocks.OAK_PRESSURE_PLATE)
            .sign(Blocks.OAK_SIGN, Blocks.OAK_WALL_SIGN)
            .slab(Blocks.OAK_SLAB)
            .stairs(Blocks.OAK_STAIRS)
            .trapdoor(Blocks.OAK_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily SPRUCE_PLANKS = familyBuilder(Blocks.SPRUCE_PLANKS)
            .fromManager(CaliberBlocks.SPRUCE)
            .fromManager(CaliberBlocks.SPRUCE_SHINGLES)
            .button(Blocks.SPRUCE_BUTTON)
            .door(Blocks.SPRUCE_DOOR)
            .fence(Blocks.SPRUCE_FENCE)
            .fenceGate(Blocks.SPRUCE_FENCE_GATE)
            .pressurePlate(Blocks.SPRUCE_PRESSURE_PLATE)
            .sign(Blocks.SPRUCE_SIGN, Blocks.SPRUCE_WALL_SIGN)
            .slab(Blocks.SPRUCE_SLAB)
            .stairs(Blocks.SPRUCE_STAIRS)
            .trapdoor(Blocks.SPRUCE_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily CRIMSON_PLANKS = familyBuilder(Blocks.CRIMSON_PLANKS)
            .fromManager(CaliberBlocks.CRIMSON)
            .fromManager(CaliberBlocks.CRIMSON_SHINGLES)
            .button(Blocks.CRIMSON_BUTTON)
            .door(Blocks.CRIMSON_DOOR)
            .fence(Blocks.CRIMSON_FENCE)
            .fenceGate(Blocks.CRIMSON_FENCE_GATE)
            .pressurePlate(Blocks.CRIMSON_PRESSURE_PLATE)
            .sign(Blocks.CRIMSON_SIGN, Blocks.CRIMSON_WALL_SIGN)
            .slab(Blocks.CRIMSON_SLAB)
            .stairs(Blocks.CRIMSON_STAIRS)
            .trapdoor(Blocks.CRIMSON_TRAPDOOR)
            .getFamily();
    public static final ModBlockFamily WARPED_PLANKS = familyBuilder(Blocks.WARPED_PLANKS)
            .fromManager(CaliberBlocks.WARPED)
            .fromManager(CaliberBlocks.WARPED_SHINGLES)
            .button(Blocks.WARPED_BUTTON)
            .door(Blocks.WARPED_DOOR)
            .fence(Blocks.WARPED_FENCE)
            .fenceGate(Blocks.WARPED_FENCE_GATE)
            .pressurePlate(Blocks.WARPED_PRESSURE_PLATE)
            .sign(Blocks.WARPED_SIGN, Blocks.WARPED_WALL_SIGN)
            .slab(Blocks.WARPED_SLAB)
            .stairs(Blocks.WARPED_STAIRS)
            .trapdoor(Blocks.WARPED_TRAPDOOR)
            .getFamily();

    /* Concrete */
    public static final ModBlockFamily BLACK_CONCRETE = familyBuilder(Blocks.BLACK_CONCRETE)
            .fromManager(CaliberBlocks.BLACK_CONCRETE)
            .getFamily();
    public static final ModBlockFamily BLUE_CONCRETE = familyBuilder(Blocks.BLUE_CONCRETE)
            .fromManager(CaliberBlocks.BLUE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily BROWN_CONCRETE = familyBuilder(Blocks.BROWN_CONCRETE)
            .fromManager(CaliberBlocks.BROWN_CONCRETE)
            .getFamily();
    public static final ModBlockFamily CYAN_CONCRETE = familyBuilder(Blocks.CYAN_CONCRETE)
            .fromManager(CaliberBlocks.CYAN_CONCRETE)
            .getFamily();
    public static final ModBlockFamily GRAY_CONCRETE = familyBuilder(Blocks.GRAY_CONCRETE)
            .fromManager(CaliberBlocks.GRAY_CONCRETE)
            .getFamily();
    public static final ModBlockFamily GREEN_CONCRETE = familyBuilder(Blocks.GREEN_CONCRETE)
            .fromManager(CaliberBlocks.GREEN_CONCRETE)
            .getFamily();
    public static final ModBlockFamily LIGHT_BLUE_CONCRETE = familyBuilder(Blocks.LIGHT_BLUE_CONCRETE)
            .fromManager(CaliberBlocks.LIGHT_BLUE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily LIGHT_GRAY_CONCRETE = familyBuilder(Blocks.LIGHT_GRAY_CONCRETE)
            .fromManager(CaliberBlocks.LIGHT_GRAY_CONCRETE)
            .getFamily();
    public static final ModBlockFamily LIME_CONCRETE = familyBuilder(Blocks.LIME_CONCRETE)
            .fromManager(CaliberBlocks.LIME_CONCRETE)
            .getFamily();
    public static final ModBlockFamily MAGENTA_CONCRETE = familyBuilder(Blocks.MAGENTA_CONCRETE)
            .fromManager(CaliberBlocks.MAGENTA_CONCRETE)
            .getFamily();
    public static final ModBlockFamily ORANGE_CONCRETE = familyBuilder(Blocks.ORANGE_CONCRETE)
            .fromManager(CaliberBlocks.ORANGE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily PINK_CONCRETE = familyBuilder(Blocks.PINK_CONCRETE)
            .fromManager(CaliberBlocks.PINK_CONCRETE)
            .getFamily();
    public static final ModBlockFamily PURPLE_CONCRETE = familyBuilder(Blocks.PURPLE_CONCRETE)
            .fromManager(CaliberBlocks.PURPLE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily RED_CONCRETE = familyBuilder(Blocks.RED_CONCRETE)
            .fromManager(CaliberBlocks.RED_CONCRETE)
            .getFamily();
    public static final ModBlockFamily WHITE_CONCRETE = familyBuilder(Blocks.WHITE_CONCRETE)
            .fromManager(CaliberBlocks.WHITE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily YELLOW_CONCRETE = familyBuilder(Blocks.YELLOW_CONCRETE)
            .fromManager(CaliberBlocks.YELLOW_CONCRETE)
            .getFamily();
    
    /* Terracotta */
    public static final ModBlockFamily TERRACOTTA = familyBuilder(Blocks.TERRACOTTA)
            .fromManager(CaliberBlocks.TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily BLACK_TERRACOTTA = familyBuilder(Blocks.BLACK_TERRACOTTA)
            .fromManager(CaliberBlocks.BLACK_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily BLUE_TERRACOTTA = familyBuilder(Blocks.BLUE_TERRACOTTA)
            .fromManager(CaliberBlocks.BLUE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily BROWN_TERRACOTTA = familyBuilder(Blocks.BROWN_TERRACOTTA)
            .fromManager(CaliberBlocks.BROWN_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily CYAN_TERRACOTTA = familyBuilder(Blocks.CYAN_TERRACOTTA)
            .fromManager(CaliberBlocks.CYAN_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily GRAY_TERRACOTTA = familyBuilder(Blocks.GRAY_TERRACOTTA)
            .fromManager(CaliberBlocks.GRAY_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily GREEN_TERRACOTTA = familyBuilder(Blocks.GREEN_TERRACOTTA)
            .fromManager(CaliberBlocks.GREEN_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily LIGHT_BLUE_TERRACOTTA = familyBuilder(Blocks.LIGHT_BLUE_TERRACOTTA)
            .fromManager(CaliberBlocks.LIGHT_BLUE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily LIGHT_GRAY_TERRACOTTA = familyBuilder(Blocks.LIGHT_GRAY_TERRACOTTA)
            .fromManager(CaliberBlocks.LIGHT_GRAY_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily LIME_TERRACOTTA = familyBuilder(Blocks.LIME_TERRACOTTA)
            .fromManager(CaliberBlocks.LIME_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily MAGENTA_TERRACOTTA = familyBuilder(Blocks.MAGENTA_TERRACOTTA)
            .fromManager(CaliberBlocks.MAGENTA_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily ORANGE_TERRACOTTA = familyBuilder(Blocks.ORANGE_TERRACOTTA)
            .fromManager(CaliberBlocks.ORANGE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily PINK_TERRACOTTA = familyBuilder(Blocks.PINK_TERRACOTTA)
            .fromManager(CaliberBlocks.PINK_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily PURPLE_TERRACOTTA = familyBuilder(Blocks.PURPLE_TERRACOTTA)
            .fromManager(CaliberBlocks.PURPLE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily RED_TERRACOTTA = familyBuilder(Blocks.RED_TERRACOTTA)
            .fromManager(CaliberBlocks.RED_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily WHITE_TERRACOTTA = familyBuilder(Blocks.WHITE_TERRACOTTA)
            .fromManager(CaliberBlocks.WHITE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily YELLOW_TERRACOTTA = familyBuilder(Blocks.YELLOW_TERRACOTTA)
            .fromManager(CaliberBlocks.YELLOW_TERRACOTTA)
            .getFamily();
    
    /* Wool */
    public static final ModBlockFamily BLACK_WOOL = familyBuilder(Blocks.BLACK_WOOL)
            .fromManager(CaliberBlocks.BLACK_WOOL)
            .getFamily();
    public static final ModBlockFamily BLUE_WOOL = familyBuilder(Blocks.BLUE_WOOL)
            .fromManager(CaliberBlocks.BLUE_WOOL)
            .getFamily();
    public static final ModBlockFamily BROWN_WOOL = familyBuilder(Blocks.BROWN_WOOL)
            .fromManager(CaliberBlocks.BROWN_WOOL)
            .getFamily();
    public static final ModBlockFamily CYAN_WOOL = familyBuilder(Blocks.CYAN_WOOL)
            .fromManager(CaliberBlocks.CYAN_WOOL)
            .getFamily();
    public static final ModBlockFamily GRAY_WOOL = familyBuilder(Blocks.GRAY_WOOL)
            .fromManager(CaliberBlocks.GRAY_WOOL)
            .getFamily();
    public static final ModBlockFamily GREEN_WOOL = familyBuilder(Blocks.GREEN_WOOL)
            .fromManager(CaliberBlocks.GREEN_WOOL)
            .getFamily();
    public static final ModBlockFamily LIGHT_BLUE_WOOL = familyBuilder(Blocks.LIGHT_BLUE_WOOL)
            .fromManager(CaliberBlocks.LIGHT_BLUE_WOOL)
            .getFamily();
    public static final ModBlockFamily LIGHT_GRAY_WOOL = familyBuilder(Blocks.LIGHT_GRAY_WOOL)
            .fromManager(CaliberBlocks.LIGHT_GRAY_WOOL)
            .getFamily();
    public static final ModBlockFamily LIME_WOOL = familyBuilder(Blocks.LIME_WOOL)
            .fromManager(CaliberBlocks.LIME_WOOL)
            .getFamily();
    public static final ModBlockFamily MAGENTA_WOOL = familyBuilder(Blocks.MAGENTA_WOOL)
            .fromManager(CaliberBlocks.MAGENTA_WOOL)
            .getFamily();
    public static final ModBlockFamily ORANGE_WOOL = familyBuilder(Blocks.ORANGE_WOOL)
            .fromManager(CaliberBlocks.ORANGE_WOOL)
            .getFamily();
    public static final ModBlockFamily PINK_WOOL = familyBuilder(Blocks.PINK_WOOL)
            .fromManager(CaliberBlocks.PINK_WOOL)
            .getFamily();
    public static final ModBlockFamily PURPLE_WOOL = familyBuilder(Blocks.PURPLE_WOOL)
            .fromManager(CaliberBlocks.PURPLE_WOOL)
            .getFamily();
    public static final ModBlockFamily RED_WOOL = familyBuilder(Blocks.RED_WOOL)
            .fromManager(CaliberBlocks.RED_WOOL)
            .getFamily();
    public static final ModBlockFamily WHITE_WOOL = familyBuilder(Blocks.WHITE_WOOL)
            .fromManager(CaliberBlocks.WHITE_WOOL)
            .getFamily();
    public static final ModBlockFamily YELLOW_WOOL = familyBuilder(Blocks.YELLOW_WOOL)
            .fromManager(CaliberBlocks.YELLOW_WOOL)
            .getFamily();


    // COMPAT
    public static void compat() {
        if (ModCompats.BOP) MAP.putAll(BiomesOPlentyBlockFamilies.getAllFamiliesAsMap());
//        if (ModCompats.CHIPPED) MAP.putAll(ChippedBlockFamilies.getAllFamiliesAsMap());
        if (ModCompats.CREATE) MAP.putAll(CreateBlockFamilies.getAllFamiliesAsMap());
        if (ModCompats.REGIONS_UNEXPLORED) MAP.putAll(RegionsUnexploredBlockFamilies.getAllFamiliesAsMap());

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
}