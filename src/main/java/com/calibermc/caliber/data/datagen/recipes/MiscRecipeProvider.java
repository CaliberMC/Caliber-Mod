package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.CaliberBlocks;
import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliber.compat.block.RegionsUnexploredBlocks;
import net.regions_unexplored.block.RuBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MiscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MiscRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        craftingTableRecipes(pFinishedRecipeConsumer);
        planksRecipes(pFinishedRecipeConsumer);
        bopRecipes(pFinishedRecipeConsumer);
        ruRecipes(pFinishedRecipeConsumer);
    }

    private void craftingTableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Crafting Tables */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, CaliberBlocks.WOODCUTTER.get(), 1).define('I', Items.IRON_INGOT).define('S', Blocks.SMOOTH_STONE).pattern(" I ").pattern("SSS").unlockedBy("has_iron_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_INGOT).build())).save(pFinishedRecipeConsumer, "woodcutter_from_shaped_iron_ingot_stone");
    }

    private void planksRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Tall Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.ACACIA.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.ACACIA_DOOR).define('#', CaliberBlocks.ACACIA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_tall_door_from_acacia_door_and_acacia_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, CaliberBlocks.BAMBOO.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.BAMBOO_DOOR).define('#', CaliberBlocks.BAMBOO.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bamboo",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.BAMBOO.baseBlock()).build())).save(pFinishedRecipeConsumer, "bamboo_tall_door_from_bamboo_door_and_bamboo_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.BIRCH.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.BIRCH_DOOR).define('#', CaliberBlocks.BIRCH.baseBlock()).pattern("X").pattern("#").unlockedBy("has_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_tall_door_from_birch_door_and_birch_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.CHERRY.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.CHERRY_DOOR).define('#', CaliberBlocks.CHERRY.baseBlock()).pattern("X").pattern("#").unlockedBy("has_cherry",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.CHERRY.baseBlock()).build())).save(pFinishedRecipeConsumer, "cherry_tall_door_from_cherry_door_and_cherry_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.DARK_OAK.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.DARK_OAK_DOOR).define('#', CaliberBlocks.DARK_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_tall_door_from_dark_oak_door_and_dark_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.JUNGLE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.JUNGLE_DOOR).define('#', CaliberBlocks.JUNGLE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_tall_door_from_jungle_door_and_jungle_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.MANGROVE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.MANGROVE_DOOR).define('#', CaliberBlocks.MANGROVE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_mangrove",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.MANGROVE.baseBlock()).build())).save(pFinishedRecipeConsumer, "mangrove_tall_door_from_mangrove_door_and_mangrove_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.OAK.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.OAK_DOOR).define('#', CaliberBlocks.OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_tall_door_from_oak_door_and_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.SPRUCE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.SPRUCE_DOOR).define('#', CaliberBlocks.SPRUCE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_tall_door_from_spruce_door_and_spruce_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.CRIMSON.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.CRIMSON_DOOR).define('#', CaliberBlocks.CRIMSON.baseBlock()).pattern("X").pattern("#").unlockedBy("has_crimson",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.CRIMSON.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_tall_door_from_crimson_door_and_crimson_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.WARPED.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.WARPED_DOOR).define('#', CaliberBlocks.WARPED.baseBlock()).pattern("X").pattern("#").unlockedBy("has_warped",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.WARPED.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_tall_door_from_warped_door_and_warped_shaped");
    }

    private void bopRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* BOP Tall Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, BiomesOPlentyBlocks.BOP_DEAD.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.DEAD_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_DEAD.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_dead",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_DEAD.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_dead_tall_door_from_bop_dead_door_and_bop_dead_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, BiomesOPlentyBlocks.BOP_FIR.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.FIR_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_FIR.baseBlock()).pattern("X").pattern("#").unlockedBy("has_fir",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_FIR.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_fir_tall_door_from_bop_fir_door_and_fir_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  BiomesOPlentyBlocks.BOP_HELLBARK.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.HELLBARK_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_HELLBARK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_hellbark",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_HELLBARK.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_hellbark_tall_door_from_bop_hellbark_door_and_bop_hellbark_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  BiomesOPlentyBlocks.BOP_JACARANDA.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.JACARANDA_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_JACARANDA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_jacaranda",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_JACARANDA.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_jacaranda_tall_door_from_bop_jacaranda_door_and_bop_jacaranda_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  BiomesOPlentyBlocks.BOP_MAGIC.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.MAGIC_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_MAGIC.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_magic",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_MAGIC.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_magic_tall_door_from_bop_magic_door_and_bop_magic_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  BiomesOPlentyBlocks.BOP_MAHOGANY.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.MAHOGANY_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_MAHOGANY.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_mahogany",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_MAHOGANY.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_mahogany_tall_door_from_bop_mahogany_door_and_bop_mahogany_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  BiomesOPlentyBlocks.BOP_PALM.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.PALM_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_PALM.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_palm",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_PALM.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_palm_tall_door_from_bop_palm_door_and_bop_palm_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  BiomesOPlentyBlocks.BOP_REDWOOD.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.REDWOOD_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_REDWOOD.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_redwood",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_REDWOOD.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_redwood_tall_door_from_bop_redwood_door_and_bop_redwood_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  BiomesOPlentyBlocks.BOP_UMBRAN.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.UMBRAN_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_UMBRAN.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_umbran",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_UMBRAN.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_umbran_tall_door_from_bop_umbran_door_and_bop_umbran_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  BiomesOPlentyBlocks.BOP_WILLOW.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', BOPBlocks.WILLOW_DOOR.get()).define('#', BiomesOPlentyBlocks.BOP_WILLOW.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bop_willow",
                inventoryTrigger(ItemPredicate.Builder.item().of(BiomesOPlentyBlocks.BOP_WILLOW.baseBlock()).build())).save(pFinishedRecipeConsumer, "bop_willow_tall_door_from_bop_willow_door_and_bop_willow_shaped");
    }

    private void ruRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* RU Tall Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_BAOBAB.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.BAOBAB_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_BAOBAB.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_baobab",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_BAOBAB.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_baobab_tall_door_from_ru_baobab_door_and_ru_baobab_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, RegionsUnexploredBlocks.RU_BLACKWOOD.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.BLACKWOOD_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_BLACKWOOD.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_blackwood",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_BLACKWOOD.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_blackwood_tall_door_from_ru_blackwood_door_and_ru_blackwood_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_BRIMWOOD.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.BRIMWOOD_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_BRIMWOOD.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_brimwood",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_BRIMWOOD.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_brimwood_tall_door_from_ru_brimwood_door_and_ru_brimwood_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_CYPRESS.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.CYPRESS_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_CYPRESS.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_cypress",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_CYPRESS.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_cypress_tall_door_from_ru_cypress_door_and_ru_cypress_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_DEAD.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.DEAD_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_DEAD.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_dead",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_DEAD.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_dead_tall_door_from_ru_dead_door_and_ru_dead_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_EUCALYPTUS.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.EUCALYPTUS_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_EUCALYPTUS.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_eucalyptus",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_EUCALYPTUS.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_eucalyptus_tall_door_from_ru_eucalyptus_door_and_ru_eucalyptus_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_JOSHUA.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.JOSHUA_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_JOSHUA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_joshua",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_JOSHUA.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_joshua_tall_door_from_ru_joshua_door_and_ru_joshua_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_LARCH.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.LARCH_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_LARCH.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_larch",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_LARCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_larch_tall_door_from_ru_larch_door_and_ru_larch_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_MAPLE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.MAPLE_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_MAPLE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_maple",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_MAPLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_maple_tall_door_from_ru_maple_door_and_ru_maple_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_MAUVE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.MAUVE_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_MAUVE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_mauve",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_MAUVE.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_mauve_tall_door_from_ru_mauve_door_and_ru_mauve_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_PALM.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.PALM_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_PALM.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_palm",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_PALM.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_palm_tall_door_from_ru_palm_door_and_ru_palm_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_PINE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.PINE_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_PINE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_pine",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_PINE.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_pine_tall_door_from_ru_pine_door_and_ru_pine_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_REDWOOD.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.REDWOOD_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_REDWOOD.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_redwood",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_REDWOOD.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_redwood_tall_door_from_ru_redwood_door_and_ru_redwood_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  RegionsUnexploredBlocks.RU_WILLOW.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', RuBlocks.WILLOW_DOOR.get()).define('#', RegionsUnexploredBlocks.RU_WILLOW.baseBlock()).pattern("X").pattern("#").unlockedBy("has_ru_willow",
                inventoryTrigger(ItemPredicate.Builder.item().of(RegionsUnexploredBlocks.RU_WILLOW.baseBlock()).build())).save(pFinishedRecipeConsumer, "ru_willow_tall_door_from_ru_willow_door_and_ru_willow_shaped");
    }



}
