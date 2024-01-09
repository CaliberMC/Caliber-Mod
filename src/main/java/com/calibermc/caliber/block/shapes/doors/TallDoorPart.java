package com.calibermc.caliber.block.shapes.doors;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum TallDoorPart implements StringRepresentable {
    TOP("top"),
    MIDDLE("middle"),
    BOTTOM("bottom");


    private final String name;

    TallDoorPart(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}
