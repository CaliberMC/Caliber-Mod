package com.calibermc.caliber.compat.data.fabric;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;

import static com.calibermc.caliber.compat.data.BiomesOPlentyBlockFamilies.*;

public class BiomesOPlentyBlockFamiliesImpl {
    public static void init() {
        BOP_BLACK_SANDSTONE = familyBuilder(BOPBlocks.BLACK_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_BLACK_SANDSTONE)
                .slab(BOPBlocks.BLACK_SANDSTONE_SLAB)
                .stairs(BOPBlocks.BLACK_SANDSTONE_STAIRS)
                .wall(BOPBlocks.BLACK_SANDSTONE_WALL)
                .getFamily();

        BOP_BRIMSTONE = familyBuilder(BOPBlocks.BRIMSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_BRIMSTONE)
                .getFamily();

        BOP_BRIMSTONE_BRICKS = familyBuilder(BOPBlocks.BRIMSTONE_BRICKS)
                .fromManager(BiomesOPlentyBlocks.BOP_BRIMSTONE_BRICK)
                .slab(BOPBlocks.BRIMSTONE_BRICK_SLAB)
                .stairs(BOPBlocks.BRIMSTONE_BRICK_STAIRS)
                .wall(BOPBlocks.BRIMSTONE_BRICK_WALL)
                .getFamily();

        BOP_CHISELED_BLACK_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_BLACK_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_CHISELED_BLACK_SANDSTONE)
                .getFamily();

        BOP_CHISELED_BRIMSTONE_BRICKS = familyBuilder(BOPBlocks.CHISELED_BRIMSTONE_BRICKS)
                .fromManager(BiomesOPlentyBlocks.BOP_CHISELED_BRIMSTONE_BRICK)
                .getFamily();

//    public static ModBlockFamily BOP_MAPLE_PLANKS = familyBuilder(BOPBlocks.MAPLE_PLANKS)
//            .fromManager(BiomesOPlentyBlocks.MAPLE)
//            .button(BOPBlocks.MAPLE_BUTTON)
//            .door(BOPBlocks.MAPLE_DOOR)
//            .fence(BOPBlocks.MAPLE_FENCE)
//            .fenceGate(BOPBlocks.MAPLE_FENCE_GATE)
//            .pressurePlate(BOPBlocks.MAPLE_PRESSURE_PLATE)
//            .sign(BOPBlocks.MAPLE_SIGN, BOPBlocks.MAPLE_WALL_SIGN)
//            .stairs(BOPBlocks.MAPLE_STAIRS)
//            .trapdoor(BOPBlocks.MAPLE_TRAPDOOR)
//            .fromManager(BiomesOPlentyBlocks.MAPLE_SHINGLES)
//            .getFamily();

        BOP_CHISELED_ORANGE_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_ORANGE_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_CHISELED_ORANGE_SANDSTONE)
                .getFamily();

        BOP_CHISELED_WHITE_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_WHITE_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_CHISELED_WHITE_SANDSTONE)
                .getFamily();

