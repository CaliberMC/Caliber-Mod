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

public class LimestoneSandstoneCustomRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public LimestoneSandstoneCustomRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        
        /* LIMESTONE BLOCKS */
        /* Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_ARCH.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arch_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_ARCH.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_arch_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_ARCH.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arch_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_ARCH.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arch_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_ARCH.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arch_from_tan_limestone_stonecutting");

        /* Large Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arch_large_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_arch_large_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arch_large_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arch_large_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arch_large_from_tan_limestone_stonecutting");

        /* Half Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arch_half_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_arch_half_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arch_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arch_half_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arch_half_from_tan_limestone_stonecutting");

        /* Half Large Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arch_large_half_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_arch_large_half_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arch_large_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arch_large_half_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arch_large_half_from_tan_limestone_stonecutting");
        
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_CORNER.get(), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_corner_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_CORNER.get(), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_corner_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_CORNER.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_corner_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_CORNER.get(), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_corner_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_CORNER.get(), 5).unlockedBy("has_tan_limestone",
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

        /* Limestone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_pillar_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_pillar_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_PILLAR.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_pillar_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_pillar_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_pillar_from_tan_limestone_stonecutting");
        
        /* Limestone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_quarter_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_quarter_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_QUARTER.get(), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_quarter_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_quarter_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_quarter_from_tan_limestone_stonecutting");

        /* Limestone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_quarter_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_quarter_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_quarter_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_quarter_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_quarter_vertical_from_tan_limestone_stonecutting");

        /* Limestone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_window_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_window_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_WINDOW.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_window_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_window_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_window_from_tan_limestone_stonecutting");

        /* Limestone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_window_half_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_window_half_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_window_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_window_half_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_window_half_from_tan_limestone_stonecutting");

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

        /* Large Limestone Brick Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_ARCH_LARGE.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arch_large_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH_LARGE.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arch_large_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_ARCH_LARGE.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arch_large_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_ARCH_LARGE.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arch_large_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_ARCH_LARGE.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arch_large_from_tan_limestone_bricks_stonecutting");

        /* Half Limestone Brick Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_ARCH_HALF.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arch_half_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH_HALF.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arch_half_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_ARCH_HALF.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arch_half_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_ARCH_HALF.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arch_half_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_ARCH_HALF.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arch_half_from_tan_limestone_bricks_stonecutting");

        /* Half Large Limestone Brick Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arch_large_half_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arch_large_half_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arch_large_half_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arch_large_half_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arch_large_half_from_tan_limestone_bricks_stonecutting");
        
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_CORNER.get(), 5).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_corner_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get(), 5).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_corner_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_CORNER.get(), 5).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_corner_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_CORNER.get(), 5).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_corner_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_CORNER.get(), 5).unlockedBy("has_tan_limestone_bricks",
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

        /* Limestone Brick Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_PILLAR.get(), 5).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_pillar_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_PILLAR.get(), 5).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_pillar_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_PILLAR.get(), 5).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_pillar_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_PILLAR.get(), 5).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_pillar_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_PILLAR.get(), 5).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_pillar_from_tan_limestone_bricks_stonecutting");
        
        /* Limestone Brick Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_QUARTER.get(), 5).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_quarter_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get(), 5).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_quarter_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_QUARTER.get(), 5).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_quarter_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_QUARTER.get(), 5).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_quarter_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_QUARTER.get(), 5).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_quarter_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 5).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_quarter_vertical_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 5).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_quarter_vertical_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 5).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_quarter_vertical_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 5).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_quarter_vertical_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 5).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_quarter_vertical_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_WINDOW.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_window_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_window_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_WINDOW.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_window_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_WINDOW.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_window_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_WINDOW.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_window_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_WINDOW_HALF.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_window_half_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_window_half_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_WINDOW_HALF.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_window_half_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_WINDOW_HALF.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_window_half_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_WINDOW_HALF.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_window_half_from_tan_limestone_bricks_stonecutting");
        

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

        /* Large Cobbled Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arch_large_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arch_large_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arch_large_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arch_large_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arch_large_from_cobbled_tan_limestone_stonecutting");

        /* Half Cobbled Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arch_half_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arch_half_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arch_half_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arch_half_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arch_half_from_cobbled_tan_limestone_stonecutting");

        /* Half Large Cobbled Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arch_large_half_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arch_large_half_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arch_large_half_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arch_large_half_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arch_large_half_from_cobbled_tan_limestone_stonecutting");
        
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_CORNER.get(), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_corner_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_CORNER.get(), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_corner_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_CORNER.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_corner_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_CORNER.get(), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_corner_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_CORNER.get(), 5).unlockedBy("has_tan_limestone",
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

        /* Cobbled Limestone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_pillar_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_pillar_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_PILLAR.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_pillar_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_pillar_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_pillar_from_cobbled_tan_limestone_stonecutting");
        
        /* Cobbled Limestone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_quarter_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_quarter_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_quarter_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_quarter_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_quarter_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_quarter_vertical_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_quarter_vertical_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_quarter_vertical_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_quarter_vertical_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_quarter_vertical_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_window_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_window_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_window_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_window_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_window_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_window_half_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_window_half_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_window_half_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_window_half_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_window_half_from_cobbled_tan_limestone_stonecutting");

        /* LIMESTONE BLOCKS */
        /* Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_ARCH.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arch_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_ARCH.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arch_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_ARCH.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arch_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_ARCH.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arch_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_ARCH.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arch_from_smooth_tan_limestone_stonecutting");

        /* Large Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arch_large_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arch_large_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arch_large_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arch_large_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_ARCH_LARGE.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arch_large_from_smooth_tan_limestone_stonecutting");

        /* Half Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arch_half_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arch_half_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arch_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arch_half_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_ARCH_HALF.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arch_half_from_smooth_tan_limestone_stonecutting");

        /* Half Large Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arch_large_half_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arch_large_half_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arch_large_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arch_large_half_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arch_large_half_from_smooth_tan_limestone_stonecutting");

        /* Limestone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arrowslit_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arrowslit_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arrowslit_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arrowslit_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_ARROWSLIT.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arrowslit_from_smooth_tan_limestone_stonecutting");

        /* Limestone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_balustrade_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_balustrade_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_balustrade_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_balustrade_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_BALUSTRADE.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_balustrade_from_smooth_tan_limestone_stonecutting");

        /* Limestone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_capital_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_capital_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_capital_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_capital_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_CAPITAL.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_capital_from_smooth_tan_limestone_stonecutting");

        /* Limestone Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_CORNER.get(), 5).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_corner_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_CORNER.get(), 5).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_corner_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_CORNER.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_corner_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_CORNER.get(), 5).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_corner_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_CORNER.get(), 5).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_corner_from_smooth_tan_limestone_stonecutting");

        /* Limestone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_corner_slab_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_corner_slab_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_corner_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_corner_slab_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_CORNER_SLAB.get(), 4).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_corner_slab_from_smooth_tan_limestone_stonecutting");

        /* Limestone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_corner_slab_vertical_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_corner_slab_vertical_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_corner_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_corner_slab_vertical_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_corner_slab_vertical_from_smooth_tan_limestone_stonecutting");

        /* Limestone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_eighth_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_eighth_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_eighth_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_eighth_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_EIGHTH.get(), 8).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_eighth_from_smooth_tan_limestone_stonecutting");

        /* Limestone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_pillar_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_pillar_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_PILLAR.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_pillar_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_pillar_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_PILLAR.get(), 5).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_pillar_from_smooth_tan_limestone_stonecutting");

        /* Limestone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_quarter_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_quarter_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_quarter_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_quarter_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_QUARTER.get(), 5).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_quarter_from_smooth_tan_limestone_stonecutting");

        /* Limestone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_quarter_vertical_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_quarter_vertical_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_quarter_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_quarter_vertical_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_quarter_vertical_from_smooth_tan_limestone_stonecutting");

        /* Limestone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_window_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_window_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_window_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_window_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_WINDOW.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_window_from_smooth_tan_limestone_stonecutting");

        /* Limestone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_window_half_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_window_half_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_window_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_window_half_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_WINDOW_HALF.get(), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_window_half_from_smooth_tan_limestone_stonecutting");
        
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

        /* Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arch_large_from_brown_sandstone_arch_large_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arch_large_from_orange_sandstone_arch_large_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arch_large_from_red_sandstone_arch_large_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arch_large_from_sandstone_arch_large_stonecutting");
        
        /* Half Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arch_half_from_brown_sandstone_arch_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arch_half_from_orange_sandstone_arch_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arch_half_from_red_sandstone_arch_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arch_half_from_sandstone_arch_half_stonecutting");

        /* Half Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arch_large_half_from_brown_sandstone_arch_large_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arch_large_half_from_orange_sandstone_arch_large_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arch_large_half_from_red_sandstone_arch_large_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arch_large_half_from_sandstone_arch_large_half_stonecutting");
        
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_CORNER.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_corner_from_brown_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_CORNER.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_corner_from_orange_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_CORNER.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_corner_from_red_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_CORNER.get(), 5).unlockedBy("has_sandstone",
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

        /* Sandstone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_pillar_from_brown_sandstone_pillar_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_pillar_from_orange_sandstone_pillar_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_pillar_from_red_sandstone_pillar_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_PILLAR.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_pillar_from_sandstone_pillar_stonecutting");
        
        /* Sandstone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_quarter_from_brown_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_quarter_from_orange_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_quarter_from_red_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_QUARTER.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_quarter_from_sandstone_quarter_stonecutting");

        /* Sandstone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_quarter_vertical_from_brown_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_quarter_vertical_from_orange_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_quarter_vertical_from_red_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_quarter_vertical_from_sandstone_quarter_vertical_stonecutting");

        /* Sandstone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_window_from_brown_sandstone_window_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_window_from_orange_sandstone_window_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_window_from_red_sandstone_window_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_WINDOW.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_window_from_sandstone_window_stonecutting");

        /* Sandstone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_window_half_from_brown_sandstone_window_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_window_half_from_orange_sandstone_window_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_window_half_from_red_sandstone_window_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_window_half_from_sandstone_window_half_stonecutting");
        
        /* CUT SANDSTONE BLOCKS */
        /* Cut Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_ARCH.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_ARCH.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_ARCH.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_ARCH.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_from_sandstone_stonecutting");
       
        /* Large Cut Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_large_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_large_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_large_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_large_from_sandstone_stonecutting");

        /* Half Cut Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_half_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_half_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_half_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_half_from_sandstone_stonecutting");

        /* Half Large Cut Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_large_half_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_large_half_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_large_half_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_large_half_from_sandstone_stonecutting");
        
        /* Cut Sandstone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arrowslit_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arrowslit_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arrowslit_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arrowslit_from_sandstone_stonecutting");

        /* Cut Sandstone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_balustrade_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_balustrade_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_balustrade_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_balustrade_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_capital_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_capital_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_capital_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_capital_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_CORNER.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_CORNER.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_CORNER.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_CORNER.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_slab_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_slab_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_slab_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_slab_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_slab_vertical_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_slab_vertical_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_slab_vertical_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_slab_vertical_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_eighth_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_eighth_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_eighth_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_eighth_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_pillar_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_pillar_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_pillar_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_pillar_from_cut_sandstone_stonecutting");
        
        /* Cut Sandstone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_quarter_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_quarter_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_quarter_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_quarter_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_quarter_vertical_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_quarter_vertical_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_quarter_vertical_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_quarter_vertical_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_window_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_window_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_window_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_window_from_cut_sandstone_stonecutting");
        
        /* Cut Sandstone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_window_half_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_window_half_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_window_half_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_window_half_from_cut_sandstone_stonecutting");

        /* SMOOTH SANDSTONE BLOCKS */
        /* Smooth Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_ARCH.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_ARCH.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_ARCH.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_ARCH.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_from_smooth_sandstone_stonecutting");
        
        /* Large Smooth Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_large_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_large_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_large_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_large_from_smooth_sandstone_stonecutting");

        /* Half Smooth Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_half_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_half_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_half_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_ARCH_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_half_from_smooth_sandstone_stonecutting");

        /* Half Large Smooth Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_large_half_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_large_half_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_large_half_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_large_half_from_smooth_sandstone_stonecutting");
        
        /* Smooth Sandstone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arrowslit_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arrowslit_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arrowslit_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_ARROWSLIT.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arrowslit_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_balustrade_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_balustrade_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_balustrade_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_BALUSTRADE.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_balustrade_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_capital_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_capital_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_capital_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_CAPITAL.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_capital_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_CORNER.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_CORNER.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_CORNER.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_CORNER.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_slab_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_slab_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_slab_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_slab_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_slab_vertical_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_slab_vertical_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_slab_vertical_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_slab_vertical_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_eighth_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_eighth_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_eighth_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_EIGHTH.get(), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_eighth_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_pillar_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_pillar_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_pillar_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_PILLAR.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_pillar_from_smooth_sandstone_stonecutting");
        
        /* Smooth Sandstone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_quarter_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_quarter_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_quarter_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_QUARTER.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_quarter_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_quarter_vertical_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_quarter_vertical_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_quarter_vertical_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_quarter_vertical_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_window_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_window_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_window_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_WINDOW.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_window_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_window_half_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_window_half_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_window_half_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_window_half_from_smooth_sandstone_stonecutting");

    }

}
