package com.calibermc.caliber.compat.block;

import com.calibermc.caliberlib.block.management.BlockManager;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

import java.util.*;
import java.util.function.Supplier;

import static com.calibermc.caliber.compat.block.properties.ChippedPath.extractChippedPath;
import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;
import static com.calibermc.caliber.block.CaliberBlocks.COMPAT_PLANK_VARIANTS;

public class ChippedBlocks {
    private static int blockCount = 0;

    public static final ArrayList<BlockManager> CHIPPED_MANAGERS = new ArrayList<>();

    @ExpectPlatform
    public static void init() {
    }

    public static void printBlockCounts() {
        System.out.println("Caliber Mod registered " + blockCount + " new Chipped blocks.");
    }

    private static <T extends Block> RegSupplier<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return RegHelper.registerBlock(new ResourceLocation("chipped", name), block);
    }

    public static <T extends Block> RegSupplier<T> registerBlock(String name, Supplier<T> block) {
        RegSupplier<T> toReturn = RegHelper.registerBlockWithItem(new ResourceLocation("chipped", name), block);
        blockCount++;
        return toReturn;
    }
}

