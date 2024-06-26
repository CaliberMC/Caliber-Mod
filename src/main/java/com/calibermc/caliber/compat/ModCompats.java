package com.calibermc.caliber.compat;

import com.calibermc.caliber.Caliber;
import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModCompats {

    public static List<String> blockManagerMODID = new ArrayList<>(Arrays.asList(Caliber.MOD_ID));


    public static final boolean BOP;
    public static final boolean BYG;
    public static final boolean CHIPPED;
    public static final boolean CREATE;
    public static final boolean DOUBLE_DOORS;
    public static final boolean MANYIDEAS_DOORS;
    public static final boolean QUARK;
    public static final boolean REGIONS_UNEXPLORED;

    static {
        BOP = ModList.get().isLoaded("biomesoplenty");
        BYG = ModList.get().isLoaded("byg");
        CHIPPED = ModList.get().isLoaded("chipped");
        CREATE = ModList.get().isLoaded("create");
        DOUBLE_DOORS = ModList.get().isLoaded("doubledoors");
        MANYIDEAS_DOORS = ModList.get().isLoaded("manyideas_doors");
        QUARK = ModList.get().isLoaded("quark");
        REGIONS_UNEXPLORED = ModList.get().isLoaded("regions_unexplored");


        if (BOP) {
            blockManagerMODID.add("biomesoplenty");
        }
        if (BYG) {
            blockManagerMODID.add("byg");
        }
//        if (CHIPPED) {
//            blockManagerMODID.add("chipped");
//        }
        if (CREATE) {
            blockManagerMODID.add("create");
        }
        if (DOUBLE_DOORS) {
            blockManagerMODID.add("doubledoors");
        }
        if (MANYIDEAS_DOORS) {
            blockManagerMODID.add("manyideas_doors");
        }
        if (QUARK) {
            blockManagerMODID.add("quark");
        }
        if (REGIONS_UNEXPLORED) {
            blockManagerMODID.add("regions_unexplored");
        }
    }
}

