package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.ArchShape;
import com.calibermc.caliber.block.shapes.LeftRightShape;
import com.calibermc.caliber.block.shapes.LeftRightShape;
import com.calibermc.caliber.block.shapes.WindowShape;
import com.calibermc.caliber.util.ModBlockStateProperties;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
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
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.stream.Stream;

import static com.calibermc.caliber.block.shapes.LeftRightShape.*;
import static net.minecraft.core.Direction.*;

public class LargeArchBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<LeftRightShape> TYPE = ModBlockStateProperties.LEFT_RIGHT_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty TRIM = ModBlockStateProperties.TRIM;

    public static final Map<Direction, VoxelShape> LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Stream.of(
                    Block.box(0, 12.85938, 0, 16, 16, 16),
                    Block.box(8.0625, 10.85938, 0, 16, 12.85938, 16),
                    Block.box(14, 4.98438, 0, 16, 10.85938, 16),
                    Block.box(11.375, 8.23438, 0, 14, 10.85938, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH, Stream.of(
                    Block.box(0, 12.85938, 0, 16, 16, 16),
                    Block.box(0, 10.85938, 0, 7.9375, 12.85938, 16),
                    Block.box(0, 4.98438, 0, 2, 10.85938, 16),
                    Block.box(2, 8.23438, 0, 4.625, 10.85938, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST, Stream.of(
                    Block.box(0, 12.85938, 0, 16, 16, 16),
                    Block.box(0, 10.85938, 8.0625, 16, 12.85938, 16),
                    Block.box(0, 4.98438, 14, 16, 10.85938, 16),
                    Block.box(0, 8.23438, 11.375, 16, 10.85938, 14)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST, Stream.of(
                    Block.box(0, 12.85938, 0, 16, 16, 16),
                    Block.box(0, 10.85938, 0, 16, 12.85938, 7.9375),
                    Block.box(0, 4.98438, 0, 16, 10.85938, 2),
                    Block.box(0, 8.23438, 2, 16, 10.85938, 4.625)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public static final Map<Direction, VoxelShape> RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Stream.of(
                    Block.box(0, 12.85938, 0, 16, 16, 16),
                    Block.box(0, 10.85938, 0, 7.9375, 12.85938, 16),
                    Block.box(0, 4.98438, 0, 2, 10.85938, 16),
                    Block.box(2, 8.23438, 0, 4.625, 10.85938, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH, Stream.of(
                    Block.box(0, 12.85938, 0, 16, 16, 16),
                    Block.box(8.0625, 10.85938, 0, 16, 12.85938, 16),
                    Block.box(14, 4.98438, 0, 16, 10.85938, 16),
                    Block.box(11.375, 8.23438, 0, 14, 10.85938, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST, Stream.of(
                    Block.box(0, 12.85938, 0, 16, 16, 16),
                    Block.box(0, 10.85938, 0, 16, 12.85938, 7.9375),
                    Block.box(0, 4.98438, 0, 16, 10.85938, 2),
                    Block.box(0, 8.23438, 2, 16, 10.85938, 4.625)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST, Stream.of(
                    Block.box(0, 12.85938, 0, 16, 16, 16),
                    Block.box(0, 10.85938, 8.0625, 16, 12.85938, 16),
                    Block.box(0, 4.98438, 14, 16, 10.85938, 16),
                    Block.box(0, 8.23438, 11.375, 16, 10.85938, 14)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public LargeArchBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(TRIM, Boolean.FALSE)
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
        pBuilder.add(TRIM, FACING, TYPE, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        LeftRightShape leftRightShape = pState.getValue(TYPE);
        if (leftRightShape == LEFT) {
            return LEFT_SHAPE.get(pState.getValue(FACING));
        } else {
            return RIGHT_SHAPE.get(pState.getValue(FACING));
        }
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        double hitX = pContext.getClickLocation().x - (double) blockpos.getX();
        double hitZ = pContext.getClickLocation().z - (double) blockpos.getZ();
        Direction direction = pContext.getHorizontalDirection().getOpposite();
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                .setValue(TRIM, Boolean.FALSE).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));

        if (direction == Direction.NORTH && hitX < 0.5) {
            return blockstate1.setValue(TYPE, LeftRightShape.RIGHT).setValue(TRIM, Boolean.TRUE);
        } else if (direction == Direction.SOUTH && hitX > 0.5) {
            return blockstate1.setValue(TYPE, LeftRightShape.RIGHT).setValue(TRIM, Boolean.TRUE);
        } else if (direction == Direction.EAST && hitZ < 0.5) {
            return blockstate1.setValue(TYPE, LeftRightShape.RIGHT).setValue(TRIM, Boolean.TRUE);
        } else if (direction == Direction.WEST && hitZ > 0.5) {
            return blockstate1.setValue(TYPE, LeftRightShape.RIGHT).setValue(TRIM, Boolean.TRUE);
        } else {
            return blockstate1.setValue(TYPE, LEFT);
        }
    }

    @Override
    public @NotNull BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        boolean frontIsAir = isAir(pLevel.getBlockState(pCurrentPos.relative(pState.getValue(FACING))));
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }
        return pState.setValue(TRIM, frontIsAir ? Boolean.TRUE : Boolean.FALSE);
    }

    public static boolean isArch(BlockState pState) {
        return pState.getBlock() instanceof LargeArchBlock;
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