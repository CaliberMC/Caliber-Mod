package com.calibermc.caliber.data.datagen.recipes;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliber.block.properties.ModMaterials;
import com.calibermc.caliber.crafting.ModRecipeBuilder;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.caliber.item.ModItems;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public static int recipeCount = 152; // Recipes from MiscRecipeProvider

    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS.get(Caliber.MOD_ID)) {
            try {
                if (blockManager.baseBlock() != null) {
                    boolean wood = WoodType.values().anyMatch(p -> p.name().equals(blockManager.blockType().name()));
                    generateRecipes(blockManager, wood || blockManager.blockType() == ModMaterials.TUDOR_1 || blockManager.blockType() == ModMaterials.TUDOR_2 , recipeConsumer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        printRecipeCounts();
    }

    private void generateRecipes(BlockManager manager, boolean wood, Consumer<FinishedRecipe> finished) {
        String name = manager.getName();
        Block baseBlock = manager.baseBlock();
        String criterionBy = "has_%s".formatted(name);
        String woodOrStone = wood ? "wood" : "stone";
        String fromCraftingMethod = "_from_%s_%scutting".formatted(name, woodOrStone);

        recipeCount++;

        Function3<Ingredient, ItemLike, Integer, SingleItemRecipeBuilder> stoneOrWoodcutting = (a, b, c) -> {
            if (wood) {
                return ModRecipeBuilder.woodcutting(a, b, c);
            }
            return SingleItemRecipeBuilder.stonecutting(a, RecipeCategory.BUILDING_BLOCKS, b, c);
        };

        for (Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e : manager.getBlocks().entrySet()) {
            String path = e.getValue().getFirst().getPath();
            Block block = e.getValue().getSecond().get();
//            String n = name + "_" + e.getKey().variant.getName() + fromCraftingMethod;
            String n = path + fromCraftingMethod;
            switch (e.getKey().variant) {
                case ARCH, ARCH_LARGE, ARCH_HALF, ARCH_LARGE_HALF, ARROWSLIT -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 2).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);
                }

                case BALUSTRADE, CAPITAL, WINDOW, WINDOW_HALF, ROOF_22, ROOF_45, ROOF_67, ROOF_PEAK -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 2).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);
                }

                case CORNER, QUARTER, QUARTER_VERTICAL, PILLAR -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 5).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);
                }

                case CORNER_SLAB, CORNER_SLAB_VERTICAL -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 4).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);
                }

                case EIGHTH -> {
                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 8).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);
                }

                case BEAM_HORIZONTAL, BEAM_VERTICAL -> {
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
                case SLAB -> {
                    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 24).define('#', baseBlock).pattern("###").unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));

                    stoneOrWoodcutting.apply(Ingredient.of(manager.get(ModBlockFamily.Variant.SLAB_VERTICAL)), (block), 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_slab_vertical_%scutting".formatted(path, name, woodOrStone));

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 8).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);

                }
                case SLAB_VERTICAL -> {
                    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 24).define('#', baseBlock).pattern(" # ").pattern(" # ").pattern(" # ").unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));

                    stoneOrWoodcutting.apply(Ingredient.of(manager.get(ModBlockFamily.Variant.SLAB)), (block), 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_slab_%scutting".formatted(path, name, woodOrStone));

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 8).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);
                }
                case STAIRS -> {
                    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, manager.get(ModBlockFamily.Variant.STAIRS), 4).define('#', baseBlock).pattern("#  ").pattern("## ").pattern("###").unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);

                }
                case WALL -> {
                    if (!wood) {
                        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, manager.get(ModBlockFamily.Variant.WALL), 6).define('#', baseBlock).pattern("###").pattern("###").unlockedBy(criterionBy,
                                inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));
                    }

                    stoneOrWoodcutting.apply(Ingredient.of(baseBlock), block, 1).unlockedBy(criterionBy,
                            inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, n);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);
                }
                case BASE -> {

                    tudorVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    stainedVariantRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    mossyVariantRecipes(manager, finished, name, baseBlock, criterionBy, e, path, block);

                    smoothBaseBlockRecipe(manager, finished, name, baseBlock, criterionBy, e, path, block);

//                    for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS) {
//                        if (blockManager.getName().equals(manager.getName().replace("board", ""))) {
//                            ModRecipeBuilder.woodcutting(Ingredient.of(baseBlock), blockManager.baseBlock()).unlockedBy(criterionBy,
//                                    inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "000%s_from_%s_%scutting".formatted(name,
//                                    manager.getBlocks().entrySet().stream().filter(e1 -> e1.getKey().variant.equals(e.getKey().variant)).findFirst().get().getValue().getFirst().getPath(), woodOrStone));
//                        }
//                    }
                }
            }
        }}

    // TODO: CONSIDER SLAB to MOD SLAB RECIPES

    private void tudorVariantRecipe(BlockManager manager, Consumer<FinishedRecipe> finished, String name, Block baseBlock, String criterionBy, Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e, String path, Block block) {

        if (name.startsWith("tudor_")) {
            String[] parts = name.split("_");
            if (parts.length >= 5) {
                String woodType;
                String plasterColor;
                if ("stained".equals(parts[1])) {
                    // handle the 'dark' case here
                    if (parts[2].equals("dark") && parts.length > 3) {
                        woodType = "stained_" + parts[2] + "_" + parts[3];
                        plasterColor = parts[4];
                    } else {
                        woodType = "stained_" + parts[2];
                        plasterColor = parts[3];
                    }
                } else {
                    // handle the 'dark' case here
                    if (parts[1].equals("dark") && parts.length > 3) {
                        woodType = parts[1] + "_" + parts[2];
                        plasterColor = parts[3];
                    } else {
                        woodType = parts[1];
                        plasterColor = parts[2];
                    }
                }

                Optional<BlockManager> woodBlockManager = BlockManager.BLOCK_MANAGERS.get(Caliber.MOD_ID).stream()
                        .filter(m -> m.getName().equals(woodType + "_boards")).findFirst();
                Optional<BlockManager> plasterBlockManager = BlockManager.BLOCK_MANAGERS.get(Caliber.MOD_ID).stream()
                        .filter(m -> m.getName().startsWith(plasterColor + "_plaster")).findFirst();

                if (woodBlockManager.isPresent() && plasterBlockManager.isPresent()) {
                    ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, block, 1)
                            .requires(woodBlockManager.get().get(e.getKey().variant))
                            .requires(plasterBlockManager.get().get(e.getKey().variant))
                            .unlockedBy(criterionBy,
                                    inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
                            .save(finished, "%s_from_%s_and_%s_shapeless".formatted(path, woodType + "_boards", plasterColor + "_plaster"));
                } else {
                    if (woodBlockManager.isEmpty()) {
                        System.err.println("Could not find block manager for " + woodType + "_boards");
                    }
                    if (plasterBlockManager.isEmpty()) {
                        System.err.println("Could not find block manager starting with " + plasterColor + "_plaster");
                    }
                }
            } else {
                throw new IllegalArgumentException("Block name does not contain sufficient parts for Tudor Variant Recipe");
            }
        }
    }

    private void stainedVariantRecipe(BlockManager manager, Consumer<FinishedRecipe> finished, String name, Block baseBlock, String criterionBy, Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e, String path, Block block) {
        if (name.contains("stained") && !name.contains("tudor") && !name.contains("mossy")) {
            BlockManager blockManager = BlockManager.BLOCK_MANAGERS.get(Caliber.MOD_ID).stream()
                    .filter(m -> manager.getName().replace("stained_", "").equals(m.getName()))
                    .findFirst()
                    .orElseGet(() -> BlockManager.BLOCK_MANAGERS.get(Caliber.MOD_ID).stream()
                            .filter(m -> m.getName().replace("caliber:", "minecraft:").equals(manager.getName().replace("stained_", "")))
                            .findFirst()
                            .orElseThrow(() -> new RuntimeException("No matching BlockManager found: " + manager.getName())));

            if (blockManager.getByVariant(e.getKey().variant) != null) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, block, 1)
                        .requires(ModItems.RESIN.get())
                        .requires(blockManager.get(e.getKey().variant))
                        .unlockedBy(criterionBy, inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
                        .save(finished, "%s_from_%s_and_resin_shapeless".formatted(path, name));
            }
        }
    }


