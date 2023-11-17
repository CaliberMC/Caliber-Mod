package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MossyBlockRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MossyBlockRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        /* MOSSY LIMESTONE BRICK BLOCKS */
        /* Mossy Limestone Bricks */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICKS.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICKS.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_bricks_from_dark_limestone_bricks_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICKS.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICKS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_bricks_from_dark_limestone_bricks_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICKS.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).requires(Items.VINE).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_bricks_from_light_limestone_bricks_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICKS.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_bricks_from_light_limestone_bricks_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICKS.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICKS.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_bricks_from_pink_limestone_bricks_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICKS.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICKS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_bricks_from_pink_limestone_bricks_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICKS.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICKS.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_bricks_from_tan_limestone_bricks_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICKS.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICKS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_bricks_from_tan_limestone_bricks_and_moss");

        /* Mossy Limestone Brick Arches */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_ARCH.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_arch_from_dark_limestone_brick_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_arch_from_dark_limestone_brick_arch_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_arch_from_light_limestone_brick_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_arch_from_light_limestone_brick_arch_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_arch_from_limestone_brick_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_arch_from_limestone_brick_arch_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_ARCH.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_arch_from_pink_limestone_brick_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_arch_from_pink_limestone_brick_arch_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_ARCH.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_arch_from_tan_limestone_brick_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_ARCH.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_arch_from_tan_limestone_brick_arch_and_moss");

        /* Mossy Limestone Brick Arrowslits */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_arrowslit_from_dark_limestone_brick_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_arrowslit_from_dark_limestone_brick_arrowslit_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_arrowslit_from_light_limestone_brick_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_arrowslit_from_light_limestone_brick_arrowslit_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_arrowslit_from_limestone_brick_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_arrowslit_from_limestone_brick_arrowslit_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_arrowslit_from_pink_limestone_brick_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_arrowslit_from_pink_limestone_brick_arrowslit_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_arrowslit_from_tan_limestone_brick_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_ARROWSLIT.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_arrowslit_from_tan_limestone_brick_arrowslit_and_moss");

        /* Mossy Limestone Brick Balustrades */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_balustrade_from_dark_limestone_brick_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_balustrade_from_dark_limestone_brick_balustrade_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_balustrade_from_light_limestone_brick_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_balustrade_from_light_limestone_brick_balustrade_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_balustrade_from_limestone_brick_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_balustrade_from_limestone_brick_balustrade_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_balustrade_from_pink_limestone_brick_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_balustrade_from_pink_limestone_brick_balustrade_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_balustrade_from_tan_limestone_brick_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_BALUSTRADE.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_balustrade_from_tan_limestone_brick_balustrade_and_moss");

        /* Mossy Limestone Brick Capitals */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_capital_from_dark_limestone_brick_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_capital_from_dark_limestone_brick_capital_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_capital_from_light_limestone_brick_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_capital_from_light_limestone_brick_capital_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_capital_from_limestone_brick_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_capital_from_limestone_brick_capital_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_capital_from_pink_limestone_brick_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_capital_from_pink_limestone_brick_capital_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_capital_from_tan_limestone_brick_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_CAPITAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_capital_from_tan_limestone_brick_capital_and_moss");

        /* Mossy Limestone Brick Corners */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_CORNER.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_corner_from_dark_limestone_brick_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_corner_from_dark_limestone_brick_corner_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_corner_from_light_limestone_brick_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_corner_from_light_limestone_brick_corner_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_corner_from_limestone_brick_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_corner_from_limestone_brick_corner_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_CORNER.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_corner_from_pink_limestone_brick_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_corner_from_pink_limestone_brick_corner_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_CORNER.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_corner_from_tan_limestone_brick_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_CORNER.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_corner_from_tan_limestone_brick_corner_and_moss");

        /* Mossy Limestone Brick Corner_Slabs */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_corner_slab_from_dark_limestone_brick_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_corner_slab_from_dark_limestone_brick_corner_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_corner_slab_from_light_limestone_brick_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_corner_slab_from_light_limestone_brick_corner_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_corner_slab_from_limestone_brick_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_corner_slab_from_limestone_brick_corner_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_corner_slab_from_pink_limestone_brick_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_corner_slab_from_pink_limestone_brick_corner_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_corner_slab_from_tan_limestone_brick_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_CORNER_SLAB.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_corner_slab_from_tan_limestone_brick_corner_slab_and_moss");

        /* Mossy Limestone Brick Corner_Slab_Verticals */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_corner_slab_vertical_from_dark_limestone_brick_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_corner_slab_vertical_from_dark_limestone_brick_corner_slab_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_corner_slab_vertical_from_light_limestone_brick_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_corner_slab_vertical_from_light_limestone_brick_corner_slab_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_corner_slab_vertical_from_limestone_brick_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_corner_slab_vertical_from_limestone_brick_corner_slab_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_corner_slab_vertical_from_pink_limestone_brick_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_corner_slab_vertical_from_pink_limestone_brick_corner_slab_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_corner_slab_vertical_from_tan_limestone_brick_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_corner_slab_vertical_from_tan_limestone_brick_corner_slab_vertical_and_moss");

        /* Mossy Limestone Brick Eighths */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_eighth_from_dark_limestone_brick_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_eighth_from_dark_limestone_brick_eighth_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_eighth_from_light_limestone_brick_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_eighth_from_light_limestone_brick_eighth_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_eighth_from_limestone_brick_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_eighth_from_limestone_brick_eighth_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_eighth_from_pink_limestone_brick_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_eighth_from_pink_limestone_brick_eighth_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_eighth_from_tan_limestone_brick_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_EIGHTH.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_eighth_from_tan_limestone_brick_eighth_and_moss");

        /* Mossy Limestone Brick Quarters */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_QUARTER.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_quarter_from_dark_limestone_brick_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_quarter_from_dark_limestone_brick_quarter_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_quarter_from_light_limestone_brick_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_quarter_from_light_limestone_brick_quarter_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_quarter_from_limestone_brick_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_quarter_from_limestone_brick_quarter_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_QUARTER.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_quarter_from_pink_limestone_brick_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_quarter_from_pink_limestone_brick_quarter_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_QUARTER.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_quarter_from_tan_limestone_brick_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_QUARTER.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_quarter_from_tan_limestone_brick_quarter_and_moss");

        /* Mossy Limestone Brick Quarter_Verticals */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_quarter_vertical_from_dark_limestone_brick_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_quarter_vertical_from_dark_limestone_brick_quarter_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_quarter_vertical_from_light_limestone_brick_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_quarter_vertical_from_light_limestone_brick_quarter_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_quarter_vertical_from_limestone_brick_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_quarter_vertical_from_limestone_brick_quarter_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_quarter_vertical_from_pink_limestone_brick_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_quarter_vertical_from_pink_limestone_brick_quarter_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_quarter_vertical_from_tan_limestone_brick_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_quarter_vertical_from_tan_limestone_brick_quarter_vertical_and_moss");

        /* Mossy Limestone Brick Slabs */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_SLAB.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_slab_from_dark_limestone_brick_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_SLAB.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_slab_from_dark_limestone_brick_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_slab_from_light_limestone_brick_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_slab_from_light_limestone_brick_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_SLAB.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_slab_from_pink_limestone_brick_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_SLAB.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_slab_from_pink_limestone_brick_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_SLAB.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_slab_from_tan_limestone_brick_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_SLAB.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_slab_from_tan_limestone_brick_slab_and_moss");

        /* Mossy Limestone Brick Stairs */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_STAIRS.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_stairs_from_dark_limestone_brick_stairs_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_STAIRS.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_stairs_from_dark_limestone_brick_stairs_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_STAIRS.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_stairs_from_light_limestone_brick_stairs_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_STAIRS.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_stairs_from_light_limestone_brick_stairs_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_STAIRS.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_stairs_from_pink_limestone_brick_stairs_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_STAIRS.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_stairs_from_pink_limestone_brick_stairs_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_STAIRS.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_stairs_from_tan_limestone_brick_stairs_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_STAIRS.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_stairs_from_tan_limestone_brick_stairs_and_moss");

        /* Mossy Limestone Brick Walls */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_WALL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_WALL.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_wall_from_dark_limestone_brick_wall_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_WALL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_WALL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_wall_from_dark_limestone_brick_wall_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_WALL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_wall_from_light_limestone_brick_wall_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_WALL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_wall_from_light_limestone_brick_wall_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_WALL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_WALL.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_wall_from_pink_limestone_brick_wall_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_WALL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_WALL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_wall_from_pink_limestone_brick_wall_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_WALL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_WALL.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_wall_from_tan_limestone_brick_wall_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_WALL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_WALL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_wall_from_tan_limestone_brick_wall_and_moss");

        /* Mossy Limestone Brick Windows */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_WINDOW.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_window_from_dark_limestone_brick_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_window_from_dark_limestone_brick_window_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_window_from_light_limestone_brick_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_window_from_light_limestone_brick_window_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_window_from_limestone_brick_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_window_from_limestone_brick_window_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_WINDOW.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_window_from_pink_limestone_brick_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_window_from_pink_limestone_brick_window_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_WINDOW.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_window_from_tan_limestone_brick_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_WINDOW.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_window_from_tan_limestone_brick_window_and_moss");

        /* Mossy Limestone Brick Window_Halfs */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_window_half_from_dark_limestone_brick_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_DARK_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_dark_limestone_brick_window_half_from_dark_limestone_brick_window_half_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_light_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_window_half_from_light_limestone_brick_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_light_limestone_brick_window_half_from_light_limestone_brick_window_half_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_window_half_from_limestone_brick_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_limestone_brick_window_half_from_limestone_brick_window_half_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_window_half_from_pink_limestone_brick_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_PINK_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_pink_limestone_brick_window_half_from_pink_limestone_brick_window_half_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_window_half_from_tan_limestone_brick_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_TAN_LIMESTONE_BRICK_WINDOW_HALF.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BRICK_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_brick_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_tan_limestone_brick_window_half_from_tan_limestone_brick_window_half_and_moss");


        /* MOSSY LIMESTONE BRICK BLOCKS */
        /* Mossy Limestone Bricks */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE.get(), 1).requires(ModBlocks.DARK_LIMESTONE.get()).requires(Items.VINE).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_from_dark_limestone_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE.get(), 1).requires(ModBlocks.DARK_LIMESTONE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_from_dark_limestone_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE.get()).requires(Items.VINE).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_from_light_limestone_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_from_light_limestone_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE.get(), 1).requires(ModBlocks.PINK_LIMESTONE.get()).requires(Items.VINE).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_from_pink_limestone_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE.get(), 1).requires(ModBlocks.PINK_LIMESTONE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_from_pink_limestone_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE.get(), 1).requires(ModBlocks.TAN_LIMESTONE.get()).requires(Items.VINE).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_from_tan_limestone_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE.get(), 1).requires(ModBlocks.TAN_LIMESTONE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_from_tan_limestone_and_moss");

        /* Mossy_Cobbled Limestone Brick Arches */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.DARK_LIMESTONE_ARCH.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_arch_from_dark_limestone_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.DARK_LIMESTONE_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_arch_from_dark_limestone_arch_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_ARCH.get()).requires(Items.VINE).unlockedBy("has_light_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_arch_from_light_limestone_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_arch_from_light_limestone_arch_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_ARCH.get()).requires(Items.VINE).unlockedBy("has_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_arch_from_limestone_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_arch_from_limestone_arch_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.PINK_LIMESTONE_ARCH.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_arch_from_pink_limestone_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.PINK_LIMESTONE_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_arch_from_pink_limestone_arch_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.TAN_LIMESTONE_ARCH.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_arch_from_tan_limestone_arch_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_ARCH.get(), 1).requires(ModBlocks.TAN_LIMESTONE_ARCH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_arch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_ARCH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_arch_from_tan_limestone_arch_and_moss");

        /* Mossy_Cobbled Limestone Brick Arrowslits */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.DARK_LIMESTONE_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_arrowslit_from_dark_limestone_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.DARK_LIMESTONE_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_arrowslit_from_dark_limestone_arrowslit_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_light_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_arrowslit_from_light_limestone_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_arrowslit_from_light_limestone_arrowslit_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_arrowslit_from_limestone_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_arrowslit_from_limestone_arrowslit_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.PINK_LIMESTONE_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_arrowslit_from_pink_limestone_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.PINK_LIMESTONE_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_arrowslit_from_pink_limestone_arrowslit_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.TAN_LIMESTONE_ARROWSLIT.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_arrowslit_from_tan_limestone_arrowslit_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_ARROWSLIT.get(), 1).requires(ModBlocks.TAN_LIMESTONE_ARROWSLIT.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_arrowslit",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_ARROWSLIT.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_arrowslit_from_tan_limestone_arrowslit_and_moss");

        /* Mossy_Cobbled Limestone Brick Balustrades */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_balustrade_from_dark_limestone_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.DARK_LIMESTONE_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_balustrade_from_dark_limestone_balustrade_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_light_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_balustrade_from_light_limestone_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_balustrade_from_light_limestone_balustrade_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_balustrade_from_limestone_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_balustrade_from_limestone_balustrade_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_balustrade_from_pink_limestone_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.PINK_LIMESTONE_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_balustrade_from_pink_limestone_balustrade_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BALUSTRADE.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_balustrade_from_tan_limestone_balustrade_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_BALUSTRADE.get(), 1).requires(ModBlocks.TAN_LIMESTONE_BALUSTRADE.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_balustrade",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BALUSTRADE.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_balustrade_from_tan_limestone_balustrade_and_moss");

        /* Mossy_Cobbled Limestone Brick Capitals */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_capital_from_dark_limestone_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_capital_from_dark_limestone_capital_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_light_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_capital_from_light_limestone_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_capital_from_light_limestone_capital_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_capital_from_limestone_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_capital_from_limestone_capital_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_capital_from_pink_limestone_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_capital_from_pink_limestone_capital_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_CAPITAL.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_capital_from_tan_limestone_capital_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_CAPITAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_CAPITAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_capital",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_CAPITAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_capital_from_tan_limestone_capital_and_moss");

        /* Mossy_Cobbled Limestone Brick Corners */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.DARK_LIMESTONE_CORNER.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_corner_from_dark_limestone_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.DARK_LIMESTONE_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_corner_from_dark_limestone_corner_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER.get()).requires(Items.VINE).unlockedBy("has_light_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_corner_from_light_limestone_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_corner_from_light_limestone_corner_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER.get()).requires(Items.VINE).unlockedBy("has_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_corner_from_limestone_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_corner_from_limestone_corner_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.PINK_LIMESTONE_CORNER.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_corner_from_pink_limestone_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.PINK_LIMESTONE_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_corner_from_pink_limestone_corner_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.TAN_LIMESTONE_CORNER.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_corner_from_tan_limestone_corner_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_CORNER.get(), 1).requires(ModBlocks.TAN_LIMESTONE_CORNER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_corner",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_CORNER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_corner_from_tan_limestone_corner_and_moss");

        /* Mossy_Cobbled Limestone Brick Corner_Slabs */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.DARK_LIMESTONE_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_corner_slab_from_dark_limestone_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.DARK_LIMESTONE_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_corner_slab_from_dark_limestone_corner_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_light_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_corner_slab_from_light_limestone_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_corner_slab_from_light_limestone_corner_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_corner_slab_from_limestone_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_corner_slab_from_limestone_corner_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.PINK_LIMESTONE_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_corner_slab_from_pink_limestone_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.PINK_LIMESTONE_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_corner_slab_from_pink_limestone_corner_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.TAN_LIMESTONE_CORNER_SLAB.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_corner_slab_from_tan_limestone_corner_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_CORNER_SLAB.get(), 1).requires(ModBlocks.TAN_LIMESTONE_CORNER_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_corner_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_CORNER_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_corner_slab_from_tan_limestone_corner_slab_and_moss");

        /* Mossy_Cobbled Limestone Brick Corner_Slab_Verticals */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_corner_slab_vertical_from_dark_limestone_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_corner_slab_vertical_from_dark_limestone_corner_slab_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_light_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_corner_slab_vertical_from_light_limestone_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_corner_slab_vertical_from_light_limestone_corner_slab_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_corner_slab_vertical_from_limestone_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_corner_slab_vertical_from_limestone_corner_slab_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_corner_slab_vertical_from_pink_limestone_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_corner_slab_vertical_from_pink_limestone_corner_slab_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_corner_slab_vertical_from_tan_limestone_corner_slab_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_corner_slab_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_CORNER_SLAB_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_corner_slab_vertical_from_tan_limestone_corner_slab_vertical_and_moss");

        /* Mossy_Cobbled Limestone Brick Eighths */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.DARK_LIMESTONE_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_eighth_from_dark_limestone_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.DARK_LIMESTONE_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_eighth_from_dark_limestone_eighth_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_light_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_eighth_from_light_limestone_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_eighth_from_light_limestone_eighth_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_eighth_from_limestone_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_eighth_from_limestone_eighth_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.PINK_LIMESTONE_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_eighth_from_pink_limestone_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.PINK_LIMESTONE_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_eighth_from_pink_limestone_eighth_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.TAN_LIMESTONE_EIGHTH.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_eighth_from_tan_limestone_eighth_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_EIGHTH.get(), 1).requires(ModBlocks.TAN_LIMESTONE_EIGHTH.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_eighth",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_EIGHTH.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_eighth_from_tan_limestone_eighth_and_moss");

        /* Mossy_Cobbled Limestone Brick Quarters */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.DARK_LIMESTONE_QUARTER.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_quarter_from_dark_limestone_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.DARK_LIMESTONE_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_quarter_from_dark_limestone_quarter_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_QUARTER.get()).requires(Items.VINE).unlockedBy("has_light_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_quarter_from_light_limestone_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_quarter_from_light_limestone_quarter_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_QUARTER.get()).requires(Items.VINE).unlockedBy("has_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_quarter_from_limestone_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_quarter_from_limestone_quarter_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.PINK_LIMESTONE_QUARTER.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_quarter_from_pink_limestone_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.PINK_LIMESTONE_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_quarter_from_pink_limestone_quarter_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.TAN_LIMESTONE_QUARTER.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_quarter_from_tan_limestone_quarter_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_QUARTER.get(), 1).requires(ModBlocks.TAN_LIMESTONE_QUARTER.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_quarter",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_QUARTER.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_quarter_from_tan_limestone_quarter_and_moss");

        /* Mossy_Cobbled Limestone Brick Quarter_Verticals */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_quarter_vertical_from_dark_limestone_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_quarter_vertical_from_dark_limestone_quarter_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_light_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_quarter_vertical_from_light_limestone_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_quarter_vertical_from_light_limestone_quarter_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_quarter_vertical_from_limestone_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_quarter_vertical_from_limestone_quarter_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_quarter_vertical_from_pink_limestone_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_quarter_vertical_from_pink_limestone_quarter_vertical_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_quarter_vertical_from_tan_limestone_quarter_vertical_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_QUARTER_VERTICAL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_QUARTER_VERTICAL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_quarter_vertical",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_QUARTER_VERTICAL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_quarter_vertical_from_tan_limestone_quarter_vertical_and_moss");

        /* Mossy_Cobbled Limestone Brick Slabs */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_SLAB.get(), 1).requires(ModBlocks.DARK_LIMESTONE_SLAB.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_slab_from_dark_limestone_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_SLAB.get(), 1).requires(ModBlocks.DARK_LIMESTONE_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_slab_from_dark_limestone_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_SLAB.get()).requires(Items.VINE).unlockedBy("has_light_limestone_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_slab_from_light_limestone_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_SLAB.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_slab_from_light_limestone_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_SLAB.get(), 1).requires(ModBlocks.PINK_LIMESTONE_SLAB.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_slab_from_pink_limestone_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_SLAB.get(), 1).requires(ModBlocks.PINK_LIMESTONE_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_slab_from_pink_limestone_slab_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_SLAB.get(), 1).requires(ModBlocks.TAN_LIMESTONE_SLAB.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_slab_from_tan_limestone_slab_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_SLAB.get(), 1).requires(ModBlocks.TAN_LIMESTONE_SLAB.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_slab",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_SLAB.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_slab_from_tan_limestone_slab_and_moss");

        /* Mossy_Cobbled Limestone Brick Stairs */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_STAIRS.get(), 1).requires(ModBlocks.DARK_LIMESTONE_STAIRS.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_stairs_from_dark_limestone_stairs_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_STAIRS.get(), 1).requires(ModBlocks.DARK_LIMESTONE_STAIRS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_stairs_from_dark_limestone_stairs_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_STAIRS.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_STAIRS.get()).requires(Items.VINE).unlockedBy("has_light_limestone_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_stairs_from_light_limestone_stairs_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_STAIRS.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_STAIRS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_stairs_from_light_limestone_stairs_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_STAIRS.get(), 1).requires(ModBlocks.PINK_LIMESTONE_STAIRS.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_stairs_from_pink_limestone_stairs_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_STAIRS.get(), 1).requires(ModBlocks.PINK_LIMESTONE_STAIRS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_stairs_from_pink_limestone_stairs_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_STAIRS.get(), 1).requires(ModBlocks.TAN_LIMESTONE_STAIRS.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_stairs_from_tan_limestone_stairs_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_STAIRS.get(), 1).requires(ModBlocks.TAN_LIMESTONE_STAIRS.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_stairs",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_STAIRS.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_stairs_from_tan_limestone_stairs_and_moss");

        /* Mossy_Cobbled Limestone Brick Walls */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_WALL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_WALL.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_wall_from_dark_limestone_wall_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_WALL.get(), 1).requires(ModBlocks.DARK_LIMESTONE_WALL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_wall_from_dark_limestone_wall_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_WALL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WALL.get()).requires(Items.VINE).unlockedBy("has_light_limestone_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_wall_from_light_limestone_wall_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_WALL.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WALL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_wall_from_light_limestone_wall_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_WALL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_WALL.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_wall_from_pink_limestone_wall_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_WALL.get(), 1).requires(ModBlocks.PINK_LIMESTONE_WALL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_wall_from_pink_limestone_wall_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_WALL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_WALL.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_wall_from_tan_limestone_wall_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_WALL.get(), 1).requires(ModBlocks.TAN_LIMESTONE_WALL.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_wall",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_WALL.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_wall_from_tan_limestone_wall_and_moss");

        /* Mossy_Cobbled Limestone Brick Windows */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.DARK_LIMESTONE_WINDOW.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_window_from_dark_limestone_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.DARK_LIMESTONE_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_window_from_dark_limestone_window_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WINDOW.get()).requires(Items.VINE).unlockedBy("has_light_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_window_from_light_limestone_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_window_from_light_limestone_window_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WINDOW.get()).requires(Items.VINE).unlockedBy("has_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_window_from_limestone_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_window_from_limestone_window_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.PINK_LIMESTONE_WINDOW.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_window_from_pink_limestone_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.PINK_LIMESTONE_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_window_from_pink_limestone_window_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.TAN_LIMESTONE_WINDOW.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_window_from_tan_limestone_window_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_WINDOW.get(), 1).requires(ModBlocks.TAN_LIMESTONE_WINDOW.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_window",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_WINDOW.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_window_from_tan_limestone_window_and_moss");

        /* Mossy_Cobbled Limestone Brick Window_Halfs */
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.DARK_LIMESTONE_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_dark_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_window_half_from_dark_limestone_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.DARK_LIMESTONE_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_dark_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_dark_limestone_window_half_from_dark_limestone_window_half_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_light_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_window_half_from_light_limestone_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_light_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_light_limestone_window_half_from_light_limestone_window_half_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_window_half_from_limestone_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_limestone_window_half_from_limestone_window_half_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.PINK_LIMESTONE_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_pink_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_window_half_from_pink_limestone_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.PINK_LIMESTONE_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_pink_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_pink_limestone_window_half_from_pink_limestone_window_half_and_moss");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.TAN_LIMESTONE_WINDOW_HALF.get()).requires(Items.VINE).unlockedBy("has_tan_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_window_half_from_tan_limestone_window_half_and_vines");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE_WINDOW_HALF.get(), 1).requires(ModBlocks.TAN_LIMESTONE_WINDOW_HALF.get()).requires(Items.MOSS_BLOCK).unlockedBy("has_tan_limestone_window_half",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_WINDOW_HALF.get()).build())).save(pFinishedRecipeConsumer, "mossy_cobbled_tan_limestone_window_half_from_tan_limestone_window_half_and_moss");

    }

}
