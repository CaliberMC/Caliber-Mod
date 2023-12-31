package com.calibermc.caliber.block.management;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.custom.*;
import com.calibermc.caliber.block.properties.BlockProps;
import com.calibermc.caliber.data.ModBlockFamily;
import com.calibermc.caliber.data.datagen.ModBlockStateProvider;
import com.calibermc.caliber.data.datagen.loot.ModBlockLootTables;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;
import java.util.function.*;

import static com.calibermc.caliber.block.ModBlocks.registerBlock;

/**
 * Created to reduce the code in ModBlocks, for optimization and easier register of complex blocks
 */
public class BlockManager {

    public static final List<Supplier<Block>> ALL_BLOCKS = new ArrayList<>();
    public static final List<BlockManager> BLOCK_MANAGERS = new ArrayList<>();

    private final String name;
    private final ImmutableMap<BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> blocks;

    BlockManager(String name, List<BlockAdditional> directions) {
        ImmutableMap.Builder<BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> builder = ImmutableMap.builder();
        for (BlockAdditional e : directions) {
            String modifiedName;

            if (name.contains("bricks")) {
                modifiedName = name.replace("_bricks", "_brick");
            } else if (name.contains("tiles")) {
                modifiedName = name.replace("_tiles", "_tile");
            } else if (name.contains("planks")) {
                modifiedName = name.replace("_planks", "");
            } else if (name.contains("wood")) {
                modifiedName = name.replace("_wood", "");
            } else if (name.contains("boards")) {
                modifiedName = name.replace("boards", "board");
//            } else if (name.contains("shingles")) {
//                modifiedName = name.replace("_shingles", "_shingle");
            } else {
                modifiedName = name;
            }

            if (e.variant != ModBlockFamily.Variant.BASE) {
                String name1 = "%s_%s".formatted(modifiedName, e.variant.name().toLowerCase());
                builder.put(e, Pair.of(new ResourceLocation(Caliber.MOD_ID, name1), registerBlock(name1, e.blockSupplier)));
            } else {
                if (!e.skipRegister) {
                    builder.put(e, Pair.of(new ResourceLocation(Caliber.MOD_ID, name), registerBlock(name, e.blockSupplier)));
                } else {
                    builder.put(e, Pair.of(new ResourceLocation(name), e.blockSupplier));
                }
            }
        }

        this.blocks = builder.build();
        this.name = name;
        ALL_BLOCKS.addAll(this.blocks.values().stream().map(Pair::getSecond).toList());
        BLOCK_MANAGERS.add(this);
    }

    public String getName() {
        return name;
    }

    // if created using a block manager
    public Block baseBlock() {
        return this.get(ModBlockFamily.Variant.BASE);
    }

    public Block get(ModBlockFamily.Variant direction) {
        BlockAdditional a = this.getByVariant(direction);
        assert a != null;
        if (a.skipRegister) {
            return a.blockSupplier.get();
        }
        return this.blocks.get(this.getByVariant(direction)).getSecond().get();
    }

//    public Block get(ModBlockFamily.Variant direction) {
//        BlockAdditional a = this.getByVariant(direction);
//        if (a != null && a.skipRegister) {
//            return a.blockSupplier.get();
//        }
//        return this.blocks.get(this.getByVariant(direction)).getSecond().get();
//    }

    public BlockAdditional getByVariant(ModBlockFamily.Variant variant) {
        for (BlockAdditional blockAdditional : this.blocks.keySet()) {
            if (blockAdditional.variant == variant) {
                return blockAdditional;
            }
        }
        return null;
    }

    public static Block getMainBy(Supplier<Block> block, Supplier<Block> textureFrom) {
        for (BlockManager blockManager : BLOCK_MANAGERS) {
            for (Pair<ResourceLocation, Supplier<Block>> e : blockManager.getBlocks().values()) {
                if (e.getSecond() == block && blockManager.getByVariant(ModBlockFamily.Variant.BASE) != null) {
                    return blockManager.baseBlock();
                }
            }
        }
        return textureFrom.get();
    }

