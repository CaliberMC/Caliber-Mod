package com.calibermc.caliber.block.custom;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.stream.Stream;

import static net.minecraft.core.Direction.*;
import static net.minecraft.core.Direction.WEST;

public class ArrowSlitBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final Map<Direction, VoxelShape> SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH,  Stream.of(
                    Block.box(9, 0, 14.5, 16, 16, 16),
                    Block.box(0, 0, 14.5, 7, 16, 16),
                    Block.box(0, 0, 8, 2.5, 16, 14.5),
                    Block.box(13.5, 0, 8, 16, 16, 14.5),
                    Block.box(4.109374999999998, 0, 13.311291501015262, 11.609374999999993, 16, 15.311291501015262),
                    Block.box(4.38941650101525, 0, 13.296875000000007, 11.889416501015262, 16, 15.296875000000004),
                    Block.box(2.5, 0, 12.5, 4.5, 16, 14.5),
                    Block.box(11.5, 0, 12.5, 13.5, 16, 14.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH,  Stream.of(
                    Block.box(0, 0, 0, 7, 16, 1.5),
                    Block.box(9, 0, 0, 16, 16, 1.5),
                    Block.box(13.5, 0, 1.5, 16, 16, 8),
                    Block.box(0, 0, 1.5, 2.5, 16, 8),
                    Block.box(0.6887084989847381, 0, 4.109374999999998, 2.688708498984738, 16, 11.609374999999993),
                    Block.box(4.110583498984738, 0, 0.7031249999999964, 11.610583498984749, 16, 2.703124999999993),
                    Block.box(11.5, 0, 1.5, 13.5, 16, 3.5),
                    Block.box(2.5, 0, 1.5, 4.5, 16, 3.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST,   Stream.of(
                    Block.box(0, 0, 9, 1.5, 16, 16),
                    Block.box(0, 0, 0, 1.5, 16, 7),
                    Block.box(1.5, 0, 0, 8, 16, 2.5),
                    Block.box(1.5, 0, 13.5, 8, 16, 16),
                    Block.box(4.109374999999998, 0, 13.311291501015262, 11.609374999999993, 16, 15.311291501015262),
                    Block.box(0.7031249999999964, 0, 4.38941650101525, 2.703124999999993, 16, 11.889416501015262),
                    Block.box(1.5, 0, 2.5, 3.5, 16, 4.5),
                    Block.box(1.5, 0, 11.5, 3.5, 16, 13.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST,   Stream.of(
                    Block.box(14.5, 0, 0, 16, 16, 7),
                    Block.box(14.5, 0, 9, 16, 16, 16),
                    Block.box(8, 0, 13.5, 14.5, 16, 16),
                    Block.box(8, 0, 0, 14.5, 16, 2.5),
                    Block.box(4.390625000000007, 0, 0.6887084989847381, 11.890625000000002, 16, 2.688708498984738),
                    Block.box(13.296875000000007, 0, 4.110583498984738, 15.296875000000004, 16, 11.610583498984749),
                    Block.box(12.5, 0, 11.5, 14.5, 16, 13.5),
                    Block.box(12.5, 0, 2.5, 14.5, 16, 4.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public ArrowSlitBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(FACING, NORTH)
                .setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE.get(pState.getValue(FACING));
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());

    }

    @Override
    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        switch(pType) {
            case LAND:
                return false;
            case WATER:
                return pLevel.getFluidState(pPos).is(FluidTags.WATER);
            case AIR:
                return false;
            default:
                return false;
        }
    }
}