package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.crafting.ModRecipeBuilder;
import com.calibermc.caliber.data.ModBlockFamily;
import com.calibermc.caliber.item.ModItems;
import com.calibermc.caliber.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.tags.ITagManager;

import java.util.function.Consumer;

import static com.calibermc.caliber.util.ModTags.Blocks.smoothStone;

public class MiscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MiscRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        craftingTableRecipes(pFinishedRecipeConsumer);
        plasterRecipes(pFinishedRecipeConsumer);
//        roofingRecipes(pFinishedRecipeConsumer);

    }


    private void craftingTableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Crafting Tables */
        ShapedRecipeBuilder.shaped(ModBlocks.WOODCUTTER.get(), 1).define('I', Items.IRON_INGOT).define('S', Blocks.SMOOTH_STONE).pattern(" I ").pattern("SSS").unlockedBy("has_iron_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_INGOT).build())).save(pFinishedRecipeConsumer, "woodcutter_from_shaped_iron_ingot_stone");
        ShapedRecipeBuilder.shaped(ModBlocks.KILN.get(), 1).define('I', Items.IRON_INGOT).define('X', Blocks.BLAST_FURNACE).define('#', Blocks.SMOOTH_STONE).pattern("III").pattern("IXI").pattern("###").unlockedBy("has_blast_furnace",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLAST_FURNACE).build())).save(pFinishedRecipeConsumer, "kiln_from_shaped_iron_ingots_blast_furnace_smooth_stone_variant");
    }

    private void plasterRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Plaster Powder */
        ShapelessRecipeBuilder.shapeless(ModBlocks.BEIGE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.WHITE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "beige_plaster_powder_from_clay_sand_brown_dye_white_dye");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE, 2).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "brown_plaster_powder_from_clay_sand_brown_dye");
        ShapelessRecipeBuilder.shapeless(ModBlocks.OCHRE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.ORANGE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "ochre_plaster_powder_from_clay_sand_brown_dye_orange_dye");
        ShapelessRecipeBuilder.shapeless(ModBlocks.TAN_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.YELLOW_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "tan_plaster_powder_from_clay_sand_brown_dye_yellow_dye");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BEIGE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.WHITE_DYE, 2).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "beige_plaster_powder_from_clay_sand_white_dye");

        /* Plaster */
        ShapelessRecipeBuilder.shapeless(ModBlocks.BEIGE_PLASTER.baseBlock(), 1).requires(ModBlocks.BEIGE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_begie_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_from_beige_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_PLASTER.baseBlock(), 1).requires(ModBlocks.BROWN_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_brown_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_from_brown_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(ModBlocks.OCHRE_PLASTER.baseBlock(), 1).requires(ModBlocks.OCHRE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_ochre_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_from_ochre_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(ModBlocks.TAN_PLASTER.baseBlock(), 1).requires(ModBlocks.TAN_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_tan_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_from_tan_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_PLASTER.baseBlock(), 1).requires(ModBlocks.WHITE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_white_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_from_white_plaster_powder_water_bucket");
        
        /* Plaster Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arch_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arch_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arch_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arch_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.ARCH), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_arch_from_white_plaster_stonecutting");

        /* Half Large Plaster Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arch_large_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arch_large_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arch_large_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arch_large_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_arch_large_from_white_plaster_stonecutting");

        /* Half Plaster Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arch_half_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arch_half_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arch_half_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arch_half_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.ARCH_HALF), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_arch_half_from_white_plaster_stonecutting");

        /* Large Plaster Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arch_large_half_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arch_large_half_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arch_large_half_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arch_large_half_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.ARCH_LARGE_HALF), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_arch_large_half_from_white_plaster_stonecutting");

        /* Plaster Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arrowslit_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arrowslit_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arrowslit_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arrowslit_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.ARROWSLIT), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_arrowslit_from_white_plaster_stonecutting");

        /* Plaster Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_balustrade_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_balustrade_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_balustrade_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_balustrade_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.BALUSTRADE), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_balustrade_from_white_plaster_stonecutting");

        /* Plaster Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_capital_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_capital_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_capital_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_capital_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.CAPITAL), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_capital_from_white_plaster_stonecutting");

        /* Plaster Corners */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_corner_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_corner_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_corner_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_corner_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.CORNER), 5).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_corner_from_white_plaster_stonecutting");

        /* Plaster Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_corner_slab_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_corner_slab_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_corner_slab_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_corner_slab_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB), 4).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_corner_slab_from_white_plaster_stonecutting");

        /* Plaster Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_corner_slab_vertical_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_corner_slab_vertical_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_corner_slab_vertical_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_corner_slab_vertical_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL), 4).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_corner_slab_vertical_from_white_plaster_stonecutting");

        /* Plaster Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_eighth_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_eighth_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_eighth_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_eighth_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.EIGHTH), 8).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_eighth_from_white_plaster_stonecutting");

        /* Plaster Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_pillar_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_pillar_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_pillar_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_pillar_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.PILLAR), 5).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_pillar_from_white_plaster_stonecutting");

        /* Plaster Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_quarter_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_quarter_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_quarter_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_quarter_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.QUARTER), 5).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_quarter_from_white_plaster_stonecutting");

        /* Plaster Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_quarter_vertical_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_quarter_vertical_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_quarter_vertical_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_quarter_vertical_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.QUARTER_VERTICAL), 5).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_quarter_vertical_from_white_plaster_stonecutting");

        /* Plaster Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_window_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_window_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_window_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_window_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.WINDOW), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_window_from_white_plaster_stonecutting");

        /* Plaster Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.baseBlock()), ModBlocks.BEIGE_PLASTER.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "beige_plaster_window_half_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.baseBlock()), ModBlocks.BROWN_PLASTER.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "brown_plaster_window_half_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.baseBlock()), ModBlocks.OCHRE_PLASTER.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_window_half_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.baseBlock()), ModBlocks.TAN_PLASTER.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_plaster_window_half_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.baseBlock()), ModBlocks.WHITE_PLASTER.get(ModBlockFamily.Variant.WINDOW_HALF), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.baseBlock()).build())).save(pFinishedRecipeConsumer, "white_plaster_window_half_from_white_plaster_stonecutting");
    }

    private void roofingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Roofing Materials */
        ShapedRecipeBuilder.shaped(ModBlocks.THATCH.baseBlock(), 9).define('#', ModItems.GRASS_STEMS.get()).define('X', Items.STICK).pattern("###").pattern("XXX").pattern("###").unlockedBy("has_grass_stems",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "thatch_from_grass_stems_and_sticks_shaped");
        ShapedRecipeBuilder.shaped(ModBlocks.THATCH.baseBlock(), 9).define('#', Items.WHEAT).define('X', Items.STICK).pattern("###").pattern("XXX").pattern("###").unlockedBy("has_grass_stems",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "thatch_from_wheat_and_sticks_shaped");
        
        
        /* Roofing 22 */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_acacia_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_shingle_roof_22_from_acacia_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_birch_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_shingle_roof_22_from_birch_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_dark_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_shingle_roof_22_from_dark_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_jungle_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_shingle_roof_22_from_jungle_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_shingle_roof_22_from_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_spruce_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_shingle_roof_22_from_spruce_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_crimson_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_shingle_roof_22_from_crimson_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_warped_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_shingle_roof_22_from_warped_shingle_woodcutting");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_stained_acacia_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_shingle_roof_22_from_stained_acacia_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_stained_birch_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_shingle_roof_22_from_stained_birch_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_stained_dark_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_shingle_roof_22_from_stained_dark_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_stained_jungle_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_shingle_roof_22_from_stained_jungle_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_stained_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_shingle_roof_22_from_stained_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_stained_spruce_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_shingle_roof_22_from_stained_spruce_shingle_woodcutting");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.THATCH.baseBlock()), ModBlocks.THATCH.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_thatch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.THATCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "thatch_roof_22_from_thatch_woodcutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.SLATE_TILE.get(ModBlockFamily.Variant.ROOF_22), 2).unlockedBy("has_slate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "slate_tile_roof_22_from_slate_tile_stonecutting");

        /* Roofing 45 */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_acacia_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_shingle_roof_45_from_acacia_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_birch_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_shingle_roof_45_from_birch_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_dark_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_shingle_roof_45_from_dark_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_jungle_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_shingle_roof_45_from_jungle_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_shingle_roof_45_from_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_spruce_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_shingle_roof_45_from_spruce_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_crimson_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_shingle_roof_45_from_crimson_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_warped_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_shingle_roof_45_from_warped_shingle_woodcutting");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_stained_acacia_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_shingle_roof_45_from_stained_acacia_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_stained_birch_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_shingle_roof_45_from_stained_birch_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_stained_dark_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_shingle_roof_45_from_stained_dark_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_stained_jungle_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_shingle_roof_45_from_stained_jungle_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_stained_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_shingle_roof_45_from_stained_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_stained_spruce_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_shingle_roof_45_from_stained_spruce_shingle_woodcutting");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.THATCH.baseBlock()), ModBlocks.THATCH.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_thatch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.THATCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "thatch_roof_45_from_thatch_woodcutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.SLATE_TILE.get(ModBlockFamily.Variant.ROOF_45), 2).unlockedBy("has_slate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "slate_tile_roof_45_from_slate_tile_stonecutting");

        /* Roofing 67 */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_acacia_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_shingle_roof_67_from_acacia_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_birch_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_shingle_roof_67_from_birch_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_dark_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_shingle_roof_67_from_dark_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_jungle_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_shingle_roof_67_from_jungle_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_shingle_roof_67_from_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_spruce_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_shingle_roof_67_from_spruce_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_crimson_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_shingle_roof_67_from_crimson_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_warped_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_shingle_roof_67_from_warped_shingle_woodcutting");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_stained_acacia_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_shingle_roof_67_from_stained_acacia_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_stained_birch_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_shingle_roof_67_from_stained_birch_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_stained_dark_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_shingle_roof_67_from_stained_dark_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_stained_jungle_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_shingle_roof_67_from_stained_jungle_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_stained_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_shingle_roof_67_from_stained_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_stained_spruce_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_shingle_roof_67_from_stained_spruce_shingle_woodcutting");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.THATCH.baseBlock()), ModBlocks.THATCH.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_thatch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.THATCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "thatch_roof_67_from_thatch_woodcutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.SLATE_TILE.get(ModBlockFamily.Variant.ROOF_67), 2).unlockedBy("has_slate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "slate_tile_roof_67_from_slate_tile_stonecutting");

        /* Roofing Peaks */
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.ACACIA_BOARDS.baseBlock()), ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_acacia_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_shingle_roof_peak_from_acacia_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.BIRCH_BOARDS.baseBlock()), ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_birch_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_shingle_roof_peak_from_birch_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.DARK_OAK_BOARDS.baseBlock()), ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_dark_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_shingle_roof_peak_from_dark_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.JUNGLE_BOARDS.baseBlock()), ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_jungle_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_shingle_roof_peak_from_jungle_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.OAK_BOARDS.baseBlock()), ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_shingle_roof_peak_from_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.SPRUCE_BOARDS.baseBlock()), ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_spruce_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_shingle_roof_peak_from_spruce_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.CRIMSON_BOARDS.baseBlock()), ModBlocks.CRIMSON_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_crimson_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_shingle_roof_peak_from_crimson_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.WARPED_BOARDS.baseBlock()), ModBlocks.WARPED_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_warped_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_shingle_roof_peak_from_warped_shingle_woodcutting");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()), ModBlocks.STAINED_ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_stained_acacia_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_shingle_roof_peak_from_stained_acacia_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()), ModBlocks.STAINED_BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_stained_birch_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_shingle_roof_peak_from_stained_birch_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_stained_dark_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_shingle_roof_peak_from_stained_dark_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), ModBlocks.STAINED_JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_stained_jungle_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_shingle_roof_peak_from_stained_jungle_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()), ModBlocks.STAINED_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_stained_oak_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_shingle_roof_peak_from_stained_oak_shingle_woodcutting");
        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), ModBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_stained_spruce_shingles",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_shingle_roof_peak_from_stained_spruce_shingle_woodcutting");

        ModRecipeBuilder.woodcutting(Ingredient.of(ModBlocks.THATCH.baseBlock()), ModBlocks.THATCH.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_thatch",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.THATCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "thatch_roof_peak_from_thatch_woodcutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES), ModBlocks.SLATE_TILE.get(ModBlockFamily.Variant.ROOF_PEAK), 2).unlockedBy("has_slate_tile",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DEEPSLATE_TILES).build())).save(pFinishedRecipeConsumer, "slate_tile_roof_peak_from_slate_tile_stonecutting");
        }

}
