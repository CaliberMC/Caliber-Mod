package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.crafting.ModRecipeBuilder;
import com.calibermc.caliber.data.ModBlockFamily;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class WoodRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public WoodRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        planksRecipes(pFinishedRecipeConsumer);
        stainedPlanksRecipes(pFinishedRecipeConsumer);
        strippedWoodRecipes(pFinishedRecipeConsumer);
        stainedWoodRecipes(pFinishedRecipeConsumer);
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
    }

        private void stainedPlanksRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
            /* STAINED WOOD PLANK BLOCKS */
//        /* Stained Wood Planks Balustrades */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_balustrade_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_balustrade_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_balustrade_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_balustrade_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_balustrade_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_balustrade_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Capitals */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_capital_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_capital_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_capital_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_capital_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_capital_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_capital_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Corners */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_corner_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Corner Slabs */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_corner_slab_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_slab_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_slab_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_slab_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_slab_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_slab_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Vertical Corner Slabs */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_corner_slab_vertical_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_slab_vertical_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_slab_vertical_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_slab_vertical_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_slab_vertical_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_slab_vertical_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Eighths */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_eighth_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_eighth_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_eighth_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_eighth_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_eighth_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_eighth_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Pillars */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_pillar_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_pillar_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_pillar_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_pillar_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_pillar_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_pillar_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Quarters */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_quarter_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_quarter_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_quarter_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_quarter_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_quarter_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_quarter_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Vertical Quarters */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_quarter_vertical_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_quarter_vertical_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_quarter_vertical_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_quarter_vertical_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_quarter_vertical_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_quarter_vertical_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Slabs */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_slab_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_slab_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_slab_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_slab_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_slab_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_slab_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Slab Verticals */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_slab_vertical_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_slab_vertical_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_slab_vertical_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_slab_vertical_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_slab_vertical_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_slab_vertical_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Stairs */
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_PLANKS.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_stairs_from_stained_acacia_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_PLANKS.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_planks_stairs_from_stained_birch_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_PLANKS.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_planks_stairs_from_stained_dark_oak_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_PLANKS.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_planks_stairs_from_stained_jungle_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_PLANKS.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_planks_stairs_from_stained_oak_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_PLANKS.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_planks_stairs_from_stained_spruce_plankscutting");
//
//        /* Stained Wood Planks Walls */
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_PLANKS.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_wall_from_stained_acacia_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_PLANKS.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_planks_wall_from_stained_birch_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_PLANKS.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_planks_wall_from_stained_dark_oak_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_PLANKS.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_planks_wall_from_stained_jungle_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_PLANKS.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_planks_wall_from_stained_oak_plankscutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_PLANKS.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_planks_wall_from_stained_spruce_plankscutting");
//
//        /* Stained Wood Planks Windows */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_window_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_window_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_window_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_window_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_window_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_window_from_stained_spruce_woodcutting");
//
//        /* Stained Wood Planks Half Windows */
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()), Modblocks.STAINED_ACACIA_PLANKS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_ACACIA_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_window_half_from_stained_acacia_planks_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()), Modblocks.STAINED_BIRCH_PLANKS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_BIRCH_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_window_half_from_stained_birch_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()), Modblocks.STAINED_DARK_OAK_PLANKS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_DARK_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_window_half_from_stained_dark_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()), Modblocks.STAINED_JUNGLE_PLANKS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_JUNGLE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_window_half_from_stained_jungle_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_OAK_PLANKS.baseBlock()), Modblocks.STAINED_OAK_PLANKS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_OAK_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_window_half_from_stained_oak_woodcutting");
//        ModRecipeBuilder.woodcutting(Ingredient.of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()), Modblocks.STAINED_SPRUCE_PLANKS.get(ModBlockFamily.Variant.WINDOW_HALF), 4).unlockedBy("has_stained_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Modblocks.STAINED_SPRUCE_PLANKS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_window_half_from_stained_spruce_woodcutting");
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
    }

    private void stainedWoodRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
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

        /* Stained Wood Horizontal Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_beam_horizontal_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_beam_horizontal_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_beam_horizontal_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_beam_horizontal_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_beam_horizontal_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 9).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_beam_horizontal_from_stained_spruce_woodcutting");

        /* Stained Wood Lintel Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_beam_lintel_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_beam_lintel_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_beam_lintel_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_beam_lintel_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_beam_lintel_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.BEAM_LINTEL), 16).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_beam_lintel_from_stained_spruce_woodcutting");

        /* Stained Wood Post Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_beam_posts_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_beam_posts_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_beam_posts_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_beam_posts_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_beam_posts_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.BEAM_POSTS), 16).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_beam_posts_from_stained_spruce_woodcutting");

        /* Stained Wood Vertical Beams */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_beam_vertical_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_beam_vertical_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_beam_vertical_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_beam_vertical_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_beam_vertical_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.BEAM_VERTICAL), 9).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_beam_vertical_from_stained_spruce_woodcutting");

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

        /* Stained Wood Door Frames */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_frame_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_frame_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_frame_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_frame_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_frame_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME), 16).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_frame_from_stained_spruce_woodcutting");

        /* Stained Wood Door Frame Lintels */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA.baseBlock()), ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_acacia_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_frame_lintel_from_stained_acacia_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH.baseBlock()), ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_birch_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_frame_lintel_from_stained_birch_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK.baseBlock()), ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_dark_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_frame_lintel_from_stained_dark_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE.baseBlock()), ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_jungle_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_frame_lintel_from_stained_jungle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK.baseBlock()), ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_oak_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_frame_lintel_from_stained_oak_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE.baseBlock()), ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 16).unlockedBy("has_stained_spruce_wood",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_frame_lintel_from_stained_spruce_woodcutting");

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

}
