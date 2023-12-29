package com.calibermc.caliber.block;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.custom.*;
import com.calibermc.caliber.block.custom.DirectionalBlock;
import com.calibermc.caliber.block.custom.entity.KilnBlock;
import com.calibermc.caliber.block.custom.entity.WoodcutterBlock;
import com.calibermc.caliber.block.custom.terrain.*;
import com.calibermc.caliber.block.management.CaliberBlockHelper;
import com.calibermc.caliber.block.management.BlockManager;
import com.calibermc.caliber.block.properties.BlockProps;
import com.calibermc.caliber.data.ModBlockFamily;
import com.calibermc.caliber.item.CreativeTabs;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.calibermc.caliber.block.management.CaliberBlockHelper.*;
import static com.calibermc.caliber.data.ModBlockFamily.Variant.STAIRS;
import static com.calibermc.caliber.data.ModBlockFamily.Variant.WALL;

public class ModBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Caliber.MOD_ID);

    public static final RegistryObject<Block> WOODCUTTER = registerBlock("woodcutter",
            () -> new WoodcutterBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops().strength(3.5F)));

    public static final RegistryObject<Block> KILN = registerBlock("kiln",
            () -> new KilnBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(3.5F).lightLevel((bs) -> bs.getValue(BlockStateProperties.LIT) ? 13 : 0)));

