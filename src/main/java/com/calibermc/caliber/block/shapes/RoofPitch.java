package com.calibermc.caliber.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum RoofPitch implements StringRepresentable {
    PITCH_22("22"),
    PITCH_45("45"),
    PITCH_67("67");


    private final String name;

    RoofPitch(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

