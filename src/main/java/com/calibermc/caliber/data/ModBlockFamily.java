package com.calibermc.caliber.data;

import com.google.common.collect.Maps;
import net.minecraft.world.level.block.Block;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Optional;

public class ModBlockFamily {
    private final Block baseBlock;
    final Map<ModBlockFamily.Variant, Block> variants = Maps.newHashMap();
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

    public Map<ModBlockFamily.Variant, Block> getVariants() {
        return this.variants;
    }

    public Block get(ModBlockFamily.Variant pVariant) {
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

        public ModBlockFamily.Builder arch(Block pArchBlock) {
            this.family.variants.put(ModBlockFamily.Variant.ARCH, pArchBlock);
            return this;
        }

        public ModBlockFamily.Builder arch_half(Block pArch_HalfBlock) {
            this.family.variants.put(ModBlockFamily.Variant.ARCH_HALF, pArch_HalfBlock);
            return this;
        }

        public ModBlockFamily.Builder arch_large(Block pArch_LargeBlock) {
            this.family.variants.put(ModBlockFamily.Variant.ARCH_LARGE, pArch_LargeBlock);
            return this;
        }

        public ModBlockFamily.Builder arch_large_half(Block pArch_Large_HalfBlock) {
            this.family.variants.put(ModBlockFamily.Variant.ARCH_LARGE_HALF, pArch_Large_HalfBlock);
            return this;
        }

        public ModBlockFamily.Builder arch_small(Block pArch_SmallBlock) {
            this.family.variants.put(ModBlockFamily.Variant.ARCH_SMALL, pArch_SmallBlock);
            return this;
        }

        public ModBlockFamily.Builder arch_small_half(Block pArch_Small_HalfBlock) {
            this.family.variants.put(ModBlockFamily.Variant.ARCH_SMALL_HALF, pArch_Small_HalfBlock);
            return this;
        }

        public ModBlockFamily.Builder arrowslit(Block pArrowslitBlock) {
            this.family.variants.put(ModBlockFamily.Variant.ARROWSLIT, pArrowslitBlock);
            return this;
        }

        public ModBlockFamily.Builder balustrade(Block pBalustradeBlock) {
            this.family.variants.put(ModBlockFamily.Variant.BALUSTRADE, pBalustradeBlock);
            return this;
        }

        public ModBlockFamily.Builder button(Block pButtonBlock) {
            this.family.variants.put(ModBlockFamily.Variant.BUTTON, pButtonBlock);
            return this;
        }

        public ModBlockFamily.Builder capital(Block pCapitalBlock) {
            this.family.variants.put(ModBlockFamily.Variant.CAPITAL, pCapitalBlock);
            return this;
        }

        public ModBlockFamily.Builder chiseled(Block pChiseledBlock) {
            this.family.variants.put(ModBlockFamily.Variant.CHISELED, pChiseledBlock);
            return this;
        }

        public ModBlockFamily.Builder cracked(Block pCrackedBlock) {
            this.family.variants.put(ModBlockFamily.Variant.CRACKED, pCrackedBlock);
            return this;
        }

        public ModBlockFamily.Builder column(Block pColumnBlock) {
            this.family.variants.put(ModBlockFamily.Variant.COLUMN, pColumnBlock);
            return this;
        }

        public ModBlockFamily.Builder corner(Block pCornerBlock) {
            this.family.variants.put(ModBlockFamily.Variant.CORNER, pCornerBlock);
            return this;
        }

        public ModBlockFamily.Builder corner_slab(Block pCorner_SlabBlock) {
            this.family.variants.put(ModBlockFamily.Variant.CORNER_SLAB, pCorner_SlabBlock);
            return this;
        }

        public ModBlockFamily.Builder corner_slab_vertical(Block pCorner_Slab_VerticalBlock) {
            this.family.variants.put(ModBlockFamily.Variant.CORNER_SLAB_VERTICAL, pCorner_Slab_VerticalBlock);
            return this;
        }

        public ModBlockFamily.Builder cut(Block pCutBlock) {
            this.family.variants.put(ModBlockFamily.Variant.CUT, pCutBlock);
            return this;
        }

        public ModBlockFamily.Builder door(Block pDoorBlock) {
            this.family.variants.put(ModBlockFamily.Variant.DOOR, pDoorBlock);
            return this;
        }

        public ModBlockFamily.Builder eighth(Block pEighthBlock) {
            this.family.variants.put(ModBlockFamily.Variant.EIGHTH, pEighthBlock);
            return this;
        }

        public ModBlockFamily.Builder fence(Block pFenceBlock) {
            this.family.variants.put(ModBlockFamily.Variant.FENCE, pFenceBlock);
            return this;
        }

        public ModBlockFamily.Builder fenceGate(Block pFenceGateBlock) {
            this.family.variants.put(ModBlockFamily.Variant.FENCE_GATE, pFenceGateBlock);
            return this;
        }

        public ModBlockFamily.Builder layer(Block pLayerBlock) {
            this.family.variants.put(ModBlockFamily.Variant.LAYER, pLayerBlock);
            return this;
        }

        public ModBlockFamily.Builder quarter(Block pQuarterBlock) {
            this.family.variants.put(ModBlockFamily.Variant.QUARTER, pQuarterBlock);
            return this;
        }

        public ModBlockFamily.Builder quarter_vertical(Block pQuarter_VerticalBlock) {
            this.family.variants.put(ModBlockFamily.Variant.QUARTER_VERTICAL, pQuarter_VerticalBlock);
            return this;
        }

        public ModBlockFamily.Builder sign(Block pSignBlock, Block pWallSignBlock) {
            this.family.variants.put(ModBlockFamily.Variant.SIGN, pSignBlock);
            this.family.variants.put(ModBlockFamily.Variant.WALL_SIGN, pWallSignBlock);
            return this;
        }

        public ModBlockFamily.Builder slab(Block pSlabBlock) {
            this.family.variants.put(ModBlockFamily.Variant.SLAB, pSlabBlock);
            return this;
        }

        public ModBlockFamily.Builder slab_vertical(Block pSlab_VerticalBlock) {
            this.family.variants.put(ModBlockFamily.Variant.SLAB_VERTICAL, pSlab_VerticalBlock);
            return this;
        }

        public ModBlockFamily.Builder stairs(Block pStairsBlock) {
            this.family.variants.put(ModBlockFamily.Variant.STAIRS, pStairsBlock);
            return this;
        }

        public ModBlockFamily.Builder pressurePlate(Block pPressurePlateBlock) {
            this.family.variants.put(ModBlockFamily.Variant.PRESSURE_PLATE, pPressurePlateBlock);
            return this;
        }

        public ModBlockFamily.Builder polished(Block pPolishedBlock) {
            this.family.variants.put(ModBlockFamily.Variant.POLISHED, pPolishedBlock);
            return this;
        }

        public ModBlockFamily.Builder trapdoor(Block pTrapdoorBlock) {
            this.family.variants.put(ModBlockFamily.Variant.TRAPDOOR, pTrapdoorBlock);
            return this;
        }

        public ModBlockFamily.Builder wall(Block pWallBlock) {
            this.family.variants.put(ModBlockFamily.Variant.WALL, pWallBlock);
            return this;
        }

        public ModBlockFamily.Builder window(Block pWindowBlock) {
            this.family.variants.put(ModBlockFamily.Variant.WINDOW, pWindowBlock);
            return this;
        }

        public ModBlockFamily.Builder window_half(Block pWindow_HalfBlock) {
            this.family.variants.put(ModBlockFamily.Variant.WINDOW_HALF, pWindow_HalfBlock);
            return this;
        }
        
        /* TUDOR BLOCKS */
        public ModBlockFamily.Builder cross(Block pCross) {
            this.family.variants.put(ModBlockFamily.Variant.CROSS, pCross);
            return this;
        }
        public ModBlockFamily.Builder down(Block pDown) {
            this.family.variants.put(ModBlockFamily.Variant.DOWN, pDown);
            return this;
        }
        public ModBlockFamily.Builder up(Block pUp) {
            this.family.variants.put(ModBlockFamily.Variant.UP, pUp);
            return this;
        }
        public ModBlockFamily.Builder left(Block pLeft) {
            this.family.variants.put(ModBlockFamily.Variant.LEFT, pLeft);
            return this;
        }
        public ModBlockFamily.Builder right(Block pRight) {
            this.family.variants.put(ModBlockFamily.Variant.RIGHT, pRight);
            return this;
        }
        public ModBlockFamily.Builder horizontal_1(Block pHorizontal_1) {
            this.family.variants.put(ModBlockFamily.Variant.HORIZONTAL_1, pHorizontal_1);
            return this;
        }
        public ModBlockFamily.Builder horizontal_2(Block pHorizontal_2) {
            this.family.variants.put(ModBlockFamily.Variant.HORIZONTAL_2, pHorizontal_2);
            return this;
        }
        public ModBlockFamily.Builder vertical_1(Block pVertical_1) {
            this.family.variants.put(ModBlockFamily.Variant.VERTICAL_1, pVertical_1);
            return this;
        }
        public ModBlockFamily.Builder vertical_2(Block pVertical_2) {
            this.family.variants.put(ModBlockFamily.Variant.VERTICAL_2, pVertical_2);
            return this;
        }

        public ModBlockFamily.Builder dontGenerateModel() {
            this.family.generateModel = false;
            return this;
        }

        public ModBlockFamily.Builder dontGenerateRecipe() {
            this.family.generateRecipe = false;
            return this;
        }

        public ModBlockFamily.Builder recipeGroupPrefix(String pRecipeGroupPrefix) {
            this.family.recipeGroupPrefix = pRecipeGroupPrefix;
            return this;
        }

        public ModBlockFamily.Builder recipeUnlockedBy(String pRecipeUnlockedBy) {
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