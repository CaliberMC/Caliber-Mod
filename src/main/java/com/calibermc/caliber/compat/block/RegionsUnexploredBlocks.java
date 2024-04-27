package com.calibermc.caliber.compat.block;

import com.calibermc.caliber.block.management.CaliberBlockManager;
import com.calibermc.caliber.compat.item.RegionsUnexploredItems;
import com.calibermc.caliberlib.block.management.BlockManager;
import net.regions_unexplored.block.RuBlocks;
//import io.github.uhq_games.regions_unexplored.block.RuBlocks;
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

public class RegionsUnexploredBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "regions_unexplored");

    /* Stone */
    public static final BlockManager RU_ARGILLITE = CaliberBlockManager.registerRU("argillite", () -> BlockBehaviour.Properties.copy(RuBlocks.ARGILLITE.get()), () -> RuBlocks.ARGILLITE.get(), STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager RU_CHALK = CaliberBlockManager.registerRU("chalk_block", () -> BlockBehaviour.Properties.copy(RuBlocks.CHALK.get()), () -> RuBlocks.CHALK.get(), STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager RU_CHALK_BRICKS = CaliberBlockManager.registerRU("chalk_bricks", () -> BlockBehaviour.Properties.copy(RuBlocks.CHALK_BRICKS.get()), () -> RuBlocks.CHALK_BRICKS.get(), STONE_VARIANTS_WITHOUT_SLAB_STAIRS);
    public static final BlockManager RU_CHALK_PILLAR = CaliberBlockManager.registerRU("chalk_pillar", () -> BlockBehaviour.Properties.copy(RuBlocks.CHALK_PILLAR.get()), () -> RuBlocks.CHALK_PILLAR.get(), STONE_VARIANTS);
    public static final BlockManager RU_MOSSY_STONE = CaliberBlockManager.registerRU("mossy_stone", () -> BlockBehaviour.Properties.copy(RuBlocks.MOSSY_STONE.get()), () -> RuBlocks.MOSSY_STONE.get(), STONE_VARIANTS);
    public static final BlockManager RU_POLISHED_CHALK = CaliberBlockManager.registerRU("polished_chalk", () -> BlockBehaviour.Properties.copy(RuBlocks.POLISHED_CHALK.get()), () -> RuBlocks.POLISHED_CHALK.get(), STONE_VARIANTS_WITHOUT_SLAB_STAIRS);

    /* Planks */
    public static final BlockManager RU_BAOBAB = CaliberBlockManager.registerRU("baobab_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BAOBAB_PLANKS.get()), () -> RuBlocks.BAOBAB_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_BLACKWOOD = CaliberBlockManager.registerRU("blackwood_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BLACKWOOD_PLANKS.get()), () -> RuBlocks.BLACKWOOD_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_BLUE_BIOSHROOM = CaliberBlockManager.registerRU("blue_bioshroom_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BLUE_BIOSHROOM_PLANKS.get()), () -> RuBlocks.BLUE_BIOSHROOM_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_BRIMWOOD = CaliberBlockManager.registerRU("brimwood_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BRIMWOOD_PLANKS.get()), () -> RuBlocks.BRIMWOOD_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_COBALT = CaliberBlockManager.registerRU("cobalt_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.COBALT_PLANKS.get()), () -> RuBlocks.COBALT_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_CYPRESS = CaliberBlockManager.registerRU("cypress_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.CYPRESS_PLANKS.get()), () -> RuBlocks.CYPRESS_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_DEAD = CaliberBlockManager.registerRU("dead_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.DEAD_PLANKS.get()), () -> RuBlocks.DEAD_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_EUCALYPTUS = CaliberBlockManager.registerRU("eucalyptus_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.EUCALYPTUS_PLANKS.get()), () -> RuBlocks.EUCALYPTUS_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_GREEN_BIOSHROOM = CaliberBlockManager.registerRU("green_bioshroom_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.GREEN_BIOSHROOM_PLANKS.get()), () -> RuBlocks.GREEN_BIOSHROOM_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_JOSHUA = CaliberBlockManager.registerRU("joshua_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.JOSHUA_PLANKS.get()), () -> RuBlocks.JOSHUA_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_KAPOK = CaliberBlockManager.registerRU("kapok_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.KAPOK_PLANKS.get()), () -> RuBlocks.KAPOK_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_LARCH = CaliberBlockManager.registerRU("larch_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.LARCH_PLANKS.get()), () -> RuBlocks.LARCH_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_MAGNOLIA = CaliberBlockManager.registerRU("magnolia_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.MAGNOLIA_PLANKS.get()), () -> RuBlocks.MAGNOLIA_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_MAPLE = CaliberBlockManager.registerRU("maple_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.MAPLE_PLANKS.get()), () -> RuBlocks.MAPLE_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_MAUVE = CaliberBlockManager.registerRU("mauve_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.MAUVE_PLANKS.get()), () -> RuBlocks.MAUVE_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_PALM = CaliberBlockManager.registerRU("palm_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PALM_PLANKS.get()), () -> RuBlocks.PALM_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_PINE = CaliberBlockManager.registerRU("pine_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PINE_PLANKS.get()), () -> RuBlocks.PINE_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_PINK_BIOSHROOM = CaliberBlockManager.registerRU("pink_bioshroom_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PINK_BIOSHROOM_PLANKS.get()), () -> RuBlocks.PINK_BIOSHROOM_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_REDWOOD = CaliberBlockManager.registerRU("redwood_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.REDWOOD_PLANKS.get()), () -> RuBlocks.REDWOOD_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_SOCOTRA = CaliberBlockManager.registerRU("socotra_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.SOCOTRA_PLANKS.get()), () -> RuBlocks.SOCOTRA_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_WILLOW = CaliberBlockManager.registerRU("willow_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.WILLOW_PLANKS.get()), () -> RuBlocks.WILLOW_PLANKS.get(), PLANK_VARIANTS);
    public static final BlockManager RU_YELLOW_BIOSHROOM = CaliberBlockManager.registerRU("yellow_bioshroom_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.YELLOW_BIOSHROOM_PLANKS.get()), () -> RuBlocks.YELLOW_BIOSHROOM_PLANKS.get(), COMPAT_PLANK_VARIANTS);

    /* Roofing */
    public static final BlockManager RU_BAOBAB_SHINGLES = CaliberBlockManager.registerRU("baobab_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BAOBAB_PLANKS.get()), () -> RuBlocks.BAOBAB_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_BLACKWOOD_SHINGLES = CaliberBlockManager.registerRU("blackwood_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BLACKWOOD_PLANKS.get()), () -> RuBlocks.BLACKWOOD_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_BLUE_BIOSHROOM_SHINGLES = CaliberBlockManager.registerRU("blue_bioshroom_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BLUE_BIOSHROOM_PLANKS.get()), () -> RuBlocks.BLUE_BIOSHROOM_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_BRIMWOOD_SHINGLES = CaliberBlockManager.registerRU("brimwood_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BRIMWOOD_PLANKS.get()), () -> RuBlocks.BRIMWOOD_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_COBALT_SHINGLES = CaliberBlockManager.registerRU("cobalt_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.COBALT_PLANKS.get()), () -> RuBlocks.COBALT_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_CYPRESS_SHINGLES = CaliberBlockManager.registerRU("cypress_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.CYPRESS_PLANKS.get()), () -> RuBlocks.CYPRESS_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_DEAD_SHINGLES = CaliberBlockManager.registerRU("dead_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.DEAD_PLANKS.get()), () -> RuBlocks.DEAD_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_EUCALYPTUS_SHINGLES = CaliberBlockManager.registerRU("eucalyptus_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.EUCALYPTUS_PLANKS.get()), () -> RuBlocks.EUCALYPTUS_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_GREEN_BIOSHROOM_SHINGLES = CaliberBlockManager.registerRU("green_bioshroom_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.GREEN_BIOSHROOM_PLANKS.get()), () -> RuBlocks.GREEN_BIOSHROOM_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_JOSHUA_SHINGLES = CaliberBlockManager.registerRU("joshua_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.JOSHUA_PLANKS.get()), () -> RuBlocks.JOSHUA_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_KAPOK_SHINGLES = CaliberBlockManager.registerRU("kapok_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.KAPOK_PLANKS.get()), () -> RuBlocks.KAPOK_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_LARCH_SHINGLES = CaliberBlockManager.registerRU("larch_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.LARCH_PLANKS.get()), () -> RuBlocks.LARCH_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_MAGNOLIA_SHINGLES = CaliberBlockManager.registerRU("magnolia_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.MAGNOLIA_PLANKS.get()), () -> RuBlocks.MAGNOLIA_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_MAPLE_SHINGLES = CaliberBlockManager.registerRU("maple_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.MAPLE_PLANKS.get()), () -> RuBlocks.MAPLE_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_MAUVE_SHINGLES = CaliberBlockManager.registerRU("mauve_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.MAUVE_PLANKS.get()), () -> RuBlocks.MAUVE_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_PALM_SHINGLES = CaliberBlockManager.registerRU("palm_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PALM_PLANKS.get()), () -> RuBlocks.PALM_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_PINE_SHINGLES = CaliberBlockManager.registerRU("pine_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PINE_PLANKS.get()), () -> RuBlocks.PINE_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_PINK_BIOSHROOM_SHINGLES = CaliberBlockManager.registerRU("pink_bioshroom_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PINK_BIOSHROOM_PLANKS.get()), () -> RuBlocks.PINK_BIOSHROOM_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_REDWOOD_SHINGLES = CaliberBlockManager.registerRU("redwood_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.REDWOOD_PLANKS.get()), () -> RuBlocks.REDWOOD_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_SOCOTRA_SHINGLES = CaliberBlockManager.registerRU("socotra_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.SOCOTRA_PLANKS.get()), () -> RuBlocks.SOCOTRA_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_WILLOW_SHINGLES = CaliberBlockManager.registerRU("willow_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.WILLOW_PLANKS.get()), () -> RuBlocks.WILLOW_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_YELLOW_BIOSHROOM_SHINGLES = CaliberBlockManager.registerRU("yellow_bioshroom_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.YELLOW_BIOSHROOM_PLANKS.get()), () -> RuBlocks.YELLOW_BIOSHROOM_PLANKS.get(), ROOF_VARIANTS);

    /* Stripped Wood */
    public static final BlockManager RU_STRIPPED_BAOBAB = CaliberBlockManager.registerRU("stripped_baobab", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_BAOBAB_WOOD.get()), () -> RuBlocks.STRIPPED_BAOBAB_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_BLACKWOOD = CaliberBlockManager.registerRU("stripped_blackwood", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_BLACKWOOD_WOOD.get()), () -> RuBlocks.STRIPPED_BLACKWOOD_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_BLUE_BIOSHROOM = CaliberBlockManager.registerRU("stripped_blue_bioshroom", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_BLUE_BIOSHROOM_HYPHAE.get()), () -> RuBlocks.STRIPPED_BLUE_BIOSHROOM_HYPHAE.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_BRIMWOOD = CaliberBlockManager.registerRU("stripped_brimwood", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_BRIMWOOD_WOOD.get()), () -> RuBlocks.STRIPPED_BRIMWOOD_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_COBALT = CaliberBlockManager.registerRU("stripped_cobalt", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_COBALT_WOOD.get()), () -> RuBlocks.STRIPPED_COBALT_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_CYPRESS = CaliberBlockManager.registerRU("stripped_cypress", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_CYPRESS_WOOD.get()), () -> RuBlocks.STRIPPED_CYPRESS_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_DEAD = CaliberBlockManager.registerRU("stripped_dead", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_DEAD_WOOD.get()), () -> RuBlocks.STRIPPED_DEAD_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_EUCALYPTUS = CaliberBlockManager.registerRU("stripped_eucalyptus", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_EUCALYPTUS_WOOD.get()), () -> RuBlocks.STRIPPED_EUCALYPTUS_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_GREEN_BIOSHROOM = CaliberBlockManager.registerRU("stripped_green_bioshroom", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_GREEN_BIOSHROOM_HYPHAE.get()), () -> RuBlocks.STRIPPED_GREEN_BIOSHROOM_HYPHAE.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_JOSHUA = CaliberBlockManager.registerRU("stripped_joshua", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_JOSHUA_WOOD.get()), () -> RuBlocks.STRIPPED_JOSHUA_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_KAPOK = CaliberBlockManager.registerRU("stripped_kapok", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_KAPOK_WOOD.get()), () -> RuBlocks.STRIPPED_KAPOK_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_LARCH = CaliberBlockManager.registerRU("stripped_larch", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_LARCH_WOOD.get()), () -> RuBlocks.STRIPPED_LARCH_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_MAGNOLIA = CaliberBlockManager.registerRU("stripped_magnolia", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_MAGNOLIA_WOOD.get()), () -> RuBlocks.STRIPPED_MAGNOLIA_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_MAPLE = CaliberBlockManager.registerRU("stripped_maple", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_MAPLE_WOOD.get()), () -> RuBlocks.STRIPPED_MAPLE_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_MAUVE = CaliberBlockManager.registerRU("stripped_mauve", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_MAUVE_WOOD.get()), () -> RuBlocks.STRIPPED_MAUVE_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_PALM = CaliberBlockManager.registerRU("stripped_palm", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_PALM_WOOD.get()), () -> RuBlocks.STRIPPED_PALM_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_PINE = CaliberBlockManager.registerRU("stripped_pine", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_PINE_WOOD.get()), () -> RuBlocks.STRIPPED_PINE_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_PINK_BIOSHROOM = CaliberBlockManager.registerRU("stripped_pink_bioshroom", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_PINK_BIOSHROOM_HYPHAE.get()), () -> RuBlocks.STRIPPED_PINK_BIOSHROOM_HYPHAE.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_REDWOOD = CaliberBlockManager.registerRU("stripped_redwood", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_REDWOOD_WOOD.get()), () -> RuBlocks.STRIPPED_REDWOOD_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_SOCOTRA = CaliberBlockManager.registerRU("stripped_socotra", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_SOCOTRA_WOOD.get()), () -> RuBlocks.STRIPPED_SOCOTRA_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_WILLOW = CaliberBlockManager.registerRU("stripped_willow", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_WILLOW_WOOD.get()), () -> RuBlocks.STRIPPED_WILLOW_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager RU_STRIPPED_YELLOW_BIOSHROOM = CaliberBlockManager.registerRU("stripped_yellow_bioshroom", () -> BlockBehaviour.Properties.copy(RuBlocks.STRIPPED_YELLOW_BIOSHROOM_HYPHAE.get()), () -> RuBlocks.STRIPPED_YELLOW_BIOSHROOM_HYPHAE.get(), STRIPPED_WOOD_VARIANTS);

    /* Painted Planks */
    public static final BlockManager RU_BLACK_PAINTED = CaliberBlockManager.registerRU("black_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BLACK_PAINTED_PLANKS.get()), () -> RuBlocks.BLACK_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_BLUE_PAINTED = CaliberBlockManager.registerRU("blue_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BLUE_PAINTED_PLANKS.get()), () -> RuBlocks.BLUE_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_BROWN_PAINTED = CaliberBlockManager.registerRU("brown_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.BROWN_PAINTED_PLANKS.get()), () -> RuBlocks.BROWN_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_CYAN_PAINTED = CaliberBlockManager.registerRU("cyan_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.CYAN_PAINTED_PLANKS.get()), () -> RuBlocks.CYAN_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_GRAY_PAINTED = CaliberBlockManager.registerRU("gray_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.GRAY_PAINTED_PLANKS.get()), () -> RuBlocks.GRAY_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_GREEN_PAINTED = CaliberBlockManager.registerRU("green_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.GREEN_PAINTED_PLANKS.get()), () -> RuBlocks.GREEN_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_LIGHT_BLUE_PAINTED = CaliberBlockManager.registerRU("light_blue_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get()), () -> RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_LIGHT_GRAY_PAINTED = CaliberBlockManager.registerRU("light_gray_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get()), () -> RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_LIME_PAINTED = CaliberBlockManager.registerRU("lime_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.LIME_PAINTED_PLANKS.get()), () -> RuBlocks.LIME_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_MAGENTA_PAINTED = CaliberBlockManager.registerRU("magenta_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.MAGENTA_PAINTED_PLANKS.get()), () -> RuBlocks.MAGENTA_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_ORANGE_PAINTED = CaliberBlockManager.registerRU("orange_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.ORANGE_PAINTED_PLANKS.get()), () -> RuBlocks.ORANGE_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_PINK_PAINTED = CaliberBlockManager.registerRU("pink_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PINK_PAINTED_PLANKS.get()), () -> RuBlocks.PINK_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_PURPLE_PAINTED = CaliberBlockManager.registerRU("purple_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.PURPLE_PAINTED_PLANKS.get()), () -> RuBlocks.PURPLE_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_RED_PAINTED = CaliberBlockManager.registerRU("red_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.RED_PAINTED_PLANKS.get()), () -> RuBlocks.RED_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_WHITE_PAINTED = CaliberBlockManager.registerRU("white_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.WHITE_PAINTED_PLANKS.get()), () -> RuBlocks.WHITE_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);
    public static final BlockManager RU_YELLOW_PAINTED = CaliberBlockManager.registerRU("yellow_painted_planks", () -> BlockBehaviour.Properties.copy(RuBlocks.YELLOW_PAINTED_PLANKS.get()), () -> RuBlocks.YELLOW_PAINTED_PLANKS.get(), COMPAT_PLANK_VARIANTS);

    /* Painted Roofing */
    public static final BlockManager RU_BLACK_PAINTED_SHINGLES = CaliberBlockManager.registerRU("black_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BLACK_PAINTED_PLANKS.get()), () -> RuBlocks.BLACK_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_BLUE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("blue_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BLUE_PAINTED_PLANKS.get()), () -> RuBlocks.BLUE_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_BROWN_PAINTED_SHINGLES = CaliberBlockManager.registerRU("brown_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.BROWN_PAINTED_PLANKS.get()), () -> RuBlocks.BROWN_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_CYAN_PAINTED_SHINGLES = CaliberBlockManager.registerRU("cyan_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.CYAN_PAINTED_PLANKS.get()), () -> RuBlocks.CYAN_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_GRAY_PAINTED_SHINGLES = CaliberBlockManager.registerRU("gray_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.GRAY_PAINTED_PLANKS.get()), () -> RuBlocks.GRAY_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_GREEN_PAINTED_SHINGLES = CaliberBlockManager.registerRU("green_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.GREEN_PAINTED_PLANKS.get()), () -> RuBlocks.GREEN_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_LIGHT_BLUE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("light_blue_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get()), () -> RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_LIGHT_GRAY_PAINTED_SHINGLES = CaliberBlockManager.registerRU("light_gray_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get()), () -> RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_LIME_PAINTED_SHINGLES = CaliberBlockManager.registerRU("lime_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.LIME_PAINTED_PLANKS.get()), () -> RuBlocks.LIME_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_MAGENTA_PAINTED_SHINGLES = CaliberBlockManager.registerRU("magenta_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.MAGENTA_PAINTED_PLANKS.get()), () -> RuBlocks.MAGENTA_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_ORANGE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("orange_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.ORANGE_PAINTED_PLANKS.get()), () -> RuBlocks.ORANGE_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_PINK_PAINTED_SHINGLES = CaliberBlockManager.registerRU("pink_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PINK_PAINTED_PLANKS.get()), () -> RuBlocks.PINK_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_PURPLE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("purple_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.PURPLE_PAINTED_PLANKS.get()), () -> RuBlocks.PURPLE_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_RED_PAINTED_SHINGLES = CaliberBlockManager.registerRU("red_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.RED_PAINTED_PLANKS.get()), () -> RuBlocks.RED_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_WHITE_PAINTED_SHINGLES = CaliberBlockManager.registerRU("white_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.WHITE_PAINTED_PLANKS.get()), () -> RuBlocks.WHITE_PAINTED_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager RU_YELLOW_PAINTED_SHINGLES = CaliberBlockManager.registerRU("yellow_painted_shingle", () -> BlockBehaviour.Properties.copy(RuBlocks.YELLOW_PAINTED_PLANKS.get()), () -> RuBlocks.YELLOW_PAINTED_PLANKS.get(), ROOF_VARIANTS);


    public static void printBlockCounts() {
        System.out.println("Regions Unexplored blocks registered: " + blockCount);
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

