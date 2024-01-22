package com.calibermc.caliberlib.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum QuarterLayerShape implements StringRepresentable {
    TOP("top"),
    BOTTOM("bottom");

    private final String name;

    QuarterLayerShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

