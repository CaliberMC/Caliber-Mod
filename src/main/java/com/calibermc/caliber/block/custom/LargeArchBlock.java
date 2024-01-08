package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.*;
import com.calibermc.caliber.block.shapes.trim.LargeArchTrim;
import com.calibermc.caliber.util.ModBlockStateProperties;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
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

import javax.annotation.Nullable;
import java.util.Map;
import java.util.stream.Stream;

import static net.minecraft.core.Direction.*;

public class LargeArchBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<LargeArchShape> TYPE = ModBlockStateProperties.LARGE_ARCH_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<LargeArchTrim> TRIM = ModBlockStateProperties.LARGE_ARCH_TRIM;

    public static final Map<Direction, VoxelShape> CORNER_LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Stream.of(
                    Block.box(0, 13.00001, 0, 16, 16, 16),
                    Block.box(0, 4.98438, 0, 2, 13.00001, 16),
                    Block.box(0, 4.98438, 0, 16, 13.00001, 2)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH, Stream.of(
                    Block.box(0, 13.00001, 0, 16, 16, 16),
                    Block.box(14, 4.98438, 0, 16, 13.00001, 16),
                    Block.box(0, 4.98438, 14, 16, 13.00001, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST, Stream.of(
                    Block.box(0, 13.00001, 0, 16, 16, 16),
                    Block.box(0, 4.98438, 0, 16, 13.00001, 2),
                    Block.box(14, 4.98438, 0, 16, 13.00001, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST, Stream.of(
                    Block.box(0, 13.00001, 0, 16, 16, 16),
                    Block.box(0, 4.98438, 14, 16, 13.00001, 16),
                    Block.box(0, 4.98438, 0, 2, 13.00001, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public static final Map<Direction, VoxelShape> CORNER_RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Stream.of(
                    Block.box(0, 13.00001, 0, 16, 16, 16),
                    Block.box(0, 4.98438, 0, 16, 13.00001, 2),
                    Block.box(14, 4.98438, 0, 16, 13.00001, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            SOUTH, Stream.of(
                    Block.box(0, 13.00001, 0, 16, 16, 16),
                    Block.box(0, 4.98438, 14, 16, 13.00001, 16),
                    Block.box(0, 4.98438, 0, 2, 13.00001, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            EAST, Stream.of(
                    Block.box(0, 13.00001, 0, 16, 16, 16),
                    Block.box(14, 4.98438, 0, 16, 13.00001, 16),
                    Block.box(0, 4.98438, 14, 16, 13.00001, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            WEST, Stream.of(
                    Block.box(0, 13.00001, 0, 16, 16, 16),
                    Block.box(0, 4.98438, 0, 2, 13.00001, 16),
                    Block.box(0, 4.98438, 0, 16, 13.00001, 2)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public static final Map<Direction, VoxelShape> STRAIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Shapes.join(Block.box(0, 13.00001, 0, 16, 16, 16), Block.box(0, 4.98438, 0, 16, 13.00001, 2), BooleanOp.OR),
            SOUTH, Shapes.join(Block.box(0, 13.00001, 0, 16, 16, 16), Block.box(0, 4.98438, 14, 16, 13.00001, 16), BooleanOp.OR),
            EAST, Shapes.join(Block.box(0, 13.00001, 0, 16, 16, 16), Block.box(14, 4.98438, 0, 16, 13.00001, 16), BooleanOp.OR),
            WEST, Shapes.join(Block.box(0, 13.00001, 0, 16, 16, 16), Block.box(0, 4.98438, 0, 2, 13.00001, 16), BooleanOp.OR)));

    public static final VoxelShape SHAPE = Block.box(0, 13, 0, 16, 16, 16);

    public LargeArchBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState() //this.stateDefinition.any()
                .setValue(TRIM, LargeArchTrim.BOTH)
                .setValue(FACING, NORTH)
                .setValue(TYPE, LargeArchShape.STRAIGHT)
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

//    @Override
//    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
//        return SHAPE;
//    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        LargeArchShape archShape = pState.getValue(TYPE);

        switch (archShape) {
            case CORNER_LEFT -> {
                return CORNER_LEFT_SHAPE.get(pState.getValue(FACING));
            }
            case CORNER_RIGHT -> {
                return CORNER_RIGHT_SHAPE.get(pState.getValue(FACING));
            }
            case CORNER_OUTER_LEFT, CORNER_OUTER_RIGHT -> {
                return SHAPE;
            }
            case STRAIGHT -> {
                return STRAIGHT_SHAPE.get(pState.getValue(FACING));
            }
        }
        return null;
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection()) //.getOpposite()
                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);

        return blockstate1.setValue(TYPE, getArchShape(blockstate1, pContext.getLevel(), blockpos));
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        if (pFacing.getAxis().isHorizontal()) {
            // Set the TYPE value based on the ArchShape
            pState = pState.setValue(TYPE, getArchShape(pState, pLevel, pCurrentPos));

            // Set the TRIM value
            pState = pState.setValue(TRIM, getTrim(pState, pLevel, pCurrentPos));
        } else {
            pState = super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
        }

        return pState;
    }

    private LargeArchShape getArchShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction facing = pState.getValue(FACING);
        Direction opposite = facing.getOpposite();
        boolean front = isArch(pLevel.getBlockState(pPos.relative(facing)));
        boolean back = isArch(pLevel.getBlockState(pPos.relative(opposite)));
        boolean left = isArch(pLevel.getBlockState(pPos.relative(facing.getCounterClockWise())));
        boolean right = isArch(pLevel.getBlockState(pPos.relative(facing.getClockWise())));
        boolean leftIsAir = isAir(pLevel.getBlockState(pPos.relative(facing.getCounterClockWise())));
        boolean rightIsAir = isAir(pLevel.getBlockState(pPos.relative(facing.getClockWise())));

        if (pState.getValue(TYPE) == LargeArchShape.CORNER_OUTER_LEFT || pState.getValue(TYPE) == LargeArchShape.CORNER_OUTER_RIGHT) {
            return pState.getValue(TYPE);
        }
        if ((rightIsAir) || (leftIsAir)) {
            return LargeArchShape.STRAIGHT;
        }
        if ((back && right && !left) || (front && left && !right)) {
            return LargeArchShape.CORNER_LEFT;
        }
        if ((back && left && !right) || (front && right && !left)) {
            return LargeArchShape.CORNER_RIGHT;
        }
        return LargeArchShape.STRAIGHT;
    }

    private LargeArchTrim getTrim(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction facing = pState.getValue(FACING);
        boolean airRight = isAir(pLevel.getBlockState(pPos.relative(facing.getClockWise())));
        boolean airLeft = isAir(pLevel.getBlockState(pPos.relative(facing.getCounterClockWise())));

        if (pState.getValue(TYPE) == LargeArchShape.STRAIGHT) {
            if (airLeft && airRight) {
                return LargeArchTrim.BOTH;
            }
            if (!airLeft && airRight) {
                return LargeArchTrim.RIGHT;
            }
            if (airLeft && !airRight) {
                return LargeArchTrim.LEFT;
            }
            return LargeArchTrim.NONE;
        }
        return LargeArchTrim.NONE;
    }

//    private LargeArchTrim getTrim(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
//        Direction facing = pState.getValue(FACING);
//        boolean airLeft = isAir(pLevel.getBlockState(pPos.relative(facing.getClockWise())));
//        boolean airRight = isAir(pLevel.getBlockState(pPos.relative(facing.getCounterClockWise())));
//
//        if (pState.getValue(TYPE) == LargeArchShape.STRAIGHT) {
//            // Check for blocks on both sides (front and back)
//            if (!airLeft && !airRight) {
//                return LargeArchTrim.NONE;
//            }
//            // Check for no blocks on either side (front and back)
//            if (airLeft && airRight) {
//                return LargeArchTrim.BOTH;
//            }
//            // Check for block only on the left
//            if (airRight) {
//                return LargeArchTrim.RIGHT;
//            }
//            // Check for block only on the right
//            if (airLeft) {
//                return LargeArchTrim.LEFT;
//            }
//
//            return LargeArchTrim.BOTH;
//        }
//        return LargeArchTrim.NONE;
//    }

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