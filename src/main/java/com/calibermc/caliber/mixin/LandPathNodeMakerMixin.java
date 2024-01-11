package com.calibermc.caliber.mixin;

import com.calibermc.caliber.block.custom.TallDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WalkNodeEvaluator.class)
public class LandPathNodeMakerMixin
{
	@Inject(at = @At("RETURN"), method = "getBlockPathTypeRaw(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/pathfinder/BlockPathTypes;", cancellable = true)
	private static void injectDoorType(BlockGetter world, BlockPos pos, CallbackInfoReturnable<BlockPathTypes> callback) {
		BlockState blockStateDDCheck = world.getBlockState(pos);
		if (TallDoorBlock.isWoodenDoor(blockStateDDCheck) && !blockStateDDCheck.getValue(TallDoorBlock.OPEN).booleanValue()) {
            callback.setReturnValue(BlockPathTypes.DOOR_WOOD_CLOSED);
        }
		if (blockStateDDCheck.getBlock() instanceof TallDoorBlock && blockStateDDCheck.getMaterial() == Material.METAL && !blockStateDDCheck.getValue(TallDoorBlock.OPEN).booleanValue()) {
            callback.setReturnValue(BlockPathTypes.DOOR_IRON_CLOSED);
        }
		if (blockStateDDCheck.getBlock() instanceof TallDoorBlock && blockStateDDCheck.getValue(TallDoorBlock.OPEN).booleanValue()) {
            callback.setReturnValue(BlockPathTypes.DOOR_OPEN);
        }
	}

}
