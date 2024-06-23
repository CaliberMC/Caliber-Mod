package com.calibermc.caliber.compat.data.forge;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;

import static com.calibermc.caliber.compat.data.BiomesOPlentyBlockFamilies.*;

public class BiomesOPlentyBlockFamiliesImpl {
    public static void init() {
        BOP_BLACK_SANDSTONE = familyBuilder(BOPBlocks.BLACK_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_BLACK_SANDSTONE)
                .slab(BOPBlocks.BLACK_SANDSTONE_SLAB.get())
                .stairs(BOPBlocks.BLACK_SANDSTONE_STAIRS.get())
                .wall(BOPBlocks.BLACK_SANDSTONE_WALL.get())
                .getFamily();

        BOP_BRIMSTONE = familyBuilder(BOPBlocks.BRIMSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_BRIMSTONE)
                .getFamily();

        BOP_BRIMSTONE_BRICKS = familyBuilder(BOPBlocks.BRIMSTONE_BRICKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_BRIMSTONE_BRICK)
                .slab(BOPBlocks.BRIMSTONE_BRICK_SLAB.get())
                .stairs(BOPBlocks.BRIMSTONE_BRICK_STAIRS.get())
                .wall(BOPBlocks.BRIMSTONE_BRICK_WALL.get())
                .getFamily();

        BOP_CHISELED_BLACK_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_BLACK_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_CHISELED_BLACK_SANDSTONE)
                .getFamily();

        BOP_CHISELED_BRIMSTONE_BRICKS = familyBuilder(BOPBlocks.CHISELED_BRIMSTONE_BRICKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_CHISELED_BRIMSTONE_BRICK)
                .getFamily();

//    public static ModBlockFamily BOP_MAPLE_PLANKS = familyBuilder(BOPBlocks.MAPLE_PLANKS)
//            .fromManager(BiomesOPlentyBlocks.MAPLE)
//            .button(BOPBlocks.MAPLE_BUTTON.get())
//            .door(BOPBlocks.MAPLE_DOOR.get())
//            .fence(BOPBlocks.MAPLE_FENCE.get())
//            .fenceGate(BOPBlocks.MAPLE_FENCE_GATE.get())
//            .pressurePlate(BOPBlocks.MAPLE_PRESSURE_PLATE.get())
//            .sign(BOPBlocks.MAPLE_SIGN.get(), BOPBlocks.MAPLE_WALL_SIGN.get())
//            .stairs(BOPBlocks.MAPLE_STAIRS.get())
//            .trapdoor(BOPBlocks.MAPLE_TRAPDOOR.get())
//            .fromManager(BiomesOPlentyBlocks.MAPLE_SHINGLES)
//            .getFamily();

        BOP_CHISELED_ORANGE_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_ORANGE_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_CHISELED_ORANGE_SANDSTONE)
                .getFamily();

        BOP_CHISELED_WHITE_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_WHITE_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_CHISELED_WHITE_SANDSTONE)
                .getFamily();

