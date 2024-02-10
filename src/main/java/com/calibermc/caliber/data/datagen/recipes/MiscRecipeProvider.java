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
    }

    private void craftingTableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Crafting Tables */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, CaliberBlocks.WOODCUTTER.get(), 1).define('I', Items.IRON_INGOT).define('S', Blocks.SMOOTH_STONE).pattern(" I ").pattern("SSS").unlockedBy("has_iron_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_INGOT).build())).save(pFinishedRecipeConsumer, "woodcutter_from_shaped_iron_ingot_stone");
    }

    private void planksRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
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
    }

}
