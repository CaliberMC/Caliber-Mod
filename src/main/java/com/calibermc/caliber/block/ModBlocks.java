package com.calibermc.caliber.block;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.custom.*;
import com.calibermc.caliber.item.CreativeTabs;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.calibermc.caliber.item.CreativeTabs.CALIBER_TAB;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Caliber.MOD_ID);

    public static final Block.Properties GRANITE_PROPERTIES = 
            BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops();
    public static final Block.Properties LIMESTONE_PROPERTIES =
            BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops();
    public static final Block.Properties LIMESTONE_BRICK_PROPERTIES =
            BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops();
    public static final Block.Properties SMOOTH_LIMESTONE_PROPERTIES =
            BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops();
    public static final Block.Properties COBBLESTONE_PROPERTIES =
            BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops();
    public static final Block.Properties SANDSTONE_PROPERTIES =
            BlockBehaviour.Properties.of(Material.STONE).strength(0.8f).sound(SoundType.STONE).requiresCorrectToolForDrops();
    public static final Block.Properties SMOOTH_SANDSTONE_PROPERTIES =
            BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops();
    public static final Block.Properties MARBLE_PROPERTIES =
            BlockBehaviour.Properties.of(Material.STONE).strength(2.0f, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops();
    
    public static final Block.Properties PLANK_PROPERTIES =
            BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f, 3.0F).sound(SoundType.WOOD);
    public static final Block.Properties WOOD_PROPERTIES =
            BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f).sound(SoundType.WOOD);
    
    
    // METAL BLOCKS
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CALIBER_TAB);
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), CALIBER_TAB);

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CALIBER_TAB);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CALIBER_TAB);

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CALIBER_TAB);
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), CALIBER_TAB);

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CALIBER_TAB);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CALIBER_TAB);
    
    //TODO: ADD BRONZE STUFF
    //TODO: ADD STEEL STUFF

    // STONE BLOCKS

    // -- GRANITE
    public static final RegistryObject<Block> BLACK_GRANITE = registerBlock("black_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE = registerBlock("brown_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE = registerBlock("gray_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE = registerBlock("pink_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE = registerBlock("white_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_ARCH = registerBlock("black_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_ARCH = registerBlock("brown_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_ARCH = registerBlock("gray_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_ARCH = registerBlock("pink_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_ARCH = registerBlock("red_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_ARCH = registerBlock("white_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> BLACK_GRANITE_ARCH_HALF = registerBlock("black_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> BROWN_GRANITE_ARCH_HALF = registerBlock("brown_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> GRAY_GRANITE_ARCH_HALF = registerBlock("gray_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_GRANITE_ARCH_HALF = registerBlock("pink_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_GRANITE_ARCH_HALF = registerBlock("red_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> WHITE_GRANITE_ARCH_HALF = registerBlock("white_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> BLACK_GRANITE_ARCH_LARGE = registerBlock("black_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> BROWN_GRANITE_ARCH_LARGE = registerBlock("brown_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> GRAY_GRANITE_ARCH_LARGE = registerBlock("gray_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_GRANITE_ARCH_LARGE = registerBlock("pink_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_GRANITE_ARCH_LARGE = registerBlock("red_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> WHITE_GRANITE_ARCH_LARGE = registerBlock("white_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> BLACK_GRANITE_ARCH_LARGE_HALF = registerBlock("black_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> BROWN_GRANITE_ARCH_LARGE_HALF = registerBlock("brown_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> GRAY_GRANITE_ARCH_LARGE_HALF = registerBlock("gray_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_GRANITE_ARCH_LARGE_HALF = registerBlock("pink_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_GRANITE_ARCH_LARGE_HALF = registerBlock("red_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> WHITE_GRANITE_ARCH_LARGE_HALF = registerBlock("white_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_ARROWSLIT = registerBlock("black_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_ARROWSLIT = registerBlock("brown_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_ARROWSLIT = registerBlock("gray_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_ARROWSLIT = registerBlock("pink_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_ARROWSLIT = registerBlock("red_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_ARROWSLIT = registerBlock("white_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_BALUSTRADE = registerBlock("black_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_BALUSTRADE = registerBlock("brown_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_BALUSTRADE = registerBlock("gray_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_BALUSTRADE = registerBlock("pink_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_BALUSTRADE = registerBlock("red_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_BALUSTRADE = registerBlock("white_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_CAPITAL = registerBlock("black_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_CAPITAL = registerBlock("brown_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_CAPITAL = registerBlock("gray_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_CAPITAL = registerBlock("pink_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_CAPITAL = registerBlock("red_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_CAPITAL = registerBlock("white_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_CORNER = registerBlock("black_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_CORNER = registerBlock("brown_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_CORNER = registerBlock("gray_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_CORNER = registerBlock("pink_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_CORNER = registerBlock("red_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_CORNER = registerBlock("white_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_CORNER_SLAB = registerBlock("black_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_CORNER_SLAB = registerBlock("brown_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_CORNER_SLAB = registerBlock("gray_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_CORNER_SLAB = registerBlock("pink_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_CORNER_SLAB = registerBlock("red_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_CORNER_SLAB = registerBlock("white_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("black_granite_corner_slab_vertical",
        () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("brown_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("gray_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("pink_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("red_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("white_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_SLAB_VERTICAL = registerBlock("black_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_EIGHTH = registerBlock("black_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_EIGHTH = registerBlock("brown_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_EIGHTH = registerBlock("gray_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_EIGHTH = registerBlock("pink_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_EIGHTH = registerBlock("red_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_EIGHTH = registerBlock("white_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_QUARTER = registerBlock("black_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_QUARTER = registerBlock("brown_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_QUARTER = registerBlock("gray_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_QUARTER = registerBlock("pink_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_QUARTER = registerBlock("red_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_QUARTER = registerBlock("white_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_QUARTER_VERTICAL = registerBlock("black_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_QUARTER_VERTICAL = registerBlock("brown_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_QUARTER_VERTICAL = registerBlock("gray_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_QUARTER_VERTICAL = registerBlock("pink_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_QUARTER_VERTICAL = registerBlock("red_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_QUARTER_VERTICAL = registerBlock("white_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_SLAB = registerBlock("black_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_SLAB = registerBlock("brown_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_SLAB = registerBlock("gray_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_SLAB = registerBlock("pink_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_SLAB = registerBlock("white_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_SLAB_VERTICAL = registerBlock("brown_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_SLAB_VERTICAL = registerBlock("gray_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_SLAB_VERTICAL = registerBlock("pink_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_SLAB_VERTICAL = registerBlock("red_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_SLAB_VERTICAL = registerBlock("white_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_STAIRS = registerBlock("black_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_STAIRS = registerBlock("brown_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_STAIRS = registerBlock("gray_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_STAIRS = registerBlock("pink_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_STAIRS = registerBlock("white_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_WALL = registerBlock("black_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_WALL = registerBlock("brown_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_WALL = registerBlock("gray_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_WALL = registerBlock("pink_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_WALL = registerBlock("white_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_GRANITE_WINDOW = registerBlock("black_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_GRANITE_WINDOW = registerBlock("brown_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_GRANITE_WINDOW = registerBlock("gray_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_GRANITE_WINDOW = registerBlock("pink_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_GRANITE_WINDOW = registerBlock("red_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_GRANITE_WINDOW = registerBlock("white_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> BLACK_GRANITE_WINDOW_HALF = registerBlock("black_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> BROWN_GRANITE_WINDOW_HALF = registerBlock("brown_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> GRAY_GRANITE_WINDOW_HALF = registerBlock("gray_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_GRANITE_WINDOW_HALF = registerBlock("pink_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_GRANITE_WINDOW_HALF = registerBlock("red_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> WHITE_GRANITE_WINDOW_HALF = registerBlock("white_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);

    // -- GRANITE -- POLISHED
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE = registerBlock("polished_black_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE = registerBlock("polished_brown_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE = registerBlock("polished_gray_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE = registerBlock("polished_pink_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE = registerBlock("polished_white_granite",
            () -> new Block(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARCH = registerBlock("polished_black_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARCH = registerBlock("polished_brown_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARCH = registerBlock("polished_gray_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARCH = registerBlock("polished_pink_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARCH = registerBlock("polished_red_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARCH = registerBlock("polished_white_granite_arch",
            () -> new ArchBlock(GRANITE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARCH_HALF = registerBlock("polished_black_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARCH_HALF = registerBlock("polished_brown_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARCH_HALF = registerBlock("polished_gray_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARCH_HALF = registerBlock("polished_pink_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARCH_HALF = registerBlock("polished_red_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARCH_HALF = registerBlock("polished_white_granite_arch_half",
//            () -> new ArchHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARCH_LARGE = registerBlock("polished_black_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARCH_LARGE = registerBlock("polished_brown_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARCH_LARGE = registerBlock("polished_gray_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARCH_LARGE = registerBlock("polished_pink_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARCH_LARGE = registerBlock("polished_red_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARCH_LARGE = registerBlock("polished_white_granite_arch_large",
//            () -> new ArchLargeBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_black_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_brown_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_gray_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_pink_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_red_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_white_granite_arch_large_half",
//            () -> new ArchLargeHalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARROWSLIT = registerBlock("polished_black_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARROWSLIT = registerBlock("polished_brown_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARROWSLIT = registerBlock("polished_gray_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARROWSLIT = registerBlock("polished_pink_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARROWSLIT = registerBlock("polished_red_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARROWSLIT = registerBlock("polished_white_granite_arrowslit",
            () -> new ArrowSlitBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_BALUSTRADE = registerBlock("polished_black_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_BALUSTRADE = registerBlock("polished_brown_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_BALUSTRADE = registerBlock("polished_gray_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_BALUSTRADE = registerBlock("polished_pink_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_BALUSTRADE = registerBlock("polished_red_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_BALUSTRADE = registerBlock("polished_white_granite_balustrade",
            () -> new BalustradeBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_CAPITAL = registerBlock("polished_black_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_CAPITAL = registerBlock("polished_brown_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_CAPITAL = registerBlock("polished_gray_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_CAPITAL = registerBlock("polished_pink_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_CAPITAL = registerBlock("polished_red_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_CAPITAL = registerBlock("polished_white_granite_capital",
            () -> new CapitalBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_CORNER = registerBlock("polished_black_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_CORNER = registerBlock("polished_brown_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_CORNER = registerBlock("polished_gray_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_CORNER = registerBlock("polished_pink_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_CORNER = registerBlock("polished_red_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_CORNER = registerBlock("polished_white_granite_corner",
            () -> new CornerBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_CORNER_SLAB = registerBlock("polished_black_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_CORNER_SLAB = registerBlock("polished_brown_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_CORNER_SLAB = registerBlock("polished_gray_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_CORNER_SLAB = registerBlock("polished_pink_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_CORNER_SLAB = registerBlock("polished_red_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_CORNER_SLAB = registerBlock("polished_white_granite_corner_slab",
            () -> new CornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_black_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_brown_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_gray_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_pink_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_red_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_white_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_EIGHTH = registerBlock("polished_black_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_EIGHTH = registerBlock("polished_brown_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_EIGHTH = registerBlock("polished_gray_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_EIGHTH = registerBlock("polished_pink_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_EIGHTH = registerBlock("polished_red_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_EIGHTH = registerBlock("polished_white_granite_eighth",
            () -> new EighthBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_QUARTER = registerBlock("polished_black_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_QUARTER = registerBlock("polished_brown_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_QUARTER = registerBlock("polished_gray_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_QUARTER = registerBlock("polished_pink_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_QUARTER = registerBlock("polished_red_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_QUARTER = registerBlock("polished_white_granite_quarter",
            () -> new QuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_QUARTER_VERTICAL = registerBlock("polished_black_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_QUARTER_VERTICAL = registerBlock("polished_brown_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_QUARTER_VERTICAL = registerBlock("polished_gray_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_QUARTER_VERTICAL = registerBlock("polished_pink_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_QUARTER_VERTICAL = registerBlock("polished_red_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_QUARTER_VERTICAL = registerBlock("polished_white_granite_quarter_vertical",
            () -> new VerticalQuarterBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_SLAB = registerBlock("polished_black_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_SLAB = registerBlock("polished_brown_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_SLAB = registerBlock("polished_gray_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_SLAB = registerBlock("polished_pink_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_SLAB = registerBlock("polished_white_granite_slab",
            () -> new SlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_SLAB_VERTICAL = registerBlock("polished_black_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_SLAB_VERTICAL = registerBlock("polished_brown_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_SLAB_VERTICAL = registerBlock("polished_gray_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_SLAB_VERTICAL = registerBlock("polished_pink_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_SLAB_VERTICAL = registerBlock("polished_red_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_SLAB_VERTICAL = registerBlock("polished_white_granite_slab_vertical",
            () -> new VerticalSlabBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_STAIRS = registerBlock("polished_black_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BLACK_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_STAIRS = registerBlock("polished_brown_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BROWN_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_STAIRS = registerBlock("polished_gray_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GRAY_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_STAIRS = registerBlock("polished_pink_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_PINK_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_STAIRS = registerBlock("polished_white_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_WHITE_GRANITE.get().defaultBlockState(),
                    GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_WALL = registerBlock("polished_black_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_WALL = registerBlock("polished_brown_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_WALL = registerBlock("polished_gray_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_WALL = registerBlock("polished_pink_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_WALL = registerBlock("polished_red_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_WALL = registerBlock("polished_white_granite_wall",
            () -> new WallBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_WINDOW = registerBlock("polished_black_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_WINDOW = registerBlock("polished_brown_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_WINDOW = registerBlock("polished_gray_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_WINDOW = registerBlock("polished_pink_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_WINDOW = registerBlock("polished_red_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_WINDOW = registerBlock("polished_white_granite_window",
            () -> new WindowBlock(GRANITE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_WINDOW_HALF = registerBlock("polished_black_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_WINDOW_HALF = registerBlock("polished_brown_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_WINDOW_HALF = registerBlock("polished_gray_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_WINDOW_HALF = registerBlock("polished_pink_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_RED_GRANITE_WINDOW_HALF = registerBlock("polished_red_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_WINDOW_HALF = registerBlock("polished_white_granite_window_half",
//            () -> new Window_HalfBlock(GRANITE_PROPERTIES), CreativeTabs.CALIBER_TAB);


    // -- LIMESTONE
    public static final RegistryObject<Block> DARK_LIMESTONE = registerBlock("dark_limestone",
            () -> new Block(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE = registerBlock("light_limestone",
            () -> new Block(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE = registerBlock("pink_limestone",
            () -> new Block(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE = registerBlock("tan_limestone",
            () -> new Block(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_ARCH = registerBlock("dark_limestone_arch",
            () -> new ArchBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARCH = registerBlock("light_limestone_arch",
            () -> new ArchBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_ARCH = registerBlock("limestone_arch",
            () -> new ArchBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_ARCH = registerBlock("pink_limestone_arch",
            () -> new ArchBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_ARCH = registerBlock("tan_limestone_arch",
            () -> new ArchBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> DARK_LIMESTONE_ARCH_HALF = registerBlock("dark_limestone_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARCH_HALF = registerBlock("light_limestone_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIMESTONE_ARCH_HALF = registerBlock("limestone_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_LIMESTONE_ARCH_HALF = registerBlock("pink_limestone_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> TAN_LIMESTONE_ARCH_HALF = registerBlock("tan_limestone_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> DARK_LIMESTONE_ARCH_LARGE = registerBlock("dark_limestone_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARCH_LARGE = registerBlock("light_limestone_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIMESTONE_ARCH_LARGE = registerBlock("limestone_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_LIMESTONE_ARCH_LARGE = registerBlock("pink_limestone_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> TAN_LIMESTONE_ARCH_LARGE = registerBlock("tan_limestone_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> DARK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("dark_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARCH_LARGE_HALF = registerBlock("light_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIMESTONE_ARCH_LARGE_HALF = registerBlock("limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("pink_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> TAN_LIMESTONE_ARCH_LARGE_HALF = registerBlock("tan_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_ARROWSLIT = registerBlock("dark_limestone_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARROWSLIT = registerBlock("light_limestone_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_ARROWSLIT = registerBlock("limestone_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_ARROWSLIT = registerBlock("pink_limestone_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_ARROWSLIT = registerBlock("tan_limestone_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BALUSTRADE = registerBlock("dark_limestone_balustrade",
            () -> new BalustradeBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BALUSTRADE = registerBlock("light_limestone_balustrade",
            () -> new BalustradeBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BALUSTRADE = registerBlock("limestone_balustrade",
            () -> new BalustradeBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BALUSTRADE = registerBlock("pink_limestone_balustrade",
            () -> new BalustradeBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BALUSTRADE = registerBlock("tan_limestone_balustrade",
            () -> new BalustradeBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BUTTON = registerBlock("dark_limestone_button",
            () -> new StoneButtonBlock(LIMESTONE_PROPERTIES.noCollission()), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BUTTON = registerBlock("light_limestone_button",
            () -> new StoneButtonBlock(LIMESTONE_PROPERTIES.noCollission()), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BUTTON = registerBlock("pink_limestone_button",
            () -> new StoneButtonBlock(LIMESTONE_PROPERTIES.noCollission()), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BUTTON = registerBlock("tan_limestone_button",
            () -> new StoneButtonBlock(LIMESTONE_PROPERTIES.noCollission()), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_CAPITAL = registerBlock("dark_limestone_capital",
            () -> new CapitalBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_CAPITAL = registerBlock("light_limestone_capital",
            () -> new CapitalBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_CAPITAL = registerBlock("limestone_capital",
            () -> new CapitalBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_CAPITAL = registerBlock("pink_limestone_capital",
            () -> new CapitalBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_CAPITAL = registerBlock("tan_limestone_capital",
            () -> new CapitalBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_CORNER = registerBlock("dark_limestone_corner",
            () -> new CornerBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_CORNER = registerBlock("light_limestone_corner",
            () -> new CornerBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_CORNER = registerBlock("limestone_corner",
            () -> new CornerBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_CORNER = registerBlock("pink_limestone_corner",
            () -> new CornerBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_CORNER = registerBlock("tan_limestone_corner",
            () -> new CornerBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_CORNER_SLAB = registerBlock("dark_limestone_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_CORNER_SLAB = registerBlock("light_limestone_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_CORNER_SLAB = registerBlock("limestone_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_CORNER_SLAB = registerBlock("pink_limestone_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_CORNER_SLAB = registerBlock("tan_limestone_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("dark_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("light_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("pink_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("tan_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_EIGHTH = registerBlock("dark_limestone_eighth",
            () -> new EighthBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_EIGHTH = registerBlock("light_limestone_eighth",
            () -> new EighthBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_EIGHTH = registerBlock("limestone_eighth",
            () -> new EighthBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_EIGHTH = registerBlock("pink_limestone_eighth",
            () -> new EighthBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_EIGHTH = registerBlock("tan_limestone_eighth",
            () -> new EighthBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_PRESSURE_PLATE = registerBlock("dark_limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_PRESSURE_PLATE = registerBlock("light_limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_PRESSURE_PLATE = registerBlock("pink_limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_PRESSURE_PLATE = registerBlock("tan_limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_QUARTER = registerBlock("dark_limestone_quarter",
            () -> new QuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_QUARTER = registerBlock("light_limestone_quarter",
            () -> new QuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_QUARTER = registerBlock("limestone_quarter",
            () -> new QuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_QUARTER = registerBlock("pink_limestone_quarter",
            () -> new QuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_QUARTER = registerBlock("tan_limestone_quarter",
            () -> new QuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_QUARTER_VERTICAL = registerBlock("dark_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_QUARTER_VERTICAL = registerBlock("light_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_QUARTER_VERTICAL = registerBlock("limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_QUARTER_VERTICAL = registerBlock("pink_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_QUARTER_VERTICAL = registerBlock("tan_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_SLAB = registerBlock("dark_limestone_slab",
            () -> new SlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_SLAB = registerBlock("light_limestone_slab",
            () -> new SlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_SLAB = registerBlock("pink_limestone_slab",
            () -> new SlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_SLAB = registerBlock("tan_limestone_slab",
            () -> new SlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_SLAB_VERTICAL = registerBlock("dark_limestone_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_SLAB_VERTICAL = registerBlock("light_limestone_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_SLAB_VERTICAL = registerBlock("limestone_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_SLAB_VERTICAL = registerBlock("pink_limestone_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_SLAB_VERTICAL = registerBlock("tan_limestone_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_STAIRS = registerBlock("dark_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_LIMESTONE.get().defaultBlockState(),
                    LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_STAIRS = registerBlock("light_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_LIMESTONE.get().defaultBlockState(),
                    LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_STAIRS = registerBlock("pink_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_LIMESTONE.get().defaultBlockState(),
                    LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_STAIRS = registerBlock("tan_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_LIMESTONE.get().defaultBlockState(),
                    LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_WALL = registerBlock("dark_limestone_wall",
            () -> new WallBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_WALL = registerBlock("light_limestone_wall",
            () -> new WallBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock("limestone_wall",
            () -> new WallBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_WALL = registerBlock("pink_limestone_wall",
            () -> new WallBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_WALL = registerBlock("tan_limestone_wall",
            () -> new WallBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_WINDOW = registerBlock("dark_limestone_window",
            () -> new WindowBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_WINDOW = registerBlock("light_limestone_window",
            () -> new WindowBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_WINDOW = registerBlock("limestone_window",
            () -> new WindowBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_WINDOW = registerBlock("pink_limestone_window",
            () -> new WindowBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_WINDOW = registerBlock("tan_limestone_window",
            () -> new WindowBlock(LIMESTONE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> DARK_LIMESTONE_WINDOW_HALF = registerBlock("dark_limestone_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIGHT_LIMESTONE_WINDOW_HALF = registerBlock("light_limestone_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIMESTONE_WINDOW_HALF = registerBlock("limestone_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_LIMESTONE_WINDOW_HALF = registerBlock("pink_limestone_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> TAN_LIMESTONE_WINDOW_HALF = registerBlock("tan_limestone_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);


    // -- LIMESTONE -- COBBLED
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE = registerBlock("cobbled_dark_limestone",
            () -> new Block(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE = registerBlock("cobbled_light_limestone",
            () -> new Block(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE = registerBlock("cobbled_pink_limestone",
            () -> new Block(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE = registerBlock("cobbled_tan_limestone",
            () -> new Block(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARCH = registerBlock("cobbled_dark_limestone_arch",
            () -> new ArchBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARCH = registerBlock("cobbled_light_limestone_arch",
            () -> new ArchBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARCH = registerBlock("cobbled_limestone_arch",
            () -> new ArchBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARCH = registerBlock("cobbled_pink_limestone_arch",
            () -> new ArchBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARCH = registerBlock("cobbled_tan_limestone_arch",
            () -> new ArchBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARCH_HALF = registerBlock("cobbled_dark_limestone_arch_half",
//            () -> new ArchHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARCH_HALF = registerBlock("cobbled_light_limestone_arch_half",
//            () -> new ArchHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARCH_HALF = registerBlock("cobbled_limestone_arch_half",
//            () -> new ArchHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARCH_HALF = registerBlock("cobbled_pink_limestone_arch_half",
//            () -> new ArchHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARCH_HALF = registerBlock("cobbled_tan_limestone_arch_half",
//            () -> new ArchHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_dark_limestone_arch_large",
//            () -> new ArchLargeBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_light_limestone_arch_large",
//            () -> new ArchLargeBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_limestone_arch_large",
//            () -> new ArchLargeBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_pink_limestone_arch_large",
//            () -> new ArchLargeBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_tan_limestone_arch_large",
//            () -> new ArchLargeBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_dark_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_light_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_pink_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_tan_limestone_arch_large_half",
//            () -> new ArchLargeHalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARROWSLIT = registerBlock("cobbled_dark_limestone_arrowslit",
            () -> new ArrowSlitBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARROWSLIT = registerBlock("cobbled_light_limestone_arrowslit",
            () -> new ArrowSlitBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARROWSLIT = registerBlock("cobbled_limestone_arrowslit",
            () -> new ArrowSlitBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARROWSLIT = registerBlock("cobbled_pink_limestone_arrowslit",
            () -> new ArrowSlitBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARROWSLIT = registerBlock("cobbled_tan_limestone_arrowslit",
            () -> new ArrowSlitBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_BALUSTRADE = registerBlock("cobbled_dark_limestone_balustrade",
            () -> new BalustradeBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_BALUSTRADE = registerBlock("cobbled_light_limestone_balustrade",
            () -> new BalustradeBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_BALUSTRADE = registerBlock("cobbled_limestone_balustrade",
            () -> new BalustradeBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_BALUSTRADE = registerBlock("cobbled_pink_limestone_balustrade",
            () -> new BalustradeBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_BALUSTRADE = registerBlock("cobbled_tan_limestone_balustrade",
            () -> new BalustradeBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_CAPITAL = registerBlock("cobbled_dark_limestone_capital",
            () -> new CapitalBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_CAPITAL = registerBlock("cobbled_light_limestone_capital",
            () -> new CapitalBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_CAPITAL = registerBlock("cobbled_limestone_capital",
            () -> new CapitalBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_CAPITAL = registerBlock("cobbled_pink_limestone_capital",
            () -> new CapitalBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_CAPITAL = registerBlock("cobbled_tan_limestone_capital",
            () -> new CapitalBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_CORNER = registerBlock("cobbled_dark_limestone_corner",
            () -> new CornerBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_CORNER = registerBlock("cobbled_light_limestone_corner",
            () -> new CornerBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_CORNER = registerBlock("cobbled_limestone_corner",
            () -> new CornerBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_CORNER = registerBlock("cobbled_pink_limestone_corner",
            () -> new CornerBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_CORNER = registerBlock("cobbled_tan_limestone_corner",
            () -> new CornerBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_dark_limestone_corner_slab",
            () -> new CornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_light_limestone_corner_slab",
            () -> new CornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_limestone_corner_slab",
            () -> new CornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_pink_limestone_corner_slab",
            () -> new CornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_tan_limestone_corner_slab",
            () -> new CornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_dark_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_light_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_pink_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_tan_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_EIGHTH = registerBlock("cobbled_dark_limestone_eighth",
            () -> new EighthBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_EIGHTH = registerBlock("cobbled_light_limestone_eighth",
            () -> new EighthBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_EIGHTH = registerBlock("cobbled_limestone_eighth",
            () -> new EighthBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_EIGHTH = registerBlock("cobbled_pink_limestone_eighth",
            () -> new EighthBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_EIGHTH = registerBlock("cobbled_tan_limestone_eighth",
            () -> new EighthBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_QUARTER = registerBlock("cobbled_dark_limestone_quarter",
            () -> new QuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_QUARTER = registerBlock("cobbled_light_limestone_quarter",
            () -> new QuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_QUARTER = registerBlock("cobbled_limestone_quarter",
            () -> new QuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_QUARTER = registerBlock("cobbled_pink_limestone_quarter",
            () -> new QuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_QUARTER = registerBlock("cobbled_tan_limestone_quarter",
            () -> new QuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_dark_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_light_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_pink_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_tan_limestone_quarter_vertical",
            () -> new VerticalQuarterBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_SLAB = registerBlock("cobbled_dark_limestone_slab",
            () -> new SlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_SLAB = registerBlock("cobbled_light_limestone_slab",
            () -> new SlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_SLAB = registerBlock("cobbled_pink_limestone_slab",
            () -> new SlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_SLAB = registerBlock("cobbled_tan_limestone_slab",
            () -> new SlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_dark_limestone_slab_vertical",
            () -> new VerticalSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_light_limestone_slab_vertical",
            () -> new VerticalSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_limestone_slab_vertical",
            () -> new VerticalSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_pink_limestone_slab_vertical",
            () -> new VerticalSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_tan_limestone_slab_vertical",
            () -> new VerticalSlabBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_STAIRS = registerBlock("cobbled_dark_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_DARK_LIMESTONE.get().defaultBlockState(),
                    COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_STAIRS = registerBlock("cobbled_light_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_LIGHT_LIMESTONE.get().defaultBlockState(),
                    COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_STAIRS = registerBlock("cobbled_pink_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_PINK_LIMESTONE.get().defaultBlockState(),
                    COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_STAIRS = registerBlock("cobbled_tan_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_TAN_LIMESTONE.get().defaultBlockState(),
                    COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_WALL = registerBlock("cobbled_dark_limestone_wall",
            () -> new WallBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_WALL = registerBlock("cobbled_light_limestone_wall",
            () -> new WallBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_WALL = registerBlock("cobbled_pink_limestone_wall",
            () -> new WallBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_WALL = registerBlock("cobbled_tan_limestone_wall",
            () -> new WallBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_WINDOW = registerBlock("cobbled_dark_limestone_window",
            () -> new WindowBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_WINDOW = registerBlock("cobbled_light_limestone_window",
            () -> new WindowBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_LIMESTONE_WINDOW = registerBlock("cobbled_limestone_window",
            () -> new WindowBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_WINDOW = registerBlock("cobbled_pink_limestone_window",
            () -> new WindowBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_WINDOW = registerBlock("cobbled_tan_limestone_window",
            () -> new WindowBlock(COBBLESTONE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_dark_limestone_window_half",
//            () -> new Window_HalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_light_limestone_window_half",
//            () -> new Window_HalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_limestone_window_half",
//            () -> new Window_HalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_pink_limestone_window_half",
//            () -> new Window_HalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_tan_limestone_window_half",
//            () -> new Window_HalfBlock(COBBLESTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);


    // -- LIMESTONE -- BRICKS
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICKS = registerBlock("dark_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICKS = registerBlock("light_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICKS = registerBlock("pink_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICKS = registerBlock("tan_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARCH = registerBlock("dark_limestone_brick_arch",
            () -> new ArchBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARCH = registerBlock("light_limestone_brick_arch",
            () -> new ArchBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_ARCH = registerBlock("limestone_brick_arch",
            () -> new ArchBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARCH = registerBlock("pink_limestone_brick_arch",
            () -> new ArchBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARCH = registerBlock("tan_limestone_brick_arch",
            () -> new ArchBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARCH_HALF = registerBlock("dark_limestone_brick_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARCH_HALF = registerBlock("light_limestone_brick_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIMESTONE_BRICK_ARCH_HALF = registerBlock("limestone_brick_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARCH_HALF = registerBlock("pink_limestone_brick_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARCH_HALF = registerBlock("tan_limestone_brick_arch_half",
//            () -> new ArchHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("dark_limestone_brick_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("light_limestone_brick_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIMESTONE_BRICK_ARCH_LARGE = registerBlock("limestone_brick_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("pink_limestone_brick_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("tan_limestone_brick_arch_large",
//            () -> new ArchLargeBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("dark_limestone_brick_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("light_limestone_brick_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("limestone_brick_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("pink_limestone_brick_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("tan_limestone_brick_arch_large_half",
//            () -> new ArchLargeHalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARROWSLIT = registerBlock("dark_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARROWSLIT = registerBlock("light_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_ARROWSLIT = registerBlock("limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARROWSLIT = registerBlock("pink_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARROWSLIT = registerBlock("tan_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_BALUSTRADE = registerBlock("dark_limestone_brick_balustrade",
            () -> new BalustradeBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_BALUSTRADE = registerBlock("light_limestone_brick_balustrade",
            () -> new BalustradeBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_BALUSTRADE = registerBlock("limestone_brick_balustrade",
            () -> new BalustradeBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_BALUSTRADE = registerBlock("pink_limestone_brick_balustrade",
            () -> new BalustradeBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_BALUSTRADE = registerBlock("tan_limestone_brick_balustrade",
            () -> new BalustradeBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_CAPITAL = registerBlock("dark_limestone_brick_capital",
            () -> new CapitalBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_CAPITAL = registerBlock("light_limestone_brick_capital",
            () -> new CapitalBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_CAPITAL = registerBlock("limestone_brick_capital",
            () -> new CapitalBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_CAPITAL = registerBlock("pink_limestone_brick_capital",
            () -> new CapitalBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_CAPITAL = registerBlock("tan_limestone_brick_capital",
            () -> new CapitalBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_CORNER = registerBlock("dark_limestone_brick_corner",
            () -> new CornerBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_CORNER = registerBlock("light_limestone_brick_corner",
            () -> new CornerBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_CORNER = registerBlock("limestone_brick_corner",
            () -> new CornerBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_CORNER = registerBlock("pink_limestone_brick_corner",
            () -> new CornerBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_CORNER = registerBlock("tan_limestone_brick_corner",
            () -> new CornerBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("dark_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("light_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_CORNER_SLAB = registerBlock("limestone_brick_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("pink_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("tan_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("dark_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("light_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("pink_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("tan_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_EIGHTH = registerBlock("dark_limestone_brick_eighth",
            () -> new EighthBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_EIGHTH = registerBlock("light_limestone_brick_eighth",
            () -> new EighthBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_EIGHTH = registerBlock("limestone_brick_eighth",
            () -> new EighthBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_EIGHTH = registerBlock("pink_limestone_brick_eighth",
            () -> new EighthBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_EIGHTH = registerBlock("tan_limestone_brick_eighth",
            () -> new EighthBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_QUARTER = registerBlock("dark_limestone_brick_quarter",
            () -> new QuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_QUARTER = registerBlock("light_limestone_brick_quarter",
            () -> new QuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_QUARTER = registerBlock("limestone_brick_quarter",
            () -> new QuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_QUARTER = registerBlock("pink_limestone_brick_quarter",
            () -> new QuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_QUARTER = registerBlock("tan_limestone_brick_quarter",
            () -> new QuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("dark_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("light_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("limestone_brick_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("pink_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("tan_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_SLAB = registerBlock("dark_limestone_brick_slab",
            () -> new SlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_SLAB = registerBlock("light_limestone_brick_slab",
            () -> new SlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_SLAB = registerBlock("pink_limestone_brick_slab",
            () -> new SlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_SLAB = registerBlock("tan_limestone_brick_slab",
            () -> new SlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("dark_limestone_brick_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("light_limestone_brick_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("limestone_brick_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("pink_limestone_brick_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("tan_limestone_brick_slab_vertical",
            () -> new VerticalSlabBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_STAIRS = registerBlock("dark_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_LIMESTONE_BRICKS.get().defaultBlockState(),
                    LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_STAIRS = registerBlock("light_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_LIMESTONE_BRICKS.get().defaultBlockState(),
                    LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_STAIRS = registerBlock("pink_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_LIMESTONE_BRICKS.get().defaultBlockState(),
                    LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_STAIRS = registerBlock("tan_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_LIMESTONE_BRICKS.get().defaultBlockState(),
                    LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_WALL = registerBlock("dark_limestone_brick_wall",
            () -> new WallBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_WALL = registerBlock("light_limestone_brick_wall",
            () -> new WallBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_WALL = registerBlock("pink_limestone_brick_wall",
            () -> new WallBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_WALL = registerBlock("tan_limestone_brick_wall",
            () -> new WallBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_WINDOW = registerBlock("dark_limestone_brick_window",
            () -> new WindowBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_WINDOW = registerBlock("light_limestone_brick_window",
            () -> new WindowBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICK_WINDOW = registerBlock("limestone_brick_window",
            () -> new WindowBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_WINDOW = registerBlock("pink_limestone_brick_window",
            () -> new WindowBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_WINDOW = registerBlock("tan_limestone_brick_window",
            () -> new WindowBlock(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("dark_limestone_brick_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("light_limestone_brick_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> LIMESTONE_BRICK_WINDOW_HALF = registerBlock("limestone_brick_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("pink_limestone_brick_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("tan_limestone_brick_window_half",
//            () -> new Window_HalfBlock(LIMESTONE_BRICK_PROPERTIES), CreativeTabs.CALIBER_TAB);


    // -- LIMESTONE -- CRACKED BRICKS
    public static final RegistryObject<Block> CRACKED_DARK_LIMESTONE_BRICKS = registerBlock("cracked_dark_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CRACKED_LIGHT_LIMESTONE_BRICKS = registerBlock("cracked_light_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CRACKED_PINK_LIMESTONE_BRICKS = registerBlock("cracked_pink_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CRACKED_TAN_LIMESTONE_BRICKS = registerBlock("cracked_tan_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);

    // -- LIMESTONE -- CHISELED BRICKS
    public static final RegistryObject<Block> CHISELED_DARK_LIMESTONE_BRICKS = registerBlock("chiseled_dark_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CHISELED_LIGHT_LIMESTONE_BRICKS = registerBlock("chiseled_light_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CHISELED_PINK_LIMESTONE_BRICKS = registerBlock("chiseled_pink_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CHISELED_TAN_LIMESTONE_BRICKS = registerBlock("chiseled_tan_limestone_bricks",
            () -> new Block(LIMESTONE_BRICK_PROPERTIES), CALIBER_TAB);

    // -- LIMESTONE -- SMOOTH
    public static final RegistryObject<Block> SMOOTH_DARK_LIMESTONE = registerBlock("smooth_dark_limestone",
            () -> new Block(SMOOTH_LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_LIGHT_LIMESTONE = registerBlock("smooth_light_limestone",
            () -> new Block(SMOOTH_LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_PINK_LIMESTONE = registerBlock("smooth_pink_limestone",
            () -> new Block(SMOOTH_LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_TAN_LIMESTONE = registerBlock("smooth_tan_limestone",
            () -> new Block(SMOOTH_LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_DARK_LIMESTONE_SLAB = registerBlock("smooth_dark_limestone_slab",
            () -> new SlabBlock(SMOOTH_LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_LIGHT_LIMESTONE_SLAB = registerBlock("smooth_light_limestone_slab",
            () -> new SlabBlock(SMOOTH_LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_PINK_LIMESTONE_SLAB = registerBlock("smooth_pink_limestone_slab",
            () -> new SlabBlock(SMOOTH_LIMESTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_TAN_LIMESTONE_SLAB = registerBlock("smooth_tan_limestone_slab",
            () -> new SlabBlock(SMOOTH_LIMESTONE_PROPERTIES), CALIBER_TAB);


    // -- MARBLE
    public static final RegistryObject<Block> BLACK_MARBLE = registerBlock("black_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE = registerBlock("gray_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE = registerBlock("pink_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE = registerBlock("red_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE = registerBlock("white_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_ARCH = registerBlock("black_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_ARCH = registerBlock("gray_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_ARCH = registerBlock("pink_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_ARCH = registerBlock("red_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_ARCH = registerBlock("white_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> BLACK_MARBLE_ARCH_HALF = registerBlock("black_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> GRAY_MARBLE_ARCH_HALF = registerBlock("gray_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_MARBLE_ARCH_HALF = registerBlock("pink_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_MARBLE_ARCH_HALF = registerBlock("red_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> WHITE_MARBLE_ARCH_HALF = registerBlock("white_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> BLACK_MARBLE_ARCH_LARGE = registerBlock("black_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> GRAY_MARBLE_ARCH_LARGE = registerBlock("gray_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_MARBLE_ARCH_LARGE = registerBlock("pink_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_MARBLE_ARCH_LARGE = registerBlock("red_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> WHITE_MARBLE_ARCH_LARGE = registerBlock("white_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> BLACK_MARBLE_ARCH_LARGE_HALF = registerBlock("black_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> GRAY_MARBLE_ARCH_LARGE_HALF = registerBlock("gray_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_MARBLE_ARCH_LARGE_HALF = registerBlock("pink_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_MARBLE_ARCH_LARGE_HALF = registerBlock("red_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> WHITE_MARBLE_ARCH_LARGE_HALF = registerBlock("white_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_ARROWSLIT = registerBlock("black_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_ARROWSLIT = registerBlock("gray_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_ARROWSLIT = registerBlock("pink_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_ARROWSLIT = registerBlock("red_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_ARROWSLIT = registerBlock("white_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_BALUSTRADE = registerBlock("black_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_BALUSTRADE = registerBlock("gray_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_BALUSTRADE = registerBlock("pink_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_BALUSTRADE = registerBlock("red_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_BALUSTRADE = registerBlock("white_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_CAPITAL = registerBlock("black_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_CAPITAL = registerBlock("gray_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_CAPITAL = registerBlock("pink_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_CAPITAL = registerBlock("red_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_CAPITAL = registerBlock("white_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_CORNER = registerBlock("black_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_CORNER = registerBlock("gray_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_CORNER = registerBlock("pink_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_CORNER = registerBlock("red_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_CORNER = registerBlock("white_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_CORNER_SLAB = registerBlock("black_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_CORNER_SLAB = registerBlock("gray_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_CORNER_SLAB = registerBlock("pink_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_CORNER_SLAB = registerBlock("red_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_CORNER_SLAB = registerBlock("white_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("black_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("gray_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("pink_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("red_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("white_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_EIGHTH = registerBlock("black_marble_eighth",
            () -> new EighthBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_EIGHTH = registerBlock("gray_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_EIGHTH = registerBlock("pink_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_EIGHTH = registerBlock("red_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_EIGHTH = registerBlock("white_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_QUARTER = registerBlock("black_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_QUARTER = registerBlock("gray_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_QUARTER = registerBlock("pink_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_QUARTER = registerBlock("red_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_QUARTER = registerBlock("white_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_QUARTER_VERTICAL = registerBlock("black_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_QUARTER_VERTICAL = registerBlock("gray_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_QUARTER_VERTICAL = registerBlock("pink_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_QUARTER_VERTICAL = registerBlock("red_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_QUARTER_VERTICAL = registerBlock("white_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_SLAB = registerBlock("black_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_SLAB = registerBlock("gray_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_SLAB = registerBlock("pink_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_SLAB = registerBlock("red_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_SLAB = registerBlock("white_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_SLAB_VERTICAL = registerBlock("black_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_SLAB_VERTICAL = registerBlock("gray_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_SLAB_VERTICAL = registerBlock("pink_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_SLAB_VERTICAL = registerBlock("red_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_SLAB_VERTICAL = registerBlock("white_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_STAIRS = registerBlock("black_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_STAIRS = registerBlock("gray_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_STAIRS = registerBlock("pink_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_STAIRS = registerBlock("red_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_STAIRS = registerBlock("white_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_WALL = registerBlock("black_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_WALL = registerBlock("gray_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_WALL = registerBlock("pink_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_WALL = registerBlock("red_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_WALL = registerBlock("white_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BLACK_MARBLE_WINDOW = registerBlock("black_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> GRAY_MARBLE_WINDOW = registerBlock("gray_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> PINK_MARBLE_WINDOW = registerBlock("pink_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_MARBLE_WINDOW = registerBlock("red_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_MARBLE_WINDOW = registerBlock("white_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> BLACK_MARBLE_WINDOW_HALF = registerBlock("black_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> GRAY_MARBLE_WINDOW_HALF = registerBlock("gray_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> PINK_MARBLE_WINDOW_HALF = registerBlock("pink_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_MARBLE_WINDOW_HALF = registerBlock("red_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> WHITE_MARBLE_WINDOW_HALF = registerBlock("white_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);


    // -- MARBLE -- POLISHED
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE = registerBlock("polished_black_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE = registerBlock("polished_gray_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE = registerBlock("polished_pink_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE = registerBlock("polished_red_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE = registerBlock("polished_white_marble",
            () -> new Block(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARCH = registerBlock("polished_black_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARCH = registerBlock("polished_gray_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARCH = registerBlock("polished_pink_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARCH = registerBlock("polished_red_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARCH = registerBlock("polished_white_marble_arch",
            () -> new ArchBlock(MARBLE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARCH_HALF = registerBlock("polished_black_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARCH_HALF = registerBlock("polished_gray_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARCH_HALF = registerBlock("polished_pink_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARCH_HALF = registerBlock("polished_red_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARCH_HALF = registerBlock("polished_white_marble_arch_half",
//            () -> new ArchHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARCH_LARGE = registerBlock("polished_black_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARCH_LARGE = registerBlock("polished_gray_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARCH_LARGE = registerBlock("polished_pink_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARCH_LARGE = registerBlock("polished_red_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARCH_LARGE = registerBlock("polished_white_marble_arch_large",
//            () -> new ArchLargeBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_black_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_gray_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_pink_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_red_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_white_marble_arch_large_half",
//            () -> new ArchLargeHalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARROWSLIT = registerBlock("polished_black_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARROWSLIT = registerBlock("polished_gray_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARROWSLIT = registerBlock("polished_pink_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARROWSLIT = registerBlock("polished_red_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARROWSLIT = registerBlock("polished_white_marble_arrowslit",
            () -> new ArrowSlitBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_BALUSTRADE = registerBlock("polished_black_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_BALUSTRADE = registerBlock("polished_gray_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_BALUSTRADE = registerBlock("polished_pink_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_BALUSTRADE = registerBlock("polished_red_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_BALUSTRADE = registerBlock("polished_white_marble_balustrade",
            () -> new BalustradeBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_CAPITAL = registerBlock("polished_black_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_CAPITAL = registerBlock("polished_gray_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_CAPITAL = registerBlock("polished_pink_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_CAPITAL = registerBlock("polished_red_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_CAPITAL = registerBlock("polished_white_marble_capital",
            () -> new CapitalBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_CORNER = registerBlock("polished_black_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_CORNER = registerBlock("polished_gray_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_CORNER = registerBlock("polished_pink_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_CORNER = registerBlock("polished_red_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_CORNER = registerBlock("polished_white_marble_corner",
            () -> new CornerBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_CORNER_SLAB = registerBlock("polished_black_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_CORNER_SLAB = registerBlock("polished_gray_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_CORNER_SLAB = registerBlock("polished_pink_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_CORNER_SLAB = registerBlock("polished_red_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_CORNER_SLAB = registerBlock("polished_white_marble_corner_slab",
            () -> new CornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_black_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_gray_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_pink_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_red_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_white_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_EIGHTH = registerBlock("polished_black_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_EIGHTH = registerBlock("polished_gray_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_EIGHTH = registerBlock("polished_pink_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_EIGHTH = registerBlock("polished_red_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_EIGHTH = registerBlock("polished_white_marble_eighth",
            () -> new EighthBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_QUARTER = registerBlock("polished_black_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_QUARTER = registerBlock("polished_gray_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_QUARTER = registerBlock("polished_pink_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_QUARTER = registerBlock("polished_red_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_QUARTER = registerBlock("polished_white_marble_quarter",
            () -> new QuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_QUARTER_VERTICAL = registerBlock("polished_black_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_QUARTER_VERTICAL = registerBlock("polished_gray_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_QUARTER_VERTICAL = registerBlock("polished_pink_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_QUARTER_VERTICAL = registerBlock("polished_red_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_QUARTER_VERTICAL = registerBlock("polished_white_marble_quarter_vertical",
            () -> new VerticalQuarterBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_SLAB = registerBlock("polished_black_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_SLAB = registerBlock("polished_gray_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_SLAB = registerBlock("polished_pink_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_SLAB = registerBlock("polished_red_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_SLAB = registerBlock("polished_white_marble_slab",
            () -> new SlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_SLAB_VERTICAL = registerBlock("polished_black_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_SLAB_VERTICAL = registerBlock("polished_gray_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_SLAB_VERTICAL = registerBlock("polished_pink_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_SLAB_VERTICAL = registerBlock("polished_red_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_SLAB_VERTICAL = registerBlock("polished_white_marble_slab_vertical",
            () -> new VerticalSlabBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_STAIRS = registerBlock("polished_black_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BLACK_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_STAIRS = registerBlock("polished_gray_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GRAY_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_STAIRS = registerBlock("polished_pink_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_PINK_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_STAIRS = registerBlock("polished_red_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_RED_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_STAIRS = registerBlock("polished_white_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_WHITE_MARBLE.get().defaultBlockState(),
                    MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_WALL = registerBlock("polished_black_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_WALL = registerBlock("polished_gray_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_WALL = registerBlock("polished_pink_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_WALL = registerBlock("polished_red_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_WALL = registerBlock("polished_white_marble_wall",
            () -> new WallBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_WINDOW = registerBlock("polished_black_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_WINDOW = registerBlock("polished_gray_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_WINDOW = registerBlock("polished_pink_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_WINDOW = registerBlock("polished_red_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_WINDOW = registerBlock("polished_white_marble_window",
            () -> new WindowBlock(MARBLE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_WINDOW_HALF = registerBlock("polished_black_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_WINDOW_HALF = registerBlock("polished_gray_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_WINDOW_HALF = registerBlock("polished_pink_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_RED_MARBLE_WINDOW_HALF = registerBlock("polished_red_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_WINDOW_HALF = registerBlock("polished_white_marble_window_half",
//            () -> new Window_HalfBlock(MARBLE_PROPERTIES), CreativeTabs.CALIBER_TAB);


    // -- SANDSTONE
    public static final RegistryObject<Block> BROWN_SANDSTONE = registerBlock("brown_sandstone",
            () -> new Block(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE = registerBlock("orange_sandstone",
            () -> new Block(SANDSTONE_PROPERTIES), CALIBER_TAB);
    //TODO: ADD SANDSTONE ARCHES
    public static final RegistryObject<Block> BROWN_SANDSTONE_ARCH = registerBlock("brown_sandstone_arch",
            () -> new ArchBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_ARCH = registerBlock("orange_sandstone_arch",
            () -> new ArchBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_ARCH = registerBlock("red_sandstone_arch",
            () -> new ArchBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_ARCH = registerBlock("sandstone_arch",
            () -> new ArchBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_ARROWSLIT = registerBlock("brown_sandstone_arrowslit",
            () -> new ArrowSlitBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_ARROWSLIT = registerBlock("orange_sandstone_arrowslit",
            () -> new ArrowSlitBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_ARROWSLIT = registerBlock("red_sandstone_arrowslit",
            () -> new ArrowSlitBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_ARROWSLIT = registerBlock("sandstone_arrowslit",
            () -> new ArrowSlitBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_BALUSTRADE = registerBlock("brown_sandstone_balustrade",
            () -> new BalustradeBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BALUSTRADE = registerBlock("orange_sandstone_balustrade",
            () -> new BalustradeBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_BALUSTRADE = registerBlock("red_sandstone_balustrade",
            () -> new BalustradeBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_BALUSTRADE = registerBlock("sandstone_balustrade",
            () -> new BalustradeBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_CAPITAL = registerBlock("brown_sandstone_capital",
            () -> new CapitalBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_CAPITAL = registerBlock("orange_sandstone_capital",
            () -> new CapitalBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_CAPITAL = registerBlock("red_sandstone_capital",
            () -> new CapitalBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_CAPITAL = registerBlock("sandstone_capital",
            () -> new CapitalBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_CORNER = registerBlock("brown_sandstone_corner",
            () -> new CornerBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_CORNER = registerBlock("orange_sandstone_corner",
            () -> new CornerBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_CORNER = registerBlock("red_sandstone_corner",
            () -> new CornerBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_CORNER = registerBlock("sandstone_corner",
            () -> new CornerBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_CORNER_SLAB = registerBlock("brown_sandstone_corner_slab",
            () -> new CornerSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_CORNER_SLAB = registerBlock("orange_sandstone_corner_slab",
            () -> new CornerSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_CORNER_SLAB = registerBlock("red_sandstone_corner_slab",
            () -> new CornerSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_CORNER_SLAB = registerBlock("sandstone_corner_slab",
            () -> new CornerSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("brown_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("orange_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("red_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_EIGHTH = registerBlock("brown_sandstone_eighth",
            () -> new EighthBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_EIGHTH = registerBlock("orange_sandstone_eighth",
            () -> new EighthBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_EIGHTH = registerBlock("red_sandstone_eighth",
            () -> new EighthBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_EIGHTH = registerBlock("sandstone_eighth",
            () -> new EighthBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_QUARTER = registerBlock("brown_sandstone_quarter",
            () -> new QuarterBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_QUARTER = registerBlock("orange_sandstone_quarter",
            () -> new QuarterBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_QUARTER = registerBlock("red_sandstone_quarter",
            () -> new QuarterBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_QUARTER = registerBlock("sandstone_quarter",
            () -> new QuarterBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_QUARTER_VERTICAL = registerBlock("brown_sandstone_quarter_vertical",
            () -> new VerticalQuarterBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_QUARTER_VERTICAL = registerBlock("orange_sandstone_quarter_vertical",
            () -> new VerticalQuarterBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_QUARTER_VERTICAL = registerBlock("red_sandstone_quarter_vertical",
            () -> new VerticalQuarterBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_QUARTER_VERTICAL = registerBlock("sandstone_quarter_vertical",
            () -> new VerticalQuarterBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_SLAB = registerBlock("brown_sandstone_slab",
            () -> new SlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_SLAB = registerBlock("orange_sandstone_slab",
            () -> new SlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_SLAB_VERTICAL = registerBlock("brown_sandstone_slab_vertical",
            () -> new VerticalSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_SLAB_VERTICAL = registerBlock("orange_sandstone_slab_vertical",
            () -> new VerticalSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_SLAB_VERTICAL = registerBlock("red_sandstone_slab_vertical",
            () -> new VerticalSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_SLAB_VERTICAL = registerBlock("sandstone_slab_vertical",
            () -> new VerticalSlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_STAIRS = registerBlock("brown_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_SANDSTONE.get().defaultBlockState(),
                    SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_STAIRS = registerBlock("orange_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_SANDSTONE.get().defaultBlockState(),
                    SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_WALL = registerBlock("brown_sandstone_wall",
            () -> new WallBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_WALL = registerBlock("orange_sandstone_wall",
            () -> new WallBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SANDSTONE_WINDOW = registerBlock("brown_sandstone_window",
            () -> new WindowBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_WINDOW = registerBlock("orange_sandstone_window",
            () -> new WindowBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> RED_SANDSTONE_WINDOW = registerBlock("red_sandstone_window",
            () -> new WindowBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SANDSTONE_WINDOW = registerBlock("sandstone_window",
            () -> new WindowBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
//    public static final RegistryObject<Block> BROWN_SANDSTONE_WINDOW_HALF = registerBlock("brown_sandstone_window_half",
//            () -> new HalfWindowBlock(SANDSTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> ORANGE_SANDSTONE_WINDOW_HALF = registerBlock("orange_sandstone_window_half",
//            () -> new HalfWindowBlock(SANDSTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> RED_SANDSTONE_WINDOW_HALF = registerBlock("red_sandstone_window_half",
//            () -> new HalfWindowBlock(SANDSTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
//    public static final RegistryObject<Block> SANDSTONE_WINDOW_HALF = registerBlock("sandstone_window_half",
//            () -> new HalfWindowBlock(SANDSTONE_PROPERTIES), CreativeTabs.CALIBER_TAB);
    

    // -- SANDSTONE -- CHISELED
    public static final RegistryObject<Block> CHISELED_BROWN_SANDSTONE = registerBlock("chiseled_brown_sandstone",
            () -> new Block(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CHISELED_ORANGE_SANDSTONE = registerBlock("chiseled_orange_sandstone",
            () -> new Block(SANDSTONE_PROPERTIES), CALIBER_TAB);

    // -- SANDSTONE -- CUT
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE = registerBlock("cut_brown_sandstone",
            () -> new Block(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE = registerBlock("cut_orange_sandstone",
            () -> new Block(SANDSTONE_PROPERTIES), CALIBER_TAB);

    // -- SANDSTONE -- CUT -- SLAB
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_SLAB = registerBlock("cut_brown_sandstone_slab",
            () -> new SlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_SLAB = registerBlock("cut_orange_sandstone_slab",
            () -> new SlabBlock(SANDSTONE_PROPERTIES), CALIBER_TAB);


    // -- SANDSTONE -- SMOOTH
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE = registerBlock("smooth_brown_sandstone",
            () -> new Block(SMOOTH_SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE = registerBlock("smooth_orange_sandstone",
            () -> new Block(SMOOTH_SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_SLAB = registerBlock("smooth_brown_sandstone_slab",
            () -> new SlabBlock(SMOOTH_SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_SLAB = registerBlock("smooth_orange_sandstone_slab",
            () -> new SlabBlock(SMOOTH_SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_STAIRS = registerBlock("smooth_brown_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_BROWN_SANDSTONE.get().defaultBlockState(),
                    SMOOTH_SANDSTONE_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_STAIRS = registerBlock("smooth_orange_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_ORANGE_SANDSTONE.get().defaultBlockState(),
                    SMOOTH_SANDSTONE_PROPERTIES), CALIBER_TAB);

    // -- SAND
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand",
            () -> new SandBlock(0,BlockBehaviour.Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND)), CALIBER_TAB);
    public static final RegistryObject<Block> BROWN_SAND = registerBlock("brown_sand",
            () -> new SandBlock(0,BlockBehaviour.Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND)), CALIBER_TAB);
    public static final RegistryObject<Block> ORANGE_SAND = registerBlock("orange_sand",
            () -> new SandBlock(0,BlockBehaviour.Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND)), CALIBER_TAB);
    public static final RegistryObject<Block> WHITE_SAND = registerBlock("white_sand",
            () -> new SandBlock(0,BlockBehaviour.Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND)), CALIBER_TAB);

    // WOOD BLOCKS
    public static final RegistryObject<Block> ACACIA_BALUSTRADE = registerBlock("acacia_balustrade",
            () -> new BalustradeBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_BALUSTRADE = registerBlock("birch_balustrade",
            () -> new BalustradeBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_BALUSTRADE = registerBlock("dark_oak_balustrade",
            () -> new BalustradeBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_BALUSTRADE = registerBlock("jungle_balustrade",
            () -> new BalustradeBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_BALUSTRADE = registerBlock("oak_balustrade",
            () -> new BalustradeBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_BALUSTRADE = registerBlock("spruce_balustrade",
            () -> new BalustradeBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_CAPITAL = registerBlock("acacia_capital",
            () -> new CapitalBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_CAPITAL = registerBlock("birch_capital",
            () -> new CapitalBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_CAPITAL = registerBlock("dark_oak_capital",
            () -> new CapitalBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_CAPITAL = registerBlock("jungle_capital",
            () -> new CapitalBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_CAPITAL = registerBlock("oak_capital",
            () -> new CapitalBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_CAPITAL = registerBlock("spruce_capital",
            () -> new CapitalBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_CORNER = registerBlock("acacia_corner",
            () -> new CornerBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_CORNER = registerBlock("birch_corner",
            () -> new CornerBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_CORNER = registerBlock("dark_oak_corner",
            () -> new CornerBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_CORNER = registerBlock("jungle_corner",
            () -> new CornerBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_CORNER = registerBlock("oak_corner",
            () -> new CornerBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_CORNER = registerBlock("spruce_corner",
            () -> new CornerBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_CORNER_SLAB = registerBlock("acacia_corner_slab",
            () -> new CornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_CORNER_SLAB = registerBlock("birch_corner_slab",
            () -> new CornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_CORNER_SLAB = registerBlock("dark_oak_corner_slab",
            () -> new CornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_CORNER_SLAB = registerBlock("jungle_corner_slab",
            () -> new CornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_CORNER_SLAB = registerBlock("oak_corner_slab",
            () -> new CornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_CORNER_SLAB = registerBlock("spruce_corner_slab",
            () -> new CornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_CORNER_SLAB_VERTICAL = registerBlock("acacia_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_CORNER_SLAB_VERTICAL = registerBlock("birch_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_CORNER_SLAB_VERTICAL = registerBlock("dark_oak_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_CORNER_SLAB_VERTICAL = registerBlock("jungle_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_CORNER_SLAB_VERTICAL = registerBlock("oak_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_CORNER_SLAB_VERTICAL = registerBlock("spruce_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_EIGHTH = registerBlock("acacia_eighth",
            () -> new EighthBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_EIGHTH = registerBlock("birch_eighth",
            () -> new EighthBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_EIGHTH = registerBlock("dark_oak_eighth",
            () -> new EighthBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_EIGHTH = registerBlock("jungle_eighth",
            () -> new EighthBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_EIGHTH = registerBlock("oak_eighth",
            () -> new EighthBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_EIGHTH = registerBlock("spruce_eighth",
            () -> new EighthBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_QUARTER = registerBlock("acacia_quarter",
            () -> new QuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_QUARTER = registerBlock("birch_quarter",
            () -> new QuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_QUARTER = registerBlock("dark_oak_quarter",
            () -> new QuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_QUARTER = registerBlock("jungle_quarter",
            () -> new QuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_QUARTER = registerBlock("oak_quarter",
            () -> new QuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_QUARTER = registerBlock("spruce_quarter",
            () -> new QuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_QUARTER_VERTICAL = registerBlock("acacia_quarter_vertical",
            () -> new VerticalQuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_QUARTER_VERTICAL = registerBlock("birch_quarter_vertical",
            () -> new VerticalQuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_QUARTER_VERTICAL = registerBlock("dark_oak_quarter_vertical",
            () -> new VerticalQuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_QUARTER_VERTICAL = registerBlock("jungle_quarter_vertical",
            () -> new VerticalQuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_QUARTER_VERTICAL = registerBlock("oak_quarter_vertical",
            () -> new VerticalQuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_QUARTER_VERTICAL = registerBlock("spruce_quarter_vertical",
            () -> new VerticalQuarterBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_SLAB_VERTICAL = registerBlock("acacia_slab_vertical",
            () -> new VerticalSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_SLAB_VERTICAL = registerBlock("birch_slab_vertical",
            () -> new VerticalSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_SLAB_VERTICAL = registerBlock("dark_oak_slab_vertical",
            () -> new VerticalSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_SLAB_VERTICAL = registerBlock("jungle_slab_vertical",
            () -> new VerticalSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_SLAB_VERTICAL = registerBlock("oak_slab_vertical",
            () -> new VerticalSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_SLAB_VERTICAL = registerBlock("spruce_slab_vertical",
            () -> new VerticalSlabBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_WALL = registerBlock("acacia_wall",
            () -> new WallBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_WALL = registerBlock("birch_wall",
            () -> new WallBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_WALL = registerBlock("dark_oak_wall",
            () -> new WallBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_WALL = registerBlock("jungle_wall",
            () -> new WallBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_WALL = registerBlock("oak_wall",
            () -> new WallBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_WALL = registerBlock("spruce_wall",
            () -> new WallBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_WINDOW = registerBlock("acacia_window",
            () -> new WindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_WINDOW = registerBlock("birch_window",
            () -> new WindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_WINDOW = registerBlock("dark_oak_window",
            () -> new WindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_WINDOW = registerBlock("jungle_window",
            () -> new WindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_WINDOW = registerBlock("oak_window",
            () -> new WindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_WINDOW = registerBlock("spruce_window",
            () -> new WindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> ACACIA_WINDOW_HALF = registerBlock("acacia_window_half",
            () -> new HalfWindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> BIRCH_WINDOW_HALF = registerBlock("birch_window_half",
            () -> new HalfWindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> DARK_OAK_WINDOW_HALF = registerBlock("dark_oak_window_half",
            () -> new HalfWindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> JUNGLE_WINDOW_HALF = registerBlock("jungle_window_half",
            () -> new HalfWindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> OAK_WINDOW_HALF = registerBlock("oak_window_half",
            () -> new HalfWindowBlock(PLANK_PROPERTIES), CALIBER_TAB);
    public static final RegistryObject<Block> SPRUCE_WINDOW_HALF = registerBlock("spruce_window_half",
            () -> new HalfWindowBlock(PLANK_PROPERTIES), CALIBER_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, net.minecraft.world.item.CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab); //CreativeTabs.CALIBER_TAB
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            net.minecraft.world.item.CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
