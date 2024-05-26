package com.calibermc.caliber.networking;

import com.calibermc.buildify.util.player.IPlayerExtended;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.Message;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

import java.util.function.Supplier;

public class ServerPressAdditionalKey implements Message {

    private final boolean press;

    public ServerPressAdditionalKey(boolean press) {
        this.press = press;
    }

    public ServerPressAdditionalKey(FriendlyByteBuf buffer) {
        this.press = buffer.readBoolean();
    }

    @Override
    public void writeToBuffer(FriendlyByteBuf friendlyByteBuf) {
        friendlyByteBuf.writeBoolean(this.press);
    }

    @Override
    public void handle(ChannelHandler.Context ctx) {
        Player sender = ctx.getSender();
        if (sender instanceof IPlayerExtended ex) {
            ex.buildify$pressAdditional(this.press);
        }
    }
}