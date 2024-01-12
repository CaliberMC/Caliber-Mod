package com.calibermc.caliber.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CaliberCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;


    public static final ForgeConfigSpec.BooleanValue WORLD_GEN_ORES;
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

    public static final ForgeConfigSpec.IntValue MODE_BLOCKSTATE;

    static {
        BUILDER.push("Configs for Caliber Mod");

        MODE_BLOCKSTATE = BUILDER.comment("Change mode for use additional blockstates").translation("config.caliber.mode_blockstates").defineInRange("mode_blockstates", 1, 0, 1);

        // Ore Generation
        WORLD_GEN_ORES = BUILDER.comment("Generate new stone types and ore in the world?").translation("config.caliber.world_gen_ores").define("world_gen_ores", true);

        // Metal Ores
        TIN_VEINS_PER_CHUNK = BUILDER.comment("Tin Ore Settings").translation("config.caliber.tin_veins_per_chunk").define("tin_ore_veins_per_chunk", 7);
        TIN_VEIN_SIZE = BUILDER.translation("config.caliber.tin_vein_size").defineInRange("tin_ore_vein_size", 9, 4, 20);
        TIN_GEN_MIN = BUILDER.translation("config.caliber.tin_gen_min").define("tin_ore_min_height", -64);
        TIN_GEN_MAX = BUILDER.translation("config.caliber.tin_gen_max").define("tin_ore_max_height", 164);

        SILVER_VEINS_PER_CHUNK = BUILDER.comment("Silver Ore Settings").translation("config.caliber.silver_veins_per_chunk").define("silver_ore_veins_per_chunk", 7);
        SILVER_VEIN_SIZE = BUILDER.translation("config.caliber.silver_vein_size").defineInRange("silver_ore_vein_size", 9, 4, 20);
        SILVER_GEN_MIN = BUILDER.translation("config.caliber.silver_gen_min").define("silver_ore_min_height", -80);
        SILVER_GEN_MAX = BUILDER.translation("config.caliber.silver_gen_max").define("silver_ore_max_height", 64);

        // Stone
        GRANITE_UPPER_VEINS_PER_CHUNK = BUILDER.comment("Upper Granite Variant Settings").translation("config.caliber.granite_upper_veins_per_chunk").define("granite_upper_ore_veins_per_chunk", 6);
        GRANITE_UPPER_GEN_MIN = BUILDER.translation("config.caliber.granite_upper_gen_min").define("granite_upper_ore_min_height", 64);
        GRANITE_UPPER_GEN_MAX = BUILDER.translation("config.caliber.granite_upper_gen_max").define("granite_upper_ore_max_height", 128);

        GRANITE_LOWER_VEINS_PER_CHUNK = BUILDER.comment("Lower Granite Variant Settings").translation("config.caliber.granite_lower_veins_per_chunk").define("granite_lower_ore_veins_per_chunk", 2);
        GRANITE_LOWER_GEN_MIN = BUILDER.translation("config.caliber.granite_lower_gen_min").define("granite_lower_ore_min_height", 0);
        GRANITE_LOWER_GEN_MAX = BUILDER.translation("config.caliber.granite_lower_gen_max").define("granite_lower_ore_max_height", 60);

        LIMESTONE_VEINS_PER_CHUNK = BUILDER.comment("Limestone Variant Settings").translation("config.caliber.limestone_veins_per_chunk").define("limestone_ore_veins_per_chunk", 16);
        LIMESTONE_GEN_MIN = BUILDER.translation("config.caliber.limestone_gen_min").define("limestone_ore_min_height", 0);
        LIMESTONE_GEN_MAX = BUILDER.translation("config.caliber.limestone_gen_max").define("limestone_ore_max_height", 60);

        MARBLE_VEINS_PER_CHUNK = BUILDER.comment("Marble Variant Settings").translation("config.caliber.marble_veins_per_chunk").define("marble_ore_veins_per_chunk", 2);
        MARBLE_GEN_MIN = BUILDER.translation("config.caliber.marble_gen_min").define("marble_ore_min_height", 0);
        MARBLE_GEN_MAX = BUILDER.translation("config.caliber.marble_gen_max").define("marble_ore_max_height", 60);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
