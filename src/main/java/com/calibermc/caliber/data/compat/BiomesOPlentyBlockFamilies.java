package com.calibermc.caliber.data.compat;

import com.calibermc.caliber.block.compat.RegionsUnexploredBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import net.regions_unexplored.block.RuBlocks;

import static com.calibermc.caliber.data.CaliberBlockFamilies.familyBuilder;

public class BiomesOPlentyBlockFamilies {



    private static BiomesOPlentyBlockFamilies instance = null;

    private BiomesOPlentyBlockFamilies() { }

    public static BiomesOPlentyBlockFamilies getInstance() {
        if (instance == null) {
            instance = new BiomesOPlentyBlockFamilies();
        }
        return instance;
    }
}

