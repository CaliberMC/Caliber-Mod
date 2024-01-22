package com.calibermc.caliber.crafting;

import com.calibermc.caliber.block.ModBlocks;
import com.google.gson.JsonObject;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public class WoodcutterRecipe extends SingleItemRecipe {

    public WoodcutterRecipe(ResourceLocation pId, String pGroup, Ingredient pIngredient, ItemStack pResult) {
        super(ModRecipeSerializers.WOODCUTTING_TYPE.get(), ModRecipeSerializers.WOODCUTTING.get(), pId, pGroup, pIngredient, pResult);
    }

    @Override
    public boolean matches(Container pInv, Level pLevel) {
        return this.ingredient.test(pInv.getItem(0));
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.WOODCUTTER.get());
    }

    public static class Serializer<T extends SingleItemRecipe> implements RecipeSerializer<T> {
        final SingleItemMaker<T> factory;

        public Serializer(SingleItemMaker<T> pFactory) {
            this.factory = pFactory;
        }

        @Override
        public T fromJson(ResourceLocation pRecipeId, JsonObject pJson) {
            String s = GsonHelper.getAsString(pJson, "group", "");
            Ingredient ingredient;
            if (GsonHelper.isArrayNode(pJson, "ingredient")) {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonArray(pJson, "ingredient"));
            } else {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(pJson, "ingredient"));
            }

            String s1 = GsonHelper.getAsString(pJson, "result");
            int i = GsonHelper.getAsInt(pJson, "count");
            ItemStack itemstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(s1)), i);
            return this.factory.create(pRecipeId, s, ingredient, itemstack);
        }

        @Override
        public T fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            String s = pBuffer.readUtf();
            Ingredient ingredient = Ingredient.fromNetwork(pBuffer);
            ItemStack itemstack = pBuffer.readItem();
            return this.factory.create(pRecipeId, s, ingredient, itemstack);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, T pRecipe) {
            pBuffer.writeUtf(pRecipe.getGroup());
            pRecipe.getIngredients().get(0).toNetwork(pBuffer);
            pBuffer.writeItem(pRecipe.getResultItem(RegistryAccess.EMPTY));
        }

        interface SingleItemMaker<T extends SingleItemRecipe> {
            T create(ResourceLocation pId, String pGroup, Ingredient pIngredient, ItemStack pResult);
        }
    }

}