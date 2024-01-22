package com.calibermc.caliberlib.block.custom;

import com.calibermc.caliberlib.util.ModBlockStateProperties;
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
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

import static com.calibermc.caliberlib.util.ModBlockStateProperties.isSide;

public class VerticalBeamBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty BEAM = ModBlockStateProperties.VERTICAL_BEAM_SHAPE;
    public final int beamShape = 7;

    public static final VoxelShape[] SHAPE_NORTH = new VoxelShape[]{Shapes.empty(),
            Block.box(5, 0, 12, 11, 16, 16),
            Shapes.join(Block.box(5, 0, 12, 11, 16, 16), Block.box(5, 12, 0, 11, 16, 12), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 12, 11, 16, 16), Block.box(5, 12, 0, 11, 16, 12), BooleanOp.OR),
            Block.box(5, 0, 12, 11, 16, 16),
            Block.box(5, 0, 12, 11, 16, 16),
            Shapes.join(Block.box(5, 0, 12, 11, 16, 16), Block.box(5, 0, 0, 11, 4, 12), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 12, 11, 16, 16), Block.box(5, 0, 0, 11, 4, 12), BooleanOp.OR)};

    public static final VoxelShape[] SHAPE_EAST = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 5, 4, 16, 11),
            Shapes.join(Block.box(0, 0, 5, 4, 16, 11), Block.box(4, 12, 5, 16, 16, 11), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 5, 4, 16, 11), Block.box(4, 12, 5, 16, 16, 11), BooleanOp.OR),
            Block.box(0, 0, 5, 4, 16, 11),
            Block.box(0, 0, 5, 4, 16, 11),
            Shapes.join(Block.box(0, 0, 5, 4, 16, 11), Block.box(4, 0, 5, 16, 4, 11), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 5, 4, 16, 11), Block.box(4, 0, 5, 16, 4, 11), BooleanOp.OR)};

    public static final VoxelShape[] SHAPE_SOUTH = new VoxelShape[]{Shapes.empty(),
            Block.box(5, 0, 0, 11, 16, 4),
            Shapes.join(Block.box(5, 0, 0, 11, 16, 4), Block.box(5, 12, 4, 11, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 0, 11, 16, 4), Block.box(5, 12, 4, 11, 16, 16), BooleanOp.OR),
            Block.box(5, 0, 0, 11, 16, 4),
            Block.box(5, 0, 0, 11, 16, 4),
            Shapes.join(Block.box(5, 0, 0, 11, 16, 4), Block.box(5, 0, 4, 11, 4, 16), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 0, 11, 16, 4), Block.box(5, 0, 4, 11, 4, 16), BooleanOp.OR)};

    public static final VoxelShape[] SHAPE_WEST = new VoxelShape[]{Shapes.empty(),
            Block.box(12, 0, 5, 16, 16, 11),
            Shapes.join(Block.box(12, 0, 5, 16, 16, 11), Block.box(0, 12, 5, 12, 16, 11), BooleanOp.OR),
            Shapes.join(Block.box(12, 0, 5, 16, 16, 11), Block.box(0, 12, 5, 12, 16, 11), BooleanOp.OR),
            Block.box(12, 0, 5, 16, 16, 11),
            Block.box(12, 0, 5, 16, 16, 11),
            Shapes.join(Block.box(12, 0, 5, 16, 16, 11), Block.box(0, 0, 5, 12, 4, 11), BooleanOp.OR),
            Shapes.join(Block.box(12, 0, 5, 16, 16, 11), Block.box(0, 0, 5, 12, 4, 11), BooleanOp.OR)};

    public VerticalBeamBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(BEAM, 1)
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, Boolean.FALSE));

    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, BEAM, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction direction = pState.getValue(FACING);
        switch (direction) {
            case EAST:
                return SHAPE_EAST[pState.getValue(BEAM)];
            case SOUTH:
                return SHAPE_SOUTH[pState.getValue(BEAM)];
            case WEST:
                return SHAPE_WEST[pState.getValue(BEAM)];
            default:
                return SHAPE_NORTH[pState.getValue(BEAM)];
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        if (blockstate.is(this)) {
            int newCount = blockstate.getValue(BEAM) + 1;
            if (newCount > beamShape) {
                newCount = 1;
            }
            pContext.getItemInHand().grow(1);
            return blockstate.setValue(BEAM, Integer.valueOf(newCount)).
                    setValue(WATERLOGGED, Boolean.valueOf((newCount < beamShape) && fluidstate.is(FluidTags.WATER)));
        } else {
            return this.defaultBlockState().setValue(BEAM, 1).setValue(FACING, pContext.getHorizontalDirection()
                    .getOpposite()).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
        }
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext pContext) {
        if (pContext.getItemInHand().getItem() == this.asItem()) {
            Direction clickedFace = pContext.getClickedFace();
            return isSide(clickedFace) && pContext.replacingClickedOnBlock();
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