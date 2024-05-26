package com.calibermc.caliber.block.management;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliber.compat.block.ChippedBlocks;
import com.calibermc.caliber.compat.block.CreateBlocks;
import com.calibermc.caliber.compat.block.RegionsUnexploredBlocks;
import com.calibermc.caliberlib.CaliberLib;
import com.calibermc.caliberlib.block.management.ModBlockHelper;
import com.calibermc.caliberlib.block.properties.BlockProps;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.caliberlib.block.management.BlockManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import java.util.*;
import java.util.function.Supplier;

/**
 * Created to reduce the code in CaliberBlocks, for optimization and easier register of complex blocks
 */
public class CaliberBlockManager {

    public static BlockManager register(String name, BlockBehaviour.Properties properties, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, Caliber.MOD_ID, properties, () -> Blocks.AIR, variants).build();
    }

    public static BlockManager registerOneBlock(String name, Supplier<Block> block, boolean skipRegister) {
        return BlockManager.registerOneBlock(name, Caliber.MOD_ID, block, skipRegister).build();
    }

    public static BlockManager register(String name, BlockBehaviour.Properties properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, Caliber.MOD_ID, properties, blockSupplier, variants).build();
    }

    // COMPAT
    public static BlockManager registerBOP(String name, Supplier<BlockBehaviour.Properties> properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, (b) -> {
            BlockSetType.values().forEach((type) -> {
                if (name.contains(type.name())) {
                    b.type(type);
                }

            });
        }, "biomesoplenty", properties, blockSupplier, variants).build();
    }

    public static BlockManager registerChipped(String name, Supplier<BlockBehaviour.Properties> properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, (b) -> {
            BlockSetType.values().forEach((type) -> {
                if (name.contains(type.name())) {
                    b.type(type);
                }

            });
        }, "chipped", properties, blockSupplier, variants).build();
    }

    public static BlockManager registerCreate(String name, Supplier<BlockBehaviour.Properties> properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, (b) -> {
            BlockSetType.values().forEach((type) -> {
                if (name.contains(type.name())) {
                    b.type(type);
                }

            });
        }, "create", properties, blockSupplier, variants).build();
    }

    public static BlockManager registerRU(String name, Supplier<BlockBehaviour.Properties> properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, (b) -> {
            BlockSetType.values().forEach((type) -> {
                if (name.contains(type.name())) {
                    b.type(type);
                }

            });
        }, "regions_unexplored", properties, blockSupplier, variants).build();
    }

}
