package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.properties.EighthShape;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Map;

import static net.minecraft.core.Direction.*;

public class EighthBlock extends Block implements SimpleWaterloggedBlock {

    private static final Logger LOGGER = LogManager.getLogger();

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<EighthShape> TYPE = ModBlockStateProperties.EIGHTH_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final Map<Direction, VoxelShape> LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Block.box(8, 0, 8, 16, 8, 16),
            SOUTH, Block.box(0, 0, 0, 8, 8, 8),
            EAST, Block.box(0, 0, 8, 8, 8, 16),
            WEST, Block.box(8, 0, 0, 16, 8, 8)));

    public static final Map<Direction, VoxelShape> RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Block.box(0, 0, 8, 8, 8, 16),
            SOUTH, Block.box(8, 0, 0, 16, 8, 8),
            EAST, Block.box(0, 0, 0, 8, 8, 8),
            WEST, Block.box(8, 0, 8, 16, 8, 16)));

    public static final Map<Direction, VoxelShape> TOP_LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Block.box(8, 8, 8, 16, 16, 16),
            SOUTH, Block.box(0, 8, 0, 8, 16, 8),
            EAST, Block.box(0, 8, 8, 8, 16, 16),
            WEST, Block.box(8, 8, 0, 16, 16, 8)));

    public static final Map<Direction, VoxelShape> TOP_RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Block.box(0, 8, 8, 8, 16, 16),
            SOUTH, Block.box(8, 8, 0, 16, 16, 8),
            EAST, Block.box(0, 8, 0, 8, 16, 8),
            WEST, Block.box(8, 8, 8, 16, 16, 16)));


    public EighthBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(FACING, NORTH)
                .setValue(TYPE, EighthShape.RIGHT)
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
        EighthShape eighthShape = pState.getValue(TYPE);
        switch (eighthShape) {
            case DOUBLE-> {
                return QuarterBlock.BOTTOM_SHAPE.get(pState.getValue(FACING));
            }
            case DOUBLE_TOP -> {
                return QuarterBlock.TOP_SHAPE.get(pState.getValue(FACING));
            }
            case DOUBLE_LEFT -> {
                return VerticalQuarterBlock.LEFT_SHAPE.get(pState.getValue(FACING));
            }
            case DOUBLE_RIGHT -> {
                return VerticalQuarterBlock.RIGHT_SHAPE.get(pState.getValue(FACING));
            }
            case TOP_RIGHT -> { // TOP
                return TOP_RIGHT_SHAPE.get(pState.getValue(FACING));
            }
            case TOP_LEFT -> {
                return TOP_LEFT_SHAPE.get(pState.getValue(FACING));
            }
            case LEFT-> {
                return LEFT_SHAPE.get(pState.getValue(FACING));
            }
            default -> {
                return RIGHT_SHAPE.get(pState.getValue(FACING));

                // TODO: MAKE ADDITIONAL STATES FOR SLABS, VERT SLABS, CORNERS AND FULL BLOCKS
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
//        Direction direction = pContext.getClickedFace();
        Direction direction = pContext.getHorizontalDirection().getOpposite();


        if (blockstate.is(this)) {
            if (blockstate.getValue(TYPE) == EighthShape.RIGHT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY < 0.5) { //
                return blockstate.setValue(TYPE, EighthShape.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_RIGHT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
//            } else if (blockstate.getValue(TYPE) == EighthShape.DOUBLE_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5)) {
//                return blockstate.setValue(TYPE, EighthShape.DOUBLE_RUL).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
//            } else if (blockstate.getValue(TYPE) == EighthShape.DOUBLE_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5)) {
//                return blockstate.setValue(TYPE, EighthShape.DOUBLE_RLL).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_RIGHT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY > 0.5) { //
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_RIGHT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
//            } else if (blockstate.getValue(TYPE) == EighthShape.DOUBLE_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
//                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == EighthShape.LEFT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_LEFT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_LEFT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_LEFT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == EighthShape.RIGHT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_RIGHT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_RIGHT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_RIGHT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == EighthShape.LEFT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_LEFT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_LEFT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_LEFT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == EighthShape.TOP_LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, EighthShape.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
            }


        } else {
            FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                    .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));

            if ((direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate1.setValue(TYPE, EighthShape.RIGHT);
            } else if ((direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5)  && hitY > 0.5) {
                return blockstate1.setValue(TYPE, EighthShape.TOP_RIGHT);
            } else if ((direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5)  && hitY < 0.5) {
                return blockstate1.setValue(TYPE, EighthShape.LEFT);
            } else if ((direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5)  && hitY > 0.5) {
                return blockstate1.setValue(TYPE, EighthShape.TOP_LEFT);

            } else if ((direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5)  && hitY < 0.5) {
                return blockstate1.setValue(TYPE, EighthShape.RIGHT);
            } else if ((direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5)  && hitY > 0.5) {
                return blockstate1.setValue(TYPE, EighthShape.TOP_RIGHT);
            } else if ((direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5)  && hitY < 0.5) {
                return blockstate1.setValue(TYPE, EighthShape.LEFT);
            } else if ((direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5)  && hitY > 0.5) {
                return blockstate1.setValue(TYPE, EighthShape.TOP_LEFT);

            } else {
                return blockstate1.setValue(TYPE, EighthShape.TOP_RIGHT);
            }
        }
        return blockstate;
    }


    @Override
    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        ItemStack itemstack = pUseContext.getItemInHand();
        EighthShape eighthShape = pState.getValue(TYPE);
//        if (eighthShape != EighthShape.DOUBLE && itemstack.is(this.asItem())) {
        if ((eighthShape == EighthShape.LEFT ||
                eighthShape == EighthShape.RIGHT ||
                eighthShape == EighthShape.TOP_LEFT ||
                eighthShape == EighthShape.TOP_RIGHT) &&
                itemstack.is(this.asItem())) {
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