package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class StoneRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public StoneRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }


    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        andesiteRecipes(pFinishedRecipeConsumer);
        polishedAndesiteRecipes(pFinishedRecipeConsumer);
        basaltRecipes(pFinishedRecipeConsumer);
        polishedBasaltRecipes(pFinishedRecipeConsumer);
        smoothBasaltRecipes(pFinishedRecipeConsumer);
        blackstoneRecipes(pFinishedRecipeConsumer);
        gildedBlackstoneRecipes(pFinishedRecipeConsumer);
        polishedBlackstoneRecipes(pFinishedRecipeConsumer);
        polishedBlackstoneBrickRecipes(pFinishedRecipeConsumer);
        deepslateRecipes(pFinishedRecipeConsumer);
        deepslateBrickRecipes(pFinishedRecipeConsumer);
        deepslateTileRecipes(pFinishedRecipeConsumer);
        cobbledDeepslateRecipes(pFinishedRecipeConsumer);
        polishedDeepslateRecipes(pFinishedRecipeConsumer);
        dioriteRecipes(pFinishedRecipeConsumer);
        polishedDioriteRecipes(pFinishedRecipeConsumer);
        graniteRecipes(pFinishedRecipeConsumer);
        polishedGraniteRecipes(pFinishedRecipeConsumer);
        limestoneRecipes(pFinishedRecipeConsumer);
        limestoneBrickRecipes(pFinishedRecipeConsumer);
        crackedLimestoneBrickRecipes(pFinishedRecipeConsumer);
        chiseledLimestoneRecipes(pFinishedRecipeConsumer);
        cobbledLimestoneRecipes(pFinishedRecipeConsumer);
        smoothLimestoneRecipes(pFinishedRecipeConsumer);
        marbleRecipes(pFinishedRecipeConsumer);
        polishedMarbleRecipes(pFinishedRecipeConsumer);
        quartzRecipes(pFinishedRecipeConsumer);
        smoothQuartzRecipes(pFinishedRecipeConsumer);
        sandstoneRecipes(pFinishedRecipeConsumer);
        chiseledSandstoneRecipes(pFinishedRecipeConsumer);
        cutSandstoneRecipes(pFinishedRecipeConsumer);
        smoothSandstoneRecipes(pFinishedRecipeConsumer);
    }

    private void andesiteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_ARCH.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arch_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_ARCH_LARGE.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arch_large_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_ARCH_HALF.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arch_half_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arch_large_half_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_ARROWSLIT.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arrowslit_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_BALUSTRADE.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_balustrade_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_CAPITAL.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_capital_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_CORNER.get(), 5).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_corner_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_CORNER_SLAB.get(), 4).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_corner_slab_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_corner_slab_vertical_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_EIGHTH.get(), 8).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_eighth_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_QUARTER.get(), 5).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_quarter_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_quarter_vertical_from_andesite_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.ANDESITE_SLAB.get(), 24).define('G', Blocks.ANDESITE).pattern("GGG").unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_SLAB.get(), 8).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_SLAB_VERTICAL.get()), ModBlocks.ANDESITE_SLAB.get(), 1).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_from_andesite_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.ANDESITE_SLAB_VERTICAL.get(), 24).define('G', Blocks.ANDESITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_vertical_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE_SLAB.get()), ModBlocks.ANDESITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_vertical_from_andesite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_WINDOW.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_window_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE_WINDOW_HALF.get(), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_window_half_from_andesite_stonecutting");
    }
    
    private void polishedAndesiteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_ARCH.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arch_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arch_large_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_ARCH_HALF.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arch_half_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arch_large_half_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_ARROWSLIT.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arrowslit_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_BALUSTRADE.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_balustrade_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_CAPITAL.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_capital_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_CORNER.get(), 5).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_corner_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_corner_slab_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_corner_slab_vertical_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_EIGHTH.get(), 8).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_eighth_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_QUARTER.get(), 5).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_quarter_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_quarter_vertical_from_polished_andesite_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_ANDESITE_SLAB.get(), 24).define('G', Blocks.POLISHED_ANDESITE).pattern("GGG").unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_SLAB.get(), 8).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ANDESITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_ANDESITE_SLAB.get(), 1).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_from_polished_andesite_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_ANDESITE_SLAB_VERTICAL.get(), 24).define('G', Blocks.POLISHED_ANDESITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_vertical_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ANDESITE_SLAB.get()), ModBlocks.POLISHED_ANDESITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_vertical_from_polished_andesite_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_ANDESITE_WALL.get(), 6).define('G', Blocks.POLISHED_ANDESITE).pattern("GGG").pattern("GGG").unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_WALL.get(), 6).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_wall_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_WINDOW.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_window_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_window_half_from_polished_andesite_stonecutting");
    }

    private void basaltRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_ARCH.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arch_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_ARCH_LARGE.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arch_large_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_ARCH_HALF.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arch_half_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arch_large_half_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_ARROWSLIT.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arrowslit_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_BALUSTRADE.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_balustrade_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_CAPITAL.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_capital_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_CORNER.get(), 5).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_corner_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_CORNER_SLAB.get(), 4).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_corner_slab_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_corner_slab_vertical_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_EIGHTH.get(), 8).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_eighth_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_QUARTER.get(), 5).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_quarter_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_QUARTER_VERTICAL.get(), 5).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_quarter_vertical_from_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BASALT_SLAB.get(), 24).define('G', Blocks.BASALT).pattern("GGG").unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_SLAB.get(), 8).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BASALT_SLAB_VERTICAL.get()), ModBlocks.BASALT_SLAB.get(), 1).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_from_basalt_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BASALT_SLAB_VERTICAL.get(), 24).define('G', Blocks.BASALT).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_SLAB_VERTICAL.get(), 8).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_vertical_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BASALT_SLAB.get()), ModBlocks.BASALT_SLAB_VERTICAL.get(), 1).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_vertical_from_basalt_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BASALT_STAIRS.get(), 4).define('G', Blocks.BASALT).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_STAIRS.get(), 1).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_stairs_from_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BASALT_WALL.get(), 6).define('G', Blocks.BASALT).pattern("GGG").pattern("GGG").unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_WALL.get(), 6).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_wall_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_WINDOW.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_window_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT_WINDOW_HALF.get(), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_window_half_from_basalt_stonecutting");
    }

    private void polishedBasaltRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_ARCH.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arch_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_ARCH_LARGE.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arch_large_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_ARCH_HALF.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arch_half_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arch_large_half_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_ARROWSLIT.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arrowslit_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_BALUSTRADE.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_balustrade_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_CAPITAL.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_capital_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_CORNER.get(), 5).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_corner_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_CORNER_SLAB.get(), 4).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_corner_slab_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_corner_slab_vertical_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_EIGHTH.get(), 8).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_eighth_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_QUARTER.get(), 5).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_quarter_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_quarter_vertical_from_polished_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BASALT_SLAB.get(), 24).define('G', Blocks.POLISHED_BASALT).pattern("GGG").unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_SLAB.get(), 8).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BASALT_SLAB_VERTICAL.get()), ModBlocks.POLISHED_BASALT_SLAB.get(), 1).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_from_polished_basalt_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BASALT_SLAB_VERTICAL.get(), 24).define('G', Blocks.POLISHED_BASALT).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_vertical_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BASALT_SLAB.get()), ModBlocks.POLISHED_BASALT_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_vertical_from_polished_basalt_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BASALT_STAIRS.get(), 4).define('G', Blocks.POLISHED_BASALT).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_STAIRS.get(), 1).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_stairs_from_polished_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BASALT_WALL.get(), 6).define('G', Blocks.POLISHED_BASALT).pattern("GGG").pattern("GGG").unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_WALL.get(), 6).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_wall_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_WINDOW.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_window_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT_WINDOW_HALF.get(), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_window_half_from_polished_basalt_stonecutting");
    }
    
    private void smoothBasaltRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_ARCH.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arch_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_ARCH_LARGE.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arch_large_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_ARCH_HALF.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arch_half_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arch_large_half_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_ARROWSLIT.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arrowslit_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_BALUSTRADE.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_balustrade_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_CAPITAL.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_capital_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_CORNER.get(), 5).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_corner_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_CORNER_SLAB.get(), 4).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_corner_slab_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_corner_slab_vertical_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_EIGHTH.get(), 8).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_eighth_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_QUARTER.get(), 5).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_quarter_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_QUARTER_VERTICAL.get(), 5).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_quarter_vertical_from_smooth_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BASALT_SLAB.get(), 24).define('G', Blocks.SMOOTH_BASALT).pattern("GGG").unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_SLAB.get(), 8).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BASALT_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_BASALT_SLAB.get(), 1).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_from_smooth_basalt_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BASALT_SLAB_VERTICAL.get(), 24).define('G', Blocks.SMOOTH_BASALT).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_SLAB_VERTICAL.get(), 8).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_vertical_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BASALT_SLAB.get()), ModBlocks.SMOOTH_BASALT_SLAB_VERTICAL.get(), 1).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_vertical_from_smooth_basalt_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BASALT_STAIRS.get(), 4).define('G', Blocks.SMOOTH_BASALT).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_STAIRS.get(), 1).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_stairs_from_smooth_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BASALT_WALL.get(), 6).define('G', Blocks.SMOOTH_BASALT).pattern("GGG").pattern("GGG").unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_WALL.get(), 6).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_wall_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_WINDOW.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_window_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT_WINDOW_HALF.get(), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_window_half_from_smooth_basalt_stonecutting");
    }

    private void blackstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_ARCH.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arch_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arch_large_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_ARCH_HALF.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arch_half_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arch_large_half_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_ARROWSLIT.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arrowslit_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_BALUSTRADE.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_balustrade_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_CAPITAL.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_capital_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_CORNER.get(), 5).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_corner_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_corner_slab_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_corner_slab_vertical_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_EIGHTH.get(), 8).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_eighth_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_QUARTER.get(), 5).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_quarter_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_quarter_vertical_from_blackstone_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BLACKSTONE_SLAB.get(), 24).define('G', Blocks.BLACKSTONE).pattern("GGG").unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_SLAB.get(), 8).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE_SLAB), ModBlocks.BLACKSTONE_SLAB.get(), 4).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "mod_blackstone_slab_from_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACKSTONE_SLAB_VERTICAL.get()), ModBlocks.BLACKSTONE_SLAB.get(), 1).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_from_blackstone_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BLACKSTONE_SLAB_VERTICAL.get(), 24).define('G', Blocks.BLACKSTONE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_vertical_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE_SLAB), ModBlocks.BLACKSTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_vertical_from_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACKSTONE_SLAB.get()), ModBlocks.BLACKSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_vertical_from_mod_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_WINDOW.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_window_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_window_half_from_blackstone_stonecutting");
    }
    
    private void gildedBlackstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_ARCH.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arch_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arch_large_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_ARCH_HALF.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arch_half_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arch_large_half_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_ARROWSLIT.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arrowslit_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_BALUSTRADE.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_balustrade_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_CAPITAL.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_capital_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_CORNER.get(), 5).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_corner_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_corner_slab_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_corner_slab_vertical_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_EIGHTH.get(), 8).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_eighth_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_QUARTER.get(), 5).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_quarter_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_quarter_vertical_from_gilded_blackstone_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.GILDED_BLACKSTONE_SLAB.get(), 24).define('G', Blocks.GILDED_BLACKSTONE).pattern("GGG").unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_SLAB.get(), 8).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GILDED_BLACKSTONE_SLAB_VERTICAL.get()), ModBlocks.GILDED_BLACKSTONE_SLAB.get(), 1).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_from_gilded_blackstone_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.GILDED_BLACKSTONE_SLAB_VERTICAL.get(), 24).define('G', Blocks.GILDED_BLACKSTONE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_vertical_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GILDED_BLACKSTONE_SLAB.get()), ModBlocks.GILDED_BLACKSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_vertical_from_gilded_blackstone_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.GILDED_BLACKSTONE_STAIRS.get(), 4).define('G', Blocks.GILDED_BLACKSTONE).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_STAIRS.get(), 1).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_stairs_from_gilded_blackstone_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.GILDED_BLACKSTONE_WALL.get(), 6).define('G', Blocks.GILDED_BLACKSTONE).pattern("GGG").pattern("GGG").unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_WALL.get(), 6).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_wall_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_WINDOW.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_window_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_window_half_from_gilded_blackstone_stonecutting");

    }
    
    private void polishedBlackstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_ARCH.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arch_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arch_large_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_ARCH_HALF.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arch_half_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arch_large_half_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_ARROWSLIT.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arrowslit_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_BALUSTRADE.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_balustrade_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_CAPITAL.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_capital_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_CORNER.get(), 5).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_corner_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_corner_slab_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_corner_slab_vertical_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_EIGHTH.get(), 8).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_eighth_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_QUARTER.get(), 5).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_quarter_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_quarter_vertical_from_polished_blackstone_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACKSTONE_SLAB.get(), 24).define('G', Blocks.POLISHED_BLACKSTONE).pattern("GGG").unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_SLAB.get(), 8).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_SLAB), ModBlocks.POLISHED_BLACKSTONE_SLAB.get(), 4).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "mod_polished_blackstone_slab_from_polished_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACKSTONE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_BLACKSTONE_SLAB.get(), 1).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_from_polished_blackstone_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACKSTONE_SLAB_VERTICAL.get(), 24).define('G', Blocks.POLISHED_BLACKSTONE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_vertical_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_SLAB), ModBlocks.POLISHED_BLACKSTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_vertical_from_polished_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACKSTONE_SLAB.get()), ModBlocks.POLISHED_BLACKSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_vertical_from_mod_polished_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_WINDOW.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_window_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_window_half_from_polished_blackstone_stonecutting");
    }
    
    private void polishedBlackstoneBrickRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_ARCH.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arch_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_ARCH_LARGE.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arch_large_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_ARCH_HALF.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arch_half_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arch_large_half_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_ARROWSLIT.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arrowslit_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_BALUSTRADE.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_balustrade_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_CAPITAL.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_capital_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_CORNER.get(), 5).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_corner_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_CORNER_SLAB.get(), 4).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_corner_slab_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_corner_slab_vertical_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_EIGHTH.get(), 8).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_eighth_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_QUARTER.get(), 5).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_quarter_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_quarter_vertical_from_polished_blackstone_brick_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB.get(), 24).define('G', Blocks.POLISHED_BLACKSTONE_BRICKS).pattern("GGG").unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB.get(), 8).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB.get(), 4).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_polished_blackstone_brick_slab_from_polished_blackstone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB.get(), 1).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_from_polished_blackstone_brick_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB_VERTICAL.get(), 24).define('G', Blocks.POLISHED_BLACKSTONE_BRICKS).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_vertical_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_vertical_from_polished_blackstone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB.get()), ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_vertical_from_mod_polished_blackstone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_WINDOW.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_window_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK_WINDOW_HALF.get(), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_window_half_from_polished_blackstone_brick_stonecutting");
    }
    
    private void deepslateRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_ARCH.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arch_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_ARCH_LARGE.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arch_large_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_ARCH_HALF.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arch_half_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arch_large_half_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_ARROWSLIT.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arrowslit_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_BALUSTRADE.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_balustrade_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_CAPITAL.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_capital_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_CORNER.get(), 5).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_corner_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_CORNER_SLAB.get(), 4).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_corner_slab_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_corner_slab_vertical_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_EIGHTH.get(), 8).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_eighth_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_QUARTER.get(), 5).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_quarter_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_quarter_vertical_from_deepslate_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_SLAB.get(), 24).define('G', Blocks.DEEPSLATE).pattern("GGG").unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_SLAB.get(), 8).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_SLAB_VERTICAL.get()), ModBlocks.DEEPSLATE_SLAB.get(), 1).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_from_deepslate_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_SLAB_VERTICAL.get(), 24).define('G', Blocks.DEEPSLATE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_SLAB_VERTICAL.get(), 8).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_vertical_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_SLAB.get()), ModBlocks.DEEPSLATE_SLAB_VERTICAL.get(), 1).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_vertical_from_deepslate_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_STAIRS.get(), 4).define('G', Blocks.DEEPSLATE).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_STAIRS.get(), 1).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_stairs_from_deepslate_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_WALL.get(), 6).define('G', Blocks.DEEPSLATE).pattern("GGG").pattern("GGG").unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_WINDOW.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_window_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE_WINDOW_HALF.get(), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_window_half_from_deepslate_stonecutting");
    }

    private void deepslateBrickRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_ARCH.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arch_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_ARCH_LARGE.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arch_large_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_ARCH_HALF.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arch_half_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arch_large_half_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_ARROWSLIT.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arrowslit_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_BALUSTRADE.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_balustrade_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_CAPITAL.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_capital_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_CORNER.get(), 5).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_corner_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_CORNER_SLAB.get(), 4).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_corner_slab_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_corner_slab_vertical_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_EIGHTH.get(), 8).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_eighth_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_QUARTER.get(), 5).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_quarter_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_QUARTER_VERTICAL.get(), 5).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_quarter_vertical_from_deepslate_brick_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_BRICK_SLAB.get(), 24).define('G', Blocks.DEEPSLATE_BRICKS).pattern("GGG").unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_SLAB.get(), 8).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_deepslate_brick_slab_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICK_SLAB), ModBlocks.DEEPSLATE_BRICK_SLAB.get(), 4).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_deepslate_brick_slab_from_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get()), ModBlocks.DEEPSLATE_BRICK_SLAB.get(), 1).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_deepslate_brick_slab_from_deepslate_brick_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get(), 24).define('G', Blocks.DEEPSLATE_BRICKS).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICK_SLAB), ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get(), 4).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_BRICK_SLAB.get()), ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_mod_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_WINDOW.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_window_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_WINDOW_HALF.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_window_half_from_deepslate_brick_stonecutting");
    }

    private void deepslateTileRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_ARCH.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arch_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_ARCH_LARGE.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arch_large_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_ARCH_HALF.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arch_half_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arch_large_half_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_ARROWSLIT.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arrowslit_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_BALUSTRADE.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_balustrade_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_CAPITAL.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_capital_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_CORNER.get(), 5).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_corner_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_CORNER_SLAB.get(), 4).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_corner_slab_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_corner_slab_vertical_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_EIGHTH.get(), 8).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_eighth_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_QUARTER.get(), 5).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_quarter_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_quarter_vertical_from_deepslate_tile_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_TILE_SLAB.get(), 24).define('G', Blocks.DEEPSLATE_TILES).pattern("GGG").unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_SLAB.get(), 8).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "mod_deepslate_tile_slab_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILE_SLAB), ModBlocks.DEEPSLATE_TILE_SLAB.get(), 4).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "mod_deepslate_tile_slab_from_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get()), ModBlocks.DEEPSLATE_TILE_SLAB.get(), 1).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "mod_deepslate_tile_slab_from_deepslate_tile_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get(), 24).define('G', Blocks.DEEPSLATE_TILES).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get(), 8).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILE_SLAB), ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get(), 4).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_TILE_SLAB.get()), ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get(), 1).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_mod_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_WINDOW.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_window_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_WINDOW_HALF.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_window_half_from_deepslate_tile_stonecutting");
    }

    private void cobbledDeepslateRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_ARCH.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arch_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_ARCH_LARGE.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arch_large_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_ARCH_HALF.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arch_half_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arch_large_half_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_ARROWSLIT.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arrowslit_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_BALUSTRADE.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_balustrade_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_CAPITAL.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_capital_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_CORNER.get(), 5).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_corner_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_CORNER_SLAB.get(), 4).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_corner_slab_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_corner_slab_vertical_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_EIGHTH.get(), 8).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_eighth_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_QUARTER.get(), 5).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_quarter_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_quarter_vertical_from_cobbled_deepslate_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), 24).define('G', Blocks.COBBLED_DEEPSLATE).pattern("GGG").unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), 8).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_deepslate_slab_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE_SLAB), ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), 4).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_deepslate_slab_from_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), 1).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_deepslate_slab_from_cobbled_deepslate_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get(), 24).define('G', Blocks.COBBLED_DEEPSLATE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get(), 8).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE_SLAB), ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get(), 4).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DEEPSLATE_SLAB.get()), ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get(), 1).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_mod_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_WINDOW.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_window_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_WINDOW_HALF.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_window_half_from_cobbled_deepslate_stonecutting");
    }

    private void polishedDeepslateRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_ARCH.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arch_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arch_large_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_ARCH_HALF.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arch_half_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arch_large_half_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_ARROWSLIT.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arrowslit_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_BALUSTRADE.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_balustrade_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_CAPITAL.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_capital_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_CORNER.get(), 5).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_corner_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_corner_slab_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_corner_slab_vertical_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_EIGHTH.get(), 8).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_eighth_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_QUARTER.get(), 5).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_quarter_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_quarter_vertical_from_polished_deepslate_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), 24).define('G', Blocks.POLISHED_DEEPSLATE).pattern("GGG").unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), 8).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_polished_deepslate_slab_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE_SLAB), ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), 4).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_polished_deepslate_slab_from_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), 1).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_polished_deepslate_slab_from_polished_deepslate_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get(), 24).define('G', Blocks.POLISHED_DEEPSLATE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE_SLAB), ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DEEPSLATE_SLAB.get()), ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_mod_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_WINDOW.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_window_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_window_half_from_polished_deepslate_stonecutting");
    }
    
    private void dioriteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_ARCH.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arch_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_ARCH_LARGE.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arch_large_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_ARCH_HALF.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arch_half_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arch_large_half_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_ARROWSLIT.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arrowslit_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_BALUSTRADE.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_balustrade_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_CAPITAL.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_capital_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_CORNER.get(), 5).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_corner_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_CORNER_SLAB.get(), 4).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_corner_slab_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_corner_slab_vertical_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_EIGHTH.get(), 8).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_eighth_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_QUARTER.get(), 5).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_quarter_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_quarter_vertical_from_diorite_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DIORITE_SLAB.get(), 24).define('G', Blocks.DIORITE).pattern("GGG").unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_SLAB.get(), 8).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_SLAB_VERTICAL.get()), ModBlocks.DIORITE_SLAB.get(), 1).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_from_diorite_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DIORITE_SLAB_VERTICAL.get(), 24).define('G', Blocks.DIORITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_vertical_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE_SLAB.get()), ModBlocks.DIORITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_vertical_from_diorite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_WINDOW.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_window_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE_WINDOW_HALF.get(), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_window_half_from_diorite_stonecutting");
    }

    private void polishedDioriteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_ARCH.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arch_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_ARCH_LARGE.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arch_large_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_ARCH_HALF.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arch_half_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arch_large_half_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_ARROWSLIT.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arrowslit_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_BALUSTRADE.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_balustrade_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_CAPITAL.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_capital_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_CORNER.get(), 5).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_corner_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_CORNER_SLAB.get(), 4).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_corner_slab_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_corner_slab_vertical_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_EIGHTH.get(), 8).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_eighth_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_QUARTER.get(), 5).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_quarter_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_QUARTER_VERTICAL.get(), 5).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_quarter_vertical_from_polished_diorite_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DIORITE_SLAB.get(), 24).define('G', Blocks.POLISHED_DIORITE).pattern("GGG").unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_SLAB.get(), 8).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DIORITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_DIORITE_SLAB.get(), 1).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_from_polished_diorite_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DIORITE_SLAB_VERTICAL.get(), 24).define('G', Blocks.POLISHED_DIORITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_vertical_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DIORITE_SLAB.get()), ModBlocks.POLISHED_DIORITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_vertical_from_polished_diorite_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DIORITE_WALL.get(), 6).define('G', Blocks.POLISHED_DIORITE).pattern("GGG").pattern("GGG").unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_WALL.get(), 6).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_wall_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_WINDOW.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_window_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_window_half_from_polished_diorite_stonecutting");
    }

    private void graniteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
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

        /* Granite Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE_SLAB.get(), 24).define('G', ModBlocks.BLACK_GRANITE.get()).pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE_SLAB.get(), 24).define('G', ModBlocks.BROWN_GRANITE.get()).pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE_SLAB.get(), 24).define('G', ModBlocks.GRAY_GRANITE.get()).pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE_SLAB.get(), 24).define('G', ModBlocks.PINK_GRANITE.get()).pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_GRANITE_SLAB.get(), 24).define('G', Blocks.GRANITE).pattern("GGG").unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE_SLAB.get(), 24).define('G', ModBlocks.WHITE_GRANITE.get()).pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_SLAB.get(), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_SLAB.get(), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_SLAB.get(), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_SLAB.get(), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_SLAB.get(), 8).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_SLAB.get(), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_white_granite_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE_SLAB), ModBlocks.RED_GRANITE_SLAB.get(), 4).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "mod_red_granite_slab_from_granite_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get()), ModBlocks.BLACK_GRANITE_SLAB.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_black_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE_SLAB_VERTICAL.get()), ModBlocks.BROWN_GRANITE_SLAB.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_brown_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE_SLAB_VERTICAL.get()), ModBlocks.GRAY_GRANITE_SLAB.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_gray_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE_SLAB_VERTICAL.get()), ModBlocks.PINK_GRANITE_SLAB.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_pink_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_GRANITE_SLAB_VERTICAL.get()), ModBlocks.RED_GRANITE_SLAB.get(), 1).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_from_red_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE_SLAB_VERTICAL.get()), ModBlocks.WHITE_GRANITE_SLAB.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_white_granite_slab_vertical_stonecutting");

        /* Granite Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.BLACK_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.BROWN_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.GRAY_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.PINK_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.WHITE_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_vertical_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE_SLAB.get()), ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_black_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE_SLAB.get()), ModBlocks.BROWN_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_brown_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE_SLAB.get()), ModBlocks.GRAY_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_gray_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE_SLAB.get()), ModBlocks.PINK_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_pink_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE_SLAB), ModBlocks.RED_GRANITE_SLAB_VERTICAL.get(), 4).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_vertical_from_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_GRANITE_SLAB.get()), ModBlocks.RED_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_vertical_from_red_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE_SLAB.get()), ModBlocks.WHITE_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_white_granite_slab_stonecutting");
        
        /* Granite Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.BLACK_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.BROWN_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.GRAY_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.PINK_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.WHITE_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_STAIRS.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_stairs_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_STAIRS.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_stairs_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_STAIRS.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_stairs_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_STAIRS.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_stairs_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_STAIRS.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_stairs_from_white_granite_stonecutting");
        
        /* Granite Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE_WALL.get(), 6).define('G', ModBlocks.BLACK_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE_WALL.get(), 6).define('G', ModBlocks.BROWN_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE_WALL.get(), 6).define('G', ModBlocks.GRAY_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE_WALL.get(), 6).define('G', ModBlocks.PINK_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE_WALL.get(), 6).define('G', ModBlocks.WHITE_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_WALL.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_wall_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_WALL.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_wall_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_WALL.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_wall_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_WALL.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_wall_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_WALL.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_wall_from_white_granite_stonecutting");

        /* Granite Windows */
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
    }

    private void polishedGraniteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* POLISHED GRANITE BLOCKS */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE.get(), 4).define('G', ModBlocks.BLACK_GRANITE.get()).pattern("GG").pattern("GG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE.get(), 4).define('G', ModBlocks.BROWN_GRANITE.get()).pattern("GG").pattern("GG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE.get(), 4).define('G', ModBlocks.GRAY_GRANITE.get()).pattern("GG").pattern("GG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE.get(), 4).define('G', ModBlocks.PINK_GRANITE.get()).pattern("GG").pattern("GG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE.get(), 4).define('G', ModBlocks.WHITE_GRANITE.get()).pattern("GG").pattern("GG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_from_white_granite_stonecutting");
        
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

        /* Polished Granite Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), 24).define('G', ModBlocks.POLISHED_BLACK_GRANITE.get()).pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), 24).define('G', ModBlocks.POLISHED_BROWN_GRANITE.get()).pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), 24).define('G', ModBlocks.POLISHED_GRAY_GRANITE.get()).pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), 24).define('G', ModBlocks.POLISHED_PINK_GRANITE.get()).pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_GRANITE_SLAB.get(), 24).define('G', Blocks.POLISHED_GRANITE).pattern("GGG").unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), 24).define('G', ModBlocks.POLISHED_WHITE_GRANITE.get()).pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), 8).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), 8).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), 8).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), 8).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_SLAB.get(), 8).unlockedBy("has_polished_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_from_polished_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), 8).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.POLISHED_RED_GRANITE_SLAB.get(), 8).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE_SLAB), ModBlocks.POLISHED_RED_GRANITE_SLAB.get(), 4).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "mod_polished_red_granite_slab_from_red_granite_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_polished_black_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_polished_brown_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_polished_gray_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_polished_pink_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_RED_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_granite_slab_from_polished_red_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_polished_white_granite_slab_vertical_stonecutting");

        /* Polished Granite Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.POLISHED_BLACK_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.POLISHED_BROWN_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.POLISHED_GRAY_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.POLISHED_PINK_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 24).define('G', Blocks.POLISHED_GRANITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get(), 24).define('G', ModBlocks.POLISHED_WHITE_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get(), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_polished_black_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_polished_brown_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_polished_gray_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE_SLAB.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_polished_pink_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_GRANITE_SLAB.get()), ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_mod_polished_red_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE_SLAB), ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 4).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_polished_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_polished_white_granite_slab_stonecutting");
        
        /* Polished Granite Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.POLISHED_BLACK_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.POLISHED_BROWN_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.POLISHED_GRAY_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.POLISHED_PINK_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE_STAIRS.get(), 4).define('G', ModBlocks.POLISHED_WHITE_GRANITE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_STAIRS.get(), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_stairs_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_STAIRS.get(), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_stairs_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_STAIRS.get(), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_stairs_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_STAIRS.get(), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_stairs_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_STAIRS.get(), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_stairs_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_STAIRS.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_stairs_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_STAIRS.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_stairs_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_STAIRS.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_stairs_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_STAIRS.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_stairs_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_STAIRS.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_stairs_from_white_granite_stonecutting");
        
        /* Polished Granite Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE_WALL.get(), 6).define('G', ModBlocks.POLISHED_BLACK_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE_WALL.get(), 6).define('G', ModBlocks.POLISHED_BROWN_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE_WALL.get(), 6).define('G', ModBlocks.POLISHED_GRAY_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE_WALL.get(), 6).define('G', ModBlocks.POLISHED_PINK_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_GRANITE_WALL.get(), 6).define('G', Blocks.POLISHED_GRANITE).pattern("GGG").pattern("GGG").unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE_WALL.get(), 6).define('G', ModBlocks.POLISHED_WHITE_GRANITE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_WALL.get(), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_wall_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_WALL.get(), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_wall_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_WALL.get(), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_wall_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_WALL.get(), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_wall_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_WALL.get(), 1).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_wall_from_polished_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_WALL.get(), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_wall_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_WALL.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_wall_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_WALL.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_wall_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_WALL.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_wall_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_WALL.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_wall_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.POLISHED_RED_GRANITE_WALL.get(), 1).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_wall_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_WALL.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_wall_from_white_granite_stonecutting");
        
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

    }
    

    private void limestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Limestone */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_cobbled_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_cobbled_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_cobbled_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_cobbled_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_from_smelting");
        
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
        
        /* Limestone Buttons */
        ShapelessRecipeBuilder.shapeless(ModBlocks.DARK_LIMESTONE_BUTTON.get()).requires(ModBlocks.DARK_LIMESTONE.get()).unlockedBy("has_dark_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_LIMESTONE_BUTTON.get()).requires(ModBlocks.LIGHT_LIMESTONE.get()).unlockedBy("has_light_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LIMESTONE_BUTTON.get()).requires(ModBlocks.PINK_LIMESTONE.get()).unlockedBy("has_pink_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.TAN_LIMESTONE_BUTTON.get()).requires(ModBlocks.TAN_LIMESTONE.get()).unlockedBy("has_tan_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_button_from_shapeless");

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
        
        /* Limestone Pressure Plates */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_PRESSURE_PLATE.get(), 1).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern("LL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_PRESSURE_PLATE.get(), 1).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern("LL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_PRESSURE_PLATE.get(), 1).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern("LL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_PRESSURE_PLATE.get(), 1).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern("LL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_pressure_plate_from_shaped");

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

        /* Limestone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SLAB.get(), 24).define('L', Blocks.STONE).pattern("LLL").unlockedBy("has_red_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "red_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_SLAB.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_SLAB.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_SLAB.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_SLAB.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_SLAB.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_from_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_SLAB), ModBlocks.LIMESTONE_SLAB.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "mod_limestone_slab_from_limestone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.DARK_LIMESTONE_SLAB.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_from_dark_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.LIGHT_LIMESTONE_SLAB.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_from_light_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.LIMESTONE_SLAB.get(), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_from_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.PINK_LIMESTONE_SLAB.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_from_pink_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.TAN_LIMESTONE_SLAB.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_from_tan_limestone_slab_vertical_stonecutting");

        /* Limestone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', Blocks.STONE).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_vertical_from_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_SLAB.get()), ModBlocks.DARK_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_vertical_from_dark_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_SLAB.get()), ModBlocks.LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_vertical_from_light_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_SLAB), ModBlocks.LIMESTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_stone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_SLAB.get()), ModBlocks.LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_SLAB.get()), ModBlocks.PINK_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_vertical_from_pink_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_SLAB.get()), ModBlocks.TAN_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_vertical_from_tan_limestone_slab_stonecutting");
        
        /* Limestone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_stairs_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_stairs_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_stairs_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_stairs_from_tan_limestone_stonecutting");
        
        /* Limestone Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_WALL.get(), 6).define('L', Blocks.STONE).pattern("LLL").pattern("LLL").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_WALL.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_wall_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_WALL.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_wall_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_WALL.get(), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_wall_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_WALL.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_wall_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_WALL.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_wall_from_tan_limestone_stonecutting");
        
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
    }
    

    private void limestoneBrickRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Limestone Bricks */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICKS.get(), 4).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern("LL").pattern("LL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_bricks_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICKS.get(), 4).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern("LL").pattern("LL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_bricks_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICKS.get(), 4).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern("LL").pattern("LL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_bricks_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICKS.get(), 4).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern("LL").pattern("LL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_bricks_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_BRICKS.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_bricks_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_BRICKS.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_bricks_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_BRICKS.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_bricks_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_BRICKS.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_bricks_from_tan_limestone_stonecutting");
        
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

        /* Limestone Brick Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), 24).define('L', ModBlocks.DARK_LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), 24).define('L', ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK_SLAB.get(), 24).define('L', Blocks.STONE_BRICKS).pattern("LLL").unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), 24).define('L', ModBlocks.PINK_LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), 24).define('L', ModBlocks.TAN_LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICK_SLAB), ModBlocks.LIMESTONE_BRICK_SLAB.get(), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_limestone_brick_slab_from_limestone_slab_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.LIMESTONE_BRICK_SLAB.get(), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_brick_slab_vertical_stonecutting");

        /* Limestone Brick Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.DARK_LIMESTONE_BRICKS.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 24).define('L', Blocks.STONE_BRICKS).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.PINK_LIMESTONE_BRICKS.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.TAN_LIMESTONE_BRICKS.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_SLAB), ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_stone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICK_SLAB.get()), ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_brick_slab_stonecutting");
        
        /* Limestone Brick Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get(), 4).define('L', ModBlocks.DARK_LIMESTONE_BRICKS.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get(), 4).define('L', ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get(), 4).define('L', ModBlocks.PINK_LIMESTONE_BRICKS.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get(), 4).define('L', ModBlocks.TAN_LIMESTONE_BRICKS.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get(), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_stairs_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get(), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_stairs_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get(), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_stairs_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get(), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_stairs_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_BRICK_STAIRS.get(), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_stairs_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_STAIRS.get(), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_stairs_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_BRICK_STAIRS.get(), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_stairs_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_BRICK_STAIRS.get(), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_stairs_from_tan_limestone_stonecutting");
        
        /* Limestone Brick Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK_WALL.get(), 6).define('L', ModBlocks.DARK_LIMESTONE_BRICKS.get()).pattern("LLL").pattern("LLL").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get(), 6).define('L', ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).pattern("LLL").pattern("LLL").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK_WALL.get(), 6).define('L', ModBlocks.PINK_LIMESTONE_BRICKS.get()).pattern("LLL").pattern("LLL").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK_WALL.get(), 6).define('L', ModBlocks.TAN_LIMESTONE_BRICKS.get()).pattern("LLL").pattern("LLL").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_WALL.get(), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_wall_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get(), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_wall_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_WALL.get(), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_wall_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_WALL.get(), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_wall_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_BRICK_WALL.get(), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_wall_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_WALL.get(), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_wall_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_BRICK_WALL.get(), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_wall_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_BRICK_WALL.get(), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_wall_from_tan_limestone_stonecutting");
        
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
    }

    private void crackedLimestoneBrickRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.CRACKED_DARK_LIMESTONE_BRICKS.get(), 0.1F, 200).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "cracked_dark_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.get(), 0.1F, 200).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "cracked_light_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.CRACKED_PINK_LIMESTONE_BRICKS.get(), 0.1F, 200).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "cracked_pink_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.CRACKED_TAN_LIMESTONE_BRICKS.get(), 0.1F, 200).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "cracked_tan_limestone_bricks_from_smelting");
    }

    private void chiseledLimestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS.get()).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "chiseled_dark_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.get()).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "chiseled_light_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS.get()).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "chiseled_pink_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS.get()).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "chiseled_tan_limestone_bricks_from_stonecutting");
    }


    private void cobbledLimestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
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
        
        /* Cobbled Limestone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIMESTONE_SLAB.get(), 24).define('L', Blocks.COBBLESTONE).pattern("LLL").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.get()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_SLAB.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_cobbled_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE_SLAB), ModBlocks.COBBLED_LIMESTONE_SLAB.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_limestone_slab_from_cobblestone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_cobbled_dark_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_cobbled_light_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_LIMESTONE_SLAB.get(), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_from_cobbled_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_cobbled_pink_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_cobbled_tan_limestone_slab_vertical_stonecutting");

        /* Cobbled Limestone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_cobbled_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_DARK_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_cobbled_dark_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_cobbled_light_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE_SLAB), ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_cobblestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_cobbled_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_PINK_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_cobbled_pink_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_TAN_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_cobbled_tan_limestone_slab_stonecutting");

        /* Cobbled Limestone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_stairs_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_stairs_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_stairs_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_stairs_from_cobbled_tan_limestone_stonecutting");
        
        /* Cobbled Limestone Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_WALL.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_wall_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_WALL.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_wall_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_WALL.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_wall_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_WALL.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_wall_from_cobbled_tan_limestone_stonecutting");
        
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
    }

    private void smoothLimestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Smooth Limestone */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_from_smelting");
        
        /* Smooth Limestone Arches */
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

        /* Large Smooth Limestone Arches */
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

        /* Half Smooth Limestone Arches */
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

        /* Half Large Smooth Limestone Arches */
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

        /* Smooth Limestone Arrowslits */
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

        /* Smooth Limestone Balustrades */
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

        /* Smooth Limestone Capitals */
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

        /* Smooth Limestone Corners */
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

        /* Smooth Limestone Corner Slabs */
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

        /* Smooth Limestone Vertical Corner Slabs */
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

        /* Smooth Limestone Eighths */
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

        /* Smooth Limestone Pillars */
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

        /* Smooth Limestone Quarters */
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

        /* Smooth Limestone Vertical Quarters */
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

        /* Smooth Limestone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIMESTONE_SLAB.get(), 24).define('L', Blocks.SMOOTH_STONE).pattern("LLL").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB.get(), 24).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.get()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_LIMESTONE_SLAB.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_from_smooth_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_from_smooth_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE_SLAB), ModBlocks.SMOOTH_LIMESTONE_SLAB.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "mod_smooth_limestone_slab_from_smooth_stone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_from_smooth_dark_limestone_slab_verticalstonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_from_smooth_light_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_LIMESTONE_SLAB.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_from_smooth_limestone_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_from_smooth_pink_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_from_smooth_tan_limestone_slab_vertical_stonecutting");
        
        /* Smooth Limestone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB_VERTICAL.get(), 24).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_vertical_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_vertical_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_vertical_from_smooth_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_vertical_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_vertical_from_smooth_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_vertical_from_smooth_dark_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_vertical_from_smooth_light_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE_SLAB), ModBlocks.SMOOTH_LIMESTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_vertical_from_cobblestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIMESTONE_SLAB.get()), ModBlocks.SMOOTH_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_vertical_from_smooth_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_vertical_from_smooth_pink_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_vertical_from_smooth_tan_limestone_slab_stonecutting");
        
        /* Smooth Limestone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIMESTONE_STAIRS.get(), 4).define('L', Blocks.SMOOTH_STONE).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE_STAIRS.get(), 4).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_stairs_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_stairs_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_smooth_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_stairs_from_smooth_stone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_stairs_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_STAIRS.get(), 1).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_stairs_from_smooth_tan_limestone_stonecutting");
        
        /* Smooth Limestone Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIMESTONE_WALL.get(), 6).define('L', Blocks.SMOOTH_STONE).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE_WALL.get(), 6).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_WALL.get(), 1).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_wall_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_WALL.get(), 1).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_wall_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_LIMESTONE_WALL.get(), 1).unlockedBy("has_smooth_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_wall_from_smooth_stone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_WALL.get(), 1).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_wall_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_WALL.get(), 1).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_wall_from_smooth_tan_limestone_stonecutting");
        
        /* Smooth Limestone Windows */
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

        /* Smooth Limestone Half Windows */
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
    }

    private void marbleRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
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
        
        /* Marble Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE_SLAB.get(), 24).define('M', ModBlocks.BLACK_MARBLE.get()).pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE_SLAB.get(), 24).define('M', ModBlocks.GRAY_MARBLE.get()).pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE_SLAB.get(), 24).define('M', ModBlocks.PINK_MARBLE.get()).pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE_SLAB.get(), 24).define('M', ModBlocks.RED_MARBLE.get()).pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE_SLAB.get(), 24).define('M', ModBlocks.WHITE_MARBLE.get()).pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_SLAB.get(), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_SLAB.get(), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_SLAB.get(), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_SLAB.get(), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_SLAB.get(), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE_SLAB_VERTICAL.get()), ModBlocks.BLACK_MARBLE_SLAB.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_from_black_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE_SLAB_VERTICAL.get()), ModBlocks.GRAY_MARBLE_SLAB.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_from_gray_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE_SLAB_VERTICAL.get()), ModBlocks.PINK_MARBLE_SLAB.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_from_pink_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE_SLAB_VERTICAL.get()), ModBlocks.RED_MARBLE_SLAB.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_from_red_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE_SLAB_VERTICAL.get()), ModBlocks.WHITE_MARBLE_SLAB.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_from_white_slab_vertical_marble_stonecutting");

        /* Marble Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.BLACK_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.GRAY_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.PINK_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.RED_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.WHITE_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_vertical_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE_SLAB.get()), ModBlocks.BLACK_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_vertical_from_black_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE_SLAB.get()), ModBlocks.GRAY_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_vertical_from_gray_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE_SLAB.get()), ModBlocks.PINK_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_vertical_from_pink_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE_SLAB.get()), ModBlocks.RED_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_vertical_from_red_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE_SLAB.get()), ModBlocks.WHITE_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_vertical_from_white_slab_marble_stonecutting");
        
        /* Marble Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE_STAIRS.get(), 4).define('G', ModBlocks.BLACK_MARBLE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE_STAIRS.get(), 4).define('G', ModBlocks.GRAY_MARBLE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE_STAIRS.get(), 4).define('G', ModBlocks.PINK_MARBLE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE_STAIRS.get(), 4).define('G', ModBlocks.RED_MARBLE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE_STAIRS.get(), 4).define('G', ModBlocks.WHITE_MARBLE.get()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_STAIRS.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_stairs_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_STAIRS.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_stairs_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_STAIRS.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_stairs_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_STAIRS.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_stairs_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_STAIRS.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_stairs_from_white_marble_stonecutting");

        /* Marble Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE_WALL.get(), 6).define('G', ModBlocks.BLACK_MARBLE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE_WALL.get(), 6).define('G', ModBlocks.GRAY_MARBLE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE_WALL.get(), 6).define('G', ModBlocks.PINK_MARBLE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE_WALL.get(), 6).define('G', ModBlocks.RED_MARBLE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE_WALL.get(), 6).define('G', ModBlocks.WHITE_MARBLE.get()).pattern("GGG").pattern("GGG").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_WALL.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_wall_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_WALL.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_wall_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_WALL.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_wall_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_WALL.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_wall_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_WALL.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_wall_from_white_marble_stonecutting");
        
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
    }

    private void polishedMarbleRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Polished Marble */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE.get(), 4).define('M', ModBlocks.BLACK_MARBLE.get()).pattern("MM").pattern("MM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE.get(), 4).define('M', ModBlocks.GRAY_MARBLE.get()).pattern("MM").pattern("MM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE.get(), 4).define('M', ModBlocks.PINK_MARBLE.get()).pattern("MM").pattern("MM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE.get(), 4).define('M', ModBlocks.RED_MARBLE.get()).pattern("MM").pattern("MM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE.get(), 4).define('M', ModBlocks.WHITE_MARBLE.get()).pattern("MM").pattern("MM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_from_white_marble_stonecutting");
        
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

        /* Polished Marble Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), 24).define('M', ModBlocks.POLISHED_BLACK_MARBLE.get()).pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), 24).define('M', ModBlocks.POLISHED_GRAY_MARBLE.get()).pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), 24).define('M', ModBlocks.POLISHED_PINK_MARBLE.get()).pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), 24).define('M', ModBlocks.POLISHED_RED_MARBLE.get()).pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), 24).define('M', ModBlocks.POLISHED_WHITE_MARBLE.get()).pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.BLACK_MARBLE.get())), ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.GRAY_MARBLE.get())), ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.PINK_MARBLE.get())), ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.RED_MARBLE.get())), ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.WHITE_MARBLE.get())), ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_polished_black_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_polished_gray_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_polished_pink_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_polished_red_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_polished_white_marble_slab_vertical_stonecutting");

        /* Polished Marble Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.POLISHED_BLACK_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.POLISHED_GRAY_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.POLISHED_PINK_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.POLISHED_RED_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get(), 24).define('M', ModBlocks.POLISHED_WHITE_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.BLACK_MARBLE.get())), ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.GRAY_MARBLE.get())), ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.PINK_MARBLE.get())), ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.RED_MARBLE.get())), ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.WHITE_MARBLE.get())), ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get(), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get())), ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_polished_black_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get())), ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_polished_gray_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE_SLAB.get())), ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_polished_pink_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_RED_MARBLE_SLAB.get())), ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_polished_red_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get())), ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_polished_white_marble_slab_stonecutting");
        
        /* Polished Marble Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE_STAIRS.get(), 4).define('M', ModBlocks.POLISHED_BLACK_MARBLE.get()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE_STAIRS.get(), 4).define('M', ModBlocks.POLISHED_GRAY_MARBLE.get()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE_STAIRS.get(), 4).define('M', ModBlocks.POLISHED_PINK_MARBLE.get()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE_STAIRS.get(), 4).define('M', ModBlocks.POLISHED_RED_MARBLE.get()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE_STAIRS.get(), 4).define('M', ModBlocks.POLISHED_WHITE_MARBLE.get()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_STAIRS.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_stairs_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_STAIRS.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_stairs_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_STAIRS.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_stairs_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_STAIRS.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_stairs_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_STAIRS.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_stairs_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_STAIRS.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_stairs_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_STAIRS.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_stairs_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_STAIRS.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_stairs_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_STAIRS.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_stairs_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_STAIRS.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_stairs_from_white_marble_stonecutting");
        
        /* Polished Marble Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE_WALL.get(), 6).define('M', ModBlocks.POLISHED_BLACK_MARBLE.get()).pattern("MMM").pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE_WALL.get(), 6).define('M', ModBlocks.POLISHED_GRAY_MARBLE.get()).pattern("MMM").pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE_WALL.get(), 6).define('M', ModBlocks.POLISHED_PINK_MARBLE.get()).pattern("MMM").pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE_WALL.get(), 6).define('M', ModBlocks.POLISHED_RED_MARBLE.get()).pattern("MMM").pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE_WALL.get(), 6).define('M', ModBlocks.POLISHED_WHITE_MARBLE.get()).pattern("MMM").pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_WALL.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_wall_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_WALL.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_wall_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_WALL.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_wall_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_WALL.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_wall_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_WALL.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_wall_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_WALL.get(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_wall_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_WALL.get(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_wall_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_WALL.get(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_wall_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_WALL.get(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_wall_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_WALL.get(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_wall_from_white_marble_stonecutting");

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

    private void quartzRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_ARCH.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arch_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_ARCH_LARGE.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arch_large_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_ARCH_HALF.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arch_half_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arch_large_half_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_ARROWSLIT.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arrowslit_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_BALUSTRADE.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_balustrade_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_CAPITAL.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_capital_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_CORNER.get(), 5).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_corner_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_CORNER_SLAB.get(), 4).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_corner_slab_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_corner_slab_vertical_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_EIGHTH.get(), 8).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_eighth_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_QUARTER.get(), 5).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_quarter_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_QUARTER_VERTICAL.get(), 5).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_quarter_vertical_from_quartz_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.QUARTZ_SLAB.get(), 24).define('G', Blocks.QUARTZ_BLOCK).pattern("GGG").unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_SLAB.get(), 8).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.QUARTZ_SLAB_VERTICAL.get()), ModBlocks.QUARTZ_SLAB.get(), 1).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_from_quartz_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.QUARTZ_SLAB_VERTICAL.get(), 24).define('G', Blocks.QUARTZ_BLOCK).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_SLAB_VERTICAL.get(), 8).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_vertical_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.QUARTZ_SLAB.get()), ModBlocks.QUARTZ_SLAB_VERTICAL.get(), 1).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_vertical_from_quartz_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.QUARTZ_WALL.get(), 6).define('G', Blocks.QUARTZ_BLOCK).pattern("GGG").pattern("GGG").unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_WALL.get(), 6).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_wall_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_WINDOW.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_window_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ_WINDOW_HALF.get(), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_window_half_from_quartz_stonecutting");
    }

    private void smoothQuartzRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_ARCH.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arch_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_ARCH_LARGE.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arch_large_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_ARCH_HALF.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arch_half_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arch_large_half_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_ARROWSLIT.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arrowslit_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_BALUSTRADE.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_balustrade_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_CAPITAL.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_capital_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_CORNER.get(), 5).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_corner_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_CORNER_SLAB.get(), 4).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_corner_slab_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_corner_slab_vertical_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_EIGHTH.get(), 8).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_eighth_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_QUARTER.get(), 5).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_quarter_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_QUARTER_VERTICAL.get(), 5).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_quarter_vertical_from_smooth_quartz_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_QUARTZ_SLAB.get(), 24).define('G', Blocks.SMOOTH_QUARTZ).pattern("GGG").unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_SLAB.get(), 8).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_QUARTZ_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_QUARTZ_SLAB.get(), 1).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_from_smooth_quartz_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_QUARTZ_SLAB_VERTICAL.get(), 24).define('G', Blocks.SMOOTH_QUARTZ).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_SLAB_VERTICAL.get(), 8).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_vertical_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_QUARTZ_SLAB.get()), ModBlocks.SMOOTH_QUARTZ_SLAB_VERTICAL.get(), 1).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_vertical_from_smooth_quartz_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_QUARTZ_WALL.get(), 6).define('G', Blocks.SMOOTH_QUARTZ).pattern("GGG").pattern("GGG").unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_WALL.get(), 6).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_wall_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_WINDOW.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_window_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ_WINDOW_HALF.get(), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_window_half_from_smooth_quartz_stonecutting");
    }

    private void sandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Sandstone */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE.get(), 4).define('S', ModBlocks.BROWN_SAND.get()).pattern("SS").pattern("SS").unlockedBy("has_brown_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SAND.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE.get(), 4).define('S', ModBlocks.ORANGE_SAND.get()).pattern("SS").pattern("SS").unlockedBy("has_orange_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SAND.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_from_shaped");
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
        
        /* Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_SLAB.get(), 24).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_SLAB.get(), 24).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_SANDSTONE_SLAB.get(), 24).define('S', Blocks.RED_SANDSTONE).pattern("SSS").unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_from_red_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SANDSTONE_SLAB.get(), 24).define('S', Blocks.SANDSTONE).pattern("SSS").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_from_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_SLAB.get(), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_SLAB.get(), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_SLAB.get(), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_SLAB.get(), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE_SLAB), ModBlocks.RED_SANDSTONE_SLAB.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_red_sandstone_slab_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE_SLAB), ModBlocks.SANDSTONE_SLAB.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_sandstone_slab_from_sandstone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.BROWN_SANDSTONE_SLAB.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.ORANGE_SANDSTONE_SLAB.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.RED_SANDSTONE_SLAB.get(), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_red_sandstone_slab_from_red_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.SANDSTONE_SLAB.get(), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_sandstone_slab_from_sandstone_slab_vertical_stonecutting");


        /* Sandstone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get(), 24).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 24).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get(), 24).define('S', Blocks.RED_SANDSTONE).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_vertical_from_red_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SANDSTONE_SLAB_VERTICAL.get(), 24).define('S', Blocks.SANDSTONE).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_vertical_from_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_vertical_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_SLAB_VERTICAL.get(), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_vertical_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_SLAB.get()), ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_SLAB.get()), ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE_SLAB), ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_red_sandstone_slab_vertical_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE_SLAB), ModBlocks.SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_sandstone_slab_vertical_from_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE_SLAB.get()), ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_vertical_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SLAB.get()), ModBlocks.SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_vertical_from_sandstone_slab_stonecutting");
        
        /* Sandstone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_STAIRS.get(), 4).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_STAIRS.get(), 4).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_STAIRS.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_stairs_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_STAIRS.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_stairs_from_orange_sandstone_stonecutting");
        
        /* Sandstone Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_WALL.get(), 6).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_WALL.get(), 6).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_WALL.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_wall_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_WALL.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_wall_from_orange_sandstone_stonecutting");
        
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
    }

    private void chiseledSandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        cut(pFinishedRecipeConsumer, ModBlocks.CHISELED_BROWN_SANDSTONE.get(), ModBlocks.BROWN_SANDSTONE.get());
        cut(pFinishedRecipeConsumer, ModBlocks.CHISELED_ORANGE_SANDSTONE.get(), ModBlocks.ORANGE_SANDSTONE.get());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CHISELED_BROWN_SANDSTONE.get(), ModBlocks.BROWN_SANDSTONE.get());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CHISELED_ORANGE_SANDSTONE.get(), ModBlocks.ORANGE_SANDSTONE.get());
    }
    private void cutSandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Cut Sandstone */
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE.get(), 4).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SS").pattern("SS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE.get(), 4).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SS").pattern("SS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_from_shaped");

        cut(pFinishedRecipeConsumer, ModBlocks.CUT_BROWN_SANDSTONE.get(), ModBlocks.BROWN_SANDSTONE.get());
        cut(pFinishedRecipeConsumer, ModBlocks.CUT_ORANGE_SANDSTONE.get(), ModBlocks.ORANGE_SANDSTONE.get());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CUT_BROWN_SANDSTONE.get(), ModBlocks.BROWN_SANDSTONE.get());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CUT_ORANGE_SANDSTONE.get(), ModBlocks.ORANGE_SANDSTONE.get());
        
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

        /* Cut Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 24).define('S', ModBlocks.CUT_BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_cut_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 24).define('S', ModBlocks.CUT_ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_cut_orange_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_RED_SANDSTONE_SLAB.get(), 24).define('S', Blocks.CUT_RED_SANDSTONE).pattern("SSS").unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_cut_red_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_SANDSTONE_SLAB.get(), 24).define('S', Blocks.CUT_SANDSTONE).pattern("SSS").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_cut_sandstone_shaped");

        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 24).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 24).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 24).define('S', Blocks.RED_SANDSTONE).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_red_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_SANDSTONE_SLAB.get(), 24).define('S', Blocks.SANDSTONE).pattern("SSS").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_SLAB.get(), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_SLAB.get(), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_cut_sandstone_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE_SLAB), ModBlocks.CUT_RED_SANDSTONE_SLAB.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_cut_red_sandstone_slab_from_cut_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE_SLAB), ModBlocks.CUT_SANDSTONE_SLAB.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_cut_sandstone_slab_from_cut_sandstone_slab_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_SLAB.get(), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_SLAB.get(), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.CUT_RED_SANDSTONE_SLAB.get(), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_cut_red_sandstone_slab_from_red_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.CUT_SANDSTONE_SLAB.get(), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_cut_sandstone_slab_from_sandstone_slab_vertical_stonecutting");

        /* Cut Sandstone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.CUT_BROWN_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_cut_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.CUT_ORANGE_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_cut_orange_sandstone_shaped");

        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_cut_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_SLAB.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_SLAB.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE_SLAB), ModBlocks.CUT_RED_SANDSTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE_SLAB), ModBlocks.CUT_SANDSTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE_SLAB.get()), ModBlocks.CUT_RED_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_mod_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SLAB.get()), ModBlocks.CUT_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_mod_sandstone_slab_stonecutting");
        
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
    }

    private void smoothSandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Smooth Sandstone */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(), 0.1F, 200).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(), 0.1F, 200).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_from_smelting");
        
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

        /* Smooth Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get(), 24).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get(), 24).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_RED_SANDSTONE_SLAB.get(), 24).define('S', Blocks.SMOOTH_RED_SANDSTONE).pattern("SSS").unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_SANDSTONE_SLAB.get(), 24).define('S', Blocks.SMOOTH_SANDSTONE).pattern("SSS").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get(), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get(), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_SLAB.get(), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_SLAB.get(), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_from_smooth_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE_SLAB), ModBlocks.SMOOTH_RED_SANDSTONE_SLAB.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE_SLAB), ModBlocks.SMOOTH_SANDSTONE_SLAB.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_smooth_sandstone_slab_from_smooth_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_smooth_brown_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_smooth_orange_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_RED_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_RED_SANDSTONE_SLAB.get(), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_from_smooth_red_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_SANDSTONE_SLAB.get(), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_from_smooth_sandstone_slab_vertical_stonecutting");

        /* Smooth Sandstone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_vertical_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_vertical_from_smooth_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_smooth_brown_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_smooth_orange_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE_SLAB), ModBlocks.SMOOTH_RED_SANDSTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_vertical_from_smooth_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE_SLAB), ModBlocks.SMOOTH_SANDSTONE_SLAB_VERTICAL.get(), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_vertical_from_smooth_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_RED_SANDSTONE_SLAB.get()), ModBlocks.SMOOTH_RED_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_vertical_from_mod_smooth_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_SANDSTONE_SLAB.get()    ), ModBlocks.SMOOTH_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_vertical_from_mod_smooth_sandstone_slab_stonecutting");
        
        /* Smooth Sandstone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE_STAIRS.get(), 4).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE_STAIRS.get(), 4).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_STAIRS.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_stairs_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_STAIRS.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_stairs_from_smooth_orange_sandstone_stonecutting");
        
        /* Smooth Sandstone Walls */
        //TODO: Add Smooth Sandstone Walls Recipes
        
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
