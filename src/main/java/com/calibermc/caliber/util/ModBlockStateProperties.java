package com.calibermc.caliber.util;

import com.calibermc.caliber.block.custom.ShapeType;
import net.minecraft.world.level.block.state.properties.EnumProperty;


public class ModBlockStateProperties {
    public static final EnumProperty<ShapeType> SHAPE_TYPE = EnumProperty.create("type", ShapeType.class);
}
