package com.calibermc.caliber.util.compat;

import com.calibermc.buildify.util.BlockPickerStatesJson;
import com.calibermc.caliber.data.ModBlockFamilies;
import com.calibermc.caliberlib.data.ModBlockFamily;

import java.util.ArrayList;

public class BuildifyBlockPicker {

    public static void init() {
        for (ModBlockFamily modBlockFamily : ModBlockFamilies.getAllFamilies().toList()) {
            BlockPickerStatesJson.registerBlockFamily(modBlockFamily.getBaseBlock(), () ->
                    new ArrayList<>(modBlockFamily.getVariants().entrySet().stream()
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_SIGN))
                            .map(p -> p.getValue().asItem().getDefaultInstance()).toList()));
        }
    }
}

