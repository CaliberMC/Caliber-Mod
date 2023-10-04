package com.calibermc.naturescanvas.datagen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, NaturesCanvas.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BLACK_GRANITE.get());
        simpleBlock(ModBlocks.BROWN_GRANITE.get());
        simpleBlock(ModBlocks.PINK_GRANITE.get());
        simpleBlock(ModBlocks.GRAY_GRANITE.get());
        simpleBlock(ModBlocks.WHITE_GRANITE.get());
        slabBlock((SlabBlock) ModBlocks.BLACK_GRANITE_SLAB.get(), blockTexture(ModBlocks.BLACK_GRANITE.get()),
                blockTexture(ModBlocks.BLACK_GRANITE.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_GRANITE_SLAB.get(), blockTexture(ModBlocks.BROWN_GRANITE.get()),
                blockTexture(ModBlocks.BROWN_GRANITE.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_GRANITE_SLAB.get(), blockTexture(ModBlocks.GRAY_GRANITE.get()),
                blockTexture(ModBlocks.GRAY_GRANITE.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_GRANITE_SLAB.get(), blockTexture(ModBlocks.PINK_GRANITE.get()),
                blockTexture(ModBlocks.PINK_GRANITE.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_GRANITE_SLAB.get(), blockTexture(ModBlocks.WHITE_GRANITE.get()),
                blockTexture(ModBlocks.WHITE_GRANITE.get()));
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
        slabBlock((SlabBlock) ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), blockTexture(ModBlocks.POLISHED_BLACK_GRANITE.get()),
                blockTexture(ModBlocks.POLISHED_BLACK_GRANITE.get()));
        slabBlock((SlabBlock) ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), blockTexture(ModBlocks.POLISHED_BROWN_GRANITE.get()),
                blockTexture(ModBlocks.POLISHED_BROWN_GRANITE.get()));
        slabBlock((SlabBlock) ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), blockTexture(ModBlocks.POLISHED_GRAY_GRANITE.get()),
                blockTexture(ModBlocks.POLISHED_GRAY_GRANITE.get()));
        slabBlock((SlabBlock) ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), blockTexture(ModBlocks.POLISHED_PINK_GRANITE.get()),
                blockTexture(ModBlocks.POLISHED_PINK_GRANITE.get()));
        slabBlock((SlabBlock) ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), blockTexture(ModBlocks.POLISHED_WHITE_GRANITE.get()),
                blockTexture(ModBlocks.POLISHED_WHITE_GRANITE.get()));
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
        slabBlock((SlabBlock) ModBlocks.DARK_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.DARK_LIMESTONE.get()),
                blockTexture(ModBlocks.DARK_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE.get()),
                blockTexture(ModBlocks.LIGHT_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.PINK_LIMESTONE.get()),
                blockTexture(ModBlocks.PINK_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.TAN_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.TAN_LIMESTONE.get()),
                blockTexture(ModBlocks.TAN_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.DARK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.DARK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.PINK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.TAN_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.TAN_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.DARK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.DARK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_LIMESTONE_WALL.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE.get()));
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
        slabBlock((SlabBlock) ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.COBBLED_DARK_LIMESTONE.get()),
                blockTexture(ModBlocks.COBBLED_DARK_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()),
                blockTexture(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.COBBLED_PINK_LIMESTONE.get()),
                blockTexture(ModBlocks.COBBLED_PINK_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.COBBLED_TAN_LIMESTONE.get()),
                blockTexture(ModBlocks.COBBLED_TAN_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLED_DARK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_DARK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLED_LIGHT_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLED_PINK_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_PINK_LIMESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLED_TAN_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_TAN_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.COBBLED_DARK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_DARK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.COBBLED_LIGHT_LIMESTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.COBBLED_PINK_LIMESTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_PINK_LIMESTONE.get()));
        wallBlock((WallBlock) ModBlocks.COBBLED_TAN_LIMESTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_TAN_LIMESTONE.get()));

        simpleBlock(ModBlocks.DARK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.LIGHT_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.PINK_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.TAN_LIMESTONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.DARK_LIMESTONE_BRICKS.get()),
                blockTexture(ModBlocks.DARK_LIMESTONE_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()),
                blockTexture(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.PINK_LIMESTONE_BRICKS.get()),
                blockTexture(ModBlocks.PINK_LIMESTONE_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.TAN_LIMESTONE_BRICKS.get()),
                blockTexture(ModBlocks.TAN_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DARK_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_LIMESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.TAN_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.DARK_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.DARK_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PINK_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.PINK_LIMESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.TAN_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.TAN_LIMESTONE_BRICKS.get()));

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
        slabBlock((SlabBlock) ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.SMOOTH_DARK_LIMESTONE.get()),
                blockTexture(ModBlocks.SMOOTH_DARK_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()),
                blockTexture(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.SMOOTH_PINK_LIMESTONE.get()),
                blockTexture(ModBlocks.SMOOTH_PINK_LIMESTONE.get()));
        slabBlock((SlabBlock) ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.SMOOTH_TAN_LIMESTONE.get()),
                blockTexture(ModBlocks.SMOOTH_TAN_LIMESTONE.get()));

        simpleBlock(ModBlocks.BLACK_MARBLE.get());
        simpleBlock(ModBlocks.GRAY_MARBLE.get());
        simpleBlock(ModBlocks.PINK_MARBLE.get());
        simpleBlock(ModBlocks.RED_MARBLE.get());
        simpleBlock(ModBlocks.WHITE_MARBLE.get());
        slabBlock((SlabBlock) ModBlocks.BLACK_MARBLE_SLAB.get(), blockTexture(ModBlocks.BLACK_MARBLE.get()),
                blockTexture(ModBlocks.BLACK_MARBLE.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_MARBLE_SLAB.get(), blockTexture(ModBlocks.GRAY_MARBLE.get()),
                blockTexture(ModBlocks.GRAY_MARBLE.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_MARBLE_SLAB.get(), blockTexture(ModBlocks.PINK_MARBLE.get()),
                blockTexture(ModBlocks.PINK_MARBLE.get()));
        slabBlock((SlabBlock) ModBlocks.RED_MARBLE_SLAB.get(), blockTexture(ModBlocks.RED_MARBLE.get()),
                blockTexture(ModBlocks.RED_MARBLE.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_MARBLE_SLAB.get(), blockTexture(ModBlocks.WHITE_MARBLE.get()),
                blockTexture(ModBlocks.WHITE_MARBLE.get()));
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
        slabBlock((SlabBlock) ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), blockTexture(ModBlocks.POLISHED_BLACK_MARBLE.get()),
                blockTexture(ModBlocks.POLISHED_BLACK_MARBLE.get()));
        slabBlock((SlabBlock) ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), blockTexture(ModBlocks.POLISHED_GRAY_MARBLE.get()),
                blockTexture(ModBlocks.POLISHED_GRAY_MARBLE.get()));
        slabBlock((SlabBlock) ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), blockTexture(ModBlocks.POLISHED_PINK_MARBLE.get()),
                blockTexture(ModBlocks.POLISHED_PINK_MARBLE.get()));
        slabBlock((SlabBlock) ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), blockTexture(ModBlocks.POLISHED_RED_MARBLE.get()),
                blockTexture(ModBlocks.POLISHED_RED_MARBLE.get()));
        slabBlock((SlabBlock) ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), blockTexture(ModBlocks.POLISHED_WHITE_MARBLE.get()),
                blockTexture(ModBlocks.POLISHED_WHITE_MARBLE.get()));
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

