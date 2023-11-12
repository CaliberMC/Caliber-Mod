package com.calibermc.caliber.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum WindowShape implements StringRepresentable {
    TOP ("top"),
    MIDDLE ("middle"),
    BOTTOM ("bottom"),
    FULL_BLOCK ("full_block");


    private final String name;

    WindowShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

