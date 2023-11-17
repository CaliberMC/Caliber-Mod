package com.calibermc.caliber.networking;

import com.calibermc.caliber.util.player.IPlayerExtended;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.UUID;
import java.util.function.Supplier;

public class ClientSetRaining {

    public final UUID playerUUID;
    public final boolean isRaining, clear;

    public ClientSetRaining(UUID playerUUID, boolean isRaining) {
        this(playerUUID, isRaining, false);
    }

    public ClientSetRaining(UUID playerUUID) {
        this(playerUUID, false, true);
    }

    private ClientSetRaining(UUID playerUUID, boolean isRaining, boolean clear) {
        this.playerUUID = playerUUID;
        this.isRaining = isRaining;
        this.clear = clear;
    }

    public ClientSetRaining(FriendlyByteBuf buffer) {
        this.playerUUID = buffer.readUUID();
        this.isRaining = buffer.readBoolean();
        this.clear = buffer.readBoolean();
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.writeUUID(this.playerUUID);
        buffer.writeBoolean(this.isRaining);
        buffer.writeBoolean(this.clear);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            Minecraft mc = Minecraft.getInstance();
            if (mc.level != null && mc.level.getPlayerByUUID(this.playerUUID) instanceof IPlayerExtended ex) {
                if (this.clear) {
                    ex.caliber$clearRaining();
                } else {
                    ex.caliber$setRaining(this.isRaining);
                }
            }
        });
        ctx.get().setPacketHandled(true);
    }

}