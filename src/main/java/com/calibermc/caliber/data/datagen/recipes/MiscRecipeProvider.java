package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MiscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MiscRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        /* Plaster Powder */
        ShapelessRecipeBuilder.shapeless(ModBlocks.BEIGE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.WHITE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "beige_plaster_powder_from_clay_sand_brown_dye_white_dye");
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE, 2).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "brown_plaster_powder_from_clay_sand_brown_dye");
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.OCHRE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.ORANGE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "ochre_plaster_powder_from_clay_sand_brown_dye_orange_dye");
       
        ShapelessRecipeBuilder.shapeless(ModBlocks.TAN_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.YELLOW_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "tan_plaster_powder_from_clay_sand_brown_dye_yellow_dye");
       
        ShapelessRecipeBuilder.shapeless(ModBlocks.BEIGE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.WHITE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "beige_plaster_powder_from_clay_sand_white_dye");

    }

}
