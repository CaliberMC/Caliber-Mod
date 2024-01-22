package com.calibermc.caliberlib.block.custom;

import com.calibermc.caliberlib.block.shapes.RoofPeakShape;
import com.calibermc.caliberlib.block.shapes.RoofShape;
import com.calibermc.caliberlib.util.ModBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class RoofPeakBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    //    public static final EnumProperty<RoofPitch> PITCH = ModBlockStateProperties.ROOF_PITCH;
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<RoofPeakShape> TYPE = ModBlockStateProperties.INTERSECTION_SHAPE;

    protected static final VoxelShape BOTTOM_SHAPE = Block.box(0, 0, 0, 16, 8, 16);
    protected static final VoxelShape TOP_SHAPE = Block.box(0, .01, 0, 16, 16, 16);

    public RoofPeakBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
//                .setValue(PITCH, RoofPitch.PITCH_45)
                .setValue(FACING, Direction.NORTH)
                .setValue(TYPE, RoofPeakShape.STRAIGHT)
                .setValue(HALF, Half.BOTTOM)
                .setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, TYPE, HALF, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Half Half = pState.getValue(HALF);
        switch (Half) {
            case TOP -> {
                return TOP_SHAPE;
            }
            default -> {
                return BOTTOM_SHAPE;
            }
        }
    }

