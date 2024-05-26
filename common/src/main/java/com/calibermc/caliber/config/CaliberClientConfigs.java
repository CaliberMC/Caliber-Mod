package com.calibermc.caliber.config;

import com.calibermc.buildify.Buildify;
import com.calibermc.caliber.Caliber;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigBuilder;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigSpec;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigType;

public class CaliberClientConfigs {
    public static final ConfigSpec SPEC;

    public static void init() {
        // Just loads the class, so we can have this all static final
    }

    static {
        ConfigBuilder builder = ConfigBuilder.create(Caliber.MOD_ID, ConfigType.CLIENT);
        builder.push("Configs for Caliber Mod");

        builder.pop();
        SPEC = builder.buildAndRegister();
        SPEC.loadFromFile();
    }
}
