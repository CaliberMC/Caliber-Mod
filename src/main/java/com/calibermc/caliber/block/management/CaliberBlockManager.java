package com.calibermc.caliber.block.management;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliber.compat.block.RegionsUnexploredBlocks;
import com.calibermc.caliberlib.block.management.ModBlockHelper;
import com.calibermc.caliberlib.block.properties.BlockProps;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.caliberlib.block.management.BlockManager;
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
        return BlockManager.register(name, CaliberBlocks.BLOCKS, properties, () -> Blocks.AIR, variants).registerBlockFunc(CaliberBlocks::registerBlock).build();
    }

    public static BlockManager registerStoneWithLoot(String name, Supplier<Block> cobblestone) {
        Collection<ModBlockFamily.Variant> variants = ModBlockHelper.modifyList(ModBlockHelper.STONE_VARIANTS, (c) -> c.addAll(Arrays.asList(ModBlockFamily.Variant.BASE, ModBlockFamily.Variant.BUTTON, ModBlockFamily.Variant.PRESSURE_PLATE)));
        BlockManager.Builder builder = new BlockManager.Builder(name, CaliberBlocks.BLOCKS);
        Supplier<Block> baseBlock = () -> new Block(BlockProps.LIMESTONE.get());
        builder.addVariant(ModBlockFamily.Variant.BASE, baseBlock, (additional) ->
                additional.lootGen((loot, b) -> loot.add(b, (block) ->
                        loot.createSingleItemTableWithSilkTouch(block, cobblestone.get()))));
        BlockManager.addDefaultVariants(builder, BlockProps.LIMESTONE.get(), baseBlock, variants);
        return builder.registerBlockFunc(CaliberBlocks::registerBlock).build();
    }

    public static BlockManager registerOneBlock(String name, Supplier<Block> block) {
        return BlockManager.registerOneBlock(name, CaliberBlocks.BLOCKS, block).registerBlockFunc(CaliberBlocks::registerBlock).build();
    }

    public static BlockManager register(String name, BlockBehaviour.Properties properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, CaliberBlocks.BLOCKS, properties, blockSupplier, variants).registerBlockFunc(CaliberBlocks::registerBlock).build();
    }

    // COMPAT
    public static BlockManager registerBOP(String name, Supplier<BlockBehaviour.Properties> properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, (b) -> {
            BlockSetType.values().forEach((type) -> {
                if (name.contains(type.name())) {
                    b.type(type);
                }

            });
        }, BiomesOPlentyBlocks.BLOCKS, properties, blockSupplier, variants).registerBlockFunc(BiomesOPlentyBlocks::registerBlock).build();
    }

    public static BlockManager registerRU(String name, Supplier<BlockBehaviour.Properties> properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, (b) -> {
            BlockSetType.values().forEach((type) -> {
                if (name.contains(type.name())) {
                    b.type(type);
                }

            });
        }, RegionsUnexploredBlocks.BLOCKS, properties, blockSupplier, variants).registerBlockFunc(RegionsUnexploredBlocks::registerBlock).build();
    }

}
