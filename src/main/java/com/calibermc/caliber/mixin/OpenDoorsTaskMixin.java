package com.calibermc.caliber.mixin;

import com.calibermc.caliber.util.ModTags;
import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.behavior.InteractWithDoor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Node;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Mixin(InteractWithDoor.class)
public class OpenDoorsTaskMixin {
	/*
	@Inject(method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;rememberDoorToClose(Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;Ljava/util/Optional;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", ordinal = 0, shift = Shift.BY, by = 2), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectStartP1(CallbackInfoReturnable<BehaviorControl<LivingEntity>> cir, @Local ServerLevel world, LivingEntity entity, long time, Path path, Node node, Node node1, BlockPos blockpos, BlockState blockstate) {
		if (blockstate.is(ModTags.Blocks.tallWoodenDoors, (localblockstate) -> {
			return localblockstate.getBlock() instanceof TallDoorBlock;
		})) {
			TallDoorBlock talldoorblock = (TallDoorBlock)blockstate.getBlock();
			if (!talldoorblock.isOpen(blockstate)) {
				talldoorblock.setOpen(entity, world, blockstate, blockpos, true);
			}
			((InteractWithDoor)(Object)this).rememberDoorToClose(world, entity, blockpos);
		}
	}

	@Inject(method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)V", shift = Shift.BEFORE), locals = LocalCapture.CAPTURE_FAILSOFT)
	private void injectStartP2(ServerLevel world, LivingEntity entity, long time, CallbackInfo ci, Path path, Node node, Node node1) {
		BlockPos blockPos = node1.asBlockPos();
		BlockState blockstate = world.getBlockState(blockPos);
		if (blockstate.is(ModTags.Blocks.tallWoodenDoors, (localblockstate) -> {
			return localblockstate.getBlock() instanceof TallDoorBlock;
		})) {
			TallDoorBlock talldoorblock = (TallDoorBlock)blockstate.getBlock();
			if (!talldoorblock.isOpen(blockstate)) {
				talldoorblock.setOpen(entity, world, blockstate, blockPos, true);
			}
			((InteractWithDoor)(Object)this).rememberDoorToClose(world, entity, blockPos);
		}
	}*/

	@Inject(method = "closeDoorsThatIHaveOpenedOrPassedThrough", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerLevel pLevel, LivingEntity pEntity, Node pPrevious, Node pNext, Set<GlobalPos> pDoorPositions, Optional<List<LivingEntity>> pNearestLivingEntities, CallbackInfo ci, @Local BlockPos blockpos) {
		BlockState blockState = pLevel.getBlockState(blockpos);
        if (blockState.is(ModTags.Blocks.tallWoodenDoors, state -> state.getBlock() instanceof TallDoorBlock)) {
        	TallDoorBlock tallDoorBlock = (TallDoorBlock)blockState.getBlock();
        	tallDoorBlock.setOpen(pEntity, pLevel, blockState, blockpos, false);
        }
	}
}
