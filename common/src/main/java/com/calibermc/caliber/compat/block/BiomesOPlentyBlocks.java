package com.calibermc.caliber.compat.block;

import com.calibermc.caliberlib.block.management.BlockManager;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;
import static com.calibermc.caliber.block.CaliberBlocks.COMPAT_PLANK_VARIANTS;

public class BiomesOPlentyBlocks {
    private static int blockCount = 0;

    /* Stone */
    public static BlockManager BOP_BLACK_SANDSTONE;
    public static BlockManager BOP_BRIMSTONE;
    public static BlockManager BOP_BRIMSTONE_BRICK;
    public static BlockManager BOP_CHISELED_BLACK_SANDSTONE;
    public static BlockManager BOP_CHISELED_BRIMSTONE_BRICK;
    public static BlockManager BOP_CHISELED_ORANGE_SANDSTONE;
    public static BlockManager BOP_CHISELED_WHITE_SANDSTONE;
    public static BlockManager BOP_CUT_BLACK_SANDSTONE;
    public static BlockManager BOP_CUT_ORANGE_SANDSTONE;
    public static BlockManager BOP_CUT_WHITE_SANDSTONE;
    public static BlockManager BOP_SMOOTH_BLACK_SANDSTONE;
    public static BlockManager BOP_SMOOTH_ORANGE_SANDSTONE;
    public static BlockManager BOP_SMOOTH_WHITE_SANDSTONE;

    /* Planks */
    public static BlockManager BOP_DEAD;
    public static BlockManager BOP_FIR;
    public static BlockManager BOP_HELLBARK;
    public static BlockManager BOP_JACARANDA;
    public static BlockManager BOP_MAGIC;
    public static BlockManager BOP_MAHOGANY;
    public static BlockManager BOP_PALM;
    public static BlockManager BOP_REDWOOD;
    public static BlockManager BOP_UMBRAN;
    public static BlockManager BOP_WILLOW;

    /* Shingles */
    public static BlockManager BOP_DEAD_SHINGLES;
    public static BlockManager BOP_FIR_SHINGLES;
    public static BlockManager BOP_HELLBARK_SHINGLES;
    public static BlockManager BOP_JACARANDA_SHINGLES;
    public static BlockManager BOP_MAGIC_SHINGLES;
    public static BlockManager BOP_MAHOGANY_SHINGLES;
    public static BlockManager BOP_PALM_SHINGLES;
    public static BlockManager BOP_REDWOOD_SHINGLES;
    public static BlockManager BOP_UMBRAN_SHINGLES;
    public static BlockManager BOP_WILLOW_SHINGLES;

    /* Stripped Wood */
    public static BlockManager BOP_STRIPPED_DEAD;
    public static BlockManager BOP_STRIPPED_FIR;
    public static BlockManager BOP_STRIPPED_HELLBARK;
    public static BlockManager BOP_STRIPPED_JACARANDA;
    public static BlockManager BOP_STRIPPED_MAGIC;
    public static BlockManager BOP_STRIPPED_MAHOGANY;
    public static BlockManager BOP_STRIPPED_PALM;
    public static BlockManager BOP_STRIPPED_REDWOOD;
    public static BlockManager BOP_STRIPPED_UMBRAN;
    public static BlockManager BOP_STRIPPED_WILLOW;

    public static void printBlockCounts() {
        System.out.println("Caliber Mod registered " + blockCount + " new Biomes O' Plenty blocks.");
    }

    private static <T extends Block> RegSupplier<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return RegHelper.registerBlock(new ResourceLocation("biomesoplenty", name), block);
    }

    public static <T extends Block> RegSupplier<T> registerBlock(String name, Supplier<T> block) {
        RegSupplier<T> toReturn = RegHelper.registerBlockWithItem(new ResourceLocation("biomesoplenty", name), block);
        blockCount++;
        return toReturn;
    }

    @ExpectPlatform
    public static void init() {
    }
}

