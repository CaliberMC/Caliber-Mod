package com.calibermc.caliber.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DoorBlock.class)
public class DoorBlockMixin extends Block implements SimpleWaterloggedBlock
{
	public DoorBlockMixin(Properties properties) {
		super(properties);
	}

	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	@Inject(at = @At("TAIL"), method = "<init>(Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)V")
	private void enhanceConstructor(Properties properties, CallbackInfo callback) {
		((DoorBlock)(Object)this).registerDefaultState(((DoorBlock)(Object)this).defaultBlockState().setValue(WATERLOGGED, false));
	}

	@Inject(at = @At("TAIL"), method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V")
	protected void injectBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		builder.add(WATERLOGGED);
	}

	@Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
	private void getStateForPlacement(BlockPlaceContext context, CallbackInfoReturnable<BlockState> callback) {
		BlockPos blockpos = context.getClickedPos();
		Level level = context.getLevel();
		if (blockpos.getY() < level.getMaxBuildHeight() - 1 && level.getBlockState(blockpos.above()).canBeReplaced(context)) {
			boolean flag = level.hasNeighborSignal(blockpos) || level.hasNeighborSignal(blockpos.above());
			boolean waterfilled = level.getFluidState(blockpos).getType() == Fluids.WATER;
			callback.setReturnValue(((DoorBlock)(Object)this).defaultBlockState().setValue(DoorBlock.FACING, context.getHorizontalDirection()).setValue(DoorBlock.HINGE, ((DoorBlock)(Object)this).getHinge(context)).setValue(DoorBlock.POWERED, Boolean.valueOf(flag)).setValue(DoorBlock.OPEN, Boolean.valueOf(flag)).setValue(DoorBlock.HALF, DoubleBlockHalf.LOWER).setValue(WATERLOGGED, waterfilled));
		} else {
			callback.setReturnValue(null);
		}
		callback.cancel();
	}

	@Inject(at = @At("RETURN"), method = "updateShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;")
	private void injectUpdateShape(BlockState stateIn, Direction direction, BlockState facingState, LevelAccessor accessor, BlockPos pos1, BlockPos pos2, CallbackInfoReturnable<BlockState> callback) {
		stateIn = stateIn.setValue(WATERLOGGED, accessor.getFluidState(pos1).getType() == Fluids.WATER);
	}

	@Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
	private void injectPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack, CallbackInfo callback) {
		boolean waterfilled = level.getFluidState(pos.above()).getType() == Fluids.WATER;
		level.setBlock(pos.above(), state.setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER).setValue(WATERLOGGED, waterfilled), 3);
		callback.cancel();
	}
	
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
	}
}
