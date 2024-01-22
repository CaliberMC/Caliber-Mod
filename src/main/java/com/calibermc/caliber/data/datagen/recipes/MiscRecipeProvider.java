package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.crafting.ModRecipeBuilder;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MiscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MiscRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        bronzeRecipes(pFinishedRecipeConsumer);
        tinRecipes(pFinishedRecipeConsumer);
        silverRecipes(pFinishedRecipeConsumer);
        craftingTableRecipes(pFinishedRecipeConsumer);
        plasterRecipes(pFinishedRecipeConsumer);
        planksRecipes(pFinishedRecipeConsumer);
        stainedStrippedWoodRecipes(pFinishedRecipeConsumer);
        boardsRecipes(pFinishedRecipeConsumer);
        graniteRecipes(pFinishedRecipeConsumer);
        limestoneRecipes(pFinishedRecipeConsumer);
        sandstoneRecipes(pFinishedRecipeConsumer);
        thatchRecipes(pFinishedRecipeConsumer);
    }

    private void craftingTableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Crafting Tables */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER.get(), 1).define('I', Items.IRON_INGOT).define('S', Blocks.SMOOTH_STONE).pattern(" I ").pattern("SSS").unlockedBy("has_iron_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_INGOT).build())).save(pFinishedRecipeConsumer, "woodcutter_from_shaped_iron_ingot_stone");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KILN.get(), 1).define('I', Items.IRON_INGOT).define('X', Blocks.BLAST_FURNACE).define('#', Blocks.SMOOTH_STONE).pattern("III").pattern("IXI").pattern("###").unlockedBy("has_blast_furnace",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLAST_FURNACE).build())).save(pFinishedRecipeConsumer, "kiln_from_shaped_iron_ingots_blast_furnace_smooth_stone_variant");
    }

    private void bronzeRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRONZE_BLOCK.get(), 1).define('C', Items.COPPER_INGOT).define('T', ModItems.TIN_INGOT.get()).pattern("CTC").pattern("CTC").pattern("CTC").unlockedBy("has_copper_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_block_from_shaped_ingots");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9).define('C', Items.COPPER_INGOT).define('T', ModItems.TIN_INGOT.get()).pattern("CTC").pattern("CTC").pattern("CTC").unlockedBy("has_copper_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_ingot_from_shaped_copper_ingots_tin_ingots");
        ModRecipeBuilder.alloying(Ingredient.of(Items.COPPER_INGOT), Ingredient.of(ModItems.TIN_INGOT.get()), ModItems.BRONZE_INGOT.get(), 0.35F, 200).unlockedBy("has_tin_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_ingot_from_alloying_ingots");
    }

    private void tinRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK.get(), 1).define('T', ModItems.TIN_INGOT.get()).pattern("TTT").pattern("TTT").pattern("TTT").unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "tin_block_from_shaped_ingots");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9).requires(ModBlocks.TIN_ORE.get()).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_tin_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1).define('T', ModItems.TIN_NUGGET.get()).pattern("TTT").pattern("TTT").pattern("TTT").unlockedBy("has_tin_nugget",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_NUGGET.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_shaped_nuggets");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_smelting_tin_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_smelting_deeplate_tin_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_TIN.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_nugget_from_smelting_raw_tin");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_blasting_tin_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_blasting_deeplate_tin_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_TIN.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_nugget_from_blasting_raw_tin");
    }

    private void silverRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK.get(), 1).define('S', ModItems.SILVER_INGOT.get()).pattern("SSS").pattern("SSS").pattern("SSS").unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_block_from_shaped_ingots");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9).requires(ModBlocks.SILVER_BLOCK.get()).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_silver_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1).define('S', ModItems.SILVER_NUGGET.get()).pattern("SSS").pattern("SSS").pattern("SSS").unlockedBy("has_silver_nugget",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_shaped_nuggets");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.SILVER_ORE.get()), RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_smelting_silver_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_SILVER_ORE.get()), RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_smelting_deeplate_silver_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_SILVER.get()), RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_nugget_from_smelting_raw_silver");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.SILVER_ORE.get()), RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_blasting_silver_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_SILVER_ORE.get()), RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_blasting_deeplate_silver_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_SILVER.get()), RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_nugget_from_blasting_raw_silver");
    }

    private void plasterRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Plaster Powder from Clay and Dye*/
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEIGE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.WHITE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "beige_plaster_powder_from_clay_sand_brown_dye_white_dye");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.BROWN_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE, 2).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "brown_plaster_powder_from_clay_sand_brown_dye");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.OCHRE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.ORANGE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "ochre_plaster_powder_from_clay_sand_brown_dye_orange_dye");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.TAN_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.YELLOW_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "tan_plaster_powder_from_clay_sand_brown_dye_yellow_dye");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.BEIGE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.WHITE_DYE, 2).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "beige_plaster_powder_from_clay_sand_white_dye");

        /* Plaster from Plaster Powder and Water Bucket Shapeless*/
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.BEIGE_PLASTER.baseBlock(), 1).requires(ModBlocks.BEIGE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_begie_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_from_beige_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.BROWN_PLASTER.baseBlock(), 1).requires(ModBlocks.BROWN_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_brown_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_from_brown_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.OCHRE_PLASTER.baseBlock(), 1).requires(ModBlocks.OCHRE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_ochre_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_from_ochre_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.TAN_PLASTER.baseBlock(), 1).requires(ModBlocks.TAN_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_tan_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_from_tan_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.WHITE_PLASTER.baseBlock(), 1).requires(ModBlocks.WHITE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_white_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_from_white_plaster_powder_water_bucket");

    }

    private void planksRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Planks from Boards Woodcutting*/
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), Blocks.ACACIA_PLANKS).unlockedBy("has_acacia_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_planks_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), Blocks.BIRCH_PLANKS).unlockedBy("has_birch_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_planks_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), Blocks.DARK_OAK_PLANKS).unlockedBy("has_dark_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_planks_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), Blocks.JUNGLE_PLANKS).unlockedBy("has_jungle_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_planks_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), Blocks.OAK_PLANKS).unlockedBy("has_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_planks_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), Blocks.SPRUCE_PLANKS).unlockedBy("has_spruce_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_planks_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), Blocks.CRIMSON_PLANKS).unlockedBy("has_crimson_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_planks_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), Blocks.WARPED_PLANKS).unlockedBy("has_warped_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_planks_from_warped_boards_woodcutting");

        /* Stained Planks from Stained Boards Woodcutting*/
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA.baseBlock()).unlockedBy("has_stained_acacia_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH.baseBlock()).unlockedBy("has_stained_birch_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_planks_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK.baseBlock()).unlockedBy("has_stained_dark_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_planks_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE.baseBlock()).unlockedBy("has_stained_jungle_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_planks_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK.baseBlock()).unlockedBy("has_stained_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_planks_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE.baseBlock()).unlockedBy("has_stained_spruce_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_planks_from_stained_spruce_boards_woodcutting");

        /* Stained Planks Buttons */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_ACACIA_BUTTON.get()).requires(ModBlocks.STAINED_ACACIA.baseBlock()).unlockedBy("has_stained_acacia", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_BIRCH_BUTTON.get()).requires(ModBlocks.STAINED_BIRCH.baseBlock()).unlockedBy("has_stained_birch", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_DARK_OAK_BUTTON.get()).requires(ModBlocks.STAINED_DARK_OAK.baseBlock()).unlockedBy("has_stained_dark_oak", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_JUNGLE_BUTTON.get()).requires(ModBlocks.STAINED_JUNGLE.baseBlock()).unlockedBy("has_stained_jungle", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_OAK_BUTTON.get()).requires(ModBlocks.STAINED_OAK.baseBlock()).unlockedBy("has_stained_oak", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_SPRUCE_BUTTON.get()).requires(ModBlocks.STAINED_SPRUCE.baseBlock()).unlockedBy("has_stained_spruce", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_button_from_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_ACACIA_BUTTON.get(), 1).requires(Blocks.ACACIA_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_button_from_acacia_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_BIRCH_BUTTON.get(), 1).requires(Blocks.BIRCH_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_button_from_birch_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_DARK_OAK_BUTTON.get(), 1).requires(Blocks.DARK_OAK_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_button_from_dark_oak_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_JUNGLE_BUTTON.get(), 1).requires(Blocks.JUNGLE_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_button_from_jungle_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_OAK_BUTTON.get(), 1).requires(Blocks.OAK_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_button_from_oak_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_SPRUCE_BUTTON.get(), 1).requires(Blocks.SPRUCE_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_button_from_spruce_button_and_resin");

        /* Stained Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_ACACIA_DOOR.get(), 3).define('#', ModBlocks.STAINED_ACACIA.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_BIRCH_DOOR.get(), 3).define('#', ModBlocks.STAINED_BIRCH.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_DARK_OAK_DOOR.get(), 3).define('#', ModBlocks.STAINED_DARK_OAK.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_JUNGLE_DOOR.get(), 3).define('#', ModBlocks.STAINED_JUNGLE.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_OAK_DOOR.get(), 3).define('#', ModBlocks.STAINED_OAK.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_SPRUCE_DOOR.get(), 3).define('#', ModBlocks.STAINED_SPRUCE.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_from_shaped_stained_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_ACACIA_DOOR.get(), 1).requires(Blocks.ACACIA_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_from_acacia_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_BIRCH_DOOR.get(), 1).requires(Blocks.BIRCH_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_from_birch_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_DARK_OAK_DOOR.get(), 1).requires(Blocks.DARK_OAK_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_from_dark_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_JUNGLE_DOOR.get(), 1).requires(Blocks.JUNGLE_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_from_jungle_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_OAK_DOOR.get(), 1).requires(Blocks.OAK_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_from_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_SPRUCE_DOOR.get(), 1).requires(Blocks.SPRUCE_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_from_spruce_door_and_resin");

        /* Stained Planks Signs */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_ACACIA_SIGN.get(), 3).define('#', ModBlocks.STAINED_ACACIA.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_sign_from_shaped_stained_acacia_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_BIRCH_SIGN.get(), 3).define('#', ModBlocks.STAINED_BIRCH.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_sign_from_shaped_stained_birch_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_DARK_OAK_SIGN.get(), 3).define('#', ModBlocks.STAINED_DARK_OAK.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_sign_from_shaped_stained_dark_oak_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_JUNGLE_SIGN.get(), 3).define('#', ModBlocks.STAINED_JUNGLE.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_sign_from_shaped_stained_jungle_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_OAK_SIGN.get(), 3).define('#', ModBlocks.STAINED_OAK.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_sign_from_shaped_stained_oak_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_SPRUCE_SIGN.get(), 3).define('#', ModBlocks.STAINED_SPRUCE.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_sign_from_shaped_stained_spruce_and_sticks");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_ACACIA_SIGN.get(), 1).requires(Blocks.ACACIA_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_sign_from_acacia_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_BIRCH_SIGN.get(), 1).requires(Blocks.BIRCH_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_sign_from_birch_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_DARK_OAK_SIGN.get(), 1).requires(Blocks.DARK_OAK_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_sign_from_dark_oak_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_JUNGLE_SIGN.get(), 1).requires(Blocks.JUNGLE_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_sign_from_jungle_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_OAK_SIGN.get(), 1).requires(Blocks.OAK_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_sign_from_oak_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  ModBlocks.STAINED_SPRUCE_SIGN.get(), 1).requires(Blocks.SPRUCE_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_sign_from_spruce_sign_and_resin");

        /* Tall Stained Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_ACACIA_DOOR.get(), 1).define('X', ModBlocks.STAINED_ACACIA_DOOR.get()).define('#', ModBlocks.STAINED_ACACIA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_acacia_door_from_stained_acacia_door_and_stained_acacia_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_BIRCH_DOOR.get(), 1).define('X', ModBlocks.STAINED_BIRCH_DOOR.get()).define('#', ModBlocks.STAINED_BIRCH.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_birch_door_from_stained_birch_door_and_stained_birch_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), 1).define('X', ModBlocks.STAINED_DARK_OAK_DOOR.get()).define('#', ModBlocks.STAINED_DARK_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_dark_oak_door_from_stained_dark_oak_door_and_stained_dark_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_JUNGLE_DOOR.get(), 1).define('X', ModBlocks.STAINED_JUNGLE_DOOR.get()).define('#', ModBlocks.STAINED_JUNGLE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_jungle_door_from_stained_jungle_door_and_stained_jungle_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_OAK_DOOR.get(), 1).define('X', ModBlocks.STAINED_OAK_DOOR.get()).define('#', ModBlocks.STAINED_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_oak_door_from_stained_oak_door_and_stained_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_SPRUCE_DOOR.get(), 1).define('X', ModBlocks.STAINED_SPRUCE_DOOR.get()).define('#', ModBlocks.STAINED_SPRUCE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_spruce_door_from_stained_spruce_door_and_stained_spruce_shaped");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_ACACIA_DOOR.get(), 1).requires(ModBlocks.TALL_ACACIA_DOOR.get()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_acacia_door_from_tall_acacia_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_BIRCH_DOOR.get(), 1).requires(ModBlocks.TALL_BIRCH_DOOR.get()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_birch_door_from_tall_birch_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), 1).requires(ModBlocks.TALL_DARK_OAK_DOOR.get()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_dark_oak_door_from_tall_dark_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_JUNGLE_DOOR.get(), 1).requires(ModBlocks.TALL_JUNGLE_DOOR.get()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_jungle_door_from_tall_jungle_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_OAK_DOOR.get(), 1).requires(ModBlocks.TALL_OAK_DOOR.get()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_oak_door_from_tall_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.TALL_STAINED_SPRUCE_DOOR.get(), 1).requires(ModBlocks.TALL_SPRUCE_DOOR.get()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_spruce_door_from_tall_spruce_door_and_resin");

        /* Tall Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_ACACIA_DOOR.get(), 1).define('X', Blocks.ACACIA_DOOR).define('#', ModBlocks.ACACIA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_acacia_door_from_acacia_door_and_acacia_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_BIRCH_DOOR.get(), 1).define('X', Blocks.BIRCH_DOOR).define('#', ModBlocks.BIRCH.baseBlock()).pattern("X").pattern("#").unlockedBy("has_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_birch_door_from_birch_door_and_birch_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_DARK_OAK_DOOR.get(), 1).define('X', Blocks.DARK_OAK_DOOR).define('#', ModBlocks.DARK_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_dark_oak_door_from_dark_oak_door_and_dark_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_JUNGLE_DOOR.get(), 1).define('X', Blocks.JUNGLE_DOOR).define('#', ModBlocks.JUNGLE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_jungle_door_from_jungle_door_and_jungle_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_OAK_DOOR.get(), 1).define('X', Blocks.OAK_DOOR).define('#', ModBlocks.OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_oak_door_from_oak_door_and_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_SPRUCE_DOOR.get(), 1).define('X', Blocks.SPRUCE_DOOR).define('#', ModBlocks.SPRUCE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_spruce_door_from_spruce_door_and_spruce_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_CRIMSON_DOOR.get(), 1).define('X', Blocks.CRIMSON_DOOR).define('#', ModBlocks.CRIMSON.baseBlock()).pattern("X").pattern("#").unlockedBy("has_crimson",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_crimson_door_from_crimson_door_and_crimson_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.TALL_WARPED_DOOR.get(), 1).define('X', Blocks.WARPED_DOOR).define('#', ModBlocks.WARPED.baseBlock()).pattern("X").pattern("#").unlockedBy("has_warped",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_warped_door_from_warped_door_and_warped_shaped");

        /* Stained Planks Trapdoors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_ACACIA_TRAPDOOR.get(), 2).define('#', ModBlocks.STAINED_ACACIA.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_trapdoor_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_BIRCH_TRAPDOOR.get(), 2).define('#', ModBlocks.STAINED_BIRCH.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_trapdoor_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), 2).define('#', ModBlocks.STAINED_DARK_OAK.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_trapdoor_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_JUNGLE_TRAPDOOR.get(), 2).define('#', ModBlocks.STAINED_JUNGLE.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_trapdoor_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_OAK_TRAPDOOR.get(), 2).define('#', ModBlocks.STAINED_OAK.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_trapdoor_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  ModBlocks.STAINED_SPRUCE_TRAPDOOR.get(), 2).define('#', ModBlocks.STAINED_SPRUCE.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_trapdoor_from_shaped_stained_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_ACACIA_TRAPDOOR.get(), 1).requires(Blocks.ACACIA_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_trapdoor_from_acacia_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_BIRCH_TRAPDOOR.get(), 1).requires(Blocks.BIRCH_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_trapdoor_from_birch_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), 1).requires(Blocks.DARK_OAK_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_trapdoor_from_dark_oak_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_JUNGLE_TRAPDOOR.get(), 1).requires(Blocks.JUNGLE_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_trapdoor_from_jungle_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_OAK_TRAPDOOR.get(), 1).requires(Blocks.OAK_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_trapdoor_from_oak_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  ModBlocks.STAINED_SPRUCE_TRAPDOOR.get(), 1).requires(Blocks.SPRUCE_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_trapdoor_from_spruce_trapdoor_and_resin");
    }

    private void stainedStrippedWoodRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Stained Stripped Wood Shapeless*/
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock(), 1).requires(Blocks.STRIPPED_ACACIA_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_wood_from_stripped_acacia_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock(), 1).requires(Blocks.STRIPPED_BIRCH_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_wood_from_stripped_birch_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock(), 1).requires(Blocks.STRIPPED_DARK_OAK_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_wood_from_stripped_dark_oak_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock(), 1).requires(Blocks.STRIPPED_JUNGLE_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_wood_from_stripped_jungle_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.STAINED_STRIPPED_OAK.baseBlock(), 1).requires(Blocks.STRIPPED_OAK_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_wood_from_stripped_oak_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock(), 1).requires(Blocks.STRIPPED_SPRUCE_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_wood_from_stripped_spruce_wood_and_resin");

    }

    private void boardsRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Boards from Planks Woodcutting*/
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_BOARDS.baseBlock()).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_boards_from_acacia_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_BOARDS.baseBlock()).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_boards_from_birch_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_BOARDS.baseBlock()).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_from_dark_oak_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_BOARDS.baseBlock()).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_boards_from_jungle_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_BOARDS.baseBlock()).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_boards_from_oak_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_BOARDS.baseBlock()).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_boards_from_spruce_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON_BOARDS.baseBlock()).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_boards_from_crimson_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED_BOARDS.baseBlock()).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_boards_from_warped_planks_woodcutting");

        /* Stained Boards from Stained Planks Woodcutting*/
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).unlockedBy("has_stained_acacia_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_from_stained_acacia_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).unlockedBy("has_stained_birch_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_from_stained_birch_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).unlockedBy("has_stained_dark_oak_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_from_stained_dark_oak_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).unlockedBy("has_stained_jungle_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_from_stained_jungle_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.baseBlock()).unlockedBy("has_stained_oak_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_from_stained_oak_planks_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).unlockedBy("has_stained_spruce_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_from_stained_spruce_planks_woodcutting");

    }
    
    private void graniteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Polished Granite from Granite Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.POLISHED_BLACK_GRANITE.baseBlock(), 4).define('#', ModBlocks.BLACK_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_from_black_granite_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.POLISHED_BROWN_GRANITE.baseBlock(), 4).define('#', ModBlocks.BROWN_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_from_brown_granite_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.POLISHED_GRAY_GRANITE.baseBlock(), 4).define('#', ModBlocks.GRAY_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_from_gray_granite_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.POLISHED_PINK_GRANITE.baseBlock(), 4).define('#', ModBlocks.PINK_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_from_pink_granite_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.POLISHED_WHITE_GRANITE.baseBlock(), 4).define('#', ModBlocks.WHITE_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_from_white_granite_shaped");
        
    }

    private void limestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Limestone from Cobblestone Smelting */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_from_cobbled_dark_limestone_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_from_cobbled_light_limestone_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_from_cobbled_pink_limestone_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.TAN_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_from_cobbled_tan_limestone_smelting");

        /* Limestone Bricks from Limestone Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.DARK_LIMESTONE_BRICK.baseBlock(), 4).define('#', ModBlocks.DARK_LIMESTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_bricks_from_dark_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock(), 4).define('#', ModBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_bricks_from_light_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.PINK_LIMESTONE_BRICK.baseBlock(), 4).define('#', ModBlocks.PINK_LIMESTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_bricks_from_pink_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.TAN_LIMESTONE_BRICK.baseBlock(), 4).define('#', ModBlocks.TAN_LIMESTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_bricks_from_tan_limestone_shaped");

        /* Chiseled Limestone Bricks from Limestone Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS.baseBlock(), 1).define('#', ModBlocks.DARK_LIMESTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_dark_limestone_from_dark_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.baseBlock(), 1).define('#', ModBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_light_limestone_from_light_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS.baseBlock(), 1).define('#', ModBlocks.PINK_LIMESTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_pink_limestone_from_pink_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS.baseBlock(), 1).define('#', ModBlocks.TAN_LIMESTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_tan_limestone_from_tan_limestone_shaped");

        /* Chiseled Limestone Bricks from Limestone Stonecutting */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS.baseBlock(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_dark_limestone_bricks_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.baseBlock(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_light_limestone_bricks_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS.baseBlock(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_pink_limestone_bricks_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS.baseBlock(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_tan_limestone_bricks_from_tan_limestone_stonecutting");

        /* Cracked Limestone Bricks from Limestone Smelting */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DARK_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_dark_limestone_bricks_from_dark_limestone_bricks_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_light_limestone_bricks_from_light_limestone_bricks_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PINK_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_pink_limestone_bricks_from_pink_limestone_bricks_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_TAN_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_tan_limestone_bricks_from_tan_limestone_bricks_smelting");
    }

    private void sandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Sandstone from Sand Smelting */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_SANDSTONE.baseBlock(), 0.1F, 200).unlockedBy("has_brown_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SAND.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_from_brown_sand_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SANDSTONE.baseBlock(), 0.1F, 200).unlockedBy("has_orange_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SAND.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_from_orange_sand_smelting");

        /* Sandstone from Sand Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.BROWN_SANDSTONE.baseBlock(), 4).define('#', Blocks.SAND).pattern("##").pattern("##").unlockedBy("has_brown_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SAND.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_from_brown_sand_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.ORANGE_SANDSTONE.baseBlock(), 4).define('#', Blocks.SAND).pattern("##").pattern("##").unlockedBy("has_orange_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SAND.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_from_orange_sand_shaped");

        /* Chiseled Sandstone from Sandstone Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.CHISELED_BROWN_SANDSTONE.baseBlock(), 1).define('#', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_brown_sandstone_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.CHISELED_ORANGE_SANDSTONE.baseBlock(), 1).define('#', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_orange_sandstone_from_orange_sandstone_shaped");

        /* Cut Sandstone from Sandstone Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.CUT_BROWN_SANDSTONE.baseBlock(), 4).define('#', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock(), 4).define('#', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_from_orange_sandstone_shaped");

        /* Cut Sandstone from Sandstone Stonecutting */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BROWN_SANDSTONE.baseBlock(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_brown_sandstone_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ORANGE_SANDSTONE.baseBlock(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_orange_sandstone_from_orange_sandstone_stonecutting");
    }

    private void thatchRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Thatch from Grass Stems and Sticks Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.THATCH.baseBlock(), 9).define('#', ModItems.GRASS_STEMS.get()).define('X', Items.STICK).pattern("###").pattern("XXX").pattern("###").unlockedBy("has_grass_stems",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "thatch_from_grass_stems_and_sticks_shaped");

        /* Thatch from Wheat and Sticks Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  ModBlocks.THATCH.baseBlock(), 9).define('#', Items.WHEAT).define('X', Items.STICK).pattern("###").pattern("XXX").pattern("###").unlockedBy("has_grass_stems",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "thatch_from_wheat_and_sticks_shaped");
    }

}
