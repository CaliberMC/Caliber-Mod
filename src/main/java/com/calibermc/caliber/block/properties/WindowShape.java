package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum WindowShape implements StringRepresentable {
    TOP ("top"),
    MIDDLE ("middle"),
    BOTTOM ("bottom"),
    FULL_BLOCK ("full_block");


    private final String name;

    private WindowShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

