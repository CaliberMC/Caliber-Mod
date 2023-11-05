package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.properties.VerticalQuarterShape;
import com.calibermc.caliber.util.ModBlockStateProperties;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.Map;

import static net.minecraft.core.Direction.*;
import static net.minecraft.core.Direction.WEST;

public class VerticalQuarterBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<VerticalQuarterShape> TYPE = ModBlockStateProperties.VERTICAL_QUARTER_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final Map<Direction, VoxelShape> LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Block.box(8, 0, 8, 16, 16, 16),
            Direction.SOUTH, Block.box(0, 0, 0, 8, 16, 8),
            Direction.EAST, Block.box(0, 0, 8, 8, 16, 16),
            Direction.WEST, Block.box(8, 0, 0, 16, 16, 8)));

    public static final Map<Direction, VoxelShape> RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Block.box(0, 0, 8, 8, 16, 16),
            Direction.SOUTH, Block.box(8, 0, 0, 16, 16, 8),
            Direction.EAST, Block.box(0, 0, 0, 8, 16, 8),
            Direction.WEST, Block.box(8, 0, 8, 16, 16, 16)));

    public VerticalQuarterBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(FACING, NORTH)
                .setValue(TYPE, VerticalQuarterShape.RIGHT)
                .setValue(WATERLOGGED, Boolean.valueOf(false)));
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
        VerticalQuarterShape verticalQuarterShape = pState.getValue(TYPE);
        switch (verticalQuarterShape) {
            case DOUBLE-> {
                return VerticalSlabBlock.SHAPE.get(pState.getValue(FACING));
            }
            case LEFT-> {
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

        if (blockstate.is(this)) {
            if (blockstate.getValue(TYPE) == VerticalQuarterShape.RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5)) {
                return blockstate.setValue(TYPE, VerticalQuarterShape.DOUBLE).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == VerticalQuarterShape.LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5)) {
                return blockstate.setValue(TYPE, VerticalQuarterShape.DOUBLE).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == VerticalQuarterShape.RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5)) {
                return blockstate.setValue(TYPE, VerticalQuarterShape.DOUBLE).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == VerticalQuarterShape.LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5)) {
                return blockstate.setValue(TYPE, VerticalQuarterShape.DOUBLE).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
            }
        } else {
            FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                    .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));

            if (direction == Direction.NORTH && hitX < 0.5) {
                return blockstate1.setValue(TYPE, VerticalQuarterShape.RIGHT);
            } else if (direction == Direction.SOUTH && hitX > 0.5) {
                return blockstate1.setValue(TYPE, VerticalQuarterShape.RIGHT);
            } else if (direction == Direction.EAST && hitZ < 0.5) {
                return blockstate1.setValue(TYPE, VerticalQuarterShape.RIGHT);
            } else if (direction == Direction.WEST && hitZ > 0.5) {
                return blockstate1.setValue(TYPE, VerticalQuarterShape.RIGHT);
            } else {
                return blockstate1.setValue(TYPE, VerticalQuarterShape.LEFT);
            }
        }
        return blockstate;
    }

    @Override
    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        ItemStack itemstack = pUseContext.getItemInHand();
        VerticalQuarterShape verticalQuarterShape = pState.getValue(TYPE);
        if (verticalQuarterShape != VerticalQuarterShape.DOUBLE && itemstack.is(this.asItem())) {
                return true;
        } else {
            return false;
        }
    }

    @Override
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