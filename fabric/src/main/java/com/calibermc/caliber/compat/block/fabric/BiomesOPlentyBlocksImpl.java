package com.calibermc.caliber.compat.block.fabric;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliber.block.management.CaliberBlockManager;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static com.calibermc.caliber.compat.block.BiomesOPlentyBlocks.*;
import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;
import static com.calibermc.caliberlib.block.management.ModBlockHelper.STRIPPED_WOOD_VARIANTS;

public class BiomesOPlentyBlocksImpl {
    public static void init() {
        /* Stone */
        BOP_BLACK_SANDSTONE = CaliberBlockManager.registerBOP("black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SANDSTONE), () -> BOPBlocks.BLACK_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        BOP_BRIMSTONE = CaliberBlockManager.registerBOP("brimstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.BRIMSTONE), () -> BOPBlocks.BRIMSTONE, STONE_VARIANTS);
        BOP_BRIMSTONE_BRICK = CaliberBlockManager.registerBOP("brimstone_bricks", () -> BlockBehaviour.Properties.copy(BOPBlocks.BRIMSTONE_BRICKS), () -> BOPBlocks.BRIMSTONE_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        BOP_CHISELED_BLACK_SANDSTONE = CaliberBlockManager.registerBOP("chiseled_black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_BLACK_SANDSTONE), () -> BOPBlocks.CHISELED_BLACK_SANDSTONE, STONE_VARIANTS);
        BOP_CHISELED_BRIMSTONE_BRICK = CaliberBlockManager.registerBOP("chiseled_brimstone_bricks", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_BRIMSTONE_BRICKS), () -> BOPBlocks.CHISELED_BRIMSTONE_BRICKS, STONE_VARIANTS);
        BOP_CHISELED_ORANGE_SANDSTONE = CaliberBlockManager.registerBOP("chiseled_orange_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_ORANGE_SANDSTONE), () -> BOPBlocks.CHISELED_ORANGE_SANDSTONE, STONE_VARIANTS);
        BOP_CHISELED_WHITE_SANDSTONE = CaliberBlockManager.registerBOP("chiseled_white_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_WHITE_SANDSTONE), () -> BOPBlocks.CHISELED_WHITE_SANDSTONE, STONE_VARIANTS);
        BOP_CUT_BLACK_SANDSTONE = CaliberBlockManager.registerBOP("cut_black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_BLACK_SANDSTONE), () -> BOPBlocks.CUT_BLACK_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB);
        BOP_CUT_ORANGE_SANDSTONE = CaliberBlockManager.registerBOP("cut_orange_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_ORANGE_SANDSTONE), () -> BOPBlocks.CUT_ORANGE_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB);
        BOP_CUT_WHITE_SANDSTONE = CaliberBlockManager.registerBOP("cut_white_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE), () -> BOPBlocks.CUT_WHITE_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB);
        BOP_SMOOTH_BLACK_SANDSTONE = CaliberBlockManager.registerBOP("smooth_black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_BLACK_SANDSTONE), () -> BOPBlocks.SMOOTH_BLACK_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
        BOP_SMOOTH_ORANGE_SANDSTONE = CaliberBlockManager.registerBOP("smooth_orange_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_ORANGE_SANDSTONE), () -> BOPBlocks.SMOOTH_ORANGE_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
        BOP_SMOOTH_WHITE_SANDSTONE = CaliberBlockManager.registerBOP("smooth_white_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE), () -> BOPBlocks.SMOOTH_WHITE_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);

        /* Planks */
        BOP_DEAD = CaliberBlockManager.registerBOP("dead_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS), () -> BOPBlocks.DEAD_PLANKS, PLANK_VARIANTS);
        BOP_FIR = CaliberBlockManager.registerBOP("fir_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS), () -> BOPBlocks.FIR_PLANKS, PLANK_VARIANTS);
        BOP_HELLBARK = CaliberBlockManager.registerBOP("hellbark_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS), () -> BOPBlocks.HELLBARK_PLANKS, PLANK_VARIANTS);
        BOP_JACARANDA = CaliberBlockManager.registerBOP("jacaranda_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS), () -> BOPBlocks.JACARANDA_PLANKS, PLANK_VARIANTS);
        BOP_MAGIC = CaliberBlockManager.registerBOP("magic_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS), () -> BOPBlocks.MAGIC_PLANKS, PLANK_VARIANTS);
        BOP_MAHOGANY = CaliberBlockManager.registerBOP("mahogany_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS), () -> BOPBlocks.MAHOGANY_PLANKS, PLANK_VARIANTS);
//    BOP_MAPLE = CaliberBlockManager.registerBOP("maple_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAPLE_PLANKS), () -> BOPBlocks.MAPLE_PLANKS, PLANK_VARIANTS);
        BOP_PALM = CaliberBlockManager.registerBOP("palm_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS), () -> BOPBlocks.PALM_PLANKS, PLANK_VARIANTS);
//    BOP_PINE = CaliberBlockManager.registerBOP("pine_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.PINE_PLANKS), () -> BOPBlocks.PINE_PLANKS, PLANK_VARIANTS);
        BOP_REDWOOD = CaliberBlockManager.registerBOP("redwood_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS), () -> BOPBlocks.REDWOOD_PLANKS, PLANK_VARIANTS);
        BOP_UMBRAN = CaliberBlockManager.registerBOP("umbran_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS), () -> BOPBlocks.UMBRAN_PLANKS, PLANK_VARIANTS);
        BOP_WILLOW = CaliberBlockManager.registerBOP("willow_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS), () -> BOPBlocks.WILLOW_PLANKS, PLANK_VARIANTS);

        /* Shingles */
        BOP_DEAD_SHINGLES = CaliberBlockManager.registerBOP("dead_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS), () -> BOPBlocks.DEAD_PLANKS, ROOF_VARIANTS);
        BOP_FIR_SHINGLES = CaliberBlockManager.registerBOP("fir_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS), () -> BOPBlocks.FIR_PLANKS, ROOF_VARIANTS);
        BOP_HELLBARK_SHINGLES = CaliberBlockManager.registerBOP("hellbark_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS), () -> BOPBlocks.HELLBARK_PLANKS, ROOF_VARIANTS);
        BOP_JACARANDA_SHINGLES = CaliberBlockManager.registerBOP("jacaranda_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS), () -> BOPBlocks.JACARANDA_PLANKS, ROOF_VARIANTS);
        BOP_MAGIC_SHINGLES = CaliberBlockManager.registerBOP("magic_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS), () -> BOPBlocks.MAGIC_PLANKS, ROOF_VARIANTS);
        BOP_MAHOGANY_SHINGLES = CaliberBlockManager.registerBOP("mahogany_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS), () -> BOPBlocks.MAHOGANY_PLANKS, ROOF_VARIANTS);
        //    BOP_MAPLE_SHINGLES = CaliberBlockManager.registerBOP("maple_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAPLE_PLANKS), () -> BOPBlocks.MAPLE_PLANKS, ROOF_VARIANTS);
        BOP_PALM_SHINGLES = CaliberBlockManager.registerBOP("palm_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS), () -> BOPBlocks.PALM_PLANKS, ROOF_VARIANTS);
        //    BOP_PINE_SHINGLES = CaliberBlockManager.registerBOP("pine_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.PINE_PLANKS), () -> BOPBlocks.PINE_PLANKS, ROOF_VARIANTS);
        BOP_REDWOOD_SHINGLES = CaliberBlockManager.registerBOP("redwood_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS), () -> BOPBlocks.REDWOOD_PLANKS, ROOF_VARIANTS);
        BOP_UMBRAN_SHINGLES = CaliberBlockManager.registerBOP("umbran_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS), () -> BOPBlocks.UMBRAN_PLANKS, ROOF_VARIANTS);
        BOP_WILLOW_SHINGLES = CaliberBlockManager.registerBOP("willow_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS), () -> BOPBlocks.WILLOW_PLANKS, ROOF_VARIANTS);

        /* Stripped Wood */
        BOP_STRIPPED_DEAD = CaliberBlockManager.registerBOP("stripped_dead_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_DEAD_WOOD), () -> BOPBlocks.STRIPPED_DEAD_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_FIR = CaliberBlockManager.registerBOP("stripped_fir_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_FIR_WOOD), () -> BOPBlocks.STRIPPED_FIR_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_HELLBARK = CaliberBlockManager.registerBOP("stripped_hellbark_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_HELLBARK_WOOD), () -> BOPBlocks.STRIPPED_HELLBARK_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_JACARANDA = CaliberBlockManager.registerBOP("stripped_jacaranda_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_JACARANDA_WOOD), () -> BOPBlocks.STRIPPED_JACARANDA_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_MAGIC = CaliberBlockManager.registerBOP("stripped_magic_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAGIC_WOOD), () -> BOPBlocks.STRIPPED_MAGIC_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_MAHOGANY = CaliberBlockManager.registerBOP("stripped_mahogany_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAHOGANY_WOOD), () -> BOPBlocks.STRIPPED_MAHOGANY_WOOD, STRIPPED_WOOD_VARIANTS);
//    BOP_STRIPPED_MAPLE = CaliberBlockManager.registerBOP("stripped_maple_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAPLE_WOOD), () -> BOPBlocks.STRIPPED_MAPLE_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_PALM = CaliberBlockManager.registerBOP("stripped_palm_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_PALM_WOOD), () -> BOPBlocks.STRIPPED_PALM_WOOD, STRIPPED_WOOD_VARIANTS);
//    BOP_STRIPPED_PINE = CaliberBlockManager.registerBOP("stripped_pine_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_PINE_WOOD), () -> BOPBlocks.STRIPPED_PINE_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_REDWOOD = CaliberBlockManager.registerBOP("stripped_redwood_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_REDWOOD_WOOD), () -> BOPBlocks.STRIPPED_REDWOOD_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_UMBRAN = CaliberBlockManager.registerBOP("stripped_umbran_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_UMBRAN_WOOD), () -> BOPBlocks.STRIPPED_UMBRAN_WOOD, STRIPPED_WOOD_VARIANTS);
        BOP_STRIPPED_WILLOW = CaliberBlockManager.registerBOP("stripped_willow_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_WILLOW_WOOD), () -> BOPBlocks.STRIPPED_WILLOW_WOOD, STRIPPED_WOOD_VARIANTS);
    }
}