//    private void mossyVariantRecipes(BlockManager manager, Consumer<FinishedRecipe> finished, String name, Block baseBlock, String criterionBy, Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e, String path, Block block) {
//        if (name.contains("mossy") && !name.contains("tudor")) {
//            BlockManager blockManager = BlockManager.BLOCK_MANAGERS.stream()
//                    .filter(m -> matchesBlockManagerName(manager.getName().replace("mossy_", ""), m.getName()))
//                    .findFirst()
//                    .orElseGet(() -> BlockManager.BLOCK_MANAGERS.stream()
//                            .filter(m -> matchesBlockManagerName(manager.getName().replace("mossy_", "").replace("caliber:", "minecraft:"), m.getName()))
//                            .findFirst()
//                            .orElseThrow(() -> new RuntimeException("No matching BlockManager found: " + manager.getName())));
//
//            if (blockManager.getByVariant(e.getKey().variant) != null) {
//                ShapelessRecipeBuilder.shapeless(block, 1).requires(Items.VINE)
//                        .requires(blockManager.get(e.getKey().variant))
//                        .unlockedBy(criterionBy, inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
//                        .save(finished, "%s_from_%s_and_vine_shapeless".formatted(path, path.replace("mossy_", "")));
//
//                ShapelessRecipeBuilder.shapeless(block, 1).requires(Blocks.MOSS_BLOCK)
//                        .requires(blockManager.get(e.getKey().variant))
//                        .unlockedBy(criterionBy, inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
//                        .save(finished, "%s_from_%s_and_moss_shapeless".formatted(path, path.replace("mossy_", "")));
//            }
//        }
//    }
//
//    private boolean matchesBlockManagerName(String nameToCheck, String blockManagerName) {
//        if (nameToCheck.contains("bricks") || nameToCheck.contains("tiles")) {
//            return blockManagerName.equals(nameToCheck);
//        } else {
//            return blockManagerName.equals(nameToCheck.replace("brick", "bricks").replace("tile", "tiles"));
//        }
//    }



