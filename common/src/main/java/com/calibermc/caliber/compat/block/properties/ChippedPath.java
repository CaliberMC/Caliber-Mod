package com.calibermc.caliber.compat.block.properties;

import java.util.*;
import java.util.stream.Collectors;

public enum ChippedPath {
    ACACIA_LOG("acacia_log"),
    ACACIA_PLANKS("acacia_planks"),
    AMETHYST_BLOCK("amethyst_block"),
    ANCIENT_DEBRIS("ancient_debris"),
    ANDESITE("andesite"),
    BAMBOO_PLANKS("bamboo_planks"),
    BASALT("basalt"),
    BIRCH_LOG("birch_log"),
    BIRCH_PLANKS("birch_planks"),
    BLACK_CONCRETE("black_concrete"),
    BLACK_GLAZED_TERRACOTTA("black_glazed_terracotta"),
    BLACK_TERRACOTTA("black_terracotta"),
    BLACK_WOOL("black_wool"),
    BLACKSTONE("blackstone"),
    BLUE_CONCRETE("blue_concrete"),
    BLUE_GLAZED_TERRACOTTA("blue_glazed_terracotta"),
    BLUE_ICE("blue_ice"),
    BLUE_TERRACOTTA("blue_terracotta"),
    BLUE_WOOL("blue_wool"),
    BONE_BLOCK("bone_block"),
    BOOKSHELF("bookshelf"),
    BORDERLESS_BRICKS("borderless_bricks"),
    BRICKS("bricks"),
    BROWN_CONCRETE("brown_concrete"),
    BROWN_GLAZED_TERRACOTTA("brown_glazed_terracotta"),
    BROWN_MUSHROOM_BLOCK("brown_mushroom_block"),
    BROWN_TERRACOTTA("brown_terracotta"),
    BROWN_WOOL("brown_wool"),
    CALCITE("calcite"),
    CHERRY_LOG("cherry_log"),
    CHERRY_PLANKS("cherry_planks"),
    CLAY("clay"),
    COAL_BLOCK("coal_block"),
    COBBLESTONE("cobblestone"),
    CRIMSON_PLANKS("crimson_planks"),
    CRIMSON_STEM("crimson_stem"),
    CRYING_OBSIDIAN("crying_obsidian"),
    CYAN_CONCRETE("cyan_concrete"),
    CYAN_GLAZED_TERRACOTTA("cyan_glazed_terracotta"),
    CYAN_TERRACOTTA("cyan_terracotta"),
    CYAN_WOOL("cyan_wool"),
    DARK_OAK_LOG("dark_oak_log"),
    DARK_OAK_PLANKS("dark_oak_planks"),
    DARK_PRISMARINE("dark_prismarine"),
    DEEPSLATE("deepslate"),
    DIAMOND_BLOCK("diamond_block"),
    DIORITE("diorite"),
    DIRT("dirt"),
    DRIPSTONE_BLOCK("dripstone_block"),
    EMERALD_BLOCK("emerald_block"),
    END_STONE("end_stone"),
    GILDED_BLACKSTONE("gilded_blackstone"),
    GOLD_BLOCK("gold_block"),
    GRANITE("granite"),
    GRAY_CONCRETE("gray_concrete"),
    GRAY_GLAZED_TERRACOTTA("gray_glazed_terracotta"),
    GRAY_TERRACOTTA("gray_terracotta"),
    GRAY_WOOL("gray_wool"),
    GREEN_CONCRETE("green_concrete"),
    GREEN_GLAZED_TERRACOTTA("green_glazed_terracotta"),
    GREEN_TERRACOTTA("green_terracotta"),
    GREEN_WOOL("green_wool"),
    ICE("ice"),
    IRON_BLOCK("iron_block"),
    JUNGLE_LOG("jungle_log"),
    JUNGLE_PLANKS("jungle_planks"),
    LAPIS_BLOCK("lapis_block"),
    LIGHT_BLUE_CONCRETE("light_blue_concrete"),
    LIGHT_BLUE_GLAZED_TERRACOTTA("light_blue_glazed_terracotta"),
    LIGHT_BLUE_TERRACOTTA("light_blue_terracotta"),
    LIGHT_BLUE_WOOL("light_blue_wool"),
    LIGHT_GRAY_CONCRETE("light_gray_concrete"),
    LIGHT_GRAY_GLAZED_TERRACOTTA("light_gray_glazed_terracotta"),
    LIGHT_GRAY_TERRACOTTA("light_gray_terracotta"),
    LIGHT_GRAY_WOOL("light_gray_wool"),
    LIME_CONCRETE("lime_concrete"),
    LIME_GLAZED_TERRACOTTA("lime_glazed_terracotta"),
    LIME_TERRACOTTA("lime_terracotta"),
    LIME_WOOL("lime_wool"),
    LODESTONE("lodestone"),
    MAGENTA_CONCRETE("magenta_concrete"),
    MAGENTA_GLAZED_TERRACOTTA("magenta_glazed_terracotta"),
    MAGENTA_TERRACOTTA("magenta_terracotta"),
    MAGENTA_WOOL("magenta_wool"),
    MAGMA_BLOCK("magma_block"),
    MANGROVE_LOG("mangrove_log"),
    MANGROVE_PLANKS("mangrove_planks"),
    MOSSY_COBBLESTONE("mossy_cobblestone"),
    MOSSY_STONE_BRICKS("mossy_stone_bricks"),
    MUD("mud"),
    MUD_BRICKS("mud_bricks"),
    MUSHROOM_STEM("mushroom_stem"),
    NETHER_BRICKS("nether_bricks"),
    NETHERITE_BLOCK("netherite_block"),
    NETHERRACK("netherrack"),
    OAK_LOG("oak_log"),
    OAK_PLANKS("oak_planks"),
    OBSIDIAN("obsidian"),
    ORANGE_CONCRETE("orange_concrete"),
    ORANGE_GLAZED_TERRACOTTA("orange_glazed_terracotta"),
    ORANGE_TERRACOTTA("orange_terracotta"),
    ORANGE_WOOL("orange_wool"),
    PACKED_ICE("packed_ice"),
    PACKED_MUD("packed_mud"),
    PINK_CONCRETE("pink_concrete"),
    PINK_GLAZED_TERRACOTTA("pink_glazed_terracotta"),
    PINK_TERRACOTTA("pink_terracotta"),
    PINK_WOOL("pink_wool"),
    PRISMARINE("prismarine"),
    PURPLE_CONCRETE("purple_concrete"),
    PURPLE_GLAZED_TERRACOTTA("purple_glazed_terracotta"),
    PURPLE_TERRACOTTA("purple_terracotta"),
    PURPLE_WOOL("purple_wool"),
    PURPUR_BLOCK("purpur_block"),
    QUARTZ_BLOCK("quartz_block"),
    RED_CONCRETE("red_concrete"),
    RED_GLAZED_TERRACOTTA("red_glazed_terracotta"),
    RED_MUSHROOM_BLOCK("red_mushroom_block"),
    RED_NETHER_BRICKS("red_nether_bricks"),
    RED_SANDSTONE("red_sandstone"),
    RED_TERRACOTTA("red_terracotta"),
    RED_WOOL("red_wool"),
    REDSTONE_BLOCK("redstone_block"),
    SANDSTONE("sandstone"),
    SMOOTH_STONE("smooth_stone"),
    SNOW_BLOCK("snow_block"),
    SPRUCE_LOG("spruce_log"),
    SPRUCE_PLANKS("spruce_planks"),
    STONE("stone"),
    STRIPPED_ACACIA_LOG("stripped_acacia_log"),
    STRIPPED_BIRCH_LOG("stripped_birch_log"),
    STRIPPED_CHERRY_LOG("stripped_cherry_log"),
    STRIPPED_CRIMSON_STEM("stripped_crimson_stem"),
    STRIPPED_DARK_OAK_LOG("stripped_dark_oak_log"),
    STRIPPED_JUNGLE_LOG("stripped_jungle_log"),
    STRIPPED_MANGROVE_LOG("stripped_mangrove_log"),
    STRIPPED_OAK_LOG("stripped_oak_log"),
    STRIPPED_SPRUCE_LOG("stripped_spruce_log"),
    STRIPPED_WARPED_STEM("stripped_warped_stem"),
    TERRACOTTA("terracotta"),
    TUFF("tuff"),
    WARPED_PLANKS("warped_planks"),
    WARPED_STEM("warped_stem"),
    WAXED_COPPER_BLOCK("waxed_copper_block"),
    WAXED_EXPOSED_COPPER("waxed_exposed_copper"),
    WAXED_OXIDIZED_COPPER("waxed_oxidized_copper"),
    WAXED_WEATHERED_COPPER("waxed_weathered_copper"),
    WHITE_CONCRETE("white_concrete"),
    WHITE_GLAZED_TERRACOTTA("white_glazed_terracotta"),
    WHITE_TERRACOTTA("white_terracotta"),
    WHITE_WOOL("white_wool"),
    YELLOW_CONCRETE("yellow_concrete"),
    YELLOW_GLAZED_TERRACOTTA("yellow_glazed_terracotta"),
    YELLOW_TERRACOTTA("yellow_terracotta"),
    YELLOW_WOOL("yellow_wool");

