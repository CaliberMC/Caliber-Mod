package com.calibermc.caliber.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CaliberClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue CUSTOM_CREATIVE_INVENTORY;

    static {
        BUILDER.push("Configs for Caliber Mod");

        CUSTOM_CREATIVE_INVENTORY = BUILDER.comment("Use Custom Creative Inventory?").translation("config.caliber.custom_creative_inventory").define("custom_creative_inventory", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
