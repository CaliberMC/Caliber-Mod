package com.calibermc.caliber.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Caliber.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BRONZE_BLOCK.get());

        simpleBlock(ModBlocks.TIN_BLOCK.get());
        simpleBlock(ModBlocks.RAW_TIN_BLOCK.get());
        simpleBlock(ModBlocks.TIN_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_TIN_ORE.get());

        simpleBlock(ModBlocks.SILVER_BLOCK.get());
        simpleBlock(ModBlocks.RAW_SILVER_BLOCK.get());
        simpleBlock(ModBlocks.SILVER_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_SILVER_ORE.get());

        wallBlock((WallBlock) ModBlocks.POLISHED_ANDESITE_WALL.get(), blockTexture(Blocks.POLISHED_ANDESITE));

        wallBlock((WallBlock) ModBlocks.POLISHED_DIORITE_WALL.get(), blockTexture(Blocks.POLISHED_DIORITE));

        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_WALL.get(), blockTexture(Blocks.DEEPSLATE));

        simpleBlock(ModBlocks.BLACK_GRANITE.get());
        simpleBlock(ModBlocks.BROWN_GRANITE.get());
        simpleBlock(ModBlocks.PINK_GRANITE.get());
        simpleBlock(ModBlocks.GRAY_GRANITE.get());
        simpleBlock(ModBlocks.WHITE_GRANITE.get());
        stairsBlock((StairBlock) ModBlocks.BLACK_GRANITE_STAIRS.get(), blockTexture(ModBlocks.BLACK_GRANITE.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_GRANITE_STAIRS.get(), blockTexture(ModBlocks.BROWN_GRANITE.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_GRANITE_STAIRS.get(), blockTexture(ModBlocks.GRAY_GRANITE.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_GRANITE_STAIRS.get(), blockTexture(ModBlocks.PINK_GRANITE.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_GRANITE_STAIRS.get(), blockTexture(ModBlocks.WHITE_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_GRANITE_WALL.get(), blockTexture(ModBlocks.BLACK_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_GRANITE_WALL.get(), blockTexture(ModBlocks.BROWN_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_GRANITE_WALL.get(), blockTexture(ModBlocks.GRAY_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.PINK_GRANITE_WALL.get(), blockTexture(ModBlocks.PINK_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_GRANITE_WALL.get(), blockTexture(ModBlocks.WHITE_GRANITE.get()));

        simpleBlock(ModBlocks.POLISHED_BLACK_GRANITE.get());
        simpleBlock(ModBlocks.POLISHED_BROWN_GRANITE.get());
        simpleBlock(ModBlocks.POLISHED_GRAY_GRANITE.get());
        simpleBlock(ModBlocks.POLISHED_PINK_GRANITE.get());
        simpleBlock(ModBlocks.POLISHED_WHITE_GRANITE.get());
        stairsBlock((StairBlock) ModBlocks.POLISHED_BLACK_GRANITE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_BLACK_GRANITE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_BROWN_GRANITE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_BROWN_GRANITE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_GRAY_GRANITE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_GRAY_GRANITE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_PINK_GRANITE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_PINK_GRANITE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_WHITE_GRANITE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_WHITE_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_BLACK_GRANITE_WALL.get(), blockTexture(ModBlocks.POLISHED_BLACK_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_BROWN_GRANITE_WALL.get(), blockTexture(ModBlocks.POLISHED_BROWN_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_GRAY_GRANITE_WALL.get(), blockTexture(ModBlocks.POLISHED_GRAY_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_PINK_GRANITE_WALL.get(), blockTexture(ModBlocks.POLISHED_PINK_GRANITE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_RED_GRANITE_WALL.get(), blockTexture(Blocks.GRANITE));
        wallBlock((WallBlock) ModBlocks.POLISHED_WHITE_GRANITE_WALL.get(), blockTexture(ModBlocks.POLISHED_WHITE_GRANITE.get()));

        simpleBlock(ModBlocks.DARK_LIMESTONE.get());
        simpleBlock(ModBlocks.LIGHT_LIMESTONE.get());
        simpleBlock(ModBlocks.PINK_LIMESTONE.get());
        simpleBlock(ModBlocks.TAN_LIMESTONE.get());
        stairsBlock((StairBlock) ModBlocks.DARK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.DARK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.PINK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.TAN_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.TAN_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.DARK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.DARK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_LIMESTONE_WALL.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.LIMESTONE_WALL.get(), blockTexture(Blocks.STONE));
        wallBlock((WallBlock) ModBlocks.PINK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.PINK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.TAN_LIMESTONE_WALL.get(), blockTexture(ModBlocks.TAN_LIMESTONE.get()));
        buttonBlock((ButtonBlock)ModBlocks.DARK_LIMESTONE_BUTTON.get(), blockTexture(ModBlocks.DARK_LIMESTONE.get()));
        buttonBlock((ButtonBlock)ModBlocks.LIGHT_LIMESTONE_BUTTON.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE.get()));
        buttonBlock((ButtonBlock)ModBlocks.PINK_LIMESTONE_BUTTON.get(), blockTexture(ModBlocks.PINK_LIMESTONE.get()));
        buttonBlock((ButtonBlock)ModBlocks.TAN_LIMESTONE_BUTTON.get(), blockTexture(ModBlocks.TAN_LIMESTONE.get()));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DARK_LIMESTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.DARK_LIMESTONE.get()));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIGHT_LIMESTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE.get()));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PINK_LIMESTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PINK_LIMESTONE.get()));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.TAN_LIMESTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.TAN_LIMESTONE.get()));

        simpleBlock(ModBlocks.COBBLED_DARK_LIMESTONE.get());
        simpleBlock(ModBlocks.COBBLED_LIGHT_LIMESTONE.get());
        simpleBlock(ModBlocks.COBBLED_PINK_LIMESTONE.get());
        simpleBlock(ModBlocks.COBBLED_TAN_LIMESTONE.get());
        stairsBlock((StairBlock) ModBlocks.COBBLED_DARK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_DARK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLED_LIGHT_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLED_PINK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_PINK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLED_TAN_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_TAN_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.COBBLED_DARK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_DARK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.COBBLED_LIGHT_LIMESTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.COBBLED_PINK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_PINK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.COBBLED_TAN_LIMESTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_TAN_LIMESTONE.get()));

        simpleBlock(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE.get());
        simpleBlock(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE.get());
        simpleBlock(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE.get());
        simpleBlock(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE.get());
        stairsBlock((StairBlock) ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_WALL.get(), blockTexture(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_WALL.get(), blockTexture(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE.get()));

        simpleBlock(ModBlocks.DARK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.LIGHT_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.PINK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.TAN_LIMESTONE_BRICKS.get());
        stairsBlock((StairBlock) ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DARK_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.TAN_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.DARK_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.DARK_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PINK_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.PINK_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.TAN_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.TAN_LIMESTONE_BRICKS.get()));

        simpleBlock(ModBlocks.MOSSY_DARK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.MOSSY_PINK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.MOSSY_TAN_LIMESTONE_BRICKS.get());
        stairsBlock((StairBlock) ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_DARK_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_PINK_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_TAN_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_DARK_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_PINK_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_TAN_LIMESTONE_BRICKS.get()));


        simpleBlock(ModBlocks.CRACKED_DARK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CRACKED_PINK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CRACKED_TAN_LIMESTONE_BRICKS.get());

        simpleBlock(ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS.get());

        simpleBlock(ModBlocks.SMOOTH_DARK_LIMESTONE.get());
        simpleBlock(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get());
        simpleBlock(ModBlocks.SMOOTH_PINK_LIMESTONE.get());
        simpleBlock(ModBlocks.SMOOTH_TAN_LIMESTONE.get());
        stairsBlock((StairBlock) ModBlocks.SMOOTH_DARK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.SMOOTH_DARK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.SMOOTH_LIGHT_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.SMOOTH_LIMESTONE_STAIRS.get(), blockTexture(Blocks.SMOOTH_STONE));
        stairsBlock((StairBlock) ModBlocks.SMOOTH_PINK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.SMOOTH_PINK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.SMOOTH_TAN_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.SMOOTH_TAN_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.SMOOTH_DARK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.SMOOTH_DARK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.SMOOTH_LIGHT_LIMESTONE_WALL.get(), blockTexture(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.SMOOTH_LIMESTONE_WALL.get(), blockTexture(Blocks.SMOOTH_STONE));
        wallBlock((WallBlock) ModBlocks.SMOOTH_PINK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.SMOOTH_PINK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.SMOOTH_TAN_LIMESTONE_WALL.get(), blockTexture(ModBlocks.SMOOTH_TAN_LIMESTONE.get()));
        
        simpleBlock(ModBlocks.BLACK_MARBLE.get());
        simpleBlock(ModBlocks.GRAY_MARBLE.get());
        simpleBlock(ModBlocks.PINK_MARBLE.get());
        simpleBlock(ModBlocks.RED_MARBLE.get());
        simpleBlock(ModBlocks.WHITE_MARBLE.get());
        stairsBlock((StairBlock) ModBlocks.BLACK_MARBLE_STAIRS.get(), blockTexture(ModBlocks.BLACK_MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_MARBLE_STAIRS.get(), blockTexture(ModBlocks.GRAY_MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_MARBLE_STAIRS.get(), blockTexture(ModBlocks.PINK_MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.RED_MARBLE_STAIRS.get(), blockTexture(ModBlocks.RED_MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_MARBLE_STAIRS.get(), blockTexture(ModBlocks.WHITE_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_MARBLE_WALL.get(), blockTexture(ModBlocks.BLACK_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_MARBLE_WALL.get(), blockTexture(ModBlocks.GRAY_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.PINK_MARBLE_WALL.get(), blockTexture(ModBlocks.PINK_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.RED_MARBLE_WALL.get(), blockTexture(ModBlocks.RED_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_MARBLE_WALL.get(), blockTexture(ModBlocks.WHITE_MARBLE.get()));

        simpleBlock(ModBlocks.POLISHED_BLACK_MARBLE.get());
        simpleBlock(ModBlocks.POLISHED_GRAY_MARBLE.get());
        simpleBlock(ModBlocks.POLISHED_PINK_MARBLE.get());
        simpleBlock(ModBlocks.POLISHED_RED_MARBLE.get());
        simpleBlock(ModBlocks.POLISHED_WHITE_MARBLE.get());
        stairsBlock((StairBlock) ModBlocks.POLISHED_BLACK_MARBLE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_BLACK_MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_GRAY_MARBLE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_GRAY_MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_PINK_MARBLE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_PINK_MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_RED_MARBLE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_RED_MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_WHITE_MARBLE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_WHITE_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_BLACK_MARBLE_WALL.get(), blockTexture(ModBlocks.POLISHED_BLACK_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_GRAY_MARBLE_WALL.get(), blockTexture(ModBlocks.POLISHED_GRAY_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_PINK_MARBLE_WALL.get(), blockTexture(ModBlocks.POLISHED_PINK_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_RED_MARBLE_WALL.get(), blockTexture(ModBlocks.POLISHED_RED_MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_WHITE_MARBLE_WALL.get(), blockTexture(ModBlocks.POLISHED_WHITE_MARBLE.get()));

        simpleBlock(ModBlocks.SMOOTH_BROWN_SANDSTONE.get());
        simpleBlock(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get());
        wallBlock((WallBlock) ModBlocks.BROWN_SANDSTONE_WALL.get(), blockTexture(ModBlocks.BROWN_SANDSTONE.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_SANDSTONE_WALL.get(), blockTexture(ModBlocks.ORANGE_SANDSTONE.get()));

        simpleBlock(ModBlocks.BLACK_SAND.get());
        simpleBlock(ModBlocks.BROWN_SAND.get());
        simpleBlock(ModBlocks.ORANGE_SAND.get());
        simpleBlock(ModBlocks.WHITE_SAND.get());

        wallBlock((WallBlock) ModBlocks.ACACIA_WALL.get(), blockTexture(Blocks.ACACIA_PLANKS));
        wallBlock((WallBlock) ModBlocks.BIRCH_WALL.get(), blockTexture(Blocks.BIRCH_PLANKS));
        wallBlock((WallBlock) ModBlocks.DARK_OAK_WALL.get(), blockTexture(Blocks.DARK_OAK_PLANKS));
        wallBlock((WallBlock) ModBlocks.JUNGLE_WALL.get(), blockTexture(Blocks.JUNGLE_PLANKS));
        wallBlock((WallBlock) ModBlocks.OAK_WALL.get(), blockTexture(Blocks.OAK_PLANKS));
        wallBlock((WallBlock) ModBlocks.SPRUCE_WALL.get(), blockTexture(Blocks.SPRUCE_PLANKS));
        wallBlock((WallBlock) ModBlocks.STRIPPED_ACACIA_WALL.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG));
        wallBlock((WallBlock) ModBlocks.STRIPPED_BIRCH_WALL.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG));
        wallBlock((WallBlock) ModBlocks.STRIPPED_DARK_OAK_WALL.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));
        wallBlock((WallBlock) ModBlocks.STRIPPED_JUNGLE_WALL.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));
        wallBlock((WallBlock) ModBlocks.STRIPPED_OAK_WALL.get(), blockTexture(Blocks.STRIPPED_OAK_LOG));
        wallBlock((WallBlock) ModBlocks.STRIPPED_SPRUCE_WALL.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));
        stairsBlock((StairBlock) ModBlocks.STRIPPED_ACACIA_STAIRS.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG));
        stairsBlock((StairBlock) ModBlocks.STRIPPED_BIRCH_STAIRS.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG));
        stairsBlock((StairBlock) ModBlocks.STRIPPED_DARK_OAK_STAIRS.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));
        stairsBlock((StairBlock) ModBlocks.STRIPPED_JUNGLE_STAIRS.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));
        stairsBlock((StairBlock) ModBlocks.STRIPPED_OAK_STAIRS.get(), blockTexture(Blocks.STRIPPED_OAK_LOG));
        stairsBlock((StairBlock) ModBlocks.STRIPPED_SPRUCE_STAIRS.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));
        simpleBlock(ModBlocks.STAINED_ACACIA_WOOD.get());
        simpleBlock(ModBlocks.STAINED_BIRCH_WOOD.get());
        simpleBlock(ModBlocks.STAINED_DARK_OAK_WOOD.get());
        simpleBlock(ModBlocks.STAINED_JUNGLE_WOOD.get());
        simpleBlock(ModBlocks.STAINED_OAK_WOOD.get());
        simpleBlock(ModBlocks.STAINED_SPRUCE_WOOD.get());
        wallBlock((WallBlock) ModBlocks.STAINED_ACACIA_WALL.get(), blockTexture(ModBlocks.STAINED_ACACIA_WOOD.get()));
        wallBlock((WallBlock) ModBlocks.STAINED_BIRCH_WALL.get(), blockTexture(ModBlocks.STAINED_BIRCH_WOOD.get()));
        wallBlock((WallBlock) ModBlocks.STAINED_DARK_OAK_WALL.get(), blockTexture(ModBlocks.STAINED_DARK_OAK_WOOD.get()));
        wallBlock((WallBlock) ModBlocks.STAINED_JUNGLE_WALL.get(), blockTexture(ModBlocks.STAINED_JUNGLE_WOOD.get()));
        wallBlock((WallBlock) ModBlocks.STAINED_OAK_WALL.get(), blockTexture(ModBlocks.STAINED_OAK_WOOD.get()));
        wallBlock((WallBlock) ModBlocks.STAINED_SPRUCE_WALL.get(), blockTexture(ModBlocks.STAINED_SPRUCE_WOOD.get()));
        stairsBlock((StairBlock) ModBlocks.STAINED_ACACIA_STAIRS.get(), blockTexture(ModBlocks.STAINED_ACACIA_WOOD.get()));
        stairsBlock((StairBlock) ModBlocks.STAINED_BIRCH_STAIRS.get(), blockTexture(ModBlocks.STAINED_BIRCH_WOOD.get()));
        stairsBlock((StairBlock) ModBlocks.STAINED_DARK_OAK_STAIRS.get(), blockTexture(ModBlocks.STAINED_DARK_OAK_WOOD.get()));
        stairsBlock((StairBlock) ModBlocks.STAINED_JUNGLE_STAIRS.get(), blockTexture(ModBlocks.STAINED_JUNGLE_WOOD.get()));
        stairsBlock((StairBlock) ModBlocks.STAINED_OAK_STAIRS.get(), blockTexture(ModBlocks.STAINED_OAK_WOOD.get()));
        stairsBlock((StairBlock) ModBlocks.STAINED_SPRUCE_STAIRS.get(), blockTexture(ModBlocks.STAINED_SPRUCE_WOOD.get()));

        /* PLASTER */
        simpleBlock(ModBlocks.BEIGE_PLASTER.get());
        simpleBlock(ModBlocks.BROWN_PLASTER.get());
        simpleBlock(ModBlocks.OCHRE_PLASTER.get());
        simpleBlock(ModBlocks.TAN_PLASTER.get());
        simpleBlock(ModBlocks.WHITE_PLASTER.get());
        stairsBlock((StairBlock) ModBlocks.BEIGE_PLASTER_STAIRS.get(), blockTexture(ModBlocks.BEIGE_PLASTER.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_PLASTER_STAIRS.get(), blockTexture(ModBlocks.BROWN_PLASTER.get()));
        stairsBlock((StairBlock) ModBlocks.OCHRE_PLASTER_STAIRS.get(), blockTexture(ModBlocks.OCHRE_PLASTER.get()));
        stairsBlock((StairBlock) ModBlocks.TAN_PLASTER_STAIRS.get(), blockTexture(ModBlocks.TAN_PLASTER.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_PLASTER_STAIRS.get(), blockTexture(ModBlocks.WHITE_PLASTER.get()));
        wallBlock((WallBlock) ModBlocks.BEIGE_PLASTER_WALL.get(), blockTexture(ModBlocks.BEIGE_PLASTER.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_PLASTER_WALL.get(), blockTexture(ModBlocks.BROWN_PLASTER.get()));
        wallBlock((WallBlock) ModBlocks.OCHRE_PLASTER_WALL.get(), blockTexture(ModBlocks.OCHRE_PLASTER.get()));
        wallBlock((WallBlock) ModBlocks.TAN_PLASTER_WALL.get(), blockTexture(ModBlocks.TAN_PLASTER.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_PLASTER_WALL.get(), blockTexture(ModBlocks.WHITE_PLASTER.get()));

        /* Plaster Powder */
        simpleBlock(ModBlocks.BEIGE_PLASTER_POWDER.get());
        simpleBlock(ModBlocks.BROWN_PLASTER_POWDER.get());
        simpleBlock(ModBlocks.OCHRE_PLASTER_POWDER.get());
        simpleBlock(ModBlocks.TAN_PLASTER_POWDER.get());
        simpleBlock(ModBlocks.WHITE_PLASTER_POWDER.get());

        /* TUDOR BLOCKS */
        /* Beige Plaster - Half-Timbered */
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_cross", modLoc("block/tudor_acacia_beige_plaster_cross"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_down", modLoc("block/tudor_acacia_beige_plaster_down"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_UP.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_up", modLoc("block/tudor_acacia_beige_plaster_up"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_left", modLoc("block/tudor_acacia_beige_plaster_left"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_right", modLoc("block/tudor_acacia_beige_plaster_right"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_horizontal_1", modLoc("block/tudor_acacia_beige_plaster_horizontal_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_horizontal_2", modLoc("block/tudor_acacia_beige_plaster_horizontal_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_vertical_1", modLoc("block/tudor_acacia_beige_plaster_vertical_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_acacia_beige_plaster_vertical_2", modLoc("block/tudor_acacia_beige_plaster_vertical_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_birch_beige_plaster_cross", modLoc("block/tudor_birch_beige_plaster_cross"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_birch_beige_plaster_down", modLoc("block/tudor_birch_beige_plaster_down"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_UP.get(), models().cubeBottomTop("tudor_birch_beige_plaster_up", modLoc("block/tudor_birch_beige_plaster_up"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_birch_beige_plaster_left", modLoc("block/tudor_birch_beige_plaster_left"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_birch_beige_plaster_right", modLoc("block/tudor_birch_beige_plaster_right"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_birch_beige_plaster_horizontal_1", modLoc("block/tudor_birch_beige_plaster_horizontal_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_birch_beige_plaster_horizontal_2", modLoc("block/tudor_birch_beige_plaster_horizontal_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_birch_beige_plaster_vertical_1", modLoc("block/tudor_birch_beige_plaster_vertical_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_birch_beige_plaster_vertical_2", modLoc("block/tudor_birch_beige_plaster_vertical_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_cross", modLoc("block/tudor_dark_oak_beige_plaster_cross"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_down", modLoc("block/tudor_dark_oak_beige_plaster_down"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_UP.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_up", modLoc("block/tudor_dark_oak_beige_plaster_up"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_left", modLoc("block/tudor_dark_oak_beige_plaster_left"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_right", modLoc("block/tudor_dark_oak_beige_plaster_right"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_horizontal_1", modLoc("block/tudor_dark_oak_beige_plaster_horizontal_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_horizontal_2", modLoc("block/tudor_dark_oak_beige_plaster_horizontal_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_vertical_1", modLoc("block/tudor_dark_oak_beige_plaster_vertical_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_dark_oak_beige_plaster_vertical_2", modLoc("block/tudor_dark_oak_beige_plaster_vertical_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_cross", modLoc("block/tudor_jungle_beige_plaster_cross"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_down", modLoc("block/tudor_jungle_beige_plaster_down"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_UP.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_up", modLoc("block/tudor_jungle_beige_plaster_up"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_left", modLoc("block/tudor_jungle_beige_plaster_left"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_right", modLoc("block/tudor_jungle_beige_plaster_right"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_horizontal_1", modLoc("block/tudor_jungle_beige_plaster_horizontal_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_horizontal_2", modLoc("block/tudor_jungle_beige_plaster_horizontal_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_vertical_1", modLoc("block/tudor_jungle_beige_plaster_vertical_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_jungle_beige_plaster_vertical_2", modLoc("block/tudor_jungle_beige_plaster_vertical_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_oak_beige_plaster_cross", modLoc("block/tudor_oak_beige_plaster_cross"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_oak_beige_plaster_down", modLoc("block/tudor_oak_beige_plaster_down"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_UP.get(), models().cubeBottomTop("tudor_oak_beige_plaster_up", modLoc("block/tudor_oak_beige_plaster_up"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_oak_beige_plaster_left", modLoc("block/tudor_oak_beige_plaster_left"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_oak_beige_plaster_right", modLoc("block/tudor_oak_beige_plaster_right"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_oak_beige_plaster_horizontal_1", modLoc("block/tudor_oak_beige_plaster_horizontal_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_oak_beige_plaster_horizontal_2", modLoc("block/tudor_oak_beige_plaster_horizontal_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_oak_beige_plaster_vertical_1", modLoc("block/tudor_oak_beige_plaster_vertical_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_oak_beige_plaster_vertical_2", modLoc("block/tudor_oak_beige_plaster_vertical_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_cross", modLoc("block/tudor_spruce_beige_plaster_cross"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_down", modLoc("block/tudor_spruce_beige_plaster_down"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_UP.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_up", modLoc("block/tudor_spruce_beige_plaster_up"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_left", modLoc("block/tudor_spruce_beige_plaster_left"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_right", modLoc("block/tudor_spruce_beige_plaster_right"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_horizontal_1", modLoc("block/tudor_spruce_beige_plaster_horizontal_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_horizontal_2", modLoc("block/tudor_spruce_beige_plaster_horizontal_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_vertical_1", modLoc("block/tudor_spruce_beige_plaster_vertical_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_spruce_beige_plaster_vertical_2", modLoc("block/tudor_spruce_beige_plaster_vertical_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));

        /* Brown Plaster - Half-Timbered */
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_cross", modLoc("block/tudor_acacia_brown_plaster_cross"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_down", modLoc("block/tudor_acacia_brown_plaster_down"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_UP.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_up", modLoc("block/tudor_acacia_brown_plaster_up"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_left", modLoc("block/tudor_acacia_brown_plaster_left"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_right", modLoc("block/tudor_acacia_brown_plaster_right"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_horizontal_1", modLoc("block/tudor_acacia_brown_plaster_horizontal_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_horizontal_2", modLoc("block/tudor_acacia_brown_plaster_horizontal_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_vertical_1", modLoc("block/tudor_acacia_brown_plaster_vertical_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_acacia_brown_plaster_vertical_2", modLoc("block/tudor_acacia_brown_plaster_vertical_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_birch_brown_plaster_cross", modLoc("block/tudor_birch_brown_plaster_cross"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_birch_brown_plaster_down", modLoc("block/tudor_birch_brown_plaster_down"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_UP.get(), models().cubeBottomTop("tudor_birch_brown_plaster_up", modLoc("block/tudor_birch_brown_plaster_up"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_birch_brown_plaster_left", modLoc("block/tudor_birch_brown_plaster_left"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_birch_brown_plaster_right", modLoc("block/tudor_birch_brown_plaster_right"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_birch_brown_plaster_horizontal_1", modLoc("block/tudor_birch_brown_plaster_horizontal_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_birch_brown_plaster_horizontal_2", modLoc("block/tudor_birch_brown_plaster_horizontal_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_birch_brown_plaster_vertical_1", modLoc("block/tudor_birch_brown_plaster_vertical_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_birch_brown_plaster_vertical_2", modLoc("block/tudor_birch_brown_plaster_vertical_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_cross", modLoc("block/tudor_dark_oak_brown_plaster_cross"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_down", modLoc("block/tudor_dark_oak_brown_plaster_down"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_UP.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_up", modLoc("block/tudor_dark_oak_brown_plaster_up"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_left", modLoc("block/tudor_dark_oak_brown_plaster_left"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_right", modLoc("block/tudor_dark_oak_brown_plaster_right"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_horizontal_1", modLoc("block/tudor_dark_oak_brown_plaster_horizontal_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_horizontal_2", modLoc("block/tudor_dark_oak_brown_plaster_horizontal_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_vertical_1", modLoc("block/tudor_dark_oak_brown_plaster_vertical_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_dark_oak_brown_plaster_vertical_2", modLoc("block/tudor_dark_oak_brown_plaster_vertical_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_cross", modLoc("block/tudor_jungle_brown_plaster_cross"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_down", modLoc("block/tudor_jungle_brown_plaster_down"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_UP.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_up", modLoc("block/tudor_jungle_brown_plaster_up"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_left", modLoc("block/tudor_jungle_brown_plaster_left"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_right", modLoc("block/tudor_jungle_brown_plaster_right"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_horizontal_1", modLoc("block/tudor_jungle_brown_plaster_horizontal_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_horizontal_2", modLoc("block/tudor_jungle_brown_plaster_horizontal_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_vertical_1", modLoc("block/tudor_jungle_brown_plaster_vertical_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_jungle_brown_plaster_vertical_2", modLoc("block/tudor_jungle_brown_plaster_vertical_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_oak_brown_plaster_cross", modLoc("block/tudor_oak_brown_plaster_cross"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_oak_brown_plaster_down", modLoc("block/tudor_oak_brown_plaster_down"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_UP.get(), models().cubeBottomTop("tudor_oak_brown_plaster_up", modLoc("block/tudor_oak_brown_plaster_up"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_oak_brown_plaster_left", modLoc("block/tudor_oak_brown_plaster_left"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_oak_brown_plaster_right", modLoc("block/tudor_oak_brown_plaster_right"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_oak_brown_plaster_horizontal_1", modLoc("block/tudor_oak_brown_plaster_horizontal_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_oak_brown_plaster_horizontal_2", modLoc("block/tudor_oak_brown_plaster_horizontal_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_oak_brown_plaster_vertical_1", modLoc("block/tudor_oak_brown_plaster_vertical_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_BROWN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_oak_brown_plaster_vertical_2", modLoc("block/tudor_oak_brown_plaster_vertical_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_cross", modLoc("block/tudor_spruce_brown_plaster_cross"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_down", modLoc("block/tudor_spruce_brown_plaster_down"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_UP.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_up", modLoc("block/tudor_spruce_brown_plaster_up"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_left", modLoc("block/tudor_spruce_brown_plaster_left"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_right", modLoc("block/tudor_spruce_brown_plaster_right"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_horizontal_1", modLoc("block/tudor_spruce_brown_plaster_horizontal_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_horizontal_2", modLoc("block/tudor_spruce_brown_plaster_horizontal_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_vertical_1", modLoc("block/tudor_spruce_brown_plaster_vertical_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_spruce_brown_plaster_vertical_2", modLoc("block/tudor_spruce_brown_plaster_vertical_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));

        /* Ochre Plaster - Half-Timbered */
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_cross", modLoc("block/tudor_acacia_ochre_plaster_cross"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_down", modLoc("block/tudor_acacia_ochre_plaster_down"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_UP.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_up", modLoc("block/tudor_acacia_ochre_plaster_up"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_left", modLoc("block/tudor_acacia_ochre_plaster_left"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_right", modLoc("block/tudor_acacia_ochre_plaster_right"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_horizontal_1", modLoc("block/tudor_acacia_ochre_plaster_horizontal_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_horizontal_2", modLoc("block/tudor_acacia_ochre_plaster_horizontal_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_vertical_1", modLoc("block/tudor_acacia_ochre_plaster_vertical_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_acacia_ochre_plaster_vertical_2", modLoc("block/tudor_acacia_ochre_plaster_vertical_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_cross", modLoc("block/tudor_birch_ochre_plaster_cross"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_down", modLoc("block/tudor_birch_ochre_plaster_down"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_UP.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_up", modLoc("block/tudor_birch_ochre_plaster_up"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_left", modLoc("block/tudor_birch_ochre_plaster_left"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_right", modLoc("block/tudor_birch_ochre_plaster_right"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_horizontal_1", modLoc("block/tudor_birch_ochre_plaster_horizontal_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_horizontal_2", modLoc("block/tudor_birch_ochre_plaster_horizontal_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_vertical_1", modLoc("block/tudor_birch_ochre_plaster_vertical_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_birch_ochre_plaster_vertical_2", modLoc("block/tudor_birch_ochre_plaster_vertical_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_cross", modLoc("block/tudor_dark_oak_ochre_plaster_cross"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_down", modLoc("block/tudor_dark_oak_ochre_plaster_down"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_UP.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_up", modLoc("block/tudor_dark_oak_ochre_plaster_up"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_left", modLoc("block/tudor_dark_oak_ochre_plaster_left"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_right", modLoc("block/tudor_dark_oak_ochre_plaster_right"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_horizontal_1", modLoc("block/tudor_dark_oak_ochre_plaster_horizontal_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_horizontal_2", modLoc("block/tudor_dark_oak_ochre_plaster_horizontal_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_vertical_1", modLoc("block/tudor_dark_oak_ochre_plaster_vertical_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_dark_oak_ochre_plaster_vertical_2", modLoc("block/tudor_dark_oak_ochre_plaster_vertical_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_cross", modLoc("block/tudor_jungle_ochre_plaster_cross"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_down", modLoc("block/tudor_jungle_ochre_plaster_down"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_UP.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_up", modLoc("block/tudor_jungle_ochre_plaster_up"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_left", modLoc("block/tudor_jungle_ochre_plaster_left"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_right", modLoc("block/tudor_jungle_ochre_plaster_right"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_horizontal_1", modLoc("block/tudor_jungle_ochre_plaster_horizontal_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_horizontal_2", modLoc("block/tudor_jungle_ochre_plaster_horizontal_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_vertical_1", modLoc("block/tudor_jungle_ochre_plaster_vertical_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_jungle_ochre_plaster_vertical_2", modLoc("block/tudor_jungle_ochre_plaster_vertical_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_cross", modLoc("block/tudor_oak_ochre_plaster_cross"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_down", modLoc("block/tudor_oak_ochre_plaster_down"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_UP.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_up", modLoc("block/tudor_oak_ochre_plaster_up"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_left", modLoc("block/tudor_oak_ochre_plaster_left"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_right", modLoc("block/tudor_oak_ochre_plaster_right"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_horizontal_1", modLoc("block/tudor_oak_ochre_plaster_horizontal_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_horizontal_2", modLoc("block/tudor_oak_ochre_plaster_horizontal_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_vertical_1", modLoc("block/tudor_oak_ochre_plaster_vertical_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_oak_ochre_plaster_vertical_2", modLoc("block/tudor_oak_ochre_plaster_vertical_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_cross", modLoc("block/tudor_spruce_ochre_plaster_cross"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_down", modLoc("block/tudor_spruce_ochre_plaster_down"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_UP.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_up", modLoc("block/tudor_spruce_ochre_plaster_up"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_left", modLoc("block/tudor_spruce_ochre_plaster_left"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_right", modLoc("block/tudor_spruce_ochre_plaster_right"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_horizontal_1", modLoc("block/tudor_spruce_ochre_plaster_horizontal_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_horizontal_2", modLoc("block/tudor_spruce_ochre_plaster_horizontal_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_vertical_1", modLoc("block/tudor_spruce_ochre_plaster_vertical_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_spruce_ochre_plaster_vertical_2", modLoc("block/tudor_spruce_ochre_plaster_vertical_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        
        /* Tan Plaster - Half-Timbered */
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_cross", modLoc("block/tudor_acacia_tan_plaster_cross"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_down", modLoc("block/tudor_acacia_tan_plaster_down"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_UP.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_up", modLoc("block/tudor_acacia_tan_plaster_up"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_left", modLoc("block/tudor_acacia_tan_plaster_left"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_right", modLoc("block/tudor_acacia_tan_plaster_right"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_horizontal_1", modLoc("block/tudor_acacia_tan_plaster_horizontal_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_horizontal_2", modLoc("block/tudor_acacia_tan_plaster_horizontal_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_vertical_1", modLoc("block/tudor_acacia_tan_plaster_vertical_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_acacia_tan_plaster_vertical_2", modLoc("block/tudor_acacia_tan_plaster_vertical_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_birch_tan_plaster_cross", modLoc("block/tudor_birch_tan_plaster_cross"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_birch_tan_plaster_down", modLoc("block/tudor_birch_tan_plaster_down"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_UP.get(), models().cubeBottomTop("tudor_birch_tan_plaster_up", modLoc("block/tudor_birch_tan_plaster_up"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_birch_tan_plaster_left", modLoc("block/tudor_birch_tan_plaster_left"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_birch_tan_plaster_right", modLoc("block/tudor_birch_tan_plaster_right"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_birch_tan_plaster_horizontal_1", modLoc("block/tudor_birch_tan_plaster_horizontal_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_birch_tan_plaster_horizontal_2", modLoc("block/tudor_birch_tan_plaster_horizontal_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_birch_tan_plaster_vertical_1", modLoc("block/tudor_birch_tan_plaster_vertical_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_birch_tan_plaster_vertical_2", modLoc("block/tudor_birch_tan_plaster_vertical_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_cross", modLoc("block/tudor_dark_oak_tan_plaster_cross"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_down", modLoc("block/tudor_dark_oak_tan_plaster_down"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_UP.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_up", modLoc("block/tudor_dark_oak_tan_plaster_up"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_left", modLoc("block/tudor_dark_oak_tan_plaster_left"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_right", modLoc("block/tudor_dark_oak_tan_plaster_right"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_horizontal_1", modLoc("block/tudor_dark_oak_tan_plaster_horizontal_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_horizontal_2", modLoc("block/tudor_dark_oak_tan_plaster_horizontal_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_vertical_1", modLoc("block/tudor_dark_oak_tan_plaster_vertical_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_dark_oak_tan_plaster_vertical_2", modLoc("block/tudor_dark_oak_tan_plaster_vertical_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_cross", modLoc("block/tudor_jungle_tan_plaster_cross"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_down", modLoc("block/tudor_jungle_tan_plaster_down"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_UP.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_up", modLoc("block/tudor_jungle_tan_plaster_up"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_left", modLoc("block/tudor_jungle_tan_plaster_left"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_right", modLoc("block/tudor_jungle_tan_plaster_right"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_horizontal_1", modLoc("block/tudor_jungle_tan_plaster_horizontal_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_horizontal_2", modLoc("block/tudor_jungle_tan_plaster_horizontal_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_vertical_1", modLoc("block/tudor_jungle_tan_plaster_vertical_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_jungle_tan_plaster_vertical_2", modLoc("block/tudor_jungle_tan_plaster_vertical_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_oak_tan_plaster_cross", modLoc("block/tudor_oak_tan_plaster_cross"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_oak_tan_plaster_down", modLoc("block/tudor_oak_tan_plaster_down"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_UP.get(), models().cubeBottomTop("tudor_oak_tan_plaster_up", modLoc("block/tudor_oak_tan_plaster_up"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_oak_tan_plaster_left", modLoc("block/tudor_oak_tan_plaster_left"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_oak_tan_plaster_right", modLoc("block/tudor_oak_tan_plaster_right"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_oak_tan_plaster_horizontal_1", modLoc("block/tudor_oak_tan_plaster_horizontal_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_oak_tan_plaster_horizontal_2", modLoc("block/tudor_oak_tan_plaster_horizontal_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_oak_tan_plaster_vertical_1", modLoc("block/tudor_oak_tan_plaster_vertical_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_TAN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_oak_tan_plaster_vertical_2", modLoc("block/tudor_oak_tan_plaster_vertical_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_cross", modLoc("block/tudor_spruce_tan_plaster_cross"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_down", modLoc("block/tudor_spruce_tan_plaster_down"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_UP.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_up", modLoc("block/tudor_spruce_tan_plaster_up"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_left", modLoc("block/tudor_spruce_tan_plaster_left"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_right", modLoc("block/tudor_spruce_tan_plaster_right"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_horizontal_1", modLoc("block/tudor_spruce_tan_plaster_horizontal_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_horizontal_2", modLoc("block/tudor_spruce_tan_plaster_horizontal_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_vertical_1", modLoc("block/tudor_spruce_tan_plaster_vertical_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_spruce_tan_plaster_vertical_2", modLoc("block/tudor_spruce_tan_plaster_vertical_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));

        /* White Plaster - Half-Timbered */
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_acacia_white_plaster_cross", modLoc("block/tudor_acacia_white_plaster_cross"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_acacia_white_plaster_down", modLoc("block/tudor_acacia_white_plaster_down"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_UP.get(), models().cubeBottomTop("tudor_acacia_white_plaster_up", modLoc("block/tudor_acacia_white_plaster_up"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_acacia_white_plaster_left", modLoc("block/tudor_acacia_white_plaster_left"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_acacia_white_plaster_right", modLoc("block/tudor_acacia_white_plaster_right"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_acacia_white_plaster_horizontal_1", modLoc("block/tudor_acacia_white_plaster_horizontal_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_acacia_white_plaster_horizontal_2", modLoc("block/tudor_acacia_white_plaster_horizontal_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_acacia_white_plaster_vertical_1", modLoc("block/tudor_acacia_white_plaster_vertical_1"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_acacia_white_plaster_vertical_2", modLoc("block/tudor_acacia_white_plaster_vertical_2"), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_birch_white_plaster_cross", modLoc("block/tudor_birch_white_plaster_cross"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_birch_white_plaster_down", modLoc("block/tudor_birch_white_plaster_down"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_UP.get(), models().cubeBottomTop("tudor_birch_white_plaster_up", modLoc("block/tudor_birch_white_plaster_up"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_birch_white_plaster_left", modLoc("block/tudor_birch_white_plaster_left"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_birch_white_plaster_right", modLoc("block/tudor_birch_white_plaster_right"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_birch_white_plaster_horizontal_1", modLoc("block/tudor_birch_white_plaster_horizontal_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_birch_white_plaster_horizontal_2", modLoc("block/tudor_birch_white_plaster_horizontal_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_birch_white_plaster_vertical_1", modLoc("block/tudor_birch_white_plaster_vertical_1"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_birch_white_plaster_vertical_2", modLoc("block/tudor_birch_white_plaster_vertical_2"), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_cross", modLoc("block/tudor_dark_oak_white_plaster_cross"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_down", modLoc("block/tudor_dark_oak_white_plaster_down"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_UP.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_up", modLoc("block/tudor_dark_oak_white_plaster_up"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_left", modLoc("block/tudor_dark_oak_white_plaster_left"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_right", modLoc("block/tudor_dark_oak_white_plaster_right"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_horizontal_1", modLoc("block/tudor_dark_oak_white_plaster_horizontal_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_horizontal_2", modLoc("block/tudor_dark_oak_white_plaster_horizontal_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_vertical_1", modLoc("block/tudor_dark_oak_white_plaster_vertical_1"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_dark_oak_white_plaster_vertical_2", modLoc("block/tudor_dark_oak_white_plaster_vertical_2"), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_jungle_white_plaster_cross", modLoc("block/tudor_jungle_white_plaster_cross"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_jungle_white_plaster_down", modLoc("block/tudor_jungle_white_plaster_down"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_UP.get(), models().cubeBottomTop("tudor_jungle_white_plaster_up", modLoc("block/tudor_jungle_white_plaster_up"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_jungle_white_plaster_left", modLoc("block/tudor_jungle_white_plaster_left"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_jungle_white_plaster_right", modLoc("block/tudor_jungle_white_plaster_right"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_jungle_white_plaster_horizontal_1", modLoc("block/tudor_jungle_white_plaster_horizontal_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_jungle_white_plaster_horizontal_2", modLoc("block/tudor_jungle_white_plaster_horizontal_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_jungle_white_plaster_vertical_1", modLoc("block/tudor_jungle_white_plaster_vertical_1"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_jungle_white_plaster_vertical_2", modLoc("block/tudor_jungle_white_plaster_vertical_2"), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_oak_white_plaster_cross", modLoc("block/tudor_oak_white_plaster_cross"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_oak_white_plaster_down", modLoc("block/tudor_oak_white_plaster_down"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_UP.get(), models().cubeBottomTop("tudor_oak_white_plaster_up", modLoc("block/tudor_oak_white_plaster_up"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_oak_white_plaster_left", modLoc("block/tudor_oak_white_plaster_left"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_oak_white_plaster_right", modLoc("block/tudor_oak_white_plaster_right"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_oak_white_plaster_horizontal_1", modLoc("block/tudor_oak_white_plaster_horizontal_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_oak_white_plaster_horizontal_2", modLoc("block/tudor_oak_white_plaster_horizontal_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_oak_white_plaster_vertical_1", modLoc("block/tudor_oak_white_plaster_vertical_1"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_OAK_WHITE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_oak_white_plaster_vertical_2", modLoc("block/tudor_oak_white_plaster_vertical_2"), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS)));

        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_CROSS.get(), models().cubeBottomTop("tudor_spruce_white_plaster_cross", modLoc("block/tudor_spruce_white_plaster_cross"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_DOWN.get(), models().cubeBottomTop("tudor_spruce_white_plaster_down", modLoc("block/tudor_spruce_white_plaster_down"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_UP.get(), models().cubeBottomTop("tudor_spruce_white_plaster_up", modLoc("block/tudor_spruce_white_plaster_up"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_LEFT.get(), models().cubeBottomTop("tudor_spruce_white_plaster_left", modLoc("block/tudor_spruce_white_plaster_left"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_RIGHT.get(), models().cubeBottomTop("tudor_spruce_white_plaster_right", modLoc("block/tudor_spruce_white_plaster_right"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_HORIZONTAL_1.get(), models().cubeBottomTop("tudor_spruce_white_plaster_horizontal_1", modLoc("block/tudor_spruce_white_plaster_horizontal_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_HORIZONTAL_2.get(), models().cubeBottomTop("tudor_spruce_white_plaster_horizontal_2", modLoc("block/tudor_spruce_white_plaster_horizontal_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_VERTICAL_1.get(), models().cubeBottomTop("tudor_spruce_white_plaster_vertical_1", modLoc("block/tudor_spruce_white_plaster_vertical_1"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
        simpleBlock(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_VERTICAL_2.get(), models().cubeBottomTop("tudor_spruce_white_plaster_vertical_2", modLoc("block/tudor_spruce_white_plaster_vertical_2"), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS)));
    }
}
