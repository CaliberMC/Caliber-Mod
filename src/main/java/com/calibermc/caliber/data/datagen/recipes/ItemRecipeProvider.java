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

        /* Tools */
        ShapedRecipeBuilder.shaped(ModItems.HAMMER.get(), 1).define('L', Items.LEATHER).define('S', Items.STICK).define('I', Items.IRON_INGOT).pattern(" L ").pattern(" S ").pattern("II ").unlockedBy("has_iron_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_INGOT).build())).save(pFinishedRecipeConsumer, "hammer_from_shaped_iron_ingot_stick_leather");

        /* Consumables */
        ShapedRecipeBuilder.shaped(ModItems.NAILS.get(), 10).define('I', Items.IRON_INGOT).pattern(" I ").pattern(" I ").unlockedBy("has_iron_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_INGOT).build())).save(pFinishedRecipeConsumer, "nails_from_shaped_iron_ingots");

        /* Weapons */

        /* Armor */


    }

}
