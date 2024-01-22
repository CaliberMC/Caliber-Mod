package com.calibermc.caliberlib.block.shapes;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum VerticalQuarterLayerShape implements StringRepresentable {

    LEFT("left"),
    RIGHT("right");


    private final String name;

    VerticalQuarterLayerShape(String pName) {
        this.name = pName;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}

