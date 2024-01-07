package com.calibermc.caliber.data;

import com.calibermc.caliber.block.ModBlocks;
import com.google.common.collect.Maps;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Stream;

import static com.calibermc.caliber.data.ModBlockFamily.Variant.*;

@SuppressWarnings("unused")
public class ModBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();
    
    /* Andesite */
    public static final ModBlockFamily ANDESITE = familyBuilder(Blocks.ANDESITE)
            .fromManager(ModBlocks.ANDESITE)
            .stairs(Blocks.ANDESITE_STAIRS)
            .wall(Blocks.ANDESITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_ANDESITE = familyBuilder(Blocks.POLISHED_ANDESITE)
            .fromManager(ModBlocks.POLISHED_ANDESITE)
            .stairs(Blocks.POLISHED_ANDESITE_STAIRS)
            .getFamily();
    
    /* Basalt */
    public static final ModBlockFamily BASALT = familyBuilder(Blocks.BASALT)
            .fromManager(ModBlocks.BASALT)
            .getFamily();
    public static final ModBlockFamily SMOOTH_BASALT = familyBuilder(Blocks.SMOOTH_BASALT)
            .fromManager(ModBlocks.SMOOTH_BASALT)
            .getFamily();
    public static final ModBlockFamily POLISHED_BASALT = familyBuilder(Blocks.POLISHED_BASALT)
            .fromManager(ModBlocks.POLISHED_BASALT)
            .getFamily();
    
    /* Blackstone */
    public static final ModBlockFamily BLACKSTONE = familyBuilder(Blocks.BLACKSTONE)
            .fromManager(ModBlocks.BLACKSTONE)
            .stairs(Blocks.BLACKSTONE_STAIRS)
            .wall(Blocks.BLACKSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily GILDED_BLACKSTONE = familyBuilder(Blocks.GILDED_BLACKSTONE)
            .fromManager(ModBlocks.GILDED_BLACKSTONE)
            .getFamily();
    public static final ModBlockFamily POLISHED_BLACKSTONE = familyBuilder(Blocks.POLISHED_BLACKSTONE)
            .fromManager(ModBlocks.POLISHED_BLACKSTONE)
            .stairs(Blocks.POLISHED_BLACKSTONE_STAIRS)
            .wall(Blocks.POLISHED_BLACKSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_BLACKSTONE_BRICK = familyBuilder(Blocks.POLISHED_BLACKSTONE_BRICKS)
            .fromManager(ModBlocks.POLISHED_BLACKSTONE_BRICK)
            .stairs(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
            .wall(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
            .getFamily();
    
    /* Brick */
    public static final ModBlockFamily BRICKS = familyBuilder(Blocks.BRICKS)
            .fromManager(ModBlocks.BRICK)
            .stairs(Blocks.BRICK_STAIRS)
            .wall(Blocks.BRICK_WALL)
            .getFamily();
    
    /* Calcite */
    public static final ModBlockFamily CALCITE = familyBuilder(Blocks.CALCITE)
            .fromManager(ModBlocks.CALCITE)
            .getFamily();
    
    /* Deepslate */
    public static final ModBlockFamily DEEPSLATE = familyBuilder(Blocks.DEEPSLATE)
            .fromManager(ModBlocks.DEEPSLATE)
            .getFamily();
    public static final ModBlockFamily DEEPSLATE_BRICKS = familyBuilder(Blocks.DEEPSLATE_BRICKS)
            .fromManager(ModBlocks.DEEPSLATE_BRICK)
            .stairs(Blocks.DEEPSLATE_BRICK_STAIRS)
            .wall(Blocks.DEEPSLATE_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily DEEPSLATE_TILES = familyBuilder(Blocks.DEEPSLATE_TILES)
            .fromManager(ModBlocks.DEEPSLATE_TILE)
            .stairs(Blocks.DEEPSLATE_TILE_STAIRS)
            .wall(Blocks.DEEPSLATE_TILE_WALL)
            .fromManager(ModBlocks.SLATE_TILE)
            .getFamily();
    public static final ModBlockFamily COBBLED_DEEPSLATE = familyBuilder(Blocks.COBBLED_DEEPSLATE)
            .fromManager(ModBlocks.COBBLED_DEEPSLATE)
            .stairs(Blocks.COBBLED_DEEPSLATE_STAIRS)
            .wall(Blocks.COBBLED_DEEPSLATE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_DEEPSLATE = familyBuilder(Blocks.POLISHED_DEEPSLATE)
            .fromManager(ModBlocks.POLISHED_DEEPSLATE)
            .stairs(Blocks.POLISHED_DEEPSLATE_STAIRS)
            .wall(Blocks.POLISHED_DEEPSLATE_WALL)
            .getFamily();
    
    /* Diorite */
    public static final ModBlockFamily DIORITE = familyBuilder(Blocks.DIORITE)
            .fromManager(ModBlocks.DIORITE)
            .stairs(Blocks.DIORITE_STAIRS)
            .wall(Blocks.DIORITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_DIORITE = familyBuilder(Blocks.POLISHED_DIORITE)
            .fromManager(ModBlocks.POLISHED_DIORITE)
            .stairs(Blocks.POLISHED_DIORITE_STAIRS)
            .getFamily();
    
    /* Dripstone */
    public static final ModBlockFamily DRIPSTONE = familyBuilder(Blocks.DRIPSTONE_BLOCK)
            .fromManager(ModBlocks.DRIPSTONE)
            .getFamily();
    
    /* End Stone */
    public static final ModBlockFamily END_STONE = familyBuilder(Blocks.END_STONE)
            .fromManager(ModBlocks.END_STONE)
            .getFamily();
    public static final ModBlockFamily END_STONE_BRICK = familyBuilder(Blocks.END_STONE_BRICKS)
            .fromManager(ModBlocks.END_STONE_BRICK)
            .stairs(Blocks.END_STONE_BRICK_STAIRS)
            .wall(Blocks.END_STONE_BRICK_WALL)
            .getFamily();
    
    /* Granite */
    public static final ModBlockFamily BLACK_GRANITE = familyBuilder(ModBlocks.BLACK_GRANITE.baseBlock())
            .fromManager(ModBlocks.BLACK_GRANITE)
            .getFamily();
    public static final ModBlockFamily BROWN_GRANITE = familyBuilder(ModBlocks.BROWN_GRANITE.baseBlock())
            .fromManager(ModBlocks.BROWN_GRANITE)
            .getFamily();
    public static final ModBlockFamily GRAY_GRANITE = familyBuilder(ModBlocks.GRAY_GRANITE.baseBlock())
            .fromManager(ModBlocks.GRAY_GRANITE)
            .getFamily();
    public static final ModBlockFamily PINK_GRANITE = familyBuilder(ModBlocks.PINK_GRANITE.baseBlock())
            .fromManager(ModBlocks.PINK_GRANITE)
            .getFamily();
    public static final ModBlockFamily RED_GRANITE = familyBuilder(Blocks.GRANITE)
            .fromManager(ModBlocks.RED_GRANITE)
            .stairs(Blocks.GRANITE_STAIRS)
            .wall(Blocks.GRANITE_WALL)
            .getFamily();
    public static final ModBlockFamily WHITE_GRANITE = familyBuilder(ModBlocks.WHITE_GRANITE.baseBlock())
            .fromManager(ModBlocks.WHITE_GRANITE)
            .getFamily();

    /* Polished Granite */
    public static final ModBlockFamily POLISHED_BLACK_GRANITE = familyBuilder(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock())
            .fromManager(ModBlocks.POLISHED_BLACK_GRANITE)
            .getFamily();
    public static final ModBlockFamily POLISHED_BROWN_GRANITE = familyBuilder(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock())
            .fromManager(ModBlocks.POLISHED_BROWN_GRANITE)
           .getFamily();
    public static final ModBlockFamily POLISHED_GRAY_GRANITE = familyBuilder(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock())
            .fromManager(ModBlocks.POLISHED_GRAY_GRANITE)
            .getFamily();
    public static final ModBlockFamily POLISHED_PINK_GRANITE = familyBuilder(ModBlocks.POLISHED_PINK_GRANITE.baseBlock())
            .fromManager(ModBlocks.POLISHED_PINK_GRANITE)
            .getFamily();
    public static final ModBlockFamily POLISHED_RED_GRANITE = familyBuilder(Blocks.POLISHED_GRANITE)
            .fromManager(ModBlocks.POLISHED_RED_GRANITE)
            .stairs(Blocks.GRANITE_STAIRS)
            .wall(Blocks.GRANITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_WHITE_GRANITE = familyBuilder(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock())
            .fromManager(ModBlocks.POLISHED_WHITE_GRANITE)
            .getFamily();

    /* Limestone */
    public static final ModBlockFamily DARK_LIMESTONE = familyBuilder(ModBlocks.DARK_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.DARK_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily LIGHT_LIMESTONE = familyBuilder(ModBlocks.LIGHT_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.LIGHT_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily LIMESTONE = familyBuilder(Blocks.STONE)
            .fromManager(ModBlocks.LIMESTONE)
            .button(Blocks.STONE_BUTTON)
            .pressurePlate(Blocks.STONE_PRESSURE_PLATE)
            .stairs(Blocks.STONE_STAIRS)
            .getFamily();
    public static final ModBlockFamily PINK_LIMESTONE = familyBuilder(ModBlocks.PINK_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.PINK_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily TAN_LIMESTONE = familyBuilder(ModBlocks.TAN_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.TAN_LIMESTONE)
            .getFamily();

    /* Cobbled Limestone */
    public static final ModBlockFamily COBBLED_DARK_LIMESTONE = familyBuilder(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.COBBLED_DARK_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily COBBLED_LIGHT_LIMESTONE = familyBuilder(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.COBBLED_LIGHT_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily COBBLED_LIMESTONE = familyBuilder(Blocks.COBBLESTONE)
            .fromManager(ModBlocks.COBBLED_LIMESTONE)
            .stairs(Blocks.COBBLESTONE_STAIRS)
            .wall(Blocks.COBBLESTONE_WALL)
            .getFamily();
    public static final ModBlockFamily COBBLED_PINK_LIMESTONE = familyBuilder(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.COBBLED_PINK_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily COBBLED_TAN_LIMESTONE = familyBuilder(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.COBBLED_TAN_LIMESTONE)
            .getFamily();

    /* Mossy Cobbled Limestone */
    public static final ModBlockFamily MOSSY_COBBLED_DARK_LIMESTONE = familyBuilder(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily MOSSY_COBBLED_LIGHT_LIMESTONE = familyBuilder(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily MOSSY_COBBLED_LIMESTONE = familyBuilder(Blocks.MOSSY_COBBLESTONE)
            .fromManager(ModBlocks.MOSSY_COBBLED_LIMESTONE)
            .stairs(Blocks.MOSSY_COBBLESTONE_STAIRS)
            .wall(Blocks.MOSSY_COBBLESTONE_WALL)
            .getFamily();
    public static final ModBlockFamily MOSSY_COBBLED_PINK_LIMESTONE = familyBuilder(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily MOSSY_COBBLED_TAN_LIMESTONE = familyBuilder(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE)
            .getFamily();

    /* Limestone Bricks */
    public static final ModBlockFamily DARK_LIMESTONE_BRICK = familyBuilder(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock())
            .fromManager(ModBlocks.DARK_LIMESTONE_BRICK)
            .getFamily();
    public static final ModBlockFamily LIGHT_LIMESTONE_BRICK = familyBuilder(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock())
            .fromManager(ModBlocks.LIGHT_LIMESTONE_BRICK)
            .getFamily();
    public static final ModBlockFamily LIMESTONE_BRICKS = familyBuilder(Blocks.STONE_BRICKS)
            .fromManager(ModBlocks.LIMESTONE_BRICK)
            .stairs(Blocks.STONE_BRICK_STAIRS)
            .wall(Blocks.STONE_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily PINK_LIMESTONE_BRICK = familyBuilder(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock())
            .fromManager(ModBlocks.PINK_LIMESTONE_BRICK)
            .getFamily();
    public static final ModBlockFamily TAN_LIMESTONE_BRICK = familyBuilder(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock())
            .fromManager(ModBlocks.TAN_LIMESTONE_BRICK)
            .getFamily();

    /* Mossy Limestone Bricks */
    public static final ModBlockFamily MOSSY_DARK_LIMESTONE_BRICK = familyBuilder(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK.baseBlock())
            .fromManager(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK)
            .getFamily();
    public static final ModBlockFamily MOSSY_LIGHT_LIMESTONE_BRICK = familyBuilder(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK.baseBlock())
            .fromManager(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK)
            .getFamily();
    public static final ModBlockFamily MOSSY_LIMESTONE_BRICKS = familyBuilder(Blocks.MOSSY_STONE_BRICKS)
            .fromManager(ModBlocks.MOSSY_LIMESTONE_BRICK)
            .stairs(Blocks.MOSSY_STONE_BRICK_STAIRS)
            .wall(Blocks.MOSSY_STONE_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily MOSSY_PINK_LIMESTONE_BRICK = familyBuilder(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK.baseBlock())
            .fromManager(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK)
            .getFamily();
    public static final ModBlockFamily MOSSY_TAN_LIMESTONE_BRICK = familyBuilder(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK.baseBlock())
            .fromManager(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK)
            .getFamily();

    /* Cracked Limestone Bricks */
    public static final ModBlockFamily CRACKED_DARK_LIMESTONE_BRICK = familyBuilder(ModBlocks.CRACKED_DARK_LIMESTONE_BRICKS.baseBlock())
            .getFamily();
    public static final ModBlockFamily CRACKED_LIGHT_LIMESTONE_BRICK = familyBuilder(ModBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.baseBlock())
            .getFamily();
    public static final ModBlockFamily CRACKED_LIMESTONE_BRICKS = familyBuilder(Blocks.CRACKED_STONE_BRICKS)
            .getFamily();
    public static final ModBlockFamily CRACKED_PINK_LIMESTONE_BRICK = familyBuilder(ModBlocks.CRACKED_PINK_LIMESTONE_BRICKS.baseBlock())
            .getFamily();
    public static final ModBlockFamily CRACKED_TAN_LIMESTONE_BRICK = familyBuilder(ModBlocks.CRACKED_TAN_LIMESTONE_BRICKS.baseBlock())
            .getFamily();

    /* Chiseled Limestone Bricks */
    public static final ModBlockFamily CHISELED_DARK_LIMESTONE_BRICK = familyBuilder(ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS.baseBlock())
            .fromManager(ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS)
            .getFamily();
    public static final ModBlockFamily CHISELED_LIGHT_LIMESTONE_BRICK = familyBuilder(ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.baseBlock())
            .fromManager(ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS)
            .getFamily();
    public static final ModBlockFamily CHISELED_LIMESTONE_BRICKS = familyBuilder(Blocks.CHISELED_STONE_BRICKS)
//            .fromManager(ModBlocks.CHISELED_LIMESTONE_BRICKS)
            .getFamily();
    public static final ModBlockFamily CHISELED_PINK_LIMESTONE_BRICK = familyBuilder(ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS.baseBlock())
            .fromManager(ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS)
            .getFamily();
    public static final ModBlockFamily CHISELED_TAN_LIMESTONE_BRICK = familyBuilder(ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS.baseBlock())
            .fromManager(ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS)
            .getFamily();

    /* Smooth Limestone */
    public static final ModBlockFamily SMOOTH_DARK_LIMESTONE = familyBuilder(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.SMOOTH_DARK_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily SMOOTH_LIGHT_LIMESTONE = familyBuilder(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.SMOOTH_LIGHT_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily SMOOTH_LIMESTONE = familyBuilder(Blocks.SMOOTH_STONE)
            .fromManager(ModBlocks.SMOOTH_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily SMOOTH_PINK_LIMESTONE = familyBuilder(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.SMOOTH_PINK_LIMESTONE)
            .getFamily();
    public static final ModBlockFamily SMOOTH_TAN_LIMESTONE = familyBuilder(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock())
            .fromManager(ModBlocks.SMOOTH_TAN_LIMESTONE)
            .getFamily();

    /* Marble */
    public static final ModBlockFamily BLACK_MARBLE = familyBuilder(ModBlocks.BLACK_MARBLE.baseBlock())
            .fromManager(ModBlocks.BLACK_MARBLE)
            .getFamily();
    public static final ModBlockFamily GRAY_MARBLE = familyBuilder(ModBlocks.GRAY_MARBLE.baseBlock())
            .fromManager(ModBlocks.GRAY_MARBLE)
            .getFamily();
    public static final ModBlockFamily PINK_MARBLE = familyBuilder(ModBlocks.PINK_MARBLE.baseBlock())
            .fromManager(ModBlocks.PINK_MARBLE)
            .getFamily();
    public static final ModBlockFamily RED_MARBLE = familyBuilder(ModBlocks.RED_MARBLE.baseBlock())
            .fromManager(ModBlocks.RED_MARBLE)
            .getFamily();
    public static final ModBlockFamily WHITE_MARBLE = familyBuilder(ModBlocks.WHITE_MARBLE.baseBlock())
            .fromManager(ModBlocks.WHITE_MARBLE)
            .getFamily();

    /* Polished Marble */
    public static final ModBlockFamily POLISHED_BLACK_MARBLE = familyBuilder(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock())
            .fromManager(ModBlocks.POLISHED_BLACK_MARBLE)
            .getFamily();
    public static final ModBlockFamily POLISHED_GRAY_MARBLE = familyBuilder(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock())
            .fromManager(ModBlocks.POLISHED_GRAY_MARBLE)
            .getFamily();
    public static final ModBlockFamily POLISHED_PINK_MARBLE = familyBuilder(ModBlocks.POLISHED_PINK_MARBLE.baseBlock())
            .fromManager(ModBlocks.POLISHED_PINK_MARBLE)
            .getFamily();
    public static final ModBlockFamily POLISHED_RED_MARBLE = familyBuilder(ModBlocks.POLISHED_RED_MARBLE.baseBlock())
            .fromManager(ModBlocks.POLISHED_RED_MARBLE)
            .getFamily();
    public static final ModBlockFamily POLISHED_WHITE_MARBLE = familyBuilder(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock())
            .fromManager(ModBlocks.POLISHED_WHITE_MARBLE)
            .getFamily();
    
    /* Netherite */
    public static final ModBlockFamily NETHERITE = familyBuilder(Blocks.NETHERITE_BLOCK)
            .fromManager(ModBlocks.NETHERITE)
            .getFamily();
    
    /* Nether Bricks */
    public static final ModBlockFamily NETHER_BRICKS = familyBuilder(Blocks.NETHER_BRICKS)
            .fromManager(ModBlocks.NETHER_BRICK)
            .stairs(Blocks.NETHER_BRICK_STAIRS)
            .wall(Blocks.NETHER_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily RED_NETHER_BRICKS = familyBuilder(Blocks.RED_NETHER_BRICKS)
            .fromManager(ModBlocks.RED_NETHER_BRICK)
            .stairs(Blocks.RED_NETHER_BRICK_STAIRS)
            .wall(Blocks.RED_NETHER_BRICK_WALL)
            .getFamily();
    
    /* Obsidian */
    public static final ModBlockFamily OBSIDIAN = familyBuilder(Blocks.OBSIDIAN)
            .fromManager(ModBlocks.OBSIDIAN)
            .getFamily();
    
    /* Prismarine */
    public static final ModBlockFamily PRISMARINE = familyBuilder(Blocks.PRISMARINE)
            .fromManager(ModBlocks.PRISMARINE)
            .stairs(Blocks.PRISMARINE_STAIRS)
            .wall(Blocks.PRISMARINE_WALL)
            .getFamily();
    public static final ModBlockFamily PRISMARINE_BRICKS = familyBuilder(Blocks.PRISMARINE_BRICKS)
            .fromManager(ModBlocks.PRISMARINE_BRICK)
            .stairs(Blocks.PRISMARINE_BRICK_STAIRS)
            .getFamily();
    public static final ModBlockFamily DARK_PRISMARINE = familyBuilder(Blocks.DARK_PRISMARINE)
            .fromManager(ModBlocks.DARK_PRISMARINE)
            .stairs(Blocks.DARK_PRISMARINE_STAIRS)
            .getFamily();
    
    /* Purpur */
    public static final ModBlockFamily PURPUR = familyBuilder(Blocks.PURPUR_BLOCK)
            .fromManager(ModBlocks.PURPUR)
            .getFamily();

    /* Quartz */
    public static final ModBlockFamily QUARTZ = familyBuilder(Blocks.QUARTZ_BLOCK)
            .fromManager(ModBlocks.BLACK_MARBLE)
            .stairs(Blocks.QUARTZ_STAIRS)
            .getFamily();
    public static final ModBlockFamily QUARTZ_BRICKS = familyBuilder(Blocks.QUARTZ_BRICKS)
            .fromManager(ModBlocks.QUARTZ_BRICKS)
            .getFamily();
    public static final ModBlockFamily SMOOTH_QUARTZ = familyBuilder(Blocks.SMOOTH_QUARTZ)
            .fromManager(ModBlocks.SMOOTH_QUARTZ)
            .stairs(Blocks.SMOOTH_QUARTZ_STAIRS)
            .getFamily();

    /* Sandstone */
    public static final ModBlockFamily BROWN_SANDSTONE = familyBuilder(ModBlocks.BROWN_SANDSTONE.baseBlock())
            .fromManager(ModBlocks.BROWN_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily ORANGE_SANDSTONE = familyBuilder(ModBlocks.ORANGE_SANDSTONE.baseBlock())
            .fromManager(ModBlocks.ORANGE_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily RED_SANDSTONE = familyBuilder(Blocks.RED_SANDSTONE)
            .fromManager(ModBlocks.RED_SANDSTONE)
            .stairs(Blocks.RED_SANDSTONE_STAIRS)
            .wall(Blocks.RED_SANDSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily SANDSTONE = familyBuilder(Blocks.SANDSTONE)
            .fromManager(ModBlocks.SANDSTONE)
            .stairs(Blocks.SANDSTONE_STAIRS)
            .wall(Blocks.SANDSTONE_WALL)
            .getFamily();

    /* Chiseled Sandstone */
    public static final ModBlockFamily CHISELED_BROWN_SANDSTONE = familyBuilder(ModBlocks.CHISELED_BROWN_SANDSTONE.baseBlock())
            .fromManager(ModBlocks.CHISELED_BROWN_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily CHISELED_ORANGE_SANDSTONE = familyBuilder(ModBlocks.CHISELED_ORANGE_SANDSTONE.baseBlock())
            .fromManager(ModBlocks.CHISELED_ORANGE_SANDSTONE)
            .getFamily();

    /* Cut Sandstone */
    public static final ModBlockFamily CUT_BROWN_SANDSTONE = familyBuilder(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock())
            .fromManager(ModBlocks.CUT_BROWN_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily CUT_ORANGE_SANDSTONE = familyBuilder(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock())
            .fromManager(ModBlocks.CUT_ORANGE_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily CUT_RED_SANDSTONE = familyBuilder(Blocks.CUT_RED_SANDSTONE)
            .fromManager(ModBlocks.CUT_RED_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily CUT_SANDSTONE = familyBuilder(Blocks.CUT_SANDSTONE)
            .fromManager(ModBlocks.CUT_SANDSTONE)
            .getFamily();

    /* Smooth Sandstone */
    public static final ModBlockFamily SMOOTH_BROWN_SANDSTONE = familyBuilder(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock())
            .fromManager(ModBlocks.SMOOTH_BROWN_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily SMOOTH_ORANGE_SANDSTONE = familyBuilder(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock())
            .fromManager(ModBlocks.SMOOTH_ORANGE_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily SMOOTH_RED_SANDSTONE = familyBuilder(Blocks.SMOOTH_RED_SANDSTONE)
            .fromManager(ModBlocks.SMOOTH_RED_SANDSTONE)
            .stairs(Blocks.SMOOTH_RED_SANDSTONE_STAIRS)
            .getFamily();
    public static final ModBlockFamily SMOOTH_SANDSTONE = familyBuilder(Blocks.SMOOTH_SANDSTONE)
            .fromManager(ModBlocks.BLACK_MARBLE)
            .stairs(Blocks.SMOOTH_SANDSTONE_STAIRS)
            .getFamily();
    
    /* Tuff */
    public static final ModBlockFamily TUFF = familyBuilder(Blocks.TUFF)
            .fromManager(ModBlocks.TUFF)
            .getFamily();

    /* Wood Planks */
    public static final ModBlockFamily ACACIA_PLANKS = familyBuilder(Blocks.ACACIA_PLANKS)
            .fromManager(ModBlocks.ACACIA)
            .fence(Blocks.ACACIA_FENCE)
            .fenceGate(Blocks.ACACIA_FENCE_GATE)
            .door(Blocks.ACACIA_DOOR)
            .trapdoor(Blocks.ACACIA_TRAPDOOR)
            .stairs(Blocks.ACACIA_STAIRS)
            .pressurePlate(Blocks.ACACIA_PRESSURE_PLATE)
            .button(Blocks.ACACIA_BUTTON)
            .sign(Blocks.ACACIA_SIGN, Blocks.ACACIA_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily BIRCH_PLANKS = familyBuilder(Blocks.BIRCH_PLANKS)
            .fromManager(ModBlocks.BIRCH)
            .fence(Blocks.BIRCH_FENCE)
            .fenceGate(Blocks.BIRCH_FENCE_GATE)
            .door(Blocks.BIRCH_DOOR)
            .trapdoor(Blocks.BIRCH_TRAPDOOR)
            .stairs(Blocks.BIRCH_STAIRS)
            .pressurePlate(Blocks.BIRCH_PRESSURE_PLATE)
            .button(Blocks.BIRCH_BUTTON)
            .sign(Blocks.BIRCH_SIGN, Blocks.BIRCH_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily DARK_OAK_PLANKS = familyBuilder(Blocks.DARK_OAK_PLANKS)
            .fromManager(ModBlocks.DARK_OAK)
            .fence(Blocks.DARK_OAK_FENCE)
            .fenceGate(Blocks.DARK_OAK_FENCE_GATE)
            .door(Blocks.DARK_OAK_DOOR)
            .trapdoor(Blocks.DARK_OAK_TRAPDOOR)
            .stairs(Blocks.DARK_OAK_STAIRS)
            .pressurePlate(Blocks.DARK_OAK_PRESSURE_PLATE)
            .button(Blocks.DARK_OAK_BUTTON)
            .sign(Blocks.DARK_OAK_SIGN, Blocks.DARK_OAK_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily JUNGLE_PLANKS = familyBuilder(Blocks.JUNGLE_PLANKS)
            .fromManager(ModBlocks.JUNGLE)
            .fence(Blocks.JUNGLE_FENCE)
            .fenceGate(Blocks.JUNGLE_FENCE_GATE)
            .door(Blocks.JUNGLE_DOOR)
            .trapdoor(Blocks.JUNGLE_TRAPDOOR)
            .stairs(Blocks.JUNGLE_STAIRS)
            .pressurePlate(Blocks.JUNGLE_PRESSURE_PLATE)
            .button(Blocks.JUNGLE_BUTTON)
            .sign(Blocks.JUNGLE_SIGN, Blocks.JUNGLE_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily OAK_PLANKS = familyBuilder(Blocks.OAK_PLANKS)
            .fromManager(ModBlocks.OAK)
            .fence(Blocks.OAK_FENCE)
            .fenceGate(Blocks.OAK_FENCE_GATE)
            .door(Blocks.OAK_DOOR)
            .trapdoor(Blocks.OAK_TRAPDOOR)
            .stairs(Blocks.OAK_STAIRS)
            .pressurePlate(Blocks.OAK_PRESSURE_PLATE)
            .button(Blocks.OAK_BUTTON)
            .sign(Blocks.OAK_SIGN, Blocks.OAK_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily SPRUCE_PLANKS = familyBuilder(Blocks.SPRUCE_PLANKS)
            .fromManager(ModBlocks.SPRUCE)
            .fence(Blocks.SPRUCE_FENCE)
            .fenceGate(Blocks.SPRUCE_FENCE_GATE)
            .door(Blocks.SPRUCE_DOOR)
            .trapdoor(Blocks.SPRUCE_TRAPDOOR)
            .stairs(Blocks.SPRUCE_STAIRS)
            .pressurePlate(Blocks.SPRUCE_PRESSURE_PLATE)
            .button(Blocks.SPRUCE_BUTTON)
            .sign(Blocks.SPRUCE_SIGN, Blocks.SPRUCE_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily CRIMSON_PLANKS = familyBuilder(Blocks.CRIMSON_PLANKS)
            .fromManager(ModBlocks.CRIMSON)
            .fence(Blocks.CRIMSON_FENCE)
            .fenceGate(Blocks.CRIMSON_FENCE_GATE)
            .door(Blocks.CRIMSON_DOOR)
            .trapdoor(Blocks.CRIMSON_TRAPDOOR)
            .stairs(Blocks.CRIMSON_STAIRS)
            .pressurePlate(Blocks.CRIMSON_PRESSURE_PLATE)
            .button(Blocks.CRIMSON_BUTTON)
            .sign(Blocks.CRIMSON_SIGN, Blocks.CRIMSON_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily WARPED_PLANKS = familyBuilder(Blocks.WARPED_PLANKS)
            .fromManager(ModBlocks.WARPED)
            .fence(Blocks.WARPED_FENCE)
            .fenceGate(Blocks.WARPED_FENCE_GATE)
            .door(Blocks.WARPED_DOOR)
            .trapdoor(Blocks.WARPED_TRAPDOOR)
            .stairs(Blocks.WARPED_STAIRS)
            .pressurePlate(Blocks.WARPED_PRESSURE_PLATE)
            .button(Blocks.WARPED_BUTTON)
            .sign(Blocks.WARPED_SIGN, Blocks.WARPED_WALL_SIGN)
            .getFamily();

    /* Mossy Planks */
    public static final ModBlockFamily MOSSY_ACACIA = familyBuilder(ModBlocks.MOSSY_ACACIA.baseBlock())
            .fromManager(ModBlocks.MOSSY_ACACIA)
            .getFamily();
    public static final ModBlockFamily MOSSY_BIRCH = familyBuilder(ModBlocks.MOSSY_BIRCH.baseBlock())
            .fromManager(ModBlocks.MOSSY_BIRCH)
            .getFamily();
    public static final ModBlockFamily MOSSY_DARK_OAK = familyBuilder(ModBlocks.MOSSY_DARK_OAK.baseBlock())
            .fromManager(ModBlocks.MOSSY_DARK_OAK)
            .getFamily();
    public static final ModBlockFamily MOSSY_JUNGLE = familyBuilder(ModBlocks.MOSSY_JUNGLE.baseBlock())
            .fromManager(ModBlocks.MOSSY_JUNGLE)
            .getFamily();
    public static final ModBlockFamily MOSSY_OAK = familyBuilder(ModBlocks.MOSSY_OAK.baseBlock())
            .fromManager(ModBlocks.MOSSY_OAK)
            .getFamily();
    public static final ModBlockFamily MOSSY_SPRUCE = familyBuilder(ModBlocks.MOSSY_SPRUCE.baseBlock())
            .fromManager(ModBlocks.MOSSY_SPRUCE)
            .getFamily();
    public static final ModBlockFamily MOSSY_CRIMSON = familyBuilder(ModBlocks.MOSSY_CRIMSON.baseBlock())
            .fromManager(ModBlocks.MOSSY_CRIMSON)
            .getFamily();
    public static final ModBlockFamily MOSSY_WARPED = familyBuilder(ModBlocks.MOSSY_WARPED.baseBlock())
            .fromManager(ModBlocks.MOSSY_WARPED)
            .getFamily();

    /* Stained Wood Planks */
    public static final ModBlockFamily STAINED_ACACIA_PLANKS = familyBuilder(ModBlocks.STAINED_ACACIA.baseBlock())
            .fromManager(ModBlocks.STAINED_ACACIA)
            .button(ModBlocks.STAINED_ACACIA_BUTTON.get())
            .door(ModBlocks.STAINED_ACACIA_DOOR.get())
            .sign(ModBlocks.STAINED_ACACIA_SIGN.get(), ModBlocks.STAINED_ACACIA_WALL_SIGN.get())
            .trapdoor(ModBlocks.STAINED_ACACIA_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_BIRCH_PLANKS = familyBuilder(ModBlocks.STAINED_BIRCH.baseBlock())
            .fromManager(ModBlocks.STAINED_BIRCH)
            .button(ModBlocks.STAINED_BIRCH_BUTTON.get())
            .door(ModBlocks.STAINED_BIRCH_DOOR.get())
            .sign(ModBlocks.STAINED_BIRCH_SIGN.get(), ModBlocks.STAINED_BIRCH_WALL_SIGN.get())
            .trapdoor(ModBlocks.STAINED_BIRCH_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_DARK_OAK_PLANKS = familyBuilder(ModBlocks.STAINED_DARK_OAK.baseBlock())
            .fromManager(ModBlocks.STAINED_DARK_OAK)
            .button(ModBlocks.STAINED_DARK_OAK_BUTTON.get())
            .door(ModBlocks.STAINED_DARK_OAK_DOOR.get())
            .sign(ModBlocks.STAINED_DARK_OAK_SIGN.get(), ModBlocks.STAINED_DARK_OAK_WALL_SIGN.get())
            .trapdoor(ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_JUNGLE_PLANKS = familyBuilder(ModBlocks.STAINED_JUNGLE.baseBlock())
            .fromManager(ModBlocks.STAINED_JUNGLE)
            .button(ModBlocks.STAINED_JUNGLE_BUTTON.get())
            .door(ModBlocks.STAINED_JUNGLE_DOOR.get())
            .sign(ModBlocks.STAINED_JUNGLE_SIGN.get(), ModBlocks.STAINED_JUNGLE_WALL_SIGN.get())
            .trapdoor(ModBlocks.STAINED_JUNGLE_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_OAK_PLANKS = familyBuilder(ModBlocks.STAINED_OAK.baseBlock())
            .fromManager(ModBlocks.STAINED_OAK)
            .button(ModBlocks.STAINED_OAK_BUTTON.get())
            .door(ModBlocks.STAINED_OAK_DOOR.get())
            .sign(ModBlocks.STAINED_OAK_SIGN.get(), ModBlocks.STAINED_OAK_WALL_SIGN.get())
            .trapdoor(ModBlocks.STAINED_OAK_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_SPRUCE_PLANKS = familyBuilder(ModBlocks.STAINED_SPRUCE.baseBlock())
            .fromManager(ModBlocks.STAINED_SPRUCE)
            .button(ModBlocks.STAINED_SPRUCE_BUTTON.get())
            .door(ModBlocks.STAINED_SPRUCE_DOOR.get())
            .sign(ModBlocks.STAINED_SPRUCE_SIGN.get(), ModBlocks.STAINED_SPRUCE_WALL_SIGN.get())
            .trapdoor(ModBlocks.STAINED_SPRUCE_TRAPDOOR.get())
            .getFamily();

    /* Mossy Stained Planks */
    public static final ModBlockFamily MOSSY_STAINED_ACACIA = familyBuilder(ModBlocks.MOSSY_STAINED_ACACIA.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_ACACIA)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_BIRCH = familyBuilder(ModBlocks.MOSSY_STAINED_BIRCH.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_BIRCH)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_DARK_OAK = familyBuilder(ModBlocks.MOSSY_STAINED_DARK_OAK.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_DARK_OAK)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_JUNGLE = familyBuilder(ModBlocks.MOSSY_STAINED_JUNGLE.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_JUNGLE)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_OAK = familyBuilder(ModBlocks.MOSSY_STAINED_OAK.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_OAK)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_SPRUCE = familyBuilder(ModBlocks.MOSSY_STAINED_SPRUCE.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_SPRUCE)
            .getFamily();

    /* Stripped Wood  */
    public static final ModBlockFamily STRIPPED_ACACIA_WOOD = familyBuilder(Blocks.STRIPPED_ACACIA_WOOD)
            .fromManager(ModBlocks.STRIPPED_ACACIA)
            .getFamily();
    public static final ModBlockFamily STRIPPED_BIRCH_WOOD = familyBuilder(Blocks.STRIPPED_BIRCH_WOOD)
            .fromManager(ModBlocks.STRIPPED_BIRCH)
            .getFamily();
    public static final ModBlockFamily STRIPPED_DARK_OAK_WOOD = familyBuilder(Blocks.STRIPPED_DARK_OAK_WOOD)
            .fromManager(ModBlocks.STRIPPED_DARK_OAK)
            .getFamily();
    public static final ModBlockFamily STRIPPED_JUNGLE_WOOD = familyBuilder(Blocks.STRIPPED_JUNGLE_WOOD)
            .fromManager(ModBlocks.STRIPPED_JUNGLE)
            .getFamily();
    public static final ModBlockFamily STRIPPED_OAK_WOOD = familyBuilder(Blocks.STRIPPED_OAK_WOOD)
            .fromManager(ModBlocks.STRIPPED_OAK)
            .getFamily();
    public static final ModBlockFamily STRIPPED_SPRUCE_WOOD = familyBuilder(Blocks.STRIPPED_SPRUCE_WOOD)
            .fromManager(ModBlocks.STRIPPED_SPRUCE)
            .getFamily();
    public static final ModBlockFamily STRIPPED_CRIMSON_HYPHAE = familyBuilder(Blocks.STRIPPED_CRIMSON_HYPHAE)
            .fromManager(ModBlocks.STRIPPED_CRIMSON)
            .getFamily();
    public static final ModBlockFamily STRIPPED_WARPED_HYPHAE = familyBuilder(Blocks.STRIPPED_WARPED_HYPHAE)
            .fromManager(ModBlocks.STRIPPED_WARPED)
            .getFamily();

    /* Stained Wood  */
    public static final ModBlockFamily STAINED_STRIPPED_ACACIA_WOOD = familyBuilder(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock())
            .fromManager(ModBlocks.STAINED_STRIPPED_ACACIA)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_BIRCH_WOOD = familyBuilder(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock())
            .fromManager(ModBlocks.STAINED_STRIPPED_BIRCH)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_DARK_OAK_WOOD = familyBuilder(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock())
            .fromManager(ModBlocks.STAINED_STRIPPED_DARK_OAK)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_JUNGLE_WOOD = familyBuilder(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock())
            .fromManager(ModBlocks.STAINED_STRIPPED_JUNGLE)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_OAK_WOOD = familyBuilder(ModBlocks.STAINED_STRIPPED_OAK.baseBlock())
            .fromManager(ModBlocks.STAINED_STRIPPED_OAK)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_SPRUCE_WOOD = familyBuilder(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock())
            .fromManager(ModBlocks.STAINED_STRIPPED_SPRUCE)
            .getFamily();

    /* Boards and Roofing Blocks */
    public static final ModBlockFamily ACACIA_BOARDS = familyBuilder(ModBlocks.ACACIA_BOARDS.baseBlock())
            .fromManager(ModBlocks.ACACIA_BOARDS)
            .fromManager(ModBlocks.ACACIA_SHINGLES)
            .getFamily();
    public static final ModBlockFamily BIRCH_BOARDS = familyBuilder(ModBlocks.BIRCH_BOARDS.baseBlock())
            .fromManager(ModBlocks.BIRCH_BOARDS)
            .fromManager(ModBlocks.BIRCH_SHINGLES)
            .getFamily();
    public static final ModBlockFamily DARK_OAK_BOARDS = familyBuilder(ModBlocks.DARK_OAK_BOARDS.baseBlock())
            .fromManager(ModBlocks.DARK_OAK_BOARDS)
            .fromManager(ModBlocks.DARK_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily JUNGLE_BOARDS = familyBuilder(ModBlocks.JUNGLE_BOARDS.baseBlock())
            .fromManager(ModBlocks.JUNGLE_BOARDS)
            .fromManager(ModBlocks.JUNGLE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily OAK_BOARDS = familyBuilder(ModBlocks.OAK_BOARDS.baseBlock())
            .fromManager(ModBlocks.OAK_BOARDS)
            .fromManager(ModBlocks.OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily SPRUCE_BOARDS = familyBuilder(ModBlocks.SPRUCE_BOARDS.baseBlock())
            .fromManager(ModBlocks.SPRUCE_BOARDS)
            .fromManager(ModBlocks.SPRUCE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily CRIMSON_BOARDS = familyBuilder(ModBlocks.CRIMSON_BOARDS.baseBlock())
            .fromManager(ModBlocks.CRIMSON_BOARDS)
            .fromManager(ModBlocks.CRIMSON_SHINGLES)
            .getFamily();
    public static final ModBlockFamily WARPED_BOARDS = familyBuilder(ModBlocks.WARPED_BOARDS.baseBlock())
            .fromManager(ModBlocks.WARPED_BOARDS)
            .fromManager(ModBlocks.WARPED_SHINGLES)
            .getFamily();
    
    /* Mossy Boards and Roofing Blocks */
    public static final ModBlockFamily MOSSY_ACACIA_BOARDS = familyBuilder(ModBlocks.MOSSY_ACACIA_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_ACACIA_BOARDS)
            .fromManager(ModBlocks.MOSSY_ACACIA_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_BIRCH_BOARDS = familyBuilder(ModBlocks.MOSSY_BIRCH_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_BIRCH_BOARDS)
            .fromManager(ModBlocks.MOSSY_BIRCH_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_DARK_OAK_BOARDS = familyBuilder(ModBlocks.MOSSY_DARK_OAK_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_DARK_OAK_BOARDS)
            .fromManager(ModBlocks.MOSSY_DARK_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_JUNGLE_BOARDS = familyBuilder(ModBlocks.MOSSY_JUNGLE_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_JUNGLE_BOARDS)
            .fromManager(ModBlocks.MOSSY_JUNGLE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_OAK_BOARDS = familyBuilder(ModBlocks.MOSSY_OAK_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_OAK_BOARDS)
            .fromManager(ModBlocks.MOSSY_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_SPRUCE_BOARDS = familyBuilder(ModBlocks.MOSSY_SPRUCE_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_SPRUCE_BOARDS)
            .fromManager(ModBlocks.MOSSY_SPRUCE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_CRIMSON_BOARDS = familyBuilder(ModBlocks.MOSSY_CRIMSON_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_CRIMSON_BOARDS)
            .fromManager(ModBlocks.MOSSY_CRIMSON_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_WARPED_BOARDS = familyBuilder(ModBlocks.MOSSY_WARPED_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_WARPED_BOARDS)
            .fromManager(ModBlocks.MOSSY_WARPED_SHINGLES)
            .getFamily();
    
    
    /* Stained Boards and Roofing Blocks */
    public static final ModBlockFamily STAINED_ACACIA_BOARDS = familyBuilder(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock())
            .fromManager(ModBlocks.STAINED_ACACIA_BOARDS)
            .fromManager(ModBlocks.STAINED_ACACIA_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_BIRCH_BOARDS = familyBuilder(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock())
            .fromManager(ModBlocks.STAINED_BIRCH_BOARDS)
            .fromManager(ModBlocks.STAINED_BIRCH_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_DARK_OAK_BOARDS = familyBuilder(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock())
            .fromManager(ModBlocks.STAINED_DARK_OAK_BOARDS)
            .fromManager(ModBlocks.STAINED_DARK_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_JUNGLE_BOARDS = familyBuilder(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock())
            .fromManager(ModBlocks.STAINED_JUNGLE_BOARDS)
            .fromManager(ModBlocks.STAINED_JUNGLE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_OAK_BOARDS = familyBuilder(ModBlocks.STAINED_OAK_BOARDS.baseBlock())
            .fromManager(ModBlocks.STAINED_OAK_BOARDS)
            .fromManager(ModBlocks.STAINED_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_SPRUCE_BOARDS = familyBuilder(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock())
            .fromManager(ModBlocks.STAINED_SPRUCE_BOARDS)
            .fromManager(ModBlocks.STAINED_SPRUCE_SHINGLES)
            .getFamily();

    /* Mossy Boards and Roofing Blocks */
    public static final ModBlockFamily MOSSY_STAINED_ACACIA_BOARDS = familyBuilder(ModBlocks.MOSSY_STAINED_ACACIA_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_ACACIA_BOARDS)
            .fromManager(ModBlocks.MOSSY_STAINED_ACACIA_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_BIRCH_BOARDS = familyBuilder(ModBlocks.MOSSY_STAINED_BIRCH_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_BIRCH_BOARDS)
            .fromManager(ModBlocks.MOSSY_STAINED_BIRCH_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_DARK_OAK_BOARDS = familyBuilder(ModBlocks.MOSSY_STAINED_DARK_OAK_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_DARK_OAK_BOARDS)
            .fromManager(ModBlocks.MOSSY_STAINED_DARK_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_JUNGLE_BOARDS = familyBuilder(ModBlocks.MOSSY_STAINED_JUNGLE_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_JUNGLE_BOARDS)
            .fromManager(ModBlocks.MOSSY_STAINED_JUNGLE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_OAK_BOARDS = familyBuilder(ModBlocks.MOSSY_STAINED_OAK_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_OAK_BOARDS)
            .fromManager(ModBlocks.MOSSY_STAINED_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_SPRUCE_BOARDS = familyBuilder(ModBlocks.MOSSY_STAINED_SPRUCE_BOARDS.baseBlock())
            .fromManager(ModBlocks.MOSSY_STAINED_SPRUCE_BOARDS)
            .fromManager(ModBlocks.MOSSY_STAINED_SPRUCE_SHINGLES)
            .getFamily();
    
    /* Other Roofing Materials */
    public static final ModBlockFamily THATCH = familyBuilder(ModBlocks.THATCH.baseBlock())
            .fromManager(ModBlocks.THATCH)
            .getFamily();
//    public static final ModBlockFamily SLATE_TILE = familyBuilder(ModBlocks.SLATE_TILE.baseBlock())
//            .fromManager(ModBlocks.SLATE_TILE)
//            .getFamily();
//    public static final ModBlockFamily CLAY_TILE = familyBuilder(ModBlocks.CLAY_TILE.baseBlock())
//            .fromManager(ModBlocks.CLAY_TILE)
//            .getFamily();

   /* Sand */
    public static final ModBlockFamily BLACK_SAND = familyBuilder(ModBlocks.BLACK_SAND.get())
            .layer(ModBlocks.BLACK_SAND_LAYER.get())
            .getFamily();
    public static final ModBlockFamily BROWN_SAND = familyBuilder(ModBlocks.BROWN_SAND.get())
            .layer(ModBlocks.BROWN_SAND_LAYER.get())
            .getFamily();
    public static final ModBlockFamily ORANGE_SAND = familyBuilder(ModBlocks.ORANGE_SAND.get())
            .layer(ModBlocks.ORANGE_SAND_LAYER.get())
            .getFamily();
    public static final ModBlockFamily RED_SAND = familyBuilder(Blocks.RED_SAND)
            .layer(ModBlocks.RED_SAND_LAYER.get())
            .getFamily();
    public static final ModBlockFamily SAND = familyBuilder(Blocks.SAND)
            .layer(ModBlocks.SAND_LAYER.get())
            .getFamily();
    public static final ModBlockFamily SOUL_SAND = familyBuilder(Blocks.SOUL_SAND)
            .layer(ModBlocks.SOUL_SAND_LAYER.get())
            .getFamily();
    public static final ModBlockFamily WHITE_SAND = familyBuilder(ModBlocks.WHITE_SAND.get())
            .layer(ModBlocks.WHITE_SAND_LAYER.get())
            .getFamily();

    /* Other Terrain */
    public static final ModBlockFamily CLAY = familyBuilder(Blocks.CLAY)
            .layer(ModBlocks.CLAY_LAYER.get())
            .getFamily();
    public static final ModBlockFamily COARSE_DIRT = familyBuilder(Blocks.COARSE_DIRT)
            .layer(ModBlocks.COARSE_DIRT_LAYER.get())
            .getFamily();
    public static final ModBlockFamily DIRT = familyBuilder(Blocks.DIRT)
            .layer(ModBlocks.DIRT_LAYER.get())
            .getFamily();
    public static final ModBlockFamily FARMLAND = familyBuilder(Blocks.FARMLAND)
//            .layer(ModBlocks.FARMLAND_LAYER.get())
            .getFamily();
    public static final ModBlockFamily GRASS_BLOCK = familyBuilder(Blocks.GRASS_BLOCK)
            .layer(ModBlocks.GRASS_LAYER.get())
            .getFamily();
    public static final ModBlockFamily GRAVEL = familyBuilder(Blocks.GRAVEL)
            .layer(ModBlocks.GRAVEL_LAYER.get())
            .getFamily();
    public static final ModBlockFamily MYCELIUM = familyBuilder(Blocks.MYCELIUM)
            .layer(ModBlocks.MYCELIUM_LAYER.get())
            .getFamily();
    public static final ModBlockFamily PODZOL = familyBuilder(Blocks.PODZOL)
            .layer(ModBlocks.PODZOL_LAYER.get())
            .getFamily();
    public static final ModBlockFamily ROOTED_DIRT = familyBuilder(Blocks.ROOTED_DIRT)
            .layer(ModBlocks.ROOTED_DIRT_LAYER.get())
            .getFamily();
    public static final ModBlockFamily SOUL_SOIL = familyBuilder(Blocks.SOUL_SOIL)
            .layer(ModBlocks.SOUL_SOIL_LAYER.get())
            .getFamily();
    public static final ModBlockFamily CRIMSON_NYLIUM = familyBuilder(Blocks.CRIMSON_NYLIUM)
            .layer(ModBlocks.CRIMSON_NYLIUM_LAYER.get())
            .getFamily();
    public static final ModBlockFamily WARPED_NYLIUM = familyBuilder(Blocks.WARPED_NYLIUM)
            .layer(ModBlocks.WARPED_NYLIUM_LAYER.get())
            .getFamily();
    
    /* Concrete */
    public static final ModBlockFamily BLACK_CONCRETE = familyBuilder(Blocks.BLACK_CONCRETE)
            .fromManager(ModBlocks.BLACK_CONCRETE)
            .getFamily();
    public static final ModBlockFamily BLUE_CONCRETE = familyBuilder(Blocks.BLUE_CONCRETE)
            .fromManager(ModBlocks.BLUE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily BROWN_CONCRETE = familyBuilder(Blocks.BROWN_CONCRETE)
            .fromManager(ModBlocks.BROWN_CONCRETE)
            .getFamily();
    public static final ModBlockFamily CYAN_CONCRETE = familyBuilder(Blocks.CYAN_CONCRETE)
            .fromManager(ModBlocks.CYAN_CONCRETE)
            .getFamily();
    public static final ModBlockFamily GRAY_CONCRETE = familyBuilder(Blocks.GRAY_CONCRETE)
            .fromManager(ModBlocks.GRAY_CONCRETE)
            .getFamily();
    public static final ModBlockFamily GREEN_CONCRETE = familyBuilder(Blocks.GREEN_CONCRETE)
            .fromManager(ModBlocks.GREEN_CONCRETE)
            .getFamily();
    public static final ModBlockFamily LIGHT_BLUE_CONCRETE = familyBuilder(Blocks.LIGHT_BLUE_CONCRETE)
            .fromManager(ModBlocks.LIGHT_BLUE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily LIGHT_GRAY_CONCRETE = familyBuilder(Blocks.LIGHT_GRAY_CONCRETE)
            .fromManager(ModBlocks.LIGHT_GRAY_CONCRETE)
            .getFamily();
    public static final ModBlockFamily LIME_CONCRETE = familyBuilder(Blocks.LIME_CONCRETE)
            .fromManager(ModBlocks.LIME_CONCRETE)
            .getFamily();
    public static final ModBlockFamily MAGENTA_CONCRETE = familyBuilder(Blocks.MAGENTA_CONCRETE)
            .fromManager(ModBlocks.MAGENTA_CONCRETE)
            .getFamily();
    public static final ModBlockFamily ORANGE_CONCRETE = familyBuilder(Blocks.ORANGE_CONCRETE)
            .fromManager(ModBlocks.ORANGE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily PINK_CONCRETE = familyBuilder(Blocks.PINK_CONCRETE)
            .fromManager(ModBlocks.PINK_CONCRETE)
            .getFamily();
    public static final ModBlockFamily PURPLE_CONCRETE = familyBuilder(Blocks.PURPLE_CONCRETE)
            .fromManager(ModBlocks.PURPLE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily RED_CONCRETE = familyBuilder(Blocks.RED_CONCRETE)
            .fromManager(ModBlocks.RED_CONCRETE)
            .getFamily();
    public static final ModBlockFamily WHITE_CONCRETE = familyBuilder(Blocks.WHITE_CONCRETE)
            .fromManager(ModBlocks.WHITE_CONCRETE)
            .getFamily();
    public static final ModBlockFamily YELLOW_CONCRETE = familyBuilder(Blocks.YELLOW_CONCRETE)
            .fromManager(ModBlocks.YELLOW_CONCRETE)
            .getFamily();
    
    /* Terracotta */
    public static final ModBlockFamily TERRACOTTA = familyBuilder(Blocks.TERRACOTTA)
            .fromManager(ModBlocks.TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily BLACK_TERRACOTTA = familyBuilder(Blocks.BLACK_TERRACOTTA)
            .fromManager(ModBlocks.BLACK_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily BLUE_TERRACOTTA = familyBuilder(Blocks.BLUE_TERRACOTTA)
            .fromManager(ModBlocks.BLUE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily BROWN_TERRACOTTA = familyBuilder(Blocks.BROWN_TERRACOTTA)
            .fromManager(ModBlocks.BROWN_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily CYAN_TERRACOTTA = familyBuilder(Blocks.CYAN_TERRACOTTA)
            .fromManager(ModBlocks.CYAN_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily GRAY_TERRACOTTA = familyBuilder(Blocks.GRAY_TERRACOTTA)
            .fromManager(ModBlocks.GRAY_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily GREEN_TERRACOTTA = familyBuilder(Blocks.GREEN_TERRACOTTA)
            .fromManager(ModBlocks.GREEN_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily LIGHT_BLUE_TERRACOTTA = familyBuilder(Blocks.LIGHT_BLUE_TERRACOTTA)
            .fromManager(ModBlocks.LIGHT_BLUE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily LIGHT_GRAY_TERRACOTTA = familyBuilder(Blocks.LIGHT_GRAY_TERRACOTTA)
            .fromManager(ModBlocks.LIGHT_GRAY_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily LIME_TERRACOTTA = familyBuilder(Blocks.LIME_TERRACOTTA)
            .fromManager(ModBlocks.LIME_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily MAGENTA_TERRACOTTA = familyBuilder(Blocks.MAGENTA_TERRACOTTA)
            .fromManager(ModBlocks.MAGENTA_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily ORANGE_TERRACOTTA = familyBuilder(Blocks.ORANGE_TERRACOTTA)
            .fromManager(ModBlocks.ORANGE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily PINK_TERRACOTTA = familyBuilder(Blocks.PINK_TERRACOTTA)
            .fromManager(ModBlocks.PINK_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily PURPLE_TERRACOTTA = familyBuilder(Blocks.PURPLE_TERRACOTTA)
            .fromManager(ModBlocks.PURPLE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily RED_TERRACOTTA = familyBuilder(Blocks.RED_TERRACOTTA)
            .fromManager(ModBlocks.RED_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily WHITE_TERRACOTTA = familyBuilder(Blocks.WHITE_TERRACOTTA)
            .fromManager(ModBlocks.WHITE_TERRACOTTA)
            .getFamily();
    public static final ModBlockFamily YELLOW_TERRACOTTA = familyBuilder(Blocks.YELLOW_TERRACOTTA)
            .fromManager(ModBlocks.YELLOW_TERRACOTTA)
            .getFamily();
    
    /* Wool */
    public static final ModBlockFamily BLACK_WOOL = familyBuilder(Blocks.BLACK_WOOL)
            .fromManager(ModBlocks.BLACK_WOOL)
            .getFamily();
    public static final ModBlockFamily BLUE_WOOL = familyBuilder(Blocks.BLUE_WOOL)
            .fromManager(ModBlocks.BLUE_WOOL)
            .getFamily();
    public static final ModBlockFamily BROWN_WOOL = familyBuilder(Blocks.BROWN_WOOL)
            .fromManager(ModBlocks.BROWN_WOOL)
            .getFamily();
    public static final ModBlockFamily CYAN_WOOL = familyBuilder(Blocks.CYAN_WOOL)
            .fromManager(ModBlocks.CYAN_WOOL)
            .getFamily();
    public static final ModBlockFamily GRAY_WOOL = familyBuilder(Blocks.GRAY_WOOL)
            .fromManager(ModBlocks.GRAY_WOOL)
            .getFamily();
    public static final ModBlockFamily GREEN_WOOL = familyBuilder(Blocks.GREEN_WOOL)
            .fromManager(ModBlocks.GREEN_WOOL)
            .getFamily();
    public static final ModBlockFamily LIGHT_BLUE_WOOL = familyBuilder(Blocks.LIGHT_BLUE_WOOL)
            .fromManager(ModBlocks.LIGHT_BLUE_WOOL)
            .getFamily();
    public static final ModBlockFamily LIGHT_GRAY_WOOL = familyBuilder(Blocks.LIGHT_GRAY_WOOL)
            .fromManager(ModBlocks.LIGHT_GRAY_WOOL)
            .getFamily();
    public static final ModBlockFamily LIME_WOOL = familyBuilder(Blocks.LIME_WOOL)
            .fromManager(ModBlocks.LIME_WOOL)
            .getFamily();
    public static final ModBlockFamily MAGENTA_WOOL = familyBuilder(Blocks.MAGENTA_WOOL)
            .fromManager(ModBlocks.MAGENTA_WOOL)
            .getFamily();
    public static final ModBlockFamily ORANGE_WOOL = familyBuilder(Blocks.ORANGE_WOOL)
            .fromManager(ModBlocks.ORANGE_WOOL)
            .getFamily();
    public static final ModBlockFamily PINK_WOOL = familyBuilder(Blocks.PINK_WOOL)
            .fromManager(ModBlocks.PINK_WOOL)
            .getFamily();
    public static final ModBlockFamily PURPLE_WOOL = familyBuilder(Blocks.PURPLE_WOOL)
            .fromManager(ModBlocks.PURPLE_WOOL)
            .getFamily();
    public static final ModBlockFamily RED_WOOL = familyBuilder(Blocks.RED_WOOL)
            .fromManager(ModBlocks.RED_WOOL)
            .getFamily();
    public static final ModBlockFamily WHITE_WOOL = familyBuilder(Blocks.WHITE_WOOL)
            .fromManager(ModBlocks.WHITE_WOOL)
            .getFamily();
    public static final ModBlockFamily YELLOW_WOOL = familyBuilder(Blocks.YELLOW_WOOL)
            .fromManager(ModBlocks.YELLOW_WOOL)
            .getFamily();
    
    /* Plaster */
    public static final ModBlockFamily BEIGE_PLASTER = familyBuilder(ModBlocks.BEIGE_PLASTER.baseBlock())
            .fromManager(ModBlocks.BEIGE_PLASTER)
            .getFamily();
    public static final ModBlockFamily BROWN_PLASTER = familyBuilder(ModBlocks.BROWN_PLASTER.baseBlock())
            .fromManager(ModBlocks.BROWN_PLASTER)
            .getFamily();
    public static final ModBlockFamily OCHRE_PLASTER = familyBuilder(ModBlocks.OCHRE_PLASTER.baseBlock())
            .fromManager(ModBlocks.OCHRE_PLASTER)
            .getFamily();
    public static final ModBlockFamily TAN_PLASTER = familyBuilder(ModBlocks.TAN_PLASTER.baseBlock())
            .fromManager(ModBlocks.TAN_PLASTER)
            .getFamily();
    public static final ModBlockFamily WHITE_PLASTER = familyBuilder(ModBlocks.WHITE_PLASTER.baseBlock())
            .fromManager(ModBlocks.WHITE_PLASTER)
            .getFamily();
    
//    /* TUDOR BLOCKS */
//    /* Beige Plaster Half-Timbered */
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_CROSS.baseBlock())
        .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_CROSS)
        .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_V_2)
            .getFamily();

    //    /* White Plaster Half-Timbered */
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_OAK_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_OAK_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_V_2)
            .getFamily();

    //    /* Beige Plaster Half-Timbered */
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_2)
            .getFamily();

    //    /* White Plaster Half-Timbered */
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_V_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_CROSS = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_CROSS.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_CROSS)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_DOWN = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_DOWN.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_DOWN)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_UP = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_UP.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_UP)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_LEFT = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_LEFT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_LEFT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_RIGHT = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_RIGHT.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_RIGHT)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_1 = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_2 = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_2)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_1 = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_1.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_1)
            .getFamily();
    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_2 = familyBuilder(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_2.baseBlock())
            .fromManager(ModBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_2)
            .getFamily();


    private static ModBlockFamily.Builder familyBuilder(Block pBaseBlock) {
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
}