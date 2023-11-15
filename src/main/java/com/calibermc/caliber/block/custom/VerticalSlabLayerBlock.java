package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.SlabLayerShape;
import com.calibermc.caliber.block.shapes.VerticalSlabShape;
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
import java.util.Map;


public class VerticalSlabLayerBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty LAYERS = BlockStateProperties.LAYERS;
    public final int layerCount = 8;

    public static final VoxelShape[] SHAPE_NORTH = new VoxelShape[]{Shapes.empty(),
            Block.box(0.0D, 0.0D, 14.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 12.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 10.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 4.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 2.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public static final VoxelShape[] SHAPE_EAST = new VoxelShape[]{Shapes.empty(),
            Block.box(0.0D, 0.0D, 0.0D, 2.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 4.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 6.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 12.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 14.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public static final VoxelShape[] SHAPE_SOUTH = new VoxelShape[]{Shapes.empty(),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 2.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 4.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 6.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 10.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 12.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 14.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public static final VoxelShape[] SHAPE_WEST = new VoxelShape[]{Shapes.empty(),
            Block.box(14.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(12.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(10.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(6.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(4.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(2.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

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
        int i = state.getValue(LAYERS);
        return (pContext.getItemInHand().getItem() == this.asItem() && i < layerCount) && pContext.replacingClickedOnBlock();
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