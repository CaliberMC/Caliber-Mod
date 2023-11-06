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

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        /* METAL BLOCKS/ITEMS */
        ShapedRecipeBuilder.shaped(ModBlocks.TIN_BLOCK.get(), 1).define('T', ModItems.TIN_INGOT.get()).pattern("TTT").pattern("TTT").pattern("TTT").unlockedBy("has_tin_ore",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "tin_block_from_shaped_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.TIN_INGOT.get(), 9).requires(ModBlocks.TIN_ORE.get()).unlockedBy("has_tin_ore",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_tin_block");
        ShapedRecipeBuilder.shaped(ModItems.TIN_INGOT.get(), 1).define('T', ModItems.TIN_NUGGET.get()).pattern("TTT").pattern("TTT").pattern("TTT").unlockedBy("has_tin_nugget",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TIN_NUGGET.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_shaped_nuggets");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TIN_ORE.get()), ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_smelting_tin_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_smelting_deeplate_tin_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_TIN.get()), ModItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_nugget_from_smelting_raw_tin");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.TIN_ORE.get()), ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_blasting_tin_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_blasting_deeplate_tin_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_TIN.get()), ModItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_nugget_from_blasting_raw_tin");

        ShapedRecipeBuilder.shaped(ModBlocks.SILVER_BLOCK.get(), 1).define('S', ModItems.SILVER_INGOT.get()).pattern("SSS").pattern("SSS").pattern("SSS").unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_block_from_shaped_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.SILVER_INGOT.get(), 9).requires(ModBlocks.SILVER_BLOCK.get()).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_silver_block");
        ShapedRecipeBuilder.shaped(ModItems.SILVER_INGOT.get(), 1).define('S', ModItems.SILVER_NUGGET.get()).pattern("SSS").pattern("SSS").pattern("SSS").unlockedBy("has_silver_nugget",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_shaped_nuggets");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.SILVER_ORE.get()), ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_smelting_silver_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_SILVER_ORE.get()), ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_smelting_deeplate_silver_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_SILVER.get()), ModItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_nugget_from_smelting_raw_silver");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.SILVER_ORE.get()), ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_blasting_silver_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_SILVER_ORE.get()), ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_blasting_deeplate_silver_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_SILVER.get()), ModItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_nugget_from_blasting_raw_silver");

        
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

        /* Granite Arrow Slits */

        
        /* Granite Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE_SLAB.get(), 6).define('G', ModBlocks.BLACK_GRANITE.get()).pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE_SLAB.get(), 6).define('G', ModBlocks.BROWN_GRANITE.get()).pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE_SLAB.get(), 6).define('G', ModBlocks.GRAY_GRANITE.get()).pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE_SLAB.get(), 6).define('G', ModBlocks.PINK_GRANITE.get()).pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE_SLAB.get(), 6).define('G', ModBlocks.WHITE_GRANITE.get()).pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_SLAB.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_SLAB.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_SLAB.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_SLAB.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_SLAB.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get()), ModBlocks.BLACK_GRANITE_SLAB.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_from_black_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE_SLAB_VERTICAL.get()), ModBlocks.BROWN_GRANITE_SLAB.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_from_brown_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE_SLAB_VERTICAL.get()), ModBlocks.GRAY_GRANITE_SLAB.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_from_gray_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE_SLAB_VERTICAL.get()), ModBlocks.PINK_GRANITE_SLAB.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_from_pink_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_GRANITE_SLAB_VERTICAL.get()), Blocks.GRANITE_SLAB, 1).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_from_red_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE_SLAB_VERTICAL.get()), ModBlocks.WHITE_GRANITE_SLAB.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_from_white_granite_slab_vertical_stonecutting");


        /* Granite Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.BLACK_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.BROWN_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.GRAY_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.PINK_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.WHITE_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_shaped");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.BROWN_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.GRAY_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.PINK_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.RED_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_vertical_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.WHITE_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE_SLAB.get()), ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "black_granite_slab_vertical_from_black_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE_SLAB.get()), ModBlocks.BROWN_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "brown_granite_slab_vertical_from_brown_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE_SLAB.get()), ModBlocks.GRAY_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "gray_granite_slab_vertical_from_gray_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE_SLAB.get()), ModBlocks.PINK_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "pink_granite_slab_vertical_from_pink_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE_SLAB), ModBlocks.RED_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "red_granite_slab_vertical_from_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE_SLAB.get()), ModBlocks.WHITE_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "white_granite_slab_vertical_from_white_granite_slab_stonecutting");
        
        
        // -- GRANITE STAIRS
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

        // -- GRANITE WALL
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
        
        /* Polished Granite Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), 6).define('G', ModBlocks.POLISHED_BLACK_GRANITE.get()).pattern("GGG").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), 6).define('G', ModBlocks.POLISHED_BROWN_GRANITE.get()).pattern("GGG").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), 6).define('G', ModBlocks.POLISHED_GRAY_GRANITE.get()).pattern("GGG").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), 6).define('G', ModBlocks.POLISHED_PINK_GRANITE.get()).pattern("GGG").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), 6).define('G', ModBlocks.POLISHED_WHITE_GRANITE.get()).pattern("GGG").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_from_polished_black_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_from_polished_brown_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_from_polished_gray_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_from_polished_pink_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get()), Blocks.POLISHED_GRANITE_SLAB, 1).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_granite_slab_from_polished_red_granite_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get(), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_from_polished_white_granite_slab_vertical_stonecutting");

        /* Polished Granite Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.POLISHED_BLACK_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.POLISHED_BROWN_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.POLISHED_GRAY_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.POLISHED_PINK_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 6).define('G', Blocks.POLISHED_GRANITE).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get(), 6).define('G', ModBlocks.POLISHED_WHITE_GRANITE.get()).pattern(" G ").pattern(" G ").pattern(" G ").unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_polished_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_polished_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_polished_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_polished_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_polished_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_polished_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_GRANITE.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_black_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_GRANITE.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_brown_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_GRANITE.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_gray_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_GRANITE.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_pink_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_GRANITE.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get(), 2).unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_white_granite_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_GRANITE_SLAB.get()), ModBlocks.POLISHED_BLACK_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BLACK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_slab_vertical_from_polished_black_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BROWN_GRANITE_SLAB.get()), ModBlocks.POLISHED_BROWN_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_BROWN_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_slab_vertical_from_polished_brown_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_GRANITE_SLAB.get()), ModBlocks.POLISHED_GRAY_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_GRAY_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_slab_vertical_from_polished_gray_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_GRANITE_SLAB.get()), ModBlocks.POLISHED_PINK_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_PINK_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_slab_vertical_from_polished_pink_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE_SLAB), ModBlocks.POLISHED_RED_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.POLISHED_GRANITE).build())).save(pFinishedRecipeConsumer, "polished_red_granite_slab_vertical_from_polished_granite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_GRANITE_SLAB.get()), ModBlocks.POLISHED_WHITE_GRANITE_SLAB_VERTICAL.get(), 1).unlockedBy("has_polished_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.POLISHED_WHITE_GRANITE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_slab_vertical_from_polished_white_granite_slab_stonecutting");
        
        
        // -- POLISHED GRANITE STAIRS
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

        // -- POLISHED GRANITE WALL
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

        // -- LIMESTONE
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

        // -- LIMESTONE BUTTON
        ShapelessRecipeBuilder.shapeless(ModBlocks.DARK_LIMESTONE_BUTTON.get()).requires(ModBlocks.DARK_LIMESTONE.get()).unlockedBy("has_dark_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_LIMESTONE_BUTTON.get()).requires(ModBlocks.LIGHT_LIMESTONE.get()).unlockedBy("has_light_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LIMESTONE_BUTTON.get()).requires(ModBlocks.PINK_LIMESTONE.get()).unlockedBy("has_pink_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(ModBlocks.TAN_LIMESTONE_BUTTON.get()).requires(ModBlocks.TAN_LIMESTONE.get()).unlockedBy("has_tan_limestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_button_from_shapeless");

        // -- LIMESTONE PRESSURE PLATE
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_PRESSURE_PLATE.get(), 1).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern("LL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_PRESSURE_PLATE.get(), 1).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern("LL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_PRESSURE_PLATE.get(), 1).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern("LL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_pressure_plate_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_PRESSURE_PLATE.get(), 1).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern("LL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_pressure_plate_from_shaped");

        /* Limestone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_SLAB.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_SLAB.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_SLAB.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_SLAB.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_from_tan_limestone_stonecutting");

        /* Limestone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.DARK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.LIGHT_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', Blocks.STONE).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.PINK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.TAN_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_slab_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_slab_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "limestone_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_slab_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_slab_vertical_from_tan_limestone_stonecutting");

        // -- LIMESTONE STAIRS
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

        /* LIMESTONE BRICK BLOCKS */
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

        // -- LIMESTONE BRICK SLAB
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), 6).define('L', ModBlocks.DARK_LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), 6).define('L', ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), 6).define('L', ModBlocks.PINK_LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), 6).define('L', ModBlocks.TAN_LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_from_dark_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_from_light_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get()), Blocks.STONE_BRICK_SLAB, 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_from_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_from_pink_limestone_brick_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_from_tan_limestone_brick_slab_vertical_stonecutting");
        

        /* Limestone Brick Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.DARK_LIMESTONE_BRICKS.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 6).define('L', Blocks.STONE_BRICKS).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.PINK_LIMESTONE_BRICKS.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.TAN_LIMESTONE_BRICKS.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS), ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICK_SLAB.get()), ModBlocks.DARK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_dark_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "dark_limestone_brick_slab_vertical_from_dark_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB.get()), ModBlocks.LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_light_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "light_limestone_brick_slab_vertical_from_light_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_SLAB), ModBlocks.LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE_BRICKS).build())).save(pFinishedRecipeConsumer, "limestone_brick_slab_vertical_from_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICK_SLAB.get()), ModBlocks.PINK_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "pink_limestone_brick_slab_vertical_from_pink_limestone_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICK_SLAB.get()), ModBlocks.TAN_LIMESTONE_BRICK_SLAB_VERTICAL.get(), 2).unlockedBy("has_tan_limestone_bricks",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "tan_limestone_brick_slab_vertical_from_tan_limestone_brick_slab_stonecutting");

        // -- LIMESTONE BRICK STAIRS
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

        // -- LIMESTONE BRICK WALL
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
        
        /* Cobbled Limestone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.get()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_cobbled_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_from_cobbled_dark_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_from_cobbled_light_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get()), Blocks.COBBLESTONE_SLAB, 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_from_cobbled_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_from_cobbled_pink_limestone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB_VERTICAL.get()), ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_from_cobbled_tan_limestone_slab_vertical_stonecutting");

        /* Cobbled Limestone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.COBBLED_DARK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.COBBLED_LIGHT_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.COBBLED_PINK_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB_VERTICAL.get(), 6).define('L', ModBlocks.COBBLED_TAN_LIMESTONE.get()).pattern(" L ").pattern(" L ").pattern(" L ").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE.get()), ModBlocks.COBBLED_DARK_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_cobbled_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_cobbled_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE), ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_cobbled_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE.get()), ModBlocks.COBBLED_PINK_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_cobbled_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE.get()), ModBlocks.COBBLED_TAN_LIMESTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_cobbled_tan_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_DARK_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_DARK_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_dark_limestone_slab_vertical_from_cobbled_dark_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_light_limestone_slab_vertical_from_cobbled_light_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE_SLAB), ModBlocks.COBBLED_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build())).save(pFinishedRecipeConsumer, "cobbled_limestone_slab_vertical_from_cobbled_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_PINK_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_PINK_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_pink_limestone_slab_vertical_from_cobbled_pink_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.COBBLED_TAN_LIMESTONE_SLAB.get()), ModBlocks.COBBLED_TAN_LIMESTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "cobbled_tan_limestone_slab_vertical_from_cobbled_tan_limestone_slab_stonecutting");
        
        // -- COBBLED LIMESTONE STAIRS
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

        // -- COBBLED LIMESTONE WALL
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

        // -- CHISELED LIMESTONE
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.CHISELED_DARK_LIMESTONE_BRICKS.get()).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "chiseled_dark_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.get()).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "chiseled_light_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.CHISELED_PINK_LIMESTONE_BRICKS.get()).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "chiseled_pink_limestone_bricks_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.CHISELED_TAN_LIMESTONE_BRICKS.get()).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "chiseled_tan_limestone_bricks_from_stonecutting");

        // -- CRACKED LIMESTONE BRICKS
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DARK_LIMESTONE_BRICKS.get()), ModBlocks.CRACKED_DARK_LIMESTONE_BRICKS.get(), 0.1F, 200).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "cracked_dark_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE_BRICKS.get()), ModBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.get(), 0.1F, 200).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "cracked_light_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.PINK_LIMESTONE_BRICKS.get()), ModBlocks.CRACKED_PINK_LIMESTONE_BRICKS.get(), 0.1F, 200).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "cracked_pink_limestone_bricks_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TAN_LIMESTONE_BRICKS.get()), ModBlocks.CRACKED_TAN_LIMESTONE_BRICKS.get(), 0.1F, 200).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer, "cracked_tan_limestone_bricks_from_smelting");

        // -- SMOOTH LIMESTONE
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE.get(), 0.1F, 200).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_from_smelting");

        // -- SMOOTH LIMESTONE SLAB
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.SMOOTH_DARK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()).pattern("LLL").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.SMOOTH_PINK_LIMESTONE.get()).pattern("LLL").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB.get(), 6).define('L', ModBlocks.SMOOTH_TAN_LIMESTONE.get()).pattern("LLL").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_DARK_LIMESTONE.get()), ModBlocks.SMOOTH_DARK_LIMESTONE_SLAB.get(), 2).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_dark_limestone_slab_from_smooth_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_LIGHT_LIMESTONE.get()), ModBlocks.SMOOTH_LIGHT_LIMESTONE_SLAB.get(), 2).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_light_limestone_slab_from_smooth_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_PINK_LIMESTONE.get()), ModBlocks.SMOOTH_PINK_LIMESTONE_SLAB.get(), 2).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_pink_limestone_slab_from_smooth_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_TAN_LIMESTONE.get()), ModBlocks.SMOOTH_TAN_LIMESTONE_SLAB.get(), 2).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_LIMESTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_tan_limestone_slab_from_smooth_tan_limestone_stonecutting");

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
        
        
        /* Marble Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE_SLAB.get(), 6).define('M', ModBlocks.BLACK_MARBLE.get()).pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE_SLAB.get(), 6).define('M', ModBlocks.GRAY_MARBLE.get()).pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE_SLAB.get(), 6).define('M', ModBlocks.PINK_MARBLE.get()).pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE_SLAB.get(), 6).define('M', ModBlocks.RED_MARBLE.get()).pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE_SLAB.get(), 6).define('M', ModBlocks.WHITE_MARBLE.get()).pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_SLAB.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_SLAB.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_SLAB.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_SLAB.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_SLAB.get(), 2).unlockedBy("has_white_marble",
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
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.BLACK_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.GRAY_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.PINK_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.RED_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.RED_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.WHITE_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "white_marble_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_MARBLE.get()), ModBlocks.BLACK_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "black_marble_slab_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRAY_MARBLE.get()), ModBlocks.GRAY_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "gray_marble_slab_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PINK_MARBLE.get()), ModBlocks.PINK_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "pink_marble_slab_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_MARBLE.get()), ModBlocks.RED_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "red_marble_slab_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_MARBLE.get()), ModBlocks.WHITE_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_white_marble",
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
        
        /* POLISHED MARBLE BLOCKS */
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
        
        /* Polished Marble Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), 6).define('M', ModBlocks.POLISHED_BLACK_MARBLE.get()).pattern("MMM").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), 6).define('M', ModBlocks.POLISHED_GRAY_MARBLE.get()).pattern("MMM").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), 6).define('M', ModBlocks.POLISHED_PINK_MARBLE.get()).pattern("MMM").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), 6).define('M', ModBlocks.POLISHED_RED_MARBLE.get()).pattern("MMM").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), 6).define('M', ModBlocks.POLISHED_WHITE_MARBLE.get()).pattern("MMM").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.BLACK_MARBLE.get())), ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.GRAY_MARBLE.get())), ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.PINK_MARBLE.get())), ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.RED_MARBLE.get())), ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.WHITE_MARBLE.get())), ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_from_polished_black_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_from_polished_gray_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_PINK_MARBLE_SLAB.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_from_polished_pink_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_RED_MARBLE_SLAB.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_from_polished_red_marble_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get())), ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_from_polished_white_marble_slab_vertical_stonecutting");

        /* Polished Marble Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.POLISHED_BLACK_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.POLISHED_GRAY_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.POLISHED_PINK_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.POLISHED_RED_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get(), 6).define('M', ModBlocks.POLISHED_WHITE_MARBLE.get()).pattern(" M ").pattern(" M ").pattern(" M ").unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE.get()), ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_polished_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE.get()), ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_polished_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE.get()), ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_polished_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_RED_MARBLE.get()), ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_polished_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE.get()), ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_polished_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.BLACK_MARBLE.get())), ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_black_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.GRAY_MARBLE.get())), ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_gray_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.PINK_MARBLE.get())), ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_pink_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.RED_MARBLE.get())), ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_red_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.WHITE_MARBLE.get())), ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_white_marble_stonecutting");

        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_BLACK_MARBLE_SLAB.get())), ModBlocks.POLISHED_BLACK_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_black_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_black_marble_slab_vertical_from_polished_black_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_GRAY_MARBLE_SLAB.get())), ModBlocks.POLISHED_GRAY_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_gray_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_gray_marble_slab_vertical_from_polished_gray_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_PINK_MARBLE_SLAB.get())), ModBlocks.POLISHED_PINK_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_pink_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_pink_marble_slab_vertical_from_polished_pink_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_RED_MARBLE_SLAB.get())), ModBlocks.POLISHED_RED_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_red_marble_slab_vertical_from_polished_red_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting((Ingredient.of(ModBlocks.POLISHED_WHITE_MARBLE_SLAB.get())), ModBlocks.POLISHED_WHITE_MARBLE_SLAB_VERTICAL.get(), 2).unlockedBy("has_white_marble",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_MARBLE.get()).build())).save(pFinishedRecipeConsumer, "polished_white_marble_slab_vertical_from_polished_white_marble_slab_stonecutting");

        // -- POLISHED MARBLE STAIRS
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

        // -- POLISHED MARBLE WALL
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

        // -- SANDSTONE
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE.get(), 4).define('S', ModBlocks.BROWN_SAND.get()).pattern("SS").pattern("SS").unlockedBy("has_brown_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SAND.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE.get(), 4).define('S', ModBlocks.ORANGE_SAND.get()).pattern("SS").pattern("SS").unlockedBy("has_orange_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SAND.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_from_shaped");

        /* SANDSTONE BLOCKS */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_shaped");
        
        /* Sandstone Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_ARCH.get()), ModBlocks.BROWN_SANDSTONE_SLAB.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_ARCH.get()), ModBlocks.ORANGE_SANDSTONE_SLAB.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE_ARCH.get()), Blocks.RED_SANDSTONE_SLAB, 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_from_red_sandstone_arch_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_ARCH.get()), Blocks.SANDSTONE_SLAB, 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_from_sandstone_arch_stonecutting");

        /* Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_shaped");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_SLAB.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_SLAB.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.BROWN_SANDSTONE_SLAB.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_from_brown_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.ORANGE_SANDSTONE_SLAB.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_from_orange_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get()), Blocks.RED_SANDSTONE_SLAB, 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_from_red_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SLAB_VERTICAL.get()), Blocks.SANDSTONE_SLAB, 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_from_sandstone_slab_vertical_stonecutting");

        /* Sandstone Vertical Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_vertical_from_red_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_vertical_from_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_SLAB.get()), ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_slab_vertical_from_brown_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_SLAB.get()), ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_slab_vertical_from_orange_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE_SLAB), ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "red_sandstone_slab_vertical_from_red_sandstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE_SLAB), ModBlocks.SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "sandstone_slab_vertical_from_sandstone_slab_stonecutting");

        // -- SANDSTONE STAIRS
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_STAIRS.get(), 4).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_STAIRS.get(), 4).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_STAIRS.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_stairs_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_STAIRS.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_stairs_from_orange_sandstone_stonecutting");

        // -- SANDSTONE WALL
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_SANDSTONE_WALL.get(), 6).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_wall_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_SANDSTONE_WALL.get(), 6).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_wall_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.BROWN_SANDSTONE_WALL.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_wall_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.ORANGE_SANDSTONE_WALL.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_wall_from_orange_sandstone_stonecutting");

        /* CUT SANDSTONE BLOCKS */
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE.get(), 4).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SS").pattern("SS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE.get(), 4).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SS").pattern("SS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_from_shaped");

        cut(pFinishedRecipeConsumer, ModBlocks.CUT_BROWN_SANDSTONE.get(), ModBlocks.BROWN_SANDSTONE.get());
        cut(pFinishedRecipeConsumer, ModBlocks.CUT_ORANGE_SANDSTONE.get(), ModBlocks.ORANGE_SANDSTONE.get());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CUT_BROWN_SANDSTONE.get(), ModBlocks.BROWN_SANDSTONE.get());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CUT_ORANGE_SANDSTONE.get(), ModBlocks.ORANGE_SANDSTONE.get());

        /* Cut Sandstone Arches */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_ARCH.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_arch_from_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_ARCH.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_arch_from_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_ARCH.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_arch_from_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_ARCH.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_arch_from_sandstone_stonecutting");

        /* Cut Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.CUT_BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_cut_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.CUT_ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_cut_orange_sandstone_shaped");

        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_cut_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_cut_orange_sandstone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_from_brown_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_from_orange_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RED_SANDSTONE_SLAB_VERTICAL.get()), Blocks.CUT_RED_SANDSTONE_SLAB, 1).unlockedBy("has_red_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_from_red_sandstone_slab_vertical_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SLAB_VERTICAL.get()), Blocks.CUT_SANDSTONE_SLAB, 1).unlockedBy("has_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_from_sandstone_slab_vertical_stonecutting");

        /* Cut Sandstone Vertical Slabs */
