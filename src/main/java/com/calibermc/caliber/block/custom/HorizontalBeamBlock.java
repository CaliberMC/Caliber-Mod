package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.TopBottomShape;
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

import java.util.stream.Stream;

import static com.calibermc.caliber.util.ModBlockStateProperties.isSide;

public class HorizontalBeamBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<TopBottomShape> TYPE = ModBlockStateProperties.TOP_BOTTOM_SHAPE;
    public static final IntegerProperty BEAM = ModBlockStateProperties.HORIZONTAL_BEAM_SHAPE;
    public final int beamShape = 6;

    public static final VoxelShape[] SHAPE_NORTH = new VoxelShape[]{Shapes.empty(),
            Block.box(5, 0, 0, 11, 4, 16),
            Shapes.join(Block.box(5, 0, 0, 11, 4, 11), Block.box(0, 0, 5, 5, 4, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 0, 11, 4, 11), Block.box(11, 0, 5, 16, 4, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 0, 11, 4, 16), Block.box(0, 0, 5, 5, 4, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 0, 11, 4, 16), Block.box(11, 0, 5, 16, 4, 11), BooleanOp.OR),
            Stream.of(
                    Block.box(5, 0, 0, 11, 4, 16),
                    Block.box(11, 0, 5, 16, 4, 11),
                    Block.box(0, 0, 5, 5, 4, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()};
    public static final VoxelShape[] SHAPE_EAST = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 5, 16, 4, 11),
            Shapes.join(Block.box(5, 0, 5, 16, 4, 11), Block.box(5, 0, 0, 11, 4, 5), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 5, 16, 4, 11), Block.box(5, 0, 11, 11, 4, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 5, 16, 4, 11), Block.box(5, 0, 0, 11, 4, 5), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 5, 16, 4, 11), Block.box(5, 0, 11, 11, 4, 16), BooleanOp.OR),
            Stream.of(
                    Block.box(5, 0, 0, 11, 4, 16),
                    Block.box(11, 0, 5, 16, 4, 11),
                    Block.box(0, 0, 5, 5, 4, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()};
    public static final VoxelShape[] SHAPE_SOUTH = new VoxelShape[]{Shapes.empty(),
            Block.box(5, 0, 0, 11, 4, 16),
            Shapes.join(Block.box(5, 0, 5, 11, 4, 16), Block.box(11, 0, 5, 16, 4, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 5, 11, 4, 16), Block.box(0, 0, 5, 5, 4, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 0, 11, 4, 16), Block.box(11, 0, 5, 16, 4, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 0, 0, 11, 4, 16), Block.box(0, 0, 5, 5, 4, 11), BooleanOp.OR),
            Stream.of(
                    Block.box(5, 0, 0, 11, 4, 16),
                    Block.box(11, 0, 5, 16, 4, 11),
                    Block.box(0, 0, 5, 5, 4, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()};
    public static final VoxelShape[] SHAPE_WEST = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 0, 5, 16, 4, 11),
            Shapes.join(Block.box(0, 0, 5, 11, 4, 11), Block.box(5, 0, 11, 11, 4, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 5, 11, 4, 11), Block.box(5, 0, 0, 11, 4, 5), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 5, 16, 4, 11), Block.box(5, 0, 11, 11, 4, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 5, 16, 4, 11), Block.box(5, 0, 0, 11, 4, 5), BooleanOp.OR),
            Stream.of(
                    Block.box(5, 0, 0, 11, 4, 16),
                    Block.box(11, 0, 5, 16, 4, 11),
                    Block.box(0, 0, 5, 5, 4, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()};

    public static final VoxelShape[] TOP_SHAPE_NORTH = new VoxelShape[]{Shapes.empty(),
            Block.box(5, 12, 0, 11, 16, 16),
            Shapes.join(Block.box(5, 12, 0, 11, 16, 11), Block.box(0, 12, 5, 5, 16, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 12, 0, 11, 16, 11), Block.box(11, 12, 5, 16, 16, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 12, 0, 11, 16, 16), Block.box(0, 12, 5, 5, 16, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 12, 0, 11, 16, 16), Block.box(11, 12, 5, 16, 16, 11), BooleanOp.OR),
            Stream.of(
                    Block.box(5, 12, 0, 11, 16, 16),
                    Block.box(11, 12, 5, 16, 16, 11),
                    Block.box(0, 12, 5, 5, 16, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()};
    public static final VoxelShape[] TOP_SHAPE_EAST = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 12, 5, 16, 16, 11),
            Shapes.join(Block.box(5, 12, 5, 16, 16, 11), Block.box(5, 12, 0, 11, 16, 5), BooleanOp.OR),
            Shapes.join(Block.box(5, 12, 5, 16, 16, 11), Block.box(5, 12, 11, 11, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 12, 5, 16, 16, 11), Block.box(5, 12, 0, 11, 16, 5), BooleanOp.OR),
            Shapes.join(Block.box(0, 12, 5, 16, 16, 11), Block.box(5, 12, 11, 11, 16, 16), BooleanOp.OR),
            Stream.of(
                    Block.box(5, 12, 0, 11, 16, 16),
                    Block.box(11, 12, 5, 16, 16, 11),
                    Block.box(0, 12, 5, 5, 16, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()};
    public static final VoxelShape[] TOP_SHAPE_SOUTH = new VoxelShape[]{Shapes.empty(),
            Block.box(5, 12, 0, 11, 16, 16),
            Shapes.join(Block.box(5, 12, 5, 11, 16, 16), Block.box(11, 12, 5, 16, 16, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 12, 5, 11, 16, 16), Block.box(0, 12, 5, 5, 16, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 12, 0, 11, 16, 16), Block.box(11, 12, 5, 16, 16, 11), BooleanOp.OR),
            Shapes.join(Block.box(5, 12, 0, 11, 16, 16), Block.box(0, 12, 5, 5, 16, 11), BooleanOp.OR),
            Stream.of(
                    Block.box(5, 12, 0, 11, 16, 16),
                    Block.box(11, 12, 5, 16, 16, 11),
                    Block.box(0, 12, 5, 5, 16, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()};
    public static final VoxelShape[] TOP_SHAPE_WEST = new VoxelShape[]{Shapes.empty(),
            Block.box(0, 12, 5, 16, 16, 11),
            Shapes.join(Block.box(0, 12, 5, 11, 16, 11), Block.box(5, 12, 11, 11, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 12, 5, 11, 16, 11), Block.box(5, 12, 0, 11, 16, 5), BooleanOp.OR),
            Shapes.join(Block.box(0, 12, 5, 16, 16, 11), Block.box(5, 12, 11, 11, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 12, 5, 16, 16, 11), Block.box(5, 12, 0, 11, 16, 5), BooleanOp.OR),
            Stream.of(
                    Block.box(5, 12, 0, 11, 16, 16),
                    Block.box(11, 12, 5, 16, 16, 11),
                    Block.box(0, 12, 5, 5, 16, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()};

    public HorizontalBeamBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(BEAM, 1)
                .setValue(TYPE, TopBottomShape.BOTTOM)
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, Boolean.FALSE));

    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, BEAM, TYPE, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        TopBottomShape topBottomShape = pState.getValue(TYPE);
        Direction direction = pState.getValue(FACING);

        switch (topBottomShape) {
            case BOTTOM -> {
                return switch (direction) {
                    case EAST -> SHAPE_EAST[pState.getValue(BEAM)];
                    case SOUTH -> SHAPE_SOUTH[pState.getValue(BEAM)];
                    case WEST -> SHAPE_WEST[pState.getValue(BEAM)];
                    default -> SHAPE_NORTH[pState.getValue(BEAM)];
                };
            }
            case TOP -> {
                return switch (direction) {
                    case EAST -> TOP_SHAPE_EAST[pState.getValue(BEAM)];
                    case SOUTH -> TOP_SHAPE_SOUTH[pState.getValue(BEAM)];
                    case WEST -> TOP_SHAPE_WEST[pState.getValue(BEAM)];
                    default -> TOP_SHAPE_NORTH[pState.getValue(BEAM)];
                };
            }
        }
        return null;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        Direction clickedFace = pContext.getClickedFace();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        if (blockstate.is(this)) {
            int newCount = blockstate.getValue(BEAM) +1;
            if (newCount > beamShape){
                newCount = 1;
            }
            pContext.getItemInHand().grow(1);
            return blockstate.setValue(BEAM, Integer.valueOf(newCount)).
                    setValue(WATERLOGGED, Boolean.valueOf((newCount < beamShape) && fluidstate.is(FluidTags.WATER)));
        } else {
            BlockState blockstate1 = this.defaultBlockState().setValue(BEAM, 1).setValue(TYPE, TopBottomShape.BOTTOM).setValue(FACING, pContext.getHorizontalDirection()
                    .getOpposite()).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            return clickedFace != Direction.DOWN && (clickedFace == Direction.UP || !(pContext.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ?
                    blockstate1 : blockstate1.setValue(TYPE, TopBottomShape.TOP);
        }
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext pContext) {
        if (pContext.getItemInHand().getItem() == this.asItem()) {
            Direction clickedFace = pContext.getClickedFace();
            return !isSide(clickedFace) && pContext.replacingClickedOnBlock();
        }
        return false;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean placeLiquid(LevelAccessor world, BlockPos pos, BlockState state, FluidState fluid) {
        return state.getValue(BEAM) < beamShape && SimpleWaterloggedBlock.super.placeLiquid(world, pos, state, fluid);
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.getValue(BEAM) < beamShape && SimpleWaterloggedBlock.super.canPlaceLiquid(world, pos, state, fluid);
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