//    public static ModBlockFamily BOP_PINE_PLANKS = familyBuilder(BOPBlocks.PINE_PLANKS)
//            .fromManager(BiomesOPlentyBlocks.PINE)
//            .button(BOPBlocks.PINE_BUTTON.get())
//            .door(BOPBlocks.PINE_DOOR.get())
//            .fence(BOPBlocks.PINE_FENCE.get())
//            .fenceGate(BOPBlocks.PINE_FENCE_GATE.get())
//            .pressurePlate(BOPBlocks.PINE_PRESSURE_PLATE.get())
//            .sign(BOPBlocks.PINE_SIGN.get(), BOPBlocks.PINE_WALL_SIGN.get())
//            .stairs(BOPBlocks.PINE_STAIRS.get())
//            .trapdoor(BOPBlocks.PINE_TRAPDOOR.get())
//            .fromManager(BiomesOPlentyBlocks.PINE_SHINGLES)
//            .getFamily();
        BOP_CUT_BLACK_SANDSTONE = familyBuilder(BOPBlocks.CUT_BLACK_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_CUT_BLACK_SANDSTONE)
                .slab(BOPBlocks.CUT_BLACK_SANDSTONE_SLAB.get())
                .getFamily();

        BOP_CUT_ORANGE_SANDSTONE = familyBuilder(BOPBlocks.CUT_ORANGE_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_CUT_ORANGE_SANDSTONE)
                .slab(BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB.get())
                .getFamily();

        BOP_CUT_WHITE_SANDSTONE = familyBuilder(BOPBlocks.CUT_WHITE_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_CUT_WHITE_SANDSTONE)
                .slab(BOPBlocks.CUT_WHITE_SANDSTONE_SLAB.get())
                .getFamily();

        BOP_SMOOTH_BLACK_SANDSTONE = familyBuilder(BOPBlocks.SMOOTH_BLACK_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_SMOOTH_BLACK_SANDSTONE)
                .slab(BOPBlocks.SMOOTH_BLACK_SANDSTONE_SLAB.get())
                .stairs(BOPBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS.get())
                .getFamily();

        BOP_SMOOTH_ORANGE_SANDSTONE = familyBuilder(BOPBlocks.SMOOTH_ORANGE_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_SMOOTH_ORANGE_SANDSTONE)
                .slab(BOPBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get())
                .stairs(BOPBlocks.SMOOTH_ORANGE_SANDSTONE_STAIRS.get())
                .getFamily();

        BOP_SMOOTH_WHITE_SANDSTONE = familyBuilder(BOPBlocks.SMOOTH_WHITE_SANDSTONE.get())
                .fromManager(BiomesOPlentyBlocks.BOP_SMOOTH_WHITE_SANDSTONE)
                .slab(BOPBlocks.SMOOTH_WHITE_SANDSTONE_SLAB.get())
                .stairs(BOPBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS.get())
                .getFamily();

        BOP_DEAD_PLANKS = familyBuilder(BOPBlocks.DEAD_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_DEAD)
                .button(BOPBlocks.DEAD_BUTTON.get())
                .door(BOPBlocks.DEAD_DOOR.get())
                .fence(BOPBlocks.DEAD_FENCE.get())
                .fenceGate(BOPBlocks.DEAD_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.DEAD_PRESSURE_PLATE.get())
                .sign(BOPBlocks.DEAD_SIGN.get(), BOPBlocks.DEAD_WALL_SIGN.get())
                .stairs(BOPBlocks.DEAD_STAIRS.get())
                .trapdoor(BOPBlocks.DEAD_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_DEAD_SHINGLES)
                .getFamily();

        BOP_FIR_PLANKS = familyBuilder(BOPBlocks.FIR_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_FIR)
                .button(BOPBlocks.FIR_BUTTON.get())
                .door(BOPBlocks.FIR_DOOR.get())
                .fence(BOPBlocks.FIR_FENCE.get())
                .fenceGate(BOPBlocks.FIR_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.FIR_PRESSURE_PLATE.get())
                .sign(BOPBlocks.FIR_SIGN.get(), BOPBlocks.FIR_WALL_SIGN.get())
                .stairs(BOPBlocks.FIR_STAIRS.get())
                .trapdoor(BOPBlocks.FIR_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_FIR_SHINGLES)
                .getFamily();

        BOP_HELLBARK_PLANKS = familyBuilder(BOPBlocks.HELLBARK_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_HELLBARK)
                .button(BOPBlocks.HELLBARK_BUTTON.get())
                .door(BOPBlocks.HELLBARK_DOOR.get())
                .fence(BOPBlocks.HELLBARK_FENCE.get())
                .fenceGate(BOPBlocks.HELLBARK_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.HELLBARK_PRESSURE_PLATE.get())
                .sign(BOPBlocks.HELLBARK_SIGN.get(), BOPBlocks.HELLBARK_WALL_SIGN.get())
                .stairs(BOPBlocks.HELLBARK_STAIRS.get())
                .trapdoor(BOPBlocks.HELLBARK_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_HELLBARK_SHINGLES)
                .getFamily();

        BOP_JACARANDA_PLANKS = familyBuilder(BOPBlocks.JACARANDA_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_JACARANDA)
                .button(BOPBlocks.JACARANDA_BUTTON.get())
                .door(BOPBlocks.JACARANDA_DOOR.get())
                .fence(BOPBlocks.JACARANDA_FENCE.get())
                .fenceGate(BOPBlocks.JACARANDA_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.JACARANDA_PRESSURE_PLATE.get())
                .sign(BOPBlocks.JACARANDA_SIGN.get(), BOPBlocks.JACARANDA_WALL_SIGN.get())
                .stairs(BOPBlocks.JACARANDA_STAIRS.get())
                .trapdoor(BOPBlocks.JACARANDA_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_JACARANDA_SHINGLES)
                .getFamily();

        BOP_MAGIC_PLANKS = familyBuilder(BOPBlocks.MAGIC_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_MAGIC)
                .button(BOPBlocks.MAGIC_BUTTON.get())
                .door(BOPBlocks.MAGIC_DOOR.get())
                .fence(BOPBlocks.MAGIC_FENCE.get())
                .fenceGate(BOPBlocks.MAGIC_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.MAGIC_PRESSURE_PLATE.get())
                .sign(BOPBlocks.MAGIC_SIGN.get(), BOPBlocks.MAGIC_WALL_SIGN.get())
                .stairs(BOPBlocks.MAGIC_STAIRS.get())
                .trapdoor(BOPBlocks.MAGIC_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_MAGIC_SHINGLES)
                .getFamily();

        BOP_MAHOGANY_PLANKS = familyBuilder(BOPBlocks.MAHOGANY_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_MAHOGANY)
                .button(BOPBlocks.MAHOGANY_BUTTON.get())
                .door(BOPBlocks.MAHOGANY_DOOR.get())
                .fence(BOPBlocks.MAHOGANY_FENCE.get())
                .fenceGate(BOPBlocks.MAHOGANY_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.MAHOGANY_PRESSURE_PLATE.get())
                .sign(BOPBlocks.MAHOGANY_SIGN.get(), BOPBlocks.MAHOGANY_WALL_SIGN.get())
                .stairs(BOPBlocks.MAHOGANY_STAIRS.get())
                .trapdoor(BOPBlocks.MAHOGANY_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_MAHOGANY_SHINGLES)
                .getFamily();

        BOP_PALM_PLANKS = familyBuilder(BOPBlocks.PALM_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_PALM)
                .button(BOPBlocks.PALM_BUTTON.get())
                .door(BOPBlocks.PALM_DOOR.get())
                .fence(BOPBlocks.PALM_FENCE.get())
                .fenceGate(BOPBlocks.PALM_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.PALM_PRESSURE_PLATE.get())
                .sign(BOPBlocks.PALM_SIGN.get(), BOPBlocks.PALM_WALL_SIGN.get())
                .stairs(BOPBlocks.PALM_STAIRS.get())
                .trapdoor(BOPBlocks.PALM_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_PALM_SHINGLES)
                .getFamily();

        BOP_REDWOOD_PLANKS = familyBuilder(BOPBlocks.REDWOOD_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_REDWOOD)
                .button(BOPBlocks.REDWOOD_BUTTON.get())
                .door(BOPBlocks.REDWOOD_DOOR.get())
                .fence(BOPBlocks.REDWOOD_FENCE.get())
                .fenceGate(BOPBlocks.REDWOOD_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.REDWOOD_PRESSURE_PLATE.get())
                .sign(BOPBlocks.REDWOOD_SIGN.get(), BOPBlocks.REDWOOD_WALL_SIGN.get())
                .stairs(BOPBlocks.REDWOOD_STAIRS.get())
                .trapdoor(BOPBlocks.REDWOOD_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_REDWOOD_SHINGLES)
                .getFamily();

        BOP_UMBRAN_PLANKS = familyBuilder(BOPBlocks.UMBRAN_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_UMBRAN)
                .button(BOPBlocks.UMBRAN_BUTTON.get())
                .door(BOPBlocks.UMBRAN_DOOR.get())
                .fence(BOPBlocks.UMBRAN_FENCE.get())
                .fenceGate(BOPBlocks.UMBRAN_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.UMBRAN_PRESSURE_PLATE.get())
                .sign(BOPBlocks.UMBRAN_SIGN.get(), BOPBlocks.UMBRAN_WALL_SIGN.get())
                .stairs(BOPBlocks.UMBRAN_STAIRS.get())
                .trapdoor(BOPBlocks.UMBRAN_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_UMBRAN_SHINGLES)
                .getFamily();

        BOP_WILLOW_PLANKS = familyBuilder(BOPBlocks.WILLOW_PLANKS.get())
                .fromManager(BiomesOPlentyBlocks.BOP_WILLOW)
                .button(BOPBlocks.WILLOW_BUTTON.get())
                .door(BOPBlocks.WILLOW_DOOR.get())
                .fence(BOPBlocks.WILLOW_FENCE.get())
                .fenceGate(BOPBlocks.WILLOW_FENCE_GATE.get())
                .pressurePlate(BOPBlocks.WILLOW_PRESSURE_PLATE.get())
                .sign(BOPBlocks.WILLOW_SIGN.get(), BOPBlocks.WILLOW_WALL_SIGN.get())
                .stairs(BOPBlocks.WILLOW_STAIRS.get())
                .trapdoor(BOPBlocks.WILLOW_TRAPDOOR.get())
                .fromManager(BiomesOPlentyBlocks.BOP_WILLOW_SHINGLES)
                .getFamily();

        BOP_STRIPPED_DEAD_WOOD = familyBuilder(BOPBlocks.STRIPPED_DEAD_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_DEAD)
                .getFamily();

        BOP_STRIPPED_FIR_WOOD = familyBuilder(BOPBlocks.STRIPPED_FIR_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_FIR)
                .getFamily();

