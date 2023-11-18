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

        /* Brown Plaster - Half-Timbered */
        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_ACACIA_BROWN_PLASTER_CROSS.get()).requires(ModBlocks.BROWN_PLASTER.get()).requires(Blocks.ACACIA_PLANKS).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_acacia_brown_plaster_cross_from_acacia_planks_brown_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_BIRCH_BROWN_PLASTER_CROSS.get()).requires(ModBlocks.BROWN_PLASTER.get()).requires(Blocks.BIRCH_PLANKS).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_birch_brown_plaster_cross_from_birch_planks_brown_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER_CROSS.get()).requires(ModBlocks.BROWN_PLASTER.get()).requires(Blocks.DARK_OAK_PLANKS).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_dark_oak_brown_plaster_cross_from_dark_oak_planks_brown_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER_CROSS.get()).requires(ModBlocks.BROWN_PLASTER.get()).requires(Blocks.JUNGLE_PLANKS).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_jungle_brown_plaster_cross_from_jungle_planks_brown_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_OAK_BROWN_PLASTER_CROSS.get()).requires(ModBlocks.BROWN_PLASTER.get()).requires(Blocks.OAK_PLANKS).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_oak_brown_plaster_cross_from_oak_planks_brown_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER_CROSS.get()).requires(ModBlocks.BROWN_PLASTER.get()).requires(Blocks.SPRUCE_PLANKS).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_spruce_brown_plaster_cross_from_spruce_planks_brown_plaster");

        /* Ochre Plaster - Half-Timbered */
        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER_CROSS.get()).requires(ModBlocks.OCHRE_PLASTER.get()).requires(Blocks.ACACIA_PLANKS).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_acacia_ochre_plaster_cross_from_acacia_planks_ochre_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER_CROSS.get()).requires(ModBlocks.OCHRE_PLASTER.get()).requires(Blocks.BIRCH_PLANKS).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_birch_ochre_plaster_cross_from_birch_planks_ochre_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER_CROSS.get()).requires(ModBlocks.OCHRE_PLASTER.get()).requires(Blocks.DARK_OAK_PLANKS).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_dark_oak_ochre_plaster_cross_from_dark_oak_planks_ochre_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER_CROSS.get()).requires(ModBlocks.OCHRE_PLASTER.get()).requires(Blocks.JUNGLE_PLANKS).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_jungle_ochre_plaster_cross_from_jungle_planks_ochre_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_OAK_OCHRE_PLASTER_CROSS.get()).requires(ModBlocks.OCHRE_PLASTER.get()).requires(Blocks.OAK_PLANKS).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_oak_ochre_plaster_cross_from_oak_planks_ochre_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER_CROSS.get()).requires(ModBlocks.OCHRE_PLASTER.get()).requires(Blocks.SPRUCE_PLANKS).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_spruce_ochre_plaster_cross_from_spruce_planks_ochre_plaster");

        /* Tan Plaster - Half-Timbered */
        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_ACACIA_TAN_PLASTER_CROSS.get()).requires(ModBlocks.TAN_PLASTER.get()).requires(Blocks.ACACIA_PLANKS).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_acacia_tan_plaster_cross_from_acacia_planks_tan_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_BIRCH_TAN_PLASTER_CROSS.get()).requires(ModBlocks.TAN_PLASTER.get()).requires(Blocks.BIRCH_PLANKS).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_birch_tan_plaster_cross_from_birch_planks_tan_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER_CROSS.get()).requires(ModBlocks.TAN_PLASTER.get()).requires(Blocks.DARK_OAK_PLANKS).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_dark_oak_tan_plaster_cross_from_dark_oak_planks_tan_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_JUNGLE_TAN_PLASTER_CROSS.get()).requires(ModBlocks.TAN_PLASTER.get()).requires(Blocks.JUNGLE_PLANKS).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_jungle_tan_plaster_cross_from_jungle_planks_tan_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_OAK_TAN_PLASTER_CROSS.get()).requires(ModBlocks.TAN_PLASTER.get()).requires(Blocks.OAK_PLANKS).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_oak_tan_plaster_cross_from_oak_planks_tan_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_SPRUCE_TAN_PLASTER_CROSS.get()).requires(ModBlocks.TAN_PLASTER.get()).requires(Blocks.SPRUCE_PLANKS).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_spruce_tan_plaster_cross_from_spruce_planks_tan_plaster");

        /* White Plaster - Half-Timbered */
        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_ACACIA_WHITE_PLASTER_CROSS.get()).requires(ModBlocks.WHITE_PLASTER.get()).requires(Blocks.ACACIA_PLANKS).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_acacia_white_plaster_cross_from_acacia_planks_white_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_BIRCH_WHITE_PLASTER_CROSS.get()).requires(ModBlocks.WHITE_PLASTER.get()).requires(Blocks.BIRCH_PLANKS).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_birch_white_plaster_cross_from_birch_planks_white_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_CROSS.get()).requires(ModBlocks.WHITE_PLASTER.get()).requires(Blocks.DARK_OAK_PLANKS).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_dark_oak_white_plaster_cross_from_dark_oak_planks_white_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER_CROSS.get()).requires(ModBlocks.WHITE_PLASTER.get()).requires(Blocks.JUNGLE_PLANKS).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_jungle_white_plaster_cross_from_jungle_planks_white_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_OAK_WHITE_PLASTER_CROSS.get()).requires(ModBlocks.WHITE_PLASTER.get()).requires(Blocks.OAK_PLANKS).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_oak_white_plaster_cross_from_oak_planks_white_plaster");

        ShapelessRecipeBuilder.shapeless(ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER_CROSS.get()).requires(ModBlocks.WHITE_PLASTER.get()).requires(Blocks.SPRUCE_PLANKS).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tudor_spruce_white_plaster_cross_from_spruce_planks_white_plaster");

    }

}
