package com.calibermc.caliber.block.custom;

import net.minecraft.util.StringRepresentable;

public enum ShapeType implements StringRepresentable {
    TOP_LEFT("top_left"),
    TOP_RIGHT("top_right"),
    DOUBLE_LEFT("double_left"),
    DOUBLE_RIGHT("double_right"),
    TOP("top"),
    BOTTOM("bottom"),
    LEFT("left"),
    RIGHT("right"),
    SINGLE("single"),
    DOUBLE("double");

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