    private final String name;

    ChippedPath(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static final Set<String> lowerPriorityMaterials = Set.of("bricks", "obsidian", "sandstone", "stone", "terracotta");

    public static String extractChippedPath(String texPath, String defaultValue) {
        List<String> matches = Arrays.stream(ChippedPath.values())
                .map(ChippedPath::getName)
                .filter(texPath::contains)
                .sorted(Comparator.comparingInt((String s) -> s.split("_").length).thenComparingInt(String::length).reversed())
                .collect(Collectors.toList());

        if (matches.isEmpty()) {
            return defaultValue; // Return default if no matches
        }

        // Filter matches to consider specificity and avoid early broad matches
        Optional<String> bestMatch = matches.stream()
                .filter(match -> isSpecificMatch(match))
                .findFirst();

        if (bestMatch.isPresent()) {
            return bestMatch.get();
        }

        // If no specific match is found, handle lower priority materials
        return matches.stream()
                .filter(match -> lowerPriorityMaterials.contains(match))
                .findFirst()
                .orElse(defaultValue);  // Fallback to the most specific match or default
    }

    private static boolean isSpecificMatch(String match) {
        // Prioritize matches based on specifics like colored or glazed variants
        return match.endsWith("_glazed_terracotta") || match.endsWith("_wool") ||
                match.endsWith("_concrete") || (match.contains("_") && !lowerPriorityMaterials.contains(match));
    }
}