//        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.CUT_BROWN_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_cut_brown_sandstone_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.CUT_ORANGE_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_cut_orange_sandstone_shaped");
//
//        ShapedRecipeBuilder.shaped(ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_shaped");
//
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_cut_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_cut_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_cut_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE), ModBlocks.CUT_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_cut_sandstone_stonecutting");
//
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE), ModBlocks.CUT_RED_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE), ModBlocks.CUT_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_sandstone_stonecutting");
//
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_SANDSTONE_SLAB.get()), ModBlocks.CUT_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_slab_vertical_from_brown_sandstone_slab_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE_SLAB.get()), ModBlocks.CUT_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 1).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_slab_vertical_from_orange_sandstone_slab_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_SANDSTONE_SLAB), Blocks.CUT_RED_SANDSTONE_SLAB_VERTICAL, 1).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_red_sandstone_slab_vertical_from_red_sandstone_slab_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE_SLAB), Blocks.CUT_SANDSTONE_SLAB_VERTICAL, 1).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "cut_sandstone_slab_vertical_from_sandstone_slab_stonecutting");


        // -- CHISELED SANDSTONE
        cut(pFinishedRecipeConsumer, ModBlocks.CHISELED_BROWN_SANDSTONE.get(), ModBlocks.BROWN_SANDSTONE.get());
        cut(pFinishedRecipeConsumer, ModBlocks.CHISELED_ORANGE_SANDSTONE.get(), ModBlocks.ORANGE_SANDSTONE.get());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CHISELED_BROWN_SANDSTONE.get(), ModBlocks.BROWN_SANDSTONE.get());
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CHISELED_ORANGE_SANDSTONE.get(), ModBlocks.ORANGE_SANDSTONE.get());

        // -- SMOOTH SANDSTONE
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE.get(), 0.1F, 200).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE.get(), 0.1F, 200).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_from_smelting");

        /* Smooth Sandstone Arches */
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_ARCH.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_arch_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_ARCH.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_arch_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_ARCH.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_arch_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_ARCH.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_arch_from_smooth_sandstone_stonecutting");
        
        /* Smooth Sandstone Slabs */
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.get()).pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get(), 6).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()).pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get(), 2).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get(), 2).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_smooth_orange_sandstone_stonecutting");

