package com.calibermc.caliber.networking;

import com.calibermc.buildify.util.player.IPlayerExtended;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ServerPressAdditionalKey {

    private final boolean press;

    public ServerPressAdditionalKey(boolean press) {
        this.press = press;
    }

    public ServerPressAdditionalKey(FriendlyByteBuf buffer) {
        this.press = buffer.readBoolean();
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.writeBoolean(this.press);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer sender = ctx.get().getSender();
            if (sender instanceof IPlayerExtended ex) {
                ex.buildify$pressAdditional(this.press);
            }
        });
        ctx.get().setPacketHandled(true);
    }
}