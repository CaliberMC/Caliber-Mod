package com.calibermc.caliber.compat.block;

import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliber.compat.item.RegionsUnexploredItems;
import com.calibermc.caliberlib.block.management.BlockManager;
import io.github.uhq_games.regions_unexplored.block.RuBlocks;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
//import io.github.uhq_games.regions_unexplored.block.RuBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;
import static com.calibermc.caliber.block.CaliberBlocks.COMPAT_PLANK_VARIANTS;

public class RegionsUnexploredBlocks {
    private static int blockCount = 0;
    /* Stone */
    public static final BlockManager RU_ARGILLITE = CaliberBlockManager.registerRU("argillite", () -> BlockBehaviour.Properties.copy(RuBlocks.ARGILLITE), () -> RuBlocks.ARGILLITE, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager RU_CHALK = CaliberBlockManager.registerRU("chalk_block", () -> BlockBehaviour.Properties.copy(RuBlocks.CHALK), () -> RuBlocks.CHALK, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager RU_CHALK_BRICKS = CaliberBlockManager.registerRU("chalk_bricks", () -> BlockBehaviour.Properties.copy(RuBlocks.CHALK_BRICKS), () -> RuBlocks.CHALK_BRICKS, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager RU_CHALK_PILLAR = CaliberBlockManager.registerRU("chalk_pillar", () -> BlockBehaviour.Properties.copy(RuBlocks.CHALK_PILLAR), () -> RuBlocks.CHALK_PILLAR, STONE_VARIANTS);
    public static final BlockManager RU_MOSSY_STONE = CaliberBlockManager.registerRU("mossy_stone", () -> BlockBehaviour.Properties.copy(RuBlocks.MOSSY_STONE), () -> RuBlocks.MOSSY_STONE, STONE_VARIANTS);
    public static final BlockManager RU_POLISHED_CHALK = CaliberBlockManager.registerRU("polished_chalk", () -> BlockBehaviour.Properties.copy(RuBlocks.POLISHED_CHALK), () -> RuBlocks.POLISHED_CHALK, STONE_VARIANTS_WITHOUT_SLAB_STAIRS);

    /* Planks */
    public static final BlockManager RU_BAOBAB = CaliberBlockManager.registerRU("baobab_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BAOBAB_PLANKS), () -> RuBlocks.BAOBAB_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_BLACKWOOD = CaliberBlockManager.registerRU("blackwood_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BLACKWOOD_PLANKS), () -> RuBlocks.BLACKWOOD_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_BLUE_BIOSHROOM = CaliberBlockManager.registerRU("blue_bioshroom_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BLUE_BIOSHROOM_PLANKS), () -> RuBlocks.BLUE_BIOSHROOM_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_BRIMWOOD = CaliberBlockManager.registerRU("brimwood_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BRIMWOOD_PLANKS), () -> RuBlocks.BRIMWOOD_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_COBALT = CaliberBlockManager.registerRU("cobalt_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.COBALT_PLANKS), () -> RuBlocks.COBALT_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_CYPRESS = CaliberBlockManager.registerRU("cypress_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.CYPRESS_PLANKS), () -> RuBlocks.CYPRESS_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_DEAD = CaliberBlockManager.registerRU("dead_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.DEAD_PLANKS), () -> RuBlocks.DEAD_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_EUCALYPTUS = CaliberBlockManager.registerRU("eucalyptus_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.EUCALYPTUS_PLANKS), () -> RuBlocks.EUCALYPTUS_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_GREEN_BIOSHROOM = CaliberBlockManager.registerRU("green_bioshroom_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.GREEN_BIOSHROOM_PLANKS), () -> RuBlocks.GREEN_BIOSHROOM_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_JOSHUA = CaliberBlockManager.registerRU("joshua_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.JOSHUA_PLANKS), () -> RuBlocks.JOSHUA_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_KAPOK = CaliberBlockManager.registerRU("kapok_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.KAPOK_PLANKS), () -> RuBlocks.KAPOK_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_LARCH = CaliberBlockManager.registerRU("larch_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.LARCH_PLANKS), () -> RuBlocks.LARCH_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_MAGNOLIA = CaliberBlockManager.registerRU("magnolia_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.MAGNOLIA_PLANKS), () -> RuBlocks.MAGNOLIA_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_MAPLE = CaliberBlockManager.registerRU("maple_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.MAPLE_PLANKS), () -> RuBlocks.MAPLE_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_MAUVE = CaliberBlockManager.registerRU("mauve_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.MAUVE_PLANKS), () -> RuBlocks.MAUVE_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_PALM = CaliberBlockManager.registerRU("palm_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PALM_PLANKS), () -> RuBlocks.PALM_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_PINE = CaliberBlockManager.registerRU("pine_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PINE_PLANKS), () -> RuBlocks.PINE_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_PINK_BIOSHROOM = CaliberBlockManager.registerRU("pink_bioshroom_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PINK_BIOSHROOM_PLANKS), () -> RuBlocks.PINK_BIOSHROOM_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_REDWOOD = CaliberBlockManager.registerRU("redwood_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.REDWOOD_PLANKS), () -> RuBlocks.REDWOOD_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_SOCOTRA = CaliberBlockManager.registerRU("socotra_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.SOCOTRA_PLANKS), () -> RuBlocks.SOCOTRA_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_WILLOW = CaliberBlockManager.registerRU("willow_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.WILLOW_PLANKS), () -> RuBlocks.WILLOW_PLANKS, PLANK_VARIANTS);
    public static final BlockManager RU_YELLOW_BIOSHROOM = CaliberBlockManager.registerRU("yellow_bioshroom_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.YELLOW_BIOSHROOM_PLANKS), () -> RuBlocks.YELLOW_BIOSHROOM_PLANKS, COMPAT_PLANK_VARIANTS);

    /* Roofing */
    public static final BlockManager RU_BAOBAB_SHINGLES = CaliberBlockManager.registerRU("baobab_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BAOBAB_PLANKS), () -> RuBlocks.BAOBAB_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_BLACKWOOD_SHINGLES = CaliberBlockManager.registerRU("blackwood_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BLACKWOOD_PLANKS), () -> RuBlocks.BLACKWOOD_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_BLUE_BIOSHROOM_SHINGLES = CaliberBlockManager.registerRU("blue_bioshroom_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BLUE_BIOSHROOM_PLANKS), () -> RuBlocks.BLUE_BIOSHROOM_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_BRIMWOOD_SHINGLES = CaliberBlockManager.registerRU("brimwood_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BRIMWOOD_PLANKS), () -> RuBlocks.BRIMWOOD_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_COBALT_SHINGLES = CaliberBlockManager.registerRU("cobalt_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.COBALT_PLANKS), () -> RuBlocks.COBALT_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_CYPRESS_SHINGLES = CaliberBlockManager.registerRU("cypress_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.CYPRESS_PLANKS), () -> RuBlocks.CYPRESS_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_DEAD_SHINGLES = CaliberBlockManager.registerRU("dead_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.DEAD_PLANKS), () -> RuBlocks.DEAD_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_EUCALYPTUS_SHINGLES = CaliberBlockManager.registerRU("eucalyptus_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.EUCALYPTUS_PLANKS), () -> RuBlocks.EUCALYPTUS_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_GREEN_BIOSHROOM_SHINGLES = CaliberBlockManager.registerRU("green_bioshroom_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.GREEN_BIOSHROOM_PLANKS), () -> RuBlocks.GREEN_BIOSHROOM_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_JOSHUA_SHINGLES = CaliberBlockManager.registerRU("joshua_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.JOSHUA_PLANKS), () -> RuBlocks.JOSHUA_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_KAPOK_SHINGLES = CaliberBlockManager.registerRU("kapok_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.KAPOK_PLANKS), () -> RuBlocks.KAPOK_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_LARCH_SHINGLES = CaliberBlockManager.registerRU("larch_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.LARCH_PLANKS), () -> RuBlocks.LARCH_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_MAGNOLIA_SHINGLES = CaliberBlockManager.registerRU("magnolia_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.MAGNOLIA_PLANKS), () -> RuBlocks.MAGNOLIA_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_MAPLE_SHINGLES = CaliberBlockManager.registerRU("maple_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.MAPLE_PLANKS), () -> RuBlocks.MAPLE_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_MAUVE_SHINGLES = CaliberBlockManager.registerRU("mauve_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.MAUVE_PLANKS), () -> RuBlocks.MAUVE_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_PALM_SHINGLES = CaliberBlockManager.registerRU("palm_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PALM_PLANKS), () -> RuBlocks.PALM_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_PINE_SHINGLES = CaliberBlockManager.registerRU("pine_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PINE_PLANKS), () -> RuBlocks.PINE_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_PINK_BIOSHROOM_SHINGLES = CaliberBlockManager.registerRU("pink_bioshroom_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PINK_BIOSHROOM_PLANKS), () -> RuBlocks.PINK_BIOSHROOM_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_REDWOOD_SHINGLES = CaliberBlockManager.registerRU("redwood_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.REDWOOD_PLANKS), () -> RuBlocks.REDWOOD_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_SOCOTRA_SHINGLES = CaliberBlockManager.registerRU("socotra_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.SOCOTRA_PLANKS), () -> RuBlocks.SOCOTRA_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_WILLOW_SHINGLES = CaliberBlockManager.registerRU("willow_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.WILLOW_PLANKS), () -> RuBlocks.WILLOW_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_YELLOW_BIOSHROOM_SHINGLES = CaliberBlockManager.registerRU("yellow_bioshroom_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.YELLOW_BIOSHROOM_PLANKS), () -> RuBlocks.YELLOW_BIOSHROOM_PLANKS, ROOF_VARIANTS);

    /* Stripped Wood */
    public static final BlockManager RU_STRIPPED_BAOBAB = CaliberBlockManager.registerRU("stripped_baobab", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_BAOBAB_WOOD), () -> RuBlocks.STRIPPED_BAOBAB_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_BLACKWOOD = CaliberBlockManager.registerRU("stripped_blackwood", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_BLACKWOOD_WOOD), () -> RuBlocks.STRIPPED_BLACKWOOD_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_BLUE_BIOSHROOM = CaliberBlockManager.registerRU("stripped_blue_bioshroom", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_BLUE_BIOSHROOM_HYPHAE), () -> RuBlocks.STRIPPED_BLUE_BIOSHROOM_HYPHAE, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_BRIMWOOD = CaliberBlockManager.registerRU("stripped_brimwood", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_BRIMWOOD_WOOD), () -> RuBlocks.STRIPPED_BRIMWOOD_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_COBALT = CaliberBlockManager.registerRU("stripped_cobalt", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_COBALT_WOOD), () -> RuBlocks.STRIPPED_COBALT_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_CYPRESS = CaliberBlockManager.registerRU("stripped_cypress", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_CYPRESS_WOOD), () -> RuBlocks.STRIPPED_CYPRESS_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_DEAD = CaliberBlockManager.registerRU("stripped_dead", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_DEAD_WOOD), () -> RuBlocks.STRIPPED_DEAD_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_EUCALYPTUS = CaliberBlockManager.registerRU("stripped_eucalyptus", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_EUCALYPTUS_WOOD), () -> RuBlocks.STRIPPED_EUCALYPTUS_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_GREEN_BIOSHROOM = CaliberBlockManager.registerRU("stripped_green_bioshroom", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_GREEN_BIOSHROOM_HYPHAE), () -> RuBlocks.STRIPPED_GREEN_BIOSHROOM_HYPHAE, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_JOSHUA = CaliberBlockManager.registerRU("stripped_joshua", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_JOSHUA_WOOD), () -> RuBlocks.STRIPPED_JOSHUA_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_KAPOK = CaliberBlockManager.registerRU("stripped_kapok", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_KAPOK_WOOD), () -> RuBlocks.STRIPPED_KAPOK_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_LARCH = CaliberBlockManager.registerRU("stripped_larch", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_LARCH_WOOD), () -> RuBlocks.STRIPPED_LARCH_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_MAGNOLIA = CaliberBlockManager.registerRU("stripped_magnolia", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_MAGNOLIA_WOOD), () -> RuBlocks.STRIPPED_MAGNOLIA_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_MAPLE = CaliberBlockManager.registerRU("stripped_maple", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_MAPLE_WOOD), () -> RuBlocks.STRIPPED_MAPLE_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_MAUVE = CaliberBlockManager.registerRU("stripped_mauve", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_MAUVE_WOOD), () -> RuBlocks.STRIPPED_MAUVE_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_PALM = CaliberBlockManager.registerRU("stripped_palm", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_PALM_WOOD), () -> RuBlocks.STRIPPED_PALM_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_PINE = CaliberBlockManager.registerRU("stripped_pine", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_PINE_WOOD), () -> RuBlocks.STRIPPED_PINE_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_PINK_BIOSHROOM = CaliberBlockManager.registerRU("stripped_pink_bioshroom", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_PINK_BIOSHROOM_HYPHAE), () -> RuBlocks.STRIPPED_PINK_BIOSHROOM_HYPHAE, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_REDWOOD = CaliberBlockManager.registerRU("stripped_redwood", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_REDWOOD_WOOD), () -> RuBlocks.STRIPPED_REDWOOD_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_SOCOTRA = CaliberBlockManager.registerRU("stripped_socotra", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_SOCOTRA_WOOD), () -> RuBlocks.STRIPPED_SOCOTRA_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_WILLOW = CaliberBlockManager.registerRU("stripped_willow", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_WILLOW_WOOD), () -> RuBlocks.STRIPPED_WILLOW_WOOD, STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_YELLOW_BIOSHROOM = CaliberBlockManager.registerRU("stripped_yellow_bioshroom", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_YELLOW_BIOSHROOM_HYPHAE), () -> RuBlocks.STRIPPED_YELLOW_BIOSHROOM_HYPHAE, STRIPPED_WOOD_VARIANTS);

    /* Painted Planks */
    public static final BlockManager RU_BLACK_PAINTED = CaliberBlockManager.registerRU("black_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BLACK_PAINTED_PLANKS), () -> RuBlocks.BLACK_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_BLUE_PAINTED = CaliberBlockManager.registerRU("blue_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BLUE_PAINTED_PLANKS), () -> RuBlocks.BLUE_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_BROWN_PAINTED = CaliberBlockManager.registerRU("brown_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BROWN_PAINTED_PLANKS), () -> RuBlocks.BROWN_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_CYAN_PAINTED = CaliberBlockManager.registerRU("cyan_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.CYAN_PAINTED_PLANKS), () -> RuBlocks.CYAN_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_GRAY_PAINTED = CaliberBlockManager.registerRU("gray_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.GRAY_PAINTED_PLANKS), () -> RuBlocks.GRAY_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_GREEN_PAINTED = CaliberBlockManager.registerRU("green_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.GREEN_PAINTED_PLANKS), () -> RuBlocks.GREEN_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_LIGHT_BLUE_PAINTED = CaliberBlockManager.registerRU("light_blue_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS), () -> RuBlocks.LIGHT_BLUE_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_LIGHT_GRAY_PAINTED = CaliberBlockManager.registerRU("light_gray_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS), () -> RuBlocks.LIGHT_GRAY_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_LIME_PAINTED = CaliberBlockManager.registerRU("lime_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.LIME_PAINTED_PLANKS), () -> RuBlocks.LIME_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_MAGENTA_PAINTED = CaliberBlockManager.registerRU("magenta_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.MAGENTA_PAINTED_PLANKS), () -> RuBlocks.MAGENTA_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_ORANGE_PAINTED = CaliberBlockManager.registerRU("orange_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.ORANGE_PAINTED_PLANKS), () -> RuBlocks.ORANGE_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_PINK_PAINTED = CaliberBlockManager.registerRU("pink_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PINK_PAINTED_PLANKS), () -> RuBlocks.PINK_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_PURPLE_PAINTED = CaliberBlockManager.registerRU("purple_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PURPLE_PAINTED_PLANKS), () -> RuBlocks.PURPLE_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_RED_PAINTED = CaliberBlockManager.registerRU("red_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.RED_PAINTED_PLANKS), () -> RuBlocks.RED_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_WHITE_PAINTED = CaliberBlockManager.registerRU("white_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.WHITE_PAINTED_PLANKS), () -> RuBlocks.WHITE_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_YELLOW_PAINTED = CaliberBlockManager.registerRU("yellow_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.YELLOW_PAINTED_PLANKS), () -> RuBlocks.YELLOW_PAINTED_PLANKS, COMPAT_PLANK_VARIANTS);

    /* Painted Roofing */
    public static final BlockManager RU_BLACK_PAINTED_SHINGLES = CaliberBlockManager.registerRU("black_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BLACK_PAINTED_PLANKS), () -> RuBlocks.BLACK_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_BLUE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("blue_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BLUE_PAINTED_PLANKS), () -> RuBlocks.BLUE_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_BROWN_PAINTED_SHINGLES = CaliberBlockManager.registerRU("brown_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BROWN_PAINTED_PLANKS), () -> RuBlocks.BROWN_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_CYAN_PAINTED_SHINGLES = CaliberBlockManager.registerRU("cyan_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.CYAN_PAINTED_PLANKS), () -> RuBlocks.CYAN_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_GRAY_PAINTED_SHINGLES = CaliberBlockManager.registerRU("gray_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.GRAY_PAINTED_PLANKS), () -> RuBlocks.GRAY_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_GREEN_PAINTED_SHINGLES = CaliberBlockManager.registerRU("green_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.GREEN_PAINTED_PLANKS), () -> RuBlocks.GREEN_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_LIGHT_BLUE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("light_blue_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS), () -> RuBlocks.LIGHT_BLUE_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_LIGHT_GRAY_PAINTED_SHINGLES = CaliberBlockManager.registerRU("light_gray_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS), () -> RuBlocks.LIGHT_GRAY_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_LIME_PAINTED_SHINGLES = CaliberBlockManager.registerRU("lime_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.LIME_PAINTED_PLANKS), () -> RuBlocks.LIME_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_MAGENTA_PAINTED_SHINGLES = CaliberBlockManager.registerRU("magenta_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.MAGENTA_PAINTED_PLANKS), () -> RuBlocks.MAGENTA_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_ORANGE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("orange_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.ORANGE_PAINTED_PLANKS), () -> RuBlocks.ORANGE_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_PINK_PAINTED_SHINGLES = CaliberBlockManager.registerRU("pink_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PINK_PAINTED_PLANKS), () -> RuBlocks.PINK_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_PURPLE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("purple_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PURPLE_PAINTED_PLANKS), () -> RuBlocks.PURPLE_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_RED_PAINTED_SHINGLES = CaliberBlockManager.registerRU("red_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.RED_PAINTED_PLANKS), () -> RuBlocks.RED_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_WHITE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("white_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.WHITE_PAINTED_PLANKS), () -> RuBlocks.WHITE_PAINTED_PLANKS, ROOF_VARIANTS);
    public static final BlockManager RU_YELLOW_PAINTED_SHINGLES = CaliberBlockManager.registerRU("yellow_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.YELLOW_PAINTED_PLANKS), () -> RuBlocks.YELLOW_PAINTED_PLANKS, ROOF_VARIANTS);


    public static void printBlockCounts() {
        System.out.println("Caliber Mod registered " + blockCount + " new Regions Unexplored blocks.");
    }

    private static <T extends Block> RegSupplier<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return RegHelper.registerBlock(new ResourceLocation("regions_unexplored", name), block);
    }

    public static <T extends Block> RegSupplier<T> registerBlock(String name, Supplier<T> block) {
        RegSupplier<T> toReturn = RegHelper.registerBlockWithItem(new ResourceLocation("regions_unexplored", name), block);
        blockCount++;
        return toReturn;
    }

    public static void init() {
    }
}