    public HashMap<BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> getBlocks() {
        HashMap<BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> map = new HashMap<>();
        this.blocks.forEach((ba, pair) -> {
            if (!ba.skipRegister)
                map.put(ba, pair);
        });
        return map;
    }

    public static BlockManager register(String name, BlockBehaviour.Properties properties, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, properties, () -> Blocks.AIR, variants);
    }

    public static BlockManager registerStoneWithLoot(String name, Supplier<Block> cobblestone) {
        Collection<ModBlockFamily.Variant> variants = CaliberBlockHelper.modifyList(CaliberBlockHelper.STONE_VARIANTS, (c) -> c.addAll(Arrays.asList(ModBlockFamily.Variant.BASE, ModBlockFamily.Variant.BUTTON, ModBlockFamily.Variant.PRESSURE_PLATE)));
        Builder builder = new Builder(name);
        Supplier<Block> baseBlock = () -> new Block(BlockProps.LIMESTONE.get());
        builder.addVariant(ModBlockFamily.Variant.BASE, baseBlock, (additional) ->
                additional.lootGen((loot, b) -> loot.add(b, (block) ->
                        ModBlockLootTables.createSingleItemTableWithSilkTouch(block, cobblestone.get()))));
        BlockManager.addDefaultVariants(builder, BlockProps.LIMESTONE.get(), baseBlock, variants);
        return builder.build();
    }

    public static BlockManager registerOneBlock(String name, Supplier<Block> block) {
        return new Builder(name).addVariant(ModBlockFamily.Variant.BASE, block).build();
    }

    public static BlockManager register(String name, BlockBehaviour.Properties properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        Builder builder = new Builder(name);
        if (variants.contains(ModBlockFamily.Variant.BASE)) {
            Supplier<Block> baseBlock = () -> new Block(properties);
            builder.addVariant(ModBlockFamily.Variant.BASE, baseBlock);
            BlockManager.addDefaultVariants(builder, properties, baseBlock, variants);
        } else {
            builder.addVariant(ModBlockFamily.Variant.BASE, blockSupplier, BlockAdditional::skipRegister);
            BlockManager.addDefaultVariants(builder, properties, blockSupplier, variants);
        }
        return builder.build();
    }

    private static void addDefaultVariants(Builder builder, BlockBehaviour.Properties properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        Supplier<BlockState> baseBlockState = () -> BlockManager.BLOCK_MANAGERS.stream().filter(blockManager ->
                blockManager.name.equals(builder.name)).findFirst().map(blockManager ->
                blockManager.baseBlock().defaultBlockState()).orElseThrow();
        for (ModBlockFamily.Variant variant : variants) {
            if (variant != ModBlockFamily.Variant.BASE) {
                switch (variant) {
                    case ARCH -> builder.addVariant(variant, () -> new ArchBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.ARCH.apply(blockSupplier)));
                    case ARCH_HALF -> builder.addVariant(variant, () -> new HalfArchBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.ARCH_HALF.apply(blockSupplier)));
                    case ARCH_LARGE -> builder.addVariant(variant, () -> new LargeArchBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.ARCH_LARGE.apply(blockSupplier)));
                    case ARCH_LARGE_HALF -> builder.addVariant(variant, () -> new LargeHalfArchBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.ARCH_LARGE_HALF.apply(blockSupplier)));
                    case ARROWSLIT -> builder.addVariant(variant, () -> new ArrowSlitBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.ARROWSLIT.apply(blockSupplier)));
                    case BALUSTRADE -> builder.addVariant(variant, () -> new BalustradeBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.BALUSTRADE.apply(blockSupplier)));
                    case BUTTON -> builder.addVariant(variant, () -> new StoneButtonBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.BUTTON.apply(blockSupplier)));
