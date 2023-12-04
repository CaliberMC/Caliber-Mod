package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.TopBottomShape;
import com.calibermc.caliber.util.ModBlockStateProperties;
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

import java.util.stream.Stream;

import static com.calibermc.caliber.util.ModBlockStateProperties.isSide;


public class BeamLintelBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<TopBottomShape> TYPE = ModBlockStateProperties.TOP_BOTTOM_SHAPE;
    public static final IntegerProperty BEAM = ModBlockStateProperties.LINTEL_SHAPE;
    public final int beamShape = 4;

    public static final VoxelShape[] BOTTOM_SHAPE_NORTH = new VoxelShape[]{Shapes.empty(),
            Block.box(-5, 12, 14, 21, 16, 16),
            Block.box(0, 12, 14, 21, 16, 16),
            Block.box(-5, 12, 14, 16, 16, 16),
            Block.box(0, 12, 14, 16, 16, 16)};
    public static final VoxelShape[] BOTTOM_SHAPE_EAST = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 12, -5, 2, 16, 21),
            Block.box(0, 12, 0, 2, 16, 21),
            Block.box(0, 12, -5, 2, 16, 16),
            Block.box(0, 12, 0, 2, 16, 16)};
    public static final VoxelShape[] BOTTOM_SHAPE_SOUTH = new VoxelShape[]{Shapes.empty(),
            Block.box(-5, 12, 0, 21, 16, 2),
            Block.box(-5, 12, 0, 16, 16, 2),
            Block.box(0, 12, 0, 21, 16, 2),
            Block.box(0, 12, 0, 16, 16, 2)};
    public static final VoxelShape[] BOTTOM_SHAPE_WEST = new VoxelShape[]{Shapes.empty(),
            Block.box(14, 12, -5, 16, 16, 21),
            Block.box(14, 12, -5, 16, 16, 16),
            Block.box(14, 12, 0, 16, 16, 21),
            Block.box(14, 12, 0, 16, 16, 16)};

    public static final VoxelShape[] SHAPE_NORTH = new VoxelShape[]{
            Shapes.empty(),
            Block.box(-5, 0, 14, 21, 4, 16),
            Block.box(-5, 0, 14, 16, 4, 16),
            Block.box(0, 0, 14, 21, 4, 16),
            Block.box(0, 0, 14, 16, 4, 16)};
    public static final VoxelShape[] SHAPE_EAST = new VoxelShape[]{
            Shapes.empty(),
            Block.box(0, 0, -5, 2, 4, 21),
            Block.box(0, 0, -5, 2, 4, 16),
            Block.box(0, 0, 0, 2, 4, 21),
            Block.box(0, 0, 0, 2, 4, 16)};
    public static final VoxelShape[] SHAPE_SOUTH = new VoxelShape[]{
            Shapes.empty(),
            Block.box(-5, 0, 0, 21, 4, 2),
            Block.box(0, 0, 0, 21, 4, 2),
            Block.box(-5, 0, 0, 16, 4, 2),
            Block.box(0, 0, 0, 16, 4, 2)};
    public static final VoxelShape[] SHAPE_WEST = new VoxelShape[]{
            Shapes.empty(),
            Block.box(14, 0, -5, 16, 4, 21),
            Block.box(14, 0, 0, 16, 4, 21),
            Block.box(14, 0, -5, 16, 4, 16),
            Block.box(14, 0, 0, 16, 4, 16)};

    public BeamLintelBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(BEAM, 1)
                .setValue(TYPE, TopBottomShape.BOTTOM)
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, Boolean.FALSE));

    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, BEAM, TYPE, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        TopBottomShape topBottomShape = pState.getValue(TYPE);
        Direction direction = pState.getValue(FACING);

        switch (topBottomShape) {
            case TOP -> {
                return switch (direction) {
                    case EAST -> SHAPE_EAST[pState.getValue(BEAM)];
                    case SOUTH -> SHAPE_SOUTH[pState.getValue(BEAM)];
                    case WEST -> SHAPE_WEST[pState.getValue(BEAM)];
                    default -> SHAPE_NORTH[pState.getValue(BEAM)];
                };
            }
            case BOTTOM -> {
                return switch (direction) {
                    case EAST -> BOTTOM_SHAPE_EAST[pState.getValue(BEAM)];
                    case SOUTH -> BOTTOM_SHAPE_SOUTH[pState.getValue(BEAM)];
                    case WEST -> BOTTOM_SHAPE_WEST[pState.getValue(BEAM)];
                    default -> BOTTOM_SHAPE_NORTH[pState.getValue(BEAM)];
                };
            }
        }
        return null;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        Direction clickedFace = pContext.getClickedFace();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        if (blockstate.is(this)) {
            int newCount = blockstate.getValue(BEAM) +1;
            if (newCount > beamShape){
                newCount = 1;
            }
            pContext.getItemInHand().grow(1);
            return blockstate.setValue(BEAM, Integer.valueOf(newCount)).
                    setValue(WATERLOGGED, Boolean.valueOf((newCount < beamShape) && fluidstate.is(FluidTags.WATER)));
        } else {
            BlockState blockstate1 = this.defaultBlockState().setValue(BEAM, 1).setValue(TYPE, TopBottomShape.TOP).setValue(FACING, pContext.getHorizontalDirection()
                    .getOpposite()).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            return clickedFace != Direction.DOWN && (clickedFace == Direction.UP || !(pContext.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ?
                    blockstate1 : blockstate1.setValue(TYPE, TopBottomShape.BOTTOM);
        }
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext pContext) {
        if (pContext.getItemInHand().getItem() == this.asItem()) {
            return pContext.replacingClickedOnBlock();
        }
        return false;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean placeLiquid(LevelAccessor world, BlockPos pos, BlockState state, FluidState fluid) {
        return state.getValue(BEAM) < beamShape && SimpleWaterloggedBlock.super.placeLiquid(world, pos, state, fluid);
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.getValue(BEAM) < beamShape && SimpleWaterloggedBlock.super.canPlaceLiquid(world, pos, state, fluid);
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