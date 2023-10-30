package com.calibermc.caliber.block.custom;

import net.minecraft.util.StringRepresentable;

public enum ShapeType implements StringRepresentable {
    SINGLE("single"),
    DOUBLE("double"),
    CONNECTED("connected"),
    TOP("top"),
    BOTTOM("bottom"),
    MIDDLE("middle"),
    LEFT("left"),
    RIGHT("right"),
    TOP_LEFT("top_left"),
    TOP_RIGHT("top_right"),
    DOUBLE_TOP("double_top"),
    DOUBLE_LEFT("double_left"),
    DOUBLE_RIGHT("double_right"),
    VERTICAL_SLAB_RIGHT("vertical_slab_right"),
    VERTICAL_SLAB_LEFT("vertical_slab_left"),
    SLAB_TOP("slab_top"),
    SLAB_BOTTOM("slab_bottom"),
    CORNER_RIGHT("corner_right"),
    CORNER_LEFT("corner_left"),
    RIGHT_T("right_t"),
    LEFT_T("left_t"),
    CROSS("cross"),
    STRAIGHT("straight"),
    FULL_BLOCK("full_block");

    private final String name;

    private ShapeType(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}