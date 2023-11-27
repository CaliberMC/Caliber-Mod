package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.ArchShape;
import com.calibermc.caliber.block.shapes.trim.ArchTrim;
import com.calibermc.caliber.block.shapes.trim.LargeArchTrim;
import com.calibermc.caliber.util.ModBlockStateProperties;
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
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

import static net.minecraft.core.Direction.*;

public class ArchBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<ArchShape> TYPE = ModBlockStateProperties.ARCH_SHAPE;
//    public static final IntegerProperty TRIM = ModBlockStateProperties.ARCH_TRIM;
public static final EnumProperty<ArchTrim> TRIM = ModBlockStateProperties.ARCH_TRIM;

    public static final VoxelShape SHAPE = Block.box(0, 8, 0, 16, 16, 16);

    public ArchBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState() // this.stateDefinition.any()
                .setValue(TRIM, ArchTrim.BOTH)
                .setValue(FACING, NORTH)
                .setValue(TYPE, ArchShape.STRAIGHT)
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
        return SHAPE;
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
            // Set the TYPE value based on the ArchShape
            pState = pState.setValue(TYPE, getArchShape(pState, pLevel, pCurrentPos));

            // Set the TRIM value
            pState = pState.setValue(TRIM, getTrim(pState, pLevel, pCurrentPos));
        } else {
            pState = super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
        }

        return pState;
    }

    private static ArchShape getArchShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction facing = pState.getValue(FACING);
        Direction opposite = facing.getOpposite();
        boolean front = isArch(pLevel.getBlockState(pPos.relative(facing)));
        boolean back = isArch(pLevel.getBlockState(pPos.relative(opposite)));
        boolean left = isArch(pLevel.getBlockState(pPos.relative(facing.getCounterClockWise())));
        boolean right = isArch(pLevel.getBlockState(pPos.relative(facing.getClockWise())));

        // Check for corner (left)
        if ((left && front && !right && !back) || (right && back && !left && !front)) {
            return ArchShape.CORNER_LEFT;
        }
        // Check for corner (right)
        if ((right && front && !left && !back) || (left && back && !right && !front)) {
            return ArchShape.CORNER_RIGHT;
        }
        // Check for 3-way intersection (forward)
        if (back && left && right && !front) {
            return ArchShape.T;
        }
        // Check for 3-way intersection (left)
        if (left && front && back && !right) {
            return ArchShape.LEFT_T;
        }
        // Check for 3-way intersection (right)
        if (right && front && back && !left) {
            return ArchShape.RIGHT_T;
        }
        // Check for 4-way intersection
        if (right && left && front && back) {
            return ArchShape.CROSS;
        }
        return ArchShape.STRAIGHT;
    }

    private ArchTrim getTrim(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction facing = pState.getValue(FACING);
        Direction opposite = facing.getOpposite();
        boolean airInFront = isAir(pLevel.getBlockState(pPos.relative(facing)));
        boolean airInBack = isAir(pLevel.getBlockState(pPos.relative(opposite)));

        // Check for blocks on both sides (front and back)
        if (!airInFront && !airInBack) {
            return ArchTrim.NONE;
        }
        // Check for no blocks on either side (front and back)
        if (airInFront && airInBack) {
            return ArchTrim.BOTH;
        }
        // Check for block only in back
        if (!airInFront && airInBack) {
            return ArchTrim.FRONT;
        }

        return ArchTrim.BOTH;
    }



    public static boolean isArch(BlockState pState) {
        return pState.getBlock() instanceof ArchBlock;
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