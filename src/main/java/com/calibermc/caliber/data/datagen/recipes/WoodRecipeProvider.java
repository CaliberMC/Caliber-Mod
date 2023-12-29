package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.crafting.ModRecipeBuilder;
import com.calibermc.caliber.data.ModBlockFamily;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Consumer;

public class WoodRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public WoodRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        planksRecipes(pFinishedRecipeConsumer);
        strippedWoodRecipes(pFinishedRecipeConsumer);
        stainedStrippedWoodRecipes(pFinishedRecipeConsumer);
        stainedPlankRecipes(pFinishedRecipeConsumer);
        boardsRecipes(pFinishedRecipeConsumer);
        stainedBoardsRecipes(pFinishedRecipeConsumer);
    }

    private void planksRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Wood Planks Balustrades */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_balustrade_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_balustrade_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_balustrade_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_balustrade_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_balustrade_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_balustrade_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_balustrade_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_balustrade_from_warped_woodcutting");

        /* Wood Planks Capitals */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_capital_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_capital_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_capital_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_capital_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_capital_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_capital_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_capital_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_capital_from_warped_woodcutting");

        /* Wood Planks Corners */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_corner_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_corner_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_corner_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_corner_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_corner_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_corner_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_corner_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_corner_from_warped_woodcutting");

        /* Wood Planks Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_corner_slab_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_corner_slab_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_corner_slab_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_corner_slab_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_corner_slab_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_corner_slab_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_corner_slab_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_corner_slab_from_warped_woodcutting");

        /* Wood Planks Vertical Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_corner_slab_vertical_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_corner_slab_vertical_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_corner_slab_vertical_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_corner_slab_vertical_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_corner_slab_vertical_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_corner_slab_vertical_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_corner_slab_vertical_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_corner_slab_vertical_from_warped_woodcutting");

        /* Wood Planks Eighths */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_eighth_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_eighth_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_eighth_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_eighth_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_eighth_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_eighth_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_eighth_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_eighth_from_warped_woodcutting");

        /* Wood Planks Pillars */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_pillar_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_pillar_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_pillar_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_pillar_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_pillar_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_pillar_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_pillar_from_crimson_woodcutting");

        /* Wood Planks Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_quarter_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_quarter_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_quarter_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_quarter_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_quarter_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_quarter_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_quarter_from_crimson_woodcutting");

        /* Wood Planks Vertical Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_quarter_vertical_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_quarter_vertical_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_quarter_vertical_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_quarter_vertical_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_quarter_vertical_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_quarter_vertical_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_quarter_vertical_from_crimson_woodcutting");

        /* Wood Planks Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_slab_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_slab_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_slab_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_slab_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_slab_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_slab_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_slab_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_slab_from_warped_woodcutting");

        /* Wood Planks Slab Verticals */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_slab_vertical_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_slab_vertical_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_slab_vertical_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_slab_vertical_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_slab_vertical_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_slab_vertical_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_slab_vertical_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_slab_vertical_from_warped_woodcutting");

        /*Wood Planks Stairs */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_WOOD), Blocks.ACACIA_STAIRS, 1).unlockedBy("has_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "acacia_stairs_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_WOOD), Blocks.BIRCH_STAIRS, 1).unlockedBy("has_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "birch_stairs_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_WOOD), Blocks.DARK_OAK_STAIRS, 1).unlockedBy("has_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "dark_oak_stairs_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_WOOD), Blocks.JUNGLE_STAIRS, 1).unlockedBy("has_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "jungle_stairs_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_WOOD), Blocks.OAK_STAIRS, 1).unlockedBy("has_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_WOOD).build())).save(pFinishedRecipeConsumer, "oak_stairs_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_WOOD), Blocks.SPRUCE_STAIRS, 1).unlockedBy("has_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "spruce_stairs_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), Blocks.CRIMSON_STAIRS, 1).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_stairs_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), Blocks.WARPED_STAIRS, 1).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_stairs_from_warped_woodcutting");

        /* Wood Planks Walls */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_WOOD), ModBlocks.ACACIA.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "acacia_wall_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_WOOD), ModBlocks.BIRCH.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "birch_wall_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_WOOD), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "dark_oak_wall_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_WOOD), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "jungle_wall_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_WOOD), ModBlocks.OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_WOOD).build())).save(pFinishedRecipeConsumer, "oak_wall_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_WOOD), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "spruce_wall_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_wall_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_wall_from_warped_woodcutting");

        /* Wood Planks Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_window_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_window_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_window_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_window_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_window_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_window_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_window_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_window_from_warped_woodcutting");

        /* Wood Planks Half Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_window_half_from_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_window_half_from_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_window_half_from_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_window_half_from_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_window_half_from_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_window_half_from_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), ModBlocks.CRIMSON.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_window_half_from_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), ModBlocks.WARPED.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_window_half_from_warped_woodcutting");
    }

    private void strippedWoodRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Stripped Wood Balustrades */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_balustrade_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_balustrade_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_balustrade_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_balustrade_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_balustrade_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_balustrade_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_crimson_balustrade_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_balustrade_from_stripped_warped_woodcutting");

        /* Stripped Wood Horizontal Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_beam_horizontal_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_beam_horizontal_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_beam_horizontal_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_beam_horizontal_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_beam_horizontal_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_beam_horizontal_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_beam_horizontal_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_beam_horizontal_from_stripped_warped_woodcutting");

        /* Stripped Wood Lintel Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_beam_lintel_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_beam_lintel_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_beam_lintel_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_beam_lintel_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_beam_lintel_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_beam_lintel_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_beam_lintel_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_beam_lintel_from_stripped_warped_woodcutting");

        /* Stripped Wood Post Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_beam_posts_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_beam_posts_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_beam_posts_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_beam_posts_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_beam_posts_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_beam_posts_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_beam_posts_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_beam_posts_from_stripped_warped_woodcutting");

        /* Stripped Wood Vertical Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_beam_vertical_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_beam_vertical_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_beam_vertical_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_beam_vertical_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_beam_vertical_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_beam_vertical_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_beam_vertical_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_beam_vertical_from_stripped_warped_woodcutting");

        /* Stripped Wood Capitals */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_capital_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_capital_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_capital_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_capital_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_capital_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_capital_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_capital_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_capital_from_stripped_warped_woodcutting");

        /* Stripped Wood Corners */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_corner_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_corner_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_corner_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_corner_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_corner_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_corner_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_corner_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_corner_from_stripped_warped_woodcutting");

        /* Stripped Wood Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_corner_slab_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_corner_slab_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_corner_slab_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_corner_slab_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_corner_slab_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_corner_slab_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_corner_slab_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_corner_slab_from_stripped_warped_woodcutting");

        /* Stripped Wood Vertical Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_corner_slab_vertical_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_corner_slab_vertical_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_corner_slab_vertical_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_corner_slab_vertical_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_corner_slab_vertical_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_corner_slab_vertical_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_corner_slab_vertical_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_corner_slab_vertical_from_stripped_warped_woodcutting");

        /* Stripped Wood Door Frames */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_door_frame_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_door_frame_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_door_frame_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_door_frame_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_door_frame_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_door_frame_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_door_frame_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_door_frame_from_stripped_warped_woodcutting");

        /* Stripped Wood Door Frame Lintels */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_door_frame_lintel_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_door_frame_lintel_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_door_frame_lintel_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_door_frame_lintel_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_door_frame_lintel_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_door_frame_lintel_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_door_frame_lintel_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_door_frame_lintel_from_stripped_warped_woodcutting");

        /* Stripped Wood Eighths */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_eighth_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_eighth_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_eighth_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_eighth_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_eighth_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_eighth_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_eighth_from_stripped_crimson_woodcutting");

        /* Stripped Wood Pillars */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_pillar_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_pillar_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_pillar_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_pillar_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_pillar_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_pillar_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_pillar_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_pillar_from_stripped_warped_woodcutting");

        /* Stripped Wood Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_quarter_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_quarter_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_quarter_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_quarter_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_quarter_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_quarter_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_quarter_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_quarter_from_stripped_warped_woodcutting");

        /* Stripped Wood Vertical Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_quarter_vertical_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_quarter_vertical_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_quarter_vertical_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_quarter_vertical_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_quarter_vertical_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_quarter_vertical_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_quarter_vertical_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_quarter_vertical_from_stripped_warped_woodcutting");

        /* Stripped Wood Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_slab_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_slab_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_slab_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_slab_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_slab_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_slab_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_slab_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_slab_from_stripped_warped_woodcutting");

        /* Stripped Wood Slab Verticals */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_slab_vertical_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_slab_vertical_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_slab_vertical_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_slab_vertical_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_slab_vertical_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_slab_vertical_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_slab_vertical_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_slab_vertical_from_stripped_warped_woodcutting");

        /* Stripped Wood Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 4).define('W', Blocks.STRIPPED_ACACIA_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_stairs_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 4).define('W', Blocks.STRIPPED_BIRCH_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_stairs_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 4).define('W', Blocks.STRIPPED_DARK_OAK_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_stairs_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 4).define('W', Blocks.STRIPPED_JUNGLE_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_stairs_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.STAIRS), 4).define('W', Blocks.STRIPPED_OAK_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_stairs_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 4).define('W', Blocks.STRIPPED_SPRUCE_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_stairs_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.STAIRS), 4).define('W', Blocks.STRIPPED_CRIMSON_HYPHAE).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_stairs_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.STAIRS), 4).define('W', Blocks.STRIPPED_WARPED_HYPHAE).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_stairs_from_shaped_stripped_acacia_wood");

        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_stairs_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_stairs_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_stairs_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_stairs_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_stairs_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_stairs_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_stairs_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_stairs_from_stripped_warped_woodcutting");

        /* Stripped Wood Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.WALL), 6).define('W', Blocks.STRIPPED_ACACIA_WOOD).pattern("WWW").pattern("WWW").unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_wall_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.WALL), 6).define('W', Blocks.STRIPPED_BIRCH_WOOD).pattern("WWW").pattern("WWW").unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_wall_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 6).define('W', Blocks.STRIPPED_DARK_OAK_WOOD).pattern("WWW").pattern("WWW").unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_wall_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WALL), 6).define('W', Blocks.STRIPPED_JUNGLE_WOOD).pattern("WWW").pattern("WWW").unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_wall_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.WALL), 6).define('W', Blocks.STRIPPED_OAK_WOOD).pattern("WWW").pattern("WWW").unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_wall_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WALL), 6).define('W', Blocks.STRIPPED_SPRUCE_WOOD).pattern("WWW").pattern("WWW").unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_wall_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.WALL), 6).define('W', Blocks.STRIPPED_CRIMSON_HYPHAE).pattern("WWW").pattern("WWW").unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_wall_from_shaped_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.WALL), 6).define('W', Blocks.STRIPPED_WARPED_HYPHAE).pattern("WWW").pattern("WWW").unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_wall_from_shaped_stripped_acacia_wood");

        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_wall_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_wall_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_wall_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_wall_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_wall_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_wall_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_wall_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_wall_from_stripped_warped_woodcutting");

        /* Stripped Wood Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_window_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_window_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_window_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_window_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_window_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_window_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_window_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_window_from_stripped_warped_woodcutting");

        /* Stripped Wood Half Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_ACACIA_WOOD), ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_ACACIA_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_acacia_window_half_from_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_BIRCH_WOOD), ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_BIRCH_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_birch_window_half_from_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_DARK_OAK_WOOD), ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_DARK_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_dark_oak_window_half_from_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_JUNGLE_WOOD), ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_JUNGLE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_jungle_window_half_from_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_OAK_WOOD), ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_OAK_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_oak_window_half_from_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_SPRUCE_WOOD), ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_SPRUCE_WOOD).build())).save(pFinishedRecipeConsumer, "stripped_spruce_window_half_from_stripped_spruce_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_CRIMSON_HYPHAE), ModBlocks.STRIPPED_CRIMSON.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stripped_crimson_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_CRIMSON_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_crimson_window_half_from_stripped_crimson_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(Blocks.STRIPPED_WARPED_HYPHAE), ModBlocks.STRIPPED_WARPED.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stripped_warped_hyphae",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STRIPPED_WARPED_HYPHAE).build())).save(pFinishedRecipeConsumer, "stripped_warped_window_half_from_stripped_warped_woodcutting");
    }

    private void stainedStrippedWoodRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Stained Stripped Wood Balustrades */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_balustrade_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_balustrade_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_balustrade_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_balustrade_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_balustrade_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_balustrade_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Horizontal Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_beam_horizontal_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_beam_horizontal_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_beam_horizontal_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_beam_horizontal_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_beam_horizontal_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_beam_horizontal_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Lintel Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_beam_lintel_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_beam_lintel_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_beam_lintel_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_beam_lintel_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_beam_lintel_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_beam_lintel_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Post Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_beam_posts_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_beam_posts_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_beam_posts_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_beam_posts_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_beam_posts_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_beam_posts_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Vertical Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_beam_vertical_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_beam_vertical_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_beam_vertical_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_beam_vertical_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_beam_vertical_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_beam_vertical_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Capitals */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_capital_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_capital_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_capital_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_capital_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_capital_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_capital_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Corners */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_corner_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_corner_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_corner_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_corner_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_corner_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_corner_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_corner_slab_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_corner_slab_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_corner_slab_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_corner_slab_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_corner_slab_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_corner_slab_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Vertical Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_corner_slab_vertical_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_corner_slab_vertical_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_corner_slab_vertical_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_corner_slab_vertical_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_corner_slab_vertical_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_corner_slab_vertical_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Door Frames */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_door_frame_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_door_frame_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_door_frame_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_door_frame_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_door_frame_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_door_frame_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Door Frame Lintels */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_door_frame_lintel_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_door_frame_lintel_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_door_frame_lintel_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_door_frame_lintel_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_door_frame_lintel_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_door_frame_lintel_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Eighths */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_eighth_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_eighth_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_eighth_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_eighth_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_eighth_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_eighth_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Pillars */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_pillar_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_pillar_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_pillar_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_pillar_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_pillar_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_pillar_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_quarter_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_quarter_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_quarter_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_quarter_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_quarter_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_quarter_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Vertical Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_quarter_vertical_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_quarter_vertical_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_quarter_vertical_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_quarter_vertical_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_quarter_vertical_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_quarter_vertical_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_slab_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_slab_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_slab_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_slab_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_slab_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_slab_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Slab Verticals */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_slab_vertical_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_slab_vertical_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_slab_vertical_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_slab_vertical_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_slab_vertical_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_slab_vertical_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_stairs_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_stairs_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_stairs_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_stairs_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_stairs_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_stairs_from_shaped_stained_stripped_acacia_wood");
        
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_stairs_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_stairs_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_stairs_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_stairs_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_stairs_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_stairs_from_stained_stripped_spruce_woodcutting");


        /* Stained Stripped Wood Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_wall_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_wall_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_wall_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_wall_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_wall_from_shaped_stained_stripped_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_wall_from_shaped_stained_stripped_acacia_wood");
        
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_wall_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_wall_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_wall_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_wall_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_wall_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_wall_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_window_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_window_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_window_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_window_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_window_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_window_from_stained_stripped_spruce_woodcutting");

        /* Stained Stripped Wood Half Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()), ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_stripped_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_window_half_from_stained_stripped_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()), ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_stripped_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_window_half_from_stained_stripped_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_stripped_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_window_half_from_stained_stripped_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()), ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_stripped_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_window_half_from_stained_stripped_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()), ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_stripped_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_window_half_from_stained_stripped_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()), ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_stripped_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_window_half_from_stained_stripped_spruce_woodcutting");
    }

    private void stainedPlankRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Stained Wood Balustrades */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_balustrade_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_balustrade_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_balustrade_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_balustrade_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_balustrade_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_balustrade_from_stained_spruce_woodcutting");

        /* Stained Wood Buttons */
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BUTTON.get()).requires(ModBlocks.STAINED_ACACIA.baseBlock()).unlockedBy("has_stained_acacia", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BUTTON.get()).requires(ModBlocks.STAINED_BIRCH.baseBlock()).unlockedBy("has_stained_birch", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BUTTON.get()).requires(ModBlocks.STAINED_DARK_OAK.baseBlock()).unlockedBy("has_stained_dark_oak", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BUTTON.get()).requires(ModBlocks.STAINED_JUNGLE.baseBlock()).unlockedBy("has_stained_jungle", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BUTTON.get()).requires(ModBlocks.STAINED_OAK.baseBlock()).unlockedBy("has_stained_oak", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BUTTON.get()).requires(ModBlocks.STAINED_SPRUCE.baseBlock()).unlockedBy("has_stained_spruce", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_button_from_shapeless");

        /* Stained Wood Capitals */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_capital_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_capital_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_capital_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_capital_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_capital_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_capital_from_stained_spruce_woodcutting");

        /* Stained Wood Corners */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_corner_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_from_stained_spruce_woodcutting");

        /* Stained Wood Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_corner_slab_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_slab_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_slab_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_slab_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_slab_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_slab_from_stained_spruce_woodcutting");

        /* Stained Wood Vertical Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_corner_slab_vertical_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_slab_vertical_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_slab_vertical_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_slab_vertical_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_slab_vertical_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_slab_vertical_from_stained_spruce_woodcutting");

        /* Stained Wood Doors */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA_DOOR.get(), 3).define('W', ModBlocks.STAINED_ACACIA.baseBlock()).pattern("WW").pattern("WW").pattern("WW").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH_DOOR.get(), 3).define('W', ModBlocks.STAINED_BIRCH.baseBlock()).pattern("WW").pattern("WW").pattern("WW").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK_DOOR.get(), 3).define('W', ModBlocks.STAINED_DARK_OAK.baseBlock()).pattern("WW").pattern("WW").pattern("WW").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE_DOOR.get(), 3).define('W', ModBlocks.STAINED_JUNGLE.baseBlock()).pattern("WW").pattern("WW").pattern("WW").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK_DOOR.get(), 3).define('W', ModBlocks.STAINED_OAK.baseBlock()).pattern("WW").pattern("WW").pattern("WW").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE_DOOR.get(), 3).define('W', ModBlocks.STAINED_SPRUCE.baseBlock()).pattern("WW").pattern("WW").pattern("WW").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_from_shaped_stained_spruce");

        /* Stained Wood Eighths */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_eighth_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_eighth_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_eighth_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_eighth_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_eighth_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_eighth_from_stained_spruce_woodcutting");

        /* Stained Wood Fences */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.FENCE), 3).define('W', ModBlocks.STAINED_ACACIA.baseBlock()).define('#', Items.STICK).pattern("W#W").pattern("W#W").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_fence_from_shaped_stained_acacia_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.FENCE), 3).define('W', ModBlocks.STAINED_BIRCH.baseBlock()).define('#', Items.STICK).pattern("W#W").pattern("W#W").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_fence_from_shaped_stained_birch_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.FENCE), 3).define('W', ModBlocks.STAINED_DARK_OAK.baseBlock()).define('#', Items.STICK).pattern("W#W").pattern("W#W").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_fence_from_shaped_stained_dark_oak_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.FENCE), 3).define('W', ModBlocks.STAINED_JUNGLE.baseBlock()).define('#', Items.STICK).pattern("W#W").pattern("W#W").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_fence_from_shaped_stained_jungle_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.FENCE), 3).define('W', ModBlocks.STAINED_OAK.baseBlock()).define('#', Items.STICK).pattern("W#W").pattern("W#W").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_fence_from_shaped_stained_oak_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.FENCE), 3).define('W', ModBlocks.STAINED_SPRUCE.baseBlock()).define('#', Items.STICK).pattern("W#W").pattern("W#W").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_fence_from_shaped_stained_spruce_and_sticks");

        /* Stained Wood Fence Gates */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.FENCE_GATE), 1).define('W', ModBlocks.STAINED_ACACIA.baseBlock()).define('#', Items.STICK).pattern("#W#").pattern("#W#").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_fence_gate_from_shaped_stained_acacia_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.FENCE_GATE), 1).define('W', ModBlocks.STAINED_BIRCH.baseBlock()).define('#', Items.STICK).pattern("#W#").pattern("#W#").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_fence_gate_from_shaped_stained_birch_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.FENCE_GATE), 1).define('W', ModBlocks.STAINED_DARK_OAK.baseBlock()).define('#', Items.STICK).pattern("#W#").pattern("#W#").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_fence_gate_from_shaped_stained_dark_oak_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.FENCE_GATE), 1).define('W', ModBlocks.STAINED_JUNGLE.baseBlock()).define('#', Items.STICK).pattern("#W#").pattern("#W#").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_fence_gate_from_shaped_stained_jungle_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.FENCE_GATE), 1).define('W', ModBlocks.STAINED_OAK.baseBlock()).define('#', Items.STICK).pattern("#W#").pattern("#W#").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_fence_gate_from_shaped_stained_oak_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.FENCE_GATE), 1).define('W', ModBlocks.STAINED_SPRUCE.baseBlock()).define('#', Items.STICK).pattern("#W#").pattern("#W#").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_fence_gate_from_shaped_stained_spruce_and_sticks");

        /* Stained Wood Pillars */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_pillar_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_pillar_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_pillar_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_pillar_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_pillar_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_pillar_from_stained_spruce_woodcutting");

        /* Stained Wood Pressure Plates */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('W', ModBlocks.STAINED_ACACIA.baseBlock()).pattern("WW").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_pressure_plate_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('W', ModBlocks.STAINED_BIRCH.baseBlock()).pattern("WW").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_pressure_plate_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('W', ModBlocks.STAINED_DARK_OAK.baseBlock()).pattern("WW").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_pressure_plate_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('W', ModBlocks.STAINED_JUNGLE.baseBlock()).pattern("WW").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_pressure_plate_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('W', ModBlocks.STAINED_OAK.baseBlock()).pattern("WW").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_pressure_plate_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('W', ModBlocks.STAINED_SPRUCE.baseBlock()).pattern("WW").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_pressure_plate_from_shaped_stained_spruce");

        /* Stained Wood Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_quarter_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_quarter_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_quarter_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_quarter_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_quarter_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_quarter_from_stained_spruce_woodcutting");

        /* Stained Wood Vertical Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_quarter_vertical_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_quarter_vertical_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_quarter_vertical_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_quarter_vertical_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_quarter_vertical_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_quarter_vertical_from_stained_spruce_woodcutting");

        /* Stained Wood Signs */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA_SIGN.get(), 3).define('W', ModBlocks.STAINED_ACACIA.baseBlock()).define('#', Items.STICK).pattern("WWW").pattern("WWW").pattern(" # ").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_sign_from_shaped_stained_acacia_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH_SIGN.get(), 3).define('W', ModBlocks.STAINED_BIRCH.baseBlock()).define('#', Items.STICK).pattern("WWW").pattern("WWW").pattern(" # ").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_sign_from_shaped_stained_birch_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK_SIGN.get(), 3).define('W', ModBlocks.STAINED_DARK_OAK.baseBlock()).define('#', Items.STICK).pattern("WWW").pattern("WWW").pattern(" # ").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_sign_from_shaped_stained_dark_oak_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE_SIGN.get(), 3).define('W', ModBlocks.STAINED_JUNGLE.baseBlock()).define('#', Items.STICK).pattern("WWW").pattern("WWW").pattern(" # ").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_sign_from_shaped_stained_jungle_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK_SIGN.get(), 3).define('W', ModBlocks.STAINED_OAK.baseBlock()).define('#', Items.STICK).pattern("WWW").pattern("WWW").pattern(" # ").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_sign_from_shaped_stained_oak_and_sticks");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE_SIGN.get(), 3).define('W', ModBlocks.STAINED_SPRUCE.baseBlock()).define('#', Items.STICK).pattern("WWW").pattern("WWW").pattern(" # ").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_sign_from_shaped_stained_spruce_and_sticks");

        /* Stained Wood Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_slab_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_slab_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_slab_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_slab_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_slab_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_slab_from_stained_spruce_woodcutting");

        /* Stained Wood Slab Verticals */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_slab_vertical_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_slab_vertical_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_slab_vertical_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_slab_vertical_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_slab_vertical_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_slab_vertical_from_stained_spruce_woodcutting");

        /* Stained Wood Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_ACACIA.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_stairs_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_BIRCH.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_stairs_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_DARK_OAK.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_stairs_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_JUNGLE.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_stairs_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_OAK.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_stairs_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_SPRUCE.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_stairs_from_shaped_stained_acacia_wood");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_stairs_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_stairs_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_stairs_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_stairs_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_stairs_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_stairs_from_stained_spruce_woodcutting");

        /* Stained Wood Trapdoors */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA_TRAPDOOR.get(), 2).define('W', ModBlocks.STAINED_ACACIA.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_trapdoor_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH_TRAPDOOR.get(), 2).define('W', ModBlocks.STAINED_BIRCH.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_trapdoor_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), 2).define('W', ModBlocks.STAINED_DARK_OAK.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_trapdoor_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE_TRAPDOOR.get(), 2).define('W', ModBlocks.STAINED_JUNGLE.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_trapdoor_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK_TRAPDOOR.get(), 2).define('W', ModBlocks.STAINED_OAK.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_trapdoor_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE_TRAPDOOR.get(), 2).define('W', ModBlocks.STAINED_SPRUCE.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_trapdoor_from_shaped_stained_spruce");

        /* Stained Wood Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_ACACIA.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_wall_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_BIRCH.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_wall_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_DARK_OAK.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_wall_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_JUNGLE.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_wall_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_OAK.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_wall_from_shaped_stained_acacia_wood");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_SPRUCE.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_wall_from_shaped_stained_acacia_wood");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_wall_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_wall_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_wall_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_wall_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_wall_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_wall_from_stained_spruce_woodcutting");

        /* Stained Wood Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_window_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_window_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_window_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_window_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_window_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_window_from_stained_spruce_woodcutting");

        /* Stained Wood Half Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_window_half_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_window_half_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_window_half_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_window_half_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_window_half_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_window_half_from_stained_spruce_woodcutting");
    }

    private void boardsRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Boards */
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

        /* Boards Balustrades */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_balustrade_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_balustrade_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_balustrade_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_balustrade_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_balustrade_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_balustrade_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_balustrade_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_balustrade_from_warped_boards_woodcutting");

        /* Boards Capitals */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_capital_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_capital_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_capital_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_capital_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_capital_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_capital_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_capital_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_capital_from_warped_boards_woodcutting");

        /* Boards Corners */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_corner_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_corner_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_corner_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_corner_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_corner_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_corner_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_corner_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_corner_from_warped_boards_woodcutting");

        /* Boards Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_corner_slab_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_corner_slab_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_corner_slab_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_corner_slab_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_corner_slab_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_corner_slab_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_corner_slab_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_corner_slab_from_warped_boards_woodcutting");

        /* Boards Vertical Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_corner_slab_vertical_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_corner_slab_vertical_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_corner_slab_vertical_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_corner_slab_vertical_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_corner_slab_vertical_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_corner_slab_vertical_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_corner_slab_vertical_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_corner_slab_vertical_from_warped_boards_woodcutting");

        /* Boards Eighths */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_eighth_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_eighth_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_eighth_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_eighth_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_eighth_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_eighth_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_eighth_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_eighth_from_warped_boards_woodcutting");

        /* Boards Pillars */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_pillar_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_pillar_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_pillar_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_pillar_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_pillar_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_pillar_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_pillar_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_pillar_from_warped_boards_woodcutting");

        /* Boards Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_quarter_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_quarter_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_quarter_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_quarter_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_quarter_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_quarter_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_quarter_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_quarter_from_warped_boards_woodcutting");

        /* Boards Vertical Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_quarter_vertical_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_quarter_vertical_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_quarter_vertical_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_quarter_vertical_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_quarter_vertical_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_quarter_vertical_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_quarter_vertical_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_quarter_vertical_from_warped_boards_woodcutting");

        /* Boards Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_slab_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_slab_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_slab_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_slab_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_slab_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_slab_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_slab_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_slab_from_warped_boards_woodcutting");

        /* Boards Slab Verticals */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_slab_vertical_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_slab_vertical_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_slab_vertical_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_slab_vertical_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_slab_vertical_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_slab_vertical_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_slab_vertical_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_slab_vertical_from_warped_boards_woodcutting");

        /* Boards Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.ACACIA_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_stairs_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.BIRCH_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_stairs_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.DARK_OAK_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_stairs_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.JUNGLE_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_stairs_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.OAK_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_stairs_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.SPRUCE_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_stairs_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.CRIMSON_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_stairs_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.WARPED_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_stairs_from_shaped_acacia_boards_");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_stairs_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_stairs_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_stairs_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_stairs_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_stairs_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_stairs_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_stairs_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_stairs_from_warped_boards_woodcutting");

        /* Boards Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.ACACIA_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_wall_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.BIRCH_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_wall_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.DARK_OAK_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_wall_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.JUNGLE_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_wall_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.OAK_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_wall_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.SPRUCE_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_wall_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.CRIMSON_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_wall_from_shaped_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.WARPED_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_wall_from_shaped_acacia_boards_");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_wall_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_wall_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_wall_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_wall_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_wall_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_wall_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_wall_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_wall_from_warped_boards_woodcutting");

        /* Boards Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_window_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_window_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_window_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_window_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_window_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_window_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_window_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_window_from_warped_boards_woodcutting");

        /* Boards Half Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_boards_window_half_from_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_boards_window_half_from_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_window_half_from_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_boards_window_half_from_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_boards_window_half_from_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_boards_window_half_from_spruce_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_crimson_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_boards_window_half_from_crimson_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_warped_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_boards_window_half_from_warped_boards_woodcutting");
    }

    private void stainedBoardsRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Stained Boards */
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

        /* Stained Boards Balustrades */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_balustrade_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_balustrade_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_balustrade_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_balustrade_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_balustrade_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_balustrade_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Capitals */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_capital_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_capital_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_capital_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_capital_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_capital_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_capital_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Corners */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_corner_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_corner_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_corner_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_corner_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_corner_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_corner_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_corner_slab_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_corner_slab_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_corner_slab_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_corner_slab_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_corner_slab_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_corner_slab_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Vertical Corner Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_corner_slab_vertical_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_corner_slab_vertical_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_corner_slab_vertical_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_corner_slab_vertical_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_corner_slab_vertical_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_corner_slab_vertical_from_stained_spruce_boards_woodcutting");
        
        /* Stained Boards Eighths */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_eighth_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_eighth_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_eighth_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_eighth_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_eighth_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_eighth_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Pillars */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_pillar_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_pillar_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_pillar_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_pillar_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_pillar_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_pillar_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_quarter_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_quarter_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_quarter_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_quarter_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_quarter_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_quarter_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Vertical Quarters */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_quarter_vertical_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_quarter_vertical_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_quarter_vertical_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_quarter_vertical_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_quarter_vertical_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_quarter_vertical_from_stained_spruce_boards_woodcutting");
        
        /* Stained Boards Slabs */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_slab_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_slab_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_slab_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_slab_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_slab_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_slab_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Slab Verticals */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_slab_vertical_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_slab_vertical_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_slab_vertical_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_slab_vertical_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_slab_vertical_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_slab_vertical_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_stairs_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_stairs_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_stairs_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_stairs_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_OAK_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_stairs_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 4).define('W', ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_stairs_from_shaped_stained_acacia_boards_");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_stairs_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_stairs_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_stairs_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_stairs_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_stairs_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_stairs_from_stained_spruce_boards_woodcutting");
        
        /* Stained Boards Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_wall_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_wall_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_wall_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_wall_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_OAK_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_wall_from_shaped_stained_acacia_boards_");
        ShapedRecipeBuilder.shaped(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.WALL), 6).define('W', ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).pattern("WWW").pattern("WWW").unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_wall_from_shaped_stained_acacia_boards_");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_wall_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_wall_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_wall_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_wall_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_wall_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_wall_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_window_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_window_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_window_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_window_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_window_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_window_from_stained_spruce_boards_woodcutting");

        /* Stained Boards Half Windows */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_acacia_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_window_half_from_stained_acacia_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_birch_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_window_half_from_stained_birch_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_dark_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_window_half_from_stained_dark_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_jungle_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_window_half_from_stained_jungle_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_oak_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_window_half_from_stained_oak_boards_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_spruce_boards_",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_window_half_from_stained_spruce_boards_woodcutting");
    }

}
