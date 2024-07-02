package com.calibermc.caliber.compat.block;

import com.calibermc.caliberlib.data.ModBlockFamily;
import com.simibubi.create.content.decoration.palettes.*;
import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliberlib.block.management.BlockManager;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

import java.util.*;
import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;
import static com.calibermc.caliber.block.CaliberBlocks.COMPAT_PLANK_VARIANTS;

public class CreateBlocks {
    private static int blockCount = 0;

    public static final ArrayList<BlockManager> CREATE_MANAGERS = new ArrayList<>();

    @ExpectPlatform
    public static void init() {
    }

    public static void registerManagersFor(String name, Supplier<BlockBehaviour.Properties> properties, AllPaletteStoneTypes type, Collection<ModBlockFamily.Variant> variants) {
        if (name.contains("asurine") || name.contains("crimsite") || name.contains("limestone") || name.contains("ochrum") || name.contains("scoria") || name.contains("scorchia") || name.contains("veridium")) {
            CREATE_MANAGERS.add(CaliberBlockManager.registerCreate("%s_block".formatted(name), properties, () -> type.baseBlock.get(), variants));
        }

        List<ModBlockFamily.Variant> none = new ArrayList<>();

        for (PaletteBlockPattern variantType : type.variantTypes) {
            String s = name;
            if (variantType == PaletteBlockPattern.CUT) {
                variants = STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL;
                s = "cut_" + s;
            } else if (variantType == PaletteBlockPattern.BRICKS) {
                variants = STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL;
                s = "cut_" + s + "_bricks";
            } else if (variantType == PaletteBlockPattern.SMALL_BRICKS) {
                variants = STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL;
                s = "small_" + s + "_bricks";
            } else if (variantType == PaletteBlockPattern.POLISHED) {
                variants = STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL;
                s = "polished_cut_" + s;
            } else if (variantType == PaletteBlockPattern.LAYERED) {
                variants = none;
                s = "layered_" + s;
            } else if (variantType == PaletteBlockPattern.PILLAR) {
                variants = none;
                s = s + "_pillar";
            }
            String finalS = s;
            CREATE_MANAGERS.add(CaliberBlockManager.registerCreate("%s".formatted(s), properties, () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("create", finalS)), variants));
        }
    }

    public static void printBlockCounts() {
        System.out.println("Caliber Mod registered " + blockCount + " new Create blocks.");
    }

    private static <T extends Block> RegSupplier<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return RegHelper.registerBlock(new ResourceLocation("create", name), block);
    }

    public static <T extends Block> RegSupplier<T> registerBlock(String name, Supplier<T> block) {
        RegSupplier<T> toReturn = RegHelper.registerBlockWithItem(new ResourceLocation("create", name), block);
        blockCount++;
        return toReturn;
    }
}

