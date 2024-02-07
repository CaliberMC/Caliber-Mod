package com.calibermc.caliber.block.custom.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CaliberHangingSignBlockEntity extends SignBlockEntity {
    public CaliberHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(CaliberBlockEntities.HANGING_SIGN_BLOCK_ENTITIES.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return CaliberBlockEntities.HANGING_SIGN_BLOCK_ENTITIES.get();
    }
}

