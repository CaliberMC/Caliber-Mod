package com.calibermc.caliberlib.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum RoofPeakShape implements StringRepresentable {
    CORNER_RIGHT("corner_right"),
    CORNER_LEFT("corner_left"),
    LEFT_T("left_t"),
    RIGHT_T("right_t"),
    FACING_T("facing_t"),
    OPPOSITE_T("opposite_t"),
    CROSS("cross"),
    STRAIGHT("straight"),
    CAP("cap"),
    END_FACING("end_facing"),
    END_OPPOSITE("end_opposite");


    private final String name;

    RoofPeakShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

