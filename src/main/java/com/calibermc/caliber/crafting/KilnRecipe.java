package com.calibermc.caliber.crafting;

import com.calibermc.caliber.block.ModBlocks;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class KilnRecipe extends AbstractCookingRecipe {

    protected final Ingredient secondIngredient;

    public KilnRecipe(ResourceLocation pId, String pGroup, Ingredient pIngredient, Ingredient pSecondIngredient, ItemStack pResult, float pExperience, int pCookingTime) {
        super(ModRecipeSerializers.ALLOYING_TYPE, pId, pGroup, pIngredient, pResult, pExperience, pCookingTime);
        this.secondIngredient = pSecondIngredient;
    }

    @Override
    public boolean matches(Container pInv, Level pLevel) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < pInv.getContainerSize(); k++) {
            ItemStack stack = pInv.getItem(k);
            if (this.ingredient.test(stack)) {
                i++;
            }
            if (this.secondIngredient.test(stack)) {
                j++;
            }
        }

        return i == 1 && j == 1;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        nonnulllist.add(this.ingredient);
        nonnulllist.add(this.secondIngredient);
        return nonnulllist;
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.KILN.get());
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializers.ALLOYING.get();
    }

    public static class Serializer<T extends KilnRecipe> extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<T> {
        private final Builder<T> factory;

        public Serializer(Builder<T> pFactory) {
            this.factory = pFactory;
        }

        @Override
        public T fromJson(ResourceLocation pRecipeId, JsonObject pJson) {
            String s = GsonHelper.getAsString(pJson, "group", "");
            JsonElement jsonelement = GsonHelper.isArrayNode(pJson, "ingredient") ? GsonHelper.getAsJsonArray(pJson, "ingredient") : GsonHelper.getAsJsonObject(pJson, "ingredient");
            JsonElement jsonelement2 = GsonHelper.isArrayNode(pJson, "second_ingredient") ? GsonHelper.getAsJsonArray(pJson, "second_ingredient") : GsonHelper.getAsJsonObject(pJson, "second_ingredient");
            Ingredient ingredient = Ingredient.fromJson(jsonelement);
            Ingredient secondIngredient = Ingredient.fromJson(jsonelement2);

            //Forge: Check if primitive string to keep vanilla or a object which can contain a count field.
            if (!pJson.has("result")) throw new com.google.gson.JsonSyntaxException("Missing result, expected to find a string or object");
            ItemStack itemstack;
            if (pJson.get("result").isJsonObject()) itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "result"));
            else {
                String s1 = GsonHelper.getAsString(pJson, "result");
                ResourceLocation resourcelocation = new ResourceLocation(s1);
                itemstack = new ItemStack(ForgeRegistries.ITEMS.getHolder(resourcelocation).orElseThrow(() -> new IllegalStateException("Item: " + s1 + " does not exist")));
            }
            float f = GsonHelper.getAsFloat(pJson, "experience", 0.0F);
            int i = GsonHelper.getAsInt(pJson, "cookingtime", 100);
            return this.factory.create(pRecipeId, s, ingredient, secondIngredient, itemstack, f, i);
        }

        @Override
        public T fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            String s = pBuffer.readUtf();
            Ingredient ingredient = Ingredient.fromNetwork(pBuffer);
            Ingredient secondIngredient = Ingredient.fromNetwork(pBuffer);
            ItemStack itemstack = pBuffer.readItem();
            float f = pBuffer.readFloat();
            int i = pBuffer.readVarInt();
            return this.factory.create(pRecipeId, s, ingredient, secondIngredient, itemstack, f, i);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, T pRecipe) {
            pBuffer.writeUtf(pRecipe.group);
            pRecipe.ingredient.toNetwork(pBuffer);
            pRecipe.secondIngredient.toNetwork(pBuffer);
            pBuffer.writeItem(pRecipe.result);
            pBuffer.writeFloat(pRecipe.experience);
            pBuffer.writeVarInt(pRecipe.cookingTime);
        }

        interface Builder<T extends AbstractCookingRecipe> {
            T create(ResourceLocation pId, String pGroup, Ingredient pIngredient, Ingredient pSecondIngredient, ItemStack pResult, float pExperience, int pCookingTime);
        }
    }
}
