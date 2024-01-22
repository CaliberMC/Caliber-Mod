package com.calibermc.caliberlib.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum CapitalShape implements StringRepresentable {
    TOP("top"),
    BOTTOM("bottom");


    private final String name;

    CapitalShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

