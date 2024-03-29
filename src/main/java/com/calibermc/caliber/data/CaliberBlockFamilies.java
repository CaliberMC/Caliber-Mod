package com.calibermc.caliber.data;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.block.properties.BlockProps;
import com.google.common.collect.Maps;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import com.calibermc.caliberlib.data.ModBlockFamily;

import java.util.Map;
import java.util.stream.Stream;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.STONE_VARIANTS_WITHOUT_STAIRS_WALL;

@SuppressWarnings("unused")
public class CaliberBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();
    
    /* Andesite */
    public static final ModBlockFamily ANDESITE = familyBuilder(Blocks.ANDESITE)
            .fromManager(CaliberBlocks.ANDESITE)
            .stairs(Blocks.ANDESITE_STAIRS)
            .wall(Blocks.ANDESITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_ANDESITE = familyBuilder(Blocks.POLISHED_ANDESITE)
            .fromManager(CaliberBlocks.POLISHED_ANDESITE)
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
            .stairs(Blocks.BLACKSTONE_STAIRS)
            .wall(Blocks.BLACKSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily GILDED_BLACKSTONE = familyBuilder(Blocks.GILDED_BLACKSTONE)
            .fromManager(CaliberBlocks.GILDED_BLACKSTONE)
            .getFamily();
    public static final ModBlockFamily POLISHED_BLACKSTONE = familyBuilder(Blocks.POLISHED_BLACKSTONE)
            .fromManager(CaliberBlocks.POLISHED_BLACKSTONE)
            .stairs(Blocks.POLISHED_BLACKSTONE_STAIRS)
            .wall(Blocks.POLISHED_BLACKSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_BLACKSTONE_BRICK = familyBuilder(Blocks.POLISHED_BLACKSTONE_BRICKS)
            .fromManager(CaliberBlocks.POLISHED_BLACKSTONE_BRICK)
            .stairs(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
            .wall(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
            .getFamily();
    
    /* Brick */
    public static final ModBlockFamily BRICKS = familyBuilder(Blocks.BRICKS)
            .fromManager(CaliberBlocks.BRICK)
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
            .stairs(Blocks.DEEPSLATE_BRICK_STAIRS)
            .wall(Blocks.DEEPSLATE_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily DEEPSLATE_TILES = familyBuilder(Blocks.DEEPSLATE_TILES)
            .fromManager(CaliberBlocks.DEEPSLATE_TILE)
            .stairs(Blocks.DEEPSLATE_TILE_STAIRS)
            .wall(Blocks.DEEPSLATE_TILE_WALL)
            .fromManager(CaliberBlocks.SLATE_TILE)
            .getFamily();
    public static final ModBlockFamily COBBLED_DEEPSLATE = familyBuilder(Blocks.COBBLED_DEEPSLATE)
            .fromManager(CaliberBlocks.COBBLED_DEEPSLATE)
            .stairs(Blocks.COBBLED_DEEPSLATE_STAIRS)
            .wall(Blocks.COBBLED_DEEPSLATE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_DEEPSLATE = familyBuilder(Blocks.POLISHED_DEEPSLATE)
            .fromManager(CaliberBlocks.POLISHED_DEEPSLATE)
            .stairs(Blocks.POLISHED_DEEPSLATE_STAIRS)
            .wall(Blocks.POLISHED_DEEPSLATE_WALL)
            .getFamily();
    
    /* Diorite */
    public static final ModBlockFamily DIORITE = familyBuilder(Blocks.DIORITE)
            .fromManager(CaliberBlocks.DIORITE)
            .stairs(Blocks.DIORITE_STAIRS)
            .wall(Blocks.DIORITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_DIORITE = familyBuilder(Blocks.POLISHED_DIORITE)
            .fromManager(CaliberBlocks.POLISHED_DIORITE)
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
            .stairs(Blocks.END_STONE_BRICK_STAIRS)
            .wall(Blocks.END_STONE_BRICK_WALL)
            .getFamily();

    /* Granite */
    public static final ModBlockFamily GRANITE = familyBuilder(Blocks.GRANITE)
            .fromManager(CaliberBlocks.GRANITE)
            .stairs(Blocks.GRANITE_STAIRS)
            .wall(Blocks.GRANITE_WALL)
            .getFamily();
    public static final ModBlockFamily POLISHED_GRANITE = familyBuilder(Blocks.POLISHED_GRANITE)
            .fromManager(CaliberBlocks.POLISHED_GRANITE)
            .stairs(Blocks.GRANITE_STAIRS)
            .wall(Blocks.GRANITE_WALL)
            .getFamily();
    
    /* Mud Bricks */
    public static final ModBlockFamily MUD_BRICKS = familyBuilder(Blocks.MUD_BRICKS)
            .fromManager(CaliberBlocks.MUD_BRICK)
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
            .stairs(Blocks.NETHER_BRICK_STAIRS)
            .wall(Blocks.NETHER_BRICK_WALL)
            .getFamily();
    public static final ModBlockFamily RED_NETHER_BRICKS = familyBuilder(Blocks.RED_NETHER_BRICKS)
            .fromManager(CaliberBlocks.RED_NETHER_BRICK)
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
            .stairs(Blocks.PRISMARINE_STAIRS)
            .wall(Blocks.PRISMARINE_WALL)
            .getFamily();
    public static final ModBlockFamily PRISMARINE_BRICKS = familyBuilder(Blocks.PRISMARINE_BRICKS)
            .fromManager(CaliberBlocks.PRISMARINE_BRICK)
            .stairs(Blocks.PRISMARINE_BRICK_STAIRS)
            .getFamily();
    public static final ModBlockFamily DARK_PRISMARINE = familyBuilder(Blocks.DARK_PRISMARINE)
            .fromManager(CaliberBlocks.DARK_PRISMARINE)
            .stairs(Blocks.DARK_PRISMARINE_STAIRS)
            .getFamily();
    
    /* Purpur */
    public static final ModBlockFamily PURPUR = familyBuilder(Blocks.PURPUR_BLOCK)
            .fromManager(CaliberBlocks.PURPUR)
            .getFamily();

    /* Quartz */
    public static final ModBlockFamily QUARTZ = familyBuilder(Blocks.QUARTZ_BLOCK)
            .fromManager(CaliberBlocks.QUARTZ)
            .stairs(Blocks.QUARTZ_STAIRS)
            .getFamily();
    public static final ModBlockFamily QUARTZ_BRICKS = familyBuilder(Blocks.QUARTZ_BRICKS)
            .fromManager(CaliberBlocks.QUARTZ_BRICKS)
            .getFamily();
    public static final ModBlockFamily SMOOTH_QUARTZ = familyBuilder(Blocks.SMOOTH_QUARTZ)
            .fromManager(CaliberBlocks.SMOOTH_QUARTZ)
            .stairs(Blocks.SMOOTH_QUARTZ_STAIRS)
            .getFamily();

    /* Sandstone */
    public static final ModBlockFamily RED_SANDSTONE = familyBuilder(Blocks.RED_SANDSTONE)
            .fromManager(CaliberBlocks.RED_SANDSTONE)
            .stairs(Blocks.RED_SANDSTONE_STAIRS)
            .wall(Blocks.RED_SANDSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily SANDSTONE = familyBuilder(Blocks.SANDSTONE)
            .fromManager(CaliberBlocks.SANDSTONE)
            .stairs(Blocks.SANDSTONE_STAIRS)
            .wall(Blocks.SANDSTONE_WALL)
            .getFamily();
    public static final ModBlockFamily SMOOTH_RED_SANDSTONE = familyBuilder(Blocks.SMOOTH_RED_SANDSTONE)
            .fromManager(CaliberBlocks.SMOOTH_RED_SANDSTONE)
            .stairs(Blocks.SMOOTH_RED_SANDSTONE_STAIRS)
            .getFamily();
    public static final ModBlockFamily SMOOTH_SANDSTONE = familyBuilder(Blocks.SMOOTH_SANDSTONE)
            .fromManager(CaliberBlocks.SMOOTH_SANDSTONE)
            .stairs(Blocks.SMOOTH_SANDSTONE_STAIRS)
            .getFamily();
    public static final ModBlockFamily CUT_RED_SANDSTONE = familyBuilder(Blocks.CUT_RED_SANDSTONE)
            .fromManager(CaliberBlocks.CUT_RED_SANDSTONE)
            .getFamily();
    public static final ModBlockFamily CUT_SANDSTONE = familyBuilder(Blocks.CUT_SANDSTONE)
            .fromManager(CaliberBlocks.CUT_SANDSTONE)
            .getFamily();


    /* Stone */
    public static final ModBlockFamily STONE = familyBuilder(Blocks.STONE)
            .fromManager(CaliberBlocks.STONE)
            .button(Blocks.STONE_BUTTON)
            .pressurePlate(Blocks.STONE_PRESSURE_PLATE)
            .stairs(Blocks.STONE_STAIRS)
            .getFamily();
    public static final ModBlockFamily COBBLESTONE = familyBuilder(Blocks.COBBLESTONE)
            .fromManager(CaliberBlocks.COBBLESTONE)
            .stairs(Blocks.COBBLESTONE_STAIRS)
            .wall(Blocks.COBBLESTONE_WALL)
            .getFamily();
    public static final ModBlockFamily STONE_BRICKS = familyBuilder(Blocks.STONE_BRICKS)
            .fromManager(CaliberBlocks.STONE_BRICK)
            .stairs(Blocks.STONE_BRICK_STAIRS)
            .wall(Blocks.STONE_BRICK_WALL)
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
            .fence(Blocks.ACACIA_FENCE)
            .fenceGate(Blocks.ACACIA_FENCE_GATE)
            .door(Blocks.ACACIA_DOOR)
            .trapdoor(Blocks.ACACIA_TRAPDOOR)
            .stairs(Blocks.ACACIA_STAIRS)
            .pressurePlate(Blocks.ACACIA_PRESSURE_PLATE)
            .button(Blocks.ACACIA_BUTTON)
            .sign(Blocks.ACACIA_SIGN, Blocks.ACACIA_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily BAMBOO_PLANKS = familyBuilder(Blocks.BAMBOO_PLANKS)
            .fromManager(CaliberBlocks.BAMBOO)
            .fence(Blocks.BAMBOO_FENCE)
            .fenceGate(Blocks.BAMBOO_FENCE_GATE)
            .door(Blocks.BAMBOO_DOOR)
            .trapdoor(Blocks.BAMBOO_TRAPDOOR)
            .stairs(Blocks.BAMBOO_STAIRS)
            .pressurePlate(Blocks.BAMBOO_PRESSURE_PLATE)
            .button(Blocks.BAMBOO_BUTTON)
            .sign(Blocks.BAMBOO_SIGN, Blocks.BAMBOO_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily BAMBOO_MOSAIC = familyBuilder(Blocks.BAMBOO_MOSAIC)
            .fromManager(CaliberBlocks.BAMBOO_MOSAIC)
            .stairs(Blocks.BAMBOO_MOSAIC_STAIRS)
            .getFamily();
    public static final ModBlockFamily BIRCH_PLANKS = familyBuilder(Blocks.BIRCH_PLANKS)
            .fromManager(CaliberBlocks.BIRCH)
            .fence(Blocks.BIRCH_FENCE)
            .fenceGate(Blocks.BIRCH_FENCE_GATE)
            .door(Blocks.BIRCH_DOOR)
            .trapdoor(Blocks.BIRCH_TRAPDOOR)
            .stairs(Blocks.BIRCH_STAIRS)
            .pressurePlate(Blocks.BIRCH_PRESSURE_PLATE)
            .button(Blocks.BIRCH_BUTTON)
            .sign(Blocks.BIRCH_SIGN, Blocks.BIRCH_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily CHERRY_PLANKS = familyBuilder(Blocks.CHERRY_PLANKS)
            .fromManager(CaliberBlocks.CHERRY)
            .fence(Blocks.CHERRY_FENCE)
            .fenceGate(Blocks.CHERRY_FENCE_GATE)
            .door(Blocks.CHERRY_DOOR)
            .trapdoor(Blocks.CHERRY_TRAPDOOR)
            .stairs(Blocks.CHERRY_STAIRS)
            .pressurePlate(Blocks.CHERRY_PRESSURE_PLATE)
            .button(Blocks.CHERRY_BUTTON)
            .sign(Blocks.CHERRY_SIGN, Blocks.CHERRY_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily DARK_OAK_PLANKS = familyBuilder(Blocks.DARK_OAK_PLANKS)
            .fromManager(CaliberBlocks.DARK_OAK)
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
            .fromManager(CaliberBlocks.JUNGLE)
            .fence(Blocks.JUNGLE_FENCE)
            .fenceGate(Blocks.JUNGLE_FENCE_GATE)
            .door(Blocks.JUNGLE_DOOR)
            .trapdoor(Blocks.JUNGLE_TRAPDOOR)
            .stairs(Blocks.JUNGLE_STAIRS)
            .pressurePlate(Blocks.JUNGLE_PRESSURE_PLATE)
            .button(Blocks.JUNGLE_BUTTON)
            .sign(Blocks.JUNGLE_SIGN, Blocks.JUNGLE_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily MANGROVE_PLANKS = familyBuilder(Blocks.MANGROVE_PLANKS)
            .fromManager(CaliberBlocks.MANGROVE)
            .fence(Blocks.MANGROVE_FENCE)
            .fenceGate(Blocks.MANGROVE_FENCE_GATE)
            .door(Blocks.MANGROVE_DOOR)
            .trapdoor(Blocks.MANGROVE_TRAPDOOR)
            .stairs(Blocks.MANGROVE_STAIRS)
            .pressurePlate(Blocks.MANGROVE_PRESSURE_PLATE)
            .button(Blocks.MANGROVE_BUTTON)
            .sign(Blocks.MANGROVE_SIGN, Blocks.MANGROVE_WALL_SIGN)
            .getFamily();
    public static final ModBlockFamily OAK_PLANKS = familyBuilder(Blocks.OAK_PLANKS)
            .fromManager(CaliberBlocks.OAK)
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
            .fromManager(CaliberBlocks.SPRUCE)
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
            .fromManager(CaliberBlocks.CRIMSON)
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
            .fromManager(CaliberBlocks.WARPED)
            .fence(Blocks.WARPED_FENCE)
            .fenceGate(Blocks.WARPED_FENCE_GATE)
            .door(Blocks.WARPED_DOOR)
            .trapdoor(Blocks.WARPED_TRAPDOOR)
            .stairs(Blocks.WARPED_STAIRS)
            .pressurePlate(Blocks.WARPED_PRESSURE_PLATE)
            .button(Blocks.WARPED_BUTTON)
            .sign(Blocks.WARPED_SIGN, Blocks.WARPED_WALL_SIGN)
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
}