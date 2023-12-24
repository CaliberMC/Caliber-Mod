package com.calibermc.caliber.block.properties;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.data.ModBlockFamily;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockRenderLayers {
    public static void set() {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOODCUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
    }
}

