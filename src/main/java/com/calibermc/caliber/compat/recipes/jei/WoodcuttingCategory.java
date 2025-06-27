package com.calibermc.caliber.compat.recipes.jei;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.crafting.WoodcutterRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class WoodcuttingCategory implements IRecipeCategory<WoodcutterRecipe> {

    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(Caliber.MOD_ID, "woodcutting");
    private static final ResourceLocation TEXTURE = ResourceLocation.withDefaultNamespace("textures/gui/container/stonecutter.png");

    public static final RecipeType<WoodcutterRecipe> WOODCUTTING_TYPE = new RecipeType<>(UID,WoodcutterRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public WoodcuttingCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(CaliberBlocks.WOODCUTTER.get()));
    }

    @Override
    public RecipeType<WoodcutterRecipe> getRecipeType() {
        return WOODCUTTING_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("caliber.recipe_type.woodcutting");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, WoodcutterRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 20, 33).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 143, 33).addItemStack(recipe.getResultItem(null));
    }
}

