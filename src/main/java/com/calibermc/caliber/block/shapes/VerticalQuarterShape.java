package com.calibermc.caliber.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum VerticalQuarterShape implements StringRepresentable {

    LEFT ("left"),
    RIGHT ("right"),
    DOUBLE ("double");


    private final String name;

    VerticalQuarterShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

