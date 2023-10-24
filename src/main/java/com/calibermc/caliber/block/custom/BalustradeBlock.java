package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.util.ModBlockStateProperties;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
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
import static net.minecraft.core.Direction.WEST;

public class BalustradeBlock extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<ShapeType> TYPE = ModBlockStateProperties.SHAPE_TYPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final Map<Direction, VoxelShape> SINGLE_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Stream.of(Block.box(1.5, 10, 1.5, 14.5, 16, 14.5),
                    Block.box(1.5, 0, 1.5, 14.5, 3, 14.5),
                    Block.box(3, 3, 3, 13, 4, 13),
                    Block.box(4, 4, 4, 12, 10, 12)
              ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH, Stream.of(Block.box(1.5, 10, 1.5, 14.5, 16, 14.5),
                    Block.box(1.5, 0, 1.5, 14.5, 3, 14.5),
                    Block.box(3, 3, 3, 13, 4, 13),
                    Block.box(4, 4, 4, 12, 10, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST, Stream.of(Block.box(1.5, 10, 1.5, 14.5, 16, 14.5),
                    Block.box(1.5, 0, 1.5, 14.5, 3, 14.5),
                    Block.box(3, 3, 3, 13, 4, 13),
                    Block.box(4, 4, 4, 12, 10, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST, Stream.of(Block.box(1.5, 10, 1.5, 14.5, 16, 14.5),
                    Block.box(1.5, 0, 1.5, 14.5, 3, 14.5),
                    Block.box(3, 3, 3, 13, 4, 13),
                    Block.box(4, 4, 4, 12, 10, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));
    public static final Map<Direction, VoxelShape> CONNECTED_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Stream.of(
                    Block.box(3, 10, 0, 13, 16, 16),
                    Block.box(1.5, 0, 1.5, 14.5, 3, 14.5),
                    Block.box(3.5, 3, 3, 12.5, 4, 13),
                    Block.box(5.5, 4, 4, 10.5, 10, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH, Stream.of(
                    Block.box(3, 10, 0, 13, 16, 16),
                    Block.box(1.5, 0, 1.5, 14.5, 3, 14.5),
                    Block.box(3.5, 3, 3, 12.5, 4, 13),
                    Block.box(5.5, 4, 4, 10.5, 10, 12)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST, Stream.of(
                    Block.box(0, 10, 3, 16, 16, 13),
                    Block.box(1.5, 0, 1.5, 14.5, 3, 14.5),
                    Block.box(3, 3, 3.5, 13, 4, 12.5),
                    Block.box(4, 4, 5.5, 12, 10, 10.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST, Stream.of(
                    Block.box(0, 10, 3, 16, 16, 13),
                    Block.box(1.5, 0, 1.5, 14.5, 3, 14.5),
                    Block.box(3, 3, 3.5, 13, 4, 12.5),
                    Block.box(4, 4, 5.5, 12, 10, 10.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public BalustradeBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState() // ? this.stateDefinition.any()
                .setValue(FACING, NORTH)
                .setValue(TYPE, ShapeType.SINGLE)
                .setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public boolean useShapeForLightOcclusion(BlockState pState) {
        return true;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, TYPE, WATERLOGGED);
    }

    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        ShapeType shapeType = pState.getValue(TYPE);
        switch (shapeType) {
            case CONNECTED -> {
                return CONNECTED_SHAPE.get(pState.getValue(FACING));
            }
            default -> {
               return SINGLE_SHAPE.get(pState.getValue(FACING));
            }
        }
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        Direction direction = pContext.getClickedFace();
        if (direction == NORTH || direction == SOUTH || direction == EAST || direction == WEST) {
            FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                    .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            return blockstate1.setValue(TYPE, ShapeType.CONNECTED).setValue(FACING, pContext.getHorizontalDirection()
                    .getOpposite()).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
        } else {
            return defaultBlockState();
        }

    }

    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

//    public boolean placeLiquid(LevelAccessor pLevel, BlockPos pPos, BlockState pState, FluidState pFluidState) {
//        return pState.getValue(TYPE) != ShapeType.DOUBLE ? SimpleWaterloggedBlock.super.placeLiquid(pLevel, pPos, pState, pFluidState) : false;
//    }
//
//    public boolean canPlaceLiquid(BlockGetter pLevel, BlockPos pPos, BlockState pState, Fluid pFluid) {
//        return pState.getValue(TYPE) != ShapeType.DOUBLE ? SimpleWaterloggedBlock.super.canPlaceLiquid(pLevel, pPos, pState, pFluid) : false;
//    }

    /**
     * Update the provided state given the provided neighbor direction and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific direction passed in.
     */
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
    }

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
