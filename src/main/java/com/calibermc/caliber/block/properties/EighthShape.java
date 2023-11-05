package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum EighthShape implements StringRepresentable {
    LEFT ("left"),
    RIGHT ("right"),
    TOP_LEFT ("top_left"),
    TOP_RIGHT ("top_right"),
    DOUBLE_LEFT ("double_left"),
    DOUBLE_RIGHT ("double_right"),
    DOUBLE_TOP ("double_top"),
    DOUBLE ("double");


    private final String name;

    private EighthShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

