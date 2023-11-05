package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum QuarterShape implements StringRepresentable {
    TOP ("top"),
    BOTTOM ("bottom"),
    DOUBLE ("double");


    private final String name;

    private QuarterShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

