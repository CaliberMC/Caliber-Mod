package com.calibermc.caliber.block.properties;

import net.minecraft.util.StringRepresentable;

public enum BalustradeShape implements StringRepresentable {
    SINGLE("single"),
    CONNECTED ("connected");


    private final String name;

    private BalustradeShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}

