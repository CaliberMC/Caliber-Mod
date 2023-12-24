package com.calibermc.caliber.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.custom.*;
import com.calibermc.caliber.block.custom.entity.WoodcutterBlock;
import com.calibermc.caliber.block.custom.terrain.*;
import com.calibermc.caliber.block.management.BlockManager;
import com.calibermc.caliber.data.ModBlockFamily;
import com.calibermc.caliber.item.ModItems;
import com.calibermc.caliber.item.custom.Hammer;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;
import java.util.function.Consumer;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Caliber.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        blockItemModels();
        itemModels();
    }


    private void blockItemModels() {
        // register item models with help of block manager, also can be used for generating block models if change
        for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS) {
            for (Map.Entry<BlockManager.BlockAdditional, RegistryObject<Block>> e : blockManager.getBlocks().entrySet()) {
                ModBlockFamily.Variant variant = e.getKey().variant;
                String blockName = e.getValue().getId().getPath();
                String parentName = blockName;

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

                if (variant.equals(ModBlockFamily.Variant.WALL)) {
                    parentName += "_inventory";
                }

                if (variant.equals(ModBlockFamily.Variant.ROOF_22)) {
                    parentName += "_top";
                }

                withExistingParent(blockName, modLoc("block/" + parentName));
            }
        }

        // Register Block Item Models
        ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> BlockManager.ALL_BLOCKS.stream().map(RegistryObject::get).noneMatch(b -> b.equals(block))
                        && block.getRegistryName() != null && block.getRegistryName().getNamespace().equals(Caliber.MOD_ID))
                .forEach(block -> {
                    String blockName = block.getRegistryName().getPath();
                    String parentName = blockName;

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

                    if (block instanceof WallBlock) {
                        parentName += "_inventory";
                    }

                    if (block instanceof Roof22Block) {
                        parentName += "_top";
                    }

                    try {
                        withExistingParent(blockName, modLoc("block/" + parentName));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
    }

    private void itemModels() {
        // Register Item Models
        ModItems.ITEMS.getEntries().stream()
                .filter(itemRegistryObject -> {
                    // Check if the item's registry name is in the Caliber.MOD_ID namespace
                    ResourceLocation registryName = itemRegistryObject.getId();
                    return registryName != null && Caliber.MOD_ID.equals(registryName.getNamespace());
                })
                .forEach(itemRegistryObject -> {
                    // Determine if the item is a tool
                    Item item = itemRegistryObject.get();
                    boolean isToolItem = item instanceof Hammer ||
                            item instanceof SwordItem ||
                            item instanceof PickaxeItem ||
                            item instanceof ShovelItem ||
                            item instanceof AxeItem ||
                            item instanceof HoeItem;

                    // Use handheldItem for tools
                    if (isToolItem) {
                        handheldItem(itemRegistryObject);
                    }
                    // Use simpleItem for items that are exactly instances of Item.class or ArmorItem.class
                    else if (item.getClass() == Item.class || item.getClass() == ArmorItem.class) {
                        simpleItem(itemRegistryObject);
                    }
                });
    }




//    private void itemModels() {
//        // Register Item Models
//        ModItems.ITEMS.getEntries().stream()
//                .filter(itemRegistryObject -> {
//                    // Check if the item's registry name is in the Caliber.MOD_ID namespace
//                    ResourceLocation registryName = itemRegistryObject.getId();
//                    boolean isModItem = registryName != null && Caliber.MOD_ID.equals(registryName.getNamespace());
//
//                    // Check if the item is exactly an instance of Item.class or Hammer.class
//                    Class<?> itemClass = itemRegistryObject.get().getClass();
//                    boolean isBaseOrHammerItemClass = itemClass == Item.class || itemClass == Hammer.class;
//
//                    return isModItem && isBaseOrHammerItemClass;
//                })
//                .forEach(itemRegistryObject -> {
//                    // Use the RegistryObject<Item> here
//                    simpleItem(itemRegistryObject);
//                });
//    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Caliber.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Caliber.MOD_ID,"item/" + item.getId().getPath()));
    }
}