//                    case BUTTON -> builder.addVariant(variant, () -> {
//                        if (block.getMaterial() == Material.STONE) {
//                            return new StoneButtonBlock(properties);
//                        } else if (blockInstance.getMaterial() == Material.WOOD) {
//                            return new WoodButtonBlock(properties);
//                        } else {
//                            throw new IllegalArgumentException("Unsupported block material: " + blockInstance.getMaterial());
//                        }
//                    }, (b) -> b.stateGen(CaliberBlockHelper.BUTTON.apply(blockSupplier)));
                    case BEAM_HORIZONTAL -> builder.addVariant(variant, () -> new HorizontalBeamBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.BEAM_HORIZONTAL.apply(blockSupplier)));
                    case BEAM_LINTEL -> builder.addVariant(variant, () -> new BeamLintelBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.BEAM_LINTEL.apply(blockSupplier)));
                    case BEAM_POSTS -> builder.addVariant(variant, () -> new BeamPostsBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.BEAM_POSTS.apply(blockSupplier)));
                    case BEAM_VERTICAL -> builder.addVariant(variant, () -> new VerticalBeamBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.BEAM_VERTICAL.apply(blockSupplier)));
                    case CAPITAL -> builder.addVariant(variant, () -> new CapitalBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.CAPITAL.apply(blockSupplier)));
                    case CORNER -> builder.addVariant(variant, () -> new CornerLayerBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.CORNER.apply(blockSupplier)));
                    case CORNER_SLAB -> builder.addVariant(variant, () -> new CornerSlabBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.CORNER_SLAB.apply(blockSupplier)));
                    case CORNER_SLAB_VERTICAL -> builder.addVariant(variant, () -> new VerticalCornerSlabBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.CORNER_SLAB_VERTICAL.apply(blockSupplier)));
//                    case DOOR -> builder.addVariant(variant, () -> new DoorBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.DOOR.apply(blockSupplier)));
                    case DOOR_FRAME -> builder.addVariant(variant, () -> new DoorFrameBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.DOOR_FRAME.apply(blockSupplier)));
                    case DOOR_FRAME_LINTEL -> builder.addVariant(variant, () -> new DoorFrameLintelBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.DOOR_FRAME_LINTEL.apply(blockSupplier)));
                    case EIGHTH -> builder.addVariant(variant, () -> new EighthBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.EIGHTH.apply(blockSupplier)));
                    case FENCE -> builder.addVariant(variant, () -> new FenceBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.FENCE.apply(blockSupplier)));
                    case FENCE_GATE -> builder.addVariant(variant, () -> new FenceGateBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.FENCE_GATE.apply(blockSupplier)));
                    case PILLAR -> builder.addVariant(variant, () -> new PillarLayerBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.PILLAR.apply(blockSupplier)));
                    case PRESSURE_PLATE -> builder.addVariant(variant, () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, properties), (b) -> b.stateGen(CaliberBlockHelper.PRESSURE_PLATE.apply(blockSupplier)));
                    case QUARTER -> builder.addVariant(variant, () -> new QuarterLayerBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.QUARTER.apply(blockSupplier)));
                    case QUARTER_VERTICAL -> builder.addVariant(variant, () -> new VerticalQuarterLayerBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.VERTICAL_QUARTER.apply(blockSupplier)));
                    case ROOF_22 -> builder.addVariant(variant, () -> new Roof22Block(properties), (b) -> b.stateGen(CaliberBlockHelper.ROOF_22.apply(blockSupplier)));
                    case ROOF_45 -> builder.addVariant(variant, () -> new Roof45Block(properties), (b) -> b.stateGen(CaliberBlockHelper.ROOF_45.apply(blockSupplier)));
                    case ROOF_67 -> builder.addVariant(variant, () -> new Roof67Block(properties), (b) -> b.stateGen(CaliberBlockHelper.ROOF_67.apply(blockSupplier)));
                    case ROOF_PEAK -> builder.addVariant(variant, () -> new RoofPeakBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.ROOF_PEAK.apply(blockSupplier)));
