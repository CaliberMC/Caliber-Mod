package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.crafting.ModRecipeBuilder;
import com.calibermc.caliber.data.ModBlockFamily;
import com.calibermc.caliber.item.ModItems;
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
        /* Planks from Boards */
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
        /* Stained Stripped Wood */
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.baseBlock(), 1).requires(Blocks.STRIPPED_ACACIA_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_wood_from_stripped_acacia_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.baseBlock(), 1).requires(Blocks.STRIPPED_BIRCH_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_wood_from_stripped_birch_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock(), 1).requires(Blocks.STRIPPED_DARK_OAK_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_wood_from_stripped_dark_oak_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.baseBlock(), 1).requires(Blocks.STRIPPED_JUNGLE_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_wood_from_stripped_jungle_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.baseBlock(), 1).requires(Blocks.STRIPPED_OAK_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_wood_from_stripped_oak_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.baseBlock(), 1).requires(Blocks.STRIPPED_SPRUCE_WOOD).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_wood_from_stripped_spruce_wood_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_balustrade_from_stripped_acacia_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_balustrade_from_stripped_birch_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_balustrade_from_stripped_dark_oak_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_balustrade_from_stripped_jungle_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_balustrade_from_stripped_oak_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_balustrade_from_stripped_spruce_balustrade_and_resin");
       
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_HORIZONTAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_beam_horizontal_from_stripped_acacia_beam_horizontal_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_HORIZONTAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_beam_horizontal_from_stripped_birch_beam_horizontal_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_beam_horizontal_from_stripped_dark_oak_beam_horizontal_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_beam_horizontal_from_stripped_jungle_beam_horizontal_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_HORIZONTAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_beam_horizontal_from_stripped_oak_beam_horizontal_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_HORIZONTAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_beam_horizontal_from_stripped_spruce_beam_horizontal_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_LINTEL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_beam_lintel_from_stripped_acacia_beam_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_LINTEL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_beam_lintel_from_stripped_birch_beam_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_beam_lintel_from_stripped_dark_oak_beam_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_LINTEL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_beam_lintel_from_stripped_jungle_beam_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_beam_lintel_from_stripped_oak_beam_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_LINTEL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_beam_lintel_from_stripped_spruce_beam_lintel_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_POSTS), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_POSTS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_beam_posts_from_stripped_acacia_beam_posts_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_POSTS), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_POSTS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_beam_posts_from_stripped_birch_beam_posts_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_POSTS), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_POSTS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_beam_posts_from_stripped_dark_oak_beam_posts_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_POSTS), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_POSTS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_beam_posts_from_stripped_jungle_beam_posts_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_POSTS), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_POSTS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_beam_posts_from_stripped_oak_beam_posts_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_POSTS), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_POSTS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_beam_posts_from_stripped_spruce_beam_posts_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_VERTICAL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.BEAM_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_beam_vertical_from_stripped_acacia_beam_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_VERTICAL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.BEAM_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_beam_vertical_from_stripped_birch_beam_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_beam_vertical_from_stripped_dark_oak_beam_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_VERTICAL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.BEAM_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_beam_vertical_from_stripped_jungle_beam_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.BEAM_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_beam_vertical_from_stripped_oak_beam_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_VERTICAL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.BEAM_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_beam_vertical_from_stripped_spruce_beam_vertical_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_capital_from_stripped_acacia_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_capital_from_stripped_birch_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_capital_from_stripped_dark_oak_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_capital_from_stripped_jungle_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_capital_from_stripped_oak_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_capital_from_stripped_spruce_capital_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_corner_from_stripped_acacia_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_corner_from_stripped_birch_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_corner_from_stripped_dark_oak_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_corner_from_stripped_jungle_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_corner_from_stripped_oak_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_corner_from_stripped_spruce_corner_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_corner_slab_from_stripped_acacia_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_corner_slab_from_stripped_birch_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_corner_slab_from_stripped_dark_oak_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_corner_slab_from_stripped_jungle_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_corner_slab_from_stripped_oak_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_corner_slab_from_stripped_spruce_corner_slab_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_corner_slab_vertical_from_stripped_acacia_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_corner_slab_vertical_from_stripped_birch_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_corner_slab_vertical_from_stripped_dark_oak_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_corner_slab_vertical_from_stripped_jungle_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_corner_slab_vertical_from_stripped_oak_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_corner_slab_vertical_from_stripped_spruce_corner_slab_vertical_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_door_frame_from_stripped_acacia_door_frame_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_door_frame_from_stripped_birch_door_frame_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_door_frame_from_stripped_dark_oak_door_frame_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_door_frame_from_stripped_jungle_door_frame_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_door_frame_from_stripped_oak_door_frame_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_door_frame_from_stripped_spruce_door_frame_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_door_frame_lintel_from_stripped_acacia_door_frame_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_door_frame_lintel_from_stripped_birch_door_frame_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_door_frame_lintel_from_stripped_dark_oak_door_frame_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_door_frame_lintel_from_stripped_jungle_door_frame_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_door_frame_lintel_from_stripped_oak_door_frame_lintel_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.DOOR_FRAME_LINTEL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_door_frame_lintel_from_stripped_spruce_door_frame_lintel_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_eighth_from_stripped_acacia_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_eighth_from_stripped_birch_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_eighth_from_stripped_dark_oak_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_eighth_from_stripped_jungle_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_eighth_from_stripped_oak_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_eighth_from_stripped_spruce_eighth_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_pillar_from_stripped_acacia_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_pillar_from_stripped_birch_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_pillar_from_stripped_dark_oak_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_pillar_from_stripped_jungle_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_pillar_from_stripped_oak_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_pillar_from_stripped_spruce_pillar_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_quarter_from_stripped_acacia_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_quarter_from_stripped_birch_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_quarter_from_stripped_dark_oak_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_quarter_from_stripped_jungle_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_quarter_from_stripped_oak_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_quarter_from_stripped_spruce_quarter_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_quarter_vertical_from_stripped_acacia_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_quarter_vertical_from_stripped_birch_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_quarter_vertical_from_stripped_dark_oak_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_quarter_vertical_from_stripped_jungle_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_quarter_vertical_from_stripped_oak_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_quarter_vertical_from_stripped_spruce_quarter_vertical_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_slab_from_stripped_acacia_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_slab_from_stripped_birch_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_slab_from_stripped_dark_oak_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_slab_from_stripped_jungle_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_slab_from_stripped_oak_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_slab_from_stripped_spruce_slab_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_slab_vertical_from_stripped_acacia_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_slab_vertical_from_stripped_birch_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_slab_vertical_from_stripped_dark_oak_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_slab_vertical_from_stripped_jungle_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_slab_vertical_from_stripped_oak_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_slab_vertical_from_stripped_spruce_slab_vertical_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_stairs_from_stripped_acacia_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_stairs_from_stripped_birch_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_stairs_from_stripped_dark_oak_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_stairs_from_stripped_jungle_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_stairs_from_stripped_oak_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_stairs_from_stripped_spruce_stairs_and_resin");

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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_wall_from_stripped_acacia_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_wall_from_stripped_birch_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_wall_from_stripped_dark_oak_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_wall_from_stripped_jungle_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_wall_from_stripped_oak_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_wall_from_stripped_spruce_wall_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_window_from_stripped_acacia_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_window_from_stripped_birch_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_window_from_stripped_dark_oak_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_window_from_stripped_jungle_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_window_from_stripped_oak_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_window_from_stripped_spruce_window_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_ACACIA.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.STRIPPED_ACACIA.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_window_half_from_stripped_acacia_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_BIRCH.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.STRIPPED_BIRCH.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_window_half_from_stripped_birch_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.STRIPPED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_window_half_from_stripped_dark_oak_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.STRIPPED_JUNGLE.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_window_half_from_stripped_jungle_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.STRIPPED_OAK.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_window_half_from_stripped_oak_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.STRIPPED_SPRUCE.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_window_half_from_stripped_spruce_window_half_and_resin");
    }

    private void stainedPlankRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Stained Planks from Stained Boards*/
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
        
        /* Stained Planks from Resin */
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.baseBlock(), 1).requires(Blocks.ACACIA_PLANKS).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_from_acacia_planks_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.baseBlock(), 1).requires(Blocks.BIRCH_PLANKS).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_planks_from_birch_planks_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.baseBlock(), 1).requires(Blocks.DARK_OAK_PLANKS).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_planks_from_dark_oak_planks_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.baseBlock(), 1).requires(Blocks.JUNGLE_PLANKS).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_planks_from_jungle_planks_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.baseBlock(), 1).requires(Blocks.OAK_PLANKS).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_planks_from_oak_planks_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.baseBlock(), 1).requires(Blocks.SPRUCE_PLANKS).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_planks_from_spruce_planks_and_resin");
        
        /* Stained Planks Balustrades */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_balustrade_from_acacia_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_balustrade_from_birch_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_balustrade_from_dark_oak_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_balustrade_from_jungle_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_balustrade_from_oak_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_balustrade_from_spruce_balustrade_and_resin");
        
        /* Stained Planks Buttons */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BUTTON.get(), 1).requires(Blocks.ACACIA_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_button_from_acacia_button_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BUTTON.get(), 1).requires(Blocks.BIRCH_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_button_from_birch_button_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BUTTON.get(), 1).requires(Blocks.DARK_OAK_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_button_from_dark_oak_button_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BUTTON.get(), 1).requires(Blocks.JUNGLE_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_button_from_jungle_button_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BUTTON.get(), 1).requires(Blocks.OAK_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_button_from_oak_button_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BUTTON.get(), 1).requires(Blocks.SPRUCE_BUTTON).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_button_from_spruce_button_and_resin");

        /* Stained Planks Capitals */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_capital_from_acacia_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_capital_from_birch_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_capital_from_dark_oak_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_capital_from_jungle_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_capital_from_oak_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_capital_from_spruce_capital_and_resin");

        /* Stained Planks Corners */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_corner_from_acacia_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_from_birch_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_from_dark_oak_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_from_jungle_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_from_oak_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_from_spruce_corner_and_resin");

        /* Stained Planks Corner Slabs */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_corner_slab_from_acacia_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_slab_from_birch_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_slab_from_dark_oak_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_slab_from_jungle_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_slab_from_oak_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_slab_from_spruce_corner_slab_and_resin");

        /* Stained Planks Vertical Corner Slabs */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_corner_slab_vertical_from_acacia_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_corner_slab_vertical_from_birch_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_corner_slab_vertical_from_dark_oak_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_corner_slab_vertical_from_jungle_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_corner_slab_vertical_from_oak_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_corner_slab_vertical_from_spruce_corner_slab_vertical_and_resin");
        
        /* Stained Planks Doors */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_DOOR.get(), 1).requires(Blocks.ACACIA_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_from_acacia_door_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_DOOR.get(), 1).requires(Blocks.BIRCH_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_from_birch_door_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_DOOR.get(), 1).requires(Blocks.DARK_OAK_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_from_dark_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_DOOR.get(), 1).requires(Blocks.JUNGLE_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_from_jungle_door_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_DOOR.get(), 1).requires(Blocks.OAK_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_from_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_DOOR.get(), 1).requires(Blocks.SPRUCE_DOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_from_spruce_door_and_resin");

        /* Stained Planks Eighths */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_eighth_from_acacia_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_eighth_from_birch_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_eighth_from_dark_oak_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_eighth_from_jungle_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_eighth_from_oak_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_eighth_from_spruce_eighth_and_resin");
        
        /* Stained Planks Fences */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.FENCE), 1).requires(Blocks.ACACIA_FENCE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_fence_from_acacia_fence_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.FENCE), 1).requires(Blocks.BIRCH_FENCE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_fence_from_birch_fence_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.FENCE), 1).requires(Blocks.DARK_OAK_FENCE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_fence_from_dark_oak_fence_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.FENCE), 1).requires(Blocks.JUNGLE_FENCE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_fence_from_jungle_fence_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.FENCE), 1).requires(Blocks.OAK_FENCE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_fence_from_oak_fence_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.FENCE), 1).requires(Blocks.SPRUCE_FENCE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_fence_from_spruce_fence_and_resin");
        
        /* Stained Planks Fence Gates */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.FENCE_GATE), 1).requires(Blocks.ACACIA_FENCE_GATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_fence_gate_from_acacia_fence_gate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.FENCE_GATE), 1).requires(Blocks.BIRCH_FENCE_GATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_fence_gate_from_birch_fence_gate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.FENCE_GATE), 1).requires(Blocks.DARK_OAK_FENCE_GATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_fence_gate_from_dark_oak_fence_gate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.FENCE_GATE), 1).requires(Blocks.JUNGLE_FENCE_GATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_fence_gate_from_jungle_fence_gate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.FENCE_GATE), 1).requires(Blocks.OAK_FENCE_GATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_fence_gate_from_oak_fence_gate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.FENCE_GATE), 1).requires(Blocks.SPRUCE_FENCE_GATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_fence_gate_from_spruce_fence_gate_and_resin");

        /* Stained Planks Pillars */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_pillar_from_acacia_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_pillar_from_birch_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_pillar_from_dark_oak_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_pillar_from_jungle_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_pillar_from_oak_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_pillar_from_spruce_pillar_and_resin");

        /* Stained Planks Pressure Plates */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).requires(Blocks.ACACIA_PRESSURE_PLATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_pressure_plate_from_acacia_pressure_plate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).requires(Blocks.BIRCH_PRESSURE_PLATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_pressure_plate_from_birch_pressure_plate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).requires(Blocks.DARK_OAK_PRESSURE_PLATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_pressure_plate_from_dark_oak_pressure_plate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).requires(Blocks.JUNGLE_PRESSURE_PLATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_pressure_plate_from_jungle_pressure_plate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).requires(Blocks.OAK_PRESSURE_PLATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_pressure_plate_from_oak_pressure_plate_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).requires(Blocks.SPRUCE_PRESSURE_PLATE).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_pressure_plate_from_spruce_pressure_plate_and_resin");

        /* Stained Planks Quarters */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_quarter_from_acacia_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_quarter_from_birch_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_quarter_from_dark_oak_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_quarter_from_jungle_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_quarter_from_oak_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_quarter_from_spruce_quarter_and_resin");

        /* Stained Planks Vertical Quarters */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_quarter_vertical_from_acacia_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_quarter_vertical_from_birch_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_quarter_vertical_from_dark_oak_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_quarter_vertical_from_jungle_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_quarter_vertical_from_oak_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_quarter_vertical_from_spruce_quarter_vertical_and_resin");

        /* Stained Planks Signs */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_SIGN.get(), 1).requires(Blocks.ACACIA_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_sign_from_acacia_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_SIGN.get(), 1).requires(Blocks.BIRCH_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_sign_from_birch_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_SIGN.get(), 1).requires(Blocks.DARK_OAK_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_sign_from_dark_oak_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_SIGN.get(), 1).requires(Blocks.JUNGLE_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_sign_from_jungle_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_SIGN.get(), 1).requires(Blocks.OAK_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_sign_from_oak_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_SIGN.get(), 1).requires(Blocks.SPRUCE_SIGN).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_sign_from_spruce_sign_and_resin");

        /* Stained Planks Slabs */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_slab_from_acacia_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_slab_from_birch_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_slab_from_dark_oak_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_slab_from_jungle_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_slab_from_oak_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_slab_from_spruce_slab_and_resin");

        /* Stained Planks Slab Verticals */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_slab_vertical_from_acacia_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_slab_vertical_from_birch_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_slab_vertical_from_dark_oak_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_slab_vertical_from_jungle_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_slab_vertical_from_oak_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_slab_vertical_from_spruce_slab_vertical_and_resin");

        /* Stained Planks Stairs */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_stairs_from_acacia_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_stairs_from_birch_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_stairs_from_dark_oak_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_stairs_from_jungle_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_stairs_from_oak_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_stairs_from_spruce_stairs_and_resin");

        /* Stained Planks Trapdoors */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_TRAPDOOR.get(), 1).requires(Blocks.ACACIA_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_trapdoor_from_acacia_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_TRAPDOOR.get(), 1).requires(Blocks.BIRCH_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_trapdoor_from_birch_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), 1).requires(Blocks.DARK_OAK_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_trapdoor_from_dark_oak_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_TRAPDOOR.get(), 1).requires(Blocks.JUNGLE_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_trapdoor_from_jungle_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_TRAPDOOR.get(), 1).requires(Blocks.OAK_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_trapdoor_from_oak_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_TRAPDOOR.get(), 1).requires(Blocks.SPRUCE_TRAPDOOR).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_trapdoor_from_spruce_trapdoor_and_resin");
        
        /* Stained Planks Walls */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_wall_from_acacia_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_wall_from_birch_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_wall_from_dark_oak_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_wall_from_jungle_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_wall_from_oak_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_wall_from_spruce_wall_and_resin");

        /* Stained Planks Windows */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_window_from_acacia_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_window_from_birch_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_window_from_dark_oak_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_window_from_jungle_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_window_from_oak_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_window_from_spruce_window_and_resin");

        /* Stained Planks Half Windows */
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.ACACIA.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_window_half_from_acacia_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.BIRCH.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_window_half_from_birch_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.DARK_OAK.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_window_half_from_dark_oak_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.JUNGLE.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_window_half_from_jungle_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.OAK.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_window_half_from_oak_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.SPRUCE.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_window_half_from_spruce_window_half_and_resin");
    }

    private void boardsRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Boards from Planks */
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
        /* Stained Boards from Stained Planks*/
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

        /* Stained Boards from Boards and Resin */
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock(), 1).requires(ModBlocks.ACACIA_BOARDS.baseBlock()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_from_acacia_boards_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock(), 1).requires(ModBlocks.BIRCH_BOARDS.baseBlock()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_from_birch_boards_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock(), 1).requires(ModBlocks.DARK_OAK_BOARDS.baseBlock()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_from_dark_oak_boards_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock(), 1).requires(ModBlocks.JUNGLE_BOARDS.baseBlock()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_from_jungle_boards_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.baseBlock(), 1).requires(ModBlocks.OAK_BOARDS.baseBlock()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_from_oak_boards_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock(), 1).requires(ModBlocks.SPRUCE_BOARDS.baseBlock()).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_from_spruce_boards_and_resin");

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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_balustrade_from_acacia_boards_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_balustrade_from_birch_boards_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_balustrade_from_dark_oak_boards_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_balustrade_from_jungle_boards_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_balustrade_from_oak_boards_balustrade_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.BALUSTRADE)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_balustrade_from_spruce_boards_balustrade_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_capital_from_acacia_boards_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_capital_from_birch_boards_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_capital_from_dark_oak_boards_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_capital_from_jungle_boards_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_capital_from_oak_boards_capital_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.CAPITAL), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.CAPITAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_capital_from_spruce_boards_capital_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_corner_from_acacia_boards_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_corner_from_birch_boards_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_corner_from_dark_oak_boards_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_corner_from_jungle_boards_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_corner_from_oak_boards_corner_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_corner_from_spruce_boards_corner_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_corner_slab_from_acacia_boards_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_corner_slab_from_birch_boards_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_corner_slab_from_dark_oak_boards_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_corner_slab_from_jungle_boards_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_corner_slab_from_oak_boards_corner_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_corner_slab_from_spruce_boards_corner_slab_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_corner_slab_vertical_from_acacia_boards_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_corner_slab_vertical_from_birch_boards_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_corner_slab_vertical_from_dark_oak_boards_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_corner_slab_vertical_from_jungle_boards_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_corner_slab_vertical_from_oak_boards_corner_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_corner_slab_vertical_from_spruce_boards_corner_slab_vertical_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_eighth_from_acacia_boards_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_eighth_from_birch_boards_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_eighth_from_dark_oak_boards_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_eighth_from_jungle_boards_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_eighth_from_oak_boards_eighth_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.EIGHTH), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.EIGHTH)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_eighth_from_spruce_boards_eighth_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_pillar_from_acacia_boards_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_pillar_from_birch_boards_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_pillar_from_dark_oak_boards_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_pillar_from_jungle_boards_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_pillar_from_oak_boards_pillar_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.PILLAR), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.PILLAR)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_pillar_from_spruce_boards_pillar_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_quarter_from_acacia_boards_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_quarter_from_birch_boards_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_quarter_from_dark_oak_boards_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_quarter_from_jungle_boards_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_quarter_from_oak_boards_quarter_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.QUARTER), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.QUARTER)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_quarter_from_spruce_boards_quarter_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_quarter_vertical_from_acacia_boards_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_quarter_vertical_from_birch_boards_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_quarter_vertical_from_dark_oak_boards_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_quarter_vertical_from_jungle_boards_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_quarter_vertical_from_oak_boards_quarter_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.QUARTER_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_quarter_vertical_from_spruce_boards_quarter_vertical_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_slab_from_acacia_boards_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_slab_from_birch_boards_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_slab_from_dark_oak_boards_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_slab_from_jungle_boards_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_slab_from_oak_boards_slab_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.SLAB), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.SLAB)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_slab_from_spruce_boards_slab_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_slab_vertical_from_acacia_boards_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_slab_vertical_from_birch_boards_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_slab_vertical_from_dark_oak_boards_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_slab_vertical_from_jungle_boards_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_slab_vertical_from_oak_boards_slab_vertical_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.SLAB_VERTICAL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_slab_vertical_from_spruce_boards_slab_vertical_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_stairs_from_acacia_boards_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_stairs_from_birch_boards_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_stairs_from_dark_oak_boards_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_stairs_from_jungle_boards_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_stairs_from_oak_boards_stairs_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.STAIRS), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.STAIRS)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_stairs_from_spruce_boards_stairs_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_wall_from_acacia_boards_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_wall_from_birch_boards_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_wall_from_dark_oak_boards_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_wall_from_jungle_boards_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_wall_from_oak_boards_wall_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.WALL), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.WALL)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_wall_from_spruce_boards_wall_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_window_from_acacia_boards_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_window_from_birch_boards_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_window_from_dark_oak_boards_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_window_from_jungle_boards_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_window_from_oak_boards_window_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.WINDOW), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.WINDOW)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_window_from_spruce_boards_window_and_resin");
        
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

        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_ACACIA_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.ACACIA_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_window_half_from_acacia_boards_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_BIRCH_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.BIRCH_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_window_half_from_birch_boards_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.DARK_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_window_half_from_dark_oak_boards_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_JUNGLE_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.JUNGLE_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_window_half_from_jungle_boards_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.OAK_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_window_half_from_oak_boards_window_half_and_resin");
        ShapelessRecipeBuilder.shapeless(ModBlocks.STAINED_SPRUCE_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF), 1).requires(ModBlocks.SPRUCE_BOARDS.get(ModBlockFamily.Variant.WINDOW_HALF)).requires(ModItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_window_half_from_spruce_boards_window_half_and_resin");
    }

}
