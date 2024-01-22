package com.calibermc.caliberlib.block.shapes.trim;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum LargeArchTrim implements StringRepresentable {
    RIGHT("right"),
    LEFT("left"),
    BOTH("both"),
    NONE("none");

    private final String name;

    LargeArchTrim(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

