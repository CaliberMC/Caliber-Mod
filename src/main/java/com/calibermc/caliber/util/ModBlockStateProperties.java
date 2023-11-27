package com.calibermc.caliber.util;

import com.calibermc.caliber.block.shapes.*;
import com.calibermc.caliber.block.shapes.trim.ArchTrim;
import com.calibermc.caliber.block.shapes.trim.LargeArchTrim;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;


public class ModBlockStateProperties {
    public static final EnumProperty<ArchShape> ARCH_SHAPE = EnumProperty.create("type", ArchShape.class);
    public static final EnumProperty<BalustradeShape> BALUSTRADE_SHAPE = EnumProperty.create("type", BalustradeShape.class);
    public static final EnumProperty<CapitalShape> CAPITAL_SHAPE = EnumProperty.create("type", CapitalShape.class);
    public static final EnumProperty<CornerShape> CORNER_SHAPE = EnumProperty.create("type", CornerShape.class);
    public static final EnumProperty<CornerSlabShape> CORNER_SLAB_SHAPE = EnumProperty.create("type", CornerSlabShape.class);
    public static final EnumProperty<EighthShape> EIGHTH_SHAPE = EnumProperty.create("type", EighthShape.class);
    public static final EnumProperty<HalfArchShape> HALF_ARCH_SHAPE = EnumProperty.create("type", HalfArchShape.class);
    public static final EnumProperty<LargeArchShape> LARGE_ARCH_SHAPE = EnumProperty.create("type", LargeArchShape.class);
    public static final EnumProperty<LeftRightShape> LEFT_RIGHT_SHAPE = EnumProperty.create("type", LeftRightShape.class);
    public static final EnumProperty<QuarterShape> QUARTER_SHAPE = EnumProperty.create("type", QuarterShape.class);
    public static final EnumProperty<QuarterLayerShape> QUARTER_LAYER_SHAPE = EnumProperty.create("type", QuarterLayerShape.class);
    public static final EnumProperty<SlabLayerShape> SLAB_LAYER_SHAPE = EnumProperty.create("type", SlabLayerShape.class);
    public static final EnumProperty<VerticalCornerSlabShape> VERTICAL_CORNER_SLAB_SHAPE = EnumProperty.create("type", VerticalCornerSlabShape.class);
    public static final EnumProperty<VerticalQuarterShape> VERTICAL_QUARTER_SHAPE = EnumProperty.create("type", VerticalQuarterShape.class);
    public static final EnumProperty<VerticalQuarterLayerShape> VERTICAL_QUARTER_LAYER_SHAPE = EnumProperty.create("type", VerticalQuarterLayerShape.class);
    public static final EnumProperty<VerticalSlabShape> VERTICAL_SLAB_SHAPE = EnumProperty.create("type", VerticalSlabShape.class);
    public static final EnumProperty<WindowShape> WINDOW_SHAPE = EnumProperty.create("type", WindowShape.class);

    public static final IntegerProperty FIVE_LAYERS = IntegerProperty.create("layers", 1, 5);
    public static final IntegerProperty VERTICAL_BEAM_SHAPE = IntegerProperty.create("beam", 1, 5);
    public static final IntegerProperty HORIZONTAL_BEAM_SHAPE = IntegerProperty.create("beam", 1, 4);
    public static final EnumProperty<ArchTrim> ARCH_TRIM = EnumProperty.create("trim", ArchTrim.class);
    public static final EnumProperty<LargeArchTrim> LARGE_ARCH_TRIM = EnumProperty.create("trim", LargeArchTrim.class);

    public static boolean isSide(Direction direction) {
        return direction == Direction.NORTH || direction == Direction.EAST || direction == Direction.SOUTH || direction == Direction.WEST;
    }
}

