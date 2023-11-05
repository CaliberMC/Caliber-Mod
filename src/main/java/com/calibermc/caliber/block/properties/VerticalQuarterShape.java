package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum VerticalQuarterShape implements StringRepresentable {

    LEFT ("left"),
    RIGHT ("right"),
    DOUBLE ("double");


    private final String name;

    private VerticalQuarterShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

