package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.RoofShape;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SlabBlock;
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
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.calibermc.caliber.block.custom.DirectionalBlock.SHAPE;
import static com.calibermc.caliber.util.ModBlockStateProperties.isSide;
import static net.minecraft.core.Direction.*;
import static net.minecraft.core.Direction.WEST;


public class Roof67Block extends Block implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<RoofShape> TYPE = ModBlockStateProperties.ROOF_SHAPE;
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public Roof67Block(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(FACING, Direction.NORTH)
                .setValue(TYPE, RoofShape.STRAIGHT)
                .setValue(HALF, Half.TOP)
                .setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, TYPE, HALF, WATERLOGGED);
    }

    public static final Map<Direction, VoxelShape> TOP_OUTER_LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(8, 1, 8, 16, 15, 16),
            Direction.SOUTH, Block.box(0, 1, 0, 8, 15, 8),
            Direction.EAST, Block.box(0, 1, 8, 8, 15, 16),
            Direction.WEST, Block.box(8, 1, 0, 16, 15, 8)));

    public static final Map<Direction, VoxelShape> TOP_OUTER_RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(0, 1, 8, 8, 15, 16),
            Direction.SOUTH, Block.box(8, 1, 0, 16, 15, 8),
            Direction.EAST, Block.box(0, 1, 0, 8, 15, 8),
            Direction.WEST, Block.box(8, 1, 8, 16, 15, 16)));

    public static final Map<Direction, VoxelShape> TOP_INNER_LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.EAST, Shapes.join(Block.box(0, 1, 8, 16, 15, 16), Block.box(0, 1, 0, 8, 15, 8), BooleanOp.OR),
            Direction.NORTH, Shapes.join(Block.box(8, 1, 0, 16, 15, 16), Block.box(0, 1, 8, 8, 15, 16), BooleanOp.OR),
            Direction.WEST, Shapes.join(Block.box(0, 1, 0, 16, 15, 8), Block.box(8, 1, 8, 16, 15, 16), BooleanOp.OR),
            Direction.SOUTH, Shapes.join(Block.box(0, 1, 0, 7, 15, 16), Block.box(8, 1, 0, 16, 15, 8), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> TOP_INNER_RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.WEST, Shapes.join(Block.box(8, 1, 0, 16, 15, 16), Block.box(0, 1, 8, 8, 15, 16), BooleanOp.OR),
            Direction.SOUTH, Shapes.join(Block.box(0, 1, 0, 16, 15, 8), Block.box(8, 1, 8, 16, 15, 16), BooleanOp.OR),
            Direction.NORTH, Shapes.join(Block.box(0, 1, 8, 16, 15, 16), Block.box(0, 1, 0, 8, 15, 8), BooleanOp.OR),
            Direction.EAST, Shapes.join(Block.box(0, 1, 0, 7, 15, 16), Block.box(8, 1, 0, 16, 15, 8), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> TOP_STRAIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(0, 1, 8, 16, 15, 16),
            Direction.SOUTH, Block.box(0, 1, 0, 16, 15, 8),
            Direction.EAST, Block.box(0, 1, 0, 8, 15, 16),
            Direction.WEST, Block.box(8, 1, 0, 16, 15, 16)));

    public static final Map<Direction, VoxelShape> BOTTOM_STRAIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Shapes.join(Block.box(0, 1, 8, 16, 15, 16), Block.box(0, 1, 0, 16, 7, 8), BooleanOp.OR),
            Direction.SOUTH, Shapes.join(Block.box(0, 1, 0, 16, 15, 8), Block.box(0, 1, 8, 16, 7, 16), BooleanOp.OR),
            Direction.EAST, Shapes.join(Block.box(0, 1, 0, 8, 15, 16), Block.box(8, 1, 0, 16, 7, 16), BooleanOp.OR),
            Direction.WEST, Shapes.join(Block.box(8, 1, 0, 16, 15, 16), Block.box(0, 1, 0, 8, 7, 16), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> BOTTOM_OUTER_LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.SOUTH, Shapes.join(Block.box(0, 1, 0, 16, 7, 16), Block.box(0, 9, 0, 8, 15, 8), BooleanOp.OR),
            Direction.NORTH, Shapes.join(Block.box(0, 1, 0, 16, 7, 16), Block.box(8, 9, 8, 16, 15, 16), BooleanOp.OR),
            Direction.WEST, Shapes.join(Block.box(0, 1, 0, 16, 7, 16), Block.box(8, 9, 0, 16, 15, 8), BooleanOp.OR),
            Direction.EAST, Shapes.join(Block.box(0, 1, 0, 16, 7, 16), Block.box(0, 9, 8, 8, 15, 16), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> BOTTOM_OUTER_RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.EAST, Shapes.join(Block.box(0, 1, 0, 16, 7, 16), Block.box(0, 9, 0, 8, 15, 8), BooleanOp.OR),
            Direction.WEST, Shapes.join(Block.box(0, 1, 0, 16, 7, 16), Block.box(8, 9, 8, 16, 15, 16), BooleanOp.OR),
            Direction.SOUTH, Shapes.join(Block.box(0, 1, 0, 16, 7, 16), Block.box(8, 9, 0, 16, 15, 8), BooleanOp.OR),
            Direction.NORTH, Shapes.join(Block.box(0, 1, 0, 16, 7, 16), Block.box(0, 9, 8, 8, 15, 16), BooleanOp.OR)));

    public static final Map<Direction, VoxelShape> BOTTOM_INNER_LEFT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.SOUTH, Stream.of(
                    Block.box(0, 1, 0, 16, 7, 16),
                    Block.box(0, 9, 0, 8, 15, 16),
                    Block.box(8, 9, 0, 16, 15, 8)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Direction.NORTH, Stream.of(
                    Block.box(0, 1, 0, 16, 7, 16),
                    Block.box(8, 9, 0, 16, 15, 16),
                    Block.box(0, 9, 8, 8, 15, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Direction.WEST, Stream.of(
                    Block.box(0, 1, 0, 16, 7, 16),
                    Block.box(0, 9, 0, 16, 15, 8),
                    Block.box(8, 9, 8, 16, 15, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Direction.EAST, Stream.of(
                    Block.box(0, 1, 0, 16, 7, 16),
                    Block.box(0, 9, 8, 16, 15, 16),
                    Block.box(0, 9, 0, 8, 15, 8)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    public static final Map<Direction, VoxelShape> BOTTOM_INNER_RIGHT_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.EAST, Stream.of(
                    Block.box(0, 1, 0, 16, 7, 16),
                    Block.box(0, 7, 0, 8, 15, 16),
                    Block.box(8, 7, 0, 16, 15, 8)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Direction.WEST, Stream.of(
                    Block.box(0, 1, 0, 16, 7, 16),
                    Block.box(8, 7, 0, 16, 15, 16),
                    Block.box(0, 7, 8, 8, 15, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Direction.SOUTH, Stream.of(
                    Block.box(0, 1, 0, 16, 7, 16),
                    Block.box(0, 7, 0, 16, 15, 8),
                    Block.box(8, 7, 8, 16, 15, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Direction.NORTH, Stream.of(
                    Block.box(0, 1, 0, 16, 7, 16),
                    Block.box(0, 7, 8, 16, 15, 16),
                    Block.box(0, 7, 0, 8, 15, 8)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()));

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction direction = pState.getValue(FACING);
        Half half = pState.getValue(HALF);
        RoofShape type = pState.getValue(TYPE);

        if (half == Half.TOP) {
            return switch (type) {
                case OUTER_LEFT -> TOP_OUTER_LEFT_SHAPE.get(direction);
                case OUTER_RIGHT -> TOP_OUTER_RIGHT_SHAPE.get(direction);
                case INNER_LEFT -> TOP_INNER_LEFT_SHAPE.get(direction);
                case INNER_RIGHT -> TOP_INNER_RIGHT_SHAPE.get(direction);
                case STRAIGHT -> TOP_STRAIGHT_SHAPE.get(direction);
            };
        } else {
            return switch (type) {
                case OUTER_LEFT -> BOTTOM_OUTER_LEFT_SHAPE.get(direction);
                case OUTER_RIGHT -> BOTTOM_OUTER_RIGHT_SHAPE.get(direction);
                case INNER_LEFT -> BOTTOM_INNER_LEFT_SHAPE.get(direction);
                case INNER_RIGHT -> BOTTOM_INNER_RIGHT_SHAPE.get(direction);
                case STRAIGHT -> BOTTOM_STRAIGHT_SHAPE.get(direction);
            };

        }
    }


//-----------------------------------------------------------------------------------------------------------------------//
//    protected static final VoxelShape BOTTOM_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
//    protected static final VoxelShape TOP_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
//    protected static final VoxelShape OCTET_NNN = Block.box(8.0D, 8.0D, 8.0D, 16.0D, 16.0D, 16.0D); // was OCTET_PPP
//    protected static final VoxelShape OCTET_NNP = Block.box(8.0D, 8.0D, 0.0D, 16.0D, 16.0D, 8.0D);  // was OCTET_PPN
//    protected static final VoxelShape OCTET_NPN = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 8.0D);    // was OCTET_NNN
//    protected static final VoxelShape OCTET_NPP = Block.box(0.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);   // was OCTET_NNP
//    protected static final VoxelShape OCTET_PNN = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);  // was OCTET_PNP
//    protected static final VoxelShape OCTET_PNP = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);   // was OCTET_PNN
//    protected static final VoxelShape OCTET_PPN = Block.box(0.0D, 8.0D, 0.0D, 8.0D, 16.0D, 8.0D);   // was OCTET_NPN
//    protected static final VoxelShape OCTET_PPP = Block.box(0.0D, 8.0D, 8.0D, 8.0D, 16.0D, 16.0D);  // was OCTET_NPP
//    protected static final VoxelShape[] BOTTOM_SHAPES = makeShapes(BOTTOM_AABB, OCTET_NPN, OCTET_PPN, OCTET_NPP, OCTET_PPP);
//    protected static final VoxelShape[] TOP_SHAPES = makeShapes(BOTTOM_AABB, OCTET_NPN, OCTET_PPN, OCTET_NPP, OCTET_PPP);
//    private static final int[] SHAPE_BY_STATE = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
//
//    private static VoxelShape[] makeShapes(VoxelShape pSlabShape, VoxelShape pNwCorner, VoxelShape pNeCorner, VoxelShape pSwCorner, VoxelShape pSeCorner) {
//        return IntStream.range(0, 16).mapToObj((p_56945_) -> makeStairShape(p_56945_, pSlabShape, pNwCorner, pNeCorner, pSwCorner, pSeCorner)).toArray(VoxelShape[]::new);
//    }
//
//    /**
//     * Combines the shapes according to the mode set in the bitfield
//     */
//    private static VoxelShape makeStairShape(int pBitfield, VoxelShape pSlabShape, VoxelShape pNwCorner, VoxelShape pNeCorner, VoxelShape pSwCorner, VoxelShape pSeCorner) {
//        VoxelShape voxelshape = pSlabShape;
//        if ((pBitfield & 1) != 0) {
//            voxelshape = Shapes.or(pSlabShape, pNwCorner);
//        }
//
//        if ((pBitfield & 2) != 0) {
//            voxelshape = Shapes.or(voxelshape, pNeCorner);
//        }
//
//        if ((pBitfield & 4) != 0) {
//            voxelshape = Shapes.or(voxelshape, pSwCorner);
//        }
//
//        if ((pBitfield & 8) != 0) {
//            voxelshape = Shapes.or(voxelshape, pSeCorner);
//        }
//
//        return voxelshape;
//    }
//
//    public @NotNull VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
//        return (pState.getValue(HALF) == Half.TOP ? TOP_SHAPES : BOTTOM_SHAPES)[SHAPE_BY_STATE[this.getShapeIndex(pState)]];
//    }
//
//    private int getShapeIndex(@NotNull BlockState pState) {
//        return pState.getValue(TYPE).ordinal() * 4 + pState.getValue(FACING).getOpposite().get2DDataValue();
//    }
//------------------------------
//    @Override
//    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
//        RoofShape roofShape = pState.getValue(TYPE);
//        Half half = pState.getValue(HALF);
//        if (FACING.equals(SOUTH)) {
//            switch (roofShape) {
//                case STRAIGHT -> {
//                    return switch (half) {
//                        case TOP -> SOUTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case OUTER_LEFT -> {
//                    return switch (half) {
//                        case TOP -> OUTER_SOUTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case OUTER_RIGHT -> {
//                    return switch (half) {
//                        case TOP -> OUTER_WEST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case INNER_LEFT -> {
//                    return switch (half) {
//                        case TOP -> INNER_SOUTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case INNER_RIGHT -> {
//                    return switch (half) {
//                        case TOP -> INNER_EAST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//            }
//        } else if (FACING.equals(EAST)) {
//            switch (roofShape) {
//                case STRAIGHT -> {
//                    return switch (half) {
//                        case TOP -> EAST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case OUTER_LEFT -> {
//                    return switch (half) {
//                        case TOP -> OUTER_EAST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case OUTER_RIGHT -> {
//                    return switch (half) {
//                        case TOP -> OUTER_SOUTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case INNER_LEFT -> {
//                    return switch (half) {
//                        case TOP -> INNER_NORTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case INNER_RIGHT -> {
//                    return switch (half) {
//                        case TOP -> INNER_SOUTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//            }
//        } else if (FACING.equals(WEST)) {
//            switch (roofShape) {
//                case STRAIGHT -> {
//                    return switch (half) {
//                        case TOP -> WEST;
//                        case BOTTOM ->BOTTOM_SHAPE;
//                    };
//                }
//                case OUTER_LEFT -> {
//                    return switch (half) {
//                        case TOP -> OUTER_WEST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case OUTER_RIGHT -> {
//                    return switch (half) {
//                        case TOP -> OUTER_NORTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case INNER_LEFT -> {
//                    return switch (half) {
//                        case TOP -> INNER_EAST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case INNER_RIGHT -> {
//                    return switch (half) {
//                        case TOP -> INNER_WEST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//            }
//        } else if (FACING.equals(NORTH)) {
//            switch (roofShape) {
//                case STRAIGHT -> {
//                    return switch (half) {
//                        case TOP -> NORTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case OUTER_LEFT -> {
//                    return switch (half) {
//                        case TOP -> OUTER_NORTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case OUTER_RIGHT -> {
//                    return switch (half) {
//                        case TOP -> OUTER_EAST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case INNER_LEFT -> {
//                    return switch (half) {
//                        case TOP -> INNER_WEST;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//                case INNER_RIGHT -> {
//                    return switch (half) {
//                        case TOP -> INNER_NORTH;
//                        case BOTTOM -> BOTTOM_SHAPE;
//                    };
//                }
//            }
//        }
//        return NORTH;
//    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        Level level = pContext.getLevel();
        BlockState blockstate = level.getBlockState(blockpos);

        if (blockstate.is(this)) {
            return blockstate.setValue(HALF, Half.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE);
        } else {
            FluidState fluidstate = level.getFluidState(blockpos);
            Direction facing = pContext.getHorizontalDirection().getOpposite();
            Half half = (pContext.getClickedFace() != Direction.UP && (pContext.getClickedFace() == Direction.DOWN ||
                    !(pContext.getClickLocation().y - (double)blockpos.getY() > 0.5D))) ? Half.BOTTOM : Half.TOP;

            BlockState blockstate1 = this.defaultBlockState()
                    .setValue(FACING, facing)
                    .setValue(HALF, half)
                    .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);

            // Determine RoofShape based on surrounding blocks
            RoofShape roofShape = getRoofShape(blockstate1, level, blockpos);
            blockstate1 = blockstate1.setValue(TYPE, roofShape);

            return blockstate1;
        }
    }

    @Override
    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pContext) {
        ItemStack itemstack = pContext.getItemInHand();
        Half Half = pState.getValue(HALF);
        Direction clickedFace = pContext.getClickedFace();
        if (Half != Half.BOTTOM && itemstack.is(this.asItem())) {
            return isSide(clickedFace);
        }
        return false;
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
            // Set the TYPE value based on the RoofShape
            pState = pState.setValue(TYPE, getRoofShape(pState, pLevel, pCurrentPos));

        } else {
            pState = super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
        }

        return pState;
    }

    private static RoofShape getRoofShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction direction = pState.getValue(FACING);
        BlockState blockstate = pLevel.getBlockState(pPos.relative(direction));
        if (isRoof(blockstate) && pState.getValue(HALF) == blockstate.getValue(HALF)) {
            Direction direction1 = blockstate.getValue(FACING);
            if (direction1.getAxis() != pState.getValue(FACING).getAxis() && canTakeShape(pState, pLevel, pPos, direction1.getOpposite())) {
                if (direction1 == direction.getCounterClockWise()) {
                    return RoofShape.INNER_LEFT;
                }

                return RoofShape.INNER_RIGHT;
            }
        }

        BlockState blockstate1 = pLevel.getBlockState(pPos.relative(direction.getOpposite()));
        if (isRoof(blockstate1) && pState.getValue(HALF) == blockstate1.getValue(HALF)) {
            Direction direction2 = blockstate1.getValue(FACING);
            if (direction2.getAxis() != pState.getValue(FACING).getAxis() && canTakeShape(pState, pLevel, pPos, direction2)) {
                if (direction2 == direction.getCounterClockWise()) {
                    return RoofShape.OUTER_LEFT;
                }

                return RoofShape.OUTER_RIGHT;
            }
        }

        return RoofShape.STRAIGHT;
    }
    
    public static boolean isRoof(BlockState pState) {
        return pState.getBlock() instanceof Roof67Block;
    }

    private static boolean canTakeShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, Direction pFace) {
        BlockState blockstate = pLevel.getBlockState(pPos.relative(pFace));
        return !isRoof(blockstate) || blockstate.getValue(FACING) != pState.getValue(FACING) || blockstate.getValue(HALF) != pState.getValue(HALF);
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