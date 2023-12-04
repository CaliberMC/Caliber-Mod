package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
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
//        Ingredient smoothStoneIngredient = Ingredient.of(ModTags.Blocks.smoothStone);

        /* CRAFTING */
        /* Crafting Tables */
        ShapedRecipeBuilder.shaped(ModBlocks.WOODCUTTER.get(), 1).define('I', Items.IRON_INGOT).define('S', Blocks.STONE).pattern(" I ").pattern("SSS").unlockedBy("has_iron_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_INGOT).build())).save(pFinishedRecipeConsumer, "woodcutter_from_shaped_iron_ingot_stone");
        ShapedRecipeBuilder.shaped(ModBlocks.KILN.get(), 1).define('I', Items.IRON_INGOT).define('X', Blocks.BLAST_FURNACE).define('#', Blocks.SMOOTH_STONE).pattern("III").pattern("IXI").pattern("###").unlockedBy("has_blast_furnace",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLAST_FURNACE).build())).save(pFinishedRecipeConsumer, "kiln_from_shaped_iron_ingots_blast_furnace_smooth_stone_variant");

        /* PLASTER */
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
        ShapelessRecipeBuilder.shapeless(ModBlocks.BEIGE_PLASTER.get(), 1).requires(ModBlocks.BEIGE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_begie_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_from_beige_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_PLASTER.get(), 1).requires(ModBlocks.BROWN_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_brown_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_from_brown_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(ModBlocks.OCHRE_PLASTER.get(), 1).requires(ModBlocks.OCHRE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_ochre_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_from_ochre_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(ModBlocks.TAN_PLASTER.get(), 1).requires(ModBlocks.TAN_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_tan_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_from_tan_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_PLASTER.get(), 1).requires(ModBlocks.WHITE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_white_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_from_white_plaster_powder_water_bucket");
        
        /* Plaster Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_ARCH.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arch_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_ARCH.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arch_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_ARCH.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arch_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_ARCH.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arch_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_ARCH.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_arch_from_white_plaster_stonecutting");

        /* Half Large Plaster Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_ARCH_LARGE.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arch_large_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_ARCH_LARGE.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arch_large_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_ARCH_LARGE.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arch_large_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_ARCH_LARGE.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arch_large_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_ARCH_LARGE.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_arch_large_from_white_plaster_stonecutting");

        /* Half Plaster Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_ARCH_HALF.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arch_half_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_ARCH_HALF.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arch_half_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_ARCH_HALF.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arch_half_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_ARCH_HALF.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arch_half_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_ARCH_HALF.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_arch_half_from_white_plaster_stonecutting");

        /* Large Plaster Arches */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arch_large_half_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arch_large_half_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arch_large_half_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arch_large_half_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_ARCH_LARGE_HALF.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_arch_large_half_from_white_plaster_stonecutting");

        /* Plaster Arrowslits */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_ARROWSLIT.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_arrowslit_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_ARROWSLIT.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_arrowslit_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_ARROWSLIT.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_arrowslit_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_ARROWSLIT.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_arrowslit_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_ARROWSLIT.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_arrowslit_from_white_plaster_stonecutting");

        /* Plaster Balustrades */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_BALUSTRADE.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_balustrade_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_BALUSTRADE.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_balustrade_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_BALUSTRADE.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_balustrade_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_BALUSTRADE.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_balustrade_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_BALUSTRADE.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_balustrade_from_white_plaster_stonecutting");

        /* Plaster Capitals */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_CAPITAL.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_capital_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_CAPITAL.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_capital_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_CAPITAL.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_capital_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_CAPITAL.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_capital_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_CAPITAL.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_capital_from_white_plaster_stonecutting");

        /* Plaster Corners */
        // TODO: ADD SHAPED RECIPE FOR CORNERS
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_CORNER.get(), 5).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_corner_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_CORNER.get(), 5).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_corner_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_CORNER.get(), 5).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_corner_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_CORNER.get(), 5).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_corner_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_CORNER.get(), 5).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_corner_from_white_plaster_stonecutting");

        /* Plaster Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_CORNER_SLAB.get(), 4).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_corner_slab_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_CORNER_SLAB.get(), 4).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_corner_slab_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_CORNER_SLAB.get(), 4).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_corner_slab_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_CORNER_SLAB.get(), 4).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_corner_slab_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_CORNER_SLAB.get(), 4).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_corner_slab_from_white_plaster_stonecutting");

        /* Plaster Vertical Corner Slabs */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_corner_slab_vertical_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_corner_slab_vertical_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_corner_slab_vertical_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_corner_slab_vertical_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_CORNER_SLAB_VERTICAL.get(), 4).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_corner_slab_vertical_from_white_plaster_stonecutting");

        /* Plaster Eighths */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_EIGHTH.get(), 8).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_eighth_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_EIGHTH.get(), 8).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_eighth_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_EIGHTH.get(), 8).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_eighth_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_EIGHTH.get(), 8).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_eighth_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_EIGHTH.get(), 8).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_eighth_from_white_plaster_stonecutting");

        /* Plaster Pillars */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_PILLAR.get(), 5).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_pillar_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_PILLAR.get(), 5).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_pillar_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_PILLAR.get(), 5).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_pillar_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_PILLAR.get(), 5).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_pillar_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_PILLAR.get(), 5).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_pillar_from_white_plaster_stonecutting");

        /* Plaster Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_QUARTER.get(), 5).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_quarter_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_QUARTER.get(), 5).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_quarter_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_QUARTER.get(), 5).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_quarter_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_QUARTER.get(), 5).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_quarter_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_QUARTER.get(), 5).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_quarter_from_white_plaster_stonecutting");

        /* Plaster Vertical Quarters */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_QUARTER_VERTICAL.get(), 5).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_quarter_vertical_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_QUARTER_VERTICAL.get(), 5).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_quarter_vertical_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_QUARTER_VERTICAL.get(), 5).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_quarter_vertical_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_QUARTER_VERTICAL.get(), 5).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_quarter_vertical_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_QUARTER_VERTICAL.get(), 5).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_quarter_vertical_from_white_plaster_stonecutting");

        /* Plaster Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_WINDOW.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_window_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_WINDOW.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_window_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_WINDOW.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_window_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_WINDOW.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_window_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_WINDOW.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_window_from_white_plaster_stonecutting");

        /* Plaster Half Windows */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BEIGE_PLASTER.get()), ModBlocks.BEIGE_PLASTER_WINDOW_HALF.get(), 2).unlockedBy("has_beige_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BEIGE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_window_half_from_beige_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BROWN_PLASTER.get()), ModBlocks.BROWN_PLASTER_WINDOW_HALF.get(), 2).unlockedBy("has_brown_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_window_half_from_brown_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.OCHRE_PLASTER.get()), ModBlocks.OCHRE_PLASTER_WINDOW_HALF.get(), 2).unlockedBy("has_ochre_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.OCHRE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_window_half_from_ochre_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.TAN_PLASTER.get()), ModBlocks.TAN_PLASTER_WINDOW_HALF.get(), 2).unlockedBy("has_tan_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.TAN_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_window_half_from_tan_plaster_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_PLASTER.get()), ModBlocks.WHITE_PLASTER_WINDOW_HALF.get(), 2).unlockedBy("has_white_plaster",
                inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_PLASTER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_window_half_from_white_plaster_stonecutting");
    }

}
