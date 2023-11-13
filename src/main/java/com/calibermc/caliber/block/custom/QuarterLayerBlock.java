package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.QuarterShape;
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
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.Map;

public class QuarterLayerBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<QuarterShape> TYPE = ModBlockStateProperties.QUARTER_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;


    public static final Map<Direction, VoxelShape> TOP_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(0, 8, 8, 16, 16, 16),
            Direction.SOUTH, Block.box(0, 8, 0, 16, 16, 8),
            Direction.EAST, Block.box(0, 8, 0, 8, 16, 16),
            Direction.WEST, Block.box(8, 8, 0, 16, 16, 16)));

    public static final Map<Direction, VoxelShape> BOTTOM_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(0, 0, 8, 16, 8, 16),
            Direction.SOUTH, Block.box(0, 0, 0, 16, 8, 8),
            Direction.EAST, Block.box(0, 0, 0, 8, 8, 16),
            Direction.WEST, Block.box(8, 0, 0, 16, 8, 16)));

    public QuarterLayerBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(FACING, Direction.NORTH)
                .setValue(TYPE, QuarterShape.BOTTOM)
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
        QuarterShape quarterShape = pState.getValue(TYPE);
        switch (quarterShape) {
            case DOUBLE -> {
                return VerticalSlabBlock.SHAPE.get(pState.getValue(FACING));
            }
            case TOP -> {
                return TOP_SHAPE.get(pState.getValue(FACING));
            }
            default -> {
                return BOTTOM_SHAPE.get(pState.getValue(FACING));
            }
        }
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        if (blockstate.is(this)) {
            return blockstate.setValue(TYPE, QuarterShape.DOUBLE).setValue(WATERLOGGED, Boolean.FALSE);
        } else {
            FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                    .setValue(TYPE, QuarterShape.BOTTOM).setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
            Direction direction = pContext.getClickedFace();
            return direction != Direction.DOWN && (direction == Direction.UP ||
                    !(pContext.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 :
                    blockstate1.setValue(FACING, pContext.getHorizontalDirection().getOpposite()).setValue(TYPE, QuarterShape.TOP);
        }
    }

    @Override
    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        ItemStack itemstack = pUseContext.getItemInHand();
        QuarterShape quarterShape = pState.getValue(TYPE);
        if (quarterShape != QuarterShape.DOUBLE && itemstack.is(this.asItem())) {
            if (pUseContext.replacingClickedOnBlock()) {
                boolean flag = pUseContext.getClickLocation().y - (double)pUseContext.getClickedPos().getY() > 0.5D;
                Direction direction = pUseContext.getClickedFace();
                if (quarterShape == QuarterShape.BOTTOM) {
                    return direction == Direction.UP || flag && direction.getAxis().isHorizontal();
                } else {
                    return direction == Direction.DOWN || !flag && direction.getAxis().isHorizontal();
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
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