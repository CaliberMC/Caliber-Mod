package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum CornerShape implements StringRepresentable {
    LEFT ("left"),
    RIGHT ("right");


    private final String name;

    private CornerShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

