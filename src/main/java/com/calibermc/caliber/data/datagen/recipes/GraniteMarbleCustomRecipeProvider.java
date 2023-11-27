package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class GraniteMarbleCustomRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public GraniteMarbleCustomRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        
        /* GRANITE BLOCKS */
        /* Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_ARCH.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_arch_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_ARCH.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_arch_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_ARCH.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_arch_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_ARCH.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_arch_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_ARCH.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arch_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_ARCH.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_from_white_granite_stonecutting");

        /* Large Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_arch_large_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_arch_large_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_arch_large_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_arch_large_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arch_large_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_large_from_white_granite_stonecutting");

        /* Half Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_arch_half_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_arch_half_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_arch_half_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_arch_half_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arch_half_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_half_from_white_granite_stonecutting");

        /* Half Large Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_arch_large_half_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_arch_large_half_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_arch_large_half_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_arch_large_half_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arch_large_half_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_large_half_from_white_granite_stonecutting");

        /* Granite Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_arrowslit_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_arrowslit_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_arrowslit_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_arrowslit_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arrowslit_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_arrowslit_from_white_granite_stonecutting");

        /* Granite Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_balustrade_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_balustrade_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_balustrade_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_balustrade_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_balustrade_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_balustrade_from_white_granite_stonecutting");

        /* Granite Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_CAPITAL.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_capital_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_CAPITAL.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_capital_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_CAPITAL.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_capital_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_CAPITAL.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_capital_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_CAPITAL.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_capital_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_CAPITAL.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_capital_from_white_granite_stonecutting");

        /* Granite Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
//        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE_WINDOW.get(), 12).define('G', ModBlocks.BLACK_GRANITE.get()).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_black_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE_WINDOW.get(), 12).define('G', ModBlocks.BROWN_GRANITE.get()).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_brown_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE_WINDOW.get(), 12).define('G', ModBlocks.GRAY_GRANITE.get()).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_gray_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE_WINDOW.get(), 12).define('G', ModBlocks.PINK_GRANITE.get()).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_pink_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_window_from_shaped");
        //        ShapedRecipeBuilder.shaped(ModBlocks.RED_GRANITE_WINDOW.get(), 12).define('G', Blocks.GRANITE).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE_WINDOW.get(), 12).define('G', ModBlocks.WHITE_GRANITE.get()).pattern("GGG").pattern(" GG").pattern("  G").unlockedBy("has_white_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_window_from_shaped");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_CORNER.get(), 5).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_corner_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_CORNER.get(), 5).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_corner_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_CORNER.get(), 5).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_corner_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_CORNER.get(), 5).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_corner_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_CORNER.get(), 5).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_corner_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_CORNER.get(), 5).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_corner_from_white_granite_stonecutting");

        /* Granite Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_corner_slab_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_corner_slab_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_corner_slab_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_corner_slab_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_corner_slab_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_corner_slab_from_white_granite_stonecutting");
        
        /* Granite Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_corner_slab_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_corner_slab_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_corner_slab_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_corner_slab_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_corner_slab_vertical_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_corner_slab_vertical_from_white_granite_stonecutting");

        /* Granite Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_EIGHTH.get(), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_eighth_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_EIGHTH.get(), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_eighth_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_EIGHTH.get(), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_eighth_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_EIGHTH.get(), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_eighth_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_EIGHTH.get(), 8).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_eighth_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_EIGHTH.get(), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_eighth_from_white_granite_stonecutting");

        /* Granite Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_PILLAR.get(), 5).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_pillar_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_PILLAR.get(), 5).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_pillar_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_PILLAR.get(), 5).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_pillar_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_PILLAR.get(), 5).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_pillar_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_PILLAR.get(), 5).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_pillar_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_PILLAR.get(), 5).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_pillar_from_white_granite_stonecutting");
        
        /* Granite Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_QUARTER.get(), 5).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_quarter_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_QUARTER.get(), 5).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_quarter_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_QUARTER.get(), 5).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_quarter_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_QUARTER.get(), 5).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_quarter_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_QUARTER.get(), 5).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_quarter_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_QUARTER.get(), 5).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_quarter_from_white_granite_stonecutting");

        /* Granite Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_quarter_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_quarter_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_quarter_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_quarter_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_quarter_vertical_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_quarter_vertical_from_white_granite_stonecutting");

        /* Granite Windows */
