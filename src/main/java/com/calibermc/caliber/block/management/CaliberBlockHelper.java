package com.calibermc.caliber.block.management;

import com.calibermc.caliber.block.custom.*;
import com.calibermc.caliber.data.datagen.ModBlockStateProvider;
import com.google.common.collect.Lists;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ModelBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

import static com.calibermc.caliber.data.ModBlockFamily.Variant;

public class CaliberBlockHelper {

    public static final List<Variant> VARIANTS = Lists.newArrayList(Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER,
            Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR, Variant.QUARTER,
            Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> STONE_VARIANTS = Lists.newArrayList(Variant.ARCH, Variant.ARCH_HALF, Variant.ARCH_LARGE,
            Variant.ARCH_LARGE_HALF, Variant.ARROWSLIT, Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER,
            Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR, Variant.QUARTER,
            Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> STONE_VARIANTS_WITHOUT_STAIRS = Lists.newArrayList(Variant.ARCH, Variant.ARCH_HALF, Variant.ARCH_LARGE,
            Variant.ARCH_LARGE_HALF, Variant.ARROWSLIT, Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER,
            Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR, Variant.QUARTER,
            Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.WALL, Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> STONE_VARIANTS_WITHOUT_STAIRS_WALL = Lists.newArrayList(Variant.ARCH, Variant.ARCH_HALF, Variant.ARCH_LARGE,
            Variant.ARCH_LARGE_HALF, Variant.ARROWSLIT, Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER, Variant.CORNER_SLAB,
            Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR, Variant.QUARTER, Variant.QUARTER_VERTICAL,
            Variant.SLAB, Variant.SLAB_VERTICAL, Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> PLANK_VARIANTS = Lists.newArrayList(Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER,
            Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.FENCE, Variant.FENCE_GATE, Variant.PILLAR, Variant.PRESSURE_PLATE,
            Variant.QUARTER, Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> BOARD_VARIANTS = Lists.newArrayList(Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER,
            Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR, Variant.PRESSURE_PLATE,
            Variant.QUARTER, Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> PLANK_VARIANTS_WITHOUT_FENCES_STAIRS = Lists.newArrayList(Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER,
            Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR, Variant.PRESSURE_PLATE,
            Variant.QUARTER, Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.WALL, Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> STRIPPED_WOOD_VARIANTS = Lists.newArrayList(Variant.BALUSTRADE, Variant.BEAM_HORIZONTAL,
            Variant.BEAM_LINTEL, Variant.BEAM_POSTS, Variant.BEAM_VERTICAL,Variant.CAPITAL, Variant.CORNER, Variant.CORNER_SLAB,
            Variant.CORNER_SLAB_VERTICAL, Variant.DOOR_FRAME, Variant.DOOR_FRAME_LINTEL, Variant.EIGHTH, Variant.PILLAR,
            Variant.QUARTER, Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL,
            Variant.WINDOW, Variant.WINDOW_HALF);

    public static final List<Variant> TERRACOTTA_VARIANTS = Lists.newArrayList(Variant.ARCH, Variant.ARCH_HALF,
            Variant.ARCH_LARGE, Variant.ARCH_LARGE_HALF, Variant.ARROWSLIT, Variant.BALUSTRADE, Variant.CAPITAL,
            Variant.CORNER, Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR,
            Variant.QUARTER, Variant.QUARTER_VERTICAL, Variant.ROOF_PEAK, Variant.ROOF_22, Variant.ROOF_45,
            Variant.ROOF_67, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW,
            Variant.WINDOW_HALF);

    public static final List<Variant> THATCH_VARIANTS = Lists.newArrayList(Variant.CAPITAL,
            Variant.CORNER, Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR,
            Variant.QUARTER, Variant.QUARTER_VERTICAL, Variant.ROOF_PEAK, Variant.ROOF_22, Variant.ROOF_45,
            Variant.ROOF_67, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW,
            Variant.WINDOW_HALF);

    public static final List<Variant> WOOL_VARIANTS = Lists.newArrayList(Variant.CAPITAL,
            Variant.CORNER, Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR,
            Variant.QUARTER, Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW,
            Variant.WINDOW_HALF);

    public static final List<Variant> TUDOR_VARIANTS = Lists.newArrayList(Variant.CORNER, Variant.QUARTER,
            Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL);

    public static final List<Variant> ROOF_VARIANTS = Lists.newArrayList(Variant.ROOF_PEAK, Variant.ROOF_22, Variant.ROOF_45, Variant.ROOF_67);

//    public static final List<Variant> FURNITURE_VARIANTS =

//    public static final List<Variant> LIGHTING_VARIANTS =

//    public static final List<Variant> GLASS_VARIANTS =

//    public static final List<Variant> OLD_TUDOR_VARIANTS = Lists.newArrayList(CROSS, DOWN, UP, LEFT, RIGHT, HORIZONTAL_1, HORIZONTAL_2, VERTICAL_1, VERTICAL_2);

    // REMOVE ONCE ALL BLOCKS ARE ADJUSTED
//    public static final List<Variant> VARIANTS = Lists.newArrayList(Variant.ARCH, Variant.ARCH_HALF, Variant.ARCH_LARGE,
//            Variant.ARCH_LARGE_HALF, Variant.ARROWSLIT, Variant.BALUSTRADE, Variant.CAPITAL, Variant.CORNER,
//            Variant.CORNER_SLAB, Variant.CORNER_SLAB_VERTICAL, Variant.EIGHTH, Variant.PILLAR, Variant.QUARTER,
//            Variant.QUARTER_VERTICAL, Variant.SLAB, Variant.SLAB_VERTICAL, Variant.STAIRS, Variant.WALL, Variant.WINDOW, Variant.WINDOW_HALF);

//    public static final List<Variant> WOOD_VARIANTS = Lists.newArrayList(Variant.BEAM_HORIZONTAL, Variant.BEAM_LINTEL,
//            Variant.BEAM_POSTS, Variant.BEAM_VERTICAL, Variant.DOOR_FRAME, Variant.DOOR_FRAME_LINTEL);
//
//    public static final List<Variant> VANILLA_WOOD_VARIANTS = Lists.newArrayList(Variant.FENCE, Variant.FENCE_GATE, Variant.PRESSURE_PLATE);

//    public static final List<Variant> STONE_VARIANTS = Lists.newArrayList(Variant.ARCH, Variant.ARCH_HALF, Variant.ARCH_LARGE,
//            Variant.ARCH_LARGE_HALF, Variant.ARROWSLIT);


    public static <T> List<T> modifyList(List<T> list, Consumer<List<T>> consumer) {
        List<T> newList = new ArrayList<>(list);
        consumer.accept(newList);
        return newList;
    }


    // Asset & Data Generation presets
    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ARCH = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<ArchBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) -> provider.archBlock(block, side, bottom, top), provider::archBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ARCH_HALF = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<HalfArchBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.archHalfBlock(block, side, bottom, top), provider::archHalfBlock);
    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ARCH_LARGE = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<LargeArchBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.archLargeBlock(block, side, bottom, top), provider::archLargeBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ARCH_LARGE_HALF = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<LargeHalfArchBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.archLargeHalfBlock(block, side, bottom, top), provider::archLargeHalfBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ARROWSLIT = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<ArrowSlitBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.arrowslitBlock(block, side, bottom, top), provider::arrowslitBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> BALUSTRADE = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<BalustradeBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.balustradeBlock(block, side, bottom, top), provider::balustradeBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> BEAM_LINTEL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<BeamLintelBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.beamLintelBlock(block, side, bottom, top), provider::beamLintelBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> BEAM_HORIZONTAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<HorizontalBeamBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.beamHorizontalBlock(block, tex), provider::beamHorizontalBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> BEAM_POSTS = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<BeamPostsBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.beamPostsBlock(block, tex), provider::beamPostsBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> BEAM_VERTICAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<VerticalBeamBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.beamVerticalBlock(block, tex), provider::beamVerticalBlock);

//    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> BUTTON = (textureFrom) -> (b, provider) ->
//            provider.buttonBlock((StoneButtonBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

//    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> WOOD_BUTTON = (textureFrom) -> (b, provider) ->
//            provider.buttonBlock((WoodButtonBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> BUTTON = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<StoneButtonBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) -> {
                provider.buttonBlock(block, top);
                provider.models().buttonInventory(provider.name(block) + "_inventory", top);
            }, (block, texture) -> {
                provider.buttonBlock(block, texture);
                provider.models().buttonInventory(provider.name(block) + "_inventory", texture);
            });

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> CAPITAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<CapitalBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.capitalBlock(block, side, bottom, top), provider::capitalBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> CORNER = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<CornerLayerBlock>fixBlockTex(textureFrom, b, provider, provider::cornerLayerBlock, provider::cornerLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> CORNER_SLAB = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<CornerSlabBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.cornerSlabBlock(block, side, bottom, top), provider::cornerSlabBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> CORNER_SLAB_VERTICAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<VerticalCornerSlabBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.cornerSlabVerticalBlock(block, side, bottom, top), provider::cornerSlabVerticalBlock);

//    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> DOOR = (textureFrom) -> (b, provider) ->
//            provider.doorBlock((DoorBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom + "_bottom")), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

//    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> DOOR = (textureFrom) -> (b, provider) ->
//            CaliberBlockHelper.<DoorBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
//                    provider.doorBlock(block, tex + "_door", bottom, top), provider::doorBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> DOOR_FRAME = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<DoorFrameBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.doorFrameBlock(block, tex), provider::doorFrameBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> DOOR_FRAME_LINTEL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<DoorFrameLintelBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.doorFrameLintelBlock(block, tex), provider::doorFrameLintelBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> EIGHTH = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<EighthBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.eighthBlock(block, side, bottom, top), provider::eighthBlock);

//    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> FENCE = (textureFrom) -> (b, provider) ->
//            provider.fenceBlock((FenceBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> FENCE = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<FenceBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) -> {
                provider.fenceBlock(block, top);
                provider.models().fenceInventory(provider.name(block) + "_inventory", top);
            }, (block, texture) -> {
                provider.fenceBlock(block, texture);
                provider.models().fenceInventory(provider.name(block) + "_inventory", texture);
            });

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> FENCE_GATE = (textureFrom) -> (b, provider) ->
            provider.fenceGateBlock((FenceGateBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> PILLAR = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<PillarLayerBlock>fixBlockTex(textureFrom, b, provider, provider::pillarLayerBlock, provider::pillarLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> PRESSURE_PLATE = (textureFrom) -> (b, provider) ->
            provider.pressurePlateBlock((PressurePlateBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

//    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> SIGN = (textureFrom) -> (b, provider) ->
//            provider.signBlock((StandingSignBlock) b.get(), (WallSignBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)));

//    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> TRAP_DOOR = (textureFrom) -> (b, provider) ->
//            provider.trapdoorBlock((TrapDoorBlock) b.get(), provider.blockTexture(BlockManager.getMainBy(b, textureFrom)), true);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> QUARTER = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<QuarterLayerBlock>fixBlockTex(textureFrom, b, provider, provider::quarterLayerBlock, provider::quarterLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> VERTICAL_QUARTER = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<VerticalQuarterLayerBlock>fixBlockTex(textureFrom, b, provider, provider::quarterLayerVerticalBlock, provider::quarterLayerVerticalBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ROOF_22 = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<Roof22Block>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.roof22Block(block, tex), provider::roof22Block);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ROOF_45 = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<Roof45Block>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.roof45Block(block, tex), provider::roof45Block);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ROOF_67 = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<Roof67Block>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.roof67Block(block, tex), provider::roof67Block);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> ROOF_PEAK = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<RoofPeakBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.roofPeakBlock(block, tex), provider::roofPeakBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> SLAB = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<SlabLayerBlock>fixBlockTex(textureFrom, b, provider, provider::slabLayerBlock, provider::slabLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> SLAB_VERTICAL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<VerticalSlabLayerBlock>fixBlockTex(textureFrom, b, provider, provider::slabVerticalLayerBlock, provider::slabVerticalLayerBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> STAIRS = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<StairBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.stairsBlock(block, side, bottom, top), provider::stairsBlock);

    public static final Function<Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> WALL = (textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<WallBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) -> {
                provider.wallBlock(block, top);
                provider.models().wallInventory(provider.name(block) + "_inventory", top);
            }, (block, texture) -> {
                provider.wallBlock(block, texture);
                provider.models().wallInventory(provider.name(block) + "_inventory", texture);
            });

    public static final BiFunction<String, Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> WINDOW = (s, textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<WindowBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) ->
                    provider.windowBlock(block, side, bottom, top), provider::windowBlock);

    public static final BiFunction<String, Supplier<Block>, BiConsumer<Supplier<Block>, ModBlockStateProvider>> WINDOW_HALF = (s, textureFrom) -> (b, provider) ->
            CaliberBlockHelper.<HalfWindowBlock>fixBlockTex(textureFrom, b, provider, (block, side, bottom, top, tex) -> provider.windowHalfBlock(block, side, bottom, top), provider::windowHalfBlock);



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
    public static <T extends Block> void fixBlockTex(Supplier<Block> textureFrom, Supplier<Block> b, ModBlockStateProvider provider, BlockGenLayerWithSides<T> genWithSides, BlockGenWithBaseBlock<T> gen) {
        ResourceLocation tex = provider.blockTexture(BlockManager.getMainBy(b, textureFrom));
        ResourceLocation top = tex;
        ResourceLocation side = tex;
        ResourceLocation bottom = tex;
        String originalPath = tex.getPath();
        String modifiedPath = tex.getPath();
        boolean isMinecraftNamespace = tex.getNamespace().equals("minecraft");

        if (tex.getPath().contains("_wood") && !tex.getPath().contains("stained") || tex.getPath().contains("_hyphae")) {
            String replacement = tex.getPath().contains("_wood") ? "_wood" : "_hyphae";
            String newTexture = tex.getPath().contains("_wood") ? "_log" : "_stem";
            tex = new ResourceLocation(tex.getNamespace(), tex.getPath().replace(replacement, newTexture));
            genWithSides.data((T) b.get(), tex, tex, tex, tex);
        } else if (tex.getPath().contains("tudor")) {
            String woodType = extractWoodType(tex);
            String prefix = tex.getPath().contains("stained") ? "stained_" : "";
            top = bottom = new ResourceLocation(tex.getNamespace(), "block/" + prefix + woodType + "_boards");
            genWithSides.data((T) b.get(), side, bottom, top, tex);
        } else if (tex.getPath().equals("block/basalt") || tex.getPath().equals("block/polished_basalt") || (tex.getPath().contains("quartz") && !tex.getPath().contains("brick"))) {
            side = new ResourceLocation(tex.getNamespace(), modifiedPath + "_side");
            top = bottom = new ResourceLocation(tex.getNamespace(), modifiedPath + "_top");
            if (tex.getPath().equals("block/smooth_quartz")) {
                side = top = bottom = new ResourceLocation(tex.getNamespace(), "block/quartz_block_bottom");
            }
            genWithSides.data((T) b.get(), side, bottom, top, tex);
        } else if (tex.getPath().contains("sandstone")) {
            if (tex.getPath().contains("cut")) {
                modifiedPath = modifiedPath.replace("cut_", "");
                side = tex;
                top = bottom = new ResourceLocation(tex.getNamespace(), modifiedPath + "_top");
            } else if (tex.getPath().contains("chiseled")) {
                modifiedPath = modifiedPath.replace("chiseled_", "");
                side = tex;
                top = bottom = new ResourceLocation(tex.getNamespace(), modifiedPath + "_top");
            } else if (tex.getPath().contains("smooth")) {
                modifiedPath = modifiedPath.replace("smooth_", "");
                side = new ResourceLocation(tex.getNamespace(), modifiedPath + "_top");
                top = bottom = new ResourceLocation(tex.getNamespace(), modifiedPath + "_top");
            } else {
                side = tex;
                top = new ResourceLocation(tex.getNamespace(), modifiedPath + "_top");
                bottom = new ResourceLocation(tex.getNamespace(), modifiedPath + "_bottom");
            }

            if (isMinecraftNamespace) {
                side = tex.getPath().contains("smooth") ? top : new ResourceLocation("minecraft", originalPath);
                top = new ResourceLocation("minecraft", modifiedPath + "_top");
                bottom = !tex.getPath().contains("smooth") && !tex.getPath().contains("cut") && !tex.getPath().contains("chiseled")  ?
                        new ResourceLocation("minecraft", modifiedPath + "_bottom") : top;
            }

            genWithSides.data((T) b.get(), side, bottom, top, tex);
        } else {
            gen.data((T) b.get(), tex);
        }
    }

    private static String extractWoodType(ResourceLocation resourceLocation) {
        if (resourceLocation.getPath().contains("acacia")) {
            return "acacia";
        } else if (resourceLocation.getPath().contains("birch")) {
            return "birch";
        } else if (resourceLocation.getPath().contains("dark_oak")) {
            return "dark_oak";
        } else if (resourceLocation.getPath().contains("jungle")) {
            return "jungle";
        } else if (resourceLocation.getPath().contains("oak") && !resourceLocation.getPath().contains("dark")) {
            return "oak";
        } else if (resourceLocation.getPath().contains("spruce")) {
            return "spruce";
        } else {
            return null;
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