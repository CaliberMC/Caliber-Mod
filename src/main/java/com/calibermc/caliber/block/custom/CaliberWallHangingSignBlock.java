package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.custom.entity.CaliberHangingSignBlockEntity;
import com.calibermc.caliber.block.custom.entity.CaliberSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CaliberWallHangingSignBlock extends WallHangingSignBlock {

    public CaliberWallHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new CaliberHangingSignBlockEntity(pPos, pState);
    }
}

