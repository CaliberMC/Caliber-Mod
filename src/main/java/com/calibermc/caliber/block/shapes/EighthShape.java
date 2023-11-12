package com.calibermc.caliber.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum EighthShape implements StringRepresentable {
    LEFT ("left"),
    RIGHT ("right"),
    TOP_LEFT ("top_left"),
    TOP_RIGHT ("top_right"),
    DOUBLE_LEFT ("double_left"),
    DOUBLE_RIGHT ("double_right"),
    DOUBLE_TOP ("double_top"),
    DOUBLE ("double");


    private final String name;

    EighthShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

