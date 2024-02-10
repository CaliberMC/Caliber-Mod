package com.calibermc.caliber.block.properties;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockRenderLayers {
    public static void set() {
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.WOODCUTTER.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_ACACIA_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_BIRCH_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_DARK_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_JUNGLE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_OAK_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_22), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_45), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_67), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_SPRUCE_SHINGLES.get(ModBlockFamily.Variant.ROOF_PEAK), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_ACACIA_DOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_ACACIA_TRAPDOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_BIRCH_DOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_BIRCH_TRAPDOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_DARK_OAK_DOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_JUNGLE_DOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_JUNGLE_TRAPDOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_OAK_DOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_OAK_TRAPDOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_SPRUCE_DOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.STAINED_SPRUCE_TRAPDOOR.get(), RenderType.translucent());
        
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_ACACIA_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_BIRCH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_DARK_OAK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_JUNGLE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_OAK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_SPRUCE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_CRIMSON_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_WARPED_DOOR.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_STAINED_ACACIA_DOOR.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_STAINED_BIRCH_DOOR.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_STAINED_JUNGLE_DOOR.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_STAINED_OAK_DOOR.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(CaliberBlocks.TALL_STAINED_SPRUCE_DOOR.get(), RenderType.cutout());
        

    }
}

