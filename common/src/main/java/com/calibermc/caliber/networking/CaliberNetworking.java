package com.calibermc.caliber.networking;

import com.calibermc.buildify.Buildify;
import com.calibermc.caliber.Caliber;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.NetworkDir;

public class CaliberNetworking {

    public static final ChannelHandler INSTANCE = ChannelHandler.builder(Caliber.MOD_ID)
            .version(5)
            .register(NetworkDir.PLAY_TO_SERVER,
                    ServerPressAdditionalKey.class, ServerPressAdditionalKey::new)
            .build();

    public static void init() {
    }
}

