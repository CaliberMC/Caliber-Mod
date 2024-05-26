package com.calibermc.caliber.event;

import com.calibermc.buildify.util.player.IPlayerExtended;
import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliberlib.block.custom.SlabLayerBlock;
import com.calibermc.caliberlib.block.custom.VerticalSlabLayerBlock;
import com.calibermc.caliberlib.util.ModBlockStateProperties;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;

import org.jetbrains.annotations.Nullable;

public class CaliberEventBus {

    public static boolean preventRightClick(Player player, Level level, BlockPos pos, InteractionHand hand) {
        if (player instanceof IPlayerExtended ex && hand == InteractionHand.MAIN_HAND) {
            BlockState state = level.getBlockState(pos);
            if (player.getItemInHand(hand).is(state.getBlock().asItem()) && state.hasProperty(BlockStateProperties.LAYERS) && !state.hasProperty(ModBlockStateProperties.FIVE_LAYERS)) {
                boolean slab = CaliberCommonConfigs.MODE_BLOCKSTATE.get() == 0;
                if (ex.buildify$additionalPressed()) {
                    slab = !slab;                 }
                if (slab && state.getValue(BlockStateProperties.LAYERS) == 4) {
                    int slabVal = 5;
                    if (state.getBlock() instanceof SlabLayerBlock || state.getBlock() instanceof VerticalSlabLayerBlock) {
                        ItemStack stack = player.getItemInHand(hand);
                        slabVal = 8;
                        if (!player.isCreative()){
                            stack.shrink(4);
                        }

                    }
                    state = state.setValue(BlockStateProperties.LAYERS, slabVal);
                    level.setBlock(pos, state, 18);
                    SoundType soundtype = state.getSoundType();
                    level.playSound(player, pos, soundtype.getPlaceSound(), SoundSource.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                    return true;
                }
            }
        }
        return false;
    }


    private static <T extends Comparable<T>> BlockState cycleState(BlockState pState, Property<T> pProperty, boolean pBackwards) {
        return pState.setValue(pProperty, nextProperty(pProperty.getPossibleValues(), pState.getValue(pProperty), pBackwards));
    }

    private static <T> T nextProperty(Iterable<T> allowedValues, @Nullable T currentValue, boolean backwards) {
        return backwards ? Util.findPreviousInIterable(allowedValues, currentValue) : Util.findNextInIterable(allowedValues, currentValue);
    }

    private static <T extends Comparable<T>> String propertyName(BlockState state, Property<T> property) {
        return property.getName(state.getValue(property));
    }
}
