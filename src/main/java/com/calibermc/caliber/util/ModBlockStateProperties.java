package com.calibermc.caliber.util;

import com.calibermc.caliber.block.custom.VerticalSlabType;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;

public class ModBlockStateProperties {
    public static final EnumProperty<VerticalSlabType> SLAB_TYPE = EnumProperty.create("type", VerticalSlabType.class);
}