//        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE_WINDOW.get(), 16).define('G', ModBlocks.BLACK_GRANITE.get()).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_black_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE_WINDOW.get(), 16).define('G', ModBlocks.BROWN_GRANITE.get()).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_brown_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE_WINDOW.get(), 16).define('G', ModBlocks.GRAY_GRANITE.get()).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_gray_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE_WINDOW.get(), 16).define('G', ModBlocks.PINK_GRANITE.get()).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_pink_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_window_from_shaped");
        //        ShapedRecipeBuilder.shaped(ModBlocks.RED_GRANITE_WINDOW.get(), 16).define('G', Blocks.GRANITE).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_window_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE_WINDOW.get(), 16).define('G', ModBlocks.WHITE_GRANITE.get()).pattern("GGG").pattern("G G").pattern("GGG").unlockedBy("has_white_granite",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_window_from_shaped");


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_WINDOW.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_window_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_WINDOW.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_window_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_WINDOW.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_window_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_WINDOW.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_window_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_WINDOW.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_window_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_WINDOW.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_window_from_white_granite_stonecutting");

        /* Granite Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_window_half_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_window_half_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_window_half_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_window_half_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_window_half_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_window_half_from_white_granite_stonecutting");
        
        /* POLISHED GRANITE ARCHES */
        /* Polished Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_ARCH.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arch_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_ARCH.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arch_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_ARCH.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arch_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_ARCH.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arch_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_ARCH.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arch_from_polished_white_granite_stonecutting");

        /* Large Polished Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arch_large_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arch_large_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arch_large_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arch_large_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arch_large_from_polished_white_granite_stonecutting");

        /* Half Polished Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arch_half_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arch_half_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arch_half_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arch_half_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_ARCH_HALF.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arch_half_from_polished_white_granite_stonecutting");

        /* Half Large Polished Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arch_large_half_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arch_large_half_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arch_large_half_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arch_large_half_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arch_large_half_from_polished_white_granite_stonecutting");
        
        /* Polished Granite Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arrowslit_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arrowslit_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arrowslit_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arrowslit_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arrowslit_from_polished_white_granite_stonecutting");

        /* Polished Granite Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_balustrade_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_balustrade_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_balustrade_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_balustrade_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_balustrade_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_BALUSTRADE.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_balustrade_from_polished_white_granite_stonecutting");

        /* Polished Granite Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_CAPITAL.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_capital_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_CAPITAL.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_capital_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_CAPITAL.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_capital_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_CAPITAL.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_capital_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_CAPITAL.get(), 2).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_capital_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_CAPITAL.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_capital_from_polished_white_granite_stonecutting");

        /* Polished Granite Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_CORNER.get(), 5).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_corner_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_CORNER.get(), 5).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_corner_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_CORNER.get(), 5).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_corner_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_CORNER.get(), 5).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_corner_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_CORNER.get(), 5).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_corner_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_CORNER.get(), 5).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_corner_from_polished_white_granite_stonecutting");

        /* Polished Granite Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_corner_slab_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_corner_slab_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_corner_slab_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_corner_slab_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_corner_slab_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_corner_slab_from_polished_white_granite_stonecutting");

        /* Polished Granite Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_corner_slab_vertical_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_corner_slab_vertical_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_corner_slab_vertical_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_corner_slab_vertical_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_corner_slab_vertical_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_corner_slab_vertical_from_polished_white_granite_stonecutting");

        /* Polished Granite Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_EIGHTH.get(), 8).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_eighth_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_EIGHTH.get(), 8).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_eighth_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_EIGHTH.get(), 8).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_eighth_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_EIGHTH.get(), 8).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_eighth_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_EIGHTH.get(), 8).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_eighth_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_EIGHTH.get(), 8).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_eighth_from_polished_white_granite_stonecutting");

        /* Polished Granite Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_PILLAR.get(), 5).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_pillar_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_PILLAR.get(), 5).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_pillar_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_PILLAR.get(), 5).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_pillar_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_PILLAR.get(), 5).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_pillar_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_PILLAR.get(), 5).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_pillar_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_PILLAR.get(), 5).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_pillar_from_polished_white_granite_stonecutting");
        
        /* Polished Granite Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_QUARTER.get(), 5).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_quarter_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_QUARTER.get(), 5).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_quarter_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_QUARTER.get(), 5).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_quarter_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_QUARTER.get(), 5).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_quarter_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_QUARTER.get(), 5).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_quarter_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_QUARTER.get(), 5).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_quarter_from_polished_white_granite_stonecutting");

        /* Polished Granite Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_quarter_vertical_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_quarter_vertical_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_quarter_vertical_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_quarter_vertical_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_quarter_vertical_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_quarter_vertical_from_polished_white_granite_stonecutting");

        /* Polished Granite Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_WINDOW.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_window_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_WINDOW.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_window_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_WINDOW.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_window_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_WINDOW.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_window_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_WINDOW.get(), 2).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_window_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_WINDOW.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_window_from_polished_white_granite_stonecutting");

        /* Polished Granite Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_window_half_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_window_half_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_window_half_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_window_half_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_window_half_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_window_half_from_polished_white_granite_stonecutting");

        /* MARBLE BLOCKS */
        /* Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_ARCH.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_arch_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_ARCH.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_arch_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_ARCH.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_arch_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_ARCH.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_arch_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_ARCH.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_arch_from_white_marble_stonecutting");

        /* Half Large Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_arch_large_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_arch_large_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_arch_large_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_arch_large_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_arch_large_from_white_marble_stonecutting");

        /* Half Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_arch_half_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_arch_half_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_arch_half_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_arch_half_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_arch_half_from_white_marble_stonecutting");

        /* Large Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_arch_large_half_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_arch_large_half_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_arch_large_half_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_arch_large_half_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_arch_large_half_from_white_marble_stonecutting");
        
        /* Marble Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_arrowslit_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_arrowslit_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_arrowslit_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_arrowslit_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_arrowslit_from_white_marble_stonecutting");

        /* Marble Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_balustrade_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_balustrade_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_balustrade_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_balustrade_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_balustrade_from_white_marble_stonecutting");

        /* Marble Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_CAPITAL.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_capital_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_CAPITAL.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_capital_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_CAPITAL.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_capital_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_CAPITAL.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_capital_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_CAPITAL.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_capital_from_white_marble_stonecutting");

        /* Marble Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_CORNER.get(), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_corner_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_CORNER.get(), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_corner_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_CORNER.get(), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_corner_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_CORNER.get(), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_corner_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_CORNER.get(), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_corner_from_white_marble_stonecutting");

        /* Marble Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_corner_slab_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_corner_slab_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_corner_slab_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_corner_slab_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_corner_slab_from_white_marble_stonecutting");

        /* Marble Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_corner_slab_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_corner_slab_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_corner_slab_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_corner_slab_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_corner_slab_vertical_from_white_marble_stonecutting");

        /* Marble Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_EIGHTH.get(), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_eighth_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_EIGHTH.get(), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_eighth_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_EIGHTH.get(), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_eighth_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_EIGHTH.get(), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_eighth_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_EIGHTH.get(), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_eighth_from_white_marble_stonecutting");

        /* Marble Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_PILLAR.get(), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_pillar_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_PILLAR.get(), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_pillar_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_PILLAR.get(), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_pillar_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_PILLAR.get(), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_pillar_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_PILLAR.get(), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_pillar_from_white_marble_stonecutting");
        
        /* Marble Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_QUARTER.get(), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_quarter_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_QUARTER.get(), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_quarter_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_QUARTER.get(), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_quarter_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_QUARTER.get(), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_quarter_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_QUARTER.get(), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_quarter_from_white_marble_stonecutting");

        /* Marble Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_quarter_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_quarter_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_quarter_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_quarter_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_quarter_vertical_from_white_marble_stonecutting");

        /* Marble Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_WINDOW.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_window_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_WINDOW.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_window_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_WINDOW.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_window_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_WINDOW.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_window_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_WINDOW.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_window_from_white_marble_stonecutting");

        /* Marble Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_window_half_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_window_half_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_window_half_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_window_half_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_window_half_from_white_marble_stonecutting");
        
        /* POLISHED MARBLE BLOCKS */
        /* Polished Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_ARCH.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arch_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_ARCH.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arch_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_ARCH.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arch_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_ARCH.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arch_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_ARCH.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arch_from_polished_white_marble_stonecutting");

        /* Large Polished Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arch_large_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arch_large_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arch_large_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arch_large_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_ARCH_LARGE.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arch_large_from_polished_white_marble_stonecutting");

        /* Half Polished Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arch_half_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arch_half_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arch_half_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arch_half_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_ARCH_HALF.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arch_half_from_polished_white_marble_stonecutting");

        /* Half Large Polished Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arch_large_half_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arch_large_half_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arch_large_half_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arch_large_half_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arch_large_half_from_polished_white_marble_stonecutting");
        
        /* Polished Marble Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arrowslit_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arrowslit_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arrowslit_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arrowslit_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_ARROWSLIT.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arrowslit_from_polished_white_marble_stonecutting");

        /* Polished Marble Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_balustrade_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_balustrade_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_balustrade_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_balustrade_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_BALUSTRADE.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_balustrade_from_polished_white_marble_stonecutting");

        /* Polished Marble Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_CAPITAL.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_capital_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_CAPITAL.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_capital_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_CAPITAL.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_capital_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_CAPITAL.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_capital_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_CAPITAL.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_capital_from_polished_white_marble_stonecutting");

        /* Polished Marble Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_CORNER.get(), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_corner_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_CORNER.get(), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_corner_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_CORNER.get(), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_corner_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_CORNER.get(), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_corner_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_CORNER.get(), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_corner_from_polished_white_marble_stonecutting");

        /* Polished Marble Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_corner_slab_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_corner_slab_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_corner_slab_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_corner_slab_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_CORNER_SLAB.get(), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_corner_slab_from_polished_white_marble_stonecutting");

        /* Polished Marble Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_corner_slab_vertical_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_corner_slab_vertical_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_corner_slab_vertical_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_corner_slab_vertical_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_corner_slab_vertical_from_polished_white_marble_stonecutting");

        /* Polished Marble Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_EIGHTH.get(), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_eighth_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_EIGHTH.get(), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_eighth_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_EIGHTH.get(), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_eighth_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_EIGHTH.get(), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_eighth_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_EIGHTH.get(), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_eighth_from_polished_white_marble_stonecutting");

        /* Polished Marble Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_PILLAR.get(), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_pillar_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_PILLAR.get(), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_pillar_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_PILLAR.get(), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_pillar_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_PILLAR.get(), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_pillar_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_PILLAR.get(), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_pillar_from_polished_white_marble_stonecutting");
        
        /* Polished Marble Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_QUARTER.get(), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_quarter_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_QUARTER.get(), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_quarter_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_QUARTER.get(), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_quarter_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_QUARTER.get(), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_quarter_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_QUARTER.get(), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_quarter_from_polished_white_marble_stonecutting");

        /* Polished Marble Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_quarter_vertical_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_quarter_vertical_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_quarter_vertical_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_quarter_vertical_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_quarter_vertical_from_polished_white_marble_stonecutting");

        /* Polished Marble Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_WINDOW.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_window_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_WINDOW.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_window_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_WINDOW.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_window_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_WINDOW.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_window_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_WINDOW.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_window_from_polished_white_marble_stonecutting");

        /* Polished Marble Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_window_half_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_window_half_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_window_half_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_window_half_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_WINDOW_HALF.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_window_half_from_polished_white_marble_stonecutting");

    }

}
