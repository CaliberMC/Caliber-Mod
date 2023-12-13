package com.calibermc.caliber.world.inventory.kiln;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.entity.KilnBlockEntity;
import com.calibermc.caliber.crafting.KilnRecipe;
import com.calibermc.caliber.crafting.ModRecipeSerializers;
import com.calibermc.caliber.world.inventory.ModMenuTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.ForgeEventFactory;

public class KilnMenu extends RecipeBookMenu<Container> {

    protected final Level level;
    private final Container container;
    private final ContainerData data;
    private final RecipeType<? extends KilnRecipe> recipeType;
    private final RecipeBookType recipeBookType;

    public KilnMenu(int pContainerId, Inventory pPlayerInventory) {
        this(ModMenuTypes.KILN.get(), ModRecipeSerializers.ALLOYING_TYPE.get(), Caliber.KLIN_BOOK_TYPE, pContainerId, pPlayerInventory);
    }

    public KilnMenu(int pContainerId, Inventory pPlayerInventory, Container pFurnaceContainer, ContainerData pFurnaceData) {
        this(ModMenuTypes.KILN.get(), ModRecipeSerializers.ALLOYING_TYPE.get(), Caliber.KLIN_BOOK_TYPE, pContainerId, pPlayerInventory, pFurnaceContainer, pFurnaceData);
    }

    protected KilnMenu(MenuType<?> pMenuType, RecipeType<? extends KilnRecipe> pRecipeType, RecipeBookType pRecipeBookType, int pContainerId, Inventory pPlayerInventory) {
        this(pMenuType, pRecipeType, pRecipeBookType, pContainerId, pPlayerInventory, new SimpleContainer(4), new SimpleContainerData(4));
    }

    protected KilnMenu(MenuType<?> pMenuType, RecipeType<? extends KilnRecipe> pRecipeType, RecipeBookType pRecipeBookType, int pContainerId, Inventory pPlayerInventory, Container pContainer, ContainerData pData) {
        super(pMenuType, pContainerId);
        this.recipeType = pRecipeType;
        this.recipeBookType = pRecipeBookType;
        checkContainerSize(pContainer, 4);
        checkContainerDataCount(pData, 4);
        this.container = pContainer;
        this.data = pData;
        this.level = pPlayerInventory.player.level;
        this.addSlot(new Slot(pContainer, 0, 38, 17));
        this.addSlot(new Slot(pContainer, 1, 74, 17));
        // fuel slot
        this.addSlot(new Slot(pContainer, 2, 56, 53) {
           @Override
           public boolean mayPlace(ItemStack pStack) {
              return KilnMenu.this.isFuel(pStack) || pStack.is(Items.BUCKET);
           }

           public int getMaxStackSize(ItemStack pStack) {
              return pStack.is(Items.BUCKET) ? 1 : super.getMaxStackSize(pStack);
           }
        });
        this.addSlot(new ResultSlot(pPlayerInventory.player, pContainer, 3, 116, 35));

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(pPlayerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k) {
            this.addSlot(new Slot(pPlayerInventory, k, 8 + k * 18, 142));
        }

        this.addDataSlots(pData);
    }

   @Override
   public void fillCraftSlotsStackedContents(StackedContents pItemHelper) {
        if (this.container instanceof StackedContentsCompatible) {
            ((StackedContentsCompatible) this.container).fillStackedContents(pItemHelper);
        }

    }

    @Override
   public void clearCraftingContent() {
       this.getSlot(0).set(ItemStack.EMPTY);
       this.getSlot(1).set(ItemStack.EMPTY);
       this.getSlot(3).set(ItemStack.EMPTY);
    }

   @Override
   public boolean recipeMatches(Recipe<? super Container> pRecipe) {
        return pRecipe.matches(this.container, this.level);
    }

   @Override
   public int getResultSlotIndex() {
        return 3;
    }

   @Override
   public int getGridWidth() {
        return 2;
    }

   @Override
   public int getGridHeight() {
        return 1;
    }

