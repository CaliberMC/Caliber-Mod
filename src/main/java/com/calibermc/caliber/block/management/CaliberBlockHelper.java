package com.calibermc.caliber.block.management;

import com.calibermc.caliber.block.custom.*;
import com.calibermc.caliber.block.shapes.CornerShape;
import com.calibermc.caliber.block.shapes.VerticalQuarterShape;
import com.calibermc.caliber.block.shapes.VerticalSlabShape;
import com.calibermc.caliber.data.datagen.ModBlockStateProvider;
import com.calibermc.caliber.util.ModBlockStateProperties;
import com.google.common.collect.Lists;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

import static com.calibermc.caliber.data.ModBlockFamily.Variant;
import static com.calibermc.caliber.data.ModBlockFamily.Variant.*;

public class CaliberBlockHelper {

    // most used variants of blocks
    public static final List<Variant> VARIANTS = Lists.newArrayList(Variant.ARCH, Variant.ARCH_HALF, Variant.ARCH_LARGE,
            Variant.ARCH_LARGE_HALF, Variant.ARROWSLIT, Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER,
            Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR, Variant.QUARTER,
            Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> WOOD_VARIANTS = Lists.newArrayList(Variant.BEAM_HORIZONTAL, Variant.BEAM_LINTEL,
            Variant.BEAM_POSTS, Variant.BEAM_VERTICAL, Variant.DOOR_FRAME, Variant.DOOR_FRAME_LINTEL);

    public static final List<Variant> VANILLA_WOOD_VARIANTS = Lists.newArrayList(Variant.FENCE, Variant.FENCE_GATE, Variant.PRESSURE_PLATE);

    // full list
//    public static final List<Variant> VANILLA_WOOD_VARIANTS = Lists.newArrayList(Variant.BUTTON, Variant.DOOR, Variant.TRAPDOOR,
//            Variant.FENCE_GATE, Variant.FENCE, Variant.PRESSURE_PLATE, Variant.SIGN, Variant.WALL_SIGN);

    public static final List<Variant> STONE_VARIANTS = Lists.newArrayList(Variant.ARCH, Variant.ARCH_HALF, Variant.ARCH_LARGE,
            Variant.ARCH_LARGE_HALF, Variant.ARROWSLIT);

    public static final List<Variant> ROOF_VARIANTS = Lists.newArrayList(Variant.ROOF_PEAK, Variant.ROOF_22, Variant.ROOF_45,
            Variant.ROOF_67, Variant.CORNER, Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.PILLAR, Variant.QUARTER, Variant.QUARTER_VERTICAL,
            Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS);

//    public static final List<Variant> FURNITURE_VARIANTS =

//    public static final List<Variant> LIGHTING_VARIANTS =

//    public static final List<Variant> GLASS_VARIANTS =

    public static final List<Variant> TUDOR_VARIANTS = Lists.newArrayList(CROSS, DOWN, UP, LEFT, RIGHT, HORIZONTAL_1, HORIZONTAL_2, VERTICAL_1, VERTICAL_2);

    public static <T> List<T> modifyList(List<T> list, Consumer<List<T>> consumer) {
        List<T> newList = new ArrayList<>(list);
        consumer.accept(newList);
        return newList;
    }


    // Asset & Data Generation presets
    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ARCH = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<ArchBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) -> provider.archBlock(block, top, top, top), provider::archBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ARCH_HALF = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<HalfArchBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.archHalfBlock(block, top, top, top), provider::archHalfBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ARCH_LARGE = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<LargeArchBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.archLargeBlock(block, top, top, top), provider::archLargeBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ARCH_LARGE_HALF = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<LargeHalfArchBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.archLargeHalfBlock(block, top, top, top), provider::archLargeHalfBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ARROWSLIT = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<ArrowSlitBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.arrowslitBlock(block, top, top, top), provider::arrowslitBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> BALUSTRADE = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<BalustradeBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.balustradeBlock(block, top, top, top), provider::balustradeBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> BEAM_LINTEL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<BeamLintelBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.beamLintelBlock(block, top, top, top), provider::beamLintelBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> BEAM_HORIZONTAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<HorizontalBeamBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.beamHorizontalBlock(block, tex), provider::beamHorizontalBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> BEAM_POSTS = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<BeamPostsBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.beamPostsBlock(block, tex), provider::beamPostsBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> BEAM_VERTICAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<VerticalBeamBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.beamVerticalBlock(block, tex), provider::beamVerticalBlock);

