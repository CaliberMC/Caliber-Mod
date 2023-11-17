package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
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
        
        /* WOOD PLANK BLOCKS */
        /* Wood Planks Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_BALUSTRADE.get(), 2).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_balustrade_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_BALUSTRADE.get(), 2).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_balustrade_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_BALUSTRADE.get(), 2).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_balustrade_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_BALUSTRADE.get(), 2).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_balustrade_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_BALUSTRADE.get(), 2).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_balustrade_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_BALUSTRADE.get(), 2).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_balustrade_from_spruce_stonecutting");

        /* Wood Planks Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_CAPITAL.get(), 2).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_capital_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_CAPITAL.get(), 2).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_capital_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_CAPITAL.get(), 2).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_capital_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_CAPITAL.get(), 2).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_capital_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_CAPITAL.get(), 2).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_capital_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_CAPITAL.get(), 2).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_capital_from_spruce_stonecutting");

        /* Wood Planks Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
//        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_WINDOW.get(), 12).define('G', Blocks.ACACIA_PLANKS).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_WINDOW.get(), 12).define('G', Blocks.BIRCH_PLANKS).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_WINDOW.get(), 12).define('G', Blocks.DARK_OAK_PLANKS).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_WINDOW.get(), 12).define('G', Blocks.JUNGLE_PLANKS).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_window_from_shaped");
        //        ShapedRecipeBuilder.shaped(ModBlocks.OAK_WINDOW.get(), 12).define('G', Blocks.OAK_PLANKS).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_WINDOW.get(), 12).define('G', Blocks.SPRUCE_PLANKS).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_window_from_shaped");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_CORNER.get(), 2).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_corner_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_CORNER.get(), 2).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_corner_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_CORNER.get(), 2).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_corner_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_CORNER.get(), 2).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_corner_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_CORNER.get(), 2).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_corner_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_CORNER.get(), 2).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_corner_from_spruce_stonecutting");

        /* Wood Planks Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_CORNER_SLAB.get(), 4).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_corner_slab_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_CORNER_SLAB.get(), 4).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_corner_slab_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_CORNER_SLAB.get(), 4).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_corner_slab_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_CORNER_SLAB.get(), 4).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_corner_slab_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_CORNER_SLAB.get(), 4).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_corner_slab_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_CORNER_SLAB.get(), 4).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_corner_slab_from_spruce_stonecutting");
        
        /* Wood Planks Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_corner_slab_vertical_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_corner_slab_vertical_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_corner_slab_vertical_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_corner_slab_vertical_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_corner_slab_vertical_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_corner_slab_vertical_from_spruce_stonecutting");

        /* Wood Planks Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_EIGHTH.get(), 8).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_eighth_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_EIGHTH.get(), 8).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_eighth_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_EIGHTH.get(), 8).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_eighth_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_EIGHTH.get(), 8).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_eighth_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_EIGHTH.get(), 8).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_eighth_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_EIGHTH.get(), 8).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_eighth_from_spruce_stonecutting");

        /* Wood Planks Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_QUARTER.get(), 4).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_quarter_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_QUARTER.get(), 4).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_quarter_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_QUARTER.get(), 4).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_quarter_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_QUARTER.get(), 4).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_quarter_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_QUARTER.get(), 4).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_quarter_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_QUARTER.get(), 4).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_quarter_from_spruce_stonecutting");

        /* Wood Planks Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_QUARTER_VERTICAL.get(), 4).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_quarter_vertical_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_QUARTER_VERTICAL.get(), 4).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_quarter_vertical_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_quarter_vertical_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_quarter_vertical_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_quarter_vertical_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_quarter_vertical_from_spruce_stonecutting");

        /* Wood Planks Windows */
//        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_WINDOW.get(), 16).define('G', Blocks.ACACIA_PLANKS).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_WINDOW.get(), 16).define('G', Blocks.BIRCH_PLANKS).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_WINDOW.get(), 16).define('G', Blocks.DARK_OAK_PLANKS).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_WINDOW.get(), 16).define('G', Blocks.JUNGLE_PLANKS).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_window_from_shaped");
        //        ShapedRecipeBuilder.shaped(ModBlocks.OAK_WINDOW.get(), 16).define('G', Blocks.OAK_PLANKS).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_WINDOW.get(), 16).define('G', Blocks.SPRUCE_PLANKS).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_spruce_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_window_from_shaped");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ACACIA_PLANKS), ModBlocks.ACACIA_WINDOW.get(), 2).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_window_from_acacia_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BIRCH_PLANKS), ModBlocks.BIRCH_WINDOW.get(), 2).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_window_from_birch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), ModBlocks.DARK_OAK_WINDOW.get(), 2).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_window_from_dark_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.JUNGLE_PLANKS), ModBlocks.JUNGLE_WINDOW.get(), 2).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_window_from_jungle_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OAK_PLANKS), ModBlocks.OAK_WINDOW.get(), 2).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_window_from_oak_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SPRUCE_PLANKS), ModBlocks.SPRUCE_WINDOW.get(), 2).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_window_from_spruce_stonecutting");
        
