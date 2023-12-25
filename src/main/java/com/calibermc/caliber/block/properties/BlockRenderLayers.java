package com.calibermc.caliber.block.properties;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.management.CaliberBlockHelper;
import com.calibermc.caliber.data.ModBlockFamily;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockRenderLayers {
    public static void set() {
//        ItemBlockRenderTypes.setRenderLayer((Block) CaliberBlockHelper.ROOF_VARIANTS, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOODCUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_ACACIA_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_ACACIA_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_BIRCH_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_BIRCH_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_DARK_OAK_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_JUNGLE_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_JUNGLE_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_OAK_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_OAK_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_SPRUCE_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAINED_SPRUCE_TRAPDOOR.get(), RenderType.translucent());

    }
}

