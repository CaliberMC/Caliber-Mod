package com.calibermc.caliber.mixin;

import com.calibermc.caliber.util.CaliberTags;
import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliberlib.util.ModTags;
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

import org.jetbrains.annotations.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Mixin(InteractWithDoor.class)
public class OpenDoorsTaskMixin {

	@Inject(method = "closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;Ljava/util/Set;Ljava/util/Optional;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerLevel world, LivingEntity entity, @Nullable Node lastNode, @Nullable Node currentNode, Set<GlobalPos> doors, Optional<List<LivingEntity>> otherMobs, CallbackInfo ci, Iterator<GlobalPos> iterator, GlobalPos globalPos, BlockPos blockPos) {
		BlockState blockStateDD = world.getBlockState(blockPos);
		if (blockStateDD.is(ModTags.Blocks.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock)) {
			TallDoorBlock tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock();
			tallDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
		}
//		if (blockStateDD.is(CaliberTags.Blocks.shortWoodenDoors, state -> state.getBlock() instanceof ShortDoorBlock)) {
//			ShortDoorBlock shortDoorBlock = (ShortDoorBlock)blockStateDD.getBlock();
//			shortDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
//		}
	}
}
