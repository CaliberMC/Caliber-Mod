package com.calibermc.caliber.client;

import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.event.ModClientEventBus;
import com.calibermc.caliber.networking.ModNetworking;
import com.calibermc.caliber.networking.ServerAdjustReach;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.client.gui.ForgeIngameGui;
import net.minecraftforge.client.gui.IIngameOverlay;
import net.minecraftforge.common.ForgeMod;

public class AdjustReachOverlay implements IIngameOverlay {

    @Override
    public void render(ForgeIngameGui gui, PoseStack poseStack, float partialTick, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (!(mc.getCameraEntity() instanceof Player player) || !player.isCreative() || mc.screen != null) return;
        if (ModClientEventBus.ADJUST_REACH.isDown()) {
            HitResult rayTraceResult = mc.getCameraEntity().pick(256.0, partialTick, false);
            double distance = CaliberClientConfigs.MAX_RANGE.get();
            if (rayTraceResult.getType() != HitResult.Type.MISS) {
                distance = Math.min(distance, player.getEyePosition(partialTick).distanceTo(rayTraceResult.getLocation()));
            }
            distance = Math.max(Math.ceil(distance), 2);

            boolean sendPacket = true;
            AttributeInstance attributeInstance = player.getAttribute(ForgeMod.REACH_DISTANCE.get());
            if (attributeInstance != null) {
                AttributeModifier modifier = attributeInstance.getModifier(ServerAdjustReach.MODIFIER_UUID);
                if (modifier != null) {
                    sendPacket = distance != modifier.getAmount();
                }
            }
            mc.font.drawShadow(poseStack, new TextComponent(String.valueOf((int)distance)), width / 2F + 2, height / 2F + 2, -1);

            if (sendPacket) {
                ModNetworking.INSTANCE.sendToServer(new ServerAdjustReach(distance));
            }
        }
        // use this if u need remove modifiers to get default values.
        /*else {
            AttributeInstance attributeInstance = player.getAttribute(ForgeMod.REACH_DISTANCE.get());
            if (attributeInstance != null && attributeInstance.getModifier(ServerAdjustDistance.MODIFIER_UUID) != null) {
                ModNetworking.INSTANCE.sendToServer(new ServerAdjustDistance(-1));
            }
        }*/
    }
}
