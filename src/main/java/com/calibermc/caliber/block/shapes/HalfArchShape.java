package com.calibermc.caliber.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum HalfArchShape implements StringRepresentable {
    SINGLE ("single"),
    DOUBLE ("double");


    private final String name;

    HalfArchShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

