package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.properties.ArchShape;
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

    public static final VoxelShape SHAPE = Block.box(0, 8, 0, 16, 16, 16);

    public ArchBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any() // ? this.defaultBlockState()
                .setValue(FACING, NORTH)
                .setValue(TYPE, ArchShape.STRAIGHT)
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
        return SHAPE;
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));

        return blockstate1.setValue(TYPE, ArchShape.STRAIGHT)
                .setValue(WATERLOGGED, Boolean.valueOf(false));
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
        return pFacing.getAxis().isHorizontal() ? pState.setValue(TYPE, getArchShape(pState, pLevel, pCurrentPos)) : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
    }


    private static ArchShape getArchShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction direction = pState.getValue(FACING);
        Direction opposite = direction.getOpposite();

        boolean front = isArch(pLevel.getBlockState(pPos.relative(direction)));
        boolean back = isArch(pLevel.getBlockState(pPos.relative(opposite)));
        boolean left = isArch(pLevel.getBlockState(pPos.relative(direction.getCounterClockWise())));
        boolean right = isArch(pLevel.getBlockState(pPos.relative(direction.getClockWise())));

        // Check for corner (left)
        if ((left && front && !right && !back) || (right && back && !left && !front)) {
            return ArchShape.CORNER_LEFT;
        }

        // Check for corner (right)
        if ((right && front && !left && !back) || (left && back && !right && !front)) {
            return ArchShape.CORNER_RIGHT;
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

    public static boolean isArch(BlockState pState) {
        return pState.getBlock() instanceof ArchBlock;
    }

    @Override
    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        return switch (pType) {
            case LAND -> false;
            case WATER -> pLevel.getFluidState(pPos).is(FluidTags.WATER);
            case AIR -> false;
            default -> false;
        };
    }
}