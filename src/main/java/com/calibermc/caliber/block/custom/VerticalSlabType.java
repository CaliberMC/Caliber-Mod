package com.calibermc.caliber.block.custom;

import net.minecraft.util.StringRepresentable;

public enum VerticalSlabType implements StringRepresentable {

    SINGLE("single"),
    DOUBLE("double");

    private final String name;

    private VerticalSlabType(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}