//    @Override
//    @Nullable
//    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
//        BlockPos blockpos = pContext.getClickedPos();
//        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
//        BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection()) //.getOpposite()
//                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
//
//        return blockstate1.setValue(TYPE, getRoofShape(blockstate1, pContext.getLevel(), blockpos));//.setValue(PITCH, getRoofPitch(blockstate1, pContext.getLevel(), blockpos));
//    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        Level level = pContext.getLevel();
        BlockState blockstate = level.getBlockState(blockpos);

        if (blockstate.is(this)) {
            return blockstate.setValue(HALF, Half.TOP).setValue(WATERLOGGED, Boolean.FALSE);
        } else {
            FluidState fluidstate = level.getFluidState(blockpos);
            Direction facing = pContext.getHorizontalDirection().getOpposite();
            Half half = (pContext.getClickedFace() != Direction.DOWN && (pContext.getClickedFace() == Direction.UP ||
                    !(pContext.getClickLocation().y - (double) blockpos.getY() > 0.5D))) ? Half.BOTTOM : Half.TOP;

            BlockState blockstate1 = this.defaultBlockState()
                    .setValue(FACING, facing)
                    .setValue(HALF, half)
                    .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);

            // Determine RoofShape based on surrounding blocks
            RoofPeakShape roofShape = getRoofShape(blockstate1, level, blockpos);
            blockstate1 = blockstate1.setValue(TYPE, roofShape);

            return blockstate1;
        }
    }

    @Override
    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        ItemStack itemstack = pUseContext.getItemInHand();
        Half Half = pState.getValue(HALF);
        if (Half != net.minecraft.world.level.block.state.properties.Half.TOP && itemstack.is(this.asItem())) {
            if (pUseContext.replacingClickedOnBlock()) {
                boolean flag = pUseContext.getClickLocation().y - (double) pUseContext.getClickedPos().getY() > 0.5D;
                Direction direction = pUseContext.getClickedFace();
                if (Half == net.minecraft.world.level.block.state.properties.Half.BOTTOM) {
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

    /**
     * Update the provided state given the provided neighbor direction and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific direction passed in.
     */
    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        if (pFacing.getAxis().isHorizontal()) {
            // Set the TYPE value based on the BlockShape
            pState = pState.setValue(TYPE, getRoofShape(pState, pLevel, pCurrentPos));
            // Set the PITCH value based on the BlockShape
//            pState = pState.setValue(PITCH, getRoofPitch(pState, pLevel, pCurrentPos));

        } else {
            pState = super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
        }

        return pState;
    }


    private static RoofPeakShape getRoofShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction facing = pState.getValue(FACING);
        Direction opposite = facing.getOpposite();
        boolean front = isRoof(pLevel.getBlockState(pPos.relative(facing)));
        boolean back = isRoof(pLevel.getBlockState(pPos.relative(opposite)));
        boolean left = isRoof(pLevel.getBlockState(pPos.relative(facing.getCounterClockWise())));
        boolean right = isRoof(pLevel.getBlockState(pPos.relative(facing.getClockWise())));

        boolean downFrontLeft = isHip(pLevel.getBlockState(pPos.below().relative(facing).relative(facing.getCounterClockWise())));
        boolean downFrontRight = isHip(pLevel.getBlockState(pPos.below().relative(facing).relative(facing.getClockWise())));
        boolean downBackLeft = isHip(pLevel.getBlockState(pPos.below().relative(opposite).relative(opposite.getCounterClockWise())));
        boolean downBackRight = isHip(pLevel.getBlockState(pPos.below().relative(opposite).relative(opposite.getClockWise())));

        // Check for peak cap
        if (!front && !back && !left && !right) {
            return RoofPeakShape.CAP;
        }
        // Check for corner (left)
        if ((left && front && !right && !back) || (right && back && !left && !front)) {
            return RoofPeakShape.CORNER_LEFT;
        }
        // Check for corner (right)
        if ((right && front && !left && !back) || (left && back && !right && !front)) {
            return RoofPeakShape.CORNER_RIGHT;
        }
        // Check for 3-way intersection (forward)
        if (back && left && right && !front) {
            return RoofPeakShape.FACING_T;
        }
        // Check for 3-way intersection (backward)
        if (front && left && right && !back) {
            return RoofPeakShape.OPPOSITE_T;
        }
        // Check for 3-way intersection (left)
        if (left && front && back && !right) {
            return RoofPeakShape.LEFT_T;
        }
        // Check for 3-way intersection (right)
        if (right && front && back && !left) {
            return RoofPeakShape.RIGHT_T;
        }
        // Check for 4-way intersection
        if (right && left && front && back) {
            return RoofPeakShape.CROSS;
        }
        // Check for roof end hip
        if ((downFrontRight || downFrontLeft || downBackRight || downBackLeft)) {
            if (front && !back && !left && !right) {
                return RoofPeakShape.END_FACING;
            }
            if (!front && back && !left && !right) {
                return RoofPeakShape.END_OPPOSITE;
            }
        }
        return RoofPeakShape.STRAIGHT;
    }

//    private static RoofPitch getRoofPitch(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
//        Direction facing = pState.getValue(FACING);
//        Direction opposite = facing.getOpposite();
//        pPos = pPos.below();
//        BlockState frontBlock = pLevel.getBlockState(pPos.relative(facing));
//
//        if(isRoof(frontBlock)) {
//            return frontBlock.getValue(PITCH);
//        }
//
//        BlockState backBlock = pLevel.getBlockState(pPos.relative(opposite));
//        if(isRoof(backBlock)) {
//            return backBlock.getValue(PITCH);
//        }
//
//        BlockState leftBlock = pLevel.getBlockState(pPos.relative(facing.getCounterClockWise()));
//        if(isRoof(leftBlock)) {
//            return leftBlock.getValue(PITCH);
//        }
//
//        BlockState rightBlock = pLevel.getBlockState(pPos.relative(facing.getClockWise()));
//        if(isRoof(rightBlock)) {
//            return rightBlock.getValue(PITCH);
//        }
//
//        return RoofPitch.PITCH_45;
//
//    }

    public static boolean isRoof(BlockState pState) {
        return pState.getBlock() instanceof RoofPeakBlock;
    }

    public static boolean isHip(BlockState pState) {
        return pState.getBlock() instanceof com.calibermc.caliberlib.block.custom.Roof45Block && (pState.getValue(com.calibermc.caliberlib.block.custom.Roof45Block.TYPE) == RoofShape.OUTER_LEFT || pState.getValue(Roof45Block.TYPE) == RoofShape.OUTER_RIGHT);
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