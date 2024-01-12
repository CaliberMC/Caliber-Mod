package com.calibermc.caliber.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CaliberClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue DISPLAY_SORTING_BUTTONS;
    public static final ForgeConfigSpec.BooleanValue CUSTOM_CREATIVE_INVENTORY;

    static {
        BUILDER.push("Configs for Caliber Mod");

        DISPLAY_SORTING_BUTTONS = BUILDER.comment("Display Sorting Buttons?").translation("config.caliber.display_sorting_buttons").define("display_sorting_buttons", true);

        CUSTOM_CREATIVE_INVENTORY = BUILDER.comment("Use Custom Creative Inventory?").translation("config.caliber.custom_creative_inventory").define("custom_creative_inventory", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