//        /* POLISHED PLANKS ARCHES */
//        /* Polished Wood Planks Balustrades */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_BALUSTRADE.get(), 2).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_balustrade_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_BALUSTRADE.get(), 2).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_balustrade_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_BALUSTRADE.get(), 2).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_balustrade_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_BALUSTRADE.get(), 2).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_balustrade_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_BALUSTRADE.get(), 2).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_balustrade_from_polished_oak_stonecutting");
//
//        /* Polished Wood Planks Capitals */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_CAPITAL.get(), 2).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_capital_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_CAPITAL.get(), 2).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_capital_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_CAPITAL.get(), 2).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_capital_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_CAPITAL.get(), 2).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_capital_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_CAPITAL.get(), 2).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_capital_from_polished_oak_stonecutting");
//
//        /* Polished Wood Planks Corners */
//        // TODO: ADD SHAPED RECIPE FOR CORNERS
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_CORNER.get(), 2).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_corner_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_CORNER.get(), 2).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_corner_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_CORNER.get(), 2).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_corner_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_CORNER.get(), 2).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_corner_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_CORNER.get(), 2).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_corner_from_polished_oak_stonecutting");
//
//        /* Polished Wood Planks Corner Slabs */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_CORNER_SLAB.get(), 4).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_corner_slab_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_CORNER_SLAB.get(), 4).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_corner_slab_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_CORNER_SLAB.get(), 4).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_corner_slab_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_corner_slab_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_CORNER_SLAB.get(), 4).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_corner_slab_from_polished_oak_stonecutting");
//
//        /* Polished Wood Planks Vertical Corner Slabs */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_corner_slab_vertical_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_corner_slab_vertical_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_corner_slab_vertical_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_corner_slab_vertical_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_corner_slab_vertical_from_polished_oak_stonecutting");
//
//        /* Polished Wood Planks Eighths */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_EIGHTH.get(), 8).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_eighth_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_EIGHTH.get(), 8).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_eighth_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_EIGHTH.get(), 8).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_eighth_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_EIGHTH.get(), 8).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_eighth_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_EIGHTH.get(), 8).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_eighth_from_polished_oak_stonecutting");
//
//        /* Polished Wood Planks Quarters */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_QUARTER.get(), 4).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_quarter_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_QUARTER.get(), 4).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_quarter_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_QUARTER.get(), 4).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_quarter_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_QUARTER.get(), 4).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_quarter_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_QUARTER.get(), 4).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_quarter_from_polished_oak_stonecutting");
//
//        /* Polished Wood Planks Vertical Quarters */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_quarter_vertical_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_quarter_vertical_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_quarter_vertical_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_quarter_vertical_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_quarter_vertical_from_polished_oak_stonecutting");
//
//        /* Polished Wood Planks Windows */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()), ModBlocks.POLISHED_ACACIA_WINDOW.get(), 2).unlockedBy("has_polished_acacia_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_ACACIA_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_acacia_window_from_polished_acacia_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()), ModBlocks.POLISHED_BIRCH_WINDOW.get(), 2).unlockedBy("has_polished_birch_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BIRCH_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_birch_window_from_polished_birch_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), ModBlocks.POLISHED_DARK_OAK_WINDOW.get(), 2).unlockedBy("has_polished_dark_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_dark_oak_window_from_polished_dark_oak_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), ModBlocks.POLISHED_JUNGLE_WINDOW.get(), 2).unlockedBy("has_polished_jungle_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_jungle_window_from_polished_jungle_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()), ModBlocks.POLISHED_OAK_WINDOW.get(), 2).unlockedBy("has_polished_oak_planks",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_OAK_PLANKS.get()).build())).save(pFinishedRecipeConsumer, "polished_oak_window_from_polished_oak_stonecutting");
//        
       
    }

}
