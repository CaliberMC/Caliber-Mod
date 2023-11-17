package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class TudorBlockRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public TudorBlockRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        /* Beige Plaster - Half-Timbered */
        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER_CROSS.get()).requires(ModBlocks.BEIGE_PLASTER.get()).requires(Blocks.ACACIA_PLANKS).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_acacia_beige_plaster_cross_from_acacia_planks_beige_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER_CROSS.get()).requires(ModBlocks.BEIGE_PLASTER.get()).requires(Blocks.BIRCH_PLANKS).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_birch_beige_plaster_cross_from_birch_planks_beige_plaster");
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS.get()).requires(ModBlocks.BEIGE_PLASTER.get()).requires(Blocks.DARK_OAK_PLANKS).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_dark_oak_beige_plaster_cross_from_dark_oak_planks_beige_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_CROSS.get()).requires(ModBlocks.BEIGE_PLASTER.get()).requires(Blocks.JUNGLE_PLANKS).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_jungle_beige_plaster_cross_from_jungle_planks_beige_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_OAK_BEIGE_PLASTER_CROSS.get()).requires(ModBlocks.BEIGE_PLASTER.get()).requires(Blocks.OAK_PLANKS).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_oak_beige_plaster_cross_from_oak_planks_beige_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_CROSS.get()).requires(ModBlocks.BEIGE_PLASTER.get()).requires(Blocks.SPRUCE_PLANKS).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_spruce_beige_plaster_cross_from_spruce_planks_beige_plaster");

    }

}
