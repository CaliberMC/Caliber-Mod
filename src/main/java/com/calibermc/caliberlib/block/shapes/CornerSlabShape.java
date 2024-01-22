package com.calibermc.caliberlib.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum CornerSlabShape implements StringRepresentable {
    LEFT("left"),
    RIGHT("right"),
    TOP_LEFT("top_left"),
    TOP_RIGHT("top_right");


    private final String name;

    CornerSlabShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

