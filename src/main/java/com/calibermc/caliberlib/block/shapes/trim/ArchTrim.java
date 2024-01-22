package com.calibermc.caliberlib.block.shapes.trim;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum ArchTrim implements StringRepresentable {
    FRONT("front"),
    BOTH("both"),
    NONE("none");

    private final String name;

    ArchTrim(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

