package com.calibermc.caliber.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum QuarterShape implements StringRepresentable {
    TOP ("top"),
    BOTTOM ("bottom"),
    DOUBLE ("double");


    private final String name;

    QuarterShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

