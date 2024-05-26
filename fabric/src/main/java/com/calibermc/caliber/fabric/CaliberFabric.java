package com.calibermc.caliber.fabric;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.event.CaliberEventBus;
import com.calibermc.caliberlib.CaliberLib;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.world.InteractionResult;

public class CaliberFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Caliber.init();
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) ->
                CaliberEventBus.preventRightClick(player, world,
                        hitResult.getBlockPos(), hand) ? InteractionResult.SUCCESS : InteractionResult.PASS);
    }
}