//    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> BUTTON = (textureFrom) -> (b, provider) ->
//            provider.buttonBlock((StoneButtonBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

//    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> WOOD_BUTTON = (textureFrom) -> (b, provider) ->
//            provider.buttonBlock((WoodButtonBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> BUTTON = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<StoneButtonBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) -> {
                provider.buttonBlock(block, top);
                provider.models().buttonInventory(provider.name(block) + "_inventory", top);
            }, (block, texture) -> {
                provider.buttonBlock(block, texture);
                provider.models().buttonInventory(provider.name(block) + "_inventory", texture);
            });

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> CAPITAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<CapitalBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.capitalBlock(block, top, top, top), provider::capitalBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> CORNER = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<CornerLayerBlock>fixBlockTex(textureFrom, b, provider, provider::cornerLayerBlock, provider::cornerLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> CORNER_SLAB = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<CornerSlabBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.cornerSlabBlock(block, top, top, top), provider::cornerSlabBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> CORNER_SLAB_VERTICAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<VerticalCornerSlabBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.cornerSlabVerticalBlock(block, top, top, top), provider::cornerSlabVerticalBlock);

//    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> DOOR = (textureFrom) -> (b, provider) ->
//            provider.doorBlock((DoorBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom + "_bottom")), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

//    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> DOOR = (textureFrom) -> (b, provider) ->
//            CaliberBlockHelper.<DoorBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
//                    provider.doorBlock(block, tex + "_door", bottom, top), provider::doorBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> DOOR_FRAME = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<DoorFrameBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.doorFrameBlock(block, tex), provider::doorFrameBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> DOOR_FRAME_LINTEL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<DoorFrameLintelBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.doorFrameLintelBlock(block, tex), provider::doorFrameLintelBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> EIGHTH = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<EighthBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.eighthBlock(block, top, top, top), provider::eighthBlock);

