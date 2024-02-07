package com.calibermc.caliber.block;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.custom.CaliberHangingSignBlock;
import com.calibermc.caliber.block.custom.CaliberStandingSignBlock;
import com.calibermc.caliber.block.custom.CaliberWallHangingSignBlock;
import com.calibermc.caliber.block.custom.CaliberWallSignBlock;
import com.calibermc.caliber.item.CaliberItems;
import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliber.block.custom.entity.WoodcutterBlock;
import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.block.management.ModBlockHelper;
import com.calibermc.caliber.block.properties.BlockProps;
import com.calibermc.caliberlib.data.ModBlockFamily;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
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

//    public static final RegistryObject<Block> TAPPED_BIRCH_LOG = registerBlock("tapped_birch_log",
//            () -> new TappedBirchLog(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));




    // TODO: ADD STEEL STUFF

    // TODO: CHECK SETTINGS AND CONFIRM SELECTIONS BELOW

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
//    public static final BlockManager MOSSY_DEEPSLATE = BlockManager.register("mossy_deepslate", BlockProps.DEEPSLATE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_DEEPSLATE_BRICK = BlockManager.register("mossy_deepslate_bricks", BlockProps.DEEPSLATE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_DEEPSLATE_TILE = BlockManager.register("mossy_deepslate_tiles", BlockProps.DEEPSLATE_TILES.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_COBBLED_DEEPSLATE = BlockManager.register("mossy_cobbled_deepslate", BlockProps.COBBLED_DEEPSLATE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager MOSSY_POLISHED_DEEPSLATE = BlockManager.register("mossy_polished_deepslate", BlockProps.POLISHED_DEEPSLATE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Diorite */
    public static final BlockManager DIORITE = CaliberBlockManager.register("diorite", BlockProps.DIORITE.get(), () -> Blocks.DIORITE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager POLISHED_DIORITE = CaliberBlockManager.register("polished_diorite", BlockProps.POLISHED_DIORITE.get(), () -> Blocks.POLISHED_DIORITE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Dripstone */
    public static final BlockManager DRIPSTONE = CaliberBlockManager.register("dripstone", BlockProps.DRIPSTONE_BLOCK.get(), () -> Blocks.DRIPSTONE_BLOCK, STONE_VARIANTS);

    /* End Stone */
    public static final BlockManager END_STONE = CaliberBlockManager.register("end_stone", BlockProps.END_STONE.get(), () -> Blocks.END_STONE, STONE_VARIANTS);
    public static final BlockManager END_STONE_BRICK = CaliberBlockManager.register("end_stone_brick", BlockProps.END_STONE_BRICK.get(), () -> Blocks.END_STONE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

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

    /* Tuff */
    public static final BlockManager TUFF = CaliberBlockManager.register("tuff", BlockProps.TUFF.get(), () -> Blocks.TUFF, STONE_VARIANTS);

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
    public static final BlockManager MOSSY_ACACIA = CaliberBlockManager.register("mossy_acacia_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_BIRCH = CaliberBlockManager.register("mossy_birch_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_DARK_OAK = CaliberBlockManager.register("mossy_dark_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_JUNGLE = CaliberBlockManager.register("mossy_jungle_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_OAK = CaliberBlockManager.register("mossy_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_SPRUCE = CaliberBlockManager.register("mossy_spruce_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_CRIMSON = CaliberBlockManager.register("mossy_crimson_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_WARPED = CaliberBlockManager.register("mossy_warped_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Stained Planks */
    public static final BlockManager STAINED_ACACIA = CaliberBlockManager.register("stained_acacia_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_ACACIA_BUTTON = registerBlock("stained_acacia_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA, 30, true));
    public static final RegistryObject<Block> STAINED_ACACIA_DOOR = registerBlock("stained_acacia_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_HANGING_SIGN = registerBlockWithoutBlockItem("stained_acacia_hanging_sign", () -> new CaliberHangingSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_SIGN = registerBlockWithoutBlockItem("stained_acacia_sign", () -> new CaliberStandingSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_TRAPDOOR = registerBlock("stained_acacia_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_acacia_wall_hanging_sign", () -> new CaliberWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_WALL_SIGN = registerBlockWithoutBlockItem("stained_acacia_wall_sign", () -> new CaliberWallSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> TALL_STAINED_ACACIA_DOOR = registerBlock("tall_stained_acacia_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    
    public static final BlockManager STAINED_BIRCH = CaliberBlockManager.register("stained_birch_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_BIRCH_BUTTON = registerBlock("stained_birch_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH, 30, true));
    public static final RegistryObject<Block> STAINED_BIRCH_DOOR = registerBlock("stained_birch_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_HANGING_SIGN = registerBlockWithoutBlockItem("stained_birch_hanging_sign", () -> new CaliberHangingSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_SIGN = registerBlockWithoutBlockItem("stained_birch_sign", () -> new CaliberStandingSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_TRAPDOOR = registerBlock("stained_birch_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_birch_wall_hanging_sign", () -> new CaliberWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_WALL_SIGN = registerBlockWithoutBlockItem("stained_birch_wall_sign", () -> new CaliberWallSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> TALL_STAINED_BIRCH_DOOR = registerBlock("tall_stained_birch_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));

    public static final BlockManager STAINED_DARK_OAK = CaliberBlockManager.register("stained_dark_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_DARK_OAK_BUTTON = registerBlock("stained_dark_oak_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK, 30, true));
    public static final RegistryObject<Block> STAINED_DARK_OAK_DOOR = registerBlock("stained_dark_oak_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_HANGING_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_hanging_sign", () -> new CaliberHangingSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_sign", () -> new CaliberStandingSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_TRAPDOOR = registerBlock("stained_dark_oak_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_wall_hanging_sign", () -> new CaliberWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_WALL_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_wall_sign", () -> new CaliberWallSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> TALL_STAINED_DARK_OAK_DOOR = registerBlock("tall_stained_dark_oak_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));

    public static final BlockManager STAINED_JUNGLE = CaliberBlockManager.register("stained_jungle_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_JUNGLE_BUTTON = registerBlock("stained_jungle_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE, 30, true));
    public static final RegistryObject<Block> STAINED_JUNGLE_DOOR = registerBlock("stained_jungle_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_HANGING_SIGN = registerBlockWithoutBlockItem("stained_jungle_hanging_sign", () -> new CaliberHangingSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_SIGN = registerBlockWithoutBlockItem("stained_jungle_sign", () -> new CaliberStandingSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_TRAPDOOR = registerBlock("stained_jungle_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_jungle_wall_hanging_sign", () -> new CaliberWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_WALL_SIGN = registerBlockWithoutBlockItem("stained_jungle_wall_sign", () -> new CaliberWallSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> TALL_STAINED_JUNGLE_DOOR = registerBlock("tall_stained_jungle_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));

    public static final BlockManager STAINED_OAK = CaliberBlockManager.register("stained_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_OAK_BUTTON = registerBlock("stained_oak_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> STAINED_OAK_DOOR = registerBlock("stained_oak_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_HANGING_SIGN = registerBlockWithoutBlockItem("stained_oak_hanging_sign", () -> new CaliberHangingSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_SIGN = registerBlockWithoutBlockItem("stained_oak_sign", () -> new CaliberStandingSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_TRAPDOOR = registerBlock("stained_oak_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_oak_wall_hanging_sign", () -> new CaliberWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_WALL_SIGN = registerBlockWithoutBlockItem("stained_oak_wall_sign", () -> new CaliberWallSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> TALL_STAINED_OAK_DOOR = registerBlock("tall_stained_oak_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));

    public static final BlockManager STAINED_SPRUCE = CaliberBlockManager.register("stained_spruce_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_SPRUCE_BUTTON = registerBlock("stained_spruce_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE, 30, true));
    public static final RegistryObject<Block> STAINED_SPRUCE_DOOR = registerBlock("stained_spruce_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_HANGING_SIGN = registerBlockWithoutBlockItem("stained_spruce_hanging_sign", () -> new CaliberHangingSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_SIGN = registerBlockWithoutBlockItem("stained_spruce_sign", () -> new CaliberStandingSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_TRAPDOOR = registerBlock("stained_spruce_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_spruce_wall_hanging_sign", () -> new CaliberWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_WALL_SIGN = registerBlockWithoutBlockItem("stained_spruce_wall_sign", () -> new CaliberWallSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> TALL_STAINED_SPRUCE_DOOR = registerBlock("tall_stained_spruce_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));

    /* Mossy Stained Planks */
    public static final BlockManager MOSSY_STAINED_ACACIA = CaliberBlockManager.register("mossy_stained_acacia_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_BIRCH = CaliberBlockManager.register("mossy_stained_birch_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_DARK_OAK = CaliberBlockManager.register("mossy_stained_dark_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_JUNGLE = CaliberBlockManager.register("mossy_stained_jungle_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_OAK = CaliberBlockManager.register("mossy_stained_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_SPRUCE = CaliberBlockManager.register("mossy_stained_spruce_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

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
    public static final BlockManager STAINED_STRIPPED_ACACIA = CaliberBlockManager.register("stained_stripped_acacia_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_BIRCH = CaliberBlockManager.register("stained_stripped_birch_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_DARK_OAK = CaliberBlockManager.register("stained_stripped_dark_oak_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_JUNGLE = CaliberBlockManager.register("stained_stripped_jungle_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_OAK = CaliberBlockManager.register("stained_stripped_oak_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_SPRUCE = CaliberBlockManager.register("stained_stripped_spruce_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Boards & Shingles */
    public static final BlockManager ACACIA_BOARDS = CaliberBlockManager.register("acacia_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BIRCH_BOARDS = CaliberBlockManager.register("birch_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager DARK_OAK_BOARDS = CaliberBlockManager.register("dark_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager JUNGLE_BOARDS = CaliberBlockManager.register("jungle_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager OAK_BOARDS = CaliberBlockManager.register("oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SPRUCE_BOARDS = CaliberBlockManager.register("spruce_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CRIMSON_BOARDS = CaliberBlockManager.register("crimson_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WARPED_BOARDS = CaliberBlockManager.register("warped_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager ACACIA_SHINGLES = CaliberBlockManager.register("acacia_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager BIRCH_SHINGLES = CaliberBlockManager.register("birch_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager DARK_OAK_SHINGLES = CaliberBlockManager.register("dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager JUNGLE_SHINGLES = CaliberBlockManager.register("jungle_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager OAK_SHINGLES = CaliberBlockManager.register("oak_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager SPRUCE_SHINGLES = CaliberBlockManager.register("spruce_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager CRIMSON_SHINGLES = CaliberBlockManager.register("crimson_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.CRIMSON_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager WARPED_SHINGLES = CaliberBlockManager.register("warped_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.WARPED_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Mossy Boards & Shingles */
    public static final BlockManager MOSSY_ACACIA_BOARDS = CaliberBlockManager.register("mossy_acacia_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_BIRCH_BOARDS = CaliberBlockManager.register("mossy_birch_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_DARK_OAK_BOARDS = CaliberBlockManager.register("mossy_dark_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_JUNGLE_BOARDS = CaliberBlockManager.register("mossy_jungle_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_OAK_BOARDS = CaliberBlockManager.register("mossy_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_SPRUCE_BOARDS = CaliberBlockManager.register("mossy_spruce_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_CRIMSON_BOARDS = CaliberBlockManager.register("mossy_crimson_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_WARPED_BOARDS = CaliberBlockManager.register("mossy_warped_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager MOSSY_ACACIA_SHINGLES = CaliberBlockManager.register("mossy_acacia_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_BIRCH_SHINGLES = CaliberBlockManager.register("mossy_birch_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_DARK_OAK_SHINGLES = CaliberBlockManager.register("mossy_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_JUNGLE_SHINGLES = CaliberBlockManager.register("mossy_jungle_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_OAK_SHINGLES = CaliberBlockManager.register("mossy_oak_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_SPRUCE_SHINGLES = CaliberBlockManager.register("mossy_spruce_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_CRIMSON_SHINGLES = CaliberBlockManager.register("mossy_crimson_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_CRIMSON_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_WARPED_SHINGLES = CaliberBlockManager.register("mossy_warped_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_WARPED_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Stained Boards & Shingles */
    public static final BlockManager STAINED_ACACIA_BOARDS = CaliberBlockManager.register("stained_acacia_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_BIRCH_BOARDS = CaliberBlockManager.register("stained_birch_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_DARK_OAK_BOARDS = CaliberBlockManager.register("stained_dark_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_JUNGLE_BOARDS = CaliberBlockManager.register("stained_jungle_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_OAK_BOARDS = CaliberBlockManager.register("stained_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_SPRUCE_BOARDS = CaliberBlockManager.register("stained_spruce_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager STAINED_ACACIA_SHINGLES = CaliberBlockManager.register("stained_acacia_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.STAINED_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_BIRCH_SHINGLES = CaliberBlockManager.register("stained_birch_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.STAINED_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_DARK_OAK_SHINGLES = CaliberBlockManager.register("stained_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.STAINED_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_JUNGLE_SHINGLES = CaliberBlockManager.register("stained_jungle_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.STAINED_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_OAK_SHINGLES = CaliberBlockManager.register("stained_oak_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.STAINED_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_SPRUCE_SHINGLES = CaliberBlockManager.register("stained_spruce_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.STAINED_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Mossy Stained Boards & Shingles */
    public static final BlockManager MOSSY_STAINED_ACACIA_BOARDS = CaliberBlockManager.register("mossy_stained_acacia_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_BIRCH_BOARDS = CaliberBlockManager.register("mossy_stained_birch_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_DARK_OAK_BOARDS = CaliberBlockManager.register("mossy_stained_dark_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_JUNGLE_BOARDS = CaliberBlockManager.register("mossy_stained_jungle_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_OAK_BOARDS = CaliberBlockManager.register("mossy_stained_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_SPRUCE_BOARDS = CaliberBlockManager.register("mossy_stained_spruce_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager MOSSY_STAINED_ACACIA_SHINGLES = CaliberBlockManager.register("mossy_stained_acacia_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_STAINED_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_BIRCH_SHINGLES = CaliberBlockManager.register("mossy_stained_birch_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_STAINED_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_DARK_OAK_SHINGLES = CaliberBlockManager.register("mossy_stained_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_STAINED_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_JUNGLE_SHINGLES = CaliberBlockManager.register("mossy_stained_jungle_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_STAINED_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_OAK_SHINGLES = CaliberBlockManager.register("mossy_stained_oak_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_STAINED_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_SPRUCE_SHINGLES = CaliberBlockManager.register("mossy_stained_spruce_shingle", BlockProps.PLANK_NO_OC.get(), CaliberBlocks.MOSSY_STAINED_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Other Roofing Materials */
    public static final BlockManager SLATE_TILE = CaliberBlockManager.register("slate_tile", BlockProps.DEEPSLATE.get().noOcclusion(), () -> Blocks.DEEPSLATE_TILES, ROOF_VARIANTS);
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
        return CaliberItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
