package com.calibermc.caliber.data;

import com.google.common.collect.Maps;
import net.minecraft.world.level.block.Block;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Optional;

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

        public Builder arch(Block pArchBlock) {
            this.family.variants.put(Variant.ARCH, pArchBlock);
            return this;
        }

        public Builder arch_half(Block pArch_HalfBlock) {
            this.family.variants.put(Variant.ARCH_HALF, pArch_HalfBlock);
            return this;
        }

        public Builder arch_large(Block pArch_LargeBlock) {
            this.family.variants.put(Variant.ARCH_LARGE, pArch_LargeBlock);
            return this;
        }

        public Builder arch_large_half(Block pArch_Large_HalfBlock) {
            this.family.variants.put(Variant.ARCH_LARGE_HALF, pArch_Large_HalfBlock);
            return this;
        }

        public Builder arch_small(Block pArch_SmallBlock) {
            this.family.variants.put(Variant.ARCH_SMALL, pArch_SmallBlock);
            return this;
        }

        public Builder arch_small_half(Block pArch_Small_HalfBlock) {
            this.family.variants.put(Variant.ARCH_SMALL_HALF, pArch_Small_HalfBlock);
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

        public Builder corner_slab_vertical(Block pCorner_Slab_VerticalBlock) {
            this.family.variants.put(Variant.CORNER_SLAB_VERTICAL, pCorner_Slab_VerticalBlock);
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

        public Builder quarter_vertical(Block pQuarter_VerticalBlock) {
            this.family.variants.put(Variant.QUARTER_VERTICAL, pQuarter_VerticalBlock);
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

        public Builder slab_vertical(Block pSlab_VerticalBlock) {
            this.family.variants.put(Variant.SLAB_VERTICAL, pSlab_VerticalBlock);
            return this;
        }

        public Builder stairs(Block pStairsBlock) {
            this.family.variants.put(Variant.STAIRS, pStairsBlock);
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

        public Builder window_half(Block pWindow_HalfBlock) {
            this.family.variants.put(Variant.WINDOW_HALF, pWindow_HalfBlock);
            return this;
        }
        
//        /* TUDOR BLOCKS */
//        public Builder cross(Block pCross) {
//            this.family.variants.put(Variant.CROSS, pCross);
//            return this;
//        }
//        public Builder down(Block pDown) {
//            this.family.variants.put(Variant.DOWN, pDown);
//            return this;
//        }
//        public Builder up(Block pUp) {
//            this.family.variants.put(Variant.UP, pUp);
//            return this;
//        }
//        public Builder left(Block pLeft) {
//            this.family.variants.put(Variant.LEFT, pLeft);
//            return this;
//        }
//        public Builder right(Block pRight) {
//            this.family.variants.put(Variant.RIGHT, pRight);
//            return this;
//        }
//        public Builder horizontal_1(Block pHorizontal_1) {
//            this.family.variants.put(Variant.HORIZONTAL_1, pHorizontal_1);
//            return this;
//        }
//        public Builder horizontal_2(Block pHorizontal_2) {
//            this.family.variants.put(Variant.HORIZONTAL_2, pHorizontal_2);
//            return this;
//        }
//        public Builder vertical_1(Block pVertical_1) {
//            this.family.variants.put(Variant.VERTICAL_1, pVertical_1);
//            return this;
//        }
//        public Builder vertical_2(Block pVertical_2) {
//            this.family.variants.put(Variant.VERTICAL_2, pVertical_2);
//            return this;
//        }

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
        /* MAIN VARIANTS */
        ARCH("arch"),
        ARCH_HALF("arch_half"),
        ARCH_LARGE("arch_large"),
        ARCH_LARGE_HALF("arch_large_half"),
        ARCH_SMALL("arch_small"),
        ARCH_SMALL_HALF("arch_small_half"),
        ARROWSLIT("arrowslit"),
        BALUSTRADE("balustrade"),
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
        EIGHTH("eighth"),
        FENCE("fence"),
        FENCE_GATE("fence_gate"),
        LAYER("layer"),
        PILLAR("pillar"),
        QUARTER("quarter"),
        QUARTER_VERTICAL("quarter_vertical"),
        SIGN("sign"),
        SLAB("slab"),
        SLAB_VERTICAL("slab_vertical"),
        STAIRS("stairs"),
        PRESSURE_PLATE("pressure_plate"),
        POLISHED("polished"),
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
    }
}