package com.calibermc.caliber.compat.block;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.decoration.palettes.*;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliber.compat.item.CreateItems;
import com.calibermc.caliberlib.block.management.BlockManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;

public class CreateBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "create");

//    List&lt;Block&gt; block = ForgeRegistries.BLOCKS.getValues().stream().filter(value -&gt; ForgeRegistries.BLOCKS.getKey(value).getNamespace().equals("create")).toList();
    /* Stone */

    public static final Block CUT_ASURINE;

    static {
        CUT_ASURINE = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_asurine"));
    }

    /* Natural Stone */
    public static final BlockManager CREATE_ASURINE = CaliberBlockManager.registerCreate("asurine_block", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), () -> AllPaletteStoneTypes.ASURINE.baseBlock.get(), STONE_VARIANTS);
    public static final BlockManager CREATE_CRIMSITE = CaliberBlockManager.registerCreate("crimsite_block", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), () -> AllPaletteStoneTypes.CRIMSITE.baseBlock.get(), STONE_VARIANTS);
    public static final BlockManager CREATE_LIMESTONE = CaliberBlockManager.registerCreate("limestone_block", () -> BlockBehaviour.Properties.copy(Blocks.SANDSTONE), () -> AllPaletteStoneTypes.LIMESTONE.baseBlock.get(), STONE_VARIANTS);
    public static final BlockManager CREATE_OCHRUM = CaliberBlockManager.registerCreate("ochrum_block", () -> BlockBehaviour.Properties.copy(Blocks.CALCITE), () -> AllPaletteStoneTypes.OCHRUM.baseBlock.get(), STONE_VARIANTS);
    public static final BlockManager CREATE_SCORIA = CaliberBlockManager.registerCreate("scoria_block", () -> BlockBehaviour.Properties.copy(Blocks.BLACKSTONE), () -> AllPaletteStoneTypes.SCORIA.baseBlock.get(), STONE_VARIANTS);
    public static final BlockManager CREATE_SCORCHIA = CaliberBlockManager.registerCreate("scorchia_block", () -> BlockBehaviour.Properties.copy(Blocks.BLACKSTONE), () -> AllPaletteStoneTypes.SCORCHIA.baseBlock.get(), STONE_VARIANTS);
    public static final BlockManager CREATE_VERIDIUM = CaliberBlockManager.registerCreate("veridium_block", () -> BlockBehaviour.Properties.copy(Blocks.TUFF), () -> AllPaletteStoneTypes.VERIDIUM.baseBlock.get(), STONE_VARIANTS);

    /* Cut Stone */
//    public static final BlockManager CREATE_CUT_ASURINE = CaliberBlockManager.registerCreate("cut_asurine", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), () -> CUT_ASURINE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);


//    public static final BlockManager CREATE_CUT_ASURINE = CaliberBlockManager.registerCreate("cut_asurine", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), () -> Arrays.stream(AllPaletteStoneTypes.ASURINE.variantTypes).filter(v -> v.equals(PaletteBlockPartial.CUT)), STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);


//    public static final BlockManager CREATE_CUT_ASURINE = CaliberBlockManager.registerCreate("cut_asurine", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), () -> Arrays.stream(AllPaletteStoneTypes.ASURINE.variantTypes)
//            .filter (v -> v.getTexture(paletteStoneVariants.name("cut_asurine")).get()), STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);


    /* Cut Bricks */

    /* Layered Stone */

    /* Pillar Stone */

    /* Polished Cut Stone */

    /* Small Bricks */

    public static void printBlockCounts() {
        System.out.println("Create blocks registered: " + blockCount);
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        blockCount++;
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        CreateItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

