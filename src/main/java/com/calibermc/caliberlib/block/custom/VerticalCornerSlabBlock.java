package com.calibermc.caliberlib.block.custom;

import com.calibermc.caliberlib.block.shapes.VerticalCornerSlabShape;
import com.calibermc.caliberlib.util.ModBlockStateProperties;
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
import net.minecraft.world.level.block.state.properties.DirectionProperty;
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

import static net.minecraft.core.Direction.*;

public class VerticalCornerSlabBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<VerticalCornerSlabShape> TYPE = ModBlockStateProperties.VERTICAL_CORNER_SLAB_SHAPE;


    public static final Map<Direction, VoxelShape> LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Shapes.join(Block.box(8, 0, 8, 16, 16, 16), Block.box(8, 0, 0, 16, 8, 8), BooleanOp.OR),
            Direction.SOUTH, Shapes.join(Block.box(0, 0, 0, 8, 16, 8), Block.box(0, 0, 8, 8, 8, 16), BooleanOp.OR),
            Direction.EAST, Shapes.join(Block.box(0, 0, 8, 8, 16, 16), Block.box(8, 0, 8, 16, 8, 16), BooleanOp.OR),
            Direction.WEST, Shapes.join(Block.box(8, 0, 0, 16, 16, 8), Block.box(0, 0, 0, 8, 8, 8), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Shapes.join(Block.box(0, 0, 8, 8, 16, 16), Block.box(0, 0, 0, 8, 8, 8), BooleanOp.OR),
            Direction.SOUTH, Shapes.join(Block.box(8, 0, 0, 16, 16, 8), Block.box(8, 0, 8, 16, 8, 16), BooleanOp.OR),
            Direction.EAST, Shapes.join(Block.box(0, 0, 0, 8, 16, 8), Block.box(8, 0, 0, 16, 8, 8), BooleanOp.OR),
            Direction.WEST, Shapes.join(Block.box(8, 0, 8, 16, 16, 16), Block.box(0, 0, 8, 8, 8, 16), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> TOP_LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Shapes.join(Block.box(8, 0, 8, 16, 16, 16), Block.box(8, 8, 0, 16, 16, 8), BooleanOp.OR),
            Direction.SOUTH, Shapes.join(Block.box(0, 0, 0, 8, 16, 8), Block.box(0, 8, 8, 8, 16, 16), BooleanOp.OR),
            Direction.EAST, Shapes.join(Block.box(0, 0, 8, 8, 16, 16), Block.box(8, 8, 8, 16, 16, 16), BooleanOp.OR),
            Direction.WEST, Shapes.join(Block.box(8, 0, 0, 16, 16, 8), Block.box(0, 8, 0, 8, 16, 8), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> TOP_RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Shapes.join(Block.box(0, 0, 8, 8, 16, 16), Block.box(0, 8, 0, 8, 16, 8), BooleanOp.OR),
            Direction.SOUTH, Shapes.join(Block.box(8, 0, 0, 16, 16, 8), Block.box(8, 8, 8, 16, 16, 16), BooleanOp.OR),
            Direction.EAST, Shapes.join(Block.box(0, 0, 0, 8, 16, 8), Block.box(8, 8, 0, 16, 16, 8), BooleanOp.OR),
            Direction.WEST, Shapes.join(Block.box(8, 0, 8, 16, 16, 16), Block.box(0, 8, 8, 8, 16, 16), BooleanOp.OR)));

    public VerticalCornerSlabBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TYPE, VerticalCornerSlabShape.RIGHT)
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
        VerticalCornerSlabShape verticalCornerSlabShape = pState.getValue(TYPE);
        switch (verticalCornerSlabShape) {
            case TOP_LEFT -> {
                return TOP_LEFT_SHAPE.get(pState.getValue(FACING));
            }
            case TOP_RIGHT -> {
                return TOP_RIGHT_SHAPE.get(pState.getValue(FACING));
            }
            case LEFT -> {
                return LEFT_SHAPE.get(pState.getValue(FACING));
            }
            default -> {
                return RIGHT_SHAPE.get(pState.getValue(FACING));
            }
        }
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        double hitY = pContext.getClickLocation().y - (double) blockpos.getY();
        double hitX = pContext.getClickLocation().x - (double) blockpos.getX();
        double hitZ = pContext.getClickLocation().z - (double) blockpos.getZ();
        Direction direction = pContext.getHorizontalDirection().getOpposite();

        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);

        if ((direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.RIGHT);
        } else if ((direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY < 0.5) {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.LEFT);
        } else if ((direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY < 0.5) {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.RIGHT);
        } else if ((direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY < 0.5) {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.LEFT);
        } else if ((direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.TOP_RIGHT);
        } else if ((direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY > 0.5) {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.TOP_LEFT);
        } else if ((direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY > 0.5) {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.TOP_RIGHT);
        } else if ((direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY > 0.5) {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.TOP_LEFT);
        } else {
            return blockstate1.setValue(TYPE, VerticalCornerSlabShape.RIGHT);
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