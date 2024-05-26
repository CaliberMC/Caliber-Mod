package com.calibermc.caliber.config;

import com.calibermc.buildify.Buildify;
import com.calibermc.caliber.Caliber;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigBuilder;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigSpec;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigType;

import java.util.function.Supplier;

public class CaliberCommonConfigs {
    public static final ConfigSpec SPEC;

    public static void init() {
        // Just loads the class, so we can have this all static final
    }

    public static final Supplier<Integer> MODE_BLOCKSTATE;

    static {
        ConfigBuilder builder = ConfigBuilder.create(Caliber.MOD_ID, ConfigType.COMMON);
        builder.push("Configs for Caliber Mod");

        MODE_BLOCKSTATE = builder.comment("Change mode for use additional blockstates").define("mode_blockstates", 1, 0, 1);

        builder.pop();
        // With this line, the config file will be synced to all connecting clients when connecting to a server
        builder.setSynced();

        // Builds and register out config
        SPEC = builder.buildAndRegister();
        // If this is called, the config file wil be loaded immediately
        SPEC.loadFromFile();
    }
}
