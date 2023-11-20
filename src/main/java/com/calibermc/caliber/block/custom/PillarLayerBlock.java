package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.SlabLayerShape;
import com.calibermc.caliber.util.ModBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
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

public class PillarLayerBlock extends Block implements SimpleWaterloggedBlock {

    public static final EnumProperty<SlabLayerShape> TYPE = ModBlockStateProperties.SLAB_LAYER_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty LAYERS = ModBlockStateProperties.FIVE_LAYERS;
    public final int layerCount = 8;

    public static final VoxelShape[] SHAPE_BY_LAYER = new VoxelShape[]{Shapes.empty(),
            Block.box(7, 0, 7, 9, 16, 9),
            Block.box(6, 0, 6, 10, 16, 10),
            Block.box(4, 0, 4, 12, 16, 12),
            Block.box(2, 0, 2, 14, 16, 14),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public PillarLayerBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(LAYERS, 3)
                .setValue (WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return pState.getValue(LAYERS) < 5;
//        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(LAYERS, WATERLOGGED);
    }

    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE_BY_LAYER[pState.getValue(LAYERS)];
    }

    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE_BY_LAYER[pState.getValue(LAYERS) - 1];
    }

    public VoxelShape getBlockSupportShape(BlockState pState, BlockGetter pReader, BlockPos pPos) {
        return SHAPE_BY_LAYER[pState.getValue(LAYERS)];
    }

    public VoxelShape getVisualShape(BlockState pState, BlockGetter pReader, BlockPos pPos, CollisionContext pContext) {
        return SHAPE_BY_LAYER[pState.getValue(LAYERS)];
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
        }
        else {
            return this.defaultBlockState().setValue(LAYERS, 1).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
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
        return (state.getValue(LAYERS) < layerCount) ? SimpleWaterloggedBlock.super.placeLiquid(world, pos, state, fluid)
                : false;
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter world, BlockPos pos, BlockState state, Fluid fluid) {
        return (state.getValue(LAYERS) < layerCount) ? SimpleWaterloggedBlock.super.canPlaceLiquid(world, pos, state, fluid)
                : false;
    }

    @Override
    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        return switch (pType) {
            case LAND -> pState.getValue(LAYERS) < 5;
            case WATER -> pLevel.getFluidState(pPos).is(FluidTags.WATER);
            case AIR -> false;
        };
    }
}