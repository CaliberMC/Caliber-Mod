package com.calibermc.caliber.util.compat;

import net.minecraftforge.fml.ModList;

public class ModCompats {

    public static final boolean BOP;
    public static final boolean BYG;
    public static final boolean CHIPPED;
    public static final boolean DOUBLE_DOORS;
    public static final boolean MANYIDEAS_DOORS;
    public static final boolean QUARK;
    public static final boolean REGIONS_UNEXPLORED;

    static {
        BOP = ModList.get().isLoaded("biomesoplenty");
        BYG = ModList.get().isLoaded("byg");
        CHIPPED = ModList.get().isLoaded("chipped");
        DOUBLE_DOORS = ModList.get().isLoaded("doubledoors");
        MANYIDEAS_DOORS = ModList.get().isLoaded("manyideas_doors");
        QUARK = ModList.get().isLoaded("quark");
        REGIONS_UNEXPLORED = ModList.get().isLoaded("regions_unexplored");
    }
}

