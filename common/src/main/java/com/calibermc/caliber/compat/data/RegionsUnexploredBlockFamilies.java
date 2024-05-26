package com.calibermc.caliber.compat.data;

import com.calibermc.caliber.compat.block.RegionsUnexploredBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.google.common.collect.Maps;
import io.github.uhq_games.regions_unexplored.block.RuBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;
import java.util.stream.Stream;

public class RegionsUnexploredBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();


    /* Stone */
    public static final ModBlockFamily RU_ARGILLITE = familyBuilder(RuBlocks.ARGILLITE)
            .fromManager(RegionsUnexploredBlocks.RU_ARGILLITE)
            .slab(RuBlocks.ARGILLITE)
            .stairs(RuBlocks.ARGILLITE)
            .getFamily();

    public static final ModBlockFamily RU_CHALK_BLOCK = familyBuilder(RuBlocks.CHALK)
            .fromManager(RegionsUnexploredBlocks.RU_CHALK)
            .slab(RuBlocks.CHALK_SLAB)
            .stairs(RuBlocks.CHALK_STAIRS)
            .getFamily();

    public static final ModBlockFamily RU_CHALK_BRICKS = familyBuilder(RuBlocks.CHALK_BRICKS)
            .fromManager(RegionsUnexploredBlocks.RU_CHALK_BRICKS)
            .slab(RuBlocks.CHALK_BRICK_SLAB)
            .stairs(RuBlocks.CHALK_BRICK_STAIRS)
            .getFamily();

    public static final ModBlockFamily RU_CHALK_PILLAR = familyBuilder(RuBlocks.CHALK_PILLAR)
            .fromManager(RegionsUnexploredBlocks.RU_CHALK_PILLAR)
            .getFamily();

    public static final ModBlockFamily RU_MOSSY_STONE = familyBuilder(RuBlocks.MOSSY_STONE)
            .fromManager(RegionsUnexploredBlocks.RU_MOSSY_STONE)
            .getFamily();

    public static final ModBlockFamily RU_POLISHED_CHALK = familyBuilder(RuBlocks.POLISHED_CHALK)
            .fromManager(RegionsUnexploredBlocks.RU_POLISHED_CHALK)
            .slab(RuBlocks.POLISHED_CHALK_SLAB)
            .stairs(RuBlocks.POLISHED_CHALK_STAIRS)
            .getFamily();

    /* Planks */
    public static final ModBlockFamily RU_BAOBAB_PLANKS = familyBuilder(RuBlocks.BAOBAB_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_BAOBAB)
            .button(RuBlocks.BAOBAB_BUTTON)
            .door(RuBlocks.BAOBAB_DOOR)
            .fence(RuBlocks.BAOBAB_FENCE)
            .fenceGate(RuBlocks.BAOBAB_FENCE_GATE)
            .hangingSign(RuBlocks.BAOBAB_HANGING_SIGN, RuBlocks.BAOBAB_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.BAOBAB_PRESSURE_PLATE)
            .slab(RuBlocks.BAOBAB_SLAB)
            .sign(RuBlocks.BAOBAB_SIGN, RuBlocks.BAOBAB_WALL_SIGN)
            .stairs(RuBlocks.BAOBAB_STAIRS)
            .trapdoor(RuBlocks.BAOBAB_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_BAOBAB_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_BLACKWOOD_PLANKS = familyBuilder(RuBlocks.BLACKWOOD_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_BLACKWOOD)
            .button(RuBlocks.BLACKWOOD_BUTTON)
            .door(RuBlocks.BLACKWOOD_DOOR)
            .fence(RuBlocks.BLACKWOOD_FENCE)
            .fenceGate(RuBlocks.BLACKWOOD_FENCE_GATE)
            .hangingSign(RuBlocks.BLACKWOOD_HANGING_SIGN, RuBlocks.BLACKWOOD_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.BLACKWOOD_PRESSURE_PLATE)
            .slab(RuBlocks.BLACKWOOD_SLAB)
            .sign(RuBlocks.BLACKWOOD_SIGN, RuBlocks.BLACKWOOD_WALL_SIGN)
            .stairs(RuBlocks.BLACKWOOD_STAIRS)
            .trapdoor(RuBlocks.BLACKWOOD_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_BLACKWOOD_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_BLUE_BIOSHROOM_PLANKS = familyBuilder(RuBlocks.BLUE_BIOSHROOM)
            .fromManager(RegionsUnexploredBlocks.RU_BLUE_BIOSHROOM)
            .button(RuBlocks.BLUE_BIOSHROOM_BUTTON)
            .door(RuBlocks.BLUE_BIOSHROOM_DOOR)
            .fence(RuBlocks.BLUE_BIOSHROOM_FENCE)
            .fenceGate(RuBlocks.BLUE_BIOSHROOM_FENCE_GATE)
            .hangingSign(RuBlocks.BLUE_BIOSHROOM_HANGING_SIGN, RuBlocks.BLUE_BIOSHROOM_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.BLUE_BIOSHROOM_PRESSURE_PLATE)
            .slab(RuBlocks.BLUE_BIOSHROOM_SLAB)
            .sign(RuBlocks.BLUE_BIOSHROOM_SIGN, RuBlocks.BLUE_BIOSHROOM_WALL_SIGN)
            .stairs(RuBlocks.BLUE_BIOSHROOM_STAIRS)
            .trapdoor(RuBlocks.BLUE_BIOSHROOM_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_BLUE_BIOSHROOM_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_BRIMWOOD_PLANKS = familyBuilder(RuBlocks.BRIMWOOD_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_BRIMWOOD)
            .button(RuBlocks.BRIMWOOD_BUTTON)
            .door(RuBlocks.BRIMWOOD_DOOR)
            .fence(RuBlocks.BRIMWOOD_FENCE)
            .fenceGate(RuBlocks.BRIMWOOD_FENCE_GATE)
            .hangingSign(RuBlocks.BRIMWOOD_HANGING_SIGN, RuBlocks.BRIMWOOD_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.BRIMWOOD_PRESSURE_PLATE)
            .slab(RuBlocks.BRIMWOOD_SLAB)
            .sign(RuBlocks.BRIMWOOD_SIGN, RuBlocks.BRIMWOOD_WALL_SIGN)
            .stairs(RuBlocks.BRIMWOOD_STAIRS)
            .trapdoor(RuBlocks.BRIMWOOD_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_BRIMWOOD_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_COBALT_PLANKS = familyBuilder(RuBlocks.COBALT_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_COBALT)
            .button(RuBlocks.COBALT_BUTTON)
            .door(RuBlocks.COBALT_DOOR)
            .fence(RuBlocks.COBALT_FENCE)
            .fenceGate(RuBlocks.COBALT_FENCE_GATE)
            .hangingSign(RuBlocks.COBALT_HANGING_SIGN, RuBlocks.COBALT_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.COBALT_PRESSURE_PLATE)
            .slab(RuBlocks.COBALT_SLAB)
            .sign(RuBlocks.COBALT_SIGN, RuBlocks.COBALT_WALL_SIGN)
            .stairs(RuBlocks.COBALT_STAIRS)
            .trapdoor(RuBlocks.COBALT_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_COBALT_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_CYPRESS_PLANKS = familyBuilder(RuBlocks.CYPRESS_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_CYPRESS)
            .button(RuBlocks.CYPRESS_BUTTON)
            .door(RuBlocks.CYPRESS_DOOR)
            .fence(RuBlocks.CYPRESS_FENCE)
            .fenceGate(RuBlocks.CYPRESS_FENCE_GATE)
            .hangingSign(RuBlocks.CYPRESS_HANGING_SIGN, RuBlocks.CYPRESS_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.CYPRESS_PRESSURE_PLATE)
            .slab(RuBlocks.CYPRESS_SLAB)
            .sign(RuBlocks.CYPRESS_SIGN, RuBlocks.CYPRESS_WALL_SIGN)
            .stairs(RuBlocks.CYPRESS_STAIRS)
            .trapdoor(RuBlocks.CYPRESS_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_CYPRESS_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_DEAD_PLANKS = familyBuilder(RuBlocks.DEAD_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_DEAD)
            .button(RuBlocks.DEAD_BUTTON)
            .door(RuBlocks.DEAD_DOOR)
            .fence(RuBlocks.DEAD_FENCE)
            .fenceGate(RuBlocks.DEAD_FENCE_GATE)
            .hangingSign(RuBlocks.DEAD_HANGING_SIGN, RuBlocks.DEAD_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.DEAD_PRESSURE_PLATE)
            .slab(RuBlocks.DEAD_SLAB)
            .sign(RuBlocks.DEAD_SIGN, RuBlocks.DEAD_WALL_SIGN)
            .stairs(RuBlocks.DEAD_STAIRS)
            .trapdoor(RuBlocks.DEAD_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_DEAD_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_EUCALYPTUS_PLANKS = familyBuilder(RuBlocks.EUCALYPTUS_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_EUCALYPTUS)
            .button(RuBlocks.EUCALYPTUS_BUTTON)
            .door(RuBlocks.EUCALYPTUS_DOOR)
            .fence(RuBlocks.EUCALYPTUS_FENCE)
            .fenceGate(RuBlocks.EUCALYPTUS_FENCE_GATE)
            .hangingSign(RuBlocks.EUCALYPTUS_HANGING_SIGN, RuBlocks.EUCALYPTUS_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.EUCALYPTUS_PRESSURE_PLATE)
            .slab(RuBlocks.EUCALYPTUS_SLAB)
            .sign(RuBlocks.EUCALYPTUS_SIGN, RuBlocks.EUCALYPTUS_WALL_SIGN)
            .stairs(RuBlocks.EUCALYPTUS_STAIRS)
            .trapdoor(RuBlocks.EUCALYPTUS_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_EUCALYPTUS_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_GREEN_BIOSHROOM_PLANKS = familyBuilder(RuBlocks.GREEN_BIOSHROOM)
            .fromManager(RegionsUnexploredBlocks.RU_GREEN_BIOSHROOM)
            .button(RuBlocks.GREEN_BIOSHROOM_BUTTON)
            .door(RuBlocks.GREEN_BIOSHROOM_DOOR)
            .fence(RuBlocks.GREEN_BIOSHROOM_FENCE)
            .fenceGate(RuBlocks.GREEN_BIOSHROOM_FENCE_GATE)
            .hangingSign(RuBlocks.GREEN_BIOSHROOM_HANGING_SIGN, RuBlocks.GREEN_BIOSHROOM_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.GREEN_BIOSHROOM_PRESSURE_PLATE)
            .slab(RuBlocks.GREEN_BIOSHROOM_SLAB)
            .sign(RuBlocks.GREEN_BIOSHROOM_SIGN, RuBlocks.GREEN_BIOSHROOM_WALL_SIGN)
            .stairs(RuBlocks.GREEN_BIOSHROOM_STAIRS)
            .trapdoor(RuBlocks.GREEN_BIOSHROOM_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_GREEN_BIOSHROOM_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_JOSHUA_PLANKS = familyBuilder(RuBlocks.JOSHUA_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_JOSHUA)
            .button(RuBlocks.JOSHUA_BUTTON)
            .door(RuBlocks.JOSHUA_DOOR)
            .fence(RuBlocks.JOSHUA_FENCE)
            .fenceGate(RuBlocks.JOSHUA_FENCE_GATE)
            .hangingSign(RuBlocks.JOSHUA_HANGING_SIGN, RuBlocks.JOSHUA_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.JOSHUA_PRESSURE_PLATE)
            .slab(RuBlocks.JOSHUA_SLAB)
            .sign(RuBlocks.JOSHUA_SIGN, RuBlocks.JOSHUA_WALL_SIGN)
            .stairs(RuBlocks.JOSHUA_STAIRS)
            .trapdoor(RuBlocks.JOSHUA_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_JOSHUA_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_KAPOK_PLANKS = familyBuilder(RuBlocks.KAPOK_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_KAPOK)
            .button(RuBlocks.KAPOK_BUTTON)
            .door(RuBlocks.KAPOK_DOOR)
            .fence(RuBlocks.KAPOK_FENCE)
            .fenceGate(RuBlocks.KAPOK_FENCE_GATE)
            .hangingSign(RuBlocks.KAPOK_HANGING_SIGN, RuBlocks.KAPOK_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.KAPOK_PRESSURE_PLATE)
            .slab(RuBlocks.KAPOK_SLAB)
            .sign(RuBlocks.KAPOK_SIGN, RuBlocks.KAPOK_WALL_SIGN)
            .stairs(RuBlocks.KAPOK_STAIRS)
            .trapdoor(RuBlocks.KAPOK_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_KAPOK_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_LARCH_PLANKS = familyBuilder(RuBlocks.LARCH_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_LARCH)
            .button(RuBlocks.LARCH_BUTTON)
            .door(RuBlocks.LARCH_DOOR)
            .fence(RuBlocks.LARCH_FENCE)
            .fenceGate(RuBlocks.LARCH_FENCE_GATE)
            .hangingSign(RuBlocks.LARCH_HANGING_SIGN, RuBlocks.LARCH_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.LARCH_PRESSURE_PLATE)
            .slab(RuBlocks.LARCH_SLAB)
            .sign(RuBlocks.LARCH_SIGN, RuBlocks.LARCH_WALL_SIGN)
            .stairs(RuBlocks.LARCH_STAIRS)
            .trapdoor(RuBlocks.LARCH_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_LARCH_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_MAGNOLIA_PLANKS = familyBuilder(RuBlocks.MAGNOLIA_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_MAGNOLIA)
            .button(RuBlocks.MAGNOLIA_BUTTON)
            .door(RuBlocks.MAGNOLIA_DOOR)
            .fence(RuBlocks.MAGNOLIA_FENCE)
            .fenceGate(RuBlocks.MAGNOLIA_FENCE_GATE)
            .hangingSign(RuBlocks.MAGNOLIA_HANGING_SIGN, RuBlocks.MAGNOLIA_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.MAGNOLIA_PRESSURE_PLATE)
            .slab(RuBlocks.MAGNOLIA_SLAB)
            .sign(RuBlocks.MAGNOLIA_SIGN, RuBlocks.MAGNOLIA_WALL_SIGN)
            .stairs(RuBlocks.MAGNOLIA_STAIRS)
            .trapdoor(RuBlocks.MAGNOLIA_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_MAGNOLIA_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_MAPLE_PLANKS = familyBuilder(RuBlocks.MAPLE_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_MAPLE)
            .button(RuBlocks.MAPLE_BUTTON)
            .door(RuBlocks.MAPLE_DOOR)
            .fence(RuBlocks.MAPLE_FENCE)
            .fenceGate(RuBlocks.MAPLE_FENCE_GATE)
            .hangingSign(RuBlocks.MAPLE_HANGING_SIGN, RuBlocks.MAPLE_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.MAPLE_PRESSURE_PLATE)
            .slab(RuBlocks.MAPLE_SLAB)
            .sign(RuBlocks.MAPLE_SIGN, RuBlocks.MAPLE_WALL_SIGN)
            .stairs(RuBlocks.MAPLE_STAIRS)
            .trapdoor(RuBlocks.MAPLE_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_MAPLE_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_MAUVE_PLANKS = familyBuilder(RuBlocks.MAUVE_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_MAUVE)
            .button(RuBlocks.MAUVE_BUTTON)
            .door(RuBlocks.MAUVE_DOOR)
            .fence(RuBlocks.MAUVE_FENCE)
            .fenceGate(RuBlocks.MAUVE_FENCE_GATE)
            .hangingSign(RuBlocks.MAUVE_HANGING_SIGN, RuBlocks.MAUVE_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.MAUVE_PRESSURE_PLATE)
            .slab(RuBlocks.MAUVE_SLAB)
            .sign(RuBlocks.MAUVE_SIGN, RuBlocks.MAUVE_WALL_SIGN)
            .stairs(RuBlocks.MAUVE_STAIRS)
            .trapdoor(RuBlocks.MAUVE_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_MAUVE_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_PALM_PLANKS = familyBuilder(RuBlocks.PALM_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_PALM)
            .button(RuBlocks.PALM_BUTTON)
            .door(RuBlocks.PALM_DOOR)
            .fence(RuBlocks.PALM_FENCE)
            .fenceGate(RuBlocks.PALM_FENCE_GATE)
            .hangingSign(RuBlocks.PALM_HANGING_SIGN, RuBlocks.PALM_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.PALM_PRESSURE_PLATE)
            .slab(RuBlocks.PALM_SLAB)
            .sign(RuBlocks.PALM_SIGN, RuBlocks.PALM_WALL_SIGN)
            .stairs(RuBlocks.PALM_STAIRS)
            .trapdoor(RuBlocks.PALM_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_PALM_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_PINE_PLANKS = familyBuilder(RuBlocks.PINE_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_PINE)
            .button(RuBlocks.PINE_BUTTON)
            .door(RuBlocks.PINE_DOOR)
            .fence(RuBlocks.PINE_FENCE)
            .fenceGate(RuBlocks.PINE_FENCE_GATE)
            .hangingSign(RuBlocks.PINE_HANGING_SIGN, RuBlocks.PINE_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.PINE_PRESSURE_PLATE)
            .slab(RuBlocks.PINE_SLAB)
            .sign(RuBlocks.PINE_SIGN, RuBlocks.PINE_WALL_SIGN)
            .stairs(RuBlocks.PINE_STAIRS)
            .trapdoor(RuBlocks.PINE_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_PINE_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_PINK_BIOSHROOM_PLANKS = familyBuilder(RuBlocks.PINK_BIOSHROOM)
            .fromManager(RegionsUnexploredBlocks.RU_PINK_BIOSHROOM)
            .button(RuBlocks.PINK_BIOSHROOM_BUTTON)
            .door(RuBlocks.PINK_BIOSHROOM_DOOR)
            .fence(RuBlocks.PINK_BIOSHROOM_FENCE)
            .fenceGate(RuBlocks.PINK_BIOSHROOM_FENCE_GATE)
            .hangingSign(RuBlocks.PINK_BIOSHROOM_HANGING_SIGN, RuBlocks.PINK_BIOSHROOM_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.PINK_BIOSHROOM_PRESSURE_PLATE)
            .slab(RuBlocks.PINK_BIOSHROOM_SLAB)
            .sign(RuBlocks.PINK_BIOSHROOM_SIGN, RuBlocks.PINK_BIOSHROOM_WALL_SIGN)
            .stairs(RuBlocks.PINK_BIOSHROOM_STAIRS)
            .trapdoor(RuBlocks.PINK_BIOSHROOM_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_PINK_BIOSHROOM_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_REDWOOD_PLANKS = familyBuilder(RuBlocks.REDWOOD_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_REDWOOD)
            .button(RuBlocks.REDWOOD_BUTTON)
            .door(RuBlocks.REDWOOD_DOOR)
            .fence(RuBlocks.REDWOOD_FENCE)
            .fenceGate(RuBlocks.REDWOOD_FENCE_GATE)
            .hangingSign(RuBlocks.REDWOOD_HANGING_SIGN, RuBlocks.REDWOOD_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.REDWOOD_PRESSURE_PLATE)
            .slab(RuBlocks.REDWOOD_SLAB)
            .sign(RuBlocks.REDWOOD_SIGN, RuBlocks.REDWOOD_WALL_SIGN)
            .stairs(RuBlocks.REDWOOD_STAIRS)
            .trapdoor(RuBlocks.REDWOOD_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_REDWOOD_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_SOCOTRA_PLANKS = familyBuilder(RuBlocks.SOCOTRA_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_SOCOTRA)
            .button(RuBlocks.SOCOTRA_BUTTON)
            .door(RuBlocks.SOCOTRA_DOOR)
            .fence(RuBlocks.SOCOTRA_FENCE)
            .fenceGate(RuBlocks.SOCOTRA_FENCE_GATE)
            .hangingSign(RuBlocks.SOCOTRA_HANGING_SIGN, RuBlocks.SOCOTRA_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.SOCOTRA_PRESSURE_PLATE)
            .slab(RuBlocks.SOCOTRA_SLAB)
            .sign(RuBlocks.SOCOTRA_SIGN, RuBlocks.SOCOTRA_WALL_SIGN)
            .stairs(RuBlocks.SOCOTRA_STAIRS)
            .trapdoor(RuBlocks.SOCOTRA_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_SOCOTRA_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_WILLOW_PLANKS = familyBuilder(RuBlocks.WILLOW_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_WILLOW)
            .button(RuBlocks.WILLOW_BUTTON)
            .door(RuBlocks.WILLOW_DOOR)
            .fence(RuBlocks.WILLOW_FENCE)
            .fenceGate(RuBlocks.WILLOW_FENCE_GATE)
            .hangingSign(RuBlocks.WILLOW_HANGING_SIGN, RuBlocks.WILLOW_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.WILLOW_PRESSURE_PLATE)
            .slab(RuBlocks.WILLOW_SLAB)
            .sign(RuBlocks.WILLOW_SIGN, RuBlocks.WILLOW_WALL_SIGN)
            .stairs(RuBlocks.WILLOW_STAIRS)
            .trapdoor(RuBlocks.WILLOW_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_WILLOW_SHINGLES)
            .getFamily();

    public static final ModBlockFamily YRU_YELLOW_BIOSHROOM_PLANKS = familyBuilder(RuBlocks.YELLOW_BIOSHROOM)
            .fromManager(RegionsUnexploredBlocks.RU_YELLOW_BIOSHROOM)
            .button(RuBlocks.YELLOW_BIOSHROOM_BUTTON)
            .door(RuBlocks.YELLOW_BIOSHROOM_DOOR)
            .fence(RuBlocks.YELLOW_BIOSHROOM_FENCE)
            .fenceGate(RuBlocks.YELLOW_BIOSHROOM_FENCE_GATE)
            .hangingSign(RuBlocks.YELLOW_BIOSHROOM_HANGING_SIGN, RuBlocks.YELLOW_BIOSHROOM_WALL_HANGING_SIGN)
            .pressurePlate(RuBlocks.YELLOW_BIOSHROOM_PRESSURE_PLATE)
            .slab(RuBlocks.YELLOW_BIOSHROOM_SLAB)
            .sign(RuBlocks.YELLOW_BIOSHROOM_SIGN, RuBlocks.YELLOW_BIOSHROOM_WALL_SIGN)
            .stairs(RuBlocks.YELLOW_BIOSHROOM_STAIRS)
            .trapdoor(RuBlocks.YELLOW_BIOSHROOM_TRAPDOOR)
            .fromManager(RegionsUnexploredBlocks.RU_YELLOW_BIOSHROOM_SHINGLES)
            .getFamily();

    /* Stripped Wood */
    public static final ModBlockFamily RU_STRIPPED_BAOBAB = familyBuilder(RuBlocks.STRIPPED_BAOBAB_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_BAOBAB)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_BLACKWOOD = familyBuilder(RuBlocks.STRIPPED_BLACKWOOD_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_BLACKWOOD)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_BLUE_BIOSHROOM = familyBuilder(RuBlocks.STRIPPED_BLUE_BIOSHROOM_HYPHAE)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_BLUE_BIOSHROOM)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_BRIMWOOD = familyBuilder(RuBlocks.STRIPPED_BRIMWOOD_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_BRIMWOOD)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_COBALT = familyBuilder(RuBlocks.STRIPPED_COBALT_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_COBALT)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_CYPRESS = familyBuilder(RuBlocks.STRIPPED_CYPRESS_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_CYPRESS)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_DEAD = familyBuilder(RuBlocks.STRIPPED_DEAD_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_DEAD)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_EUCALYPTUS = familyBuilder(RuBlocks.STRIPPED_EUCALYPTUS_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_EUCALYPTUS)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_GREEN_BIOSHROOM = familyBuilder(RuBlocks.STRIPPED_GREEN_BIOSHROOM_HYPHAE)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_GREEN_BIOSHROOM)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_JOSHUA = familyBuilder(RuBlocks.STRIPPED_JOSHUA_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_JOSHUA)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_KAPOK = familyBuilder(RuBlocks.STRIPPED_KAPOK_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_KAPOK)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_LARCH = familyBuilder(RuBlocks.STRIPPED_LARCH_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_LARCH)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_MAGNOLIA = familyBuilder(RuBlocks.STRIPPED_MAGNOLIA_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_MAGNOLIA)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_MAPLE = familyBuilder(RuBlocks.STRIPPED_MAPLE_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_MAPLE)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_MAUVE = familyBuilder(RuBlocks.STRIPPED_MAUVE_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_MAUVE)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_PALM = familyBuilder(RuBlocks.STRIPPED_PALM_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_PALM)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_PINE = familyBuilder(RuBlocks.STRIPPED_PINE_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_PINE)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_PINK_BIOSHROOM = familyBuilder(RuBlocks.STRIPPED_PINK_BIOSHROOM_HYPHAE)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_PINK_BIOSHROOM)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_REDWOOD = familyBuilder(RuBlocks.STRIPPED_REDWOOD_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_REDWOOD)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_SOCOTRA = familyBuilder(RuBlocks.STRIPPED_SOCOTRA_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_SOCOTRA)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_WILLOW = familyBuilder(RuBlocks.STRIPPED_WILLOW_WOOD)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_WILLOW)
            .getFamily();

    public static final ModBlockFamily RU_STRIPPED_YELLOW_BIOSHROOM = familyBuilder(RuBlocks.STRIPPED_YELLOW_BIOSHROOM_HYPHAE)
            .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_YELLOW_BIOSHROOM)
            .getFamily();

    /* Painted Planks */
    public static final ModBlockFamily RU_BLACK_PAINTED_PLANKS = familyBuilder(RuBlocks.BLACK_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_BLACK_PAINTED)
            .slab(RuBlocks.BLACK_PAINTED_SLAB)
            .stairs(RuBlocks.BLACK_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_BLACK_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_BLUE_PAINTED_PLANKS = familyBuilder(RuBlocks.BLUE_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_BLUE_PAINTED)
            .slab(RuBlocks.BLUE_PAINTED_SLAB)
            .stairs(RuBlocks.BLUE_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_BLUE_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_BROWN_PAINTED_PLANKS = familyBuilder(RuBlocks.BROWN_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_BROWN_PAINTED)
            .slab(RuBlocks.BROWN_PAINTED_SLAB)
            .stairs(RuBlocks.BROWN_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_BROWN_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_CYAN_PAINTED_PLANKS = familyBuilder(RuBlocks.CYAN_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_CYAN_PAINTED)
            .slab(RuBlocks.CYAN_PAINTED_SLAB)
            .stairs(RuBlocks.CYAN_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_CYAN_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_GRAY_PAINTED_PLANKS = familyBuilder(RuBlocks.GRAY_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_GRAY_PAINTED)
            .slab(RuBlocks.GRAY_PAINTED_SLAB)
            .stairs(RuBlocks.GRAY_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_GRAY_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_GREEN_PAINTED_PLANKS = familyBuilder(RuBlocks.GREEN_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_GREEN_PAINTED)
            .slab(RuBlocks.GREEN_PAINTED_SLAB)
            .stairs(RuBlocks.GREEN_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_GREEN_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_LIGHT_BLUE_PAINTED_PLANKS = familyBuilder(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_LIGHT_BLUE_PAINTED)
            .slab(RuBlocks.LIGHT_BLUE_PAINTED_SLAB)
            .stairs(RuBlocks.LIGHT_BLUE_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_LIGHT_BLUE_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_LIGHT_GRAY_PAINTED_PLANKS = familyBuilder(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_LIGHT_GRAY_PAINTED)
            .slab(RuBlocks.LIGHT_GRAY_PAINTED_SLAB)
            .stairs(RuBlocks.LIGHT_GRAY_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_LIGHT_GRAY_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_LIME_PAINTED_PLANKS = familyBuilder(RuBlocks.LIME_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_LIME_PAINTED)
            .slab(RuBlocks.LIME_PAINTED_SLAB)
            .stairs(RuBlocks.LIME_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_LIME_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_MAGENTA_PAINTED_PLANKS = familyBuilder(RuBlocks.MAGENTA_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_MAGENTA_PAINTED)
            .slab(RuBlocks.MAGENTA_PAINTED_SLAB)
            .stairs(RuBlocks.MAGENTA_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_MAGENTA_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_ORANGE_PAINTED_PLANKS = familyBuilder(RuBlocks.ORANGE_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_ORANGE_PAINTED)
            .slab(RuBlocks.ORANGE_PAINTED_SLAB)
            .stairs(RuBlocks.ORANGE_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_ORANGE_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_PINK_PAINTED_PLANKS = familyBuilder(RuBlocks.PINK_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_PINK_PAINTED)
            .slab(RuBlocks.PINK_PAINTED_SLAB)
            .stairs(RuBlocks.PINK_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_PINK_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_PURPLE_PAINTED_PLANKS = familyBuilder(RuBlocks.PURPLE_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_PURPLE_PAINTED)
            .slab(RuBlocks.PURPLE_PAINTED_SLAB)
            .stairs(RuBlocks.PURPLE_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_PURPLE_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_RED_PAINTED_PLANKS = familyBuilder(RuBlocks.RED_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_RED_PAINTED)
            .slab(RuBlocks.RED_PAINTED_SLAB)
            .stairs(RuBlocks.RED_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_RED_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_WHITE_PAINTED_PLANKS = familyBuilder(RuBlocks.WHITE_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_WHITE_PAINTED)
            .slab(RuBlocks.WHITE_PAINTED_SLAB)
            .stairs(RuBlocks.WHITE_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_WHITE_PAINTED_SHINGLES)
            .getFamily();

    public static final ModBlockFamily RU_YELLOW_PAINTED_PLANKS = familyBuilder(RuBlocks.YELLOW_PAINTED_PLANKS)
            .fromManager(RegionsUnexploredBlocks.RU_YELLOW_PAINTED)
            .slab(RuBlocks.YELLOW_PAINTED_SLAB)
            .stairs(RuBlocks.YELLOW_PAINTED_STAIRS)
            .fromManager(RegionsUnexploredBlocks.RU_YELLOW_PAINTED_SHINGLES)
            .getFamily();

//    private static RegionsUnexploredBlockFamilies instance = null;
//
//    private RegionsUnexploredBlockFamilies() { }
//
//    public static RegionsUnexploredBlockFamilies getInstance() {
//        if (instance == null) {
//            instance = new RegionsUnexploredBlockFamilies();
//        }
//        return instance;
//    }
//}

    public static ModBlockFamily.Builder familyBuilder(Block pBaseBlock) {
        ModBlockFamily.Builder modBlockFamily$builder = new ModBlockFamily.Builder(pBaseBlock);
        ModBlockFamily modBlockFamily = MAP.put(pBaseBlock, modBlockFamily$builder.getFamily());
        if (modBlockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + BuiltInRegistries.BLOCK.getKey(pBaseBlock));
        } else {
            return modBlockFamily$builder;
        }
    }

    public static Stream<ModBlockFamily> getAllFamilies() {
        return MAP.values().stream();
    }

    public static Map getAllFamiliesAsMap() {
        return MAP;
    }
}
