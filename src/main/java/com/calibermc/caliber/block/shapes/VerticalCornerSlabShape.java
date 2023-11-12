package com.calibermc.caliber.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum VerticalCornerSlabShape implements StringRepresentable {
    RIGHT ("right"),
    LEFT ("left"),
    TOP_LEFT ("top_left"),
    TOP_RIGHT ("top_right"),
    DOUBLE_TOP ("double_top"),
    DOUBLE ("double");


    private final String name;

    VerticalCornerSlabShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

