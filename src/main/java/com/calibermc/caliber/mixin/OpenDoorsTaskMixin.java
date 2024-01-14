package com.calibermc.caliber.mixin;

import com.calibermc.caliber.util.ModTags;
import com.calibermc.caliber.block.custom.TallDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.ai.behavior.InteractWithDoor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import javax.annotation.Nullable;
import java.util.Iterator;

@Mixin(InteractWithDoor.class)
public class OpenDoorsTaskMixin
{
	@Inject(method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;rememberDoorToClose(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;)V", ordinal = 0, shift = Shift.BY, by = 2), locals = LocalCapture.CAPTURE_FAILSOFT)
	private void injectStartP1(ServerLevel world, LivingEntity entity, long time, CallbackInfo ci, Path path, Node node, Node node1, BlockPos blockpos, BlockState blockstate) {
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
	}

	@Inject(method = "closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerLevel world, LivingEntity entity, @Nullable Node lastNode, @Nullable Node currentNode, CallbackInfo ci, Brain<?> brain, Iterator<GlobalPos> iterator, GlobalPos globalPos, BlockPos blockPos) {
		BlockState blockState = world.getBlockState(blockPos);
        if (blockState.is(ModTags.Blocks.tallWoodenDoors, state -> state.getBlock() instanceof TallDoorBlock)) {
        	TallDoorBlock tallDoorBlock = (TallDoorBlock)blockState.getBlock();
        	tallDoorBlock.setOpen(entity, world, blockState, blockPos, false);
        }
	}
}
