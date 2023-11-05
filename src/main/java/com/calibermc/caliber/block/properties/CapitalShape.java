package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum CapitalShape implements StringRepresentable {
    TOP ("top"),
    BOTTOM ("bottom");


    private final String name;

    private CapitalShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

