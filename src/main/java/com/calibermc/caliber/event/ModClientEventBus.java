package com.calibermc.caliber.event;


import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.client.BlockPickerScreen;
import com.calibermc.caliber.networking.ModNetworking;
import com.calibermc.caliber.networking.ServerOpenBlockPickerMenu;
import com.calibermc.caliber.world.inventory.ModMenuTypes;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.lwjgl.glfw.GLFW;

import static com.calibermc.caliber.Caliber.MOD_ID;


@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEventBus {

    public static final KeyMapping BLOCK_PICKER = new KeyMapping("%s.key.block_picker_screen".formatted(Caliber.MOD_ID), GLFW.GLFW_KEY_V, "key.categories.%s".formatted(Caliber.MOD_ID));

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {

    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {

    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        // register key V
        ClientRegistry.registerKeyBinding(BLOCK_PICKER);
        MenuScreens.register(ModMenuTypes.BLOCK_TYPE.get(), BlockPickerScreen::new);
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class Client {


        @SubscribeEvent
        public static void keyInput(final InputEvent.KeyInputEvent event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player == null || mc.screen != null) return;
            if (BLOCK_PICKER.consumeClick() && !mc.player.getMainHandItem().isEmpty() && mc.player.isCreative()) {
                ModNetworking.INSTANCE.sendToServer(new ServerOpenBlockPickerMenu());
            }


        }
    }
}
