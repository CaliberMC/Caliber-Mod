package com.calibermc.caliber.util.compat;

import net.minecraftforge.fml.ModList;

public class DoubleDoorsOpening {

    public static final boolean DOUBLE_DOORS;
    public static final boolean MANYIDEAS_DOORS;

    static {
        DOUBLE_DOORS = ModList.get().isLoaded("doubledoors");
        MANYIDEAS_DOORS = ModList.get().isLoaded("manyideas_doors");
    }
}