//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_from_smooth_brown_sandstone_slab_vertical_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_from_smooth_orange_sandstone_slab_vertical_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE_SLAB_VERTICAL), Blocks.SMOOTH_RED_SANDSTONE_SLAB, 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_from_smooth_red_sandstone_slab_vertical_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE_SLAB_VERTICAL), Blocks.SMOOTH_SANDSTONE_SLAB, 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_from_smooth_sandstone_slab_vertical_stonecutting");

        /* Smooth Sandstone Vertical Slabs */
//        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_shaped");
//        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 6).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()).pattern(" S ").pattern(" S ").pattern(" S ").unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_shaped");
//
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_smooth_brown_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_smooth_orange_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), ModBlocks.SMOOTH_RED_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_vertical_from_smooth_red_sandstone_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), ModBlocks.SMOOTH_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_vertical_from_smooth_sandstone_stonecutting");
//
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_brown_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_slab_vertical_from_smooth_brown_sandstone_slab_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_orange_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_slab_vertical_from_smooth_orange_sandstone_slab_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE_SLAB), ModBlocks.SMOOTH_RED_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_red_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.RED_SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_red_sandstone_slab_vertical_from_smooth_red_sandstone_slab_stonecutting");
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE_SLAB), ModBlocks.SMOOTH_SANDSTONE_SLAB_VERTICAL.get(), 2).unlockedBy("has_sandstone",
//                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SANDSTONE).build())).save(pFinishedRecipeConsumer, "smooth_sandstone_slab_vertical_from_smooth_sandstone_slab_stonecutting");
        
        // -- SMOOTH SANDSTONE STAIRS
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_BROWN_SANDSTONE_STAIRS.get(), 4).define('S', ModBlocks.SMOOTH_BROWN_SANDSTONE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_stairs_from_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.SMOOTH_ORANGE_SANDSTONE_STAIRS.get(), 4).define('S', ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_stairs_from_shaped");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_BROWN_SANDSTONE.get()), ModBlocks.SMOOTH_BROWN_SANDSTONE_STAIRS.get(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_brown_sandstone_stairs_from_smooth_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SMOOTH_ORANGE_SANDSTONE.get()), ModBlocks.SMOOTH_ORANGE_SANDSTONE_STAIRS.get(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_SANDSTONE.get()).build())).save(pFinishedRecipeConsumer, "smooth_orange_sandstone_stairs_from_smooth_orange_sandstone_stonecutting");


    }

}
