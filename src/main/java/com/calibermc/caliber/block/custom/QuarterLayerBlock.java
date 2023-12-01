package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.QuarterLayerShape;
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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

import static com.calibermc.caliber.util.ModBlockStateProperties.isSide;

public class QuarterLayerBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<QuarterLayerShape> TYPE = ModBlockStateProperties.QUARTER_LAYER_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty LAYERS = ModBlockStateProperties.FIVE_LAYERS;
    public final int layerCount = 5;

    public static final VoxelShape[] NORTH_BOTTOM = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 14, 16, 2, 16),
            Block.box(0, 0, 12, 16, 4, 16),
            Block.box(0, 0, 8, 16, 8, 16),
            Block.box(0, 0, 4, 16, 12, 16),
            Block.box(0, 0, 0, 16, 16, 16)};
    public static final VoxelShape[] EAST_BOTTOM = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 0, 2, 2, 16),
            Block.box(0, 0, 0, 4, 4, 16),
            Block.box(0, 0, 0, 8, 8, 16),
            Block.box(0, 0, 0, 12, 12, 16),
            Block.box(0, 0, 0, 16, 16, 16)};
    public static final VoxelShape[] SOUTH_BOTTOM = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 0, 16, 2, 2),
            Block.box(0, 0, 0, 16, 4, 4),
            Block.box(0, 0, 0, 16, 8, 8),
            Block.box(0, 0, 0, 16, 12, 12),
            Block.box(0, 0, 0, 16, 16, 16)};
    public static final VoxelShape[] WEST_BOTTOM = new VoxelShape[]{Shapes.empty(),
            Block.box(14, 0, 0, 16, 2, 16),
            Block.box(12, 0, 0, 16, 4, 16),
            Block.box(8, 0, 0, 16, 8, 16),
            Block.box(4, 0, 0, 16, 12, 16),
            Block.box(0, 0, 0, 16, 16, 16)};


    public static final VoxelShape[] NORTH_TOP = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 14, 14, 16, 16, 16),
            Block.box(0, 12, 12, 16, 16, 16),
            Block.box(0, 8, 8, 16, 16, 16),
            Block.box(0, 4, 4, 16, 16, 16),
            Block.box(0, 0, 0, 16, 16, 16)};
    public static final VoxelShape[] EAST_TOP = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 14, 0, 2, 16, 16),
            Block.box(0, 12, 0, 4, 16, 16),
            Block.box(0, 8, 0, 8, 16, 16),
            Block.box(0, 4, 0, 12, 16, 16),
            Block.box(0, 0, 0, 16, 16, 16)};
    public static final VoxelShape[] SOUTH_TOP = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 14, 14, 16, 16, 16),
            Block.box(0, 12, 0, 16, 16, 4),
            Block.box(0, 8, 0, 16, 16, 8),
            Block.box(0, 4, 0, 16, 16, 12),
            Block.box(0, 0, 0, 16, 16, 16)};
    public static final VoxelShape[] WEST_TOP = new VoxelShape[]{Shapes.empty(),
            Block.box(14, 14, 0, 16, 16, 16),
            Block.box(12, 12, 0, 16, 16, 16),
            Block.box(8, 8, 0, 16, 16, 16),
            Block.box(4, 4, 0, 16, 16, 16),
            Block.box(0, 0, 0, 16, 16, 16)};


    public QuarterLayerBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(LAYERS, 3)
                .setValue(FACING, Direction.NORTH)
                .setValue(TYPE, QuarterLayerShape.BOTTOM)
                .setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(LAYERS, FACING, TYPE, WATERLOGGED);
    }
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        QuarterLayerShape quarterLayerShape = pState.getValue(TYPE);
        Direction direction = pState.getValue(FACING);

        switch (quarterLayerShape) {
            case TOP -> {
                return switch (direction) {
                    case EAST -> EAST_TOP[pState.getValue(LAYERS)];
                    case SOUTH -> SOUTH_TOP[pState.getValue(LAYERS)];
                    case WEST -> WEST_TOP[pState.getValue(LAYERS)];
                    default -> NORTH_TOP[pState.getValue(LAYERS)];
                };
            }
            case BOTTOM -> {
                return switch (direction) {
                    case EAST -> EAST_BOTTOM[pState.getValue(LAYERS)];
                    case SOUTH -> SOUTH_BOTTOM[pState.getValue(LAYERS)];
                    case WEST -> WEST_BOTTOM[pState.getValue(LAYERS)];
                    default -> NORTH_BOTTOM[pState.getValue(LAYERS)];
                };
            }
        }
        return null;
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        Direction clickedFace = pContext.getClickedFace();
        if (blockstate.is(this) && clickedFace != Direction.UP && clickedFace != Direction.DOWN) {
            int i = blockstate.getValue(LAYERS);
            int newCount = Math.min(layerCount, i + 1);
            return blockstate.setValue(LAYERS, Integer.valueOf(newCount)).
                    setValue(WATERLOGGED, Boolean.valueOf((newCount < layerCount) && fluidstate.is(FluidTags.WATER)));
        } else {
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                    .setValue(LAYERS, 1).setValue(TYPE, QuarterLayerShape.BOTTOM).setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
            return clickedFace != Direction.DOWN && (clickedFace == Direction.UP || !(pContext.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ?
                    blockstate1 : blockstate1.setValue(FACING, pContext.getHorizontalDirection().getOpposite()).setValue(TYPE, QuarterLayerShape.TOP);
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
    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
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
            case LAND -> pState.getValue(LAYERS) < 4;
            case WATER -> pLevel.getFluidState(pPos).is(FluidTags.WATER);
            case AIR -> false;
        };
    }
}