package com.calibermc.caliber.compat.block;

import com.calibermc.caliberlib.data.ModBlockFamily;
import com.simibubi.create.content.decoration.palettes.*;
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

import java.util.*;
import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;

public class CreateBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "create");

    public static final ArrayList<BlockManager> CREATE_MANAGERS = new ArrayList<>();
    
    static {
        registerManagersFor("andesite", () -> BlockBehaviour.Properties.copy(Blocks.ANDESITE), AllPaletteStoneTypes.ANDESITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("asurine", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), AllPaletteStoneTypes.ASURINE, STONE_VARIANTS);
        registerManagersFor("calcite", () -> BlockBehaviour.Properties.copy(Blocks.CALCITE), AllPaletteStoneTypes.CALCITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("crimsite", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), AllPaletteStoneTypes.CRIMSITE, STONE_VARIANTS);
        registerManagersFor("deepslate", () -> BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), AllPaletteStoneTypes.DEEPSLATE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("diorite", () -> BlockBehaviour.Properties.copy(Blocks.DIORITE), AllPaletteStoneTypes.DIORITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("dripstone", () -> BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK), AllPaletteStoneTypes.DRIPSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("granite", () -> BlockBehaviour.Properties.copy(Blocks.GRANITE), AllPaletteStoneTypes.GRANITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("limestone", () -> BlockBehaviour.Properties.copy(Blocks.SANDSTONE), AllPaletteStoneTypes.LIMESTONE, STONE_VARIANTS);
        registerManagersFor("ochrum", () -> BlockBehaviour.Properties.copy(Blocks.CALCITE), AllPaletteStoneTypes.OCHRUM, STONE_VARIANTS);
        registerManagersFor("scoria", () -> BlockBehaviour.Properties.copy(Blocks.BLACKSTONE), AllPaletteStoneTypes.SCORIA, STONE_VARIANTS);
        registerManagersFor("scorchia", () -> BlockBehaviour.Properties.copy(Blocks.BLACKSTONE), AllPaletteStoneTypes.SCORCHIA, STONE_VARIANTS);
        registerManagersFor("tuff", () -> BlockBehaviour.Properties.copy(Blocks.TUFF), AllPaletteStoneTypes.TUFF, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
        registerManagersFor("veridium", () -> BlockBehaviour.Properties.copy(Blocks.TUFF), AllPaletteStoneTypes.VERIDIUM, STONE_VARIANTS);
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
            CREATE_MANAGERS.add(CaliberBlockManager.registerCreate("%s".formatted(s), properties, () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("create", finalS)), variants));
        }
    }

    public static void printBlockCounts() {
        System.out.println("Caliber Mod registered " + blockCount + " new Create blocks.");
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