//        horizontalBlock();
//        horizontalBlock(ModBlocks.SMOOTH_BROWN_SANDSTONE.get(), models().cubeAll("brown_sandstone_top"));
        simpleBlock(ModBlocks.SMOOTH_BROWN_SANDSTONE.get());
        simpleBlock(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get());
//        simpleBlock(ModBlocks.SMOOTH_BROWN_SANDSTONE.get(), models().cubeAll("brown_sandstone_top", modLoc("block/brown_sandstone_top.png")));
//        simpleBlock(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(), models().cubeAll("orange_sandstone_top", modLoc("block/orange_sandstone_top.png")));
        wallBlock((WallBlock) ModBlocks.BROWN_SANDSTONE_WALL.get(), blockTexture(ModBlocks.BROWN_SANDSTONE.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_SANDSTONE_WALL.get(), blockTexture(ModBlocks.ORANGE_SANDSTONE.get()));


//        slabBlock((SlabBlock) ModBlocks.BROWN_SANDSTONE_SLAB.get(), blockTexture(ModBlocks.BROWN_SANDSTONE.get()),
//                blockTexture(ModBlocks.BROWN_SANDSTONE.get()));
//        slabBlock((SlabBlock) ModBlocks.ORANGE_SANDSTONE_SLAB.get(), blockTexture(ModBlocks.ORANGE_SANDSTONE.get()),
//                blockTexture(ModBlocks.ORANGE_SANDSTONE.get()));

        simpleBlock(ModBlocks.BLACK_SAND.get());
        simpleBlock(ModBlocks.BROWN_SAND.get());
        simpleBlock(ModBlocks.ORANGE_SAND.get());
        simpleBlock(ModBlocks.WHITE_SAND.get());

//        fourWayBlock(ModBlocks.BROWN_SANDSTONE.get(), modLoc("block/brown_sandstone_side"), modLoc("block/brown_sandstone_bottom"), modLoc("block/brown_sandstone_top"));

//        fourWayBlock(ModBlocks.BROWN_SANDSTONE.get(),
//                blockTexture().getPath("block/brown_sandstone_side"),
//                blockTexture("block/brown_sandstone_bottom"),
//                blockTexture("block/brown_sandstone_top"));

//        fourWayBlock(ModBlocks.ORANGE_SANDSTONE.get(), models().cubeColumn(), ("block/orange_sandstone_side"), modLoc("block/orange_sandstone_top"));

//        models().cubeBottomTop("brown_sandstone", modLoc("block/brown_sandstone_side"), modLoc("block/brown_sandstone_bottom"), modLoc("block/brown_sandstone_top"));






    }
}