//    public static final RegistryObject<Block> TAPPED_BIRCH_LOG = registerBlock("tapped_birch_log",
//            () -> new TappedBirchLog(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

    // METAL BLOCKS
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockProps.TIN_BLOCK.get()));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new OreBlock(BlockProps.TIN_ORE.get()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockProps.RAW_TIN.get()));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new OreBlock(BlockProps.DEEPSLATE_TIN_ORE.get()));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockProps.SILVER_BLOCK.get()));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new OreBlock(BlockProps.SILVER_ORE.get()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockProps.RAW_SILVER.get()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new OreBlock(BlockProps.DEEPSLATE_SILVER_ORE.get()));

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockProps.BRONZE_BLOCK.get()));

    //TODO: ADD STEEL STUFF

    private static final List<ModBlockFamily.Variant> VARIANTS_WITHOUT_STAIRS_WALL = VARIANTS.stream().filter(v -> v != STAIRS && v != WALL).toList();
    private static final List<ModBlockFamily.Variant> VARIANTS_WITHOUT_WALL = VARIANTS.stream().filter(v -> v != WALL).toList();
    private static final List<ModBlockFamily.Variant> VARIANTS_WITHOUT_STAIRS = VARIANTS.stream().filter(v -> v != STAIRS).toList();
    private static final List<ModBlockFamily.Variant> BOARD_ROOF_VARIANTS = Stream.concat(VARIANTS.stream(), ROOF_VARIANTS.stream()).distinct().filter(variant -> !STONE_VARIANTS.contains(variant)).collect(Collectors.toList());
    private static final List<ModBlockFamily.Variant> PLANK_VARIANTS = VARIANTS.stream().filter(variant -> !STONE_VARIANTS.contains(variant)).collect(Collectors.toList());
    private static final List<ModBlockFamily.Variant> MOD_PLANK_VARIANTS = Stream.concat(VARIANTS.stream(), VANILLA_WOOD_VARIANTS.stream()).distinct().filter(variant -> !STONE_VARIANTS.contains(variant)).collect(Collectors.toList());
    private static final List<ModBlockFamily.Variant> FINISHED_WOOD_VARIANTS = Stream.concat(VARIANTS.stream(), WOOD_VARIANTS.stream()).distinct().filter(variant -> !STONE_VARIANTS.contains(variant)).collect(Collectors.toList());

    public static final BlockManager ANDESITE = BlockManager.register("andesite", BlockProps.ANDESITE.get(), () -> Blocks.ANDESITE, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_ANDESITE = BlockManager.register("polished_andesite", BlockProps.POLISHED_ANDESITE.get(), () -> Blocks.POLISHED_ANDESITE, VARIANTS.stream().filter(v -> v != STAIRS).toList());
    public static final BlockManager BASALT = BlockManager.register("basalt", BlockProps.BASALT.get(), () -> Blocks.BASALT, VARIANTS);
    public static final BlockManager SMOOTH_BASALT = BlockManager.register("smooth_basalt", BlockProps.SMOOTH_BASALT.get(), () -> Blocks.SMOOTH_BASALT, VARIANTS);
    public static final BlockManager POLISHED_BASALT = BlockManager.register("polished_basalt", BlockProps.POLISHED_BASALT.get(), () -> Blocks.POLISHED_BASALT, VARIANTS);
    public static final BlockManager BLACKSTONE = BlockManager.register("blackstone", BlockProps.BLACKSTONE.get(), () -> Blocks.BLACKSTONE, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager GILDED_BLACKSTONE = BlockManager.register("gilded_blackstone", BlockProps.GILDED_BLACKSTONE.get(), () -> Blocks.GILDED_BLACKSTONE, VARIANTS);
    public static final BlockManager POLISHED_BLACKSTONE = BlockManager.register("polished_blackstone", BlockProps.POLISHED_BLACKSTONE.get(), () -> Blocks.POLISHED_BLACKSTONE, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_BLACKSTONE_BRICK = BlockManager.register("polished_blackstone_brick", BlockProps.POLISHED_BLACKSTONE_BRICK.get(), () -> Blocks.POLISHED_BLACKSTONE_BRICKS, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager DEEPSLATE = BlockManager.register("deepslate", BlockProps.DEEPSLATE.get(), () -> Blocks.DEEPSLATE, VARIANTS);
    public static final BlockManager DEEPSLATE_BRICK = BlockManager.register("deepslate_brick", BlockProps.DEEPSLATE_BRICK.get(), () -> Blocks.DEEPSLATE_BRICKS, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager DEEPSLATE_TILE = BlockManager.register("deepslate_tile", BlockProps.DEEPSLATE_TILES.get(), () -> Blocks.DEEPSLATE_TILES, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager COBBLED_DEEPSLATE = BlockManager.register("cobbled_deepslate", BlockProps.COBBLED_DEEPSLATE.get(), () -> Blocks.COBBLED_DEEPSLATE, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_DEEPSLATE = BlockManager.register("polished_deepslate", BlockProps.POLISHED_DEEPSLATE.get(), () -> Blocks.POLISHED_DEEPSLATE, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager DIORITE = BlockManager.register("diorite", BlockProps.DIORITE.get(), () -> Blocks.DIORITE, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_DIORITE = BlockManager.register("polished_diorite", BlockProps.POLISHED_DIORITE.get(), () -> Blocks.POLISHED_DIORITE, VARIANTS.stream().filter(v -> v != STAIRS).toList());

    /* Granite */
    public static final BlockManager BLACK_GRANITE = BlockManager.register("black_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BROWN_GRANITE = BlockManager.register("brown_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager GRAY_GRANITE = BlockManager.register("gray_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_GRANITE = BlockManager.register("pink_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_GRANITE = BlockManager.register("white_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_GRANITE = BlockManager.register("red_granite",
            BlockProps.GRANITE.get(), () -> Blocks.GRANITE, VARIANTS.stream().filter(v -> v != STAIRS && v != WALL).toList());

    /* Polished Granite */
    public static final BlockManager POLISHED_BLACK_GRANITE = BlockManager.register("polished_black_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_BROWN_GRANITE = BlockManager.register("polished_brown_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_GRAY_GRANITE = BlockManager.register("polished_gray_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_PINK_GRANITE = BlockManager.register("polished_pink_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_WHITE_GRANITE = BlockManager.register("polished_white_granite",
            BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_RED_GRANITE = BlockManager.register("polished_red_granite",
            BlockProps.GRANITE.get(), () -> Blocks.POLISHED_GRANITE, VARIANTS.stream().filter(v -> v != STAIRS).toList());

    /* Limestone */
    public static final BlockManager DARK_LIMESTONE = BlockManager.registerStoneWithLoot("dark_limestone", () -> ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock());
    public static final BlockManager LIGHT_LIMESTONE = BlockManager.registerStoneWithLoot("light_limestone", () -> ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock());
    public static final BlockManager PINK_LIMESTONE = BlockManager.registerStoneWithLoot("pink_limestone", () -> ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock());
    public static final BlockManager TAN_LIMESTONE = BlockManager.registerStoneWithLoot("tan_limestone", () -> ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock());
    public static final BlockManager LIMESTONE = BlockManager.register("limestone",
            BlockProps.LIMESTONE.get(), () -> Blocks.STONE, VARIANTS.stream().filter(v -> v != STAIRS).toList());

    /* Cobbled Limestone */
    public static final BlockManager COBBLED_DARK_LIMESTONE = BlockManager.register("cobbled_dark_limestone",
            BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_LIGHT_LIMESTONE = BlockManager.register("cobbled_light_limestone",
            BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_PINK_LIMESTONE = BlockManager.register("cobbled_pink_limestone",
            BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_TAN_LIMESTONE = BlockManager.register("cobbled_tan_limestone",
            BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_LIMESTONE = BlockManager.register("cobbled_limestone",
            BlockProps.COBBLESTONE.get(), () -> Blocks.COBBLESTONE, VARIANTS.stream().filter(v -> v != STAIRS && v != WALL).toList());


    /* Mossy Cobbled Limestone */
    public static final BlockManager MOSSY_COBBLED_DARK_LIMESTONE = BlockManager.register("mossy_cobbled_dark_limestone",
            BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_LIGHT_LIMESTONE = BlockManager.register("mossy_cobbled_light_limestone",
            BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_PINK_LIMESTONE = BlockManager.register("mossy_cobbled_pink_limestone",
            BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_TAN_LIMESTONE = BlockManager.register("mossy_cobbled_tan_limestone",
            BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_LIMESTONE = BlockManager.register("mossy_cobbled_limestone",
            BlockProps.COBBLESTONE.get(), () -> Blocks.MOSSY_COBBLESTONE, VARIANTS.stream().filter(v -> v != STAIRS && v != WALL).toList());

    /* Limestone Bricks */
    public static final BlockManager DARK_LIMESTONE_BRICK = BlockManager.register("dark_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager LIGHT_LIMESTONE_BRICK = BlockManager.register("light_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_LIMESTONE_BRICK = BlockManager.register("pink_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TAN_LIMESTONE_BRICK = BlockManager.register("tan_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager LIMESTONE_BRICK = BlockManager.register("limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.STONE_BRICKS, VARIANTS.stream().filter(v -> v != STAIRS && v != WALL).toList());

    /* Mossy Limestone Bricks */
    public static final BlockManager MOSSY_DARK_LIMESTONE_BRICK = BlockManager.register("mossy_dark_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_LIGHT_LIMESTONE_BRICK = BlockManager.register("mossy_light_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_PINK_LIMESTONE_BRICK = BlockManager.register("mossy_pink_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_TAN_LIMESTONE_BRICK = BlockManager.register("mossy_tan_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_LIMESTONE_BRICK = BlockManager.register("mossy_limestone_bricks",
            BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.MOSSY_STONE_BRICKS, VARIANTS.stream().filter(v -> v != STAIRS && v != WALL).toList());

    /* Cracked Limestone Bricks*/
    public static final BlockManager CRACKED_DARK_LIMESTONE_BRICKS = BlockManager.registerOneBlock("cracked_dark_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_LIGHT_LIMESTONE_BRICKS = BlockManager.registerOneBlock("cracked_light_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_PINK_LIMESTONE_BRICKS = BlockManager.registerOneBlock("cracked_pink_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_TAN_LIMESTONE_BRICKS = BlockManager.registerOneBlock("cracked_tan_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));

    /* Chiseled Limestone Bricks*/
    public static final BlockManager CHISELED_DARK_LIMESTONE_BRICKS = BlockManager.registerOneBlock("chiseled_dark_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_LIGHT_LIMESTONE_BRICKS = BlockManager.registerOneBlock("chiseled_light_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_PINK_LIMESTONE_BRICKS = BlockManager.registerOneBlock("chiseled_pink_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_TAN_LIMESTONE_BRICKS = BlockManager.registerOneBlock("chiseled_tan_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));

    /* Smooth Limestone */
    public static final BlockManager SMOOTH_DARK_LIMESTONE = BlockManager.register("smooth_dark_limestone",
            BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_LIGHT_LIMESTONE = BlockManager.register("smooth_light_limestone",
            BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_PINK_LIMESTONE = BlockManager.register("smooth_pink_limestone",
            BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_TAN_LIMESTONE = BlockManager.register("smooth_tan_limestone",
            BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_LIMESTONE = BlockManager.register("smooth_limestone",
            BlockProps.SMOOTH_LIMESTONE.get(), () -> Blocks.SMOOTH_STONE, VARIANTS);

    /* Marble */
    public static final BlockManager BLACK_MARBLE = BlockManager.register("black_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager GRAY_MARBLE = BlockManager.register("gray_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_MARBLE = BlockManager.register("pink_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_MARBLE = BlockManager.register("red_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_MARBLE = BlockManager.register("white_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Polished Marble */
    public static final BlockManager POLISHED_BLACK_MARBLE = BlockManager.register("polished_black_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_GRAY_MARBLE = BlockManager.register("polished_gray_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_PINK_MARBLE = BlockManager.register("polished_pink_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_RED_MARBLE = BlockManager.register("polished_red_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_WHITE_MARBLE = BlockManager.register("polished_white_marble",
            BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Quartz */
    public static final BlockManager QUARTZ = BlockManager.register("quartz", BlockProps.QUARTZ.get(), () -> Blocks.QUARTZ_BLOCK, VARIANTS.stream().filter(v -> v != STAIRS).toList());
    public static final BlockManager SMOOTH_QUARTZ = BlockManager.register("smooth_quartz", BlockProps.SMOOTH_QUARTZ.get(), () -> Blocks.SMOOTH_QUARTZ, VARIANTS.stream().filter(v -> v != STAIRS).toList());

    /* Sandstone */
    public static final BlockManager BROWN_SANDSTONE = BlockManager.register("brown_sandstone",
            BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager ORANGE_SANDSTONE = BlockManager.register("orange_sandstone",
            BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_SANDSTONE = BlockManager.register("red_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.RED_SANDSTONE, VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager SANDSTONE = BlockManager.register("sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.SANDSTONE, VARIANTS_WITHOUT_STAIRS_WALL);

    /* Chiseled Sandstone */
    public static final BlockManager CHISELED_BROWN_SANDSTONE = BlockManager.registerOneBlock("chiseled_brown_sandstone",
            () -> new Block(BlockProps.SANDSTONE.get()));
    public static final BlockManager CHISELED_ORANGE_SANDSTONE = BlockManager.registerOneBlock("chiseled_orange_sandstone",
            () -> new Block(BlockProps.SANDSTONE.get()));

    /* Cut Sandstone */
    public static final BlockManager CUT_BROWN_SANDSTONE = BlockManager.register("cut_brown_sandstone",
            BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CUT_ORANGE_SANDSTONE = BlockManager.register("cut_orange_sandstone",
            BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CUT_RED_SANDSTONE = BlockManager.register("cut_red_sandstone",
            BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CUT_SANDSTONE = BlockManager.register("cut_sandstone",
            BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Smooth Sandstone */
    public static final BlockManager SMOOTH_BROWN_SANDSTONE = BlockManager.register("smooth_brown_sandstone",
            BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_ORANGE_SANDSTONE = BlockManager.register("smooth_orange_sandstone",
            BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_RED_SANDSTONE = BlockManager.register("smooth_red_sandstone", BlockProps.SMOOTH_SANDSTONE.get(), () -> Blocks.SMOOTH_RED_SANDSTONE, VARIANTS.stream().filter(v -> v != STAIRS).toList());
    public static final BlockManager SMOOTH_SANDSTONE = BlockManager.register("smooth_sandstone", BlockProps.SMOOTH_SANDSTONE.get(), () -> Blocks.SMOOTH_SANDSTONE, VARIANTS.stream().filter(v -> v != STAIRS).toList());

    // -- TERRAIN
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand",
            () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> BROWN_SAND = registerBlock("brown_sand",
            () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> ORANGE_SAND = registerBlock("orange_sand",
            () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> WHITE_SAND = registerBlock("white_sand",
            () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> BLACK_SAND_LAYER = registerBlock("black_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> BROWN_SAND_LAYER = registerBlock("brown_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> ORANGE_SAND_LAYER = registerBlock("orange_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> RED_SAND_LAYER = registerBlock("red_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> SOUL_SAND_LAYER = registerBlock("soul_sand_layer",
            () -> new SoulSandLayerBlock(BlockProps.SOUL_SAND.get()));
    public static final RegistryObject<Block> SAND_LAYER = registerBlock("sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> WHITE_SAND_LAYER = registerBlock("white_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));

    public static final RegistryObject<Block> CLAY_LAYER = registerBlock("clay_layer",
            () -> new TerrainLayerBlock(BlockProps.CLAY.get()));
    public static final RegistryObject<Block> COARSE_DIRT_LAYER = registerBlock("coarse_dirt_layer",
            () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> DIRT_LAYER = registerBlock("dirt_layer",
            () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    //    public static final RegistryObject<Block> FARMLAND_LAYER = registerBlock("farmland_layer",
//            () -> new FarmLayerBlock(BlockProps.FARMLAND.get()));
    public static final RegistryObject<Block> GRASS_LAYER = registerBlock("grass_layer",
            () -> new GrassLayerBlock(BlockProps.GRASS.get()));
    public static final RegistryObject<Block> GRAVEL_LAYER = registerBlock("gravel_layer",
            () -> new FallingLayerBlock(BlockProps.GRAVEL.get()));
    public static final RegistryObject<Block> MYCELIUM_LAYER = registerBlock("mycelium_layer",
            () -> new MyceliumLayerBlock(BlockProps.MYCELIUM.get()));
    public static final RegistryObject<Block> PODZOL_LAYER = registerBlock("podzol_layer",
            () -> new TerrainLayerBlock(BlockProps.PODZOL.get()));
    public static final RegistryObject<Block> ROOTED_DIRT_LAYER = registerBlock("rooted_dirt_layer",
            () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> SOUL_SOIL_LAYER = registerBlock("soul_soil_layer",
            () -> new TerrainLayerBlock(BlockProps.SOUL_SOIL.get()));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_LAYER = registerBlock("crimson_nylium_layer",
            () -> new NyliumLayerBlock(BlockProps.CRIMSON_NYLIUM.get()));
    public static final RegistryObject<Block> WARPED_NYLIUM_LAYER = registerBlock("warped_nylium_layer",
            () -> new NyliumLayerBlock(BlockProps.WARPED_NYLIUM.get()));

    /* Stripped Wood */
    public static final BlockManager STRIPPED_ACACIA = BlockManager.register("stripped_acacia",
            BlockProps.PLANK.get(), () -> Blocks.STRIPPED_ACACIA_WOOD, FINISHED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_BIRCH = BlockManager.register("stripped_birch",
            BlockProps.PLANK.get(), () -> Blocks.STRIPPED_BIRCH_WOOD, FINISHED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_DARK_OAK = BlockManager.register("stripped_dark_oak",
            BlockProps.PLANK.get(), () -> Blocks.STRIPPED_DARK_OAK_WOOD, FINISHED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_JUNGLE = BlockManager.register("stripped_jungle",
            BlockProps.PLANK.get(), () -> Blocks.STRIPPED_JUNGLE_WOOD, FINISHED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_OAK = BlockManager.register("stripped_oak",
            BlockProps.PLANK.get(), () -> Blocks.STRIPPED_OAK_WOOD, FINISHED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_SPRUCE = BlockManager.register("stripped_spruce",
            BlockProps.PLANK.get(), () -> Blocks.STRIPPED_SPRUCE_WOOD, FINISHED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_CRIMSON = BlockManager.register("stripped_crimson",
            BlockProps.PLANK.get(), () -> Blocks.STRIPPED_CRIMSON_HYPHAE, FINISHED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_WARPED = BlockManager.register("stripped_warped",
            BlockProps.PLANK.get(), () -> Blocks.STRIPPED_WARPED_HYPHAE, FINISHED_WOOD_VARIANTS);

    /* Stained Wood */
    public static final BlockManager STAINED_STRIPPED_ACACIA = BlockManager.register("stained_stripped_acacia_wood",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(FINISHED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_BIRCH = BlockManager.register("stained_stripped_birch_wood",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(FINISHED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_DARK_OAK = BlockManager.register("stained_stripped_dark_oak_wood",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(FINISHED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_JUNGLE = BlockManager.register("stained_stripped_jungle_wood",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(FINISHED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_OAK = BlockManager.register("stained_stripped_oak_wood",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(FINISHED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_SPRUCE = BlockManager.register("stained_stripped_spruce_wood",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(FINISHED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Planks */
    public static final BlockManager ACACIA = BlockManager.register("acacia",
            BlockProps.PLANK.get(), () -> Blocks.ACACIA_PLANKS, PLANK_VARIANTS);
    public static final BlockManager BIRCH = BlockManager.register("birch",
            BlockProps.PLANK.get(), () -> Blocks.BIRCH_PLANKS, PLANK_VARIANTS);
    public static final BlockManager DARK_OAK = BlockManager.register("dark_oak",
            BlockProps.PLANK.get(), () -> Blocks.DARK_OAK_PLANKS, PLANK_VARIANTS);
    public static final BlockManager JUNGLE = BlockManager.register("jungle",
            BlockProps.PLANK.get(), () -> Blocks.JUNGLE_PLANKS, PLANK_VARIANTS);
    public static final BlockManager OAK = BlockManager.register("oak",
            BlockProps.PLANK.get(), () -> Blocks.OAK_PLANKS, PLANK_VARIANTS);
    public static final BlockManager SPRUCE = BlockManager.register("spruce",
            BlockProps.PLANK.get(), () -> Blocks.SPRUCE_PLANKS, PLANK_VARIANTS);
    public static final BlockManager CRIMSON = BlockManager.register("crimson",
            BlockProps.PLANK.get(), () -> Blocks.CRIMSON_PLANKS, PLANK_VARIANTS);
    public static final BlockManager WARPED = BlockManager.register("warped",
            BlockProps.PLANK.get(), () -> Blocks.WARPED_PLANKS, PLANK_VARIANTS);

    public static final BlockManager MOSSY_ACACIA = BlockManager.register("mossy_acacia_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_BIRCH = BlockManager.register("mossy_birch_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_DARK_OAK = BlockManager.register("mossy_dark_oak_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_JUNGLE = BlockManager.register("mossy_jungle_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_OAK = BlockManager.register("mossy_oak_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_SPRUCE = BlockManager.register("mossy_spruce_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_CRIMSON = BlockManager.register("mossy_crimson_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_WARPED = BlockManager.register("mossy_warped_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));


    /* Stained Planks */
    public static final BlockManager STAINED_ACACIA = BlockManager.register("stained_acacia_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_ACACIA_BUTTON = registerBlock("stained_acacia_button",
            () -> new WoodButtonBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_ACACIA_DOOR = registerBlock("stained_acacia_door",
            () -> new DoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_ACACIA_SIGN = registerBlockWithoutBlockItem("stained_acacia_sign",
            () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_TRAPDOOR = registerBlock("stained_acacia_trapdoor",
            () -> new TrapDoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_ACACIA_WALL_SIGN = registerBlockWithoutBlockItem("stained_acacia_wall_sign",
            () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));

    public static final BlockManager STAINED_BIRCH = BlockManager.register("stained_birch_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_BIRCH_BUTTON = registerBlock("stained_birch_button",
            () -> new WoodButtonBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_BIRCH_DOOR = registerBlock("stained_birch_door",
            () -> new DoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_BIRCH_SIGN = registerBlockWithoutBlockItem("stained_birch_sign",
            () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_TRAPDOOR = registerBlock("stained_birch_trapdoor",
            () -> new TrapDoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_BIRCH_WALL_SIGN = registerBlockWithoutBlockItem("stained_birch_wall_sign",
            () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));

    public static final BlockManager STAINED_DARK_OAK = BlockManager.register("stained_dark_oak_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_DARK_OAK_BUTTON = registerBlock("stained_dark_oak_button",
            () -> new WoodButtonBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_DARK_OAK_DOOR = registerBlock("stained_dark_oak_door",
            () -> new DoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_DARK_OAK_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_sign",
            () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_TRAPDOOR = registerBlock("stained_dark_oak_trapdoor",
            () -> new TrapDoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_DARK_OAK_WALL_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_wall_sign",
            () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));

    public static final BlockManager STAINED_JUNGLE = BlockManager.register("stained_jungle_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_JUNGLE_BUTTON = registerBlock("stained_jungle_button",
            () -> new WoodButtonBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_JUNGLE_DOOR = registerBlock("stained_jungle_door",
            () -> new DoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_JUNGLE_SIGN = registerBlockWithoutBlockItem("stained_jungle_sign",
            () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_TRAPDOOR = registerBlock("stained_jungle_trapdoor",
            () -> new TrapDoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_JUNGLE_WALL_SIGN = registerBlockWithoutBlockItem("stained_jungle_wall_sign",
            () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));

    public static final BlockManager STAINED_OAK = BlockManager.register("stained_oak_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_OAK_BUTTON = registerBlock("stained_oak_button",
            () -> new WoodButtonBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_OAK_DOOR = registerBlock("stained_oak_door",
            () -> new DoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_OAK_SIGN = registerBlockWithoutBlockItem("stained_oak_sign",
            () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_TRAPDOOR = registerBlock("stained_oak_trapdoor",
            () -> new TrapDoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_OAK_WALL_SIGN = registerBlockWithoutBlockItem("stained_oak_wall_sign",
            () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.OAK));

    public static final BlockManager STAINED_SPRUCE = BlockManager.register("stained_spruce_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_SPRUCE_BUTTON = registerBlock("stained_spruce_button",
            () -> new WoodButtonBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_SPRUCE_DOOR = registerBlock("stained_spruce_door",
            () -> new DoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_SPRUCE_SIGN = registerBlockWithoutBlockItem("stained_spruce_sign",
            () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_TRAPDOOR = registerBlock("stained_spruce_trapdoor",
            () -> new TrapDoorBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> STAINED_SPRUCE_WALL_SIGN = registerBlockWithoutBlockItem("stained_spruce_wall_sign",
            () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));

    /* Mossy Stained Planks */
    public static final BlockManager MOSSY_STAINED_ACACIA = BlockManager.register("mossy_stained_acacia_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_BIRCH = BlockManager.register("mossy_stained_birch_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_DARK_OAK = BlockManager.register("mossy_stained_dark_oak_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_JUNGLE = BlockManager.register("mossy_stained_jungle_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_OAK = BlockManager.register("mossy_stained_oak_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_SPRUCE = BlockManager.register("mossy_stained_spruce_planks",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(MOD_PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    

    /* Boards & Shingles */
    public static final BlockManager ACACIA_BOARDS = BlockManager.register("acacia_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BIRCH_BOARDS = BlockManager.register("birch_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager DARK_OAK_BOARDS = BlockManager.register("dark_oak_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager JUNGLE_BOARDS = BlockManager.register("jungle_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager OAK_BOARDS = BlockManager.register("oak_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SPRUCE_BOARDS = BlockManager.register("spruce_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CRIMSON_BOARDS = BlockManager.register("crimson_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WARPED_BOARDS = BlockManager.register("warped_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager ACACIA_SHINGLES = BlockManager.register("acacia_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager BIRCH_SHINGLES = BlockManager.register("birch_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager DARK_OAK_SHINGLES = BlockManager.register("dark_oak_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager JUNGLE_SHINGLES = BlockManager.register("jungle_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager OAK_SHINGLES = BlockManager.register("oak_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager SPRUCE_SHINGLES = BlockManager.register("spruce_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager CRIMSON_SHINGLES = BlockManager.register("crimson_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.CRIMSON_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager WARPED_SHINGLES = BlockManager.register("warped_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.WARPED_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Mossy Boards & Shingles */
    public static final BlockManager MOSSY_ACACIA_BOARDS = BlockManager.register("mossy_acacia_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_BIRCH_BOARDS = BlockManager.register("mossy_birch_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_DARK_OAK_BOARDS = BlockManager.register("mossy_dark_oak_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_JUNGLE_BOARDS = BlockManager.register("mossy_jungle_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_OAK_BOARDS = BlockManager.register("mossy_oak_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_SPRUCE_BOARDS = BlockManager.register("mossy_spruce_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_CRIMSON_BOARDS = BlockManager.register("mossy_crimson_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_WARPED_BOARDS = BlockManager.register("mossy_warped_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager MOSSY_ACACIA_SHINGLES = BlockManager.register("mossy_acacia_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_BIRCH_SHINGLES = BlockManager.register("mossy_birch_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_DARK_OAK_SHINGLES = BlockManager.register("mossy_dark_oak_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_JUNGLE_SHINGLES = BlockManager.register("mossy_jungle_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_OAK_SHINGLES = BlockManager.register("mossy_oak_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_SPRUCE_SHINGLES = BlockManager.register("mossy_spruce_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_CRIMSON_SHINGLES = BlockManager.register("mossy_crimson_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_CRIMSON_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_WARPED_SHINGLES = BlockManager.register("mossy_warped_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_WARPED_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Stained Boards & Shingles */
    public static final BlockManager STAINED_ACACIA_BOARDS = BlockManager.register("stained_acacia_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_BIRCH_BOARDS = BlockManager.register("stained_birch_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_DARK_OAK_BOARDS = BlockManager.register("stained_dark_oak_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_JUNGLE_BOARDS = BlockManager.register("stained_jungle_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_OAK_BOARDS = BlockManager.register("stained_oak_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_SPRUCE_BOARDS = BlockManager.register("stained_spruce_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager STAINED_ACACIA_SHINGLES = BlockManager.register("stained_acacia_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_BIRCH_SHINGLES = BlockManager.register("stained_birch_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_DARK_OAK_SHINGLES = BlockManager.register("stained_dark_oak_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_JUNGLE_SHINGLES = BlockManager.register("stained_jungle_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_OAK_SHINGLES = BlockManager.register("stained_oak_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_SPRUCE_SHINGLES = BlockManager.register("stained_spruce_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Mossy Stained Boards & Shingles */
    public static final BlockManager MOSSY_STAINED_ACACIA_BOARDS = BlockManager.register("mossy_stained_acacia_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_BIRCH_BOARDS = BlockManager.register("mossy_stained_birch_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_DARK_OAK_BOARDS = BlockManager.register("mossy_stained_dark_oak_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_JUNGLE_BOARDS = BlockManager.register("mossy_stained_jungle_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_OAK_BOARDS = BlockManager.register("mossy_stained_oak_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_SPRUCE_BOARDS = BlockManager.register("mossy_stained_spruce_boards",
            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager MOSSY_STAINED_ACACIA_SHINGLES = BlockManager.register("mossy_stained_acacia_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_BIRCH_SHINGLES = BlockManager.register("mossy_stained_birch_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_DARK_OAK_SHINGLES = BlockManager.register("mossy_stained_dark_oak_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_JUNGLE_SHINGLES = BlockManager.register("mossy_stained_jungle_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_OAK_SHINGLES = BlockManager.register("mossy_stained_oak_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_SPRUCE_SHINGLES = BlockManager.register("mossy_stained_spruce_shingle",
            BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Other Roofing Materials */
    public static final BlockManager THATCH = BlockManager.register("thatch",
            BlockProps.GRASS.get().noOcclusion(), CaliberBlockHelper.modifyList(ROOF_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SLATE_TILE = BlockManager.register("slate_tile",
            BlockProps.DEEPSLATE.get().noOcclusion(), () -> Blocks.DEEPSLATE_TILES, ROOF_VARIANTS);
    //    public static final BlockManager SLATE_TILE = BlockManager.register("slate_tile",
//            BlockProps.DEEPSLATE.get().noOcclusion(), CaliberBlockHelper.modifyList(ROOF_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager CLAY_TILE = BlockManager.register("clay_tile",
//            BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(ROOF_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Plaster */
    public static final BlockManager BEIGE_PLASTER = BlockManager.register("beige_plaster",
            BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BROWN_PLASTER = BlockManager.register("brown_plaster",
            BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager OCHRE_PLASTER = BlockManager.register("ochre_plaster",
            BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TAN_PLASTER = BlockManager.register("tan_plaster",
            BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_PLASTER = BlockManager.register("white_plaster",
            BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Plaster Powder */
    public static final RegistryObject<ConcretePowderBlock> BEIGE_PLASTER_POWDER = registerBlock("beige_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.BEIGE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> BROWN_PLASTER_POWDER = registerBlock("brown_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.BROWN_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> OCHRE_PLASTER_POWDER = registerBlock("ochre_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.OCHRE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> TAN_PLASTER_POWDER = registerBlock("tan_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.TAN_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> WHITE_PLASTER_POWDER = registerBlock("white_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.WHITE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));

    /* Beige Plaster Tudor Blocks */
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER = registerTudor("tudor_acacia_beige_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_CORNER = registerTudor("tudor_acacia_beige_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_acacia_beige_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_acacia_beige_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER = registerTudor("tudor_birch_beige_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_CORNER = registerTudor("tudor_birch_beige_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_birch_beige_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_birch_beige_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER = registerTudor("tudor_dark_oak_beige_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_CORNER = registerTudor("tudor_dark_oak_beige_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_dark_oak_beige_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_dark_oak_beige_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER = registerTudor("tudor_jungle_beige_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_CORNER = registerTudor("tudor_jungle_beige_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_jungle_beige_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_jungle_beige_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER = registerTudor("tudor_oak_beige_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_CORNER = registerTudor("tudor_oak_beige_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_oak_beige_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_oak_beige_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER = registerTudor("tudor_spruce_beige_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_CORNER = registerTudor("tudor_spruce_beige_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_spruce_beige_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_spruce_beige_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);

    /* Brown Plaster Tudor Blocks */
    public static final BlockManager TUDOR_ACACIA_BROWN_PLASTER = registerTudor("tudor_acacia_brown_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_BROWN_PLASTER_CORNER = registerTudor("tudor_acacia_brown_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_BROWN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_acacia_brown_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_BROWN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_acacia_brown_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_BIRCH_BROWN_PLASTER = registerTudor("tudor_birch_brown_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_BROWN_PLASTER_CORNER = registerTudor("tudor_birch_brown_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_BROWN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_birch_brown_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_BROWN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_birch_brown_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_BROWN_PLASTER = registerTudor("tudor_dark_oak_brown_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_BROWN_PLASTER_CORNER = registerTudor("tudor_dark_oak_brown_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);

    public static final BlockManager TUDOR_DARK_OAK_BROWN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_dark_oak_brown_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_BROWN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_dark_oak_brown_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_BROWN_PLASTER = registerTudor("tudor_jungle_brown_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_BROWN_PLASTER_CORNER = registerTudor("tudor_jungle_brown_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_BROWN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_jungle_brown_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_BROWN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_jungle_brown_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_OAK_BROWN_PLASTER = registerTudor("tudor_oak_brown_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_BROWN_PLASTER_CORNER = registerTudor("tudor_oak_brown_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_BROWN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_oak_brown_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_BROWN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_oak_brown_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_BROWN_PLASTER = registerTudor("tudor_spruce_brown_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_BROWN_PLASTER_CORNER = registerTudor("tudor_spruce_brown_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_BROWN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_spruce_brown_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_BROWN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_spruce_brown_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);

    /* Ochre Plaster Tudor Blocks */
    public static final BlockManager TUDOR_ACACIA_OCHRE_PLASTER = registerTudor("tudor_acacia_ochre_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_OCHRE_PLASTER_CORNER = registerTudor("tudor_acacia_ochre_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_OCHRE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_acacia_ochre_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_OCHRE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_acacia_ochre_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_BIRCH_OCHRE_PLASTER = registerTudor("tudor_birch_ochre_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_OCHRE_PLASTER_CORNER = registerTudor("tudor_birch_ochre_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_OCHRE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_birch_ochre_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_OCHRE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_birch_ochre_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_OCHRE_PLASTER = registerTudor("tudor_dark_oak_ochre_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_OCHRE_PLASTER_CORNER = registerTudor("tudor_dark_oak_ochre_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_OCHRE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_dark_oak_ochre_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_OCHRE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_dark_oak_ochre_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_OCHRE_PLASTER = registerTudor("tudor_jungle_ochre_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_OCHRE_PLASTER_CORNER = registerTudor("tudor_jungle_ochre_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_OCHRE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_jungle_ochre_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_OCHRE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_jungle_ochre_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_OAK_OCHRE_PLASTER = registerTudor("tudor_oak_ochre_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_OCHRE_PLASTER_CORNER = registerTudor("tudor_oak_ochre_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_OCHRE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_oak_ochre_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_OCHRE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_oak_ochre_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_OCHRE_PLASTER = registerTudor("tudor_spruce_ochre_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_OCHRE_PLASTER_CORNER = registerTudor("tudor_spruce_ochre_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_OCHRE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_spruce_ochre_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_OCHRE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_spruce_ochre_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);

    /* Tan Plaster Tudor Blocks */
    public static final BlockManager TUDOR_ACACIA_TAN_PLASTER = registerTudor("tudor_acacia_tan_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_TAN_PLASTER_CORNER = registerTudor("tudor_acacia_tan_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_TAN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_acacia_tan_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_TAN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_acacia_tan_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_BIRCH_TAN_PLASTER = registerTudor("tudor_birch_tan_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_TAN_PLASTER_CORNER = registerTudor("tudor_birch_tan_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_TAN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_birch_tan_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_TAN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_birch_tan_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_TAN_PLASTER = registerTudor("tudor_dark_oak_tan_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_TAN_PLASTER_CORNER = registerTudor("tudor_dark_oak_tan_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_TAN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_dark_oak_tan_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_TAN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_dark_oak_tan_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_TAN_PLASTER = registerTudor("tudor_jungle_tan_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_TAN_PLASTER_CORNER = registerTudor("tudor_jungle_tan_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_TAN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_jungle_tan_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_TAN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_jungle_tan_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_OAK_TAN_PLASTER = registerTudor("tudor_oak_tan_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_TAN_PLASTER_CORNER = registerTudor("tudor_oak_tan_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_TAN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_oak_tan_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_TAN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_oak_tan_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_TAN_PLASTER = registerTudor("tudor_spruce_tan_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_TAN_PLASTER_CORNER = registerTudor("tudor_spruce_tan_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_TAN_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_spruce_tan_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_TAN_PLASTER_SLAB_VERTICAL = registerTudor("tudor_spruce_tan_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);

    /* White Plaster Tudor Blocks */
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER = registerTudor("tudor_acacia_white_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_CORNER = registerTudor("tudor_acacia_white_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_acacia_white_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_acacia_white_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.ACACIA_PLANKS);
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER = registerTudor("tudor_birch_white_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_CORNER = registerTudor("tudor_birch_white_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_birch_white_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_birch_white_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.BIRCH_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER = registerTudor("tudor_dark_oak_white_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_CORNER = registerTudor("tudor_dark_oak_white_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_dark_oak_white_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_dark_oak_white_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.DARK_OAK_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER = registerTudor("tudor_jungle_white_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_CORNER = registerTudor("tudor_jungle_white_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_jungle_white_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_jungle_white_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.JUNGLE_PLANKS);
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER = registerTudor("tudor_oak_white_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_CORNER = registerTudor("tudor_oak_white_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_oak_white_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_oak_white_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.OAK_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER = registerTudor("tudor_spruce_white_plaster", () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_CORNER = registerTudor("tudor_spruce_white_plaster_corner", () -> new CornerBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_QUARTER_VERTICAL = registerTudor("tudor_spruce_white_plaster_quarter_vertical", () -> new VerticalQuarterBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_SLAB_VERTICAL = registerTudor("tudor_spruce_white_plaster_slab_vertical", () -> new VerticalSlabBlock(BlockProps.HALF_TIMBERED.get()), () -> Blocks.SPRUCE_PLANKS);

    public static void printCounts() {
        System.out.println("Caliber Blocks Registered: " + blockCount);
    }

    public static BlockManager registerTudor(String name, Supplier<Block> block, Supplier<Block> textureFrom) {
        BlockManager.Builder builder = new BlockManager.Builder(name);
        for (ModBlockFamily.Variant variant : CaliberBlockHelper.TUDOR_VARIANTS) {
            builder.addVariant(variant, block, b -> b.stateGen(CaliberBlockHelper.TUDOR.apply(textureFrom)));
        }
        return builder.build();
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn); //CreativeTabs.CALIBER_TAB
        blockCount++;
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
