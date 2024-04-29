package com.calibermc.caliber.compat.data;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliber.compat.block.CreateBlocks;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.google.common.collect.Maps;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Stream;

public class CreateBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();


    // TODO: Add existing blocks (stairs, slab, wall) to the families
    static {
        for (BlockManager createManager : CreateBlocks.CREATE_MANAGERS) {
//            BlockManager.BlockAdditional Stairs = createManager.getByVariant(ModBlockFamily.Variant.STAIRS);
            familyBuilder(createManager.baseBlock()).fromManager(createManager).getFamily();
        }
    }



    public static ModBlockFamily.Builder familyBuilder(Block pBaseBlock) {
        ModBlockFamily.Builder modBlockFamily$builder = new ModBlockFamily.Builder(pBaseBlock);
        ModBlockFamily modBlockFamily = MAP.put(pBaseBlock, modBlockFamily$builder.getFamily());
        if (modBlockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + ForgeRegistries.BLOCKS.getKey(pBaseBlock));
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

