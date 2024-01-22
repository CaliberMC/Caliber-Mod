package com.calibermc.caliberlib.data.datagen;

import com.calibermc.caliberlib.block.custom.*;
import com.calibermc.caliberlib.block.custom.terrain.*;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.function.Supplier;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator.getPackOutput(), modid, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        blockItemModels();
    }


    private void blockItemModels() {
        // register item models with help of block manager, also can be used for generating block models if change
        for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS.get(this.modid)) {
            for (Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e : blockManager.getBlocks().entrySet()) {
                ModBlockFamily.Variant variant = e.getKey().variant;
                String blockName = e.getValue().getFirst().getPath();
                String parentName = blockName;

                if (variant.equals(ModBlockFamily.Variant.ARCH)) {
                    parentName += "_trim_2";
                }

                if (variant.equals(ModBlockFamily.Variant.CORNER)
                        || variant.equals(ModBlockFamily.Variant.PILLAR)
                        || variant.equals(ModBlockFamily.Variant.QUARTER)
                        || variant.equals(ModBlockFamily.Variant.QUARTER_VERTICAL)) {
                    parentName += "_layer_3";
                }

                if (variant.equals(ModBlockFamily.Variant.SLAB) || variant.equals(ModBlockFamily.Variant.SLAB_VERTICAL)) {
                    parentName += "_layer_4";
                }

                if (variant.equals(ModBlockFamily.Variant.LAYER)
                        || variant.equals(ModBlockFamily.Variant.BEAM_LINTEL)
                        || variant.equals(ModBlockFamily.Variant.DOOR_FRAME_LINTEL)
                        || variant.equals(ModBlockFamily.Variant.BEAM_POSTS)
                        || variant.equals(ModBlockFamily.Variant.DOOR_FRAME)
                        || variant.equals(ModBlockFamily.Variant.BEAM_HORIZONTAL)) {
                    parentName += "_1";
                }

                if (variant.equals(ModBlockFamily.Variant.BEAM_VERTICAL)) {
                    parentName += "_3";
                }

                if (variant.equals(ModBlockFamily.Variant.BUTTON)
                        || variant.equals(ModBlockFamily.Variant.FENCE)
                        || variant.equals(ModBlockFamily.Variant.WALL)
                        || variant.equals(ModBlockFamily.Variant.ROOF_67)) {
                    parentName += "_inventory";
                }

                if (variant.equals(ModBlockFamily.Variant.TRAPDOOR)) {
                    parentName += "_bottom";
                }

                withExistingParent(blockName, modLoc("block/" + parentName));
            }
        }

        // Register Block Item Models
        ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> {
                    ResourceLocation registryName = ForgeRegistries.BLOCKS.getKey(block);
                    return BlockManager.ALL_BLOCKS.stream().map(Supplier::get).noneMatch(b -> b.equals(block))
                            && registryName != null && registryName.getNamespace().equals(this.modid)
                            && !(block instanceof WallSignBlock);
                }) // Exclude WallSignBlock instances
                .forEach(block -> {
                    String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();
                    String parentName = blockName;

                    if (block instanceof ArchBlock) {
                        parentName += "_trim_2";
                    }


                    if (block instanceof CornerLayerBlock
                            || block instanceof PillarLayerBlock
                            || block instanceof QuarterLayerBlock
                            || block instanceof VerticalQuarterLayerBlock) {
                        parentName += "_layer_3";
                    }

                    if (block instanceof SlabLayerBlock || block instanceof VerticalSlabLayerBlock) {
                        parentName += "_layer_4";
                    }

                    if (block instanceof FallingLayerBlock
                            || block instanceof FarmLayerBlock
                            || block instanceof GrassLayerBlock
                            || block instanceof MyceliumLayerBlock
                            || block instanceof NyliumLayerBlock
                            || block instanceof SoulSandLayerBlock
                            || block instanceof TerrainLayerBlock
                            || block instanceof BeamLintelBlock
                            || block instanceof DoorFrameLintelBlock
                            || block instanceof BeamPostsBlock
                            || block instanceof DoorFrameBlock
                            || block instanceof HorizontalBeamBlock) {
                        parentName += "_1";
                    }

                    if (block instanceof VerticalBeamBlock) {
                        parentName += "_3";
                    }


                    if (block instanceof ButtonBlock
                            || block instanceof FenceBlock
                            || block instanceof WallBlock
                            || block instanceof Roof67Block) {
                        parentName += "_inventory";
                    }

                    if (block instanceof TrapDoorBlock) {
                        parentName += "_bottom";
                    }

                    try {
                        if (block instanceof DoorBlock || block instanceof StandingSignBlock || block instanceof TallDoorBlock) {
                            withExistingParent(blockName, new ResourceLocation("item/generated"))
                                    .texture("layer0", new ResourceLocation(this.modid, "item/" + parentName));
                        } else {
                            withExistingParent(blockName, modLoc("block/" + parentName));
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
    }
}
