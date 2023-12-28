package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ItemRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ItemRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        armorRecipes(pFinishedRecipeConsumer);
        consumableRecipes(pFinishedRecipeConsumer);
        toolRecipes(pFinishedRecipeConsumer);
        weaponRecipes(pFinishedRecipeConsumer);
    }

    private void armorRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Armor */
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_BOOTS.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).pattern("I I").pattern("I I").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_boots_from_shaped_bronze_ingot");
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_CHESTPLATE.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).pattern("I I").pattern("III").pattern("III").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_chestplate_from_shaped_bronze_ingot_stick");
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_HELMET.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).pattern("III").pattern("I I").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_helmet_from_shaped_bronze_ingot_stick");
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_LEGGING.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).pattern("III").pattern("I I").pattern("I I").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_legging_from_shaped_bronze_ingot_stick");

    }

    private void consumableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Consumables */
    }

    private void toolRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Tools */
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_AXE.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).define('#', Items.STICK).pattern("II ").pattern("I# ").pattern(" # ").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_axe_from_shaped_bronze_ingot_stick");
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_HOE.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).define('#', Items.STICK).pattern("II ").pattern(" # ").pattern(" # ").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_hoe_from_shaped_bronze_ingot_stick");
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_PICKAXE.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).define('#', Items.STICK).pattern("III").pattern(" # ").pattern(" # ").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_pickaxe_from_shaped_bronze_ingot_stick");
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_SHOVEL.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).define('#', Items.STICK).pattern(" I ").pattern(" # ").pattern(" # ").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_shovel_from_shaped_bronze_ingot_stick");
    }

    private void weaponRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Weapons */
        ShapedRecipeBuilder.shaped(ModItems.BRONZE_SWORD.get(), 1).define('I', ModItems.BRONZE_INGOT.get()).define('#', Items.STICK).pattern(" I ").pattern(" I ").pattern(" # ").unlockedBy("has_bronze_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BRONZE_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_sword_from_shaped_bronze_ingot_stick");
    }




}
