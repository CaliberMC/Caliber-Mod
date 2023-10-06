package com.calibermc.naturescanvas.datagen.loot;

import com.calibermc.naturescanvas.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {

        // -- GRANITE
        this.dropSelf(ModBlocks.BLACK_GRANITE.get());
        this.dropSelf(ModBlocks.BROWN_GRANITE.get());
        this.dropSelf(ModBlocks.GRAY_GRANITE.get());
        this.dropSelf(ModBlocks.PINK_GRANITE.get());
        this.dropSelf(ModBlocks.WHITE_GRANITE.get());
        this.dropSelf(ModBlocks.BLACK_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.PINK_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.BROWN_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.GRAY_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.PINK_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.WHITE_GRANITE_WALL.get());

        this.dropSelf(ModBlocks.POLISHED_BLACK_GRANITE.get());
        this.dropSelf(ModBlocks.POLISHED_BROWN_GRANITE.get());
        this.dropSelf(ModBlocks.POLISHED_GRAY_GRANITE.get());
        this.dropSelf(ModBlocks.POLISHED_PINK_GRANITE.get());
        this.dropSelf(ModBlocks.POLISHED_WHITE_GRANITE.get());
        this.dropSelf(ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_PINK_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_BLACK_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_BROWN_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_GRAY_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_PINK_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_WHITE_GRANITE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_BLACK_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_BROWN_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_GRAY_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_PINK_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_RED_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_WHITE_GRANITE_WALL.get());

        // -- LIMESTONE
        this.add(ModBlocks.DARK_LIMESTONE.get(), (block) ->
                createSingleItemTableWithSilkTouch(ModBlocks.DARK_LIMESTONE.get(), ModBlocks.COBBLED_DARK_LIMESTONE.get()));
        this.add(ModBlocks.LIGHT_LIMESTONE.get(), (block) ->
                createSingleItemTableWithSilkTouch(ModBlocks.LIGHT_LIMESTONE.get(), ModBlocks.COBBLED_LIGHT_LIMESTONE.get()));
        this.add(ModBlocks.PINK_LIMESTONE.get(), (block) ->
                createSingleItemTableWithSilkTouch(ModBlocks.PINK_LIMESTONE.get(), ModBlocks.COBBLED_PINK_LIMESTONE.get()));
        this.add(ModBlocks.TAN_LIMESTONE.get(), (block) ->
                createSingleItemTableWithSilkTouch(ModBlocks.TAN_LIMESTONE.get(), ModBlocks.COBBLED_TAN_LIMESTONE.get()));
        this.dropSelf(ModBlocks.DARK_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.DARK_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.DARK_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.DARK_LIMESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.DARK_LIMESTONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.COBBLED_DARK_LIMESTONE.get());
        this.dropSelf(ModBlocks.COBBLED_LIGHT_LIMESTONE.get());
        this.dropSelf(ModBlocks.COBBLED_PINK_LIMESTONE.get());
        this.dropSelf(ModBlocks.COBBLED_TAN_LIMESTONE.get());
        this.dropSelf(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.COBBLED_DARK_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLED_LIGHT_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLED_PINK_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLED_TAN_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLED_DARK_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.COBBLED_LIGHT_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.COBBLED_PINK_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.COBBLED_TAN_LIMESTONE_WALL.get());

        this.dropSelf(ModBlocks.DARK_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.DARK_LIMESTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PINK_LIMESTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.TAN_LIMESTONE_BRICK_WALL.get());

        this.dropSelf(ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS.get());

        this.dropSelf(ModBlocks.CRACKED_DARK_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_PINK_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_TAN_LIMESTONE_BRICKS.get());

        this.dropSelf(ModBlocks.SMOOTH_DARK_LIMESTONE.get());
        this.dropSelf(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get());
        this.dropSelf(ModBlocks.SMOOTH_PINK_LIMESTONE.get());
        this.dropSelf(ModBlocks.SMOOTH_TAN_LIMESTONE.get());
        this.dropSelf(ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB.get());

        // -- MARBLE
        this.dropSelf(ModBlocks.BLACK_MARBLE.get());
        this.dropSelf(ModBlocks.GRAY_MARBLE.get());
        this.dropSelf(ModBlocks.PINK_MARBLE.get());
        this.dropSelf(ModBlocks.RED_MARBLE.get());
        this.dropSelf(ModBlocks.WHITE_MARBLE.get());
        this.dropSelf(ModBlocks.BLACK_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.PINK_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.RED_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.RED_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_MARBLE_WALL.get());
        this.dropSelf(ModBlocks.GRAY_MARBLE_WALL.get());
        this.dropSelf(ModBlocks.PINK_MARBLE_WALL.get());
        this.dropSelf(ModBlocks.RED_MARBLE_WALL.get());
        this.dropSelf(ModBlocks.WHITE_MARBLE_WALL.get());

        this.dropSelf(ModBlocks.POLISHED_BLACK_MARBLE.get());
        this.dropSelf(ModBlocks.POLISHED_GRAY_MARBLE.get());
        this.dropSelf(ModBlocks.POLISHED_PINK_MARBLE.get());
        this.dropSelf(ModBlocks.POLISHED_RED_MARBLE.get());
        this.dropSelf(ModBlocks.POLISHED_WHITE_MARBLE.get());
        this.dropSelf(ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_PINK_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_RED_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_BLACK_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_GRAY_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_PINK_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_RED_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_WHITE_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_BLACK_MARBLE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_GRAY_MARBLE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_PINK_MARBLE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_RED_MARBLE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_WHITE_MARBLE_WALL.get());

        // -- SANDSTONE
        this.dropSelf(ModBlocks.BROWN_SANDSTONE.get());
        this.dropSelf(ModBlocks.ORANGE_SANDSTONE.get());
        this.dropSelf(ModBlocks.BROWN_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_SANDSTONE_WALL.get());

        this.dropSelf(ModBlocks.CHISELED_BROWN_SANDSTONE.get());
        this.dropSelf(ModBlocks.CHISELED_ORANGE_SANDSTONE.get());

        this.dropSelf(ModBlocks.CUT_BROWN_SANDSTONE.get());
        this.dropSelf(ModBlocks.CUT_ORANGE_SANDSTONE.get());
        this.dropSelf(ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get());

        this.dropSelf(ModBlocks.SMOOTH_BROWN_SANDSTONE.get());
        this.dropSelf(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get());
        this.dropSelf(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.SMOOTH_BROWN_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_ORANGE_SANDSTONE_STAIRS.get());

        // -- SAND
        this.dropSelf(ModBlocks.BLACK_SAND.get());
        this.dropSelf(ModBlocks.BROWN_SAND.get());
        this.dropSelf(ModBlocks.ORANGE_SAND.get());
        this.dropSelf(ModBlocks.WHITE_SAND.get());

//         add(ModBlocks.tin_ORE.get(), (tinOre) ->
//                 createOreDrop(tinOre, ModItems.tin_INGOT.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