//    public static ModBlockFamily BOP_STRIPPED_MAPLE_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAPLE_WOOD)
//            .fromManager(BiomesOPlentyBlocks.STRIPPED_MAPLE)
//            .getFamily();

//    public static ModBlockFamily BOP_STRIPPED_PINE_WOOD = familyBuilder(BOPBlocks.STRIPPED_PINE_WOOD)
//            .fromManager(BiomesOPlentyBlocks.STRIPPED_PINE)
//            .getFamily();

        BOP_STRIPPED_HELLBARK_WOOD = familyBuilder(BOPBlocks.STRIPPED_HELLBARK_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_HELLBARK)
                .getFamily();

        BOP_STRIPPED_JACARANDA_WOOD = familyBuilder(BOPBlocks.STRIPPED_JACARANDA_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_JACARANDA)
                .getFamily();
        BOP_STRIPPED_MAGIC_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAGIC_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_MAGIC)
                .getFamily();

        BOP_STRIPPED_MAHOGANY_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAHOGANY_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_MAHOGANY)
                .getFamily();

        BOP_STRIPPED_PALM_WOOD = familyBuilder(BOPBlocks.STRIPPED_PALM_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_PALM)
                .getFamily();

        BOP_STRIPPED_REDWOOD_WOOD = familyBuilder(BOPBlocks.STRIPPED_REDWOOD_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_REDWOOD)
                .getFamily();

        BOP_STRIPPED_UMBRAN_WOOD = familyBuilder(BOPBlocks.STRIPPED_UMBRAN_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_UMBRAN)
                .getFamily();

        BOP_STRIPPED_WILLOW_WOOD = familyBuilder(BOPBlocks.STRIPPED_WILLOW_WOOD.get())
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_WILLOW)
                .getFamily();
    }
}
