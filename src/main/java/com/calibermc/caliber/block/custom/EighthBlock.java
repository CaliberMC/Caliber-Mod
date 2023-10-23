package com.calibermc.caliber.block.custom;

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
    public static final EnumProperty<ShapeType> TYPE = ModBlockStateProperties.SHAPE_TYPE;
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
                .setValue(TYPE, ShapeType.RIGHT)
                .setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public boolean useShapeForLightOcclusion(BlockState pState) {
        return true;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, TYPE, WATERLOGGED);
    }

    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        ShapeType shapeType = pState.getValue(TYPE);
        switch (shapeType) {
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
            if (blockstate.getValue(TYPE) == ShapeType.RIGHT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY < 0.5) { //
                return blockstate.setValue(TYPE, ShapeType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_RIGHT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
//            } else if (blockstate.getValue(TYPE) == ShapeType.DOUBLE_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5)) {
//                return blockstate.setValue(TYPE, ShapeType.DOUBLE_RUL).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
//            } else if (blockstate.getValue(TYPE) == ShapeType.DOUBLE_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5)) {
//                return blockstate.setValue(TYPE, ShapeType.DOUBLE_RLL).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_RIGHT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY > 0.5) { //
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_RIGHT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
//            } else if (blockstate.getValue(TYPE) == ShapeType.DOUBLE_RIGHT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
//                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == ShapeType.LEFT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_LEFT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_LEFT && (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_LEFT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_LEFT && (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == ShapeType.RIGHT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_RIGHT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_RIGHT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_RIGHT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_RIGHT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == ShapeType.LEFT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_LEFT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));

            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_LEFT && (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_LEFT).setValue(WATERLOGGED, Boolean.valueOf(false));
            } else if (blockstate.getValue(TYPE) == ShapeType.TOP_LEFT && (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) && hitY > 0.5) {
                return blockstate.setValue(TYPE, ShapeType.DOUBLE_TOP).setValue(FACING, pContext.getClickedFace().getCounterClockWise()).setValue(WATERLOGGED, Boolean.valueOf(false));
            }


        } else {
            FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                    .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));

            if ((direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) && hitY < 0.5) {
                return blockstate1.setValue(TYPE, ShapeType.RIGHT);
            } else if ((direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5)  && hitY > 0.5) {
                return blockstate1.setValue(TYPE, ShapeType.TOP_RIGHT);
            } else if ((direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5)  && hitY < 0.5) {
                return blockstate1.setValue(TYPE, ShapeType.LEFT);
            } else if ((direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5)  && hitY > 0.5) {
                return blockstate1.setValue(TYPE, ShapeType.TOP_LEFT);

            } else if ((direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5)  && hitY < 0.5) {
                return blockstate1.setValue(TYPE, ShapeType.RIGHT);
            } else if ((direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5)  && hitY > 0.5) {
                return blockstate1.setValue(TYPE, ShapeType.TOP_RIGHT);
            } else if ((direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5)  && hitY < 0.5) {
                return blockstate1.setValue(TYPE, ShapeType.LEFT);
            } else if ((direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5)  && hitY > 0.5) {
                return blockstate1.setValue(TYPE, ShapeType.TOP_LEFT);

            } else {
                return blockstate1.setValue(TYPE, ShapeType.TOP_RIGHT);
            }
        }
        return blockstate;
    }
    

    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        ItemStack itemstack = pUseContext.getItemInHand();
        ShapeType shapeType = pState.getValue(TYPE);
//        if (shapeType != ShapeType.DOUBLE && itemstack.is(this.asItem())) {
        if ((shapeType == ShapeType.LEFT ||
                shapeType == ShapeType.RIGHT ||
                shapeType == ShapeType.TOP_LEFT ||
                shapeType == ShapeType.TOP_RIGHT) &&
                itemstack.is(this.asItem())) {
                return true;
        } else {
            return false;
        }
    }

    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    public boolean placeLiquid(LevelAccessor pLevel, BlockPos pPos, BlockState pState, FluidState pFluidState) {
        return pState.getValue(TYPE) != ShapeType.DOUBLE ? SimpleWaterloggedBlock.super.placeLiquid(pLevel, pPos, pState, pFluidState) : false;
    }

    public boolean canPlaceLiquid(BlockGetter pLevel, BlockPos pPos, BlockState pState, Fluid pFluid) {
        return pState.getValue(TYPE) != ShapeType.DOUBLE ? SimpleWaterloggedBlock.super.canPlaceLiquid(pLevel, pPos, pState, pFluid) : false;
    }

    /**
     * Update the provided state given the provided neighbor direction and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific direction passed in.
     */
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
    }

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