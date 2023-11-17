package com.calibermc.caliber.networking;

import com.calibermc.caliber.util.player.IPlayerExtended;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.UUID;
import java.util.function.Supplier;

public class ClientSetTime {

    public final UUID playerUUID;
    public final long dayTime;
    public final boolean shouldTick, reset;

    public ClientSetTime(UUID playerUUID, long dayTime, boolean shouldTick) {
        this(playerUUID, dayTime, shouldTick, false);
    }

    public ClientSetTime(UUID playerUUID) {
        this(playerUUID, 0, false, true);
    }

    private ClientSetTime(UUID playerUUID, long dayTime, boolean shouldTick, boolean reset) {
        this.playerUUID = playerUUID;
        this.dayTime = dayTime;
        this.shouldTick = shouldTick;
        this.reset = reset;
    }

    public ClientSetTime(FriendlyByteBuf buffer) {
        this.playerUUID = buffer.readUUID();
        this.dayTime = buffer.readLong();
        this.shouldTick = buffer.readBoolean();
        this.reset = buffer.readBoolean();
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.writeUUID(this.playerUUID);
        buffer.writeLong(this.dayTime);
        buffer.writeBoolean(this.shouldTick);
        buffer.writeBoolean(this.reset);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            Minecraft mc = Minecraft.getInstance();
            if (mc.level != null && mc.level.getPlayerByUUID(this.playerUUID) instanceof IPlayerExtended ex) {
                if (this.reset) {
                    ex.caliber$resetDayTime();
                } else {
                    ex.caliber$setDayTime(this.dayTime, this.shouldTick);
                }
            }
        });
        ctx.get().setPacketHandled(true);
    }

}