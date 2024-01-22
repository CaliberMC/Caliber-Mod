package com.calibermc.caliberlib.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum LargeArchShape implements StringRepresentable {
    CORNER_LEFT("corner_left"),
    CORNER_RIGHT("corner_right"),
    CORNER_OUTER_LEFT("corner_outer_left"),
    CORNER_OUTER_RIGHT("corner_outer_right"),
    STRAIGHT("straight");


    private final String name;

    LargeArchShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

