package com.calibermc.caliber.compat.data.forge;

import com.calibermc.caliber.compat.block.RegionsUnexploredBlocks;
import net.regions_unexplored.block.RuBlocks;

import static com.calibermc.caliber.compat.data.RegionsUnexploredBlockFamilies.*;

public class RegionsUnexploredBlockFamiliesImpl {

    public static void init() {
        /* Stone */
        RU_ARGILLITE = familyBuilder(RuBlocks.ARGILLITE.get())
                .fromManager(RegionsUnexploredBlocks.RU_ARGILLITE)
                .slab(RuBlocks.ARGILLITE.get())
                .stairs(RuBlocks.ARGILLITE.get())
                .getFamily();

        RU_CHALK_BLOCK = familyBuilder(RuBlocks.CHALK.get())
                .fromManager(RegionsUnexploredBlocks.RU_CHALK)
                .slab(RuBlocks.CHALK_SLAB.get())
                .stairs(RuBlocks.CHALK_STAIRS.get())
                .getFamily();

        RU_CHALK_BRICKS = familyBuilder(RuBlocks.CHALK_BRICKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_CHALK_BRICKS)
                .slab(RuBlocks.CHALK_BRICK_SLAB.get())
                .stairs(RuBlocks.CHALK_BRICK_STAIRS.get())
                .getFamily();

        RU_CHALK_PILLAR = familyBuilder(RuBlocks.CHALK_PILLAR.get())
                .fromManager(RegionsUnexploredBlocks.RU_CHALK_PILLAR)
                .getFamily();

        RU_MOSSY_STONE = familyBuilder(RuBlocks.MOSSY_STONE.get())
                .fromManager(RegionsUnexploredBlocks.RU_MOSSY_STONE)
                .getFamily();

        RU_POLISHED_CHALK = familyBuilder(RuBlocks.POLISHED_CHALK.get())
                .fromManager(RegionsUnexploredBlocks.RU_POLISHED_CHALK)
                .slab(RuBlocks.POLISHED_CHALK_SLAB.get())
                .stairs(RuBlocks.POLISHED_CHALK_STAIRS.get())
                .getFamily();

        /* Planks */
        RU_BAOBAB_PLANKS = familyBuilder(RuBlocks.BAOBAB_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BAOBAB)
                .button(RuBlocks.BAOBAB_BUTTON.get())
                .door(RuBlocks.BAOBAB_DOOR.get())
                .fence(RuBlocks.BAOBAB_FENCE.get())
                .fenceGate(RuBlocks.BAOBAB_FENCE_GATE.get())
                .hangingSign(RuBlocks.BAOBAB_HANGING_SIGN.get(), RuBlocks.BAOBAB_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.BAOBAB_PRESSURE_PLATE.get())
                .slab(RuBlocks.BAOBAB_SLAB.get())
                .sign(RuBlocks.BAOBAB_SIGN.get(), RuBlocks.BAOBAB_WALL_SIGN.get())
                .stairs(RuBlocks.BAOBAB_STAIRS.get())
                .trapdoor(RuBlocks.BAOBAB_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_BAOBAB_SHINGLES)
                .getFamily();

        RU_BLACKWOOD_PLANKS = familyBuilder(RuBlocks.BLACKWOOD_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BLACKWOOD)
                .button(RuBlocks.BLACKWOOD_BUTTON.get())
                .door(RuBlocks.BLACKWOOD_DOOR.get())
                .fence(RuBlocks.BLACKWOOD_FENCE.get())
                .fenceGate(RuBlocks.BLACKWOOD_FENCE_GATE.get())
                .hangingSign(RuBlocks.BLACKWOOD_HANGING_SIGN.get(), RuBlocks.BLACKWOOD_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.BLACKWOOD_PRESSURE_PLATE.get())
                .slab(RuBlocks.BLACKWOOD_SLAB.get())
                .sign(RuBlocks.BLACKWOOD_SIGN.get(), RuBlocks.BLACKWOOD_WALL_SIGN.get())
                .stairs(RuBlocks.BLACKWOOD_STAIRS.get())
                .trapdoor(RuBlocks.BLACKWOOD_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_BLACKWOOD_SHINGLES)
                .getFamily();

        RU_BLUE_BIOSHROOM_PLANKS = familyBuilder(RuBlocks.BLUE_BIOSHROOM.get())
                .fromManager(RegionsUnexploredBlocks.RU_BLUE_BIOSHROOM)
                .button(RuBlocks.BLUE_BIOSHROOM_BUTTON.get())
                .door(RuBlocks.BLUE_BIOSHROOM_DOOR.get())
                .fence(RuBlocks.BLUE_BIOSHROOM_FENCE.get())
                .fenceGate(RuBlocks.BLUE_BIOSHROOM_FENCE_GATE.get())
                .hangingSign(RuBlocks.BLUE_BIOSHROOM_HANGING_SIGN.get(), RuBlocks.BLUE_BIOSHROOM_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.BLUE_BIOSHROOM_PRESSURE_PLATE.get())
                .slab(RuBlocks.BLUE_BIOSHROOM_SLAB.get())
                .sign(RuBlocks.BLUE_BIOSHROOM_SIGN.get(), RuBlocks.BLUE_BIOSHROOM_WALL_SIGN.get())
                .stairs(RuBlocks.BLUE_BIOSHROOM_STAIRS.get())
                .trapdoor(RuBlocks.BLUE_BIOSHROOM_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_BLUE_BIOSHROOM_SHINGLES)
                .getFamily();

        RU_BRIMWOOD_PLANKS = familyBuilder(RuBlocks.BRIMWOOD_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BRIMWOOD)
                .button(RuBlocks.BRIMWOOD_BUTTON.get())
                .door(RuBlocks.BRIMWOOD_DOOR.get())
                .fence(RuBlocks.BRIMWOOD_FENCE.get())
                .fenceGate(RuBlocks.BRIMWOOD_FENCE_GATE.get())
                .hangingSign(RuBlocks.BRIMWOOD_HANGING_SIGN.get(), RuBlocks.BRIMWOOD_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.BRIMWOOD_PRESSURE_PLATE.get())
                .slab(RuBlocks.BRIMWOOD_SLAB.get())
                .sign(RuBlocks.BRIMWOOD_SIGN.get(), RuBlocks.BRIMWOOD_WALL_SIGN.get())
                .stairs(RuBlocks.BRIMWOOD_STAIRS.get())
                .trapdoor(RuBlocks.BRIMWOOD_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_BRIMWOOD_SHINGLES)
                .getFamily();

        RU_COBALT_PLANKS = familyBuilder(RuBlocks.COBALT_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_COBALT)
                .button(RuBlocks.COBALT_BUTTON.get())
                .door(RuBlocks.COBALT_DOOR.get())
                .fence(RuBlocks.COBALT_FENCE.get())
                .fenceGate(RuBlocks.COBALT_FENCE_GATE.get())
                .hangingSign(RuBlocks.COBALT_HANGING_SIGN.get(), RuBlocks.COBALT_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.COBALT_PRESSURE_PLATE.get())
                .slab(RuBlocks.COBALT_SLAB.get())
                .sign(RuBlocks.COBALT_SIGN.get(), RuBlocks.COBALT_WALL_SIGN.get())
                .stairs(RuBlocks.COBALT_STAIRS.get())
                .trapdoor(RuBlocks.COBALT_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_COBALT_SHINGLES)
                .getFamily();

        RU_CYPRESS_PLANKS = familyBuilder(RuBlocks.CYPRESS_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_CYPRESS)
                .button(RuBlocks.CYPRESS_BUTTON.get())
                .door(RuBlocks.CYPRESS_DOOR.get())
                .fence(RuBlocks.CYPRESS_FENCE.get())
                .fenceGate(RuBlocks.CYPRESS_FENCE_GATE.get())
                .hangingSign(RuBlocks.CYPRESS_HANGING_SIGN.get(), RuBlocks.CYPRESS_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.CYPRESS_PRESSURE_PLATE.get())
                .slab(RuBlocks.CYPRESS_SLAB.get())
                .sign(RuBlocks.CYPRESS_SIGN.get(), RuBlocks.CYPRESS_WALL_SIGN.get())
                .stairs(RuBlocks.CYPRESS_STAIRS.get())
                .trapdoor(RuBlocks.CYPRESS_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_CYPRESS_SHINGLES)
                .getFamily();

        RU_DEAD_PLANKS = familyBuilder(RuBlocks.DEAD_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_DEAD)
                .button(RuBlocks.DEAD_BUTTON.get())
                .door(RuBlocks.DEAD_DOOR.get())
                .fence(RuBlocks.DEAD_FENCE.get())
                .fenceGate(RuBlocks.DEAD_FENCE_GATE.get())
                .hangingSign(RuBlocks.DEAD_HANGING_SIGN.get(), RuBlocks.DEAD_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.DEAD_PRESSURE_PLATE.get())
                .slab(RuBlocks.DEAD_SLAB.get())
                .sign(RuBlocks.DEAD_SIGN.get(), RuBlocks.DEAD_WALL_SIGN.get())
                .stairs(RuBlocks.DEAD_STAIRS.get())
                .trapdoor(RuBlocks.DEAD_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_DEAD_SHINGLES)
                .getFamily();

        RU_EUCALYPTUS_PLANKS = familyBuilder(RuBlocks.EUCALYPTUS_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_EUCALYPTUS)
                .button(RuBlocks.EUCALYPTUS_BUTTON.get())
                .door(RuBlocks.EUCALYPTUS_DOOR.get())
                .fence(RuBlocks.EUCALYPTUS_FENCE.get())
                .fenceGate(RuBlocks.EUCALYPTUS_FENCE_GATE.get())
                .hangingSign(RuBlocks.EUCALYPTUS_HANGING_SIGN.get(), RuBlocks.EUCALYPTUS_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.EUCALYPTUS_PRESSURE_PLATE.get())
                .slab(RuBlocks.EUCALYPTUS_SLAB.get())
                .sign(RuBlocks.EUCALYPTUS_SIGN.get(), RuBlocks.EUCALYPTUS_WALL_SIGN.get())
                .stairs(RuBlocks.EUCALYPTUS_STAIRS.get())
                .trapdoor(RuBlocks.EUCALYPTUS_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_EUCALYPTUS_SHINGLES)
                .getFamily();

        RU_GREEN_BIOSHROOM_PLANKS = familyBuilder(RuBlocks.GREEN_BIOSHROOM.get())
                .fromManager(RegionsUnexploredBlocks.RU_GREEN_BIOSHROOM)
                .button(RuBlocks.GREEN_BIOSHROOM_BUTTON.get())
                .door(RuBlocks.GREEN_BIOSHROOM_DOOR.get())
                .fence(RuBlocks.GREEN_BIOSHROOM_FENCE.get())
                .fenceGate(RuBlocks.GREEN_BIOSHROOM_FENCE_GATE.get())
                .hangingSign(RuBlocks.GREEN_BIOSHROOM_HANGING_SIGN.get(), RuBlocks.GREEN_BIOSHROOM_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.GREEN_BIOSHROOM_PRESSURE_PLATE.get())
                .slab(RuBlocks.GREEN_BIOSHROOM_SLAB.get())
                .sign(RuBlocks.GREEN_BIOSHROOM_SIGN.get(), RuBlocks.GREEN_BIOSHROOM_WALL_SIGN.get())
                .stairs(RuBlocks.GREEN_BIOSHROOM_STAIRS.get())
                .trapdoor(RuBlocks.GREEN_BIOSHROOM_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_GREEN_BIOSHROOM_SHINGLES)
                .getFamily();

        RU_JOSHUA_PLANKS = familyBuilder(RuBlocks.JOSHUA_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_JOSHUA)
                .button(RuBlocks.JOSHUA_BUTTON.get())
                .door(RuBlocks.JOSHUA_DOOR.get())
                .fence(RuBlocks.JOSHUA_FENCE.get())
                .fenceGate(RuBlocks.JOSHUA_FENCE_GATE.get())
                .hangingSign(RuBlocks.JOSHUA_HANGING_SIGN.get(), RuBlocks.JOSHUA_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.JOSHUA_PRESSURE_PLATE.get())
                .slab(RuBlocks.JOSHUA_SLAB.get())
                .sign(RuBlocks.JOSHUA_SIGN.get(), RuBlocks.JOSHUA_WALL_SIGN.get())
                .stairs(RuBlocks.JOSHUA_STAIRS.get())
                .trapdoor(RuBlocks.JOSHUA_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_JOSHUA_SHINGLES)
                .getFamily();

        RU_KAPOK_PLANKS = familyBuilder(RuBlocks.KAPOK_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_KAPOK)
                .button(RuBlocks.KAPOK_BUTTON.get())
                .door(RuBlocks.KAPOK_DOOR.get())
                .fence(RuBlocks.KAPOK_FENCE.get())
                .fenceGate(RuBlocks.KAPOK_FENCE_GATE.get())
                .hangingSign(RuBlocks.KAPOK_HANGING_SIGN.get(), RuBlocks.KAPOK_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.KAPOK_PRESSURE_PLATE.get())
                .slab(RuBlocks.KAPOK_SLAB.get())
                .sign(RuBlocks.KAPOK_SIGN.get(), RuBlocks.KAPOK_WALL_SIGN.get())
                .stairs(RuBlocks.KAPOK_STAIRS.get())
                .trapdoor(RuBlocks.KAPOK_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_KAPOK_SHINGLES)
                .getFamily();

        RU_LARCH_PLANKS = familyBuilder(RuBlocks.LARCH_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_LARCH)
                .button(RuBlocks.LARCH_BUTTON.get())
                .door(RuBlocks.LARCH_DOOR.get())
                .fence(RuBlocks.LARCH_FENCE.get())
                .fenceGate(RuBlocks.LARCH_FENCE_GATE.get())
                .hangingSign(RuBlocks.LARCH_HANGING_SIGN.get(), RuBlocks.LARCH_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.LARCH_PRESSURE_PLATE.get())
                .slab(RuBlocks.LARCH_SLAB.get())
                .sign(RuBlocks.LARCH_SIGN.get(), RuBlocks.LARCH_WALL_SIGN.get())
                .stairs(RuBlocks.LARCH_STAIRS.get())
                .trapdoor(RuBlocks.LARCH_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_LARCH_SHINGLES)
                .getFamily();

        RU_MAGNOLIA_PLANKS = familyBuilder(RuBlocks.MAGNOLIA_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_MAGNOLIA)
                .button(RuBlocks.MAGNOLIA_BUTTON.get())
                .door(RuBlocks.MAGNOLIA_DOOR.get())
                .fence(RuBlocks.MAGNOLIA_FENCE.get())
                .fenceGate(RuBlocks.MAGNOLIA_FENCE_GATE.get())
                .hangingSign(RuBlocks.MAGNOLIA_HANGING_SIGN.get(), RuBlocks.MAGNOLIA_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.MAGNOLIA_PRESSURE_PLATE.get())
                .slab(RuBlocks.MAGNOLIA_SLAB.get())
                .sign(RuBlocks.MAGNOLIA_SIGN.get(), RuBlocks.MAGNOLIA_WALL_SIGN.get())
                .stairs(RuBlocks.MAGNOLIA_STAIRS.get())
                .trapdoor(RuBlocks.MAGNOLIA_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_MAGNOLIA_SHINGLES)
                .getFamily();

        RU_MAPLE_PLANKS = familyBuilder(RuBlocks.MAPLE_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_MAPLE)
                .button(RuBlocks.MAPLE_BUTTON.get())
                .door(RuBlocks.MAPLE_DOOR.get())
                .fence(RuBlocks.MAPLE_FENCE.get())
                .fenceGate(RuBlocks.MAPLE_FENCE_GATE.get())
                .hangingSign(RuBlocks.MAPLE_HANGING_SIGN.get(), RuBlocks.MAPLE_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.MAPLE_PRESSURE_PLATE.get())
                .slab(RuBlocks.MAPLE_SLAB.get())
                .sign(RuBlocks.MAPLE_SIGN.get(), RuBlocks.MAPLE_WALL_SIGN.get())
                .stairs(RuBlocks.MAPLE_STAIRS.get())
                .trapdoor(RuBlocks.MAPLE_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_MAPLE_SHINGLES)
                .getFamily();

        RU_MAUVE_PLANKS = familyBuilder(RuBlocks.MAUVE_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_MAUVE)
                .button(RuBlocks.MAUVE_BUTTON.get())
                .door(RuBlocks.MAUVE_DOOR.get())
                .fence(RuBlocks.MAUVE_FENCE.get())
                .fenceGate(RuBlocks.MAUVE_FENCE_GATE.get())
                .hangingSign(RuBlocks.MAUVE_HANGING_SIGN.get(), RuBlocks.MAUVE_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.MAUVE_PRESSURE_PLATE.get())
                .slab(RuBlocks.MAUVE_SLAB.get())
                .sign(RuBlocks.MAUVE_SIGN.get(), RuBlocks.MAUVE_WALL_SIGN.get())
                .stairs(RuBlocks.MAUVE_STAIRS.get())
                .trapdoor(RuBlocks.MAUVE_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_MAUVE_SHINGLES)
                .getFamily();

        RU_PALM_PLANKS = familyBuilder(RuBlocks.PALM_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_PALM)
                .button(RuBlocks.PALM_BUTTON.get())
                .door(RuBlocks.PALM_DOOR.get())
                .fence(RuBlocks.PALM_FENCE.get())
                .fenceGate(RuBlocks.PALM_FENCE_GATE.get())
                .hangingSign(RuBlocks.PALM_HANGING_SIGN.get(), RuBlocks.PALM_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.PALM_PRESSURE_PLATE.get())
                .slab(RuBlocks.PALM_SLAB.get())
                .sign(RuBlocks.PALM_SIGN.get(), RuBlocks.PALM_WALL_SIGN.get())
                .stairs(RuBlocks.PALM_STAIRS.get())
                .trapdoor(RuBlocks.PALM_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_PALM_SHINGLES)
                .getFamily();

        RU_PINE_PLANKS = familyBuilder(RuBlocks.PINE_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_PINE)
                .button(RuBlocks.PINE_BUTTON.get())
                .door(RuBlocks.PINE_DOOR.get())
                .fence(RuBlocks.PINE_FENCE.get())
                .fenceGate(RuBlocks.PINE_FENCE_GATE.get())
                .hangingSign(RuBlocks.PINE_HANGING_SIGN.get(), RuBlocks.PINE_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.PINE_PRESSURE_PLATE.get())
                .slab(RuBlocks.PINE_SLAB.get())
                .sign(RuBlocks.PINE_SIGN.get(), RuBlocks.PINE_WALL_SIGN.get())
                .stairs(RuBlocks.PINE_STAIRS.get())
                .trapdoor(RuBlocks.PINE_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_PINE_SHINGLES)
                .getFamily();

        RU_PINK_BIOSHROOM_PLANKS = familyBuilder(RuBlocks.PINK_BIOSHROOM.get())
                .fromManager(RegionsUnexploredBlocks.RU_PINK_BIOSHROOM)
                .button(RuBlocks.PINK_BIOSHROOM_BUTTON.get())
                .door(RuBlocks.PINK_BIOSHROOM_DOOR.get())
                .fence(RuBlocks.PINK_BIOSHROOM_FENCE.get())
                .fenceGate(RuBlocks.PINK_BIOSHROOM_FENCE_GATE.get())
                .hangingSign(RuBlocks.PINK_BIOSHROOM_HANGING_SIGN.get(), RuBlocks.PINK_BIOSHROOM_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.PINK_BIOSHROOM_PRESSURE_PLATE.get())
                .slab(RuBlocks.PINK_BIOSHROOM_SLAB.get())
                .sign(RuBlocks.PINK_BIOSHROOM_SIGN.get(), RuBlocks.PINK_BIOSHROOM_WALL_SIGN.get())
                .stairs(RuBlocks.PINK_BIOSHROOM_STAIRS.get())
                .trapdoor(RuBlocks.PINK_BIOSHROOM_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_PINK_BIOSHROOM_SHINGLES)
                .getFamily();

        RU_REDWOOD_PLANKS = familyBuilder(RuBlocks.REDWOOD_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_REDWOOD)
                .button(RuBlocks.REDWOOD_BUTTON.get())
                .door(RuBlocks.REDWOOD_DOOR.get())
                .fence(RuBlocks.REDWOOD_FENCE.get())
                .fenceGate(RuBlocks.REDWOOD_FENCE_GATE.get())
                .hangingSign(RuBlocks.REDWOOD_HANGING_SIGN.get(), RuBlocks.REDWOOD_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.REDWOOD_PRESSURE_PLATE.get())
                .slab(RuBlocks.REDWOOD_SLAB.get())
                .sign(RuBlocks.REDWOOD_SIGN.get(), RuBlocks.REDWOOD_WALL_SIGN.get())
                .stairs(RuBlocks.REDWOOD_STAIRS.get())
                .trapdoor(RuBlocks.REDWOOD_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_REDWOOD_SHINGLES)
                .getFamily();

        RU_SOCOTRA_PLANKS = familyBuilder(RuBlocks.SOCOTRA_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_SOCOTRA)
                .button(RuBlocks.SOCOTRA_BUTTON.get())
                .door(RuBlocks.SOCOTRA_DOOR.get())
                .fence(RuBlocks.SOCOTRA_FENCE.get())
                .fenceGate(RuBlocks.SOCOTRA_FENCE_GATE.get())
                .hangingSign(RuBlocks.SOCOTRA_HANGING_SIGN.get(), RuBlocks.SOCOTRA_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.SOCOTRA_PRESSURE_PLATE.get())
                .slab(RuBlocks.SOCOTRA_SLAB.get())
                .sign(RuBlocks.SOCOTRA_SIGN.get(), RuBlocks.SOCOTRA_WALL_SIGN.get())
                .stairs(RuBlocks.SOCOTRA_STAIRS.get())
                .trapdoor(RuBlocks.SOCOTRA_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_SOCOTRA_SHINGLES)
                .getFamily();

        RU_WILLOW_PLANKS = familyBuilder(RuBlocks.WILLOW_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_WILLOW)
                .button(RuBlocks.WILLOW_BUTTON.get())
                .door(RuBlocks.WILLOW_DOOR.get())
                .fence(RuBlocks.WILLOW_FENCE.get())
                .fenceGate(RuBlocks.WILLOW_FENCE_GATE.get())
                .hangingSign(RuBlocks.WILLOW_HANGING_SIGN.get(), RuBlocks.WILLOW_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.WILLOW_PRESSURE_PLATE.get())
                .slab(RuBlocks.WILLOW_SLAB.get())
                .sign(RuBlocks.WILLOW_SIGN.get(), RuBlocks.WILLOW_WALL_SIGN.get())
                .stairs(RuBlocks.WILLOW_STAIRS.get())
                .trapdoor(RuBlocks.WILLOW_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_WILLOW_SHINGLES)
                .getFamily();

        YRU_YELLOW_BIOSHROOM_PLANKS = familyBuilder(RuBlocks.YELLOW_BIOSHROOM.get())
                .fromManager(RegionsUnexploredBlocks.RU_YELLOW_BIOSHROOM)
                .button(RuBlocks.YELLOW_BIOSHROOM_BUTTON.get())
                .door(RuBlocks.YELLOW_BIOSHROOM_DOOR.get())
                .fence(RuBlocks.YELLOW_BIOSHROOM_FENCE.get())
                .fenceGate(RuBlocks.YELLOW_BIOSHROOM_FENCE_GATE.get())
                .hangingSign(RuBlocks.YELLOW_BIOSHROOM_HANGING_SIGN.get(), RuBlocks.YELLOW_BIOSHROOM_WALL_HANGING_SIGN.get())
                .pressurePlate(RuBlocks.YELLOW_BIOSHROOM_PRESSURE_PLATE.get())
                .slab(RuBlocks.YELLOW_BIOSHROOM_SLAB.get())
                .sign(RuBlocks.YELLOW_BIOSHROOM_SIGN.get(), RuBlocks.YELLOW_BIOSHROOM_WALL_SIGN.get())
                .stairs(RuBlocks.YELLOW_BIOSHROOM_STAIRS.get())
                .trapdoor(RuBlocks.YELLOW_BIOSHROOM_TRAPDOOR.get())
                .fromManager(RegionsUnexploredBlocks.RU_YELLOW_BIOSHROOM_SHINGLES)
                .getFamily();

        /* Stripped Wood */
        RU_STRIPPED_BAOBAB = familyBuilder(RuBlocks.STRIPPED_BAOBAB_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_BAOBAB)
                .getFamily();

        RU_STRIPPED_BLACKWOOD = familyBuilder(RuBlocks.STRIPPED_BLACKWOOD_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_BLACKWOOD)
                .getFamily();

        RU_STRIPPED_BLUE_BIOSHROOM = familyBuilder(RuBlocks.STRIPPED_BLUE_BIOSHROOM_HYPHAE.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_BLUE_BIOSHROOM)
                .getFamily();

        RU_STRIPPED_BRIMWOOD = familyBuilder(RuBlocks.STRIPPED_BRIMWOOD_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_BRIMWOOD)
                .getFamily();

        RU_STRIPPED_COBALT = familyBuilder(RuBlocks.STRIPPED_COBALT_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_COBALT)
                .getFamily();

        RU_STRIPPED_CYPRESS = familyBuilder(RuBlocks.STRIPPED_CYPRESS_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_CYPRESS)
                .getFamily();

        RU_STRIPPED_DEAD = familyBuilder(RuBlocks.STRIPPED_DEAD_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_DEAD)
                .getFamily();

        RU_STRIPPED_EUCALYPTUS = familyBuilder(RuBlocks.STRIPPED_EUCALYPTUS_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_EUCALYPTUS)
                .getFamily();

        RU_STRIPPED_GREEN_BIOSHROOM = familyBuilder(RuBlocks.STRIPPED_GREEN_BIOSHROOM_HYPHAE.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_GREEN_BIOSHROOM)
                .getFamily();

        RU_STRIPPED_JOSHUA = familyBuilder(RuBlocks.STRIPPED_JOSHUA_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_JOSHUA)
                .getFamily();

        RU_STRIPPED_KAPOK = familyBuilder(RuBlocks.STRIPPED_KAPOK_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_KAPOK)
                .getFamily();

        RU_STRIPPED_LARCH = familyBuilder(RuBlocks.STRIPPED_LARCH_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_LARCH)
                .getFamily();

        RU_STRIPPED_MAGNOLIA = familyBuilder(RuBlocks.STRIPPED_MAGNOLIA_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_MAGNOLIA)
                .getFamily();

        RU_STRIPPED_MAPLE = familyBuilder(RuBlocks.STRIPPED_MAPLE_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_MAPLE)
                .getFamily();

        RU_STRIPPED_MAUVE = familyBuilder(RuBlocks.STRIPPED_MAUVE_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_MAUVE)
                .getFamily();

        RU_STRIPPED_PALM = familyBuilder(RuBlocks.STRIPPED_PALM_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_PALM)
                .getFamily();

        RU_STRIPPED_PINE = familyBuilder(RuBlocks.STRIPPED_PINE_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_PINE)
                .getFamily();

        RU_STRIPPED_PINK_BIOSHROOM = familyBuilder(RuBlocks.STRIPPED_PINK_BIOSHROOM_HYPHAE.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_PINK_BIOSHROOM)
                .getFamily();

        RU_STRIPPED_REDWOOD = familyBuilder(RuBlocks.STRIPPED_REDWOOD_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_REDWOOD)
                .getFamily();

        RU_STRIPPED_SOCOTRA = familyBuilder(RuBlocks.STRIPPED_SOCOTRA_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_SOCOTRA)
                .getFamily();

        RU_STRIPPED_WILLOW = familyBuilder(RuBlocks.STRIPPED_WILLOW_WOOD.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_WILLOW)
                .getFamily();

        RU_STRIPPED_YELLOW_BIOSHROOM = familyBuilder(RuBlocks.STRIPPED_YELLOW_BIOSHROOM_HYPHAE.get())
                .fromManager(RegionsUnexploredBlocks.RU_STRIPPED_YELLOW_BIOSHROOM)
                .getFamily();

        /* Painted Planks */
        RU_BLACK_PAINTED_PLANKS = familyBuilder(RuBlocks.BLACK_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BLACK_PAINTED)
                .slab(RuBlocks.BLACK_PAINTED_SLAB.get())
                .stairs(RuBlocks.BLACK_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BLACK_PAINTED_SHINGLES)
                .getFamily();

        RU_BLUE_PAINTED_PLANKS = familyBuilder(RuBlocks.BLUE_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BLUE_PAINTED)
                .slab(RuBlocks.BLUE_PAINTED_SLAB.get())
                .stairs(RuBlocks.BLUE_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BLUE_PAINTED_SHINGLES)
                .getFamily();

        RU_BROWN_PAINTED_PLANKS = familyBuilder(RuBlocks.BROWN_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BROWN_PAINTED)
                .slab(RuBlocks.BROWN_PAINTED_SLAB.get())
                .stairs(RuBlocks.BROWN_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_BROWN_PAINTED_SHINGLES)
                .getFamily();

        RU_CYAN_PAINTED_PLANKS = familyBuilder(RuBlocks.CYAN_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_CYAN_PAINTED)
                .slab(RuBlocks.CYAN_PAINTED_SLAB.get())
                .stairs(RuBlocks.CYAN_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_CYAN_PAINTED_SHINGLES)
                .getFamily();

        RU_GRAY_PAINTED_PLANKS = familyBuilder(RuBlocks.GRAY_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_GRAY_PAINTED)
                .slab(RuBlocks.GRAY_PAINTED_SLAB.get())
                .stairs(RuBlocks.GRAY_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_GRAY_PAINTED_SHINGLES)
                .getFamily();

        RU_GREEN_PAINTED_PLANKS = familyBuilder(RuBlocks.GREEN_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_GREEN_PAINTED)
                .slab(RuBlocks.GREEN_PAINTED_SLAB.get())
                .stairs(RuBlocks.GREEN_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_GREEN_PAINTED_SHINGLES)
                .getFamily();

        RU_LIGHT_BLUE_PAINTED_PLANKS = familyBuilder(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_LIGHT_BLUE_PAINTED)
                .slab(RuBlocks.LIGHT_BLUE_PAINTED_SLAB.get())
                .stairs(RuBlocks.LIGHT_BLUE_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_LIGHT_BLUE_PAINTED_SHINGLES)
                .getFamily();

        RU_LIGHT_GRAY_PAINTED_PLANKS = familyBuilder(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_LIGHT_GRAY_PAINTED)
                .slab(RuBlocks.LIGHT_GRAY_PAINTED_SLAB.get())
                .stairs(RuBlocks.LIGHT_GRAY_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_LIGHT_GRAY_PAINTED_SHINGLES)
                .getFamily();

        RU_LIME_PAINTED_PLANKS = familyBuilder(RuBlocks.LIME_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_LIME_PAINTED)
                .slab(RuBlocks.LIME_PAINTED_SLAB.get())
                .stairs(RuBlocks.LIME_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_LIME_PAINTED_SHINGLES)
                .getFamily();

        RU_MAGENTA_PAINTED_PLANKS = familyBuilder(RuBlocks.MAGENTA_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_MAGENTA_PAINTED)
                .slab(RuBlocks.MAGENTA_PAINTED_SLAB.get())
                .stairs(RuBlocks.MAGENTA_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_MAGENTA_PAINTED_SHINGLES)
                .getFamily();

        RU_ORANGE_PAINTED_PLANKS = familyBuilder(RuBlocks.ORANGE_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_ORANGE_PAINTED)
                .slab(RuBlocks.ORANGE_PAINTED_SLAB.get())
                .stairs(RuBlocks.ORANGE_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_ORANGE_PAINTED_SHINGLES)
                .getFamily();

        RU_PINK_PAINTED_PLANKS = familyBuilder(RuBlocks.PINK_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_PINK_PAINTED)
                .slab(RuBlocks.PINK_PAINTED_SLAB.get())
                .stairs(RuBlocks.PINK_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_PINK_PAINTED_SHINGLES)
                .getFamily();

        RU_PURPLE_PAINTED_PLANKS = familyBuilder(RuBlocks.PURPLE_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_PURPLE_PAINTED)
                .slab(RuBlocks.PURPLE_PAINTED_SLAB.get())
                .stairs(RuBlocks.PURPLE_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_PURPLE_PAINTED_SHINGLES)
                .getFamily();

        RU_RED_PAINTED_PLANKS = familyBuilder(RuBlocks.RED_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_RED_PAINTED)
                .slab(RuBlocks.RED_PAINTED_SLAB.get())
                .stairs(RuBlocks.RED_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_RED_PAINTED_SHINGLES)
                .getFamily();

        RU_WHITE_PAINTED_PLANKS = familyBuilder(RuBlocks.WHITE_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_WHITE_PAINTED)
                .slab(RuBlocks.WHITE_PAINTED_SLAB.get())
                .stairs(RuBlocks.WHITE_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_WHITE_PAINTED_SHINGLES)
                .getFamily();

        RU_YELLOW_PAINTED_PLANKS = familyBuilder(RuBlocks.YELLOW_PAINTED_PLANKS.get())
                .fromManager(RegionsUnexploredBlocks.RU_YELLOW_PAINTED)
                .slab(RuBlocks.YELLOW_PAINTED_SLAB.get())
                .stairs(RuBlocks.YELLOW_PAINTED_STAIRS.get())
                .fromManager(RegionsUnexploredBlocks.RU_YELLOW_PAINTED_SHINGLES)
                .getFamily();
    }

}
