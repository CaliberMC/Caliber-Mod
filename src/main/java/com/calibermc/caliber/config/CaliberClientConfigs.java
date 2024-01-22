package com.calibermc.caliber.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CaliberClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for Caliber Mod");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
