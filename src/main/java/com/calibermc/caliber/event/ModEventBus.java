package com.calibermc.caliber.event;

import com.calibermc.caliber.Caliber;

import com.calibermc.caliber.block.custom.SlabLayerBlock;
import com.calibermc.caliber.block.custom.VerticalSlabLayerBlock;
import com.calibermc.caliber.command.CaliberCommands;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.util.ModBlockStateProperties;
import com.calibermc.buildify.util.player.IPlayerExtended;
import net.minecraft.Util;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(modid = Caliber.MOD_ID)
public class ModEventBus {


    @SubscribeEvent
    public static void preventRightClick(PlayerInteractEvent.RightClickBlock event) {
        if (event.getPlayer() instanceof IPlayerExtended ex && event.getHand() == InteractionHand.MAIN_HAND) {
            BlockState state = event.getWorld().getBlockState(event.getPos());
            if (event.getPlayer().getItemInHand(event.getHand()).is(state.getBlock().asItem()) && state.hasProperty(BlockStateProperties.LAYERS) && !state.hasProperty(ModBlockStateProperties.FIVE_LAYERS)) {
                boolean slab = CaliberCommonConfigs.MODE_BLOCKSTATE.get() == 0;
                if (ex.buildify$additionalPressed()) {
                    slab = !slab;                 }
                if (slab && state.getValue(BlockStateProperties.LAYERS) == 4) {
                    int slabVal = 5;
                    if (state.getBlock() instanceof SlabLayerBlock || state.getBlock() instanceof VerticalSlabLayerBlock) {
                        ItemStack stack = event.getPlayer().getItemInHand(event.getHand());
                        slabVal = 8;
                        if (!event.getPlayer().isCreative()){
                            stack.shrink(4);
                        }

                    }
                    state = state.setValue(BlockStateProperties.LAYERS, slabVal);
                    event.getWorld().setBlock(event.getPos(), state, 18);
                    SoundType soundtype = state.getSoundType(event.getWorld(), event.getPos(), event.getPlayer());
                    event.getWorld().playSound(event.getPlayer(), event.getPos(), soundtype.getPlaceSound(), SoundSource.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                    event.setCanceled(true);
                }
            }
        }
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

    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        CaliberCommands.register(event.getDispatcher());
    }


}
