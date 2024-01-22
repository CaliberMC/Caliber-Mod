package com.calibermc.caliber.block.management;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.properties.BlockProps;
import com.calibermc.caliberlib.block.management.CaliberBlockHelper;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.caliberlib.block.management.BlockManager;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.*;
import java.util.function.Supplier;

/**
 * Created to reduce the code in ModBlocks, for optimization and easier register of complex blocks
 */
public class CaliberBlockManager {
    
    public static BlockManager register(String name, BlockBehaviour.Properties properties, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, ModBlocks.BLOCKS, properties, () -> Blocks.AIR, variants).registerBlockFunc(ModBlocks::registerBlock).build();
    }

    public static BlockManager registerStoneWithLoot(String name, Supplier<Block> cobblestone) {
        Collection<ModBlockFamily.Variant> variants = CaliberBlockHelper.modifyList(CaliberBlockHelper.STONE_VARIANTS, (c) -> c.addAll(Arrays.asList(ModBlockFamily.Variant.BASE, ModBlockFamily.Variant.BUTTON, ModBlockFamily.Variant.PRESSURE_PLATE)));
        BlockManager.Builder builder = new BlockManager.Builder(name, ModBlocks.BLOCKS);
        Supplier<Block> baseBlock = () -> new Block(BlockProps.LIMESTONE.get());
        builder.addVariant(ModBlockFamily.Variant.BASE, baseBlock, (additional) ->
                additional.lootGen((loot, b) -> loot.add(b, (block) ->
                        loot.createSingleItemTableWithSilkTouch(block, cobblestone.get()))));
        BlockManager.addDefaultVariants(builder, BlockProps.LIMESTONE.get(), baseBlock, variants);
        return builder.registerBlockFunc(ModBlocks::registerBlock).build();
    }

    public static BlockManager registerOneBlock(String name, Supplier<Block> block) {
        return BlockManager.registerOneBlock(name, ModBlocks.BLOCKS, block).registerBlockFunc(ModBlocks::registerBlock).build();
    }

    public static BlockManager register(String name, BlockBehaviour.Properties properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, ModBlocks.BLOCKS, properties, blockSupplier, variants).registerBlockFunc(ModBlocks::registerBlock).build();
    }
}
