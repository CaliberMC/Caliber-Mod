package com.calibermc.caliber.item.custom;

import com.calibermc.caliber.event.ModEventBus;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class Hammer extends Item {

    private BlockPos lastInteractedBlock = null;

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
        BlockPos currentPos = pContext.getClickedPos();

        if (player instanceof ServerPlayer serverPlayer) {
            // Check if the player has nails before interacting
            if (!hasNails(serverPlayer)) {
                serverPlayer.sendMessage(new TranslatableComponent("message.caliber.no_nails"), ChatType.GAME_INFO, Util.NIL_UUID);
                level.playSound(null, currentPos, SoundEvents.SHIELD_BLOCK, SoundSource.BLOCKS, 1.0F, 1.0F);
                return InteractionResult.FAIL;
            }

            BlockState originalState = level.getBlockState(currentPos);
            InteractionResult result = performInteraction(pContext, serverPlayer, level, currentPos);

            // Check if the block state has changed after the interaction
            BlockState newState = level.getBlockState(currentPos);
            if (!newState.equals(originalState) && (lastInteractedBlock == null || !lastInteractedBlock.equals(currentPos))) {
                // Block state has changed, consume a nail and update last interacted block
                consumeNail(serverPlayer);
                lastInteractedBlock = currentPos;
            }

            return result;
        }
        return InteractionResult.FAIL;
    }

    private InteractionResult performInteraction(UseOnContext pContext, ServerPlayer serverPlayer, Level level, BlockPos currentPos) {
        if (serverPlayer.isShiftKeyDown()) {
            ModEventBus.hammerInteraction(pContext.getItemInHand().getOrCreateTag(), serverPlayer, level.getBlockState(currentPos), level, currentPos, false);
            level.playSound(null, currentPos, SoundEvents.CHEST_LOCKED, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        ModEventBus.hammerInteraction(pContext.getItemInHand().getOrCreateTag(), serverPlayer, level.getBlockState(currentPos), level, currentPos, true);
        level.playSound(null, currentPos, SoundEvents.TRIDENT_HIT, SoundSource.BLOCKS, 1.0F, 1.0F);

        return InteractionResult.sidedSuccess(level.isClientSide);
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
                itemStack.shrink(1);
                if (itemStack.isEmpty()) {
                    player.getInventory().removeItem(itemStack);
                }
                break;
            }
        }
//        player.inventoryMenu.broadcastChanges();
    }

    public void resetLastInteractedBlock() {
        lastInteractedBlock = null;
    }
}
