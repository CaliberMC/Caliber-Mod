package com.calibermc.caliber.event;

import com.calibermc.caliber.Caliber;

import com.calibermc.caliber.block.custom.SlabLayerBlock;
import com.calibermc.caliber.block.custom.VerticalSlabLayerBlock;
import com.calibermc.caliber.command.CaliberCommands;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.data.ModBlockFamilies;
import com.calibermc.caliber.data.ModBlockFamily;
import com.calibermc.caliber.util.player.IPlayerExtended;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;

@Mod.EventBusSubscriber(modid = Caliber.MOD_ID)
public class ModEventBus {

    @SubscribeEvent
    public static void preventRightClick(PlayerInteractEvent.RightClickBlock event) {
        if (event.getPlayer() instanceof IPlayerExtended ex && event.getHand() == InteractionHand.MAIN_HAND) {
            BlockState state = event.getWorld().getBlockState(event.getPos());
            if (event.getPlayer().getItemInHand(event.getHand()).is(state.getBlock().asItem())
                    && state.hasProperty(BlockStateProperties.LAYERS)) {
                boolean slab = CaliberCommonConfigs.MODE_BLOCKSTATE.get() == 0;
                if (ex.caliber$additionalPressed()) {
                    slab = !slab;
                }

                if (slab) {
                    if (state.getValue(BlockStateProperties.LAYERS) == 3 || state.getValue(BlockStateProperties.LAYERS) == 4) {
                        int slabVal = 5;
                        if (state.getBlock() instanceof SlabLayerBlock || state.getBlock() instanceof VerticalSlabLayerBlock) {
                            slabVal = 8;
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
    }

    @SubscribeEvent
    public static void placeBlock(BlockEvent.EntityPlaceEvent event) {
        if (event.getEntity() instanceof IPlayerExtended ex) {
            BlockState state = event.getPlacedBlock();
            if (state.hasProperty(BlockStateProperties.LAYERS) && event.getEntity() instanceof ServerPlayer) {
                boolean slab = CaliberCommonConfigs.MODE_BLOCKSTATE.get() == 0;
                if (ex.caliber$additionalPressed()) {
                    slab = !slab;
                }

                if (slab) {
                    int slabVal = 3;
                    if (state.getBlock() instanceof SlabLayerBlock || state.getBlock() instanceof VerticalSlabLayerBlock) {
                        slabVal = 4;
                    }
                    state = state.setValue(BlockStateProperties.LAYERS, slabVal);
                }
                event.getWorld().setBlock(event.getBlockSnapshot().getPos(), state, 18);
            }
        }
    }

    public static void handleInteraction(CompoundTag tag, ServerPlayer pPlayer, BlockState pStateClicked, LevelAccessor pAccessor, BlockPos pPos, boolean pShouldCycleState) {
        if (pPlayer.canUseGameMasterBlocks()) {
            Block block = pStateClicked.getBlock();
            Collection<Property<?>> collection = block.getStateDefinition().getProperties();
            ResourceLocation key = ForgeRegistries.BLOCKS.getKey(block);
            assert key != null;
            String s = "block.%s.%s".formatted(key.getNamespace(), key.getPath());
            if (collection.isEmpty()) {
                pPlayer.sendMessage(new TranslatableComponent("item.minecraft.debug_stick.empty", s), ChatType.GAME_INFO, Util.NIL_UUID);
            } else {
                Property<?> property = block.getStateDefinition().getProperty(tag.getString(s));
                if (pShouldCycleState) {
                    if (property == null) {
                        property = collection.iterator().next();
                    }

                    BlockState blockstate = cycleState(pStateClicked, property, pPlayer.isSecondaryUseActive());
                    pAccessor.setBlock(pPos, blockstate, 18);
                    pPlayer.sendMessage(new TranslatableComponent("item.minecraft.debug_stick.update", property.getName(), propertyName(blockstate, property)), ChatType.GAME_INFO, Util.NIL_UUID);
                } else {
                    property = nextProperty(collection, property, pPlayer.isSecondaryUseActive());
                    String s2 = property.getName();
                    tag.putString(s, s2);
                    pPlayer.sendMessage(new TranslatableComponent("item.minecraft.debug_stick.select", s2, propertyName(pStateClicked, property)), ChatType.GAME_INFO, Util.NIL_UUID);
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
