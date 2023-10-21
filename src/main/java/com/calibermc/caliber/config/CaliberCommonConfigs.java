package com.calibermc.caliber.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CaliberCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> TIN_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> TIN_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> TIN_GEN_MIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> TIN_GEN_MAX;

    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_GEN_MIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_GEN_MAX;

    public static final ForgeConfigSpec.ConfigValue<Integer> GRANITE_UPPER_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> GRANITE_UPPER_GEN_MIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GRANITE_UPPER_GEN_MAX;

    public static final ForgeConfigSpec.ConfigValue<Integer> GRANITE_LOWER_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> GRANITE_LOWER_GEN_MIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GRANITE_LOWER_GEN_MAX;

    public static final ForgeConfigSpec.ConfigValue<Integer> LIMESTONE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> LIMESTONE_GEN_MIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> LIMESTONE_GEN_MAX;

    public static final ForgeConfigSpec.ConfigValue<Integer> MARBLE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARBLE_GEN_MIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARBLE_GEN_MAX;



    static {
        BUILDER.push("Configs for Caliber Mod");

        // Ore Generation
        // Metal Ores
        TIN_VEINS_PER_CHUNK = BUILDER.comment("Tin Ore veins per chunk")
                .define("Tin Ore Probability", 7);
        TIN_VEIN_SIZE = BUILDER.comment("Tin Ore blocks per vein")
                .defineInRange("Tin Ore Amount", 9, 4, 20);
        TIN_GEN_MIN = BUILDER.comment("Tin Ore generation minimum height")
                .define("Tin Ore Minimum Height", -64);
        TIN_GEN_MAX = BUILDER.comment("Tin Ore generation maximum height")
                .define("Tin Ore Maximum Height", 164);

        SILVER_VEINS_PER_CHUNK = BUILDER.comment("Silver Ore veins per chunk")
                .define("Silver Ore Probability", 7);
        SILVER_VEIN_SIZE = BUILDER.comment("Silver Ore blocks per vein")
                .defineInRange("Silver Ore Amount", 9, 4, 20);
        SILVER_GEN_MIN = BUILDER.comment("Silver Ore generation minimum height")
                .define("Silver Ore Minimum Height", -80);
        SILVER_GEN_MAX = BUILDER.comment("Silver Ore generation maximum height")
                .define("Silver Ore Maximum Height", 64);

        // Stone
        GRANITE_UPPER_VEINS_PER_CHUNK = BUILDER.comment("Granite Upper Ore veins per chunk")
                .define("Granite Upper Ore Probability", 6);
        GRANITE_UPPER_GEN_MIN = BUILDER.comment("Granite Upper Ore generation minimum height")
                .define("Granite Upper Ore Minimum Height", 64);
        GRANITE_UPPER_GEN_MAX = BUILDER.comment("Granite Upper Ore generation maximum height")
                .define("Granite Upper Ore Maximum Height", 128);

        GRANITE_LOWER_VEINS_PER_CHUNK = BUILDER.comment("Granite Lower Ore veins per chunk")
                .define("Granite Lower Ore Probability", 2);
        GRANITE_LOWER_GEN_MIN = BUILDER.comment("Granite Lower Ore generation minimum height")
                .define("Granite Lower Ore Minimum Height", 0);
        GRANITE_LOWER_GEN_MAX = BUILDER.comment("Granite Lower Ore generation maximum height")
                .define("Granite Lower Ore Maximum Height", 60);

        LIMESTONE_VEINS_PER_CHUNK = BUILDER.comment("Limestone Ore veins per chunk")
                .define("Limestone Ore Probability", 16);
        LIMESTONE_GEN_MIN = BUILDER.comment("Limestone Ore generation minimum height")
                .define("Limestone Ore Minimum Height", 0);
        LIMESTONE_GEN_MAX = BUILDER.comment("Limestone Ore generation maximum height")
                .define("Limestone Ore Maximum Height", 60);

        MARBLE_VEINS_PER_CHUNK = BUILDER.comment("Marble Ore veins per chunk")
                .define("Marble Ore Probability", 2);
        MARBLE_GEN_MIN = BUILDER.comment("Marble Ore generation minimum height")
                .define("Marble Ore Minimum Height", 0);
        MARBLE_GEN_MAX = BUILDER.comment("Marble Ore generation maximum height")
                .define("Marble Ore Maximum Height", 60);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
