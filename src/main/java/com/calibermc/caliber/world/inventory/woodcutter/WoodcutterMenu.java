package com.calibermc.caliber.world.inventory.woodcutter;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.crafting.ModRecipeSerializers;
import com.calibermc.caliber.crafting.WoodcutterRecipe;
import com.calibermc.caliber.world.inventory.ModMenuTypes;
import com.google.common.collect.Lists;
import net.minecraft.client.RecipeBookCategories;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class WoodcutterMenu extends AbstractContainerMenu {

   public static final RecipeBookCategories MAIN_CATEGORY = RecipeBookCategories.create("woodcutter", ModBlocks.KILN.get().asItem().getDefaultInstance());

   private final Level level;
   private final ContainerLevelAccess access;
   long lastSoundTime;
   Runnable slotUpdateListener = () -> {
   };
   private ItemStack input = ItemStack.EMPTY;
   private final Slot inputSlot, resultSlot;
   private final ResultContainer resultContainer = new ResultContainer();
   private final DataSlot selectedRecipeIndex = DataSlot.standalone();
   private List<WoodcutterRecipe> recipes = Lists.newArrayList();
   public final Container container = new SimpleContainer(1) {
      @Override
      public void setChanged() {
         super.setChanged();
         WoodcutterMenu.this.slotsChanged(this);
         WoodcutterMenu.this.slotUpdateListener.run();
      }
   };

   public WoodcutterMenu(int pContainerId, Inventory pPlayerInventory) {
      this(pContainerId, pPlayerInventory, ContainerLevelAccess.NULL);
   }

   public WoodcutterMenu(int pContainerId, Inventory pPlayerInventory, final ContainerLevelAccess pAccess) {
      super(ModMenuTypes.WOODCUTTER.get(), pContainerId);
      this.access = pAccess;
      this.level = pPlayerInventory.player.level;
      this.inputSlot = this.addSlot(new Slot(this.container, 0, 20, 33));
      this.resultSlot = this.addSlot(new Slot(this.resultContainer, 1, 143, 33) {
         // Cannot because it's result slot
         @Override
         public boolean mayPlace(ItemStack pStack) {
            return false;
         }

         @Override
         public void onTake(Player pPlayer, ItemStack pStack) {
            pStack.onCraftedBy(pPlayer.level, pPlayer, pStack.getCount());
            WoodcutterMenu.this.resultContainer.awardUsedRecipes(pPlayer);
            ItemStack itemstack = WoodcutterMenu.this.inputSlot.remove(1);
            if (!itemstack.isEmpty()) {
               WoodcutterMenu.this.setupResultSlot();
            }

            pAccess.execute((level, blockPos) -> {
               long l = level.getGameTime();
               if (WoodcutterMenu.this.lastSoundTime != l) {
                  level.playSound(null, blockPos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.BLOCKS, 1.0F, 1.0F);
                  WoodcutterMenu.this.lastSoundTime = l;
               }

            });
            super.onTake(pPlayer, pStack);
         }
      });

      // Player inventory
      for (int i = 0; i < 3; ++i) {
         for (int j = 0; j < 9; ++j) {
            this.addSlot(new Slot(pPlayerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
         }
      }

      for (int k = 0; k < 9; ++k) {
         this.addSlot(new Slot(pPlayerInventory, k, 8 + k * 18, 142));
      }

      this.addDataSlot(this.selectedRecipeIndex);
   }

   public int getSelectedRecipeIndex() {
      return this.selectedRecipeIndex.get();
   }

   public List<WoodcutterRecipe> getRecipes() {
      return this.recipes;
   }

   public boolean hasInputItem() {
      return this.inputSlot.hasItem() && !this.recipes.isEmpty();
   }

   @Override
   public boolean stillValid(Player pPlayer) {
      return stillValid(this.access, pPlayer, ModBlocks.WOODCUTTER.get());
   }

   /**
    * Handles the given Button-click on the server, currently only used by enchanting. Name is for legacy.
    */
   @Override
   public boolean clickMenuButton(Player pPlayer, int pId) {
      if (this.isValidRecipeIndex(pId)) {
         this.selectedRecipeIndex.set(pId);
         this.setupResultSlot();
      }

      return true;
   }

   private boolean isValidRecipeIndex(int pRecipeIndex) {
      return pRecipeIndex >= 0 && pRecipeIndex < this.recipes.size();
   }

   @Override
   public void slotsChanged(Container pInventory) {
      ItemStack itemstack = this.inputSlot.getItem();
      if (!itemstack.is(this.input.getItem())) {
         this.input = itemstack.copy();

         // setup recipe list
         this.recipes.clear();
         this.selectedRecipeIndex.set(-1);
         this.resultSlot.set(ItemStack.EMPTY);
         if (!itemstack.isEmpty()) {
            this.recipes = this.level.getRecipeManager().getRecipesFor(ModRecipeSerializers.WOODCUTTING_TYPE, pInventory, this.level);
         }
      }

   }

   private void setupResultSlot() {
      if (!this.recipes.isEmpty() && this.isValidRecipeIndex(this.getSelectedRecipeIndex())) {
         WoodcutterRecipe WoodcutterRecipe = this.recipes.get(this.getSelectedRecipeIndex());
         this.resultContainer.setRecipeUsed(WoodcutterRecipe);
         this.resultSlot.set(WoodcutterRecipe.assemble(this.container));
      } else {
         this.resultSlot.set(ItemStack.EMPTY);
      }

      this.broadcastChanges();
   }

   public void registerUpdateListener(Runnable pListener) {
      this.slotUpdateListener = pListener;
   }

   // cannot take item from result slot, when picking all items in inv
   @Override
   public boolean canTakeItemForPickAll(ItemStack pStack, Slot pSlot) {
      return pSlot.container != this.resultContainer && super.canTakeItemForPickAll(pStack, pSlot);
   }

   // shift click
   @Override
   public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
      ItemStack itemstack = ItemStack.EMPTY;
      Slot slot = this.slots.get(pIndex);
      if (slot.hasItem()) {
         ItemStack itemstack1 = slot.getItem();
         Item item = itemstack1.getItem();
         itemstack = itemstack1.copy();
         if (pIndex == 1) {
            item.onCraftedBy(itemstack1, pPlayer.level, pPlayer);
            if (!this.moveItemStackTo(itemstack1, 2, 38, true)) {
               return ItemStack.EMPTY;
            }

            slot.onQuickCraft(itemstack1, itemstack);
         } else if (pIndex == 0) {
            if (!this.moveItemStackTo(itemstack1, 2, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else if (this.level.getRecipeManager().getRecipeFor(ModRecipeSerializers.WOODCUTTING_TYPE, new SimpleContainer(itemstack1), this.level).isPresent()) {
            if (!this.moveItemStackTo(itemstack1, 0, 1, false)) {
               return ItemStack.EMPTY;
            }
         } else if (pIndex >= 2 && pIndex < 29) {
            if (!this.moveItemStackTo(itemstack1, 29, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else if (pIndex >= 29 && pIndex < 38 && !this.moveItemStackTo(itemstack1, 2, 29, false)) {
            return ItemStack.EMPTY;
         }

         if (itemstack1.isEmpty()) {
            slot.set(ItemStack.EMPTY);
         }

         slot.setChanged();
         if (itemstack1.getCount() == itemstack.getCount()) {
            return ItemStack.EMPTY;
         }

         slot.onTake(pPlayer, itemstack1);
         this.broadcastChanges();
      }

      return itemstack;
   }

   // close
   @Override
   public void removed(Player pPlayer) {
      super.removed(pPlayer);
      this.resultContainer.removeItemNoUpdate(1);
      this.access.execute((level, blockPos) -> this.clearContainer(pPlayer, this.container));
   }
}