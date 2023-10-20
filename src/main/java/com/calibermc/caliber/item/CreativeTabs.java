package com.calibermc.caliber.item;

import com.calibermc.caliber.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {
    public static final CreativeModeTab CALIBER_TAB = new CreativeModeTab("calibertab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.POLISHED_PINK_MARBLE.get());
        }
    };

}
