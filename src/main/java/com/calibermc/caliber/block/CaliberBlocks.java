package com.calibermc.caliber.block;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.item.CaliberItems;
import com.calibermc.caliber.block.custom.entity.WoodcutterBlock;
import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.block.properties.BlockProps;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;

public class CaliberBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Caliber.MOD_ID);

    public static final RegistryObject<Block> WOODCUTTER = registerBlock("woodcutter",
            () -> new WoodcutterBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).noOcclusion().requiresCorrectToolForDrops().strength(3.5F)));


    /* Andesite */
    public static final BlockManager ANDESITE = CaliberBlockManager.register("andesite", BlockProps.ANDESITE.get(), () -> Blocks.ANDESITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager POLISHED_ANDESITE = CaliberBlockManager.register("polished_andesite", BlockProps.POLISHED_ANDESITE.get(), () -> Blocks.POLISHED_ANDESITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);

    /* Basalt */
    public static final BlockManager BASALT = CaliberBlockManager.register("basalt", BlockProps.BASALT.get(), () -> Blocks.BASALT, STONE_VARIANTS);
    public static final BlockManager SMOOTH_BASALT = CaliberBlockManager.register("smooth_basalt", BlockProps.SMOOTH_BASALT.get(), () -> Blocks.SMOOTH_BASALT, STONE_VARIANTS);
    public static final BlockManager POLISHED_BASALT = CaliberBlockManager.register("polished_basalt", BlockProps.POLISHED_BASALT.get(), () -> Blocks.POLISHED_BASALT, STONE_VARIANTS);

    /* Blackstone */
    public static final BlockManager BLACKSTONE = CaliberBlockManager.register("blackstone", BlockProps.BLACKSTONE.get(), () -> Blocks.BLACKSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager GILDED_BLACKSTONE = CaliberBlockManager.register("gilded_blackstone", BlockProps.GILDED_BLACKSTONE.get(), () -> Blocks.GILDED_BLACKSTONE, STONE_VARIANTS);
    public static final BlockManager POLISHED_BLACKSTONE = CaliberBlockManager.register("polished_blackstone", BlockProps.POLISHED_BLACKSTONE.get(), () -> Blocks.POLISHED_BLACKSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager POLISHED_BLACKSTONE_BRICK = CaliberBlockManager.register("polished_blackstone_brick", BlockProps.POLISHED_BLACKSTONE_BRICK.get(), () -> Blocks.POLISHED_BLACKSTONE_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager CHISELED_POLISHED_BLACKSTONE = CaliberBlockManager.register("chiseled_polished_blackstone", BlockProps.POLISHED_BLACKSTONE.get(), () -> Blocks.CHISELED_POLISHED_BLACKSTONE, STONE_VARIANTS);
    public static final BlockManager CRACKED_POLISHED_BLACKSTONE_BRICK = CaliberBlockManager.register("cracked_polished_blackstone_brick", BlockProps.POLISHED_BLACKSTONE_BRICK.get(), () -> Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, STONE_VARIANTS);


    /* Bricks */
    public static final BlockManager BRICK = CaliberBlockManager.register("brick", BlockProps.BRICK.get(), () -> Blocks.BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);

    /* Calcite */
    public static final BlockManager CALCITE = CaliberBlockManager.register("calcite", BlockProps.CALCITE.get(), () -> Blocks.CALCITE, STONE_VARIANTS);

    /* Deepslate */
    public static final BlockManager DEEPSLATE = CaliberBlockManager.register("deepslate", BlockProps.DEEPSLATE.get(), () -> Blocks.DEEPSLATE, STONE_VARIANTS);
    public static final BlockManager DEEPSLATE_BRICK = CaliberBlockManager.register("deepslate_brick", BlockProps.DEEPSLATE_BRICK.get(), () -> Blocks.DEEPSLATE_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager CRACKED_DEEPSLATE_BRICK = CaliberBlockManager.register("cracked_deepslate_brick", BlockProps.DEEPSLATE_BRICK.get(), () -> Blocks.CRACKED_DEEPSLATE_BRICKS, STONE_VARIANTS);
    public static final BlockManager DEEPSLATE_TILE = CaliberBlockManager.register("deepslate_tile", BlockProps.DEEPSLATE_TILES.get(), () -> Blocks.DEEPSLATE_TILES, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager CRACKED_DEEPSLATE_TILE = CaliberBlockManager.register("cracked_deepslate_tile", BlockProps.DEEPSLATE_TILES.get(), () -> Blocks.CRACKED_DEEPSLATE_TILES, STONE_VARIANTS);
    public static final BlockManager COBBLED_DEEPSLATE = CaliberBlockManager.register("cobbled_deepslate", BlockProps.COBBLED_DEEPSLATE.get(), () -> Blocks.COBBLED_DEEPSLATE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager CHISELED_DEEPSLATE = CaliberBlockManager.register("chiseled_deepslate", BlockProps.POLISHED_DEEPSLATE.get(), () -> Blocks.CHISELED_DEEPSLATE, STONE_VARIANTS);
    public static final BlockManager POLISHED_DEEPSLATE = CaliberBlockManager.register("polished_deepslate", BlockProps.POLISHED_DEEPSLATE.get(), () -> Blocks.POLISHED_DEEPSLATE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);

    /* Diorite */
    public static final BlockManager DIORITE = CaliberBlockManager.register("diorite", BlockProps.DIORITE.get(), () -> Blocks.DIORITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager POLISHED_DIORITE = CaliberBlockManager.register("polished_diorite", BlockProps.POLISHED_DIORITE.get(), () -> Blocks.POLISHED_DIORITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);

    /* Dripstone */
    public static final BlockManager DRIPSTONE = CaliberBlockManager.register("dripstone", BlockProps.DRIPSTONE_BLOCK.get(), () -> Blocks.DRIPSTONE_BLOCK, STONE_VARIANTS);

    /* End Stone */
    public static final BlockManager END_STONE = CaliberBlockManager.register("end_stone", BlockProps.END_STONE.get(), () -> Blocks.END_STONE, STONE_VARIANTS);
    public static final BlockManager END_STONE_BRICK = CaliberBlockManager.register("end_stone_brick", BlockProps.END_STONE_BRICK.get(), () -> Blocks.END_STONE_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);

    /* Granite */
    public static final BlockManager GRANITE = CaliberBlockManager.register("granite", BlockProps.GRANITE.get(), () -> Blocks.GRANITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager POLISHED_GRANITE = CaliberBlockManager.register("polished_granite", BlockProps.GRANITE.get(), () -> Blocks.POLISHED_GRANITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);

    /* Mud Brick */
    public static final BlockManager MUD_BRICK = CaliberBlockManager.register("mud_brick", BlockProps.MUD_BRICK.get(), () -> Blocks.MUD_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);

    /* Netherite */
    public static final BlockManager NETHERITE = CaliberBlockManager.register("netherite", BlockProps.NETHERITE.get(), () -> Blocks.NETHERITE_BLOCK, STONE_VARIANTS);

    /* Nether Bricks */
    public static final BlockManager NETHER_BRICK = CaliberBlockManager.register("nether_brick", BlockProps.NETHER_BRICK.get(), () -> Blocks.NETHER_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager RED_NETHER_BRICK = CaliberBlockManager.register("red_nether_brick", BlockProps.NETHER_BRICK.get(), () -> Blocks.RED_NETHER_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);

    /* Obsidian */
    public static final BlockManager OBSIDIAN = CaliberBlockManager.register("obsidian", BlockProps.OBSIDIAN.get(), () -> Blocks.OBSIDIAN, STONE_VARIANTS);

    /* Prismarine */
    public static final BlockManager PRISMARINE = CaliberBlockManager.register("prismarine", BlockProps.PRISMARINE.get(), () -> Blocks.PRISMARINE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager PRISMARINE_BRICK = CaliberBlockManager.register("prismarine_brick", BlockProps.PRISMARINE.get(), () -> Blocks.PRISMARINE_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager DARK_PRISMARINE = CaliberBlockManager.register("dark_prismarine", BlockProps.PRISMARINE.get(), () -> Blocks.DARK_PRISMARINE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);

    /* Purpur */
    public static final BlockManager PURPUR = CaliberBlockManager.register("purpur", BlockProps.PURPUR.get(), () -> Blocks.PURPUR_BLOCK, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
//    public static final BlockManager PURPUR_PILLAR = CaliberBlockManager.register("purpur_pillar", BlockProps.PURPUR.get(), () -> Blocks.PURPUR_PILLAR, STONE_VARIANTS_WITHOUT_SLAB);

    /* Quartz */
    public static final BlockManager QUARTZ = CaliberBlockManager.register("quartz", BlockProps.QUARTZ.get(), () -> Blocks.QUARTZ_BLOCK, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager QUARTZ_BRICKS = CaliberBlockManager.register("quartz_bricks", BlockProps.QUARTZ.get(), () -> Blocks.QUARTZ_BRICKS, STONE_VARIANTS);
    public static final BlockManager SMOOTH_QUARTZ = CaliberBlockManager.register("smooth_quartz", BlockProps.SMOOTH_QUARTZ.get(), () -> Blocks.SMOOTH_QUARTZ, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);

    /* Sandstone */
    public static final BlockManager RED_SANDSTONE = CaliberBlockManager.register("red_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.RED_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager SANDSTONE = CaliberBlockManager.register("sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager SMOOTH_RED_SANDSTONE = CaliberBlockManager.register("smooth_red_sandstone", BlockProps.SMOOTH_SANDSTONE.get(), () -> Blocks.SMOOTH_RED_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager SMOOTH_SANDSTONE = CaliberBlockManager.register("smooth_sandstone", BlockProps.SMOOTH_SANDSTONE.get(), () -> Blocks.SMOOTH_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager CUT_RED_SANDSTONE = CaliberBlockManager.register("cut_red_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.CUT_RED_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB);
    public static final BlockManager CUT_SANDSTONE = CaliberBlockManager.register("cut_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.CUT_SANDSTONE, STONE_VARIANTS_WITHOUT_SLAB);
    public static final BlockManager CHISELED_RED_SANDSTONE = CaliberBlockManager.register("chiseled_red_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.CHISELED_RED_SANDSTONE, STONE_VARIANTS);
    public static final BlockManager CHISELED_SANDSTONE = CaliberBlockManager.register("chiseled_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.CHISELED_SANDSTONE, STONE_VARIANTS);

    /* Stone */
    public static final BlockManager STONE = CaliberBlockManager.register("stone", BlockProps.LIMESTONE.get(), () -> Blocks.STONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager COBBLESTONE = CaliberBlockManager.register("cobblestone", BlockProps.COBBLESTONE.get(), () -> Blocks.COBBLESTONE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager STONE_BRICK = CaliberBlockManager.register("stone_bricks", BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.STONE_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager CRACKED_STONE_BRICK = CaliberBlockManager.register("cracked_stone_bricks", BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.CRACKED_STONE_BRICKS, STONE_VARIANTS);
    public static final BlockManager CHISELED_STONE_BRICK = CaliberBlockManager.register("chiseled_stone_bricks", BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.CHISELED_STONE_BRICKS, STONE_VARIANTS);
    public static final BlockManager MOSSY_STONE_BRICK = CaliberBlockManager.register("mossy_stone_bricks", BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.MOSSY_STONE_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager MOSSY_COBBLESTONE = CaliberBlockManager.register("mossy_cobblestone", BlockProps.COBBLESTONE.get(), () -> Blocks.MOSSY_STONE_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS_WALL);
    public static final BlockManager SMOOTH_STONE = CaliberBlockManager.register("smooth_stone", BlockProps.LIMESTONE.get(), () -> Blocks.SMOOTH_STONE, STONE_VARIANTS);

    /* Tuff */
    public static final BlockManager TUFF = CaliberBlockManager.register("tuff", BlockProps.TUFF.get(), () -> Blocks.TUFF, STONE_VARIANTS);

    /* Planks */
    public static final BlockManager ACACIA = CaliberBlockManager.register("acacia_planks", BlockProps.PLANK.get(), () -> Blocks.ACACIA_PLANKS, PLANK_VARIANTS); //PLANK_VARIANTS
    public static final BlockManager BAMBOO = CaliberBlockManager.register("bamboo_planks", BlockProps.PLANK.get(), () -> Blocks.BAMBOO_PLANKS, PLANK_VARIANTS);
    public static final BlockManager BAMBOO_MOSAIC = CaliberBlockManager.register("bamboo_mosaic", BlockProps.PLANK.get(), () -> Blocks.BAMBOO_MOSAIC, COMPAT_PLANK_VARIANTS);
    public static final BlockManager BIRCH = CaliberBlockManager.register("birch_planks", BlockProps.PLANK.get(), () -> Blocks.BIRCH_PLANKS, PLANK_VARIANTS);
    public static final BlockManager CHERRY = CaliberBlockManager.register("cherry_planks", BlockProps.PLANK.get(), () -> Blocks.CHERRY_PLANKS, PLANK_VARIANTS);
    public static final BlockManager DARK_OAK = CaliberBlockManager.register("dark_oak_planks", BlockProps.PLANK.get(), () -> Blocks.DARK_OAK_PLANKS, PLANK_VARIANTS);
    public static final BlockManager JUNGLE = CaliberBlockManager.register("jungle_planks", BlockProps.PLANK.get(), () -> Blocks.JUNGLE_PLANKS, PLANK_VARIANTS);
    public static final BlockManager MANGROVE = CaliberBlockManager.register("mangrove_planks", BlockProps.PLANK.get(), () -> Blocks.MANGROVE_PLANKS, PLANK_VARIANTS);
    public static final BlockManager OAK = CaliberBlockManager.register("oak_planks", BlockProps.PLANK.get(), () -> Blocks.OAK_PLANKS, PLANK_VARIANTS);
    public static final BlockManager SPRUCE = CaliberBlockManager.register("spruce_planks", BlockProps.PLANK.get(), () -> Blocks.SPRUCE_PLANKS, PLANK_VARIANTS);
    public static final BlockManager CRIMSON = CaliberBlockManager.register("crimson_planks", BlockProps.PLANK.get(), () -> Blocks.CRIMSON_PLANKS, PLANK_VARIANTS);
    public static final BlockManager WARPED = CaliberBlockManager.register("warped_planks", BlockProps.PLANK.get(), () -> Blocks.WARPED_PLANKS, PLANK_VARIANTS);

    /* Stripped Wood */
    public static final BlockManager STRIPPED_ACACIA = CaliberBlockManager.register("stripped_acacia_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_ACACIA_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_BAMBOO = CaliberBlockManager.register("stripped_bamboo_block", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_BAMBOO_BLOCK, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_BIRCH = CaliberBlockManager.register("stripped_birch_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_BIRCH_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_CHERRY = CaliberBlockManager.register("stripped_cherry_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_CHERRY_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_DARK_OAK = CaliberBlockManager.register("stripped_dark_oak_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_DARK_OAK_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_JUNGLE = CaliberBlockManager.register("stripped_jungle_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_JUNGLE_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_MANGROVE = CaliberBlockManager.register("stripped_mangrove_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_MANGROVE_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_OAK = CaliberBlockManager.register("stripped_oak_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_OAK_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_SPRUCE = CaliberBlockManager.register("stripped_spruce_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_SPRUCE_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_CRIMSON = CaliberBlockManager.register("stripped_crimson_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_CRIMSON_HYPHAE, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_WARPED = CaliberBlockManager.register("stripped_warped_wood", BlockProps.PLANK.get(), () -> Blocks.STRIPPED_WARPED_HYPHAE, STRIPPED_WOOD_VARIANTS);

    /* Roofing Materials */
    public static final BlockManager ACACIA_SHINGLES = CaliberBlockManager.register("acacia_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.ACACIA_PLANKS, ROOF_VARIANTS);
    public static final BlockManager BAMBOO_SHINGLES = CaliberBlockManager.register("bamboo_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.BAMBOO_PLANKS, ROOF_VARIANTS);
    public static final BlockManager BIRCH_SHINGLES = CaliberBlockManager.register("birch_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks. BIRCH_PLANKS, ROOF_VARIANTS);
    public static final BlockManager CHERRY_SHINGLES = CaliberBlockManager.register("cherry_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.CHERRY_PLANKS, ROOF_VARIANTS);
    public static final BlockManager DARK_OAK_SHINGLES = CaliberBlockManager.register("dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.DARK_OAK_PLANKS, ROOF_VARIANTS);
    public static final BlockManager JUNGLE_SHINGLES = CaliberBlockManager.register("jungle_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.JUNGLE_PLANKS, ROOF_VARIANTS);
    public static final BlockManager MANGROVE_SHINGLES = CaliberBlockManager.register("mangrove_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.MANGROVE_PLANKS, ROOF_VARIANTS);
    public static final BlockManager OAK_SHINGLES = CaliberBlockManager.register("oak_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.OAK_PLANKS, ROOF_VARIANTS);
    public static final BlockManager SPRUCE_SHINGLES = CaliberBlockManager.register("spruce_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.SPRUCE_PLANKS, ROOF_VARIANTS);
    public static final BlockManager CRIMSON_SHINGLES = CaliberBlockManager.register("crimson_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.CRIMSON_PLANKS, ROOF_VARIANTS);
    public static final BlockManager WARPED_SHINGLES = CaliberBlockManager.register("warped_shingle", BlockProps.PLANK_NO_OC.get(), () -> Blocks.WARPED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager SLATE_TILE = CaliberBlockManager.register("slate_tile", BlockProps.DEEPSLATE.get().noOcclusion(), () -> Blocks.DEEPSLATE_TILES, ROOF_VARIANTS);

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

    
    public static void printBlockCounts() {
        System.out.println("Caliber Blocks Registered: " + blockCount);
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

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return CaliberItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
