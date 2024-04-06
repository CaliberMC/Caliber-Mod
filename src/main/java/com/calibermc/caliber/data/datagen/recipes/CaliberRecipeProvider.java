package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.util.compat.ModCompats;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliber.crafting.CaliberRecipeBuilder;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.caliberlib.block.properties.ModWoodType;
import net.regions_unexplored.data.block.RuWoodTypes;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Pair;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CaliberRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public CaliberRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        List<String> blockManagerKeys = new ArrayList<>(Arrays.asList(Caliber.MOD_ID));
        if (ModCompats.REGIONS_UNEXPLORED) {
            blockManagerKeys.add("regions_unexplored");
        }
        // TODO: Fix ModWoodTypes not generating woodcutter recipes
        for (String blockManagerKey : blockManagerKeys) {
            for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS.get(blockManagerKey)) {
                try {
                    if (blockManager.baseBlock() != null) {
                        boolean wood = ModWoodType.getWoodTypes().stream().anyMatch(p -> p.name().contains(blockManager.blockType().name()))
                                || WoodType.values().anyMatch(p -> p.name().equals(blockManager.blockType().name()));
                        generateRecipes(blockManager, wood, recipeConsumer);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

//        for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS.get(Caliber.MOD_ID)) {
//            try {
//                if (blockManager.baseBlock() != null) {
//                    boolean wood = WoodType.values().anyMatch(p -> p.name().equals(blockManager.blockType().name()));
//                    generateRecipes(blockManager, wood, recipeConsumer);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }

    private void generateRecipes(BlockManager manager, boolean wood, Consumer<FinishedRecipe> finished) {
        String name = manager.getName();
        Block baseBlock = manager.baseBlock();
//        Block door = manager.get(ModBlockFamily.Variant.DOOR);
        String criterionBy = "has_%s".formatted(name);
        String woodOrStone = wood ? "wood" : "stone";
        String fromCraftingMethod = "_from_%s_%scutting".formatted(name, woodOrStone);

        Function3<Ingredient, ItemLike, Integer, SingleItemRecipeBuilder> stoneOrWoodcutting = (a, b, c) -> {
            if (wood) {
                return CaliberRecipeBuilder.woodcutting(a, b, c);
            }
            return SingleItemRecipeBuilder.stonecutting(a, RecipeCategory.BUILDING_BLOCKS, b, c);
        };

        for (Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e : manager.getBlocks().entrySet()) {
            String path = e.getValue().getFirst().getPath();
            Block block = e.getValue().getSecond().get();
//            String n = name + "_" + e.getKey().variant.getName() + fromCraftingMethod;
            String n = path + fromCraftingMethod;
            switch (e.getKey().variant) {
                case ARCH, ARCH_LARGE, ARCH_HALF, ARCH_LARGE_HALF, ARROWSLIT, BALUSTRADE, CAPITAL, WINDOW, WINDOW_HALF, ROOF_22, ROOF_45, ROOF_67, ROOF_PEAK -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 2).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

                case CORNER, QUARTER, QUARTER_VERTICAL, PILLAR, CORNER_SLAB, CORNER_SLAB_VERTICAL, EIGHTH -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 5).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

//                case EIGHTH -> {
//                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 8).unlockedBy(criterionBy,
//                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
//                }

                case BEAM_HORIZONTAL, BEAM_VERTICAL, BEAM_DIAGONAL -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 9).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

                case BEAM_LINTEL, BEAM_POSTS, DOOR_FRAME, DOOR_FRAME_LINTEL -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 16).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

                case BUTTON -> {
                    ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, block).requires(baseBlock).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

                case FENCE -> {
                    ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, block, 3).define('#', baseBlock).define('X', Items.STICK).pattern("#X#").pattern("#X#").unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_and_sticks_shaped".formatted(path, name));

                    SingleItemRecipeBuilder.stonecutting(Ingredient.of(baseBlock), RecipeCategory.REDSTONE, block, 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_%scutting".formatted(path, name, woodOrStone));

                }

                case PRESSURE_PLATE -> {
                    ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, block).define('#', baseBlock).pattern("##").unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

                case LAYER-> {
//                    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 24).define('#', baseBlock).pattern("###").unlockedBy(criterionBy,
//                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));

                    stoneOrWoodcutting.apply(Ingredient.of(manager.get(ModBlockFamily.Variant.LAYER_VERTICAL)), (block), 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_layer_vertical_%scutting".formatted(path, name, woodOrStone));

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 8).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

                case LAYER_VERTICAL -> {
                    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 24).define('#', baseBlock).pattern(" # ").pattern(" # ").pattern(" # ").unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));

                    stoneOrWoodcutting.apply(Ingredient.of(manager.get(ModBlockFamily.Variant.LAYER)), (block), 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_layer_%scutting".formatted(path, name, woodOrStone));

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 8).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

//                case TALL_DOOR, DOOR -> {
//                    if (e.getKey().variant == ModBlockFamily.Variant.TALL_DOOR) {
//                        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, block, 1).define('X', manager.get(ModBlockFamily.Variant.DOOR)).define('#', baseBlock).pattern("X").pattern("#").unlockedBy(criterionBy,
//                                inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));
//                    }
//                }

                case STAIRS -> {
                    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, manager.get(ModBlockFamily.Variant.STAIRS), 4).define('#', baseBlock).pattern("#  ").pattern("## ").pattern("###").unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

                case WALL -> {
                    if (!wood) {
                        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, manager.get(ModBlockFamily.Variant.WALL), 6).define('#', baseBlock).pattern("###").pattern("###").unlockedBy(criterionBy,
                                inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));
                    }

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);
                }

                case BASE -> {
                    smoothBaseBlockRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);
                }
            }
        }}

    private void smoothBaseBlockRecipe(BlockManager manager, Consumer<FinishedRecipe> finished, String name, Block baseBlock, String criterionBy, Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e, String path, Block block) {
        if (name.contains("smooth")) {
            Optional<BlockManager> optionalManager = BlockManager.BLOCK_MANAGERS.get(Caliber.MOD_ID).stream()
                    .filter(m -> manager.getName().replace("smooth_", "").equals(m.getName())).findFirst();

            if (optionalManager.isPresent()) {
                if (optionalManager.get().getByVariant(e.getKey().variant) != null) {
                    SimpleCookingRecipeBuilder.smelting(Ingredient.of(baseBlock), RecipeCategory.BUILDING_BLOCKS, block, 0.1f, 200)
                            .unlockedBy(criterionBy, inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
                            .save(finished, "%s_from_%s_smelting".formatted(path, path.replace("smooth_", "")));
                }
            } else {
                throw new IllegalStateException(String.format("No matching BlockManager found: %s", manager.getName()));
            }
        }
    }

}

