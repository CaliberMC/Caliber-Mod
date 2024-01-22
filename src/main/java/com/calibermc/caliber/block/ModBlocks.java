package com.calibermc.caliber.block;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.custom.ModStandingSignBlock;
import com.calibermc.caliber.block.custom.ModWallSignBlock;
import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliber.block.custom.entity.KilnBlock;
import com.calibermc.caliber.block.custom.entity.WoodcutterBlock;
import com.calibermc.caliberlib.block.custom.terrain.*;
import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.block.management.CaliberBlockHelper;
import com.calibermc.caliber.block.properties.BlockProps;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.CaliberBlockHelper.*;

public class ModBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Caliber.MOD_ID);

    public static final RegistryObject<Block> WOODCUTTER = registerBlock("woodcutter",
            () -> new WoodcutterBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).noOcclusion().requiresCorrectToolForDrops().strength(3.5F)));

    public static final RegistryObject<Block> KILN = registerBlock("kiln",
            () -> new KilnBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .strength(3.5F).lightLevel((bs) -> bs.getValue(BlockStateProperties.LIT) ? 13 : 0)));

//    public static final RegistryObject<Block> TAPPED_BIRCH_LOG = registerBlock("tapped_birch_log",
//            () -> new TappedBirchLog(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

    // METAL BLOCKS
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockProps.TIN_BLOCK.get()));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () -> new DropExperienceBlock(BlockProps.TIN_ORE.get()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new Block(BlockProps.RAW_TIN.get()));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new DropExperienceBlock(BlockProps.DEEPSLATE_TIN_ORE.get()));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () -> new Block(BlockProps.SILVER_BLOCK.get()));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () -> new DropExperienceBlock(BlockProps.SILVER_ORE.get()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", () -> new Block(BlockProps.RAW_SILVER.get()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", () -> new DropExperienceBlock(BlockProps.DEEPSLATE_SILVER_ORE.get()));

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new Block(BlockProps.BRONZE_BLOCK.get()));

    // TODO: ADD STEEL STUFF

    // TODO: CHECK SETTINGS AND CONFIRM SELECTIONS BELOW
    public static final RegistryObject<Block> REDWOOD_SAPLING = registerBlock("redwood_sapling", () -> new Block(BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> REDWOOD_LOG = registerBlock("redwood_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> REDWOOD_WOOD = registerBlock("redwood_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> REDWOOD_LEAVES = registerBlock("redwood_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));

    public static final RegistryObject<Block> PINE_SAPLING = registerBlock("pine_sapling", () -> new Block(BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> PINE_LOG = registerBlock("pine_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_PINE_LOG = registerBlock("stripped_pine_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> PINE_WOOD = registerBlock("pine_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> PINE_LEAVES = registerBlock("pine_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));

    public static final RegistryObject<Block> FIR_SAPLING = registerBlock("fir_sapling", () -> new Block(BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> FIR_LOG = registerBlock("fir_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_FIR_LOG = registerBlock("stripped_fir_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> FIR_WOOD = registerBlock("fir_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> FIR_LEAVES = registerBlock("fir_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));


    /* Andesite */
    public static final BlockManager ANDESITE = CaliberBlockManager.register("andesite", BlockProps.ANDESITE.get(), () -> Blocks.ANDESITE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_ANDESITE = CaliberBlockManager.register("polished_andesite", BlockProps.POLISHED_ANDESITE.get(), () -> Blocks.POLISHED_ANDESITE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Basalt */
    public static final BlockManager BASALT = CaliberBlockManager.register("basalt", BlockProps.BASALT.get(), () -> Blocks.BASALT, STONE_VARIANTS);
    public static final BlockManager SMOOTH_BASALT = CaliberBlockManager.register("smooth_basalt", BlockProps.SMOOTH_BASALT.get(), () -> Blocks.SMOOTH_BASALT, STONE_VARIANTS);
    public static final BlockManager POLISHED_BASALT = CaliberBlockManager.register("polished_basalt", BlockProps.POLISHED_BASALT.get(), () -> Blocks.POLISHED_BASALT, STONE_VARIANTS);

    /* Blackstone */
    public static final BlockManager BLACKSTONE = CaliberBlockManager.register("blackstone", BlockProps.BLACKSTONE.get(), () -> Blocks.BLACKSTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager GILDED_BLACKSTONE = CaliberBlockManager.register("gilded_blackstone", BlockProps.GILDED_BLACKSTONE.get(), () -> Blocks.GILDED_BLACKSTONE, STONE_VARIANTS);
    public static final BlockManager POLISHED_BLACKSTONE = CaliberBlockManager.register("polished_blackstone", BlockProps.POLISHED_BLACKSTONE.get(), () -> Blocks.POLISHED_BLACKSTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_BLACKSTONE_BRICK = CaliberBlockManager.register("polished_blackstone_brick", BlockProps.POLISHED_BLACKSTONE_BRICK.get(), () -> Blocks.POLISHED_BLACKSTONE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Bricks */
    public static final BlockManager BRICK = CaliberBlockManager.register("brick", BlockProps.BRICK.get(), () -> Blocks.BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Calcite */
    public static final BlockManager CALCITE = CaliberBlockManager.register("calcite", BlockProps.CALCITE.get(), () -> Blocks.CALCITE, STONE_VARIANTS);

    /* Deepslate */
    public static final BlockManager DEEPSLATE = CaliberBlockManager.register("deepslate", BlockProps.DEEPSLATE.get(), () -> Blocks.DEEPSLATE, STONE_VARIANTS);
    public static final BlockManager DEEPSLATE_BRICK = CaliberBlockManager.register("deepslate_brick", BlockProps.DEEPSLATE_BRICK.get(), () -> Blocks.DEEPSLATE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager DEEPSLATE_TILE = CaliberBlockManager.register("deepslate_tile", BlockProps.DEEPSLATE_TILES.get(), () -> Blocks.DEEPSLATE_TILES, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager COBBLED_DEEPSLATE = CaliberBlockManager.register("cobbled_deepslate", BlockProps.COBBLED_DEEPSLATE.get(), () -> Blocks.COBBLED_DEEPSLATE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_DEEPSLATE = CaliberBlockManager.register("polished_deepslate", BlockProps.POLISHED_DEEPSLATE.get(), () -> Blocks.POLISHED_DEEPSLATE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Mossy Deepslate */
//    public static final BlockManager MOSSY_DEEPSLATE = BlockManager.register("mossy_deepslate", BlockProps.DEEPSLATE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_DEEPSLATE_BRICK = BlockManager.register("mossy_deepslate_bricks", BlockProps.DEEPSLATE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_DEEPSLATE_TILE = BlockManager.register("mossy_deepslate_tiles", BlockProps.DEEPSLATE_TILES.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_COBBLED_DEEPSLATE = BlockManager.register("mossy_cobbled_deepslate", BlockProps.COBBLED_DEEPSLATE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_POLISHED_DEEPSLATE = BlockManager.register("mossy_polished_deepslate", BlockProps.POLISHED_DEEPSLATE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Diorite */
    public static final BlockManager DIORITE = CaliberBlockManager.register("diorite", BlockProps.DIORITE.get(), () -> Blocks.DIORITE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_DIORITE = CaliberBlockManager.register("polished_diorite", BlockProps.POLISHED_DIORITE.get(), () -> Blocks.POLISHED_DIORITE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Dripstone */
    public static final BlockManager DRIPSTONE = CaliberBlockManager.register("dripstone", BlockProps.DRIPSTONE_BLOCK.get(), () -> Blocks.DRIPSTONE_BLOCK, STONE_VARIANTS);

    /* End Stone */
    public static final BlockManager END_STONE = CaliberBlockManager.register("end_stone", BlockProps.END_STONE.get(), () -> Blocks.END_STONE, STONE_VARIANTS);
    public static final BlockManager END_STONE_BRICK = CaliberBlockManager.register("end_stone_brick", BlockProps.END_STONE_BRICK.get(), () -> Blocks.END_STONE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Granite */
    public static final BlockManager BLACK_GRANITE = CaliberBlockManager.register("black_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BROWN_GRANITE = CaliberBlockManager.register("brown_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager GRAY_GRANITE = CaliberBlockManager.register("gray_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_GRANITE = CaliberBlockManager.register("pink_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_GRANITE = CaliberBlockManager.register("white_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_GRANITE = CaliberBlockManager.register("red_granite", BlockProps.GRANITE.get(), () -> Blocks.GRANITE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Polished Granite */
    public static final BlockManager POLISHED_BLACK_GRANITE = CaliberBlockManager.register("polished_black_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_BROWN_GRANITE = CaliberBlockManager.register("polished_brown_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_GRAY_GRANITE = CaliberBlockManager.register("polished_gray_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_PINK_GRANITE = CaliberBlockManager.register("polished_pink_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_WHITE_GRANITE = CaliberBlockManager.register("polished_white_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_RED_GRANITE = CaliberBlockManager.register("polished_red_granite", BlockProps.GRANITE.get(), () -> Blocks.POLISHED_GRANITE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Limestone */
    public static final BlockManager DARK_LIMESTONE = CaliberBlockManager.registerStoneWithLoot("dark_limestone", () -> ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock());
    public static final BlockManager LIGHT_LIMESTONE = CaliberBlockManager.registerStoneWithLoot("light_limestone", () -> ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock());
    public static final BlockManager PINK_LIMESTONE = CaliberBlockManager.registerStoneWithLoot("pink_limestone", () -> ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock());
    public static final BlockManager TAN_LIMESTONE = CaliberBlockManager.registerStoneWithLoot("tan_limestone", () -> ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock());
    public static final BlockManager LIMESTONE = CaliberBlockManager.register("limestone", BlockProps.LIMESTONE.get(), () -> Blocks.STONE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Cobbled Limestone */
    public static final BlockManager COBBLED_DARK_LIMESTONE = CaliberBlockManager.register("cobbled_dark_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_LIGHT_LIMESTONE = CaliberBlockManager.register("cobbled_light_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_PINK_LIMESTONE = CaliberBlockManager.register("cobbled_pink_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_TAN_LIMESTONE = CaliberBlockManager.register("cobbled_tan_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_LIMESTONE = CaliberBlockManager.register("cobbled_limestone", BlockProps.COBBLESTONE.get(), () -> Blocks.COBBLESTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Mossy Cobbled Limestone */
    public static final BlockManager MOSSY_COBBLED_DARK_LIMESTONE = CaliberBlockManager.register("mossy_cobbled_dark_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_LIGHT_LIMESTONE = CaliberBlockManager.register("mossy_cobbled_light_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_PINK_LIMESTONE = CaliberBlockManager.register("mossy_cobbled_pink_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_TAN_LIMESTONE = CaliberBlockManager.register("mossy_cobbled_tan_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_LIMESTONE = CaliberBlockManager.register("mossy_cobbled_limestone", BlockProps.COBBLESTONE.get(), () -> Blocks.MOSSY_COBBLESTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Limestone Bricks */
    public static final BlockManager DARK_LIMESTONE_BRICK = CaliberBlockManager.register("dark_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager LIGHT_LIMESTONE_BRICK = CaliberBlockManager.register("light_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_LIMESTONE_BRICK = CaliberBlockManager.register("pink_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TAN_LIMESTONE_BRICK = CaliberBlockManager.register("tan_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager LIMESTONE_BRICK = CaliberBlockManager.register("limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.STONE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Mossy Limestone Bricks */
    public static final BlockManager MOSSY_DARK_LIMESTONE_BRICK = CaliberBlockManager.register("mossy_dark_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_LIGHT_LIMESTONE_BRICK = CaliberBlockManager.register("mossy_light_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_PINK_LIMESTONE_BRICK = CaliberBlockManager.register("mossy_pink_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_TAN_LIMESTONE_BRICK = CaliberBlockManager.register("mossy_tan_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_LIMESTONE_BRICK = CaliberBlockManager.register("mossy_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.MOSSY_STONE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Cracked Limestone Bricks*/
    public static final BlockManager CRACKED_DARK_LIMESTONE_BRICKS = CaliberBlockManager.registerOneBlock("cracked_dark_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_LIGHT_LIMESTONE_BRICKS = CaliberBlockManager.registerOneBlock("cracked_light_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_PINK_LIMESTONE_BRICKS = CaliberBlockManager.registerOneBlock("cracked_pink_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_TAN_LIMESTONE_BRICKS = CaliberBlockManager.registerOneBlock("cracked_tan_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));

    /* Chiseled Limestone Bricks*/
    public static final BlockManager CHISELED_DARK_LIMESTONE_BRICKS = CaliberBlockManager.registerOneBlock("chiseled_dark_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_LIGHT_LIMESTONE_BRICKS = CaliberBlockManager.registerOneBlock("chiseled_light_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_PINK_LIMESTONE_BRICKS = CaliberBlockManager.registerOneBlock("chiseled_pink_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_TAN_LIMESTONE_BRICKS = CaliberBlockManager.registerOneBlock("chiseled_tan_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));

    /* Smooth Limestone */
    public static final BlockManager SMOOTH_DARK_LIMESTONE = CaliberBlockManager.register("smooth_dark_limestone", BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_LIGHT_LIMESTONE = CaliberBlockManager.register("smooth_light_limestone", BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_PINK_LIMESTONE = CaliberBlockManager.register("smooth_pink_limestone", BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_TAN_LIMESTONE = CaliberBlockManager.register("smooth_tan_limestone", BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_LIMESTONE = CaliberBlockManager.register("smooth_limestone", BlockProps.SMOOTH_LIMESTONE.get(), () -> Blocks.SMOOTH_STONE, STONE_VARIANTS);

    /* Marble */
    public static final BlockManager BLACK_MARBLE = CaliberBlockManager.register("black_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager GRAY_MARBLE = CaliberBlockManager.register("gray_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_MARBLE = CaliberBlockManager.register("pink_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_MARBLE = CaliberBlockManager.register("red_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_MARBLE = CaliberBlockManager.register("white_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Polished Marble */
    public static final BlockManager POLISHED_BLACK_MARBLE = CaliberBlockManager.register("polished_black_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_GRAY_MARBLE = CaliberBlockManager.register("polished_gray_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_PINK_MARBLE = CaliberBlockManager.register("polished_pink_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_RED_MARBLE = CaliberBlockManager.register("polished_red_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_WHITE_MARBLE = CaliberBlockManager.register("polished_white_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Netherite */
    public static final BlockManager NETHERITE = CaliberBlockManager.register("netherite", BlockProps.NETHERITE.get(), () -> Blocks.NETHERITE_BLOCK, STONE_VARIANTS);

    /* Nether Bricks */
    public static final BlockManager NETHER_BRICK = CaliberBlockManager.register("nether_brick", BlockProps.NETHER_BRICK.get(), () -> Blocks.NETHER_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager RED_NETHER_BRICK = CaliberBlockManager.register("red_nether_brick", BlockProps.NETHER_BRICK.get(), () -> Blocks.RED_NETHER_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Obsidian */
    public static final BlockManager OBSIDIAN = CaliberBlockManager.register("obsidian", BlockProps.OBSIDIAN.get(), () -> Blocks.OBSIDIAN, STONE_VARIANTS);

    /* Prismarine */
    public static final BlockManager PRISMARINE = CaliberBlockManager.register("prismarine", BlockProps.PRISMARINE.get(), () -> Blocks.PRISMARINE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager PRISMARINE_BRICK = CaliberBlockManager.register("prismarine_brick", BlockProps.PRISMARINE.get(), () -> Blocks.PRISMARINE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS);
    public static final BlockManager DARK_PRISMARINE = CaliberBlockManager.register("dark_prismarine", BlockProps.PRISMARINE.get(), () -> Blocks.DARK_PRISMARINE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Purpur */
    public static final BlockManager PURPUR = CaliberBlockManager.register("purpur", BlockProps.PURPUR.get(), () -> Blocks.PURPUR_BLOCK, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Quartz */
    public static final BlockManager QUARTZ = CaliberBlockManager.register("quartz", BlockProps.QUARTZ.get(), () -> Blocks.QUARTZ_BLOCK, STONE_VARIANTS_WITHOUT_STAIRS);
    public static final BlockManager QUARTZ_BRICKS = CaliberBlockManager.register("quartz_bricks", BlockProps.QUARTZ.get(), () -> Blocks.QUARTZ_BRICKS, STONE_VARIANTS);
    public static final BlockManager SMOOTH_QUARTZ = CaliberBlockManager.register("smooth_quartz", BlockProps.SMOOTH_QUARTZ.get(), () -> Blocks.SMOOTH_QUARTZ, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Sandstone */
    public static final BlockManager BROWN_SANDSTONE = CaliberBlockManager.register("brown_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager ORANGE_SANDSTONE = CaliberBlockManager.register("orange_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_SANDSTONE = CaliberBlockManager.register("red_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.RED_SANDSTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager SANDSTONE = CaliberBlockManager.register("sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.SANDSTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Chiseled Sandstone */
    public static final BlockManager CHISELED_BROWN_SANDSTONE = CaliberBlockManager.registerOneBlock("chiseled_brown_sandstone", () -> new Block(BlockProps.SANDSTONE.get()));
    public static final BlockManager CHISELED_ORANGE_SANDSTONE = CaliberBlockManager.registerOneBlock("chiseled_orange_sandstone", () -> new Block(BlockProps.SANDSTONE.get()));

    /* Cut Sandstone */
    public static final BlockManager CUT_BROWN_SANDSTONE = CaliberBlockManager.register("cut_brown_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CUT_ORANGE_SANDSTONE = CaliberBlockManager.register("cut_orange_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CUT_RED_SANDSTONE = CaliberBlockManager.register("cut_red_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.CUT_RED_SANDSTONE, STONE_VARIANTS);
    public static final BlockManager CUT_SANDSTONE = CaliberBlockManager.register("cut_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.CUT_SANDSTONE, STONE_VARIANTS);

    /* Smooth Sandstone */
    public static final BlockManager SMOOTH_BROWN_SANDSTONE = CaliberBlockManager.register("smooth_brown_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_ORANGE_SANDSTONE = CaliberBlockManager.register("smooth_orange_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_RED_SANDSTONE = CaliberBlockManager.register("smooth_red_sandstone", BlockProps.SMOOTH_SANDSTONE.get(), () -> Blocks.SMOOTH_RED_SANDSTONE, STONE_VARIANTS_WITHOUT_STAIRS);
    public static final BlockManager SMOOTH_SANDSTONE = CaliberBlockManager.register("smooth_sandstone", BlockProps.SMOOTH_SANDSTONE.get(), () -> Blocks.SMOOTH_SANDSTONE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Tuff */
    public static final BlockManager TUFF = CaliberBlockManager.register("tuff", BlockProps.TUFF.get(), () -> Blocks.TUFF, STONE_VARIANTS);

    /* Sand */  //TODO Add to Block Manager
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand", () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> BROWN_SAND = registerBlock("brown_sand", () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> ORANGE_SAND = registerBlock("orange_sand", () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> WHITE_SAND = registerBlock("white_sand", () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> BLACK_SAND_LAYER = registerBlock("black_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> BROWN_SAND_LAYER = registerBlock("brown_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> ORANGE_SAND_LAYER = registerBlock("orange_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> RED_SAND_LAYER = registerBlock("red_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> SOUL_SAND_LAYER = registerBlock("soul_sand_layer", () -> new SoulSandLayerBlock(BlockProps.SOUL_SAND.get()));
    public static final RegistryObject<Block> SAND_LAYER = registerBlock("sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> WHITE_SAND_LAYER = registerBlock("white_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    
    /* Other Terrain */  //TODO Add to Block Manager
    public static final RegistryObject<Block> CLAY_LAYER = registerBlock("clay_layer", () -> new TerrainLayerBlock(BlockProps.CLAY.get()));
    public static final RegistryObject<Block> COARSE_DIRT_LAYER = registerBlock("coarse_dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> DIRT_LAYER = registerBlock("dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
//    public static final RegistryObject<Block> FARMLAND_LAYER = registerBlock("farmland_layer", () -> new TerrainLayerBlock(BlockProps.FARMLAND.get()));
    public static final RegistryObject<Block> GRASS_LAYER = registerBlock("grass_layer", () -> new GrassLayerBlock(BlockProps.GRASS.get()));
    public static final RegistryObject<Block> GRAVEL_LAYER = registerBlock("gravel_layer", () -> new FallingLayerBlock(BlockProps.GRAVEL.get()));
    public static final RegistryObject<Block> MYCELIUM_LAYER = registerBlock("mycelium_layer", () -> new MyceliumLayerBlock(BlockProps.MYCELIUM.get()));
    public static final RegistryObject<Block> PODZOL_LAYER = registerBlock("podzol_layer", () -> new TerrainLayerBlock(BlockProps.PODZOL.get()));
    public static final RegistryObject<Block> ROOTED_DIRT_LAYER = registerBlock("rooted_dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> SOUL_SOIL_LAYER = registerBlock("soul_soil_layer", () -> new TerrainLayerBlock(BlockProps.SOUL_SOIL.get()));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_LAYER = registerBlock("crimson_nylium_layer", () -> new NyliumLayerBlock(BlockProps.CRIMSON_NYLIUM.get()));
    public static final RegistryObject<Block> WARPED_NYLIUM_LAYER = registerBlock("warped_nylium_layer", () -> new NyliumLayerBlock(BlockProps.WARPED_NYLIUM.get()));

    /* Planks */
    public static final BlockManager ACACIA = CaliberBlockManager.register("acacia_planks", BlockProps.PLANK.get(), () -> Blocks.ACACIA_PLANKS, PLANK_VARIANTS_WITHOUT_FENCES_STAIRS);
    public static final BlockManager BIRCH = CaliberBlockManager.register("birch_planks", BlockProps.PLANK.get(), () -> Blocks.BIRCH_PLANKS, PLANK_VARIANTS_WITHOUT_FENCES_STAIRS);
    public static final BlockManager DARK_OAK = CaliberBlockManager.register("dark_oak_planks", BlockProps.PLANK.get(), () -> Blocks.DARK_OAK_PLANKS, PLANK_VARIANTS_WITHOUT_FENCES_STAIRS);
    public static final BlockManager JUNGLE = CaliberBlockManager.register("jungle_planks", BlockProps.PLANK.get(), () -> Blocks.JUNGLE_PLANKS, PLANK_VARIANTS_WITHOUT_FENCES_STAIRS);
    public static final BlockManager OAK = CaliberBlockManager.register("oak_planks", BlockProps.PLANK.get(), () -> Blocks.OAK_PLANKS, PLANK_VARIANTS_WITHOUT_FENCES_STAIRS);
    public static final BlockManager SPRUCE = CaliberBlockManager.register("spruce_planks", BlockProps.PLANK.get(), () -> Blocks.SPRUCE_PLANKS, PLANK_VARIANTS_WITHOUT_FENCES_STAIRS);
    public static final BlockManager CRIMSON = CaliberBlockManager.register("crimson_planks", BlockProps.PLANK.get(), () -> Blocks.CRIMSON_PLANKS, PLANK_VARIANTS_WITHOUT_FENCES_STAIRS);
    public static final BlockManager WARPED = CaliberBlockManager.register("warped_planks", BlockProps.PLANK.get(), () -> Blocks.WARPED_PLANKS, PLANK_VARIANTS_WITHOUT_FENCES_STAIRS);

    public static final RegistryObject<Block> TALL_ACACIA_DOOR = registerBlock("tall_acacia_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    public static final RegistryObject<Block> TALL_BIRCH_DOOR = registerBlock("tall_birch_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));
    public static final RegistryObject<Block> TALL_DARK_OAK_DOOR = registerBlock("tall_dark_oak_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));
    public static final RegistryObject<Block> TALL_JUNGLE_DOOR = registerBlock("tall_jungle_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));
    public static final RegistryObject<Block> TALL_OAK_DOOR = registerBlock("tall_oak_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_SPRUCE_DOOR = registerBlock("tall_spruce_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> TALL_CRIMSON_DOOR = registerBlock("tall_crimson_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.CRIMSON));
    public static final RegistryObject<Block> TALL_WARPED_DOOR = registerBlock("tall_warped_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.WARPED));

    /* Mossy Planks */
    public static final BlockManager MOSSY_ACACIA = CaliberBlockManager.register("mossy_acacia_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_BIRCH = CaliberBlockManager.register("mossy_birch_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_DARK_OAK = CaliberBlockManager.register("mossy_dark_oak_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_JUNGLE = CaliberBlockManager.register("mossy_jungle_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_OAK = CaliberBlockManager.register("mossy_oak_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_SPRUCE = CaliberBlockManager.register("mossy_spruce_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_CRIMSON = CaliberBlockManager.register("mossy_crimson_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_WARPED = CaliberBlockManager.register("mossy_warped_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Stained Planks */
    public static final BlockManager STAINED_ACACIA = CaliberBlockManager.register("stained_acacia_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_ACACIA_BUTTON = registerBlock("stained_acacia_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA, 30, true));
    public static final RegistryObject<Block> STAINED_ACACIA_DOOR = registerBlock("stained_acacia_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_SIGN = registerBlockWithoutBlockItem("stained_acacia_sign", () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_TRAPDOOR = registerBlock("stained_acacia_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_WALL_SIGN = registerBlockWithoutBlockItem("stained_acacia_wall_sign", () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> TALL_STAINED_ACACIA_DOOR = registerBlock("tall_stained_acacia_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    
    public static final BlockManager STAINED_BIRCH = CaliberBlockManager.register("stained_birch_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_BIRCH_BUTTON = registerBlock("stained_birch_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH, 30, true));
    public static final RegistryObject<Block> STAINED_BIRCH_DOOR = registerBlock("stained_birch_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_SIGN = registerBlockWithoutBlockItem("stained_birch_sign", () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_TRAPDOOR = registerBlock("stained_birch_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_WALL_SIGN = registerBlockWithoutBlockItem("stained_birch_wall_sign", () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> TALL_STAINED_BIRCH_DOOR = registerBlock("tall_stained_birch_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));

    public static final BlockManager STAINED_DARK_OAK = CaliberBlockManager.register("stained_dark_oak_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_DARK_OAK_BUTTON = registerBlock("stained_dark_oak_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK, 30, true));
    public static final RegistryObject<Block> STAINED_DARK_OAK_DOOR = registerBlock("stained_dark_oak_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_sign", () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_TRAPDOOR = registerBlock("stained_dark_oak_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_WALL_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_wall_sign", () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> TALL_STAINED_DARK_OAK_DOOR = registerBlock("tall_stained_dark_oak_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));

    public static final BlockManager STAINED_JUNGLE = CaliberBlockManager.register("stained_jungle_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_JUNGLE_BUTTON = registerBlock("stained_jungle_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE, 30, true));
    public static final RegistryObject<Block> STAINED_JUNGLE_DOOR = registerBlock("stained_jungle_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_SIGN = registerBlockWithoutBlockItem("stained_jungle_sign", () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_TRAPDOOR = registerBlock("stained_jungle_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_WALL_SIGN = registerBlockWithoutBlockItem("stained_jungle_wall_sign", () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> TALL_STAINED_JUNGLE_DOOR = registerBlock("tall_stained_jungle_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));

    public static final BlockManager STAINED_OAK = CaliberBlockManager.register("stained_oak_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_OAK_BUTTON = registerBlock("stained_oak_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> STAINED_OAK_DOOR = registerBlock("stained_oak_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_SIGN = registerBlockWithoutBlockItem("stained_oak_sign", () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_TRAPDOOR = registerBlock("stained_oak_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_WALL_SIGN = registerBlockWithoutBlockItem("stained_oak_wall_sign", () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> TALL_STAINED_OAK_DOOR = registerBlock("tall_stained_oak_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));

    public static final BlockManager STAINED_SPRUCE = CaliberBlockManager.register("stained_spruce_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_SPRUCE_BUTTON = registerBlock("stained_spruce_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE, 30, true));
    public static final RegistryObject<Block> STAINED_SPRUCE_DOOR = registerBlock("stained_spruce_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_SIGN = registerBlockWithoutBlockItem("stained_spruce_sign", () -> new ModStandingSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_TRAPDOOR = registerBlock("stained_spruce_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_WALL_SIGN = registerBlockWithoutBlockItem("stained_spruce_wall_sign", () -> new ModWallSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> TALL_STAINED_SPRUCE_DOOR = registerBlock("tall_stained_spruce_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));

    /* Mossy Stained Planks */
    public static final BlockManager MOSSY_STAINED_ACACIA = CaliberBlockManager.register("mossy_stained_acacia_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_BIRCH = CaliberBlockManager.register("mossy_stained_birch_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_DARK_OAK = CaliberBlockManager.register("mossy_stained_dark_oak_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_JUNGLE = CaliberBlockManager.register("mossy_stained_jungle_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_OAK = CaliberBlockManager.register("mossy_stained_oak_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_SPRUCE = CaliberBlockManager.register("mossy_stained_spruce_planks", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Stripped Wood */
    public static final BlockManager STRIPPED_ACACIA = CaliberBlockManager.register("stripped_acacia_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_ACACIA_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_BIRCH = CaliberBlockManager.register("stripped_birch_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_BIRCH_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_DARK_OAK = CaliberBlockManager.register("stripped_dark_oak_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_DARK_OAK_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_JUNGLE = CaliberBlockManager.register("stripped_jungle_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_JUNGLE_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_OAK = CaliberBlockManager.register("stripped_oak_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_OAK_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_SPRUCE = CaliberBlockManager.register("stripped_spruce_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_SPRUCE_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_CRIMSON = CaliberBlockManager.register("stripped_crimson_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_CRIMSON_HYPHAE, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_WARPED = CaliberBlockManager.register("stripped_warped_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_WARPED_HYPHAE, STRIPPED_WOOD_VARIANTS);

    /* Stained Stripped Wood */
    public static final BlockManager STAINED_STRIPPED_ACACIA = CaliberBlockManager.register("stained_stripped_acacia_wood", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_BIRCH = CaliberBlockManager.register("stained_stripped_birch_wood", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_DARK_OAK = CaliberBlockManager.register("stained_stripped_dark_oak_wood", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_JUNGLE = CaliberBlockManager.register("stained_stripped_jungle_wood", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_OAK = CaliberBlockManager.register("stained_stripped_oak_wood", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_SPRUCE = CaliberBlockManager.register("stained_stripped_spruce_wood", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Boards & Shingles */
    public static final BlockManager ACACIA_BOARDS = CaliberBlockManager.register("acacia_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BIRCH_BOARDS = CaliberBlockManager.register("birch_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager DARK_OAK_BOARDS = CaliberBlockManager.register("dark_oak_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager JUNGLE_BOARDS = CaliberBlockManager.register("jungle_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager OAK_BOARDS = CaliberBlockManager.register("oak_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SPRUCE_BOARDS = CaliberBlockManager.register("spruce_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CRIMSON_BOARDS = CaliberBlockManager.register("crimson_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WARPED_BOARDS = CaliberBlockManager.register("warped_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager ACACIA_SHINGLES = CaliberBlockManager.register("acacia_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager BIRCH_SHINGLES = CaliberBlockManager.register("birch_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager DARK_OAK_SHINGLES = CaliberBlockManager.register("dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager JUNGLE_SHINGLES = CaliberBlockManager.register("jungle_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager OAK_SHINGLES = CaliberBlockManager.register("oak_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager SPRUCE_SHINGLES = CaliberBlockManager.register("spruce_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager CRIMSON_SHINGLES = CaliberBlockManager.register("crimson_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.CRIMSON_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager WARPED_SHINGLES = CaliberBlockManager.register("warped_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.WARPED_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Mossy Boards & Shingles */
    public static final BlockManager MOSSY_ACACIA_BOARDS = CaliberBlockManager.register("mossy_acacia_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_BIRCH_BOARDS = CaliberBlockManager.register("mossy_birch_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_DARK_OAK_BOARDS = CaliberBlockManager.register("mossy_dark_oak_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_JUNGLE_BOARDS = CaliberBlockManager.register("mossy_jungle_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_OAK_BOARDS = CaliberBlockManager.register("mossy_oak_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_SPRUCE_BOARDS = CaliberBlockManager.register("mossy_spruce_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_CRIMSON_BOARDS = CaliberBlockManager.register("mossy_crimson_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_WARPED_BOARDS = CaliberBlockManager.register("mossy_warped_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager MOSSY_ACACIA_SHINGLES = CaliberBlockManager.register("mossy_acacia_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_BIRCH_SHINGLES = CaliberBlockManager.register("mossy_birch_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_DARK_OAK_SHINGLES = CaliberBlockManager.register("mossy_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_JUNGLE_SHINGLES = CaliberBlockManager.register("mossy_jungle_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_OAK_SHINGLES = CaliberBlockManager.register("mossy_oak_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_SPRUCE_SHINGLES = CaliberBlockManager.register("mossy_spruce_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_CRIMSON_SHINGLES = CaliberBlockManager.register("mossy_crimson_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_CRIMSON_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_WARPED_SHINGLES = CaliberBlockManager.register("mossy_warped_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_WARPED_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Stained Boards & Shingles */
    public static final BlockManager STAINED_ACACIA_BOARDS = CaliberBlockManager.register("stained_acacia_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_BIRCH_BOARDS = CaliberBlockManager.register("stained_birch_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_DARK_OAK_BOARDS = CaliberBlockManager.register("stained_dark_oak_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_JUNGLE_BOARDS = CaliberBlockManager.register("stained_jungle_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_OAK_BOARDS = CaliberBlockManager.register("stained_oak_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_SPRUCE_BOARDS = CaliberBlockManager.register("stained_spruce_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager STAINED_ACACIA_SHINGLES = CaliberBlockManager.register("stained_acacia_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_BIRCH_SHINGLES = CaliberBlockManager.register("stained_birch_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_DARK_OAK_SHINGLES = CaliberBlockManager.register("stained_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_JUNGLE_SHINGLES = CaliberBlockManager.register("stained_jungle_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_OAK_SHINGLES = CaliberBlockManager.register("stained_oak_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_SPRUCE_SHINGLES = CaliberBlockManager.register("stained_spruce_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.STAINED_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Mossy Stained Boards & Shingles */
    public static final BlockManager MOSSY_STAINED_ACACIA_BOARDS = CaliberBlockManager.register("mossy_stained_acacia_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_BIRCH_BOARDS = CaliberBlockManager.register("mossy_stained_birch_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_DARK_OAK_BOARDS = CaliberBlockManager.register("mossy_stained_dark_oak_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_JUNGLE_BOARDS = CaliberBlockManager.register("mossy_stained_jungle_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_OAK_BOARDS = CaliberBlockManager.register("mossy_stained_oak_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_SPRUCE_BOARDS = CaliberBlockManager.register("mossy_stained_spruce_boards", BlockProps.PLANK.get(), CaliberBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager MOSSY_STAINED_ACACIA_SHINGLES = CaliberBlockManager.register("mossy_stained_acacia_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_BIRCH_SHINGLES = CaliberBlockManager.register("mossy_stained_birch_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_DARK_OAK_SHINGLES = CaliberBlockManager.register("mossy_stained_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_JUNGLE_SHINGLES = CaliberBlockManager.register("mossy_stained_jungle_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_OAK_SHINGLES = CaliberBlockManager.register("mossy_stained_oak_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_SPRUCE_SHINGLES = CaliberBlockManager.register("mossy_stained_spruce_shingle", BlockProps.PLANK_NO_OC.get(), ModBlocks.MOSSY_STAINED_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Other Roofing Materials */
    public static final BlockManager THATCH = CaliberBlockManager.register("thatch", BlockProps.GRASS.get().noOcclusion(), CaliberBlockHelper.modifyList(THATCH_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SLATE_TILE = CaliberBlockManager.register("slate_tile", BlockProps.DEEPSLATE.get().noOcclusion(), () -> Blocks.DEEPSLATE_TILES, ROOF_VARIANTS);

    public static final BlockManager MOSSY_THATCH = CaliberBlockManager.register("mossy_thatch", BlockProps.GRASS.get().noOcclusion(), CaliberBlockHelper.modifyList(THATCH_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_SLATE_TILE = BlockManager.register("mossy_slate_tile", BlockProps.DEEPSLATE.get().noOcclusion(), () -> Blocks.DEEPSLATE_TILES, ROOF_VARIANTS);


    /* Concrete */
    public static final BlockManager BLACK_CONCRETE = CaliberBlockManager.register("black_concrete", BlockProps.CONCRETE.get(), () -> Blocks.BLACK_CONCRETE, STONE_VARIANTS);
    public static final BlockManager BLUE_CONCRETE = CaliberBlockManager.register("blue_concrete", BlockProps.CONCRETE.get(), () -> Blocks.BLUE_CONCRETE, STONE_VARIANTS);
    public static final BlockManager BROWN_CONCRETE = CaliberBlockManager.register("brown_concrete", BlockProps.CONCRETE.get(), () -> Blocks.BROWN_CONCRETE, STONE_VARIANTS);
    public static final BlockManager CYAN_CONCRETE = CaliberBlockManager.register("cyan_concrete", BlockProps.CONCRETE.get(), () -> Blocks.CYAN_CONCRETE, STONE_VARIANTS);
    public static final BlockManager GRAY_CONCRETE = CaliberBlockManager.register("gray_concrete", BlockProps.CONCRETE.get(), () -> Blocks.GRAY_CONCRETE, STONE_VARIANTS);
    public static final BlockManager GREEN_CONCRETE = CaliberBlockManager.register("green_concrete", BlockProps.CONCRETE.get(), () -> Blocks.GREEN_CONCRETE, STONE_VARIANTS);
    public static final BlockManager LIGHT_BLUE_CONCRETE = CaliberBlockManager.register("light_blue_concrete", BlockProps.CONCRETE.get(), () -> Blocks.LIGHT_BLUE_CONCRETE, STONE_VARIANTS);
    public static final BlockManager LIGHT_GRAY_CONCRETE = CaliberBlockManager.register("light_gray_concrete", BlockProps.CONCRETE.get(), () -> Blocks.LIGHT_GRAY_CONCRETE, STONE_VARIANTS);
    public static final BlockManager LIME_CONCRETE = CaliberBlockManager.register("lime_concrete", BlockProps.CONCRETE.get(), () -> Blocks.LIME_CONCRETE, STONE_VARIANTS);
    public static final BlockManager MAGENTA_CONCRETE = CaliberBlockManager.register("magenta_concrete", BlockProps.CONCRETE.get(), () -> Blocks.MAGENTA_CONCRETE, STONE_VARIANTS);
    public static final BlockManager ORANGE_CONCRETE = CaliberBlockManager.register("orange_concrete", BlockProps.CONCRETE.get(), () -> Blocks.ORANGE_CONCRETE, STONE_VARIANTS);
    public static final BlockManager PINK_CONCRETE = CaliberBlockManager.register("pink_concrete", BlockProps.CONCRETE.get(), () -> Blocks.PINK_CONCRETE, STONE_VARIANTS);
    public static final BlockManager PURPLE_CONCRETE = CaliberBlockManager.register("purple_concrete", BlockProps.CONCRETE.get(), () -> Blocks.PURPLE_CONCRETE, STONE_VARIANTS);
    public static final BlockManager RED_CONCRETE = CaliberBlockManager.register("red_concrete", BlockProps.CONCRETE.get(), () -> Blocks.RED_CONCRETE, STONE_VARIANTS);
    public static final BlockManager WHITE_CONCRETE = CaliberBlockManager.register("white_concrete", BlockProps.CONCRETE.get(), () -> Blocks.WHITE_CONCRETE, STONE_VARIANTS);
    public static final BlockManager YELLOW_CONCRETE = CaliberBlockManager.register("yellow_concrete", BlockProps.CONCRETE.get(), () -> Blocks.YELLOW_CONCRETE, STONE_VARIANTS);

    /* Terracotta */
    public static final BlockManager TERRACOTTA = CaliberBlockManager.register("terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager BLACK_TERRACOTTA = CaliberBlockManager.register("black_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.BLACK_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager BLUE_TERRACOTTA = CaliberBlockManager.register("blue_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.BLUE_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager BROWN_TERRACOTTA = CaliberBlockManager.register("brown_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.BROWN_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager CYAN_TERRACOTTA = CaliberBlockManager.register("cyan_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.CYAN_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager GRAY_TERRACOTTA = CaliberBlockManager.register("gray_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.GRAY_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager GREEN_TERRACOTTA = CaliberBlockManager.register("green_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.GREEN_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager LIGHT_BLUE_TERRACOTTA = CaliberBlockManager.register("light_blue_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.LIGHT_BLUE_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager LIGHT_GRAY_TERRACOTTA = CaliberBlockManager.register("light_gray_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.LIGHT_GRAY_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager LIME_TERRACOTTA = CaliberBlockManager.register("lime_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.LIME_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager MAGENTA_TERRACOTTA = CaliberBlockManager.register("magenta_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.MAGENTA_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager ORANGE_TERRACOTTA = CaliberBlockManager.register("orange_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.ORANGE_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager PINK_TERRACOTTA = CaliberBlockManager.register("pink_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.PINK_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager PURPLE_TERRACOTTA = CaliberBlockManager.register("purple_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.PURPLE_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager RED_TERRACOTTA = CaliberBlockManager.register("red_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.RED_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager WHITE_TERRACOTTA = CaliberBlockManager.register("white_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.WHITE_TERRACOTTA, TERRACOTTA_VARIANTS);
    public static final BlockManager YELLOW_TERRACOTTA = CaliberBlockManager.register("yellow_terracotta", BlockProps.TERRACOTTA.get(), () -> Blocks.YELLOW_TERRACOTTA, TERRACOTTA_VARIANTS);

    /* Wool */
    public static final BlockManager BLACK_WOOL = CaliberBlockManager.register("black_wool", BlockProps.WOOL.get(), () -> Blocks.BLACK_WOOL, WOOL_VARIANTS);
    public static final BlockManager BLUE_WOOL = CaliberBlockManager.register("blue_wool", BlockProps.WOOL.get(), () -> Blocks.BLUE_WOOL, WOOL_VARIANTS);
    public static final BlockManager BROWN_WOOL = CaliberBlockManager.register("brown_wool", BlockProps.WOOL.get(), () -> Blocks.BROWN_WOOL, WOOL_VARIANTS);
    public static final BlockManager CYAN_WOOL = CaliberBlockManager.register("cyan_wool", BlockProps.WOOL.get(), () -> Blocks.CYAN_WOOL, WOOL_VARIANTS);
    public static final BlockManager GRAY_WOOL = CaliberBlockManager.register("gray_wool", BlockProps.WOOL.get(), () -> Blocks.GRAY_WOOL, WOOL_VARIANTS);
    public static final BlockManager GREEN_WOOL = CaliberBlockManager.register("green_wool", BlockProps.WOOL.get(), () -> Blocks.GREEN_WOOL, WOOL_VARIANTS);
    public static final BlockManager LIGHT_BLUE_WOOL = CaliberBlockManager.register("light_blue_wool", BlockProps.WOOL.get(), () -> Blocks.LIGHT_BLUE_WOOL, WOOL_VARIANTS);
    public static final BlockManager LIGHT_GRAY_WOOL = CaliberBlockManager.register("light_gray_wool", BlockProps.WOOL.get(), () -> Blocks.LIGHT_GRAY_WOOL, WOOL_VARIANTS);
    public static final BlockManager LIME_WOOL = CaliberBlockManager.register("lime_wool", BlockProps.WOOL.get(), () -> Blocks.LIME_WOOL, WOOL_VARIANTS);
    public static final BlockManager MAGENTA_WOOL = CaliberBlockManager.register("magenta_wool", BlockProps.WOOL.get(), () -> Blocks.MAGENTA_WOOL, WOOL_VARIANTS);
    public static final BlockManager ORANGE_WOOL = CaliberBlockManager.register("orange_wool", BlockProps.WOOL.get(), () -> Blocks.ORANGE_WOOL, WOOL_VARIANTS);
    public static final BlockManager PINK_WOOL = CaliberBlockManager.register("pink_wool", BlockProps.WOOL.get(), () -> Blocks.PINK_WOOL, WOOL_VARIANTS);
    public static final BlockManager PURPLE_WOOL = CaliberBlockManager.register("purple_wool", BlockProps.WOOL.get(), () -> Blocks.PURPLE_WOOL, WOOL_VARIANTS);
    public static final BlockManager RED_WOOL = CaliberBlockManager.register("red_wool", BlockProps.WOOL.get(), () -> Blocks.RED_WOOL, WOOL_VARIANTS);
    public static final BlockManager WHITE_WOOL = CaliberBlockManager.register("white_wool", BlockProps.WOOL.get(), () -> Blocks.WHITE_WOOL, WOOL_VARIANTS);
    public static final BlockManager YELLOW_WOOL = CaliberBlockManager.register("yellow_wool", BlockProps.WOOL.get(), () -> Blocks.YELLOW_WOOL, WOOL_VARIANTS);

    /* Plaster */
    public static final BlockManager BEIGE_PLASTER = CaliberBlockManager.register("beige_plaster", BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BROWN_PLASTER = CaliberBlockManager.register("brown_plaster", BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager OCHRE_PLASTER = CaliberBlockManager.register("ochre_plaster", BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TAN_PLASTER = CaliberBlockManager.register("tan_plaster", BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_PLASTER = CaliberBlockManager.register("white_plaster", BlockProps.PLASTER.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Plaster Powder */
    public static final RegistryObject<ConcretePowderBlock> BEIGE_PLASTER_POWDER = registerBlock("beige_plaster_powder", () -> new ConcretePowderBlock(ModBlocks.BEIGE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> BROWN_PLASTER_POWDER = registerBlock("brown_plaster_powder", () -> new ConcretePowderBlock(ModBlocks.BROWN_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> OCHRE_PLASTER_POWDER = registerBlock("ochre_plaster_powder", () -> new ConcretePowderBlock(ModBlocks.OCHRE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> TAN_PLASTER_POWDER = registerBlock("tan_plaster_powder", () -> new ConcretePowderBlock(ModBlocks.TAN_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> WHITE_PLASTER_POWDER = registerBlock("white_plaster_powder", () -> new ConcretePowderBlock(ModBlocks.WHITE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));

    /* Beige Plaster Tudor Blocks */
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_acacia_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_acacia_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_acacia_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_acacia_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_acacia_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_acacia_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_acacia_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_acacia_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_acacia_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_birch_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_birch_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_birch_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_birch_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_birch_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_birch_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_birch_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_birch_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_birch_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_dark_oak_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_jungle_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_jungle_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_jungle_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_jungle_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_jungle_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_jungle_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_jungle_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_jungle_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_jungle_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_oak_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_oak_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_oak_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_oak_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_oak_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_oak_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_oak_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_oak_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_oak_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_spruce_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_spruce_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_spruce_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_spruce_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_spruce_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_spruce_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_spruce_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_spruce_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_spruce_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* White Plaster Tudor Blocks */
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_acacia_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_acacia_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_acacia_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_acacia_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_acacia_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_acacia_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_acacia_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_acacia_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_acacia_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_birch_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_birch_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_birch_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_birch_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_birch_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_birch_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_birch_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_birch_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_birch_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_dark_oak_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_dark_oak_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_dark_oak_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_dark_oak_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_dark_oak_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_dark_oak_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_dark_oak_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_dark_oak_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_dark_oak_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_jungle_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_jungle_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_jungle_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_jungle_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_jungle_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_jungle_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_jungle_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_jungle_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_jungle_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_oak_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_oak_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_oak_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_oak_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_oak_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_oak_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_oak_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_oak_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_oak_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_spruce_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_spruce_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_spruce_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_spruce_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_spruce_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_spruce_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_spruce_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_spruce_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_spruce_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Stained Beige Plaster Tudor Blocks */
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_acacia_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_birch_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_dark_oak_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_jungle_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_oak_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_spruce_beige_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Stained White Plaster Tudor Blocks */
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_acacia_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_birch_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_birch_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_birch_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_birch_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_birch_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_birch_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_birch_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_birch_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_birch_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_dark_oak_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_jungle_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_oak_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_oak_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_oak_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_oak_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_oak_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_oak_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_oak_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_oak_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_oak_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_CROSS = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_cross", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_DOWN = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_down", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_LEFT = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_left", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_RIGHT = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_right", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_UP = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_up", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_1 = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_h_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_2 = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_h_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_1 = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_v_1", BlockProps.TUDOR_1.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_2 = CaliberBlockManager.register("tudor_stained_spruce_white_plaster_v_2", BlockProps.TUDOR_2.get(), CaliberBlockHelper.modifyList(CaliberBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    
    public static void printBlockCounts() {
        System.out.println("Caliber Blocks Registered: " + blockCount);
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
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
