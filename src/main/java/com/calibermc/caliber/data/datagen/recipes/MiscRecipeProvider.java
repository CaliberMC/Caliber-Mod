package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.crafting.CaliberRecipeBuilder;
import com.calibermc.caliber.item.CaliberItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MiscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MiscRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        craftingTableRecipes(pFinishedRecipeConsumer);
        planksRecipes(pFinishedRecipeConsumer);
        stainedStrippedWoodRecipes(pFinishedRecipeConsumer);
        boardsRecipes(pFinishedRecipeConsumer);
    }

    private void craftingTableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Crafting Tables */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, CaliberBlocks.WOODCUTTER.get(), 1).define('I', Items.IRON_INGOT).define('S', Blocks.SMOOTH_STONE).pattern(" I ").pattern("SSS").unlockedBy("has_iron_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_INGOT).build())).save(pFinishedRecipeConsumer, "woodcutter_from_shaped_iron_ingot_stone");
    }


    private void planksRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Planks from Boards Woodcutting*/
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.ACACIA_BOARDS.baseBlock()), Blocks.ACACIA_PLANKS).unlockedBy("has_acacia_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_planks_from_acacia_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.BIRCH_BOARDS.baseBlock()), Blocks.BIRCH_PLANKS).unlockedBy("has_birch_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_planks_from_birch_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.DARK_OAK_BOARDS.baseBlock()), Blocks.DARK_OAK_PLANKS).unlockedBy("has_dark_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_planks_from_dark_oak_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.JUNGLE_BOARDS.baseBlock()), Blocks.JUNGLE_PLANKS).unlockedBy("has_jungle_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_planks_from_jungle_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.OAK_BOARDS.baseBlock()), Blocks.OAK_PLANKS).unlockedBy("has_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_planks_from_oak_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.SPRUCE_BOARDS.baseBlock()), Blocks.SPRUCE_PLANKS).unlockedBy("has_spruce_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_planks_from_spruce_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.CRIMSON_BOARDS.baseBlock()), Blocks.CRIMSON_PLANKS).unlockedBy("has_crimson_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_planks_from_crimson_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.WARPED_BOARDS.baseBlock()), Blocks.WARPED_PLANKS).unlockedBy("has_warped_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_planks_from_warped_boards_woodcutting");

        /* Stained Planks from Stained Boards Woodcutting*/
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_ACACIA_BOARDS.baseBlock()), CaliberBlocks.STAINED_ACACIA.baseBlock()).unlockedBy("has_stained_acacia_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_from_stained_acacia_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_BIRCH_BOARDS.baseBlock()), CaliberBlocks.STAINED_BIRCH.baseBlock()).unlockedBy("has_stained_birch_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_planks_from_stained_birch_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), CaliberBlocks.STAINED_DARK_OAK.baseBlock()).unlockedBy("has_stained_dark_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_planks_from_stained_dark_oak_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), CaliberBlocks.STAINED_JUNGLE.baseBlock()).unlockedBy("has_stained_jungle_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_planks_from_stained_jungle_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_OAK_BOARDS.baseBlock()), CaliberBlocks.STAINED_OAK.baseBlock()).unlockedBy("has_stained_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_planks_from_stained_oak_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), CaliberBlocks.STAINED_SPRUCE.baseBlock()).unlockedBy("has_stained_spruce_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_planks_from_stained_spruce_boards_woodcutting");

        /* Stained Planks Buttons */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_ACACIA_BUTTON.get()).requires(CaliberBlocks.STAINED_ACACIA.baseBlock()).unlockedBy("has_stained_acacia", inventoryTrigger(ItemPredicate.Builder.item()
                .of(CaliberBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_BIRCH_BUTTON.get()).requires(CaliberBlocks.STAINED_BIRCH.baseBlock()).unlockedBy("has_stained_birch", inventoryTrigger(ItemPredicate.Builder.item()
                .of(CaliberBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_DARK_OAK_BUTTON.get()).requires(CaliberBlocks.STAINED_DARK_OAK.baseBlock()).unlockedBy("has_stained_dark_oak", inventoryTrigger(ItemPredicate.Builder.item()
                .of(CaliberBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_JUNGLE_BUTTON.get()).requires(CaliberBlocks.STAINED_JUNGLE.baseBlock()).unlockedBy("has_stained_jungle", inventoryTrigger(ItemPredicate.Builder.item()
                .of(CaliberBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_OAK_BUTTON.get()).requires(CaliberBlocks.STAINED_OAK.baseBlock()).unlockedBy("has_stained_oak", inventoryTrigger(ItemPredicate.Builder.item()
                .of(CaliberBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_SPRUCE_BUTTON.get()).requires(CaliberBlocks.STAINED_SPRUCE.baseBlock()).unlockedBy("has_stained_spruce", inventoryTrigger(ItemPredicate.Builder.item()
                .of(CaliberBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_button_from_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_ACACIA_BUTTON.get(), 1).requires(Blocks.ACACIA_BUTTON).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_button_from_acacia_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_BIRCH_BUTTON.get(), 1).requires(Blocks.BIRCH_BUTTON).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_button_from_birch_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_DARK_OAK_BUTTON.get(), 1).requires(Blocks.DARK_OAK_BUTTON).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_button_from_dark_oak_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_JUNGLE_BUTTON.get(), 1).requires(Blocks.JUNGLE_BUTTON).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_button_from_jungle_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_OAK_BUTTON.get(), 1).requires(Blocks.OAK_BUTTON).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_button_from_oak_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_SPRUCE_BUTTON.get(), 1).requires(Blocks.SPRUCE_BUTTON).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_button_from_spruce_button_and_resin");

        /* Stained Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_ACACIA_DOOR.get(), 3).define('#', CaliberBlocks.STAINED_ACACIA.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_BIRCH_DOOR.get(), 3).define('#', CaliberBlocks.STAINED_BIRCH.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_DARK_OAK_DOOR.get(), 3).define('#', CaliberBlocks.STAINED_DARK_OAK.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_JUNGLE_DOOR.get(), 3).define('#', CaliberBlocks.STAINED_JUNGLE.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_OAK_DOOR.get(), 3).define('#', CaliberBlocks.STAINED_OAK.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_SPRUCE_DOOR.get(), 3).define('#', CaliberBlocks.STAINED_SPRUCE.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_from_shaped_stained_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_ACACIA_DOOR.get(), 1).requires(Blocks.ACACIA_DOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_from_acacia_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_BIRCH_DOOR.get(), 1).requires(Blocks.BIRCH_DOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_from_birch_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_DARK_OAK_DOOR.get(), 1).requires(Blocks.DARK_OAK_DOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_from_dark_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_JUNGLE_DOOR.get(), 1).requires(Blocks.JUNGLE_DOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_from_jungle_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_OAK_DOOR.get(), 1).requires(Blocks.OAK_DOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_from_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_SPRUCE_DOOR.get(), 1).requires(Blocks.SPRUCE_DOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_from_spruce_door_and_resin");

        /* Stained Planks Signs */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_ACACIA_SIGN.get(), 3).define('#', CaliberBlocks.STAINED_ACACIA.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_sign_from_shaped_stained_acacia_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_BIRCH_SIGN.get(), 3).define('#', CaliberBlocks.STAINED_BIRCH.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_sign_from_shaped_stained_birch_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_DARK_OAK_SIGN.get(), 3).define('#', CaliberBlocks.STAINED_DARK_OAK.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_sign_from_shaped_stained_dark_oak_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_JUNGLE_SIGN.get(), 3).define('#', CaliberBlocks.STAINED_JUNGLE.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_sign_from_shaped_stained_jungle_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_OAK_SIGN.get(), 3).define('#', CaliberBlocks.STAINED_OAK.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_sign_from_shaped_stained_oak_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_SPRUCE_SIGN.get(), 3).define('#', CaliberBlocks.STAINED_SPRUCE.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_sign_from_shaped_stained_spruce_and_sticks");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_ACACIA_SIGN.get(), 1).requires(Blocks.ACACIA_SIGN).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_sign_from_acacia_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_BIRCH_SIGN.get(), 1).requires(Blocks.BIRCH_SIGN).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_sign_from_birch_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_DARK_OAK_SIGN.get(), 1).requires(Blocks.DARK_OAK_SIGN).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_sign_from_dark_oak_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_JUNGLE_SIGN.get(), 1).requires(Blocks.JUNGLE_SIGN).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_sign_from_jungle_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_OAK_SIGN.get(), 1).requires(Blocks.OAK_SIGN).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_sign_from_oak_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS,  CaliberBlocks.STAINED_SPRUCE_SIGN.get(), 1).requires(Blocks.SPRUCE_SIGN).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_sign_from_spruce_sign_and_resin");

        /* Tall Stained Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_ACACIA_DOOR.get(), 1).define('X', CaliberBlocks.STAINED_ACACIA_DOOR.get()).define('#', CaliberBlocks.STAINED_ACACIA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_acacia_door_from_stained_acacia_door_and_stained_acacia_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_BIRCH_DOOR.get(), 1).define('X', CaliberBlocks.STAINED_BIRCH_DOOR.get()).define('#', CaliberBlocks.STAINED_BIRCH.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_birch_door_from_stained_birch_door_and_stained_birch_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), 1).define('X', CaliberBlocks.STAINED_DARK_OAK_DOOR.get()).define('#', CaliberBlocks.STAINED_DARK_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_dark_oak_door_from_stained_dark_oak_door_and_stained_dark_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_JUNGLE_DOOR.get(), 1).define('X', CaliberBlocks.STAINED_JUNGLE_DOOR.get()).define('#', CaliberBlocks.STAINED_JUNGLE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_jungle_door_from_stained_jungle_door_and_stained_jungle_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_OAK_DOOR.get(), 1).define('X', CaliberBlocks.STAINED_OAK_DOOR.get()).define('#', CaliberBlocks.STAINED_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_oak_door_from_stained_oak_door_and_stained_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_SPRUCE_DOOR.get(), 1).define('X', CaliberBlocks.STAINED_SPRUCE_DOOR.get()).define('#', CaliberBlocks.STAINED_SPRUCE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_stained_spruce_door_from_stained_spruce_door_and_stained_spruce_shaped");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_ACACIA_DOOR.get(), 1).requires(CaliberBlocks.TALL_ACACIA_DOOR.get()).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_acacia_door_from_tall_acacia_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_BIRCH_DOOR.get(), 1).requires(CaliberBlocks.TALL_BIRCH_DOOR.get()).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_birch_door_from_tall_birch_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), 1).requires(CaliberBlocks.TALL_DARK_OAK_DOOR.get()).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_dark_oak_door_from_tall_dark_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_JUNGLE_DOOR.get(), 1).requires(CaliberBlocks.TALL_JUNGLE_DOOR.get()).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_jungle_door_from_tall_jungle_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_OAK_DOOR.get(), 1).requires(CaliberBlocks.TALL_OAK_DOOR.get()).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_oak_door_from_tall_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_STAINED_SPRUCE_DOOR.get(), 1).requires(CaliberBlocks.TALL_SPRUCE_DOOR.get()).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "tall_stained_spruce_door_from_tall_spruce_door_and_resin");

        /* Tall Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_ACACIA_DOOR.get(), 1).define('X', Blocks.ACACIA_DOOR).define('#', CaliberBlocks.ACACIA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_acacia_door_from_acacia_door_and_acacia_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_BIRCH_DOOR.get(), 1).define('X', Blocks.BIRCH_DOOR).define('#', CaliberBlocks.BIRCH.baseBlock()).pattern("X").pattern("#").unlockedBy("has_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_birch_door_from_birch_door_and_birch_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_DARK_OAK_DOOR.get(), 1).define('X', Blocks.DARK_OAK_DOOR).define('#', CaliberBlocks.DARK_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_dark_oak_door_from_dark_oak_door_and_dark_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_JUNGLE_DOOR.get(), 1).define('X', Blocks.JUNGLE_DOOR).define('#', CaliberBlocks.JUNGLE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_jungle_door_from_jungle_door_and_jungle_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_OAK_DOOR.get(), 1).define('X', Blocks.OAK_DOOR).define('#', CaliberBlocks.OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_oak_door_from_oak_door_and_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_SPRUCE_DOOR.get(), 1).define('X', Blocks.SPRUCE_DOOR).define('#', CaliberBlocks.SPRUCE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_spruce_door_from_spruce_door_and_spruce_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_CRIMSON_DOOR.get(), 1).define('X', Blocks.CRIMSON_DOOR).define('#', CaliberBlocks.CRIMSON.baseBlock()).pattern("X").pattern("#").unlockedBy("has_crimson",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.CRIMSON.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_crimson_door_from_crimson_door_and_crimson_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.TALL_WARPED_DOOR.get(), 1).define('X', Blocks.WARPED_DOOR).define('#', CaliberBlocks.WARPED.baseBlock()).pattern("X").pattern("#").unlockedBy("has_warped",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.WARPED.baseBlock()).build())).save(pFinishedRecipeConsumer, "tall_warped_door_from_warped_door_and_warped_shaped");

        /* Stained Planks Trapdoors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_ACACIA_TRAPDOOR.get(), 2).define('#', CaliberBlocks.STAINED_ACACIA.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_trapdoor_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_BIRCH_TRAPDOOR.get(), 2).define('#', CaliberBlocks.STAINED_BIRCH.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_trapdoor_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), 2).define('#', CaliberBlocks.STAINED_DARK_OAK.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_trapdoor_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_JUNGLE_TRAPDOOR.get(), 2).define('#', CaliberBlocks.STAINED_JUNGLE.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_trapdoor_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_OAK_TRAPDOOR.get(), 2).define('#', CaliberBlocks.STAINED_OAK.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_trapdoor_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_SPRUCE_TRAPDOOR.get(), 2).define('#', CaliberBlocks.STAINED_SPRUCE.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_trapdoor_from_shaped_stained_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_ACACIA_TRAPDOOR.get(), 1).requires(Blocks.ACACIA_TRAPDOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_trapdoor_from_acacia_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_BIRCH_TRAPDOOR.get(), 1).requires(Blocks.BIRCH_TRAPDOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_trapdoor_from_birch_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), 1).requires(Blocks.DARK_OAK_TRAPDOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_trapdoor_from_dark_oak_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_JUNGLE_TRAPDOOR.get(), 1).requires(Blocks.JUNGLE_TRAPDOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_trapdoor_from_jungle_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_OAK_TRAPDOOR.get(), 1).requires(Blocks.OAK_TRAPDOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_trapdoor_from_oak_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  CaliberBlocks.STAINED_SPRUCE_TRAPDOOR.get(), 1).requires(Blocks.SPRUCE_TRAPDOOR).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_trapdoor_from_spruce_trapdoor_and_resin");
    }

    private void stainedStrippedWoodRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Stained Stripped Wood Shapeless*/
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  CaliberBlocks.STAINED_STRIPPED_ACACIA.baseBlock(), 1).requires(Blocks.STRIPPED_ACACIA_WOOD).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_wood_from_stripped_acacia_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  CaliberBlocks.STAINED_STRIPPED_BIRCH.baseBlock(), 1).requires(Blocks.STRIPPED_BIRCH_WOOD).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_wood_from_stripped_birch_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  CaliberBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock(), 1).requires(Blocks.STRIPPED_DARK_OAK_WOOD).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_wood_from_stripped_dark_oak_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  CaliberBlocks.STAINED_STRIPPED_JUNGLE.baseBlock(), 1).requires(Blocks.STRIPPED_JUNGLE_WOOD).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_wood_from_stripped_jungle_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  CaliberBlocks.STAINED_STRIPPED_OAK.baseBlock(), 1).requires(Blocks.STRIPPED_OAK_WOOD).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_wood_from_stripped_oak_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  CaliberBlocks.STAINED_STRIPPED_SPRUCE.baseBlock(), 1).requires(Blocks.STRIPPED_SPRUCE_WOOD).requires(CaliberItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_wood_from_stripped_spruce_wood_and_resin");

    }

    private void boardsRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Boards from Planks Woodcutting*/
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), CaliberBlocks.ACACIA_BOARDS.baseBlock()).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_boards_from_acacia_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), CaliberBlocks.BIRCH_BOARDS.baseBlock()).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_boards_from_birch_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), CaliberBlocks.DARK_OAK_BOARDS.baseBlock()).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_from_dark_oak_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), CaliberBlocks.JUNGLE_BOARDS.baseBlock()).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_boards_from_jungle_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), CaliberBlocks.OAK_BOARDS.baseBlock()).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_boards_from_oak_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), CaliberBlocks.SPRUCE_BOARDS.baseBlock()).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_boards_from_spruce_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), CaliberBlocks.CRIMSON_BOARDS.baseBlock()).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_boards_from_crimson_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), CaliberBlocks.WARPED_BOARDS.baseBlock()).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_boards_from_warped_planks_woodcutting");

        /* Stained Boards from Stained Planks Woodcutting*/
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_ACACIA.baseBlock()), CaliberBlocks.STAINED_ACACIA_BOARDS.baseBlock()).unlockedBy("has_stained_acacia_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_from_stained_acacia_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_BIRCH.baseBlock()), CaliberBlocks.STAINED_BIRCH_BOARDS.baseBlock()).unlockedBy("has_stained_birch_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_from_stained_birch_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_DARK_OAK.baseBlock()), CaliberBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).unlockedBy("has_stained_dark_oak_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_from_stained_dark_oak_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_JUNGLE.baseBlock()), CaliberBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).unlockedBy("has_stained_jungle_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_from_stained_jungle_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_OAK.baseBlock()), CaliberBlocks.STAINED_OAK_BOARDS.baseBlock()).unlockedBy("has_stained_oak_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_from_stained_oak_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(CaliberBlocks.STAINED_SPRUCE.baseBlock()), CaliberBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).unlockedBy("has_stained_spruce_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_from_stained_spruce_planks_woodcutting");

    }

}