   @Override
   public int getSize() {
        return 4;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return this.container.stillValid(pPlayer);
    }

    /**
     * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player
     * inventory and the other inventory(s).
     */
    @Override
    public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(pIndex);
        if (slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (pIndex == 3) {
                if (!this.moveItemStackTo(itemstack1, 4, 40, true)) {
                    return ItemStack.EMPTY;
                }

                slot.onQuickCraft(itemstack1, itemstack);
            } else if (pIndex != 2 && pIndex != 1 && pIndex != 0) {
                if (this.canSmelt(itemstack1)) {
                    if (!this.moveItemStackTo(itemstack1, 0, 2, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (this.isFuel(itemstack1)) {
                    if (!this.moveItemStackTo(itemstack1, 2, 3, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (pIndex >= 4 && pIndex < 31) {
                    if (!this.moveItemStackTo(itemstack1, 31, 40, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (pIndex >= 31 && pIndex < 40 && !this.moveItemStackTo(itemstack1, 4, 31, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 4, 40, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(pPlayer, itemstack1);
        }

        return itemstack;
    }

    protected boolean canSmelt(ItemStack pStack) {
        for (KilnRecipe kilnRecipe : this.level.getRecipeManager().getAllRecipesFor(this.recipeType)) {
            Ingredient first = kilnRecipe.getIngredients().get(0);
            Ingredient second = kilnRecipe.getIngredients().get(1);
            ItemStack secondItem = this.getItems().get(1);
            if (second.test(secondItem)) {
                if (first.test(pStack)) {
                    return true;
                }
            } else {
                if (first.test(pStack) || second.test(pStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean isFuel(ItemStack pStack) {
        return net.minecraftforge.common.ForgeHooks.getBurnTime(pStack, this.recipeType) > 0;
    }

    public int getBurnProgress() {
        int i = this.data.get(2);
        int j = this.data.get(3);
        return j != 0 && i != 0 ? i * 24 / j : 0;
    }

    public int getLitProgress() {
        int i = this.data.get(1);
        if (i == 0) {
            i = 200;
        }

        return this.data.get(0) * 13 / i;
    }

    public boolean isLit() {
        return this.data.get(0) > 0;
    }

   @Override
   public RecipeBookType getRecipeBookType() {
        return this.recipeBookType;
    }

    @Override
    public boolean shouldMoveToInventory(int pSlotIndex) {
        return pSlotIndex != 2;
    }


    private static class ResultSlot extends Slot {
       private final Player player;
       private int removeCount;

       public ResultSlot(Player pPlayer, Container pContainer, int pSlot, int pXPosition, int pYPosition) {
          super(pContainer, pSlot, pXPosition, pYPosition);
          this.player = pPlayer;
       }

       @Override
       public boolean mayPlace(ItemStack pStack) {
          return false;
       }

       @Override
       public ItemStack remove(int pAmount) {
          if (this.hasItem()) {
             this.removeCount += Math.min(pAmount, this.getItem().getCount());
          }

          return super.remove(pAmount);
       }

       @Override
       public void onTake(Player pPlayer, ItemStack pStack) {
          this.checkTakeAchievements(pStack);
          super.onTake(pPlayer, pStack);
       }

       /**
        * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood. Typically increases an
        * internal count then calls onCrafting(item).
        */
       @Override
       protected void onQuickCraft(ItemStack pStack, int pAmount) {
          this.removeCount += pAmount;
          this.checkTakeAchievements(pStack);
       }

       /**
        * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood.
        */
       @Override
       protected void checkTakeAchievements(ItemStack pStack) {
          pStack.onCraftedBy(this.player.level, this.player, this.removeCount);
          if (this.player instanceof ServerPlayer serverPlayer && this.container instanceof KilnBlockEntity e) {
              e.awardUsedRecipesAndPopExperience(serverPlayer);
          }

          this.removeCount = 0;
          ForgeEventFactory.firePlayerSmeltedEvent(this.player, pStack);
       }
    }
}