package com.calibermc.caliber.networking;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.util.player.IPlayerExtended;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.ForgeMod;
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
                ex.caliber$pressAdditional(this.press);
            }
        });
        ctx.get().setPacketHandled(true);
    }
}