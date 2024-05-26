package com.calibermc.caliber;

import com.calibermc.caliber.client.inventory.WoodcutterScreen;
import com.calibermc.caliber.crafting.CaliberMenuTypes;
import com.calibermc.caliber.event.CaliberClientEventBus;
import net.mehvahdjukaar.moonlight.api.platform.ClientHelper;
import net.minecraft.client.gui.screens.MenuScreens;

public class CaliberClient {
    public static void init() {
        ClientHelper.addKeyBindRegistration(keyBindEvent -> {
            keyBindEvent.register(CaliberClientEventBus.ALLOW_ADDITIONAL);
        });
        ClientHelper.addClientSetup(CaliberClient::setup);
    }

    private static void setup() {
        MenuScreens.register(CaliberMenuTypes.WOODCUTTER.get(), WoodcutterScreen::new);
    }
}
