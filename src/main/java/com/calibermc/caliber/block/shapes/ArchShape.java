package com.calibermc.caliber.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum ArchShape implements StringRepresentable {
    CORNER_RIGHT("corner_right"),
    CORNER_LEFT("corner_left"),
    RIGHT_T("right_t"),
    LEFT_T("left_t"),
    CROSS("cross"),
    STRAIGHT("straight");


    private final String name;

    ArchShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

