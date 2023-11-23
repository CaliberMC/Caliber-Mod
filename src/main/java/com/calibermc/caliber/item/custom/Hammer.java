package com.calibermc.caliber.item.custom;

import com.calibermc.caliber.event.ModEventBus;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class Hammer extends Item {

    public Hammer(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean canAttackBlock(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer) {

        if (pPlayer instanceof ServerPlayer player) {
            ModEventBus.hammerInteraction(player.getItemInHand(InteractionHand.MAIN_HAND).getOrCreateTag(), player, pState, pLevel, pPos, false);
        }
        return false;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Player player = pContext.getPlayer();
        if (player instanceof ServerPlayer serverPlayer) {
                // Check if the player has nails in their inventory
                if (hasNails(serverPlayer)) {
                    // Consume a nail
                    consumeNail(serverPlayer);
                } else {
                    // If the player does not have nails, prevent the action
                    serverPlayer.sendMessage(new TranslatableComponent("message.caliber.no_nails"), ChatType.GAME_INFO, Util.NIL_UUID);
                    return InteractionResult.FAIL;
                }

            if (serverPlayer.isShiftKeyDown()) {
                ModEventBus.hammerInteraction(pContext.getItemInHand().getOrCreateTag(), serverPlayer, level.getBlockState(pContext.getClickedPos()), level, pContext.getClickedPos(), false);
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
            ModEventBus.hammerInteraction(pContext.getItemInHand().getOrCreateTag(), serverPlayer, level.getBlockState(pContext.getClickedPos()), level, pContext.getClickedPos(), true);

            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        return InteractionResult.FAIL;
    }

    private boolean hasNails(ServerPlayer player) {
        Item nail = ModItems.NAILS.get();
        // Check main inventory
        for (ItemStack itemStack : player.getInventory().items) {
            if (itemStack.getItem().equals(nail)) {
                return true;
            }
        }
        // Check offhand
        ItemStack offhandStack = player.getOffhandItem();
        return offhandStack.getItem().equals(nail);
    }

    private void consumeNail(ServerPlayer player) {
        Item nailItem = ModItems.NAILS.get();

        if (player.isCreative() || player.isShiftKeyDown()) {
            return;
        }

        for (ItemStack itemStack : player.getInventory().items) {
            if (itemStack.getItem().equals(nailItem)) {
                itemStack.shrink(1); // Decrease the count by one
                if (itemStack.isEmpty()) {
                    player.getInventory().removeItem(itemStack); // Remove the stack if it's empty
                }
                break; // Stop after consuming one nail
            }
        }

    }
}
