package com.calibermc.caliber.block.properties;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public enum BlockProps {
    ANDESITE(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    BASALT(BlockBehaviour.Properties.copy(Blocks.BASALT)),
    BLACKSTONE(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)),
    COBBLESTONE(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    CLAY(BlockBehaviour.Properties.of(Material.CLAY).strength(0.6f).sound(SoundType.GRAVEL)),
    DEEPSLATE(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()),
    DEEPSLATE_BRICK(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()),
    DEEPSLATE_TILES(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()),
    COBBLED_DEEPSLATE(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()),
    DEEPSLATE_SILVER_ORE(BlockBehaviour.Properties.of(Material.METAL).strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    DEEPSLATE_TIN_ORE(BlockBehaviour.Properties.of(Material.METAL).strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    DIORITE(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    DIRT(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5f).sound(SoundType.GRAVEL)),
    FARMLAND(BlockBehaviour.Properties.copy(Blocks.FARMLAND)),
    GILDED_BLACKSTONE(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)),
    GRANITE(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    GRASS(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)),
    GRAVEL(BlockBehaviour.Properties.of(Material.SAND).strength(0.6f).sound(SoundType.GRAVEL)),
    HALF_TIMBERED(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f, 3.0F).sound(SoundType.WOOD).requiresCorrectToolForDrops()),
    LIMESTONE(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    LIMESTONE_BRICK(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    MARBLE(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    MYCELIUM(BlockBehaviour.Properties.copy(Blocks.MYCELIUM)),
    CRIMSON_NYLIUM(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM)),
    PLANK(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f, 3.0F).sound(SoundType.WOOD)),
    PLASTER(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).sound(SoundType.TUFF).requiresCorrectToolForDrops()),
    PLASTER_POWDER(BlockBehaviour.Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND)),
    PODZOL(BlockBehaviour.Properties.copy(Blocks.PODZOL)),
    POLISHED_ANDESITE(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    POLISHED_BASALT(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)),
    POLISHED_BLACKSTONE(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)),
    POLISHED_BLACKSTONE_BRICK(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)),
    POLISHED_DEEPSLATE(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
    POLISHED_DIORITE(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    QUARTZ(BlockBehaviour.Properties.of(Material.STONE).strength(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    RAW_SILVER(BlockBehaviour.Properties.of(Material.METAL).strength(2f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    RAW_TIN(BlockBehaviour.Properties.of(Material.METAL).strength(2f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    SAND(BlockBehaviour.Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND).requiresCorrectToolForDrops()),
    SANDSTONE(BlockBehaviour.Properties.of(Material.STONE).strength(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    SMOOTH_QUARTZ_BLOCK(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    SOUL_SAND(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)),
    SOUL_SOIL(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)),
    SILVER_BLOCK(BlockBehaviour.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    SILVER_ORE(BlockBehaviour.Properties.of(Material.METAL).strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    SMOOTH_BASALT(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)),
    SMOOTH_LIMESTONE(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    SMOOTH_QUARTZ(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    SMOOTH_SANDSTONE(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    TIN_BLOCK(BlockBehaviour.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    TIN_ORE(BlockBehaviour.Properties.of(Material.METAL).strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    WARPED_NYLIUM(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM)),
    WOOD(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f).sound(SoundType.WOOD));

    private final BlockBehaviour.Properties properties;

    BlockProps(BlockBehaviour.Properties properties) {
        this.properties = properties;
    }

    public BlockBehaviour.Properties get() {
        return properties;
    }
}
