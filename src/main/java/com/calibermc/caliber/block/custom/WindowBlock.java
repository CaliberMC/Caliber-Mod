package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.properties.WindowShape;
import com.calibermc.caliber.util.ModBlockStateProperties;
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
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluid;
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

public class WindowBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<WindowShape> TYPE = ModBlockStateProperties.WINDOW_SHAPE;
    public static final Map<Direction, VoxelShape> TOP_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH,  Stream.of(
                    Block.box(12, 0, 0, 16, 16, 16),
                    Block.box(0, 0, 0, 4, 16, 16),
                    Block.box(4, 14, 0, 12, 16, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH,  Stream.of(
                    Block.box(12, 0, 0, 16, 16, 16),
                    Block.box(0, 0, 0, 4, 16, 16),
                    Block.box(4, 14, 0, 12, 16, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST, Stream.of(
                    Block.box(0, 0, 12, 16, 16, 16),
                    Block.box(0, 0, 0, 16, 16, 4),
                    Block.box(0, 14, 4, 16, 16, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST,   Stream.of(
                    Block.box(0, 0, 12, 16, 16, 16),
                    Block.box(0, 0, 0, 16, 16, 4),
                    Block.box(0, 14, 4, 16, 16, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public static final Map<Direction, VoxelShape> MIDDLE_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH,  Shapes.join(Block.box(12, 0, 0, 16, 16, 16),
                    Block.box(0, 0, 0, 4, 16, 16), BooleanOp.OR),
            SOUTH,  Shapes.join(Block.box(12, 0, 0, 16, 16, 16),
                    Block.box(0, 0, 0, 4, 16, 16), BooleanOp.OR),
            EAST,   Shapes.join(Block.box(0, 0, 12, 16, 16, 16),
                    Block.box(0, 0, 0, 16, 16, 4), BooleanOp.OR),
            WEST,   Shapes.join(Block.box(0, 0, 12, 16, 16, 16),
                    Block.box(0, 0, 0, 16, 16, 4), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> BOTTOM_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH,  Stream.of(
                    Block.box(12, 0, 0, 16, 16, 16),
                    Block.box(0, 0, 0, 4, 16, 16),
                    Block.box(4, 0, 0, 12, 2, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH,  Stream.of(
                    Block.box(12, 0, 0, 16, 16, 16),
                    Block.box(0, 0, 0, 4, 16, 16),
                    Block.box(4, 0, 0, 12, 2, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST,   Stream.of(
                    Block.box(0, 0, 12, 16, 16, 16),
                    Block.box(0, 0, 0, 16, 16, 4),
                    Block.box(0, 0, 4, 16, 2, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST,   Stream.of(
                    Block.box(0, 0, 12, 16, 16, 16),
                    Block.box(0, 0, 0, 16, 16, 4),
                    Block.box(0, 0, 4, 16, 2, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public static final Map<Direction, VoxelShape> FULL_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH,  Stream.of(
                    Block.box(12, 0, 0, 16, 16, 16),
                    Block.box(0, 0, 0, 4, 16, 16),
                    Block.box(4, 14, 0, 12, 16, 16),
                    Block.box(4, 0, 0, 12, 2, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH,  Stream.of(
                    Block.box(12, 0, 0, 16, 16, 16),
                    Block.box(0, 0, 0, 4, 16, 16),
                    Block.box(4, 14, 0, 12, 16, 16),
                    Block.box(4, 0, 0, 12, 2, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST,   Stream.of(
                    Block.box(0, 0, 12, 16, 16, 16),
                    Block.box(0, 0, 0, 16, 16, 4),
                    Block.box(0, 14, 4, 16, 16, 12),
                    Block.box(0, 0, 4, 16, 2, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST,   Stream.of(
                    Block.box(0, 0, 12, 16, 16, 16),
                    Block.box(0, 0, 0, 16, 16, 4),
                    Block.box(0, 14, 4, 16, 16, 12),
                    Block.box(0, 0, 4, 16, 2, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public WindowBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(FACING, NORTH)
                .setValue(TYPE, WindowShape.FULL_BLOCK)
                .setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, TYPE, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        WindowShape windowShape = pState.getValue(TYPE);
        switch (windowShape) {
            case TOP -> {
                return TOP_SHAPE.get(pState.getValue(FACING));
            }
            case MIDDLE -> {
                return MIDDLE_SHAPE.get(pState.getValue(FACING));
            }
            case BOTTOM -> {
                return BOTTOM_SHAPE.get(pState.getValue(FACING));
            }
            default -> {
                return FULL_SHAPE.get(pState.getValue(FACING));

            }
        }
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
//        BlockState below = pContext.getLevel().getBlockState(blockpos.below());
//        BlockState above = pContext.getLevel().getBlockState(blockpos.above());
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);

        // If the block below is a window and the block above is not a window, this block is a top window.
//        if (below.getBlock() == this && above.getBlock() != this) {
//            return blockstate1.setValue(TYPE, WindowShape.TOP)
//                    .setValue(WATERLOGGED, Boolean.valueOf(false));
//            // If both the block below and the block above are windows, this block is a middle window.
//        } else if (below.getBlock() == this && above.getBlock() == this) {
//            return blockstate1.setValue(TYPE, WindowShape.MIDDLE)
//                    .setValue(WATERLOGGED, Boolean.valueOf(false));
//            // If the block below is not a window and the block above is a window, this block is a bottom window.
//        } else if (below.getBlock() != this && above.getBlock() == this) {
//            return blockstate1.setValue(TYPE, WindowShape.BOTTOM)
//                    .setValue(WATERLOGGED, Boolean.valueOf(false));
//            // By default, place as a whole window.
//        } else {
//            return blockstate1.setValue(TYPE, WindowShape.FULL_BLOCK)
//                    .setValue(WATERLOGGED, Boolean.valueOf(false));
//        }
        return blockstate1.setValue(TYPE, WindowShape.FULL_BLOCK)
                .setValue(WATERLOGGED, Boolean.FALSE);
    }

    /**
     * Update the provided state given the provided neighbor direction and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific direction passed in.
     */
    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        if (pLevel.getBlockState(pCurrentPos.below()).getBlock() == this && pLevel.getBlockState(pCurrentPos.above()).getBlock() != this) {
            return pState.setValue(TYPE, WindowShape.TOP);
        } else if (pLevel.getBlockState(pCurrentPos.below()).getBlock() == this && pLevel.getBlockState(pCurrentPos.above()).getBlock() == this) {
            return pState.setValue(TYPE, WindowShape.MIDDLE);
        } else if (pLevel.getBlockState(pCurrentPos.below()).getBlock() != this && pLevel.getBlockState(pCurrentPos.above()).getBlock() == this) {
            return pState.setValue(TYPE, WindowShape.BOTTOM);
        } else {
            return pState.setValue(TYPE, WindowShape.FULL_BLOCK);
        }

//        return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
    }

    @Override
    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    @Override
    public boolean placeLiquid(LevelAccessor pLevel, BlockPos pPos, BlockState pState, FluidState pFluidState) {
        return SimpleWaterloggedBlock.super.placeLiquid(pLevel, pPos, pState, pFluidState);
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter pLevel, BlockPos pPos, BlockState pState, Fluid pFluid) {
        return SimpleWaterloggedBlock.super.canPlaceLiquid(pLevel, pPos, pState, pFluid);
    }

    @Override
    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        return switch (pType) {
            case LAND -> false;
            case WATER -> pLevel.getFluidState(pPos).is(FluidTags.WATER);
            case AIR -> false;
        };
    }
}