//                    case SIGN -> builder.addVariant(variant, () -> new StandingSignBlock(properties, WoodType.OAK), new WallSignBlock(properties, WoodType.OAK), (b) -> b.stateGen(CaliberBlockHelper.SIGN.apply(blockSupplier)));
                    case SLAB -> builder.addVariant(variant, () -> new SlabLayerBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.SLAB.apply(blockSupplier)));
                    case SLAB_VERTICAL -> builder.addVariant(variant, () -> new VerticalSlabLayerBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.SLAB_VERTICAL.apply(blockSupplier)));
                    case STAIRS -> builder.addVariant(variant, () -> new StairBlock(baseBlockState, properties), (b) -> b.stateGen(CaliberBlockHelper.STAIRS.apply(blockSupplier)));
//                    case TRAPDOOR -> builder.addVariant(variant, () -> new TrapDoorBlock(properties), (b) -> b.stateGen(TRAP_DOOR.apply(blockSupplier)));
                    case WALL -> builder.addVariant(variant, () -> new WallBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.WALL.apply(blockSupplier)));
//                    case WALL_SIGN -> builder.addVariant(variant, () -> new WallSignBlock(properties, WoodType.OAK), (b) -> b.stateGen(CaliberBlockHelper.SIGN.apply(blockSupplier)));
                    case WINDOW -> builder.addVariant(variant, () -> new WindowBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.WINDOW.apply("window", blockSupplier)));
                    case WINDOW_HALF -> builder.addVariant(variant, () -> new HalfWindowBlock(properties), (b) -> b.stateGen(CaliberBlockHelper.WINDOW_HALF.apply("window_half", blockSupplier)));
                }
            }
        }
    }

    public static class Builder {

        private final String name;
        private final List<BlockAdditional> blocks = new ArrayList<>();

        public Builder(String name) {
            this.name = name;
        }

        public Builder addVariant(ModBlockFamily.Variant variant, Supplier<Block> blockSupplier) {
            this.addVariant(variant, blockSupplier, (b) -> {});
            return this;
        }

        public Builder addVariant(ModBlockFamily.Variant variant, Supplier<Block> block, Consumer<BlockAdditional> consumer) {
            BlockAdditional additional = new BlockAdditional(variant, block);
            consumer.accept(additional);
            this.blocks.add(additional);
            return this;
        }

        public BlockManager build() {
            return new BlockManager(this.name, this.blocks);
        }
    }

    public static final class BlockAdditional {
        public final ModBlockFamily.Variant variant;
        public final Supplier<Block> blockSupplier;
        public boolean skipRegister; // used to register in manager, but don't register it in minecraft (basically when block already registered in mc)
        public BiConsumer<ModBlockLootTables, Block> lootGen = BlockLoot::dropSelf;
        public BiConsumer<Supplier<Block>, ModBlockStateProvider> stateGenerator = (b, provider) ->
                CaliberBlockHelper.fixBlockTex(b, b, provider, (block, side, bottom, top, tex) ->
                        provider.simpleBlock(b.get(), provider.models().cubeBottomTop(provider.name(b.get()), side, bottom, top)), (block, tex) ->
                        provider.simpleBlock(b.get(), provider.models().cubeAll(provider.name(b.get()), tex)));

        public BlockAdditional(ModBlockFamily.Variant variant, Supplier<Block> blockSupplier) {
            this.variant = variant;
            this.blockSupplier = blockSupplier;
        }

        public BlockAdditional lootGen(BiConsumer<ModBlockLootTables, Block> lootGen) {
            this.lootGen = lootGen;
            return this;
        }

        public BlockAdditional stateGen(BiConsumer<Supplier<Block>, ModBlockStateProvider> stateGenerator) {
            this.stateGenerator = stateGenerator;
            return this;
        }

        public BlockAdditional skipRegister() {
            this.skipRegister = true;
            return this;
        }

//        public BlockAdditional getResourceLocation(String name) {
//            return this.variant == ModBlockFamily.Variant.BASE ? this : new BlockAdditional(this.variant, () -> this.blockSupplier.get().setRegistryName(name));
//        }
    }
}
