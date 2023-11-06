package com.calibermc.caliber.data.datagen;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider2 extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider2(DataGenerator pGenerator) {
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_ARCH.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_from_white_granite_stonecutting");

        /* Granite Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_arrowslit_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_arrowslit_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_arrowslit_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_ARROWSLIT.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_arrowslit_from_pink_granite_stonecutting");
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_CAPITAL.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_capital_from_white_granite_stonecutting");

        /* Granite Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_CORNER.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_corner_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_CORNER.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_corner_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_CORNER.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_corner_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_CORNER.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_corner_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_CORNER.get(), 2).unlockedBy("has_white_granite",
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_EIGHTH.get(), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_eighth_from_white_granite_stonecutting");

        /* Granite Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_QUARTER.get(), 4).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_quarter_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_QUARTER.get(), 4).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_quarter_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_QUARTER.get(), 4).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_quarter_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_QUARTER.get(), 4).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_quarter_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_QUARTER.get(), 4).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_quarter_from_white_granite_stonecutting");

        /* Granite Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_quarter_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_quarter_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_quarter_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_quarter_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_quarter_vertical_from_white_granite_stonecutting");
        
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_CAPITAL.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_capital_from_polished_white_granite_stonecutting");

        /* Polished Granite Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_CORNER.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_corner_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_CORNER.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_corner_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_CORNER.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_corner_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_CORNER.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_corner_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_CORNER.get(), 2).unlockedBy("has_polished_white_granite",
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_EIGHTH.get(), 8).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_eighth_from_polished_white_granite_stonecutting");

        /* Polished Granite Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_QUARTER.get(), 4).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_quarter_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_QUARTER.get(), 4).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_quarter_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_QUARTER.get(), 4).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_quarter_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_QUARTER.get(), 4).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_quarter_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_QUARTER.get(), 4).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_quarter_from_polished_white_granite_stonecutting");

        /* Polished Granite Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_quarter_vertical_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_quarter_vertical_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_quarter_vertical_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_quarter_vertical_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_quarter_vertical_from_polished_white_granite_stonecutting");

        /* LIMESTONE BLOCKS */
        /* Limestone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arrowslit_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_arrowslit_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arrowslit_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arrowslit_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arrowslit_from_tan_limestone_stonecutting");

        /* Limestone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_balustrade_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_balustrade_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_balustrade_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_balustrade_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_balustrade_from_tan_limestone_stonecutting");

        /* Limestone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_capital_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_capital_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_capital_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_capital_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_capital_from_tan_limestone_stonecutting");

        /* Limestone Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_CORNER.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_corner_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_CORNER.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_corner_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_CORNER.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_corner_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_CORNER.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_corner_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_CORNER.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_corner_from_tan_limestone_stonecutting");

        /* Limestone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_corner_slab_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_corner_slab_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_corner_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_corner_slab_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_corner_slab_from_tan_limestone_stonecutting");

        /* Limestone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_corner_slab_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_corner_slab_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_corner_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_corner_slab_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_corner_slab_vertical_from_tan_limestone_stonecutting");

        /* Limestone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_eighth_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_eighth_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_eighth_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_eighth_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_eighth_from_tan_limestone_stonecutting");

        /* Limestone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_quarter_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_quarter_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_QUARTER.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_quarter_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_quarter_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_quarter_from_tan_limestone_stonecutting");

        /* Limestone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_quarter_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_quarter_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_quarter_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_quarter_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_quarter_vertical_from_tan_limestone_stonecutting");

        /* LIMESTONE BRICK BLOCKS */
        /* Limestone Brick Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_ARCH.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arch_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arch_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_ARCH.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arch_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_ARCH.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arch_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_ARCH.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arch_from_tan_limestone_bricks_stonecutting");
        
        /* Limestone Brick Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_ARROWSLIT.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arrowslit_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arrowslit_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_ARROWSLIT.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arrowslit_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_ARROWSLIT.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arrowslit_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_ARROWSLIT.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arrowslit_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_BALUSTRADE.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_balustrade_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_balustrade_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_BALUSTRADE.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_balustrade_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_BALUSTRADE.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_balustrade_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_BALUSTRADE.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_balustrade_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_CAPITAL.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_capital_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_capital_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_CAPITAL.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_capital_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_CAPITAL.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_capital_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_CAPITAL.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_capital_from_tan_limestone_bricks_stonecutting");
        
        /* Limestone Brick Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_CORNER.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_corner_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_corner_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_CORNER.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_corner_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_CORNER.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_corner_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_CORNER.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_corner_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB.get(), 4).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_corner_slab_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get(), 4).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_corner_slab_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_CORNER_SLAB.get(), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_corner_slab_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB.get(), 4).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_corner_slab_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB.get(), 4).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_corner_slab_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_corner_slab_vertical_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_corner_slab_vertical_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_corner_slab_vertical_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_corner_slab_vertical_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_corner_slab_vertical_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_EIGHTH.get(), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_eighth_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get(), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_eighth_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_EIGHTH.get(), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_eighth_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_EIGHTH.get(), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_eighth_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_EIGHTH.get(), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_eighth_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_QUARTER.get(), 4).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_quarter_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get(), 4).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_quarter_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_QUARTER.get(), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_quarter_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_QUARTER.get(), 4).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_quarter_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_QUARTER.get(), 4).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_quarter_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_quarter_vertical_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_quarter_vertical_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_quarter_vertical_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_quarter_vertical_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 4).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_quarter_vertical_from_tan_limestone_bricks_stonecutting");
        
        /* COBBLED LIMESTONE BLOCKS */
        /* Cobbled Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_ARCH.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arch_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_ARCH.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arch_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_ARCH.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arch_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_ARCH.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arch_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_ARCH.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arch_from_cobbled_tan_limestone_stonecutting");
        
        /* Cobbled Limestone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arrowslit_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arrowslit_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arrowslit_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arrowslit_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arrowslit_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_balustrade_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_balustrade_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_balustrade_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_balustrade_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_balustrade_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_capital_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_capital_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_capital_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_capital_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_capital_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_CORNER.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_corner_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_CORNER.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_corner_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_CORNER.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_corner_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_CORNER.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_corner_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_CORNER.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_corner_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_corner_slab_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_corner_slab_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_corner_slab_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_corner_slab_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_corner_slab_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_corner_slab_vertical_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_corner_slab_vertical_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_corner_slab_vertical_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_corner_slab_vertical_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_corner_slab_vertical_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_eighth_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_eighth_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_eighth_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_eighth_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_eighth_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_quarter_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_quarter_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_quarter_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_quarter_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_QUARTER.get(), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_quarter_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_quarter_vertical_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_quarter_vertical_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_quarter_vertical_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_quarter_vertical_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_quarter_vertical_from_cobbled_tan_limestone_stonecutting");

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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_CORNER.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_corner_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_CORNER.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_corner_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_CORNER.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_corner_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_CORNER.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_corner_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_CORNER.get(), 2).unlockedBy("has_white_marble",
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

        /* Marble Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_QUARTER.get(), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_quarter_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_QUARTER.get(), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_quarter_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_QUARTER.get(), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_quarter_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_QUARTER.get(), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_quarter_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_QUARTER.get(), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_quarter_from_white_marble_stonecutting");

        /* Marble Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_quarter_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_quarter_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_quarter_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_quarter_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_quarter_vertical_from_white_marble_stonecutting");
        
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_CORNER.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_corner_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_CORNER.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_corner_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_CORNER.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_corner_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_CORNER.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_corner_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_CORNER.get(), 2).unlockedBy("has_white_marble",
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

        /* Polished Marble Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_QUARTER.get(), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_quarter_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_QUARTER.get(), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_quarter_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_QUARTER.get(), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_quarter_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_QUARTER.get(), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_quarter_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_QUARTER.get(), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_quarter_from_polished_white_marble_stonecutting");

        /* Polished Marble Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_quarter_vertical_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_quarter_vertical_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_quarter_vertical_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_quarter_vertical_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_quarter_vertical_from_polished_white_marble_stonecutting");
        
        /* SANDSTONE BLOCKS */
        /* Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_ARCH.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arch_from_brown_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_ARCH.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arch_from_orange_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_ARCH.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arch_from_red_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_ARCH.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arch_from_sandstone_arch_stonecutting");

        /* Sandstone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arrowslit_from_brown_sandstone_arrowslit_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arrowslit_from_orange_sandstone_arrowslit_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arrowslit_from_red_sandstone_arrowslit_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arrowslit_from_sandstone_arrowslit_stonecutting");

        /* Sandstone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_balustrade_from_brown_sandstone_balustrade_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_balustrade_from_orange_sandstone_balustrade_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_balustrade_from_red_sandstone_balustrade_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_balustrade_from_sandstone_balustrade_stonecutting");

        /* Sandstone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_capital_from_brown_sandstone_capital_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_capital_from_orange_sandstone_capital_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_capital_from_red_sandstone_capital_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_capital_from_sandstone_capital_stonecutting");

        /* Sandstone Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_CORNER.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_corner_from_brown_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_CORNER.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_corner_from_orange_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_CORNER.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_corner_from_red_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_CORNER.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_corner_from_sandstone_corner_stonecutting");

        /* Sandstone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_corner_slab_from_brown_sandstone_corner_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_corner_slab_from_orange_sandstone_corner_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_corner_slab_from_red_sandstone_corner_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_corner_slab_from_sandstone_corner_slab_stonecutting");

        /* Sandstone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_corner_slab_vertical_from_brown_sandstone_corner_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_corner_slab_vertical_from_orange_sandstone_corner_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_corner_slab_vertical_from_red_sandstone_corner_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_corner_slab_vertical_from_sandstone_corner_slab_vertical_stonecutting");

        /* Sandstone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_eighth_from_brown_sandstone_eighth_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_eighth_from_orange_sandstone_eighth_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_eighth_from_red_sandstone_eighth_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_eighth_from_sandstone_eighth_stonecutting");

        /* Sandstone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_quarter_from_brown_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_quarter_from_orange_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_quarter_from_red_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_QUARTER.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_quarter_from_sandstone_quarter_stonecutting");

        /* Sandstone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_quarter_vertical_from_brown_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_quarter_vertical_from_orange_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_quarter_vertical_from_red_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_quarter_vertical_from_sandstone_quarter_vertical_stonecutting");
        
        /* CUT SANDSTONE BLOCKS */
        /* Cut Sandstone Arches */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_ARCH.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_from_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_ARCH.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_from_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_ARCH.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_from_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_ARCH.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_from_sandstone_stonecutting");

        /* Cut Sandstone Arrowslits */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arrowslit_from_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arrowslit_from_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arrowslit_from_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arrowslit_from_sandstone_stonecutting");

        /* Cut Sandstone Balustrades */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_balustrade_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_balustrade_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_balustrade_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_balustrade_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Capitals */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_capital_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_capital_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_capital_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_capital_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_CORNER.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_CORNER.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_CORNER.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_CORNER.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Corner Slabs */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_slab_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_slab_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_slab_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_slab_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Vertical Corner Slabs */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_slab_vertical_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_slab_vertical_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_slab_vertical_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_slab_vertical_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Eighths */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_eighth_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_eighth_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_eighth_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_eighth_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Quarters */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_quarter_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_quarter_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_quarter_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_quarter_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Vertical Quarters */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_quarter_vertical_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_quarter_vertical_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_quarter_vertical_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_quarter_vertical_from_cut_sandstone_stonecutting");

        /* SMOOTH SANDSTONE BLOCKS */
        /* Smooth Sandstone Arches */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_ARCH.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_ARCH.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_ARCH.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_ARCH.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Arrowslits */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arrowslit_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arrowslit_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arrowslit_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arrowslit_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Balustrades */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_balustrade_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_balustrade_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_balustrade_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_balustrade_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Capitals */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_capital_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_capital_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_capital_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_capital_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_CORNER.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_CORNER.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_CORNER.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_CORNER.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Corner Slabs */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_slab_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_slab_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_slab_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_slab_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Vertical Corner Slabs */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_slab_vertical_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_slab_vertical_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_slab_vertical_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_slab_vertical_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Eighths */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_eighth_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_eighth_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_eighth_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_eighth_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Quarters */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_quarter_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_quarter_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_quarter_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_QUARTER.get(), 4).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_quarter_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Vertical Quarters */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_quarter_vertical_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_quarter_vertical_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_quarter_vertical_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_QUARTER_VERTICAL.get(), 4).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_quarter_vertical_from_smooth_sandstone_stonecutting");


    }

}
