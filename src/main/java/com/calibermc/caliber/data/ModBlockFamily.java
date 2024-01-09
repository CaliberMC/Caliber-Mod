package com.calibermc.caliber.data;

import com.calibermc.caliber.block.management.BlockManager;
import com.calibermc.caliber.data.datagen.ModBlockStateProvider;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class ModBlockFamily {
    private final Block baseBlock;
    final Map<Variant, Block> variants = Maps.newHashMap();
    boolean generateModel = true; //default to true
    boolean generateRecipe = true; //default to true
    @Nullable
    String recipeGroupPrefix;
    @Nullable
    String recipeUnlockedBy;

    ModBlockFamily(Block pBaseBlock) {
        this.baseBlock = pBaseBlock;
    }

    public Block getBaseBlock() {
        return this.baseBlock;
    }

    public Map<Variant, Block> getVariants() {
        return this.variants;
    }

    public Block get(Variant pVariant) {
        return this.variants.get(pVariant);
    }

    public boolean shouldGenerateModel() {
        return this.generateModel;
    }

    public boolean shouldGenerateRecipe() {
        return this.generateRecipe;
    }

    public Optional<String> getRecipeGroupPrefix() {
        return StringUtils.isBlank(this.recipeGroupPrefix) ? Optional.empty() : Optional.of(this.recipeGroupPrefix);
    }

    public Optional<String> getRecipeUnlockedBy() {
        return StringUtils.isBlank(this.recipeUnlockedBy) ? Optional.empty() : Optional.of(this.recipeUnlockedBy);
    }

    public static class Builder {
        private final ModBlockFamily family;

        public Builder(Block pBaseBlock) {
            this.family = new ModBlockFamily(pBaseBlock);
        }

        public ModBlockFamily getFamily() {
            return this.family;
        }


        public Builder fromManager(BlockManager manager) {
            for (Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e : manager.getBlocks().entrySet()) {
                this.family.variants.put(e.getKey().variant, e.getValue().getSecond().get());
            }
            return this;
        }

        public Builder arch(Block pArchBlock) {
            this.family.variants.put(Variant.ARCH, pArchBlock);
            return this;
        }

        public Builder arch_half(Block pHalfArchBlock) {
            this.family.variants.put(Variant.ARCH_HALF, pHalfArchBlock);
            return this;
        }

        public Builder arch_large(Block pLargeArchBlock) {
            this.family.variants.put(Variant.ARCH_LARGE,  pLargeArchBlock);
            return this;
        }

        public Builder arch_large_half(Block pHalfLargeArchBlock) {
            this.family.variants.put(Variant.ARCH_LARGE_HALF, pHalfLargeArchBlock);
            return this;
        }

        public Builder arrowslit(Block pArrowslitBlock) {
            this.family.variants.put(Variant.ARROWSLIT, pArrowslitBlock);
            return this;
        }

        public Builder balustrade(Block pBalustradeBlock) {
            this.family.variants.put(Variant.BALUSTRADE, pBalustradeBlock);
            return this;
        }

        public Builder beam_horizontal(Block pHorizontalBeamBlock) {
            this.family.variants.put(Variant.BEAM_HORIZONTAL, pHorizontalBeamBlock);
            return this;
        }

        public Builder beam_lintel(Block pLintelBeamBlock) {
            this.family.variants.put(Variant.BEAM_LINTEL, pLintelBeamBlock);
            return this;
        }

        public Builder beam_posts(Block pBeamPostsBlock) {
            this.family.variants.put(Variant.BEAM_POSTS, pBeamPostsBlock);
            return this;
        }

        public Builder beam_vertical(Block pVerticalBeamBlock) {
            this.family.variants.put(Variant.BEAM_VERTICAL, pVerticalBeamBlock);
            return this;
        }

        public Builder button(Block pButtonBlock) {
            this.family.variants.put(Variant.BUTTON, pButtonBlock);
            return this;
        }

        public Builder capital(Block pCapitalBlock) {
            this.family.variants.put(Variant.CAPITAL, pCapitalBlock);
            return this;
        }

        public Builder chiseled(Block pChiseledBlock) {
            this.family.variants.put(Variant.CHISELED, pChiseledBlock);
            return this;
        }

        public Builder cracked(Block pCrackedBlock) {
            this.family.variants.put(Variant.CRACKED, pCrackedBlock);
            return this;
        }

        public Builder column(Block pColumnBlock) {
            this.family.variants.put(Variant.COLUMN, pColumnBlock);
            return this;
        }

        public Builder corner(Block pCornerBlock) {
            this.family.variants.put(Variant.CORNER, pCornerBlock);
            return this;
        }

        public Builder corner_slab(Block pCorner_SlabBlock) {
            this.family.variants.put(Variant.CORNER_SLAB, pCorner_SlabBlock);
            return this;
        }

        public Builder corner_slab_vertical(Block pVerticalCornerSlabBlock) {
            this.family.variants.put(Variant.CORNER_SLAB_VERTICAL, pVerticalCornerSlabBlock);
            return this;
        }

        public Builder cut(Block pCutBlock) {
            this.family.variants.put(Variant.CUT, pCutBlock);
            return this;
        }

        public Builder door(Block pDoorBlock) {
            this.family.variants.put(Variant.DOOR, pDoorBlock);
            return this;
        }

        public Builder door_frame(Block pDoorFrameBlock) {
            this.family.variants.put(Variant.DOOR_FRAME, pDoorFrameBlock);
            return this;
        }

        public Builder door_frame_lintel(Block pDoorFrameLintelBlock) {
            this.family.variants.put(Variant.DOOR_FRAME_LINTEL, pDoorFrameLintelBlock);
            return this;
        }

        public Builder eighth(Block pEighthBlock) {
            this.family.variants.put(Variant.EIGHTH, pEighthBlock);
            return this;
        }

        public Builder fence(Block pFenceBlock) {
            this.family.variants.put(Variant.FENCE, pFenceBlock);
            return this;
        }

        public Builder fenceGate(Block pFenceGateBlock) {
            this.family.variants.put(Variant.FENCE_GATE, pFenceGateBlock);
            return this;
        }

        public Builder layer(Block pLayerBlock) {
            this.family.variants.put(Variant.LAYER, pLayerBlock);
            return this;
        }

        public Builder pillar(Block pPillarBlock) {
            this.family.variants.put(Variant.PILLAR, pPillarBlock);
            return this;
        }

        public Builder quarter(Block pQuarterBlock) {
            this.family.variants.put(Variant.QUARTER, pQuarterBlock);
            return this;
        }

        public Builder quarter_vertical(Block pVerticalQuarterBlock) {
            this.family.variants.put(Variant.QUARTER_VERTICAL, pVerticalQuarterBlock);
            return this;
        }

        public Builder roof_22(Block pRoof22Block) {
            this.family.variants.put(Variant.ROOF_22, pRoof22Block);
            return this;
        }

        public Builder roof_45(Block pRoof45Block) {
            this.family.variants.put(Variant.ROOF_45, pRoof45Block);
            return this;
        }

        public Builder roof_67(Block pRoof67Block) {
            this.family.variants.put(Variant.ROOF_67, pRoof67Block);
            return this;
        }

        public Builder roof_peak(Block pRoofPeakBlock) {
            this.family.variants.put(Variant.ROOF_PEAK, pRoofPeakBlock);
            return this;
        }

        public Builder sign(Block pSignBlock, Block pWallSignBlock) {
            this.family.variants.put(Variant.SIGN, pSignBlock);
            this.family.variants.put(Variant.WALL_SIGN, pWallSignBlock);
            return this;
        }

        public Builder slab(Block pSlabBlock) {
            this.family.variants.put(Variant.SLAB, pSlabBlock);
            return this;
        }

        public Builder slab_vertical(Block pVerticalSlabBlock) {
            this.family.variants.put(Variant.SLAB_VERTICAL, pVerticalSlabBlock);
            return this;
        }

        public Builder stairs(Block pStairsBlock) {
            this.family.variants.put(Variant.STAIRS, pStairsBlock);
            return this;
        }

        public Builder tallDoor(Block pTallDoorBlock) {
            this.family.variants.put(Variant.TALL_DOOR, pTallDoorBlock);
            return this;
        }

        public Builder pressurePlate(Block pPressurePlateBlock) {
            this.family.variants.put(Variant.PRESSURE_PLATE, pPressurePlateBlock);
            return this;
        }

        public Builder polished(Block pPolishedBlock) {
            this.family.variants.put(Variant.POLISHED, pPolishedBlock);
            return this;
        }

        public Builder trapdoor(Block pTrapdoorBlock) {
            this.family.variants.put(Variant.TRAPDOOR, pTrapdoorBlock);
            return this;
        }

        public Builder wall(Block pWallBlock) {
            this.family.variants.put(Variant.WALL, pWallBlock);
            return this;
        }

        public Builder window(Block pWindowBlock) {
            this.family.variants.put(Variant.WINDOW, pWindowBlock);
            return this;
        }

        public Builder window_half(Block pHalfWindowBlock) {
            this.family.variants.put(Variant.WINDOW_HALF, pHalfWindowBlock);
            return this;
        }

        public Builder dontGenerateModel() {
            this.family.generateModel = false;
            return this;
        }

        public Builder dontGenerateRecipe() {
            this.family.generateRecipe = false;
            return this;
        }

        public Builder recipeGroupPrefix(String pRecipeGroupPrefix) {
            this.family.recipeGroupPrefix = pRecipeGroupPrefix;
            return this;
        }

        public Builder recipeUnlockedBy(String pRecipeUnlockedBy) {
            this.family.recipeUnlockedBy = pRecipeUnlockedBy;
            return this;
        }
    }

    public static enum Variant {
        BASE(""),

        /* MAIN VARIANTS */
        ARCH("arch"),
        ARCH_HALF("arch_half"),
        ARCH_LARGE("arch_large"),
        ARCH_LARGE_HALF("arch_large_half"),
        ARROWSLIT("arrowslit"),
        BALUSTRADE("balustrade"),
        BEAM_HORIZONTAL("beam_horizontal"),
        BEAM_LINTEL("beam_lintel"),
        BEAM_POSTS("beam_posts"),
        BEAM_VERTICAL("beam_vertical"),
        BUTTON("button"),
        CAPITAL("capital"),
        CHISELED("chiseled"),
        CRACKED("cracked"),
        COLUMN("column"),
        CORNER("corner"),
        CORNER_SLAB("corner_slab"),
        CORNER_SLAB_VERTICAL("corner_slab_vertical"),
        CUT("cut"),
        DOOR("door"),
        DOOR_FRAME("door_frame"),
        DOOR_FRAME_LINTEL("door_frame_lintel"),
        EIGHTH("eighth"),
        FENCE("fence"),
        FENCE_GATE("fence_gate"),
        LAYER("layer"),
        PILLAR("pillar"),
        QUARTER("quarter"),
        QUARTER_VERTICAL("quarter_vertical"),
        ROOF_22("roof_22"),
        ROOF_45("roof_45"),
        ROOF_67("roof_67"),
        ROOF_PEAK("roof_peak"),
        SIGN("sign"),
        SLAB("slab"),
        SLAB_VERTICAL("slab_vertical"),
        STAIRS("stairs"),
        PRESSURE_PLATE("pressure_plate"),
        POLISHED("polished"),
        TALL_DOOR("tall_door"),
        TRAPDOOR("trapdoor"),
        WALL("wall"),
        WALL_SIGN("wall_sign"),
        WINDOW("window"),
        WINDOW_HALF("window_half"),

        /* TUDOR BLOCKS */
        CROSS("cross"),
        DOWN("down"),
        UP("up"),
        LEFT("left"),
        RIGHT("right"),
        HORIZONTAL_1("horizontal_1"),
        HORIZONTAL_2("horizontal_2"),
        VERTICAL_1("vertical_1"),
        VERTICAL_2("vertical_2");

        private final String name;

        private Variant(String pVariantName) {
            this.name = pVariantName;
        }

        public String getName() {
            return this.name;
        }

        public ResourceLocation getRegistryName(ModBlockStateProvider block) {
            return new ResourceLocation("caliber", this.name);
        }
    }
}