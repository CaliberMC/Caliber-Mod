package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class VanillaCustomRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public VanillaCustomRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        
        /* DEEPSLATE BLOCKS */
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

        /* DEEPSLATE BRICK BLOCKS */
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICK_SLAB), ModBlocks.DEEPSLATE_BRICK_SLAB.get(), 1).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_deepslate_brick_slab_from_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get()), ModBlocks.DEEPSLATE_BRICK_SLAB.get(), 1).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "mod_deepslate_brick_slab_from_deepslate_brick_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get(), 24).define('G', Blocks.DEEPSLATE_BRICKS).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get(), 8).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICK_SLAB), ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_BRICK_SLAB.get()), ModBlocks.DEEPSLATE_BRICK_SLAB_VERTICAL.get(), 1).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_slab_vertical_from_mod_deepslate_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_WINDOW.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_window_from_deepslate_brick_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS), ModBlocks.DEEPSLATE_BRICK_WINDOW_HALF.get(), 2).unlockedBy("has_deepslate_brick",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_BRICKS).build())).save(pFinishedRecipeConsumer, "deepslate_brick_window_half_from_deepslate_brick_stonecutting");

        /* DEEPSLATE TILE BLOCKS */
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILE_SLAB), ModBlocks.DEEPSLATE_TILE_SLAB.get(), 1).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "mod_deepslate_tile_slab_from_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get()), ModBlocks.DEEPSLATE_TILE_SLAB.get(), 1).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "mod_deepslate_tile_slab_from_deepslate_tile_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get(), 24).define('G', Blocks.DEEPSLATE_TILES).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get(), 8).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILE_SLAB), ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get(), 1).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_TILE_SLAB.get()), ModBlocks.DEEPSLATE_TILE_SLAB_VERTICAL.get(), 1).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_slab_vertical_from_mod_deepslate_tile_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_WINDOW.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_window_from_deepslate_tile_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.DEEPSLATE_TILE_WINDOW_HALF.get(), 2).unlockedBy("has_deepslate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "deepslate_tile_window_half_from_deepslate_tile_stonecutting");

        /* COBBLED DEEPSLATE BLOCKS */
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE_SLAB), ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), 1).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_deepslate_slab_from_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), 1).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_cobbled_deepslate_slab_from_cobbled_deepslate_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get(), 24).define('G', Blocks.COBBLED_DEEPSLATE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get(), 8).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE_SLAB), ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get(), 1).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DEEPSLATE_SLAB.get()), ModBlocks.COBBLED_DEEPSLATE_SLAB_VERTICAL.get(), 1).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_slab_vertical_from_mod_cobbled_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_WINDOW.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_window_from_cobbled_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), ModBlocks.COBBLED_DEEPSLATE_WINDOW_HALF.get(), 2).unlockedBy("has_cobbled_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.COBBLED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "cobbled_deepslate_window_half_from_cobbled_deepslate_stonecutting");

        /* COBBLED DEEPSLATE BLOCKS */
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE_SLAB), ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), 1).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_polished_deepslate_slab_from_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), 1).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "mod_polished_deepslate_slab_from_polished_deepslate_slab_vertical_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get(), 24).define('G', Blocks.POLISHED_DEEPSLATE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_shaped");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get(), 8).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE_SLAB), ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_DEEPSLATE_SLAB.get()), ModBlocks.POLISHED_DEEPSLATE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_slab_vertical_from_mod_polished_deepslate_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_WINDOW.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_window_from_polished_deepslate_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DEEPSLATE), ModBlocks.POLISHED_DEEPSLATE_WINDOW_HALF.get(), 2).unlockedBy("has_polished_deepslate",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_DEEPSLATE).build())).save(pFinishedRecipeConsumer, "polished_deepslate_window_half_from_polished_deepslate_stonecutting");
    }
}
