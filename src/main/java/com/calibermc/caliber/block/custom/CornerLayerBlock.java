package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.CornerShape;
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
import static com.calibermc.caliber.util.ModBlockStateProperties.isSide;
import static net.minecraft.core.Direction.*;

public class CornerLayerBlock extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<CornerShape> TYPE = ModBlockStateProperties.CORNER_SHAPE;
    public static final IntegerProperty LAYERS = ModBlockStateProperties.FIVE_LAYERS;
    public final int layerCount = 5;
    
    public static final VoxelShape[] LEFT_NORTH_RIGHT_WEST = new VoxelShape[]{Shapes.empty(),
            Shapes.join(Block.box(14, 0, 0, 16, 16, 16), Block.box(0, 0, 14, 14, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(12, 0, 0, 16, 16, 16), Block.box(0, 0, 12, 12, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(8, 0, 0, 16, 16, 16), Block.box(0, 0, 8, 8, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(4, 0, 0, 16, 16, 16), Block.box(0, 0, 4, 4, 16, 16), BooleanOp.OR),
            Block.box(0, 0.1, 0, 16, 16, 16)};
    public static final VoxelShape[] LEFT_EAST_RIGHT_NORTH = new VoxelShape[]{Shapes.empty(),
            Shapes.join(Block.box(0, 0, 14, 16, 16, 16), Block.box(0, 0, 0, 2, 16, 14), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 12, 16, 16, 16), Block.box(0, 0, 0, 4, 16, 12), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 8, 16, 16, 16), Block.box(0, 0, 0, 8, 16, 8), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 4, 16, 16, 16), Block.box(0, 0, 0, 12, 16, 4), BooleanOp.OR),
            Block.box(0, 0.1, 0, 16, 16, 16)};
    public static final VoxelShape[] LEFT_SOUTH_RIGHT_EAST = new VoxelShape[]{Shapes.empty(),
            Shapes.join(Block.box(0, 0, 0, 2, 16, 16), Block.box(2, 0, 0, 16, 16, 2), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 0, 4, 16, 16), Block.box(4, 0, 0, 16, 16, 4), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 0, 8, 16, 16), Block.box(8, 0, 0, 16, 16, 8), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 0, 12, 16, 16), Block.box(12, 0, 0, 16, 16, 12), BooleanOp.OR),
            Block.box(0, 0.1, 0, 16, 16, 16)};
    public static final VoxelShape[] LEFT_WEST_RIGHT_SOUTH = new VoxelShape[]{Shapes.empty(),
            Shapes.join(Block.box(0, 0, 0, 16, 16, 2), Block.box(14, 0, 2, 16, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 0, 16, 16, 4), Block.box(12, 0, 4, 16, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 0, 16, 16, 8), Block.box(8, 0, 8, 16, 16, 16), BooleanOp.OR),
            Shapes.join(Block.box(0, 0, 0, 16, 16, 12), Block.box(4, 0, 12, 16, 16, 16), BooleanOp.OR),
            Block.box(0, 0.1, 0, 16, 16, 16)};

    public CornerLayerBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(LAYERS, 3)
                .setValue(FACING, Direction.NORTH)
                .setValue(TYPE, CornerShape.RIGHT)
                .setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return pState.getValue(LAYERS) < 5;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(LAYERS, FACING, TYPE, WATERLOGGED);
    }
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        CornerShape cornerShape = pState.getValue(TYPE);
        Direction direction = pState.getValue(FACING);

        switch (cornerShape) {
            case LEFT -> {
                return switch (direction) {
                    case EAST -> LEFT_EAST_RIGHT_NORTH[pState.getValue(LAYERS)];
                    case SOUTH -> LEFT_SOUTH_RIGHT_EAST[pState.getValue(LAYERS)];
                    case WEST -> LEFT_WEST_RIGHT_SOUTH[pState.getValue(LAYERS)];
                    default -> LEFT_NORTH_RIGHT_WEST[pState.getValue(LAYERS)];
                };
            }
            case RIGHT -> {
                return switch (direction) {
                    case EAST -> LEFT_SOUTH_RIGHT_EAST[pState.getValue(LAYERS)];
                    case SOUTH -> LEFT_WEST_RIGHT_SOUTH[pState.getValue(LAYERS)];
                    case WEST -> LEFT_NORTH_RIGHT_WEST[pState.getValue(LAYERS)];
                    default -> LEFT_EAST_RIGHT_NORTH[pState.getValue(LAYERS)];
                };
            }
        }
        return null;
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        Direction direction = pContext.getHorizontalDirection().getOpposite();
        Direction clickedFace = pContext.getClickedFace();
        double hitX = pContext.getClickLocation().x - (double) blockpos.getX();
        double hitZ = pContext.getClickLocation().z - (double) blockpos.getZ();
        if (blockstate.is(this) && clickedFace != Direction.UP && clickedFace != Direction.DOWN) {
            int i = blockstate.getValue(LAYERS);
            int newCount = Math.min(layerCount, i + 1);

            return blockstate.setValue(LAYERS, Integer.valueOf(newCount)).
                    setValue(WATERLOGGED, Boolean.valueOf((newCount < layerCount) && fluidstate.is(FluidTags.WATER)));
        } else {
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite())
                    .setValue(TYPE, CornerShape.RIGHT).setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);

            if (direction == NORTH && hitX < 0.5 || direction == EAST && hitZ < 0.5) {
                return blockstate1.setValue(TYPE, CornerShape.RIGHT).setValue(LAYERS, 1);
            } else if (direction == NORTH && hitX > 0.5 || direction == EAST && hitZ > 0.5) {
                return blockstate1.setValue(TYPE, CornerShape.LEFT).setValue(LAYERS, 1);
            } else if (direction == SOUTH && hitX > 0.5 || direction == WEST && hitZ > 0.5) {
                return blockstate1.setValue(TYPE, CornerShape.RIGHT).setValue(LAYERS, 1);
            } else if (direction == SOUTH && hitX < 0.5 || direction == WEST && hitZ < 0.5) {
                return blockstate1.setValue(TYPE, CornerShape.LEFT).setValue(LAYERS, 1);
            } else {
                return blockstate1.setValue(TYPE, CornerShape.RIGHT);
            }
        }
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext pContext) {
        int currentLayers = state.getValue(LAYERS);
        if (pContext.getItemInHand().getItem() == this.asItem()) {
            Direction clickedFace = pContext.getClickedFace();
            // Allow replacement if it's a side click and not at max layers
            return isSide(clickedFace) && currentLayers < layerCount;
        }
        return false;
    }

    @Override
    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    @Override
    public boolean placeLiquid(LevelAccessor world, BlockPos pos, BlockState state, FluidState fluid) {
        return state.getValue(LAYERS) < layerCount && SimpleWaterloggedBlock.super.placeLiquid(world, pos, state, fluid);
    }

    @Override
    public boolean canPlaceLiquid(BlockGetter world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.getValue(LAYERS) < layerCount && SimpleWaterloggedBlock.super.canPlaceLiquid(world, pos, state, fluid);
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