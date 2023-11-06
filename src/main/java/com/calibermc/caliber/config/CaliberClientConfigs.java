package com.calibermc.caliber.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CaliberClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.IntValue MAX_RANGE;
    public static final ForgeConfigSpec.BooleanValue CUSTOM_CREATIVE_INVENTORY;

    static {
        BUILDER.push("Configs for Caliber Mod");

        MAX_RANGE = BUILDER.comment("Max range for Reach Distance key").translation("config.caliber.max_range").defineInRange("max_range", 127, 0, 255);  //127, 0, 255
        CUSTOM_CREATIVE_INVENTORY = BUILDER.comment("Use Custom Creative Inventory?").translation("config.caliber.custom_creative_inventory").define("custom_creative_inventory", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
