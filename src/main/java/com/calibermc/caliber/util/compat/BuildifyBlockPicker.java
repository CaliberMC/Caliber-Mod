package com.calibermc.caliber.util.compat;

import com.calibermc.buildify.util.BlockPickerStatesJson;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.data.ModBlockFamilies;
import com.calibermc.caliber.data.ModBlockFamily;
import com.google.common.collect.Lists;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildifyBlockPicker {

    public static void init() {
        for (ModBlockFamily modBlockFamily : ModBlockFamilies.getAllFamilies().toList()) {
            BlockPickerStatesJson.registerBlockFamily(modBlockFamily.getBaseBlock(), () ->
                    new ArrayList<>(modBlockFamily.getVariants().entrySet().stream()
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_SIGN))
                            .map(p -> p.getValue().asItem().getDefaultInstance()).toList()));
        }
    }

//    public void init() {
//        // Example of registering a block family
//        Buildify.BlockPickerAPI.registerBlockFamily(Blocks.ANDESITE, () -> {
//            // Return a list of ItemStacks representing the block family
//            return Arrays.asList(
//                    new ItemStack(ModBlocks.ANDESITE_ARCH.get()),
//                    new ItemStack(ModBlocks.ANDESITE_ARCH_HALF.get()),
//                    new ItemStack(ModBlocks.ANDESITE_ARCH_LARGE.get()),
//                    new ItemStack(ModBlocks.ANDESITE_ARCH_LARGE_HALF.get()),
//                    new ItemStack(ModBlocks.ANDESITE_ARROWSLIT.get()),
//                    new ItemStack(ModBlocks.ANDESITE_BALUSTRADE.get()),
//                    new ItemStack(ModBlocks.ANDESITE_CAPITAL.get()),
//                    new ItemStack(ModBlocks.ANDESITE_CORNER.get()),
//                    new ItemStack(ModBlocks.ANDESITE_CORNER_SLAB.get()),
//                    new ItemStack(ModBlocks.ANDESITE_CORNER_SLAB_VERTICAL.get()),
//                    new ItemStack(ModBlocks.ANDESITE_EIGHTH.get()),
//                    new ItemStack(ModBlocks.ANDESITE_PILLAR.get()),
//                    new ItemStack(ModBlocks.ANDESITE_QUARTER.get()),
//                    new ItemStack(ModBlocks.ANDESITE_QUARTER_VERTICAL.get()),
//                    new ItemStack(ModBlocks.ANDESITE_SLAB.get()),
//                    new ItemStack(ModBlocks.ANDESITE_SLAB_VERTICAL.get()),
//                    new ItemStack(Blocks.ANDESITE_STAIRS),
//                    new ItemStack(Blocks.ANDESITE_WALL),
//                    new ItemStack(ModBlocks.ANDESITE_WINDOW.get()),
//                    new ItemStack(ModBlocks.ANDESITE_WINDOW_HALF.get())
//            );
//                    // ... add more variants as needed
//        });
//    }
}

