package com.calibermc.caliber.block.custom;

import com.calibermc.caliber.block.shapes.doors.TallDoorPart;
import com.calibermc.caliber.util.ModBlockStateProperties;
import com.calibermc.caliber.util.compat.DoubleDoorsOpening;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Random;

public class TallDoorBlock extends Block implements SimpleWaterloggedBlock{


        public static final EnumProperty<TallDoorPart> THIRD = ModBlockStateProperties.TALL_DOOR_PART;
        public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
        public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
        public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;
        public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
        public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
        protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
        protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
        protected static final VoxelShape WEST_AABB = Block.box(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
        protected static final VoxelShape EAST_AABB = Block.box(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);


        public TallDoorBlock(Properties properties) {
            super(properties);
            this.registerDefaultState(this.stateDefinition.any()
                    .setValue(FACING, Direction.NORTH)
                    .setValue(OPEN, Boolean.FALSE)
                    .setValue(HINGE, DoorHingeSide.LEFT)
                    .setValue(THIRD, TallDoorPart.BOTTOM)
                    .setValue(POWERED, Boolean.FALSE)
                    .setValue(WATERLOGGED, Boolean.FALSE));
        }

        @Override
        public BlockState updateShape(@NotNull BlockState stateIn, @NotNull Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
            TallDoorPart TallDoorPart = stateIn.getValue(THIRD);
            if (facing.getAxis() == Direction.Axis.Y && ((TallDoorPart == TallDoorPart.BOTTOM == (facing == Direction.UP)) || TallDoorPart == TallDoorPart.MIDDLE)) {
                if (facingState.getBlock() == this && facingState.getValue(THIRD) != TallDoorPart) {
                    return stateIn.setValue(FACING, facingState.getValue(FACING)).setValue(OPEN, facingState.getValue(OPEN)).setValue(HINGE, facingState.getValue(HINGE)).setValue(POWERED, facingState.getValue(POWERED));
                } else {
                    return Blocks.AIR.defaultBlockState(); // level.getFluidState(currentPos).getType() == Fluids.WATER ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
                }
            } else {
                if (TallDoorPart == TallDoorPart.BOTTOM && facing == Direction.DOWN && !stateIn.canSurvive(level, currentPos)) {
                    return Blocks.AIR.defaultBlockState();
                } else {
                    return super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
                }
            }
        }

        @Override
        public void playerWillDestroy(@NotNull Level level, BlockPos pos, BlockState state, Player player) {
            if (!level.isClientSide && player.isCreative()) {
                BlockPos otherPos1 = pos;
                BlockPos otherPos2 = pos;
                TallDoorPart TallDoorPart = state.getValue(THIRD);
                switch (TallDoorPart) {
                    case BOTTOM:
                        otherPos1 = pos.above();
                        otherPos2 = pos.above(2);
                        break;
                    case MIDDLE:
                        otherPos1 = pos.below();
                        otherPos2 = pos.above();
                        break;
                    case TOP:
                        otherPos1 = pos.below(2);
                        otherPos2 = pos.below();
                        break;
                }
                BlockState blockstate1 = level.getBlockState(otherPos1);
                BlockState blockstate2 = level.getBlockState(otherPos2);
                if (blockstate1.getBlock() == state.getBlock() && blockstate1.getValue(THIRD) == TallDoorPart.BOTTOM) {
                    level.setBlock(otherPos1, blockstate1.getValue(WATERLOGGED) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState(), 35);
                    level.levelEvent(player, 2001, otherPos1, Block.getId(blockstate1));
                }
                if (blockstate2.getBlock() == state.getBlock() && blockstate2.getValue(THIRD) == TallDoorPart.BOTTOM) {
                    level.setBlock(otherPos2, blockstate2.getValue(WATERLOGGED) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState(), 35);
                    level.levelEvent(player, 2001, otherPos1, Block.getId(blockstate1));
                }
            }
            super.playerWillDestroy(level, pos, state, player);
        }

        protected int getCloseSound() {
            return this.material == Material.METAL ? 1011 : 1012;
        }

        protected int getOpenSound() {
            return this.material == Material.METAL ? 1005 : 1006;
        }

        @Nullable
        @Override
        public BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
            BlockPos blockpos = context.getClickedPos();
            if (blockpos.getY() < context.getLevel().getMaxBuildHeight() - 2 && context.getLevel().getBlockState(blockpos.above()).canBeReplaced(context) && context.getLevel().getBlockState(blockpos.above(2)).canBeReplaced(context)) {
                Level level = context.getLevel();
                boolean flag = level.hasNeighborSignal(blockpos) || level.hasNeighborSignal(blockpos.above());
                boolean waterfilled = level.getFluidState(blockpos).getType() == Fluids.WATER;
                return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(HINGE, this.getHinge(context)).setValue(POWERED, flag).setValue(OPEN, flag).setValue(THIRD, TallDoorPart.BOTTOM).setValue(WATERLOGGED, waterfilled);
            } else {
                return null;
            }
        }

