package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum HalfArchShape implements StringRepresentable {
    SINGLE ("single"),
    DOUBLE ("double");


    private final String name;

    private HalfArchShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

