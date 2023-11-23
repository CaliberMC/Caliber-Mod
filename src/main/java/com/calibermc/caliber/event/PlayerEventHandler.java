package com.calibermc.caliber.event;

import com.calibermc.caliber.item.ModItems;
import com.calibermc.caliber.item.custom.Hammer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerEventHandler {

    @SubscribeEvent
    public static void onPlayerDeath(LivingDeathEvent event) {
        if (event.getEntityLiving() instanceof ServerPlayer) {
            ServerPlayer player = (ServerPlayer) event.getEntityLiving();
            resetHammerInteraction(player);
        }
    }

    @SubscribeEvent
    public static void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) {
        if (event.getPlayer() instanceof ServerPlayer) {
            ServerPlayer player = (ServerPlayer) event.getPlayer();
            resetHammerInteraction(player);
        }
    }

    private static void resetHammerInteraction(ServerPlayer player) {
        ItemStack hammerItem = findHammerInInventory(player);
        if (hammerItem != null && hammerItem.getItem() instanceof Hammer) {
            ((Hammer) hammerItem.getItem()).resetLastInteractedBlock();
        }
    }

    private static ItemStack findHammerInInventory(ServerPlayer player) {
        // Iterate through the player's main inventory
        for (ItemStack itemStack : player.getInventory().items) {
            if (itemStack.getItem() instanceof Hammer) {
                return itemStack;
            }
        }

        // Check the offhand slot
        ItemStack offhandStack = player.getOffhandItem();
        if (offhandStack.getItem() instanceof Hammer) {
            return offhandStack;
        }

        // Return null if the hammer is not found
        return null;
    }
}
