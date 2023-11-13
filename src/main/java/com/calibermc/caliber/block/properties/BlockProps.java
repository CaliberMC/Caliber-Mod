package com.calibermc.caliber.block.properties;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public enum BlockProps {
    COBBLESTONE(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    CLAY(BlockBehaviour.Properties.of(Material.CLAY).strength(0.6f).sound(SoundType.GRAVEL)),
    DEEPSLATE_SILVER_ORE(BlockBehaviour.Properties.of(Material.METAL).strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    DEEPSLATE_TIN_ORE(BlockBehaviour.Properties.of(Material.METAL).strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    DIRT(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5f).sound(SoundType.GRAVEL)),
    FARMLAND(BlockBehaviour.Properties.copy(Blocks.FARMLAND)),
    GRANITE(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    GRASS(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)),
    GRAVEL(BlockBehaviour.Properties.of(Material.SAND).strength(0.6f).sound(SoundType.GRAVEL)),
    LIMESTONE(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    LIMESTONE_BRICK(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    MARBLE(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    MYCELIUM(BlockBehaviour.Properties.copy(Blocks.MYCELIUM)),
    CRIMSON_NYLIUM(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM)),
    PLANK(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f, 3.0F).sound(SoundType.WOOD)),
    PODZOL(BlockBehaviour.Properties.copy(Blocks.PODZOL)),
    RAW_SILVER(BlockBehaviour.Properties.of(Material.METAL).strength(2f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    RAW_TIN(BlockBehaviour.Properties.of(Material.METAL).strength(2f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    SAND(BlockBehaviour.Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND).requiresCorrectToolForDrops()),
    SANDSTONE(BlockBehaviour.Properties.of(Material.STONE).strength(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
    SOUL_SAND(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)),
    SOUL_SOIL(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)),
    SILVER_BLOCK(BlockBehaviour.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    SILVER_ORE(BlockBehaviour.Properties.of(Material.METAL).strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
    SMOOTH_LIMESTONE(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
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
