package com.calibermc.caliber.networking;

import com.calibermc.caliber.Caliber;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.network.NetworkEvent;

import java.util.UUID;
import java.util.function.Supplier;

public class ServerAdjustReach {

    public static final UUID MODIFIER_UUID = UUID.fromString("d58171f5-856b-49eb-9d8b-8ec230980f3b");
    private final double distance;

    public ServerAdjustReach(double distance) {
        this.distance = distance;
    }

    public ServerAdjustReach(FriendlyByteBuf buffer) {
        this.distance = buffer.readDouble();
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.writeDouble(this.distance);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer sender = ctx.get().getSender();
            if (sender != null) {
                ServerAdjustReach.setModifier(sender, this.distance, ForgeMod.ATTACK_RANGE.get(), ForgeMod.REACH_DISTANCE.get());
            }
        });
        ctx.get().setPacketHandled(true);
    }

    public static void setModifier(LivingEntity entity, double distance, Attribute... attributes) {
        for (Attribute attribute : attributes) {
            AttributeInstance instance = entity.getAttribute(attribute);
            if (instance != null) {
                instance.removeModifier(MODIFIER_UUID);
                if (distance >= 0) {
                    double forgeVal = instance.getValue() + 0.5;
                    instance.addPermanentModifier(new AttributeModifier(MODIFIER_UUID, Caliber.MOD_ID, distance - forgeVal, AttributeModifier.Operation.ADDITION));
                }
            }
        }
    }

}