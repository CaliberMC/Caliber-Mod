package com.calibermc.caliber.compat.recipes.jei;
import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.client.inventory.WoodcutterScreen;
import com.calibermc.caliber.crafting.CaliberRecipeSerializers;
import com.calibermc.caliber.crafting.WoodcutterRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(Caliber.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new WoodcuttingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<WoodcutterRecipe> woodcuttingRecipes = recipeManager.getAllRecipesFor(CaliberRecipeSerializers.WOODCUTTING_TYPE.get());
        registration.addRecipes(WoodcuttingCategory.WOODCUTTING_TYPE, woodcuttingRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(WoodcutterScreen.class, 60, 30, 20, 30, WoodcuttingCategory.WOODCUTTING_TYPE);
    }
}

