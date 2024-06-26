package com.calibermc.caliber.compat.data;

import com.calibermc.caliber.compat.block.ChippedBlocks;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.google.common.collect.Maps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Stream;

public class ChippedBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();

    static {
        for (BlockManager chippedManager : ChippedBlocks.CHIPPED_MANAGERS) {
            ModBlockFamily.Builder builder = familyBuilder(chippedManager.baseBlock()).fromManager(chippedManager);
            String name = chippedManager.getName();

//            if (!name.contains("block") && !name.contains("layered") && !name.contains("pillar")) {
//                if (name.contains("bricks")) {
//                    name = name.replace("bricks", "brick");
//                }
//                builder.slab(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("chipped", name + "_slab")));
//                builder.stairs(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("chipped", name + "_stairs")));
//                builder.wall(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("chipped", name + "_wall")));
//            }
            builder.getFamily();
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

