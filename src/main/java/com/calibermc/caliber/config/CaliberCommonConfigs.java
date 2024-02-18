package com.calibermc.caliber.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CaliberCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.IntValue MODE_BLOCKSTATE;

    static {
        BUILDER.push("Configs for Caliber Mod");

        MODE_BLOCKSTATE = BUILDER.comment("Change mode for use additional blockstates").translation("config.caliber.mode_blockstates").defineInRange("mode_blockstates", 1, 0, 1);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
