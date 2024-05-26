package com.calibermc.caliber.compat.data;

import com.calibermc.caliber.compat.block.CreateBlocks;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.google.common.collect.Maps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;
import java.util.stream.Stream;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.STONE_VARIANTS;
import static com.calibermc.caliberlib.block.management.ModBlockHelper.STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL;

public class CreateBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();

    static {
        for (BlockManager createManager : CreateBlocks.CREATE_MANAGERS) {
            ModBlockFamily.Builder builder = familyBuilder(createManager.mainChild()).fromManager(createManager);
            String name = createManager.getName();

            if (!name.contains("block") && !name.contains("layered") && !name.contains("pillar")) {
                if (name.contains("bricks")) {
                    name = name.replace("bricks", "brick");
                }
                builder.slab(BuiltInRegistries.BLOCK.get(new ResourceLocation("create", name + "_slab")));
                builder.stairs(BuiltInRegistries.BLOCK.get(new ResourceLocation("create", name + "_stairs")));
                builder.wall(BuiltInRegistries.BLOCK.get(new ResourceLocation("create", name + "_wall")));
            }
            builder.getFamily();
        }
    }

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

