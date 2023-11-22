package com.calibermc.caliber.item.custom;

import com.calibermc.caliber.event.ModEventBus;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class CycleItem extends Item {
    public CycleItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean canAttackBlock(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer) {
        if (pPlayer instanceof ServerPlayer player) {
            ModEventBus.handleInteraction(player.getItemInHand(InteractionHand.MAIN_HAND).getOrCreateTag(), player, pState, pLevel, pPos, false);
        }
        return false;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if (pContext.getPlayer() instanceof ServerPlayer player) {
            ModEventBus.handleInteraction(pContext.getItemInHand().getOrCreateTag(), player, level.getBlockState(pContext.getClickedPos()), level, pContext.getClickedPos(), true);
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}
