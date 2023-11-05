package com.calibermc.caliber.networking;

import com.calibermc.caliber.Caliber;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModNetworking {

    public static SimpleChannel INSTANCE;
    private static int id = 0;

    public static void registerMessages() {
        INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(Caliber.MOD_ID, "network"), () -> "1.0", s -> true, s -> true);
        INSTANCE.registerMessage(id++, ServerOpenBlockPickerMenu.class, ServerOpenBlockPickerMenu::toBytes, ServerOpenBlockPickerMenu::new, ServerOpenBlockPickerMenu::handle);
        INSTANCE.registerMessage(id++, ServerAdjustReach.class, ServerAdjustReach::toBytes, ServerAdjustReach::new, ServerAdjustReach::handle);
    }
}
