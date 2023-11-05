package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum VerticalCornerSlabShape implements StringRepresentable {
    RIGHT ("right"),
    LEFT ("left"),
    TOP_LEFT ("top_left"),
    TOP_RIGHT ("top_right"),
    DOUBLE_TOP ("double_top"),
    DOUBLE ("double");


    private final String name;

    private VerticalCornerSlabShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

