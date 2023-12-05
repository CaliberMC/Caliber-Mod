package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.crafting.ModRecipeBuilder;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class PreciousMaterialsRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public PreciousMaterialsRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        bronzeRecipes(pFinishedRecipeConsumer);
        tinRecipes(pFinishedRecipeConsumer);
        silverRecipes(pFinishedRecipeConsumer);
    }

        private void bronzeRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
            ShapedRecipeBuilder.shaped(ModBlocks.BRONZE_BLOCK.get(), 1).define('C', Items.COPPER_INGOT).define('T', ModItems.TIN_INGOT.get()).pattern("CTC").pattern("CTC").pattern("CTC").unlockedBy("has_copper_ingot",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_block_from_shaped_ingots");
            ShapedRecipeBuilder.shaped(ModItems.BRONZE_INGOT.get(), 9).define('C', Items.COPPER_INGOT).define('T', ModItems.TIN_INGOT.get()).pattern("CTC").pattern("CTC").pattern("CTC").unlockedBy("has_copper_ingot",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_ingot_from_shaped_copper_ingots_tin_ingots");
            ModRecipeBuilder.alloying(Ingredient.of(Items.COPPER_INGOT), Ingredient.of(ModItems.TIN_INGOT.get()), ModItems.BRONZE_INGOT.get(), 0.35F, 200).unlockedBy("has_tin_ingot",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_ingot_from_alloying_ingots");
        }

        private void tinRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
            ShapedRecipeBuilder.shaped(ModBlocks.TIN_BLOCK.get(), 1).define('T', ModItems.TIN_INGOT.get()).pattern("TTT").pattern("TTT").pattern("TTT").unlockedBy("has_tin_ore",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "tin_block_from_shaped_ingots");
            ShapelessRecipeBuilder.shapeless(ModItems.TIN_INGOT.get(), 9).requires(ModBlocks.TIN_ORE.get()).unlockedBy("has_tin_ore",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_tin_block");
            ShapedRecipeBuilder.shaped(ModItems.TIN_INGOT.get(), 1).define('T', ModItems.TIN_NUGGET.get()).pattern("TTT").pattern("TTT").pattern("TTT").unlockedBy("has_tin_nugget",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_NUGGET.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_shaped_nuggets");
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TIN_ORE.get()), ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_smelting_tin_ore");
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_smelting_deeplate_tin_ore");
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_TIN.get()), ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_nugget_from_smelting_raw_tin");
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.TIN_ORE.get()), ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_blasting_tin_ore");
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_blasting_deeplate_tin_ore");
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_TIN.get()), ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                    inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_nugget_from_blasting_raw_tin");
        }

        private void silverRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.SILVER_BLOCK.get(), 1).define('S', ModItems.SILVER_INGOT.get()).pattern("SSS").pattern("SSS").pattern("SSS").unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_block_from_shaped_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.SILVER_INGOT.get(), 9).requires(ModBlocks.SILVER_BLOCK.get()).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_silver_block");
        ShapedRecipeBuilder.shaped(ModItems.SILVER_INGOT.get(), 1).define('S', ModItems.SILVER_NUGGET.get()).pattern("SSS").pattern("SSS").pattern("SSS").unlockedBy("has_silver_nugget",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_shaped_nuggets");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.SILVER_ORE.get()), ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_smelting_silver_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_SILVER_ORE.get()), ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_smelting_deeplate_silver_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_SILVER.get()), ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_nugget_from_smelting_raw_silver");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.SILVER_ORE.get()), ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_blasting_silver_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_SILVER_ORE.get()), ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_blasting_deeplate_silver_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_SILVER.get()), ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_nugget_from_blasting_raw_silver");
    }

}