//    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> FENCE = (textureFrom) -> (b, provider) ->
//            provider.fenceBlock((FenceBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> FENCE = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<FenceBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) -> {
                provider.fenceBlock(block, top);
                provider.models().fenceInventory(provider.name(block) + "_inventory", top);
            }, (block, texture) -> {
                provider.fenceBlock(block, texture);
                provider.models().fenceInventory(provider.name(block) + "_inventory", texture);
            });

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> FENCE_GATE = (textureFrom) -> (b, provider) ->
            provider.fenceGateBlock((FenceGateBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> PILLAR = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<PillarLayerBlock>fixBlockTex(textureFrom, b, provider, provider::pillarLayerBlock, provider::pillarLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> PRESSURE_PLATE = (textureFrom) -> (b, provider) ->
            provider.pressurePlateBlock((PressurePlateBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

//    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> SIGN = (textureFrom) -> (b, provider) ->
//            provider.signBlock((StandingSignBlock) b.get(), (WallSignBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

//    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> TRAP_DOOR = (textureFrom) -> (b, provider) ->
//            provider.trapdoorBlock((TrapDoorBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)), true);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> QUARTER = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<QuarterLayerBlock>fixBlockTex(textureFrom, b, provider, provider::quarterLayerBlock, provider::quarterLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> VERTICAL_QUARTER = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<VerticalQuarterLayerBlock>fixBlockTex(textureFrom, b, provider, provider::quarterLayerVerticalBlock, provider::quarterLayerVerticalBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ROOF_22 = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<Roof22Block>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.roof22Block(block, tex), provider::roof22Block);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ROOF_45 = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<Roof45Block>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.roof45Block(block, tex), provider::roof45Block);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ROOF_67 = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<Roof67Block>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.roof67Block(block, tex), provider::roof67Block);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> ROOF_PEAK = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<RoofPeakBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.roofPeakBlock(block, tex), provider::roofPeakBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> SLAB = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<SlabLayerBlock>fixBlockTex(textureFrom, b, provider, provider::slabLayerBlock, provider::slabLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> SLAB_VERTICAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<VerticalSlabLayerBlock>fixBlockTex(textureFrom, b, provider, provider::slabVerticalLayerBlock, provider::slabVerticalLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> STAIRS = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<StairBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.stairsBlock(block, top, top, top), provider::stairsBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> WALL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<WallBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) -> {
                provider.wallBlock(block, top);
                provider.models().wallInventory(provider.name(block) + "_inventory", top);
            }, (block, texture) -> {
                provider.wallBlock(block, texture);
                provider.models().wallInventory(provider.name(block) + "_inventory", texture);
            });

    public static final BiFunction<String, Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> WINDOW = (s, textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<WindowBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) ->
                    provider.windowBlock(block, top, top, top), provider::windowBlock);

    public static final BiFunction<String, Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> WINDOW_HALF = (s, textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<HalfWindowBlock>fixBlockTex(textureFrom, b, provider, (block, side, top, bottom, tex) -> provider.windowHalfBlock(block, top, top, top), provider::windowHalfBlock);

    public static final Function<Supplier<Block>, BiConsumer<RegistryObject<Block>, ModBlockStateProvider>> TUDOR = (textureFrom) -> (b, provider) -> {
        ResourceLocation registryName = b.getId();
        if (registryName != null) {
            ModelFile file;
            String name = registryName.getPath();
            ResourceLocation resourceFrom = provider.blockTexture(BlockManager.getMainBy(b, textureFrom));
            if (resourceFrom.getPath().contains("_wood")) {
                resourceFrom = new ResourceLocation(resourceFrom.getNamespace(), resourceFrom.getPath().replace("_wood", "_log"));
            }
            if (name.contains("_corner")) {
                name = name.replace("_corner", "");
                file = provider.models().withExistingParent(registryName.getPath(), provider.modLoc("block/templates/corner"))
                        .texture("side", provider.modLoc("block/%s".formatted(name)))
                        .texture("bottom", resourceFrom)
                        .texture("top", resourceFrom);

                provider.getVariantBuilder(b.get()).forAllStatesExcept(state -> {
                    Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    CornerShape cornerShape = state.getValue(ModBlockStateProperties.CORNER_SHAPE);
                    int y = 0;
                    if (facing == Direction.EAST && cornerShape == CornerShape.RIGHT
                            || facing == Direction.SOUTH && cornerShape == CornerShape.LEFT) {
                        y = 90;
                    } else if (facing == Direction.SOUTH && cornerShape == CornerShape.RIGHT
                            || facing == Direction.WEST && cornerShape == CornerShape.LEFT) {
                        y = 180;
                    } else if (facing == Direction.WEST && cornerShape == CornerShape.RIGHT
                            || facing == Direction.NORTH && cornerShape == CornerShape.LEFT) {
                        y = 270;
                    }

                    return ConfiguredModel.builder().modelFile(file).rotationY(y).build();
                }, BlockStateProperties.WATERLOGGED);
            } else if (name.contains("_quarter_vertical")) {
                name = name.replace("_quarter_vertical", "");
                file = provider.models().withExistingParent(registryName.getPath(), provider.modLoc("block/templates/quarter_vertical"))
                        .texture("side", provider.modLoc("block/%s".formatted(name)))
                        .texture("bottom", resourceFrom)
                        .texture("top", resourceFrom);
                final String finalName = name;
                ResourceLocation finalResourceFrom = resourceFrom;
                provider.getVariantBuilder(b.get()).forAllStatesExcept(state -> {
                    Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    VerticalQuarterShape shape = state.getValue(ModBlockStateProperties.VERTICAL_QUARTER_SHAPE);
                    int y = 0;
                    if (facing == Direction.EAST) {
                        y = 90;
                    } else if (facing == Direction.SOUTH) {
                        y = 180;
                    } else if (facing == Direction.WEST) {
                        y = 270;
                    }

                    if (shape == VerticalQuarterShape.LEFT) {
                        return ConfiguredModel.builder().modelFile(provider.models().withExistingParent(registryName.getPath(), provider.modLoc("block/templates/quarter_vertical_left"))
                                        .texture("side", provider.modLoc("block/%s".formatted(finalName)))
                                        .texture("bottom", finalResourceFrom)
                                        .texture("top", finalResourceFrom))
                                .rotationY(y).build();
                    }
                    if (shape == VerticalQuarterShape.DOUBLE) {
                        return ConfiguredModel.builder().modelFile(provider.models().withExistingParent(registryName.getPath(), provider.modLoc("block/templates/slab_vertical"))
                                        .texture("side", provider.modLoc("block/%s".formatted(finalName)))
                                        .texture("bottom", finalResourceFrom)
                                        .texture("top", finalResourceFrom))
                                .rotationY(y).build();
                    }

                    return ConfiguredModel.builder().modelFile(file).rotationY(y).build();
                }, BlockStateProperties.WATERLOGGED);

            } else if (name.contains("_slab_vertical")) {
                name = name.replace("_slab_vertical", "");
                file = textures(provider.models().withExistingParent(registryName.getPath(),
                        provider.modLoc("block/templates/slab_vertical")), resourceFrom);
                final String finalName = name;
                ResourceLocation finalResourceFrom1 = resourceFrom;
                provider.getVariantBuilder(b.get()).forAllStatesExcept(state -> {
                    Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    VerticalSlabShape shape = state.getValue(ModBlockStateProperties.VERTICAL_SLAB_SHAPE);
                    int y = 0;
                    if (facing == Direction.EAST) {
                        y = 90;
                    } else if (facing == Direction.SOUTH) {
                        y = 180;
                    } else if (facing == Direction.WEST) {
                        y = 270;
                    }

                    if (shape == VerticalSlabShape.DOUBLE) {
                        return ConfiguredModel.builder().modelFile(provider.models().cubeBottomTop(finalName, provider.modLoc("block/%s".formatted(finalName)), finalResourceFrom1, finalResourceFrom1))
                                .rotationY(y).build();
                    }

                    return ConfiguredModel.builder().modelFile(file).rotationY(y).build();
                }, BlockStateProperties.WATERLOGGED);
            } else {
                file = provider.models().cubeBottomTop(registryName.getPath(), provider.modLoc("block/%s".formatted(name)), resourceFrom, resourceFrom);
                provider.simpleBlock(b.get(), file);
            }
        }
    };


    public static <T extends ModelBuilder<T>> T textures(T builder, ResourceLocation location) {
        ResourceLocation sideLoc = location;
        ResourceLocation bottomLoc = location;
        ResourceLocation topLoc = location;
        if (location.getPath().equals("block/basalt") || location.getPath().equals("block/polished_basalt")) {
            sideLoc = new ResourceLocation(location.getNamespace(), location.getPath() + "_side");
            bottomLoc = topLoc = new ResourceLocation(location.getNamespace(), location.getPath() + "_top");
        }

        return builder.texture("side", sideLoc)
                .texture("bottom", bottomLoc)
                .texture("top", topLoc);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Block> void fixBlockTex(Supplier<Block> textureFrom, RegistryObject<Block> b, ModBlockStateProvider provider, BlockGenLayerWithSides<T> genWithSides, BlockGenWithBaseBlock<T> gen) {
        ResourceLocation tex = provider.blockTexture(BlockManager.getMainBy(b, textureFrom));
        if (tex.getPath().contains("_wood")) {
            tex = new ResourceLocation(tex.getNamespace(), tex.getPath().replace("_wood", "_log"));
        }
        if (tex.getPath().contains("_hyphae")) {
            tex = new ResourceLocation(tex.getNamespace(), tex.getPath().replace("_hyphae", "_stem"));
        }
        if (tex.getPath().equals("block/basalt") || tex.getPath().equals("block/polished_basalt")
                || tex.getPath().contains("quartz")) {
            ResourceLocation side = new ResourceLocation(tex.getNamespace(), tex.getPath() + "_side");
            ResourceLocation top = new ResourceLocation(tex.getNamespace(), tex.getPath() + "_top");
            if (tex.getPath().equals("block/smooth_quartz")) {
                side = new ResourceLocation(tex.getNamespace(), "block/quartz_block_bottom");
                top = side;
            }
            genWithSides.data((T) b.get(), side, top, top, tex);
        } else if (tex.getPath().contains("sandstone")) {
            String modifiedPath = tex.getPath();
            if (tex.getPath().contains("smooth")) {
                modifiedPath = modifiedPath.replace("smooth_", "");
            } else if (tex.getPath().contains("cut")) {
                modifiedPath = modifiedPath.replace("cut_", "");
            }
            ResourceLocation top = new ResourceLocation(tex.getNamespace(), modifiedPath + "_top");
            if (modifiedPath.startsWith("block/sandstone") || modifiedPath.startsWith("block/cut_sandstone")
                    || modifiedPath.startsWith("block/red_sandstone") || modifiedPath.startsWith("block/cut_red_sandstone")) {
                top = new ResourceLocation("minecraft", modifiedPath + "_top");
                tex = new ResourceLocation("minecraft", modifiedPath);
                genWithSides.data((T) b.get(), top, top, top, tex);
            } else {
                genWithSides.data((T) b.get(), top, top, top, tex);
            }
        } else {
            gen.data((T) b.get(), tex);
        }
    }


    @FunctionalInterface
    interface BlockGenLayerWithSides<T extends Block> {
        void data(T block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom, ResourceLocation baseBlock);
    }

    @FunctionalInterface
    interface BlockGenWithBaseBlock<T extends Block> {
        void data(T block, ResourceLocation baseBlock);
    }
}