//    public static ModBlockFamily BOP_PINE_PLANKS = familyBuilder(BOPBlocks.PINE_PLANKS)
//            .fromManager(BiomesOPlentyBlocks.PINE)
//            .button(BOPBlocks.PINE_BUTTON)
//            .door(BOPBlocks.PINE_DOOR)
//            .fence(BOPBlocks.PINE_FENCE)
//            .fenceGate(BOPBlocks.PINE_FENCE_GATE)
//            .pressurePlate(BOPBlocks.PINE_PRESSURE_PLATE)
//            .sign(BOPBlocks.PINE_SIGN, BOPBlocks.PINE_WALL_SIGN)
//            .stairs(BOPBlocks.PINE_STAIRS)
//            .trapdoor(BOPBlocks.PINE_TRAPDOOR)
//            .fromManager(BiomesOPlentyBlocks.PINE_SHINGLES)
//            .getFamily();
        BOP_CUT_BLACK_SANDSTONE = familyBuilder(BOPBlocks.CUT_BLACK_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_CUT_BLACK_SANDSTONE)
                .slab(BOPBlocks.CUT_BLACK_SANDSTONE_SLAB)
                .getFamily();

        BOP_CUT_ORANGE_SANDSTONE = familyBuilder(BOPBlocks.CUT_ORANGE_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_CUT_ORANGE_SANDSTONE)
                .slab(BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB)
                .getFamily();

        BOP_CUT_WHITE_SANDSTONE = familyBuilder(BOPBlocks.CUT_WHITE_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_CUT_WHITE_SANDSTONE)
                .slab(BOPBlocks.CUT_WHITE_SANDSTONE_SLAB)
                .getFamily();

        BOP_SMOOTH_BLACK_SANDSTONE = familyBuilder(BOPBlocks.SMOOTH_BLACK_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_SMOOTH_BLACK_SANDSTONE)
                .slab(BOPBlocks.SMOOTH_BLACK_SANDSTONE_SLAB)
                .stairs(BOPBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS)
                .getFamily();

        BOP_SMOOTH_ORANGE_SANDSTONE = familyBuilder(BOPBlocks.SMOOTH_ORANGE_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_SMOOTH_ORANGE_SANDSTONE)
                .slab(BOPBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB)
                .stairs(BOPBlocks.SMOOTH_ORANGE_SANDSTONE_STAIRS)
                .getFamily();

        BOP_SMOOTH_WHITE_SANDSTONE = familyBuilder(BOPBlocks.SMOOTH_WHITE_SANDSTONE)
                .fromManager(BiomesOPlentyBlocks.BOP_SMOOTH_WHITE_SANDSTONE)
                .slab(BOPBlocks.SMOOTH_WHITE_SANDSTONE_SLAB)
                .stairs(BOPBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS)
                .getFamily();

        BOP_DEAD_PLANKS = familyBuilder(BOPBlocks.DEAD_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_DEAD)
                .button(BOPBlocks.DEAD_BUTTON)
                .door(BOPBlocks.DEAD_DOOR)
                .fence(BOPBlocks.DEAD_FENCE)
                .fenceGate(BOPBlocks.DEAD_FENCE_GATE)
                .pressurePlate(BOPBlocks.DEAD_PRESSURE_PLATE)
                .sign(BOPBlocks.DEAD_SIGN, BOPBlocks.DEAD_WALL_SIGN)
                .stairs(BOPBlocks.DEAD_STAIRS)
                .trapdoor(BOPBlocks.DEAD_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_DEAD_SHINGLES)
                .getFamily();

        BOP_FIR_PLANKS = familyBuilder(BOPBlocks.FIR_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_FIR)
                .button(BOPBlocks.FIR_BUTTON)
                .door(BOPBlocks.FIR_DOOR)
                .fence(BOPBlocks.FIR_FENCE)
                .fenceGate(BOPBlocks.FIR_FENCE_GATE)
                .pressurePlate(BOPBlocks.FIR_PRESSURE_PLATE)
                .sign(BOPBlocks.FIR_SIGN, BOPBlocks.FIR_WALL_SIGN)
                .stairs(BOPBlocks.FIR_STAIRS)
                .trapdoor(BOPBlocks.FIR_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_FIR_SHINGLES)
                .getFamily();

        BOP_HELLBARK_PLANKS = familyBuilder(BOPBlocks.HELLBARK_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_HELLBARK)
                .button(BOPBlocks.HELLBARK_BUTTON)
                .door(BOPBlocks.HELLBARK_DOOR)
                .fence(BOPBlocks.HELLBARK_FENCE)
                .fenceGate(BOPBlocks.HELLBARK_FENCE_GATE)
                .pressurePlate(BOPBlocks.HELLBARK_PRESSURE_PLATE)
                .sign(BOPBlocks.HELLBARK_SIGN, BOPBlocks.HELLBARK_WALL_SIGN)
                .stairs(BOPBlocks.HELLBARK_STAIRS)
                .trapdoor(BOPBlocks.HELLBARK_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_HELLBARK_SHINGLES)
                .getFamily();

        BOP_JACARANDA_PLANKS = familyBuilder(BOPBlocks.JACARANDA_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_JACARANDA)
                .button(BOPBlocks.JACARANDA_BUTTON)
                .door(BOPBlocks.JACARANDA_DOOR)
                .fence(BOPBlocks.JACARANDA_FENCE)
                .fenceGate(BOPBlocks.JACARANDA_FENCE_GATE)
                .pressurePlate(BOPBlocks.JACARANDA_PRESSURE_PLATE)
                .sign(BOPBlocks.JACARANDA_SIGN, BOPBlocks.JACARANDA_WALL_SIGN)
                .stairs(BOPBlocks.JACARANDA_STAIRS)
                .trapdoor(BOPBlocks.JACARANDA_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_JACARANDA_SHINGLES)
                .getFamily();

        BOP_MAGIC_PLANKS = familyBuilder(BOPBlocks.MAGIC_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_MAGIC)
                .button(BOPBlocks.MAGIC_BUTTON)
                .door(BOPBlocks.MAGIC_DOOR)
                .fence(BOPBlocks.MAGIC_FENCE)
                .fenceGate(BOPBlocks.MAGIC_FENCE_GATE)
                .pressurePlate(BOPBlocks.MAGIC_PRESSURE_PLATE)
                .sign(BOPBlocks.MAGIC_SIGN, BOPBlocks.MAGIC_WALL_SIGN)
                .stairs(BOPBlocks.MAGIC_STAIRS)
                .trapdoor(BOPBlocks.MAGIC_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_MAGIC_SHINGLES)
                .getFamily();

        BOP_MAHOGANY_PLANKS = familyBuilder(BOPBlocks.MAHOGANY_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_MAHOGANY)
                .button(BOPBlocks.MAHOGANY_BUTTON)
                .door(BOPBlocks.MAHOGANY_DOOR)
                .fence(BOPBlocks.MAHOGANY_FENCE)
                .fenceGate(BOPBlocks.MAHOGANY_FENCE_GATE)
                .pressurePlate(BOPBlocks.MAHOGANY_PRESSURE_PLATE)
                .sign(BOPBlocks.MAHOGANY_SIGN, BOPBlocks.MAHOGANY_WALL_SIGN)
                .stairs(BOPBlocks.MAHOGANY_STAIRS)
                .trapdoor(BOPBlocks.MAHOGANY_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_MAHOGANY_SHINGLES)
                .getFamily();

        BOP_PALM_PLANKS = familyBuilder(BOPBlocks.PALM_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_PALM)
                .button(BOPBlocks.PALM_BUTTON)
                .door(BOPBlocks.PALM_DOOR)
                .fence(BOPBlocks.PALM_FENCE)
                .fenceGate(BOPBlocks.PALM_FENCE_GATE)
                .pressurePlate(BOPBlocks.PALM_PRESSURE_PLATE)
                .sign(BOPBlocks.PALM_SIGN, BOPBlocks.PALM_WALL_SIGN)
                .stairs(BOPBlocks.PALM_STAIRS)
                .trapdoor(BOPBlocks.PALM_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_PALM_SHINGLES)
                .getFamily();

        BOP_REDWOOD_PLANKS = familyBuilder(BOPBlocks.REDWOOD_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_REDWOOD)
                .button(BOPBlocks.REDWOOD_BUTTON)
                .door(BOPBlocks.REDWOOD_DOOR)
                .fence(BOPBlocks.REDWOOD_FENCE)
                .fenceGate(BOPBlocks.REDWOOD_FENCE_GATE)
                .pressurePlate(BOPBlocks.REDWOOD_PRESSURE_PLATE)
                .sign(BOPBlocks.REDWOOD_SIGN, BOPBlocks.REDWOOD_WALL_SIGN)
                .stairs(BOPBlocks.REDWOOD_STAIRS)
                .trapdoor(BOPBlocks.REDWOOD_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_REDWOOD_SHINGLES)
                .getFamily();

        BOP_UMBRAN_PLANKS = familyBuilder(BOPBlocks.UMBRAN_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_UMBRAN)
                .button(BOPBlocks.UMBRAN_BUTTON)
                .door(BOPBlocks.UMBRAN_DOOR)
                .fence(BOPBlocks.UMBRAN_FENCE)
                .fenceGate(BOPBlocks.UMBRAN_FENCE_GATE)
                .pressurePlate(BOPBlocks.UMBRAN_PRESSURE_PLATE)
                .sign(BOPBlocks.UMBRAN_SIGN, BOPBlocks.UMBRAN_WALL_SIGN)
                .stairs(BOPBlocks.UMBRAN_STAIRS)
                .trapdoor(BOPBlocks.UMBRAN_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_UMBRAN_SHINGLES)
                .getFamily();

        BOP_WILLOW_PLANKS = familyBuilder(BOPBlocks.WILLOW_PLANKS)
                .fromManager(BiomesOPlentyBlocks.BOP_WILLOW)
                .button(BOPBlocks.WILLOW_BUTTON)
                .door(BOPBlocks.WILLOW_DOOR)
                .fence(BOPBlocks.WILLOW_FENCE)
                .fenceGate(BOPBlocks.WILLOW_FENCE_GATE)
                .pressurePlate(BOPBlocks.WILLOW_PRESSURE_PLATE)
                .sign(BOPBlocks.WILLOW_SIGN, BOPBlocks.WILLOW_WALL_SIGN)
                .stairs(BOPBlocks.WILLOW_STAIRS)
                .trapdoor(BOPBlocks.WILLOW_TRAPDOOR)
                .fromManager(BiomesOPlentyBlocks.BOP_WILLOW_SHINGLES)
                .getFamily();

        BOP_STRIPPED_DEAD_WOOD = familyBuilder(BOPBlocks.STRIPPED_DEAD_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_DEAD)
                .getFamily();

        BOP_STRIPPED_FIR_WOOD = familyBuilder(BOPBlocks.STRIPPED_FIR_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_FIR)
                .getFamily();

