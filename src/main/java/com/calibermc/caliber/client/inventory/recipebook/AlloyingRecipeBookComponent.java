package com.calibermc.caliber.client.inventory.recipebook;

import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.client.gui.screens.recipebook.RecipeBookComponent;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@OnlyIn(Dist.CLIENT)
public class AlloyingRecipeBookComponent extends RecipeBookComponent {
   private static final Component FILTER_NAME = new TranslatableComponent("caliber.gui.recipebook.toggleRecipes.alloying");

   @Nullable
   private Ingredient fuels;

   @Override
   protected void initFilterButtonTextures() {
      this.filterButton.initTextureValues(152, 182, 28, 18, RECIPE_BOOK_LOCATION);
   }

   @Override
   public void slotClicked(@Nullable Slot pSlot) {
      super.slotClicked(pSlot);
      if (pSlot != null && pSlot.index < this.menu.getSize()) {
         this.ghostRecipe.clear();
      }

   }

   @Override
   public void setupGhostRecipe(Recipe<?> pRecipe, List<Slot> pSlots) {
      ItemStack itemstack = pRecipe.getResultItem();
      this.ghostRecipe.setRecipe(pRecipe);
      this.ghostRecipe.addIngredient(Ingredient.of(itemstack), pSlots.get(3).x, pSlots.get(3).y);
      NonNullList<Ingredient> nonnulllist = pRecipe.getIngredients();
      Slot slot = pSlots.get(2);
      if (slot.getItem().isEmpty()) {
         if (this.fuels == null) {
            this.fuels = Ingredient.of(AbstractFurnaceBlockEntity.getFuel().keySet().stream().map(ItemStack::new));
         }

         this.ghostRecipe.addIngredient(this.fuels, slot.x, slot.y);
      }

      Iterator<Ingredient> iterator = nonnulllist.iterator();

      for(int i = 0; i < 2; ++i) {
         if (!iterator.hasNext()) {
            return;
         }

         Ingredient ingredient = iterator.next();
         if (!ingredient.isEmpty()) {
            Slot slot1 = pSlots.get(i);
            this.ghostRecipe.addIngredient(ingredient, slot1.x, slot1.y);
         }
      }
   }

   @Override
   protected Component getRecipeFilterName() {
      return FILTER_NAME;
   }
}