        @Override
        public void setPlacedBy(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state, LivingEntity placer, ItemStack stack) {
            boolean waterfilled = level.getFluidState(pos.above(1)).getType() == Fluids.WATER;
            boolean waterfilled2 = level.getFluidState(pos.above(2)).getType() == Fluids.WATER;
            level.setBlock(pos.above(), state.setValue(THIRD, TallDoorPart.MIDDLE).setValue(WATERLOGGED, waterfilled), Block.UPDATE_ALL);
            level.setBlock(pos.above().above(), state.setValue(THIRD, TallDoorPart.TOP).setValue(WATERLOGGED, waterfilled2), Block.UPDATE_ALL);
        }

        private DoorHingeSide getHinge(@NotNull BlockPlaceContext context) {
            BlockGetter BlockGetter = context.getLevel();
            BlockPos placePos = context.getClickedPos();
            Direction behindDir = context.getHorizontalDirection(); // Behind
            BlockPos placePosAbove = placePos.above();
            Direction leftDir = behindDir.getCounterClockWise(); // Left
            BlockPos leftPos = placePos.relative(leftDir); // Left Pos
            BlockState leftBlockstate = BlockGetter.getBlockState(leftPos); // Left BlockState
            BlockPos leftPosAbove = placePosAbove.relative(leftDir); // Left Up Pos
            BlockState leftAboveBlockstate = BlockGetter.getBlockState(leftPosAbove); // Left Up BlockState
            Direction rightDir = behindDir.getClockWise(); // Right
            BlockPos rightPos = placePos.relative(rightDir); // Right Pos
            BlockState rightBlockstate = BlockGetter.getBlockState(rightPos); // Right Blockstate
            BlockPos rightPosAbove = placePosAbove.relative(rightDir); // Right Up Pos
            BlockState rightAboveBlockstate = BlockGetter.getBlockState(rightPosAbove); // Right Up Blockstate
            int i = (leftBlockstate.isCollisionShapeFullBlock(BlockGetter, leftPos) ? -1 : 0) + (leftAboveBlockstate.isCollisionShapeFullBlock(BlockGetter, leftPosAbove) ? -1 : 0) + (rightBlockstate.isCollisionShapeFullBlock(BlockGetter, rightPos) ? 1 : 0) + (rightAboveBlockstate.isCollisionShapeFullBlock(BlockGetter, rightPosAbove) ? 1 : 0);
            boolean leftIsLowerOfSameType = leftBlockstate.getBlock() == this && leftBlockstate.getValue(THIRD) == TallDoorPart.BOTTOM;
            boolean rightIsLowerOfSameType = rightBlockstate.getBlock() == this && rightBlockstate.getValue(THIRD) == TallDoorPart.BOTTOM;
            if ((!leftIsLowerOfSameType || rightIsLowerOfSameType) && i <= 0) {
                if ((!rightIsLowerOfSameType || leftIsLowerOfSameType) && i >= 0) {
                    int j = behindDir.getStepX();
                    int k = behindDir.getStepZ();
                    Vec3 vec3d = context.getClickLocation();
                    double d0 = vec3d.x - (double)placePos.getX();
                    double d1 = vec3d.z - (double)placePos.getZ();
                    return (j >= 0 || !(d1 < 0.5D)) && (j <= 0 || !(d1 > 0.5D)) && (k >= 0 || !(d0 > 0.5D)) && (k <= 0 || !(d0 < 0.5D)) ? DoorHingeSide.LEFT : DoorHingeSide.RIGHT;
                } else {
                    return DoorHingeSide.LEFT;
                }
            } else {
                return DoorHingeSide.RIGHT;
            }
        }

