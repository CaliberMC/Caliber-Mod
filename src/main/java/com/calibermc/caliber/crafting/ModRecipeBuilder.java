package com.calibermc.caliber.crafting;

import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class ModRecipeBuilder implements RecipeBuilder {
    private final Item result;
    private final Ingredient ingredient;
    private final Ingredient secondIngredient;
    private final float experience;
    private final int cookingTime;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();
    @Nullable
    private String group;

    private ModRecipeBuilder(ItemLike pResult, Ingredient pIngredient, Ingredient pSecondIngredient, float pExperience, int pCookingTime) {
        this.result = pResult.asItem();
        this.ingredient = pIngredient;
        this.secondIngredient = pSecondIngredient;
        this.experience = pExperience;
        this.cookingTime = pCookingTime;
    }


    // ---------------------------------------------------------
    public static SingleItemRecipeBuilder woodcutting(Ingredient pIngredient, ItemLike pResult) {
        return woodcutting(pIngredient, pResult, 1);
    }

    public static SingleItemRecipeBuilder woodcutting(Ingredient pIngredient, ItemLike pResult, int pCount) {
        return new SingleItemRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, ModRecipeSerializers.WOODCUTTING.get(), pIngredient, pResult, pCount);
    }
    // ---------------------------------------------------------

    public static ModRecipeBuilder alloying(Ingredient pIngredient, Ingredient pSecondIngredient, ItemLike pResult, float pExperience, int pCookingTime) {
        return new ModRecipeBuilder(pResult, pIngredient, pSecondIngredient, pExperience, pCookingTime);
    }

    @Override
    public ModRecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger) {
        this.advancement.addCriterion(pCriterionName, pCriterionTrigger);
        return this;
    }

    @Override
    public ModRecipeBuilder group(@Nullable String pGroupName) {
        this.group = pGroupName;
        return this;
    }

    @Override
    public Item getResult() {
        return this.result;
    }

    @Override
    public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ResourceLocation pRecipeId) {
        this.ensureValid(pRecipeId);
        this.advancement.parent(new ResourceLocation("recipes/root")).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId)).rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);
        pFinishedRecipeConsumer.accept(new Result(pRecipeId, this.group == null ? "" : this.group, this.ingredient, this.secondIngredient, this.result, this.experience, this.cookingTime, this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/" + RecipeCategory.MISC.getFolderName() + "/" + pRecipeId.getPath())));
    }

    /**
     * Makes sure that this obtainable.
     */
    private void ensureValid(ResourceLocation pId) {
        if (this.advancement.getCriteria().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + pId);
        }
    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final String group;
        private final Ingredient ingredient;
        private final Ingredient secondIngredient;
        private final Item result;
        private final float experience;
        private final int cookingTime;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation pId, String pGroup, Ingredient pIngredient, Ingredient pSecondIngredient, Item pResult, float pExperience, int pCookingTime, Advancement.Builder pAdvancement, ResourceLocation pAdvancementId) {
            this.id = pId;
            this.group = pGroup;
            this.ingredient = pIngredient;
            this.secondIngredient = pSecondIngredient;
            this.result = pResult;
            this.experience = pExperience;
            this.cookingTime = pCookingTime;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            if (!this.group.isEmpty()) {
                pJson.addProperty("group", this.group);
            }

            pJson.add("ingredient", this.ingredient.toJson());
            pJson.add("second_ingredient", this.secondIngredient.toJson());
            pJson.addProperty("result", ForgeRegistries.ITEMS.getKey(this.result).toString());
            pJson.addProperty("experience", this.experience);
            pJson.addProperty("cookingtime", this.cookingTime);
        }

        @Override
        public RecipeSerializer<?> getType() {
            return ModRecipeSerializers.ALLOYING.get();
        }

        /**
         * Gets the ID for the recipe.
         */
        @Override
        public ResourceLocation getId() {
            return this.id;
        }

        /**
         * Gets the JSON for the advancement that unlocks this recipe. Null if there is no advancement.
         */
        @Override
        @Nullable
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @Override
        @Nullable
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}