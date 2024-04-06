package com.calibermc.caliber.block.compat;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliber.item.compat.RegionsUnexploredItems;
import com.calibermc.caliberlib.block.management.BlockManager;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;

public class BiomesOPlentyBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "biomesoplenty");

    /* Stone */
    public static final BlockManager BOP_BLACK_SANDSTONE = CaliberBlockManager.registerBOP("bop_black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SANDSTONE.get()), () -> BOPBlocks.BLACK_SANDSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_BRIMSTONE = CaliberBlockManager.registerBOP("bop_brimstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.BRIMSTONE.get()), () -> BOPBlocks.BRIMSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_BRIMSTONE_BRICK = CaliberBlockManager.registerBOP("bop_brimstone_bricks", () -> BlockBehaviour.Properties.copy(BOPBlocks.BRIMSTONE_BRICKS.get()), () -> BOPBlocks.BRIMSTONE_BRICKS.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_CHISELED_BLACK_SANDSTONE = CaliberBlockManager.registerBOP("bop_chiseled_black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_BLACK_SANDSTONE.get()), () -> BOPBlocks.CHISELED_BLACK_SANDSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_CHISELED_BRIMSTONE_BRICK = CaliberBlockManager.registerBOP("bop_chiseled_brimstone_bricks", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_BRIMSTONE_BRICKS.get()), () -> BOPBlocks.CHISELED_BRIMSTONE_BRICKS.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_CHISELED_ORANGE_SANDSTONE = CaliberBlockManager.registerBOP("bop_chiseled_orange_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_ORANGE_SANDSTONE.get()), () -> BOPBlocks.CHISELED_ORANGE_SANDSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_CHISELED_WHITE_SANDSTONE = CaliberBlockManager.registerBOP("bop_chiseled_white_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_WHITE_SANDSTONE.get()), () -> BOPBlocks.CHISELED_WHITE_SANDSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_CUT_BLACK_SANDSTONE = CaliberBlockManager.registerBOP("bop_cut_black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_BLACK_SANDSTONE.get()), () -> BOPBlocks.CUT_BLACK_SANDSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_CUT_ORANGE_SANDSTONE = CaliberBlockManager.registerBOP("bop_cut_orange_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_ORANGE_SANDSTONE.get()), () -> BOPBlocks.CUT_ORANGE_SANDSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BOP_CUT_WHITE_SANDSTONE = CaliberBlockManager.registerBOP("bop_cut_white_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE.get()), () -> BOPBlocks.CUT_WHITE_SANDSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Planks */
    public static final BlockManager BOP_DEAD = CaliberBlockManager.registerBOP("bop_dead_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS.get()), () -> BOPBlocks.DEAD_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_FIR = CaliberBlockManager.registerBOP("bop_fir_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS.get()), () -> BOPBlocks.FIR_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_HELLBARK = CaliberBlockManager.registerBOP("bop_hellbark_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS.get()), () -> BOPBlocks.HELLBARK_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_JACARANDA = CaliberBlockManager.registerBOP("bop_jacaranda_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS.get()), () -> BOPBlocks.JACARANDA_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_MAGIC = CaliberBlockManager.registerBOP("bop_magic_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS.get()), () -> BOPBlocks.MAGIC_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_MAHOGANY = CaliberBlockManager.registerBOP("bop_mahogany_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS.get()), () -> BOPBlocks.MAHOGANY_PLANKS.get(), VANILLA_PLANK_VARIANTS);
//    public static final BlockManager BOP_MAPLE = CaliberBlockManager.registerBOP("bop_maple_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAPLE_PLANKS.get()), () -> BOPBlocks.MAPLE_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_BOP_PALM = CaliberBlockManager.registerBOP("bop_palm_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS.get()), () -> BOPBlocks.PALM_PLANKS.get(), VANILLA_PLANK_VARIANTS);
//    public static final BlockManager BOP_PINE = CaliberBlockManager.registerBOP("bop_pine_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.PINE_PLANKS.get()), () -> BOPBlocks.PINE_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_REDWOOD = CaliberBlockManager.registerBOP("bop_redwood_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS.get()), () -> BOPBlocks.REDWOOD_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_UMBRAN = CaliberBlockManager.registerBOP("bop_umbran_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS.get()), () -> BOPBlocks.UMBRAN_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager BOP_WILLOW = CaliberBlockManager.registerBOP("bop_willow_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS.get()), () -> BOPBlocks.WILLOW_PLANKS.get(), VANILLA_PLANK_VARIANTS);

    /* Stripped Wood */
    public static final BlockManager BOP_STRIPPED_DEAD = CaliberBlockManager.registerBOP("bop_stripped_dead_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_DEAD_WOOD.get()), () -> BOPBlocks.STRIPPED_DEAD_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_FIR = CaliberBlockManager.registerBOP("bop_stripped_fir_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_FIR_WOOD.get()), () -> BOPBlocks.STRIPPED_FIR_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_HELLBARK = CaliberBlockManager.registerBOP("bop_stripped_hellbark_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_HELLBARK_WOOD.get()), () -> BOPBlocks.STRIPPED_HELLBARK_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_JACARANDA = CaliberBlockManager.registerBOP("bop_stripped_jacaranda_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_JACARANDA_WOOD.get()), () -> BOPBlocks.STRIPPED_JACARANDA_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_MAGIC = CaliberBlockManager.registerBOP("bop_stripped_magic_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAGIC_WOOD.get()), () -> BOPBlocks.STRIPPED_MAGIC_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_MAHOGANY = CaliberBlockManager.registerBOP("bop_stripped_mahogany_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAHOGANY_WOOD.get()), () -> BOPBlocks.STRIPPED_MAHOGANY_WOOD.get(), STRIPPED_WOOD_VARIANTS);
//    public static final BlockManager BOP_STRIPPED_MAPLE = CaliberBlockManager.registerBOP("bop_stripped_maple_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAPLE_WOOD.get()), () -> BOPBlocks.STRIPPED_MAPLE_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_PALM = CaliberBlockManager.registerBOP("bop_stripped_palm_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_PALM_WOOD.get()), () -> BOPBlocks.STRIPPED_PALM_WOOD.get(), STRIPPED_WOOD_VARIANTS);
//    public static final BlockManager BOP_STRIPPED_PINE = CaliberBlockManager.registerBOP("bop_stripped_pine_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_PINE_WOOD.get()), () -> BOPBlocks.STRIPPED_PINE_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_REDWOOD = CaliberBlockManager.registerBOP("bop_stripped_redwood_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_REDWOOD_WOOD.get()), () -> BOPBlocks.STRIPPED_REDWOOD_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_UMBRAN = CaliberBlockManager.registerBOP("bop_stripped_umbran_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_UMBRAN_WOOD.get()), () -> BOPBlocks.STRIPPED_UMBRAN_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager BOP_STRIPPED_WILLOW = CaliberBlockManager.registerBOP("bop_stripped_willow_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_WILLOW_WOOD.get()), () -> BOPBlocks.STRIPPED_WILLOW_WOOD.get(), STRIPPED_WOOD_VARIANTS);


    public static void printBlockCounts() {
        System.out.println("Biomes O Plenty blocks registered: " + blockCount);
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
        RegionsUnexploredItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

