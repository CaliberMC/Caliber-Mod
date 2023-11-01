package com.calibermc.caliber.networking;

import com.calibermc.caliber.world.inventory.ModMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkHooks;

import java.util.function.Supplier;

public class ServerOpenBlockStateMenu {

    public ServerOpenBlockStateMenu() {}

    public ServerOpenBlockStateMenu(FriendlyByteBuf buffer) {
    }

    public void toBytes(FriendlyByteBuf buffer) {
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer sender = ctx.get().getSender();
            if (sender != null) {
                NetworkHooks.openGui(sender, new SimpleMenuProvider((id, playerInventory, entity) ->
                        ModMenuTypes.BLOCKSTATE.get().create(id, playerInventory),
                        new TranslatableComponent("screen.caliber.blockstate")));
            }
        });
        ctx.get().setPacketHandled(true);
    }

}