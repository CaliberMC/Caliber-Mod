package com.calibermc.caliber.event;


import com.calibermc.caliber.Caliber;

import com.calibermc.caliber.command.CaliberCommands;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.Collection;


@Mod.EventBusSubscriber(modid = Caliber.MOD_ID)
public class ModEventBus {

    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        CaliberCommands.register(event.getDispatcher());
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


}
