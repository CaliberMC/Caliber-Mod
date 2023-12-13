package com.calibermc.caliber.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BRONZE = new ForgeTier(2, 750, 8.0f,
            3.0f, 18, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));

    public static final ForgeTier STEEL = new ForgeTier(3, 2500, 12.0f,
            4.0f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
}