//    private void mossyVariantRecipes(BlockManager manager, Consumer<FinishedRecipe> finished, String name, Block baseBlock, String criterionBy, Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e, String path, Block block) {
//        if (name.contains("mossy") && !name.contains("tudor")) {
//            System.out.println("Manager Name: " + manager.getName());
//            System.out.println("List of BlockManager Names:");
//            BlockManager.BLOCK_MANAGERS.forEach(m -> System.out.println(m.getName()));
//            BlockManager blockManager = BlockManager.BLOCK_MANAGERS.stream()
//                    .filter(m -> manager.getName().replace("mossy_", "").equals(m.getName()))
//                    .findFirst()
//                    .orElseGet(() -> BlockManager.BLOCK_MANAGERS.stream()
//                            .filter(m -> m.getName().replace("caliber:", "minecraft:").equals(manager.getName().replace("mossy_", "")))
//                            .findFirst()
//                            .orElseThrow(() -> new RuntimeException("No matching BlockManager found: " + manager.getName())));
//
//            if (blockManager.getByVariant(e.getKey().variant) != null) {
//                ShapelessRecipeBuilder.shapeless(block, 1).requires(Items.VINE)
//                        .requires(blockManager.get(e.getKey().variant))
//                        .unlockedBy(criterionBy, inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
//                        .save(finished, "%s_from_%s_and_vine_shapeless".formatted(path, path.replace("mossy_", "")));
//
//                ShapelessRecipeBuilder.shapeless(block, 1).requires(Blocks.MOSS_BLOCK)
//                        .requires(blockManager.get(e.getKey().variant))
//                        .unlockedBy(criterionBy, inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
//                        .save(finished, "%s_from_%s_and_moss_shapeless".formatted(path, path.replace("mossy_", "")));
//            }
//        }
//    }


        //ORIGINAL
    private void mossyVariantRecipes(BlockManager manager, Consumer<FinishedRecipe> finished, String name, Block baseBlock, String criterionBy, Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e, String path, Block block) {
        if (name.contains("mossy") && !name.contains("tudor")) {
            Optional<BlockManager> optionalManager = BlockManager.BLOCK_MANAGERS.get(Caliber.MOD_ID).stream()
                    .filter(m -> manager.getName().replace("mossy_", "").equals(m.getName()))
                    .findFirst();

            if (optionalManager.isPresent()) {
                if (optionalManager.get().getByVariant(e.getKey().variant) != null) {
                    ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, block, 1).requires(Items.VINE)
                            .requires(optionalManager.get().get(e.getKey().variant))
                            .unlockedBy(criterionBy, inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
                            .save(finished, "%s_from_%s_and_vine_shapeless".formatted(path, path.replace("mossy_", "")));

                    ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, block, 1).requires(Blocks.MOSS_BLOCK)
                            .requires(optionalManager.get().get(e.getKey().variant))
                            .unlockedBy(criterionBy, inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build()))
                            .save(finished, "%s_from_%s_and_moss_shapeless".formatted(path, path.replace("mossy_", "")));
                }
            } else {
                throw new IllegalStateException(String.format("No matching BlockManager found: %s", manager.getName()));
            }
        }
    }

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

//    private void baseBlockShapedRecipe(BlockManager manager, Consumer<FinishedRecipe> finished, String name, Block baseBlock, String criterionBy, Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e, String path, Block block) {
//        if (name.contains("limestone") && name.contains("brick") && !name.contains("chiseled") && !name.contains("cracked")
//                || (name.contains("cut") && name.contains("sandstone"))
//                || name.contains("polished") && name.contains("granite")) {
//            ShapedRecipeBuilder.shaped(block, 4).define('#', baseBlock).pattern("##").pattern("##").unlockedBy(criterionBy,
//                    inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "000%s_from_%s_shaped".formatted(path, name));
//        }
//
//        if (name.contains("limestone") && name.contains("chiseled")) {
//            ShapedRecipeBuilder.shaped(block, 1).define('#', baseBlock).pattern("##").pattern("##").unlockedBy(criterionBy,
//                    inventoryTrigger(ItemPredicate.Builder.item().of(baseBlock).build())).save(finished, "%s_from_%s_shaped".formatted(path, name));
//        }
//
//    }

    public static void printRecipeCounts() {
        System.out.println("Caliber Recipes Registered: " + recipeCount);
    }
}

