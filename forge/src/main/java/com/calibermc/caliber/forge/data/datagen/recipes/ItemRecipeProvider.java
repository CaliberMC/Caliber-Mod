package com.calibermc.caliber.forge.data.datagen.recipes;

import com.calibermc.caliber.item.CaliberItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ItemRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ItemRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        consumableRecipes(pFinishedRecipeConsumer);
    }

    private void consumableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Consumables */
    }

}
