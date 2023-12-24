package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.data.ModBlockFamily;
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arch_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arch_large_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arch_half_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arch_large_half_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_arrowslit_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_balustrade_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_capital_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_corner_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_corner_slab_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_corner_slab_vertical_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_eighth_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_quarter_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_quarter_vertical_from_andesite_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.ANDESITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.ANDESITE).pattern("GGG").unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_from_andesite_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.ANDESITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.ANDESITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_vertical_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ANDESITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_slab_vertical_from_andesite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_window_from_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.ANDESITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ANDESITE).build())).save(pFinishedRecipeConsumer, "andesite_window_half_from_andesite_stonecutting");
    }

    private void polishedAndesiteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arch_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arch_large_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arch_half_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arch_large_half_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_arrowslit_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_balustrade_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_capital_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_corner_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_corner_slab_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_corner_slab_vertical_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_eighth_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_quarter_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_quarter_vertical_from_polished_andesite_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.POLISHED_ANDESITE).pattern("GGG").unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_from_polished_andesite_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.POLISHED_ANDESITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_vertical_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_slab_vertical_from_polished_andesite_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.POLISHED_ANDESITE).pattern("GGG").pattern("GGG").unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.WALL), 6).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_wall_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_window_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.POLISHED_ANDESITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_andesite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_ANDESITE).build())).save(pFinishedRecipeConsumer, "polished_andesite_window_half_from_polished_andesite_stonecutting");
    }

    private void basaltRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arch_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arch_large_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arch_half_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arch_large_half_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_arrowslit_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_balustrade_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_capital_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_corner_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_corner_slab_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_corner_slab_vertical_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_eighth_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_quarter_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_quarter_vertical_from_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BASALT.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.BASALT).pattern("GGG").unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.BASALT.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_from_basalt_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.BASALT).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_vertical_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BASALT.get(ModBlockFamily.Variant.SLAB)), ModBlocks.BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_slab_vertical_from_basalt_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BASALT.get(ModBlockFamily.Variant.STAIRS), 4).define('G', Blocks.BASALT).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_stairs_from_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BASALT.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.BASALT).pattern("GGG").pattern("GGG").unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.WALL), 6).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_wall_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_window_from_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BASALT), ModBlocks.BASALT.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BASALT).build())).save(pFinishedRecipeConsumer, "basalt_window_half_from_basalt_stonecutting");
    }

    private void polishedBasaltRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arch_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arch_large_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arch_half_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arch_large_half_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_arrowslit_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_balustrade_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_capital_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_corner_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_corner_slab_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_corner_slab_vertical_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_eighth_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_quarter_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_quarter_vertical_from_polished_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.POLISHED_BASALT).pattern("GGG").unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_from_polished_basalt_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.POLISHED_BASALT).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_vertical_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_slab_vertical_from_polished_basalt_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.STAIRS), 4).define('G', Blocks.POLISHED_BASALT).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_stairs_from_polished_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.POLISHED_BASALT).pattern("GGG").pattern("GGG").unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.WALL), 6).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_wall_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_window_from_polished_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BASALT), ModBlocks.POLISHED_BASALT.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BASALT).build())).save(pFinishedRecipeConsumer, "polished_basalt_window_half_from_polished_basalt_stonecutting");
    }

    private void smoothBasaltRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arch_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arch_large_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arch_half_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arch_large_half_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_arrowslit_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_balustrade_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_capital_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_corner_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_corner_slab_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_corner_slab_vertical_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_eighth_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_quarter_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_quarter_vertical_from_smooth_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.SMOOTH_BASALT).pattern("GGG").unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_from_smooth_basalt_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.SMOOTH_BASALT).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_vertical_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_slab_vertical_from_smooth_basalt_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.STAIRS), 4).define('G', Blocks.SMOOTH_BASALT).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_stairs_from_smooth_basalt_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.SMOOTH_BASALT).pattern("GGG").pattern("GGG").unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.WALL), 6).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_wall_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_window_from_smooth_basalt_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_BASALT), ModBlocks.SMOOTH_BASALT.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_smooth_basalt",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_BASALT).build())).save(pFinishedRecipeConsumer, "smooth_basalt_window_half_from_smooth_basalt_stonecutting");
    }

    private void blackstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arch_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arch_large_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arch_half_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arch_large_half_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_arrowslit_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_balustrade_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_capital_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_corner_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_corner_slab_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_corner_slab_vertical_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_eighth_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_quarter_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_quarter_vertical_from_blackstone_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.BLACKSTONE).pattern("GGG").unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE_SLAB), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "mod_blackstone_slab_from_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_from_blackstone_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.BLACKSTONE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_vertical_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE_SLAB), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_vertical_from_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_slab_vertical_from_mod_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_window_from_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACKSTONE), ModBlocks.BLACKSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLACKSTONE).build())).save(pFinishedRecipeConsumer, "blackstone_window_half_from_blackstone_stonecutting");
    }

    private void gildedBlackstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arch_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arch_large_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arch_half_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arch_large_half_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_arrowslit_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_balustrade_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_capital_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_corner_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_corner_slab_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_corner_slab_vertical_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_eighth_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_quarter_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_quarter_vertical_from_gilded_blackstone_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.GILDED_BLACKSTONE).pattern("GGG").unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_from_gilded_blackstone_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.GILDED_BLACKSTONE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_vertical_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_slab_vertical_from_gilded_blackstone_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', Blocks.GILDED_BLACKSTONE).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_stairs_from_gilded_blackstone_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.GILDED_BLACKSTONE).pattern("GGG").pattern("GGG").unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.WALL), 6).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_wall_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_window_from_gilded_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE), ModBlocks.GILDED_BLACKSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_gilded_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GILDED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "gilded_blackstone_window_half_from_gilded_blackstone_stonecutting");

    }

    private void polishedBlackstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arch_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arch_large_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arch_half_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arch_large_half_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_arrowslit_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_balustrade_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_capital_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_corner_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_corner_slab_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_corner_slab_vertical_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_eighth_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_quarter_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_quarter_vertical_from_polished_blackstone_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.POLISHED_BLACKSTONE).pattern("GGG").unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_SLAB), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "mod_polished_blackstone_slab_from_polished_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_from_polished_blackstone_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.POLISHED_BLACKSTONE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_vertical_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_SLAB), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_vertical_from_polished_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_slab_vertical_from_mod_polished_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_window_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.POLISHED_BLACKSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_blackstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE).build())).save(pFinishedRecipeConsumer, "polished_blackstone_window_half_from_polished_blackstone_stonecutting");
    }

    private void polishedBlackstoneBrickRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arch_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arch_large_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arch_half_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arch_large_half_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_arrowslit_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_balustrade_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_capital_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_corner_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_corner_slab_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_corner_slab_vertical_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_eighth_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_quarter_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_quarter_vertical_from_polished_blackstone_brick_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.POLISHED_BLACKSTONE_BRICKS).pattern("GGG").unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_polished_blackstone_brick_slab_from_polished_blackstone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_from_polished_blackstone_brick_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.POLISHED_BLACKSTONE_BRICKS).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_vertical_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_vertical_from_polished_blackstone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_slab_vertical_from_mod_polished_blackstone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_window_from_polished_blackstone_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), ModBlocks.POLISHED_BLACKSTONE_BRICK.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_blackstone_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_BLACKSTONE_BRICKS).build())).save(pFinishedRecipeConsumer, "polished_blackstone_brick_window_half_from_polished_blackstone_brick_stonecutting");
    }

    private void deepslateRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arch_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arch_large_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arch_half_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arch_large_half_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_arrowslit_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_balustrade_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_capital_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_corner_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_corner_slab_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_corner_slab_vertical_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_eighth_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_quarter_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_quarter_vertical_from_deepslate_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.DEEPSLATE).pattern("GGG").unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_from_deepslate_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.DEEPSLATE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_vertical_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_slab_vertical_from_deepslate_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', Blocks.DEEPSLATE).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_stairs_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_stairs_from_deepslate_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.DEEPSLATE).pattern("GGG").pattern("GGG").unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_window_from_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.DEEPSLATE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE).build())).save(pFinishedRecipeConsumer, "deepslate_window_half_from_deepslate_stonecutting");
    }

    private void deepslateBrickRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arch_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arch_large_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arch_half_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arch_large_half_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_arrowslit_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_balustrade_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_capital_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_corner_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_corner_slab_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_corner_slab_vertical_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_eighth_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_quarter_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_quarter_vertical_from_deepslate_brick_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.DEEPSLATE_BRICKS).pattern("GGG").unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_deepslate_brick_slab_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICK_SLAB), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_deepslate_brick_slab_from_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_deepslate_brick_slab_from_deepslate_brick_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.DEEPSLATE_BRICKS).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICK_SLAB), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB)), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_mod_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_window_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_window_half_from_deepslate_brick_stonecutting");
    }

    private void deepslateTileRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arch_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arch_large_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arch_half_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arch_large_half_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_arrowslit_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_balustrade_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_capital_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_corner_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_corner_slab_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_corner_slab_vertical_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_eighth_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_quarter_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_quarter_vertical_from_deepslate_tile_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.DEEPSLATE_TILES).pattern("GGG").unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "mod_deepslate_tile_slab_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILE_SLAB), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "mod_deepslate_tile_slab_from_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "mod_deepslate_tile_slab_from_deepslate_tile_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.DEEPSLATE_TILES).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILE_SLAB), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_mod_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_window_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_window_half_from_deepslate_tile_stonecutting");
    }

    private void cobbledDeepslateRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arch_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arch_large_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arch_half_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arch_large_half_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_arrowslit_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_balustrade_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_capital_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_corner_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_corner_slab_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_corner_slab_vertical_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_eighth_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_quarter_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_quarter_vertical_from_cobbled_deepslate_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.COBBLED_DEEPSLATE).pattern("GGG").unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_deepslate_slab_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE_SLAB), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_deepslate_slab_from_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_deepslate_slab_from_cobbled_deepslate_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.COBBLED_DEEPSLATE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE_SLAB), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_mod_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_window_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_window_half_from_cobbled_deepslate_stonecutting");
    }

    private void polishedDeepslateRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arch_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arch_large_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arch_half_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arch_large_half_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_arrowslit_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_balustrade_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_capital_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_corner_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_corner_slab_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_corner_slab_vertical_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_eighth_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_quarter_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_quarter_vertical_from_polished_deepslate_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.POLISHED_DEEPSLATE).pattern("GGG").unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_polished_deepslate_slab_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE_SLAB), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_polished_deepslate_slab_from_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_polished_deepslate_slab_from_polished_deepslate_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.POLISHED_DEEPSLATE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE_SLAB), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_mod_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_window_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_window_half_from_polished_deepslate_stonecutting");
    }

    private void dioriteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arch_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arch_large_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arch_half_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arch_large_half_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_arrowslit_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_balustrade_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_capital_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_corner_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_corner_slab_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_corner_slab_vertical_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_eighth_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_quarter_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_quarter_vertical_from_diorite_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DIORITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.DIORITE).pattern("GGG").unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.DIORITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_from_diorite_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DIORITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.DIORITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_vertical_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DIORITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.DIORITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_slab_vertical_from_diorite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_window_from_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.DIORITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIORITE).build())).save(pFinishedRecipeConsumer, "diorite_window_half_from_diorite_stonecutting");
    }

    private void polishedDioriteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arch_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arch_large_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arch_half_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arch_large_half_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_arrowslit_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_balustrade_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_capital_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_corner_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_corner_slab_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_corner_slab_vertical_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_eighth_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_quarter_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_quarter_vertical_from_polished_diorite_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.POLISHED_DIORITE).pattern("GGG").unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_from_polished_diorite_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.POLISHED_DIORITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_vertical_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_slab_vertical_from_polished_diorite_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.POLISHED_DIORITE).pattern("GGG").pattern("GGG").unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.WALL), 6).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_wall_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_window_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.POLISHED_DIORITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_diorite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DIORITE).build())).save(pFinishedRecipeConsumer, "polished_diorite_window_half_from_polished_diorite_stonecutting");
    }

    private void graniteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_arch_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_arch_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_arch_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_arch_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arch_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_from_white_granite_stonecutting");

        /* Large Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_arch_large_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_arch_large_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_arch_large_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_arch_large_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arch_large_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_large_from_white_granite_stonecutting");

        /* Half Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_arch_half_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_arch_half_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_arch_half_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_arch_half_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arch_half_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_half_from_white_granite_stonecutting");

        /* Half Large Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_arch_large_half_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_arch_large_half_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_arch_large_half_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_arch_large_half_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arch_large_half_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_arch_large_half_from_white_granite_stonecutting");

        /* Granite Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_arrowslit_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_arrowslit_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_arrowslit_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_arrowslit_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_arrowslit_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_arrowslit_from_white_granite_stonecutting");

        /* Granite Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_balustrade_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_balustrade_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_balustrade_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_balustrade_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_balustrade_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_balustrade_from_white_granite_stonecutting");

        /* Granite Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_capital_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_capital_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_capital_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_capital_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_capital_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_capital_from_white_granite_stonecutting");

        /* Granite Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_corner_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_corner_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_corner_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_corner_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_corner_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_corner_from_white_granite_stonecutting");

        /* Granite Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_corner_slab_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_corner_slab_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_corner_slab_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_corner_slab_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_corner_slab_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_corner_slab_from_white_granite_stonecutting");

        /* Granite Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_corner_slab_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_corner_slab_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_corner_slab_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_corner_slab_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_corner_slab_vertical_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_corner_slab_vertical_from_white_granite_stonecutting");

        /* Granite Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_eighth_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_eighth_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_eighth_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_eighth_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_eighth_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_eighth_from_white_granite_stonecutting");

        /* Granite Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_pillar_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_pillar_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_pillar_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_pillar_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_pillar_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_pillar_from_white_granite_stonecutting");

        /* Granite Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_quarter_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_quarter_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_quarter_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_quarter_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_quarter_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_quarter_from_white_granite_stonecutting");

        /* Granite Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_quarter_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_quarter_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_quarter_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_quarter_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_quarter_vertical_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_quarter_vertical_from_white_granite_stonecutting");

        /* Granite Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.BLACK_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.BROWN_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.GRAY_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.PINK_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.GRANITE).pattern("GGG").unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.WHITE_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE_SLAB), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "mod_red_granite_slab_from_granite_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_black_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_brown_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_gray_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_pink_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_from_red_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_white_granite_slab_vertical_stonecutting");

        /* Granite Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.BLACK_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.BROWN_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.GRAY_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.PINK_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.WHITE_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_vertical_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_black_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_brown_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_gray_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_pink_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE_SLAB), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_vertical_from_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_vertical_from_red_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_white_granite_slab_stonecutting");

        /* Granite Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.BLACK_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.BROWN_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.GRAY_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.PINK_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.WHITE_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_stairs_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_stairs_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_stairs_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_stairs_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_stairs_from_white_granite_stonecutting");

        /* Granite Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.BLACK_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.BROWN_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.GRAY_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.PINK_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.WHITE_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_wall_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_wall_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_wall_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_wall_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_wall_from_white_granite_stonecutting");

        /* Granite Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_window_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_window_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_window_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_window_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_window_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_window_from_white_granite_stonecutting");

        /* Granite Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.BLACK_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_granite_window_half_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.BROWN_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_granite_window_half_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.GRAY_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_granite_window_half_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.PINK_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_granite_window_half_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_window_half_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.WHITE_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_granite_window_half_from_white_granite_stonecutting");
    }

    private void polishedGraniteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* POLISHED GRANITE BLOCKS */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock(), 4).define('G', ModBlocks.BLACK_GRANITE.baseBlock()).pattern("GG").pattern("GG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock(), 4).define('G', ModBlocks.BROWN_GRANITE.baseBlock()).pattern("GG").pattern("GG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock(), 4).define('G', ModBlocks.GRAY_GRANITE.baseBlock()).pattern("GG").pattern("GG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE.baseBlock(), 4).define('G', ModBlocks.PINK_GRANITE.baseBlock()).pattern("GG").pattern("GG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock(), 4).define('G', ModBlocks.WHITE_GRANITE.baseBlock()).pattern("GG").pattern("GG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.baseBlock(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.baseBlock(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.baseBlock(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.baseBlock(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.baseBlock(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_from_white_granite_stonecutting");

        /* Polished Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arch_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arch_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arch_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arch_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arch_from_polished_white_granite_stonecutting");

        /* Large Polished Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arch_large_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arch_large_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arch_large_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arch_large_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arch_large_from_polished_white_granite_stonecutting");

        /* Half Polished Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arch_half_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arch_half_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arch_half_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arch_half_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arch_half_from_polished_white_granite_stonecutting");

        /* Half Large Polished Granite Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arch_large_half_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arch_large_half_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arch_large_half_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arch_large_half_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arch_large_half_from_polished_white_granite_stonecutting");

        /* Polished Granite Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_arrowslit_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_arrowslit_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_arrowslit_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_arrowslit_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_arrowslit_from_polished_white_granite_stonecutting");

        /* Polished Granite Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_balustrade_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_balustrade_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_balustrade_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_balustrade_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_balustrade_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_balustrade_from_polished_white_granite_stonecutting");

        /* Polished Granite Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_capital_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_capital_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_capital_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_capital_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_capital_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_capital_from_polished_white_granite_stonecutting");

        /* Polished Granite Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_corner_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_corner_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_corner_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_corner_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_corner_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_corner_from_polished_white_granite_stonecutting");

        /* Polished Granite Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_corner_slab_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_corner_slab_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_corner_slab_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_corner_slab_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_corner_slab_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_corner_slab_from_polished_white_granite_stonecutting");

        /* Polished Granite Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_corner_slab_vertical_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_corner_slab_vertical_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_corner_slab_vertical_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_corner_slab_vertical_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_corner_slab_vertical_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_corner_slab_vertical_from_polished_white_granite_stonecutting");

        /* Polished Granite Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_eighth_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_eighth_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_eighth_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_eighth_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_eighth_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_eighth_from_polished_white_granite_stonecutting");

        /* Polished Granite Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_pillar_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_pillar_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_pillar_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_pillar_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_pillar_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_pillar_from_polished_white_granite_stonecutting");

        /* Polished Granite Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_quarter_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_quarter_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_quarter_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_quarter_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_quarter_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_quarter_from_polished_white_granite_stonecutting");

        /* Polished Granite Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_quarter_vertical_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_quarter_vertical_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_quarter_vertical_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_quarter_vertical_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_quarter_vertical_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_quarter_vertical_from_polished_white_granite_stonecutting");

        /* Polished Granite Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.POLISHED_GRANITE).pattern("GGG").unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB), 24).define('G', ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_from_polished_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE_SLAB), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "mod_polished_red_granite_slab_from_red_granite_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_polished_black_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_polished_brown_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_polished_gray_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_polished_pink_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_granite_slab_from_polished_red_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_polished_white_granite_slab_vertical_stonecutting");

        /* Polished Granite Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.POLISHED_GRANITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_polished_black_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_polished_brown_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_polished_gray_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_polished_pink_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_mod_polished_red_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE_SLAB), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_polished_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_polished_white_granite_slab_stonecutting");

        /* Polished Granite Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_stairs_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_stairs_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_stairs_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_stairs_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_stairs_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_stairs_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_stairs_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_stairs_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_stairs_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_stairs_from_white_granite_stonecutting");

        /* Polished Granite Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.POLISHED_GRANITE).pattern("GGG").pattern("GGG").unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_wall_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_wall_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_wall_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_wall_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_wall_from_polished_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_wall_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_wall_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_wall_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_wall_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_wall_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_wall_from_red_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_wall_from_white_granite_stonecutting");

        /* Polished Granite Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_window_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_window_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_window_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_window_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_window_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_window_from_polished_white_granite_stonecutting");

        /* Polished Granite Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()), ModBlocks.POLISHED_BLACK_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_window_half_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()), ModBlocks.POLISHED_BROWN_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_window_half_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()), ModBlocks.POLISHED_GRAY_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_window_half_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()), ModBlocks.POLISHED_PINK_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_window_half_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_window_half_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()), ModBlocks.POLISHED_WHITE_GRANITE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_window_half_from_polished_white_granite_stonecutting");

    }


    private void limestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Limestone */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_from_smelting");

        /* Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arch_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_arch_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arch_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arch_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arch_from_tan_limestone_stonecutting");

        /* Large Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arch_large_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_arch_large_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arch_large_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arch_large_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arch_large_from_tan_limestone_stonecutting");

        /* Half Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arch_half_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_arch_half_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arch_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arch_half_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arch_half_from_tan_limestone_stonecutting");

        /* Half Large Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arch_large_half_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_arch_large_half_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arch_large_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arch_large_half_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arch_large_half_from_tan_limestone_stonecutting");

        /* Limestone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_arrowslit_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_arrowslit_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_arrowslit_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_arrowslit_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_arrowslit_from_tan_limestone_stonecutting");

        /* Limestone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_balustrade_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_balustrade_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_balustrade_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_balustrade_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_balustrade_from_tan_limestone_stonecutting");

        /* Limestone Buttons */
        ShapelessRecipeBuilder.shapeless(ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.BUTTON)).requires(ModBlocks.DARK_LIMESTONE.baseBlock()).unlockedBy("has_dark_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.BUTTON)).requires(ModBlocks.LIGHT_LIMESTONE.baseBlock()).unlockedBy("has_light_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.BUTTON)).requires(ModBlocks.PINK_LIMESTONE.baseBlock()).unlockedBy("has_pink_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.BUTTON)).requires(ModBlocks.TAN_LIMESTONE.baseBlock()).unlockedBy("has_tan_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_button_from_shapeless");

        /* Limestone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_capital_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_capital_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_capital_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_capital_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_capital_from_tan_limestone_stonecutting");

        /* Limestone Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_corner_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_corner_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.CORNER), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_corner_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_corner_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_corner_from_tan_limestone_stonecutting");

        /* Limestone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_corner_slab_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_corner_slab_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_corner_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_corner_slab_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_corner_slab_from_tan_limestone_stonecutting");

        /* Limestone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_corner_slab_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_corner_slab_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_corner_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_corner_slab_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_corner_slab_vertical_from_tan_limestone_stonecutting");

        /* Limestone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_eighth_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_eighth_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_eighth_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_eighth_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_eighth_from_tan_limestone_stonecutting");

        /* Limestone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_pillar_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_pillar_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_pillar_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_pillar_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_pillar_from_tan_limestone_stonecutting");

        /* Limestone Pressure Plates */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('L', ModBlocks.DARK_LIMESTONE.baseBlock()).pattern("LL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('L', ModBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("LL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('L', ModBlocks.PINK_LIMESTONE.baseBlock()).pattern("LL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.PRESSURE_PLATE), 1).define('L', ModBlocks.TAN_LIMESTONE.baseBlock()).pattern("LL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_pressure_plate_from_shaped");

        /* Limestone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_quarter_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_quarter_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_quarter_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_quarter_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_quarter_from_tan_limestone_stonecutting");

        /* Limestone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_quarter_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_quarter_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_quarter_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_quarter_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_quarter_vertical_from_tan_limestone_stonecutting");

        /* Limestone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.DARK_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', Blocks.STONE).pattern("LLL").unlockedBy("has_red_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "red_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.PINK_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.TAN_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_from_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_SLAB), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "mod_limestone_slab_from_limestone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_from_dark_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_from_light_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_from_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_from_pink_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_from_tan_limestone_slab_vertical_stonecutting");

        /* Limestone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.DARK_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.LIGHT_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', Blocks.STONE).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.PINK_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.TAN_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_vertical_from_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_vertical_from_dark_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_vertical_from_light_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_SLAB), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_stone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_vertical_from_pink_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_vertical_from_tan_limestone_slab_stonecutting");

        /* Limestone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.DARK_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.PINK_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.TAN_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_stairs_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_stairs_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_stairs_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_stairs_from_tan_limestone_stonecutting");

        /* Limestone Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.DARK_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', Blocks.STONE).pattern("LLL").pattern("LLL").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.PINK_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.TAN_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_wall_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_wall_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_wall_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_wall_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_wall_from_tan_limestone_stonecutting");

        /* Limestone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_window_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_window_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_window_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_window_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_window_from_tan_limestone_stonecutting");

        /* Limestone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_window_half_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_window_half_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_window_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_window_half_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_window_half_from_tan_limestone_stonecutting");
    }


    private void limestoneBrickRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Limestone Bricks */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock(), 4).define('L', ModBlocks.DARK_LIMESTONE.baseBlock()).pattern("LL").pattern("LL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_bricks_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock(), 4).define('L', ModBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("LL").pattern("LL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_bricks_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock(), 4).define('L', ModBlocks.PINK_LIMESTONE.baseBlock()).pattern("LL").pattern("LL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_bricks_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock(), 4).define('L', ModBlocks.TAN_LIMESTONE.baseBlock()).pattern("LL").pattern("LL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_bricks_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.baseBlock(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_bricks_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_bricks_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.baseBlock(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_bricks_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.baseBlock(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_bricks_from_tan_limestone_stonecutting");

        /* Limestone Brick Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arch_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arch_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arch_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arch_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arch_from_tan_limestone_bricks_stonecutting");

        /* Large Limestone Brick Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arch_large_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arch_large_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arch_large_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arch_large_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arch_large_from_tan_limestone_bricks_stonecutting");

        /* Half Limestone Brick Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arch_half_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arch_half_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arch_half_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arch_half_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arch_half_from_tan_limestone_bricks_stonecutting");

        /* Half Large Limestone Brick Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arch_large_half_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arch_large_half_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arch_large_half_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arch_large_half_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arch_large_half_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_arrowslit_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_arrowslit_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_arrowslit_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_arrowslit_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_arrowslit_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_balustrade_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_balustrade_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_balustrade_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_balustrade_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_balustrade_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_capital_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_capital_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_capital_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_capital_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_capital_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_corner_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_corner_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_corner_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_corner_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_corner_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_corner_slab_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_corner_slab_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_corner_slab_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_corner_slab_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_corner_slab_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_corner_slab_vertical_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_corner_slab_vertical_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_corner_slab_vertical_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_corner_slab_vertical_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_corner_slab_vertical_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_eighth_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_eighth_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_eighth_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_eighth_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_eighth_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_pillar_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_pillar_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_pillar_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_pillar_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_pillar_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_quarter_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_quarter_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_quarter_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_quarter_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_quarter_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_quarter_vertical_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_quarter_vertical_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_quarter_vertical_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_quarter_vertical_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_quarter_vertical_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).pattern("LLL").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).pattern("LLL").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 24).define('L', Blocks.STONE_BRICKS).pattern("LLL").unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).pattern("LLL").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).pattern("LLL").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICK_SLAB), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_limestone_brick_slab_from_limestone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_brick_slab_vertical_stonecutting");

        /* Limestone Brick Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', Blocks.STONE_BRICKS).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB)), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB)), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_SLAB), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_stone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB)), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB)), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB)), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_brick_slab_stonecutting");

        /* Limestone Brick Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_stairs_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_stairs_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_stairs_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_stairs_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_stairs_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_stairs_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_stairs_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_stairs_from_tan_limestone_stonecutting");

        /* Limestone Brick Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_wall_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_wall_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_wall_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_wall_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_wall_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_wall_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_wall_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_wall_from_tan_limestone_stonecutting");

        /* Limestone Brick Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_window_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_window_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_window_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_window_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_window_from_tan_limestone_bricks_stonecutting");

        /* Limestone Brick Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.DARK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_window_half_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.LIGHT_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_window_half_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_window_half_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.PINK_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_window_half_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.TAN_LIMESTONE_BRICK.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_window_half_from_tan_limestone_bricks_stonecutting");
    }

    private void crackedLimestoneBrickRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()), ModBlocks.CRACKED_DARK_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_dark_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), ModBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_light_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK.baseBlock()), ModBlocks.CRACKED_PINK_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_pink_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK.baseBlock()), ModBlocks.CRACKED_TAN_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_tan_limestone_bricks_from_smelting");
    }

    private void chiseledLimestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS.baseBlock()).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_dark_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.baseBlock()).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_light_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS.baseBlock()).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_pink_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS.baseBlock()).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_tan_limestone_bricks_from_stonecutting");
    }


    private void cobbledLimestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Cobbled Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arch_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arch_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arch_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arch_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arch_from_cobbled_tan_limestone_stonecutting");

        /* Large Cobbled Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arch_large_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arch_large_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arch_large_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arch_large_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arch_large_from_cobbled_tan_limestone_stonecutting");

        /* Half Cobbled Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arch_half_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arch_half_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arch_half_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arch_half_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arch_half_from_cobbled_tan_limestone_stonecutting");

        /* Half Large Cobbled Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arch_large_half_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arch_large_half_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arch_large_half_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arch_large_half_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arch_large_half_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_arrowslit_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_arrowslit_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_arrowslit_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_arrowslit_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_arrowslit_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_balustrade_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_balustrade_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_balustrade_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_balustrade_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_balustrade_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_capital_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_capital_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_capital_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_capital_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_capital_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_corner_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_corner_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_corner_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_corner_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_corner_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_corner_slab_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_corner_slab_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_corner_slab_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_corner_slab_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_corner_slab_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_corner_slab_vertical_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_corner_slab_vertical_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_corner_slab_vertical_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_corner_slab_vertical_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_corner_slab_vertical_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_eighth_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_eighth_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_eighth_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_eighth_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_eighth_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_pillar_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_pillar_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_pillar_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_pillar_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_pillar_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_quarter_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_quarter_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_quarter_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_quarter_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_quarter_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_quarter_vertical_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_quarter_vertical_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_quarter_vertical_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_quarter_vertical_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_quarter_vertical_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', Blocks.COBBLESTONE).pattern("LLL").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_cobbled_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE_SLAB), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_limestone_slab_from_cobblestone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_cobbled_dark_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_cobbled_light_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_from_cobbled_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_cobbled_pink_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_cobbled_tan_limestone_slab_vertical_stonecutting");

        /* Cobbled Limestone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_cobbled_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_cobbled_dark_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_cobbled_light_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE_SLAB), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_cobblestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_cobbled_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_cobbled_pink_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_cobbled_tan_limestone_slab_stonecutting");

        /* Cobbled Limestone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_stairs_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_stairs_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_stairs_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_stairs_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_wall_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_wall_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_wall_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_wall_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_window_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_window_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_window_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_window_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_window_from_cobbled_tan_limestone_stonecutting");

        /* Cobbled Limestone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_DARK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_window_half_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), ModBlocks.COBBLED_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_window_half_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_window_half_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), ModBlocks.COBBLED_PINK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_window_half_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), ModBlocks.COBBLED_TAN_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_window_half_from_cobbled_tan_limestone_stonecutting");
    }

    private void smoothLimestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Smooth Limestone */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_from_smelting");

        /* Smooth Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arch_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arch_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arch_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arch_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arch_from_smooth_tan_limestone_stonecutting");

        /* Large Smooth Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arch_large_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arch_large_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arch_large_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arch_large_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arch_large_from_smooth_tan_limestone_stonecutting");

        /* Half Smooth Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arch_half_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arch_half_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arch_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arch_half_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arch_half_from_smooth_tan_limestone_stonecutting");

        /* Half Large Smooth Limestone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arch_large_half_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arch_large_half_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arch_large_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arch_large_half_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arch_large_half_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_arrowslit_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_arrowslit_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_arrowslit_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_arrowslit_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_arrowslit_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_balustrade_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_balustrade_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_balustrade_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_balustrade_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_balustrade_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_capital_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_capital_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_capital_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_capital_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_capital_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_corner_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_corner_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_corner_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_corner_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_corner_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_corner_slab_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_corner_slab_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_corner_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_corner_slab_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_corner_slab_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_corner_slab_vertical_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_corner_slab_vertical_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_corner_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_corner_slab_vertical_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_corner_slab_vertical_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_eighth_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_eighth_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_eighth_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_eighth_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_eighth_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_pillar_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_pillar_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_pillar_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_pillar_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_pillar_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_quarter_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_quarter_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_quarter_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_quarter_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_quarter_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_quarter_vertical_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_quarter_vertical_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_quarter_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_quarter_vertical_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_quarter_vertical_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', Blocks.SMOOTH_STONE).pattern("LLL").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 24).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_from_smooth_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_from_smooth_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE_SLAB), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "mod_smooth_limestone_slab_from_smooth_stone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_from_smooth_dark_limestone_slab_verticalstonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_from_smooth_light_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_from_smooth_limestone_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_from_smooth_pink_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_from_smooth_tan_limestone_slab_vertical_stonecutting");

        /* Smooth Limestone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_vertical_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_vertical_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_vertical_from_smooth_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_vertical_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_vertical_from_smooth_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_vertical_from_smooth_dark_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_vertical_from_smooth_light_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE_SLAB), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_vertical_from_cobblestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_slab_vertical_from_smooth_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_vertical_from_smooth_pink_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_vertical_from_smooth_tan_limestone_slab_stonecutting");

        /* Smooth Limestone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', Blocks.SMOOTH_STONE).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_stairs_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_stairs_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_smooth_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_stairs_from_smooth_stone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_stairs_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_stairs_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', Blocks.SMOOTH_STONE).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.WALL), 6).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).pattern("LLL").pattern("LLL").unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_wall_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_wall_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_smooth_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_wall_from_smooth_stone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_wall_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_wall_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_window_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_window_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_window_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_window_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_window_from_smooth_tan_limestone_stonecutting");

        /* Smooth Limestone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_smooth_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_window_half_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_smooth_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_window_half_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.SMOOTH_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "smooth_limestone_window_half_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_smooth_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_window_half_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_smooth_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SMOOTH_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_window_half_from_smooth_tan_limestone_stonecutting");
    }


        /* Marble Arches */
    private void marbleRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_arch_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_arch_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_arch_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_arch_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_arch_from_white_marble_stonecutting");

        /* Half Large Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_arch_large_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_arch_large_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_arch_large_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_arch_large_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_arch_large_from_white_marble_stonecutting");

        /* Half Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_arch_half_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_arch_half_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_arch_half_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_arch_half_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_arch_half_from_white_marble_stonecutting");

        /* Large Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_arch_large_half_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_arch_large_half_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_arch_large_half_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_arch_large_half_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_arch_large_half_from_white_marble_stonecutting");

        /* Marble Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_arrowslit_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_arrowslit_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_arrowslit_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_arrowslit_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_arrowslit_from_white_marble_stonecutting");

        /* Marble Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_balustrade_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_balustrade_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_balustrade_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_balustrade_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_balustrade_from_white_marble_stonecutting");

        /* Marble Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_capital_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_capital_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_capital_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_capital_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_capital_from_white_marble_stonecutting");

        /* Marble Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_corner_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_corner_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_corner_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_corner_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_corner_from_white_marble_stonecutting");

        /* Marble Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_corner_slab_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_corner_slab_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_corner_slab_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_corner_slab_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_corner_slab_from_white_marble_stonecutting");

        /* Marble Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_corner_slab_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_corner_slab_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_corner_slab_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_corner_slab_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_corner_slab_vertical_from_white_marble_stonecutting");

        /* Marble Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_eighth_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_eighth_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_eighth_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_eighth_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_eighth_from_white_marble_stonecutting");

        /* Marble Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_pillar_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_pillar_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_pillar_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_pillar_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_pillar_from_white_marble_stonecutting");

        /* Marble Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_quarter_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_quarter_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_quarter_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_quarter_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_quarter_from_white_marble_stonecutting");

        /* Marble Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_quarter_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_quarter_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_quarter_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_quarter_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_quarter_vertical_from_white_marble_stonecutting");

        /* Marble Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.BLACK_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.GRAY_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.PINK_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.RED_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.WHITE_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_from_black_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_from_gray_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_from_pink_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_from_red_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_from_white_slab_vertical_marble_stonecutting");

        /* Marble Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.BLACK_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.GRAY_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.PINK_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.RED_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.WHITE_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_vertical_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_vertical_from_black_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_vertical_from_gray_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_vertical_from_pink_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_vertical_from_red_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_vertical_from_white_slab_marble_stonecutting");

        /* Marble Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.BLACK_MARBLE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.GRAY_MARBLE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.PINK_MARBLE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.RED_MARBLE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('G', ModBlocks.WHITE_MARBLE.baseBlock()).pattern("G  ").pattern("GG ").pattern("GGG").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_stairs_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_stairs_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_stairs_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_stairs_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_stairs_from_white_marble_stonecutting");

        /* Marble Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.BLACK_MARBLE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.GRAY_MARBLE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.PINK_MARBLE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.RED_MARBLE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('G', ModBlocks.WHITE_MARBLE.baseBlock()).pattern("GGG").pattern("GGG").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_wall_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_wall_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_wall_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_wall_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_wall_from_white_marble_stonecutting");

        /* Marble Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_window_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_window_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_window_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_window_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_window_from_white_marble_stonecutting");

        /* Marble Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "black_marble_window_half_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "gray_marble_window_half_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_marble_window_half_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "red_marble_window_half_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_marble_window_half_from_white_marble_stonecutting");
    }

    private void polishedMarbleRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Polished Marble */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock(), 4).define('M', ModBlocks.BLACK_MARBLE.get(ModBlockFamily.Variant.BASE)).pattern("MM").pattern("MM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock(), 4).define('M', ModBlocks.GRAY_MARBLE.get(ModBlockFamily.Variant.BASE)).pattern("MM").pattern("MM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE.baseBlock(), 4).define('M', ModBlocks.PINK_MARBLE.get(ModBlockFamily.Variant.BASE)).pattern("MM").pattern("MM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE.baseBlock(), 4).define('M', ModBlocks.RED_MARBLE.get(ModBlockFamily.Variant.BASE)).pattern("MM").pattern("MM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock(), 4).define('M', ModBlocks.WHITE_MARBLE.get(ModBlockFamily.Variant.BASE)).pattern("MM").pattern("MM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.baseBlock(), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.baseBlock(), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.baseBlock(), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.baseBlock(), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.baseBlock(), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_from_white_marble_stonecutting");

        /* Polished Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arch_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arch_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arch_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arch_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arch_from_polished_white_marble_stonecutting");

        /* Large Polished Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arch_large_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arch_large_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arch_large_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arch_large_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arch_large_from_polished_white_marble_stonecutting");

        /* Half Polished Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arch_half_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arch_half_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arch_half_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arch_half_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arch_half_from_polished_white_marble_stonecutting");

        /* Half Large Polished Marble Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arch_large_half_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arch_large_half_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arch_large_half_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arch_large_half_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arch_large_half_from_polished_white_marble_stonecutting");

        /* Polished Marble Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_arrowslit_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_arrowslit_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_arrowslit_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_arrowslit_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_arrowslit_from_polished_white_marble_stonecutting");

        /* Polished Marble Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_balustrade_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_balustrade_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_balustrade_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_balustrade_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_balustrade_from_polished_white_marble_stonecutting");

        /* Polished Marble Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_capital_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_capital_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_capital_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_capital_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_capital_from_polished_white_marble_stonecutting");

        /* Polished Marble Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_corner_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_corner_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_corner_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_corner_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_corner_from_polished_white_marble_stonecutting");

        /* Polished Marble Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_corner_slab_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_corner_slab_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_corner_slab_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_corner_slab_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_corner_slab_from_polished_white_marble_stonecutting");

        /* Polished Marble Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_corner_slab_vertical_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_corner_slab_vertical_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_corner_slab_vertical_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_corner_slab_vertical_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_corner_slab_vertical_from_polished_white_marble_stonecutting");

        /* Polished Marble Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_eighth_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_eighth_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_eighth_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_eighth_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_eighth_from_polished_white_marble_stonecutting");

        /* Polished Marble Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_pillar_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_pillar_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_pillar_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_pillar_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_pillar_from_polished_white_marble_stonecutting");

        /* Polished Marble Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_quarter_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_quarter_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_quarter_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_quarter_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_quarter_from_polished_white_marble_stonecutting");

        /* Polished Marble Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_quarter_vertical_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_quarter_vertical_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_quarter_vertical_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_quarter_vertical_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_quarter_vertical_from_polished_white_marble_stonecutting");

        /* Polished Marble Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.POLISHED_PINK_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.POLISHED_RED_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB), 24).define('M', ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()).pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock())), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock())), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock())), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.RED_MARBLE.baseBlock())), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock())), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL))), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_polished_black_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL))), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_polished_gray_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL))), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_polished_pink_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL))), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_polished_red_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL))), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_polished_white_marble_slab_vertical_stonecutting");

        /* Polished Marble Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.POLISHED_PINK_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.POLISHED_RED_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('M', ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock())), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock())), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock())), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.RED_MARBLE.baseBlock())), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock())), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB))), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_polished_black_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB))), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_polished_gray_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB))), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_polished_pink_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB))), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_polished_red_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB))), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_polished_white_marble_slab_stonecutting");

        /* Polished Marble Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('M', ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('M', ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('M', ModBlocks.POLISHED_PINK_MARBLE.baseBlock()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('M', ModBlocks.POLISHED_RED_MARBLE.baseBlock()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.STAIRS), 4).define('M', ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_stairs_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_stairs_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_stairs_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_stairs_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_stairs_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_stairs_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_stairs_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_stairs_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_stairs_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_stairs_from_white_marble_stonecutting");

        /* Polished Marble Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('M', ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()).pattern("MMM").pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('M', ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()).pattern("MMM").pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('M', ModBlocks.POLISHED_PINK_MARBLE.baseBlock()).pattern("MMM").pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('M', ModBlocks.POLISHED_RED_MARBLE.baseBlock()).pattern("MMM").pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.WALL), 6).define('M', ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()).pattern("MMM").pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_wall_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_wall_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_wall_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_wall_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_wall_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_wall_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_wall_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_wall_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_wall_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_wall_from_white_marble_stonecutting");

        /* Polished Marble Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_window_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_window_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_window_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_window_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_window_from_polished_white_marble_stonecutting");

        /* Polished Marble Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.baseBlock()), ModBlocks.POLISHED_BLACK_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_window_half_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.baseBlock()), ModBlocks.POLISHED_GRAY_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_window_half_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.baseBlock()), ModBlocks.POLISHED_PINK_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_window_half_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.baseBlock()), ModBlocks.POLISHED_RED_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_window_half_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.baseBlock()), ModBlocks.POLISHED_WHITE_MARBLE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_window_half_from_polished_white_marble_stonecutting");
    }

    private void quartzRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arch_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arch_large_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arch_half_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arch_large_half_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_arrowslit_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_balustrade_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_capital_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_corner_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_corner_slab_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_corner_slab_vertical_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_eighth_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_quarter_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_quarter_vertical_from_quartz_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.QUARTZ.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.QUARTZ_BLOCK).pattern("GGG").unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.QUARTZ.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_from_quartz_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.QUARTZ.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.QUARTZ_BLOCK).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_vertical_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.QUARTZ.get(ModBlockFamily.Variant.SLAB)), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_slab_vertical_from_quartz_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.QUARTZ.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.QUARTZ_BLOCK).pattern("GGG").pattern("GGG").unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.WALL), 6).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_wall_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_window_from_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), ModBlocks.QUARTZ.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.QUARTZ_BLOCK).build())).save(pFinishedRecipeConsumer, "quartz_window_half_from_quartz_stonecutting");
    }

    private void smoothQuartzRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arch_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arch_large_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arch_half_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arch_large_half_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_arrowslit_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_balustrade_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_capital_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_corner_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_corner_slab_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_corner_slab_vertical_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_eighth_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_quarter_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_quarter_vertical_from_smooth_quartz_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.SLAB), 24).define('G', Blocks.SMOOTH_QUARTZ).pattern("GGG").unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_from_smooth_quartz_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('G', Blocks.SMOOTH_QUARTZ).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_vertical_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_slab_vertical_from_smooth_quartz_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.WALL), 6).define('G', Blocks.SMOOTH_QUARTZ).pattern("GGG").pattern("GGG").unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_wall_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.WALL), 6).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_wall_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_window_from_smooth_quartz_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), ModBlocks.SMOOTH_QUARTZ.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_smooth_quartz",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SMOOTH_QUARTZ).build())).save(pFinishedRecipeConsumer, "smooth_quartz_window_half_from_smooth_quartz_stonecutting");
    }

    private void sandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Sandstone */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE.baseBlock(), 4).define('S', ModBlocks.BROWN_SAND.get()).pattern("SS").pattern("SS").unlockedBy("has_brown_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SAND.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE.baseBlock(), 4).define('S', ModBlocks.ORANGE_SAND.get()).pattern("SS").pattern("SS").unlockedBy("has_orange_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SAND.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_from_shaped");
        /* Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arch_from_brown_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arch_from_orange_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arch_from_red_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arch_from_sandstone_arch_stonecutting");

        /* Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arch_large_from_brown_sandstone_arch_large_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arch_large_from_orange_sandstone_arch_large_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arch_large_from_red_sandstone_arch_large_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arch_large_from_sandstone_arch_large_stonecutting");

        /* Half Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arch_half_from_brown_sandstone_arch_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arch_half_from_orange_sandstone_arch_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arch_half_from_red_sandstone_arch_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arch_half_from_sandstone_arch_half_stonecutting");

        /* Half Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arch_large_half_from_brown_sandstone_arch_large_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arch_large_half_from_orange_sandstone_arch_large_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arch_large_half_from_red_sandstone_arch_large_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arch_large_half_from_sandstone_arch_large_half_stonecutting");

        /* Sandstone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_arrowslit_from_brown_sandstone_arrowslit_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_arrowslit_from_orange_sandstone_arrowslit_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_arrowslit_from_red_sandstone_arrowslit_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_arrowslit_from_sandstone_arrowslit_stonecutting");

        /* Sandstone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_balustrade_from_brown_sandstone_balustrade_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_balustrade_from_orange_sandstone_balustrade_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_balustrade_from_red_sandstone_balustrade_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_balustrade_from_sandstone_balustrade_stonecutting");

        /* Sandstone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_capital_from_brown_sandstone_capital_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_capital_from_orange_sandstone_capital_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_capital_from_red_sandstone_capital_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_capital_from_sandstone_capital_stonecutting");

        /* Sandstone Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_corner_from_brown_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_corner_from_orange_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_corner_from_red_sandstone_corner_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_corner_from_sandstone_corner_stonecutting");

        /* Sandstone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_corner_slab_from_brown_sandstone_corner_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_corner_slab_from_orange_sandstone_corner_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_corner_slab_from_red_sandstone_corner_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_corner_slab_from_sandstone_corner_slab_stonecutting");

        /* Sandstone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_corner_slab_vertical_from_brown_sandstone_corner_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_corner_slab_vertical_from_orange_sandstone_corner_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_corner_slab_vertical_from_red_sandstone_corner_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_corner_slab_vertical_from_sandstone_corner_slab_vertical_stonecutting");

        /* Sandstone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_eighth_from_brown_sandstone_eighth_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_eighth_from_orange_sandstone_eighth_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_eighth_from_red_sandstone_eighth_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_eighth_from_sandstone_eighth_stonecutting");

        /* Sandstone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_pillar_from_brown_sandstone_pillar_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_pillar_from_orange_sandstone_pillar_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_pillar_from_red_sandstone_pillar_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_pillar_from_sandstone_pillar_stonecutting");

        /* Sandstone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_quarter_from_brown_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_quarter_from_orange_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_quarter_from_red_sandstone_quarter_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_quarter_from_sandstone_quarter_stonecutting");

        /* Sandstone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_quarter_vertical_from_brown_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_quarter_vertical_from_orange_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_quarter_vertical_from_red_sandstone_quarter_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_quarter_vertical_from_sandstone_quarter_vertical_stonecutting");

        /* Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', Blocks.RED_SANDSTONE).pattern("SSS").unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_from_red_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', Blocks.SANDSTONE).pattern("SSS").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_from_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE_SLAB), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_red_sandstone_slab_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE_SLAB), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_sandstone_slab_from_sandstone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_red_sandstone_slab_from_red_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_sandstone_slab_from_sandstone_slab_vertical_stonecutting");


        /* Sandstone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('S', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('S', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('S', Blocks.RED_SANDSTONE).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_vertical_from_red_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 24).define('S', Blocks.SANDSTONE).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_vertical_from_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_vertical_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_vertical_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE_SLAB), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_red_sandstone_slab_vertical_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE_SLAB), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_sandstone_slab_vertical_from_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_vertical_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_vertical_from_sandstone_slab_stonecutting");

        /* Sandstone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('S', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('S', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_stairs_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_stairs_from_orange_sandstone_stonecutting");

        /* Sandstone Walls */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.WALL), 6).define('S', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern("SSS").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.WALL), 6).define('S', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("SSS").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_wall_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.WALL), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_wall_from_orange_sandstone_stonecutting");

        /* Sandstone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_window_from_brown_sandstone_window_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_window_from_orange_sandstone_window_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_window_from_red_sandstone_window_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_window_from_sandstone_window_stonecutting");

        /* Sandstone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_window_half_from_brown_sandstone_window_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_window_half_from_orange_sandstone_window_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_window_half_from_red_sandstone_window_half_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_window_half_from_sandstone_window_half_stonecutting");
    }

    private void chiseledSandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        cut(pFinishedRecipeConsumer, ModBlocks.CHISELED_BROWN_SANDSTONE.baseBlock(), ModBlocks.BROWN_SANDSTONE.baseBlock());
        cut(pFinishedRecipeConsumer, ModBlocks.CHISELED_ORANGE_SANDSTONE.baseBlock(), ModBlocks.ORANGE_SANDSTONE.baseBlock());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CHISELED_BROWN_SANDSTONE.baseBlock(), ModBlocks.BROWN_SANDSTONE.baseBlock());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CHISELED_ORANGE_SANDSTONE.baseBlock(), ModBlocks.ORANGE_SANDSTONE.baseBlock());
    }
    private void cutSandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Cut Sandstone */
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock(), 4).define('S', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern("SS").pattern("SS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock(), 4).define('S', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("SS").pattern("SS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_from_shaped");

        cut(pFinishedRecipeConsumer, ModBlocks.CUT_BROWN_SANDSTONE.baseBlock(), ModBlocks.BROWN_SANDSTONE.baseBlock());
        cut(pFinishedRecipeConsumer, ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock(), ModBlocks.ORANGE_SANDSTONE.baseBlock());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CUT_BROWN_SANDSTONE.baseBlock(), ModBlocks.BROWN_SANDSTONE.baseBlock());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock(), ModBlocks.ORANGE_SANDSTONE.baseBlock());

        /* Cut Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_from_sandstone_stonecutting");

        /* Large Cut Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_large_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_large_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_large_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_large_from_sandstone_stonecutting");

        /* Half Cut Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_half_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_half_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_half_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_half_from_sandstone_stonecutting");

        /* Half Large Cut Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_large_half_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_large_half_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_large_half_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_large_half_from_sandstone_stonecutting");

        /* Cut Sandstone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arrowslit_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arrowslit_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arrowslit_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arrowslit_from_sandstone_stonecutting");

        /* Cut Sandstone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_balustrade_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_balustrade_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_balustrade_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_balustrade_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_capital_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_capital_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_capital_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_capital_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_slab_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_slab_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_slab_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_slab_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_corner_slab_vertical_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_corner_slab_vertical_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_corner_slab_vertical_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_corner_slab_vertical_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_eighth_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_eighth_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_eighth_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_eighth_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_pillar_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_pillar_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_pillar_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_pillar_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_quarter_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_quarter_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_quarter_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_quarter_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_quarter_vertical_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_quarter_vertical_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_quarter_vertical_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_quarter_vertical_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_cut_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_cut_orange_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', Blocks.CUT_RED_SANDSTONE).pattern("SSS").unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_cut_red_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', Blocks.CUT_SANDSTONE).pattern("SSS").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_cut_sandstone_shaped");

        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', Blocks.RED_SANDSTONE).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_red_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', Blocks.SANDSTONE).pattern("SSS").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_cut_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE_SLAB), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_cut_red_sandstone_slab_from_cut_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE_SLAB), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_cut_sandstone_slab_from_cut_sandstone_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_cut_red_sandstone_slab_from_red_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_cut_sandstone_slab_from_sandstone_slab_vertical_stonecutting");

        /* Cut Sandstone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 6).define('S', ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_cut_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 6).define('S', ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_cut_orange_sandstone_shaped");

        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 6).define('S', ModBlocks.BROWN_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 6).define('S', ModBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_cut_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE_SLAB), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE_SLAB), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_mod_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_mod_sandstone_slab_stonecutting");

        /* Cut Sandstone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_window_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_window_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_window_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_window_from_cut_sandstone_stonecutting");

        /* Cut Sandstone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()), ModBlocks.CUT_BROWN_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_window_half_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()), ModBlocks.CUT_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CUT_ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_window_half_from_cut_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_window_half_from_cut_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CUT_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_window_half_from_cut_sandstone_stonecutting");
    }

    private void smoothSandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Smooth Sandstone */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock(), 0.1F, 200).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock(), 0.1F, 200).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_from_smelting");

        /* Smooth Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_from_smooth_sandstone_stonecutting");

        /* Large Smooth Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_large_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_large_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_large_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_large_from_smooth_sandstone_stonecutting");

        /* Half Smooth Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_half_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_half_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_half_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_half_from_smooth_sandstone_stonecutting");

        /* Half Large Smooth Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_large_half_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_large_half_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_large_half_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_large_half_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arrowslit_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arrowslit_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arrowslit_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arrowslit_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_balustrade_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_balustrade_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_balustrade_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_balustrade_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_capital_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_capital_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_capital_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_capital_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_slab_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_slab_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_slab_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_slab_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_corner_slab_vertical_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_corner_slab_vertical_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_corner_slab_vertical_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_corner_slab_vertical_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_eighth_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_eighth_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_eighth_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_eighth_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_pillar_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_pillar_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_pillar_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_pillar_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_quarter_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_quarter_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_quarter_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_quarter_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_quarter_vertical_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_quarter_vertical_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_quarter_vertical_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_quarter_vertical_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', Blocks.SMOOTH_RED_SANDSTONE).pattern("SSS").unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 24).define('S', Blocks.SMOOTH_SANDSTONE).pattern("SSS").unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 8).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_from_smooth_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE_SLAB), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE_SLAB), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "mod_smooth_sandstone_slab_from_smooth_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_smooth_brown_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_smooth_orange_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_from_smooth_red_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL)), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_from_smooth_sandstone_slab_vertical_stonecutting");

        /* Smooth Sandstone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 6).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 6).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_vertical_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_vertical_from_smooth_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_smooth_brown_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_smooth_orange_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE_SLAB), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_vertical_from_smooth_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE_SLAB), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 4).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_vertical_from_smooth_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB)), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_vertical_from_mod_smooth_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB)    ), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.SLAB_VERTICAL), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_vertical_from_mod_smooth_sandstone_slab_stonecutting");

        /* Smooth Sandstone Stairs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.STAIRS), 4).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_stairs_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.STAIRS), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_stairs_from_smooth_orange_sandstone_stonecutting");

        /* Smooth Sandstone Walls */
        //TODO: Add Smooth Sandstone Walls Recipes

        /* Smooth Sandstone Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_window_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_window_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_window_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_window_from_smooth_sandstone_stonecutting");

        /* Smooth Sandstone Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_window_half_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_window_half_from_smooth_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_window_half_from_smooth_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_window_half_from_smooth_sandstone_stonecutting");
    }




}
