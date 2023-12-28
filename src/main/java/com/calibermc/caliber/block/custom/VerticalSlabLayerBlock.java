package com.calibermc.caliber.block.custom;

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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;


import static com.calibermc.caliber.util.ModBlockStateProperties.isSide;

public class VerticalSlabLayerBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty LAYERS = BlockStateProperties.LAYERS;
    public final int layerCount = 8;

    public static final VoxelShape[] SHAPE_NORTH = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 14, 16, 16, 16),
            Block.box(0, 0, 12, 16, 16, 16),
            Block.box(0, 0, 10, 16, 16, 16),
            Block.box(0, 0, 8, 16, 16, 16),
            Block.box(0, 0, 6, 16, 16, 16),
            Block.box(0, 0, 4, 16, 16, 16),
            Block.box(0, 0, 2, 16, 16, 16),
            Block.box(0, 0, 0, 16, 16, 16)};

    public static final VoxelShape[] SHAPE_EAST = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 0, 2, 16, 16),
            Block.box(0, 0, 0, 4, 16, 16),
            Block.box(0, 0, 0, 6, 16, 16),
            Block.box(0, 0, 0, 8, 16, 16),
            Block.box(0, 0, 0, 10, 16, 16),
            Block.box(0, 0, 0, 12, 16, 16),
            Block.box(0, 0, 0, 14, 16, 16),
            Block.box(0, 0, 0, 16, 16, 16)};

    public static final VoxelShape[] SHAPE_SOUTH = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 0, 16, 16, 2),
            Block.box(0, 0, 0, 16, 16, 4),
            Block.box(0, 0, 0, 16, 16, 6),
            Block.box(0, 0, 0, 16, 16, 8),
            Block.box(0, 0, 0, 16, 16, 10),
            Block.box(0, 0, 0, 16, 16, 12),
            Block.box(0, 0, 0, 16, 16, 14),
            Block.box(0, 0, 0, 16, 16, 16)};

    public static final VoxelShape[] SHAPE_WEST = new VoxelShape[]{Shapes.empty(),
            Block.box(14, 0, 0, 16, 16, 16),
            Block.box(12, 0, 0, 16, 16, 16),
            Block.box(10, 0, 0, 16, 16, 16),
            Block.box(8, 0, 0, 16, 16, 16),
            Block.box(6, 0, 0, 16, 16, 16),
            Block.box(4, 0, 0, 16, 16, 16),
            Block.box(2, 0, 0, 16, 16, 16),
            Block.box(0, 0, 0, 16, 16, 16)};

    public VerticalSlabLayerBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(LAYERS, 4)
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, Boolean.FALSE));

    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return pState.getValue(LAYERS) < 8;
//        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, LAYERS, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction direction = pState.getValue(FACING);
        switch (direction) {
            case EAST:
                return SHAPE_EAST[pState.getValue(LAYERS)];
            case SOUTH:
                return SHAPE_SOUTH[pState.getValue(LAYERS)];
            case WEST:
                return SHAPE_WEST[pState.getValue(LAYERS)];
            default:
                return SHAPE_NORTH[pState.getValue(LAYERS)];
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        if (blockstate.is(this)) {
            int i = blockstate.getValue(LAYERS);
            int newCount = Math.min(layerCount, i + 1);
            return blockstate.setValue(LAYERS, Integer.valueOf(newCount)).
                    setValue(WATERLOGGED, Boolean.valueOf((newCount < layerCount) && fluidstate.is(FluidTags.WATER)));
        } else {
            return this.defaultBlockState().setValue(LAYERS, 1).setValue(FACING, pContext.getHorizontalDirection()
                    .getOpposite()).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
        }
    }


    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext pContext) {
        int currentLayers = state.getValue(LAYERS);
        if (pContext.getItemInHand().getItem() == this.asItem()) {
            Direction clickedFace = pContext.getClickedFace();
            // Allow replacement if it's a side click and not at max layers
            return isSide(clickedFace) && currentLayers < layerCount;
        }
        return false;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean placeLiquid(LevelAccessor world, BlockPos pos, BlockState state, FluidState fluid) {
        return state.getValue(LAYERS) < layerCount && SimpleWaterloggedBlock.super.placeLiquid(world, pos, state, fluid);
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.getValue(LAYERS) < layerCount && SimpleWaterloggedBlock.super.canPlaceLiquid(world, pos, state, fluid);
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