//    public static ModBlockFamily BOP_STRIPPED_MAPLE_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAPLE_WOOD)
//            .fromManager(BiomesOPlentyBlocks.STRIPPED_MAPLE)
//            .getFamily();

//    public static ModBlockFamily BOP_STRIPPED_PINE_WOOD = familyBuilder(BOPBlocks.STRIPPED_PINE_WOOD)
//            .fromManager(BiomesOPlentyBlocks.STRIPPED_PINE)
//            .getFamily();

        BOP_STRIPPED_HELLBARK_WOOD = familyBuilder(BOPBlocks.STRIPPED_HELLBARK_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_HELLBARK)
                .getFamily();

        BOP_STRIPPED_JACARANDA_WOOD = familyBuilder(BOPBlocks.STRIPPED_JACARANDA_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_JACARANDA)
                .getFamily();
        BOP_STRIPPED_MAGIC_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAGIC_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_MAGIC)
                .getFamily();

        BOP_STRIPPED_MAHOGANY_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAHOGANY_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_MAHOGANY)
                .getFamily();

        BOP_STRIPPED_PALM_WOOD = familyBuilder(BOPBlocks.STRIPPED_PALM_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_PALM)
                .getFamily();

        BOP_STRIPPED_REDWOOD_WOOD = familyBuilder(BOPBlocks.STRIPPED_REDWOOD_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_REDWOOD)
                .getFamily();

        BOP_STRIPPED_UMBRAN_WOOD = familyBuilder(BOPBlocks.STRIPPED_UMBRAN_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_UMBRAN)
                .getFamily();

        BOP_STRIPPED_WILLOW_WOOD = familyBuilder(BOPBlocks.STRIPPED_WILLOW_WOOD)
                .fromManager(BiomesOPlentyBlocks.BOP_STRIPPED_WILLOW)
                .getFamily();
    }
}
