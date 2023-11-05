package com.calibermc.caliber.util;

import com.calibermc.caliber.block.properties.*;
import net.minecraft.world.level.block.state.properties.EnumProperty;


public class ModBlockStateProperties {
    public static final EnumProperty<ArchShape> ARCH_SHAPE = EnumProperty.create("type", ArchShape.class);
    public static final EnumProperty<BalustradeShape> BALUSTRADE_SHAPE = EnumProperty.create("type", BalustradeShape.class);
    public static final EnumProperty<CapitalShape> CAPITAL_SHAPE = EnumProperty.create("type", CapitalShape.class);
    public static final EnumProperty<CornerShape> CORNER_SHAPE = EnumProperty.create("type", CornerShape.class);
    public static final EnumProperty<CornerSlabShape> CORNER_SLAB_SHAPE = EnumProperty.create("type", CornerSlabShape.class);
    public static final EnumProperty<EighthShape> EIGHTH_SHAPE = EnumProperty.create("type", EighthShape.class);
    public static final EnumProperty<HalfArchShape> HALF_ARCH_SHAPE = EnumProperty.create("type", HalfArchShape.class);
    public static final EnumProperty<QuarterShape> QUARTER_SHAPE = EnumProperty.create("type", QuarterShape.class);
    public static final EnumProperty<VerticalCornerSlabShape> VERTICAL_CORNER_SLAB_SHAPE = EnumProperty.create("type", VerticalCornerSlabShape.class);
    public static final EnumProperty<VerticalQuarterShape> VERTICAL_QUARTER_SHAPE = EnumProperty.create("type", VerticalQuarterShape.class);
    public static final EnumProperty<VerticalSlabShape> VERTICAL_SLAB_SHAPE = EnumProperty.create("type", VerticalSlabShape.class);
    public static final EnumProperty<WindowShape> WINDOW_SHAPE = EnumProperty.create("type", WindowShape.class);
}
