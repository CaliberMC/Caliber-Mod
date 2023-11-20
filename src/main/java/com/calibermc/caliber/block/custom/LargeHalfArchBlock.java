package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.LeftRightShape;
import com.calibermc.caliber.util.ModBlockStateProperties;
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
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.stream.Stream;

import static com.calibermc.caliber.block.shapes.LeftRightShape.LEFT;
import static com.calibermc.caliber.block.shapes.LeftRightShape.RIGHT;
import static net.minecraft.core.Direction.*;

public class LargeHalfArchBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<LeftRightShape> TYPE = ModBlockStateProperties.LEFT_RIGHT_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final Map<Direction, VoxelShape> SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Block.box(0, 13, 8, 16, 16, 16),
            SOUTH, Block.box(0, 13, 0, 16, 16, 8),
            EAST, Block.box(0, 13, 0, 8, 16, 16),
            WEST, Block.box(8, 13, 0, 16, 16, 16)));

    public LargeHalfArchBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(FACING, NORTH)
                .setValue(TYPE, RIGHT)
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
        return SHAPE.get(pState.getValue(FACING));
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        double hitX = pContext.getClickLocation().x - (double) blockpos.getX();
        double hitZ = pContext.getClickLocation().z - (double) blockpos.getZ();
        Direction direction = pContext.getHorizontalDirection().getOpposite();
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));

        if (direction == Direction.NORTH && hitX < 0.5) {
            return blockstate1.setValue(TYPE, LeftRightShape.RIGHT);
        } else if (direction == Direction.SOUTH && hitX > 0.5) {
            return blockstate1.setValue(TYPE, LeftRightShape.RIGHT);
        } else if (direction == Direction.EAST && hitZ < 0.5) {
            return blockstate1.setValue(TYPE, LeftRightShape.RIGHT);
        } else if (direction == Direction.WEST && hitZ > 0.5) {
            return blockstate1.setValue(TYPE, LeftRightShape.RIGHT);
        } else {
            return blockstate1.setValue(TYPE, LEFT);
        }
    }

    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
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