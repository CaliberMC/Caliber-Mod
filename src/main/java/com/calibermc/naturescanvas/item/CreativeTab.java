package com.calibermc.naturescanvas.item;

import com.calibermc.naturescanvas.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab NATURESCANVAS_TAB = new CreativeModeTab("naturescanvastab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.POLISHED_PINK_MARBLE.get());
        }
    };

}
