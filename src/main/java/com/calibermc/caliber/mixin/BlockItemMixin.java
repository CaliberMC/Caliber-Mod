package com.calibermc.caliber.mixin;

import com.calibermc.caliber.block.custom.SlabLayerBlock;
import com.calibermc.caliber.block.custom.VerticalSlabLayerBlock;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.util.ModBlockStateProperties;
import com.calibermc.caliber.util.player.IPlayerExtended;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockItem.class)
public class BlockItemMixin {

    @Inject(method = "getPlacementState(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", at = @At("RETURN"), cancellable = true)
    public void mixin$getPlacementState(BlockPlaceContext pContext, CallbackInfoReturnable<BlockState> cir) {
        if (pContext.getPlayer() instanceof IPlayerExtended ex) {
            BlockState state = cir.getReturnValue();
            if (state != null && (state.hasProperty(BlockStateProperties.LAYERS) || state.hasProperty(ModBlockStateProperties.FIVE_LAYERS))) {
                boolean slab = CaliberCommonConfigs.MODE_BLOCKSTATE.get() == 0;
                if (ex.caliber$additionalPressed()) {
                    slab = !slab;
                }
                if (slab) {
                    Property<Integer> property = state.hasProperty(ModBlockStateProperties.FIVE_LAYERS) ? ModBlockStateProperties.FIVE_LAYERS : BlockStateProperties.LAYERS;
                    int oldSlabVal = state.getValue(property);
                    int slabVal = 3;
                    Block block = state.getBlock();
                    if (block instanceof SlabLayerBlock || block instanceof VerticalSlabLayerBlock) {
                        slabVal = 4;
                        pContext.getItemInHand().shrink(slabVal - 1);
                    } else if (oldSlabVal == 3) {
                        pContext.getItemInHand().shrink(slabVal - 1);
                    }
                    if (oldSlabVal != slabVal) {
                        cir.setReturnValue(state.setValue(property, slabVal));
                    }
                }
            }
        }
    }
}