        @Override
        public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
            openDoubleDoors(level, state, pos);
            state = state.cycle(OPEN);
            level.setBlock(pos, state, 10);
            level.levelEvent(player, state.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
            level.gameEvent(player, state.getValue(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
            if (state.getValue(WATERLOGGED)) {
                level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
            }
            return InteractionResult.sidedSuccess(level.isClientSide);

        }
        @Override
        public void tick(BlockState state, @NotNull ServerLevel level, BlockPos pos, Random random) {
            if (!level.isClientSide) {
                state = state.cycle(OPEN);
                level.setBlock(pos, state, 10);
                level.levelEvent(null, state.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
            }
        }

        public void toggleDoor(@NotNull Level level, BlockPos pos, boolean open) {
            BlockState blockstate = level.getBlockState(pos);
            if (blockstate.getBlock() == this && blockstate.getValue(OPEN) != open) {
                level.setBlock(pos, blockstate.setValue(OPEN, open), 10);
                if (blockstate.getValue(THIRD) == TallDoorPart.TOP) {
                    BlockState middle = level.getBlockState(pos.below());
                    BlockState bottom = level.getBlockState(pos.below(2));
                    if (middle.getBlock() == this) {
                        level.setBlock(pos.below(), middle.setValue(OPEN, open), 10);
                    }
                    if (bottom.getBlock() == this) {
                        level.setBlock(pos.below(2), middle.setValue(OPEN, open), 10);
                    }
                }
                this.playSound(level, pos, open);
            }
        }

        public boolean isOpen(@NotNull BlockState state) {
            return state.getValue(OPEN);
        }

        public void setOpen(@Nullable Entity entity, Level level, @NotNull BlockState state, BlockPos pos, boolean open) {
            if (state.is(this) && state.getValue(OPEN) != open) {
                level.setBlock(pos, state.setValue(OPEN, Boolean.valueOf(open)), 10);
                this.playSound(level, pos, open);
                level.gameEvent(entity, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
                openDoubleDoors(level, state, pos);
            }
        }

        @Override
        public void neighborChanged(BlockState state, @NotNull Level level, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
            boolean flag = level.hasNeighborSignal(pos);
            if (!flag) {
                switch(state.getValue(THIRD)) {
                    case BOTTOM:
                        flag = level.hasNeighborSignal(pos.relative(Direction.UP)) || level.hasNeighborSignal(pos.relative(Direction.UP, 2));
                        break;
                    case MIDDLE:
                        flag = level.hasNeighborSignal(pos.relative(Direction.DOWN)) || level.hasNeighborSignal(pos.relative(Direction.UP));
                        break;
                    case TOP:
                        flag = level.hasNeighborSignal(pos.relative(Direction.DOWN)) || level.hasNeighborSignal(pos.relative(Direction.DOWN, 2));
                        break;
                }
            }
            if (blockIn != this && flag != state.getValue(POWERED)) {
                if (flag != state.getValue(OPEN)) {
                    this.playSound(level, pos, flag);
                }
                openDoubleDoors(level, state, pos);
                level.setBlock(pos, state.setValue(POWERED, flag).setValue(OPEN, flag), 2);
            }
        }

        @Override
        public boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            boolean result;
            BlockPos below = pos.below();
            BlockPos below2 = below.below();
            BlockState belowState = level.getBlockState(below);
            BlockState below2State = level.getBlockState(below2);
            if (state.getValue(THIRD) == TallDoorPart.BOTTOM) {
                result = belowState.isFaceSturdy(level, below, Direction.UP);
                return result;
            } else if (state.getValue(THIRD) == TallDoorPart.MIDDLE) {
                result = belowState.getBlock() == this;
                return result;
            } else {
                result = belowState.getBlock() == this && below2State.getBlock() == this;
                return result;
            }
        }

        protected void playSound(@NotNull Level level, BlockPos pos, boolean isOpen) {
            level.levelEvent(null, isOpen ? this.getOpenSound() : this.getCloseSound(), pos, 0);
        }

        @Override
        @OnlyIn(Dist.CLIENT)
        public long getSeed(@NotNull BlockState state, @NotNull BlockPos pos) {
            return Mth.getSeed(pos.getX(), pos.below(state.getValue(THIRD) == TallDoorPart.BOTTOM ? 0 : state.getValue(THIRD) == TallDoorPart.MIDDLE ? 1 : 2).getY(), pos.getZ());
        }

        @Override
        protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
            builder.add(THIRD, FACING, OPEN, HINGE, POWERED, WATERLOGGED);
        }

        @Override
        public FluidState getFluidState(@NotNull BlockState state) {
            return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
        }

        @Override
        public VoxelShape getShape(@NotNull BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
            Direction direction = state.getValue(FACING);
            boolean flag = !state.getValue(OPEN);
            boolean flag1 = state.getValue(HINGE) == DoorHingeSide.RIGHT;
            switch(direction) {
                case EAST:
                default:
                    return flag ? EAST_AABB : (flag1 ? NORTH_AABB : SOUTH_AABB);
                case SOUTH:
                    return flag ? SOUTH_AABB : (flag1 ? EAST_AABB : WEST_AABB);
                case WEST:
                    return flag ? WEST_AABB : (flag1 ? SOUTH_AABB : NORTH_AABB);
                case NORTH:
                    return flag ? NORTH_AABB : (flag1 ? WEST_AABB : EAST_AABB);
            }
        }

        public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, BlockPathTypes type) {
            switch(type) {
                case WALKABLE:
                    return state.getValue(OPEN);
                case WATER:
                    return state.getValue(OPEN) && state.getValue(WATERLOGGED);
                case OPEN:
                    return state.getValue(OPEN);
                default:
                    return false;
            }
        }

        public PushReaction getPushReaction(BlockState state) {
            return PushReaction.DESTROY;
        }

        @Override
        public BlockState rotate(@NotNull BlockState state, @NotNull Rotation rot) {
            return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
        }

        @Override
        public BlockState mirror(BlockState state, Mirror mirrorIn) {
            return mirrorIn == Mirror.NONE ? state : state.rotate(mirrorIn.getRotation(state.getValue(FACING))).cycle(HINGE);
        }

        public static boolean isWoodenDoor(@NotNull Level level, BlockPos pos) {
            return isWoodenDoor(level.getBlockState(pos));
        }

        public static boolean isWoodenDoor(@NotNull BlockState pState) {
            return pState.getBlock() instanceof TallDoorBlock && (pState.getMaterial() == Material.WOOD || pState.getMaterial() == Material.NETHER_WOOD);
        }

        public static void openDoubleDoors(Level world, BlockState state, BlockPos pos) {
            if (DoubleDoorsOpening.DOUBLE_DOORS || DoubleDoorsOpening.MANYIDEAS_DOORS) {
                Direction direction = state.getValue(TallDoorBlock.FACING);
                boolean isOpen = state.getValue(TallDoorBlock.OPEN);
                DoorHingeSide isMirrored = state.getValue(TallDoorBlock.HINGE);
                BlockPos mirrorPos = pos.relative(isMirrored == DoorHingeSide.RIGHT ? direction.getCounterClockWise() : direction.getClockWise());
                BlockPos doorPos = state.getValue(TallDoorBlock.THIRD) == TallDoorPart.BOTTOM ? mirrorPos : mirrorPos.below();
                BlockState other = world.getBlockState(doorPos);
                if (other.getBlock() == state.getBlock() && other.getValue(TallDoorBlock.FACING) == direction && !other.getValue(TallDoorBlock.POWERED) &&  other.getValue(TallDoorBlock.OPEN) == isOpen && other.getValue(TallDoorBlock.HINGE) != isMirrored) {
                    BlockState newState = other.cycle(TallDoorBlock.OPEN);
                    world.setBlock(doorPos, newState, 10);
                }
            }
        }

}

