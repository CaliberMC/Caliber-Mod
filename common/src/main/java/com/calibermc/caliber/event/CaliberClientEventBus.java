package com.calibermc.caliber.event;

import com.calibermc.buildify.util.player.IPlayerExtended;
import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.networking.CaliberNetworking;
import com.calibermc.caliber.networking.ServerPressAdditionalKey;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

import static com.calibermc.caliber.Caliber.MOD_ID;


public class CaliberClientEventBus {

    public static final KeyMapping ALLOW_ADDITIONAL = new KeyMapping("%s.key.allow_additional".formatted(Caliber.MOD_ID), GLFW.GLFW_KEY_M, "key.categories.%s".formatted(Caliber.MOD_ID));

    public static void keyInput(int key, int scanCode, int action, int modifiers) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.screen != null) return;
        if (mc.player instanceof IPlayerExtended ex) {
            boolean b = ALLOW_ADDITIONAL.isDown();
            if (ex.buildify$additionalPressed() != b) {
                ex.buildify$pressAdditional(b);
                CaliberNetworking.INSTANCE.sendToServer(new ServerPressAdditionalKey(b));
            }
        }
    }
}