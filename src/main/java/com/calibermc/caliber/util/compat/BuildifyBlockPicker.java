package com.calibermc.caliber.util.compat;

import com.calibermc.buildify.util.BlockPickerStatesJson;
import com.calibermc.caliber.data.CaliberBlockFamilies;
import com.calibermc.caliberlib.data.ModBlockFamily;

import java.util.ArrayList;

public class BuildifyBlockPicker {

    public static void init() {
        for (ModBlockFamily modBlockFamily : CaliberBlockFamilies.getAllFamilies().toList()) {
            BlockPickerStatesJson.registerBlockFamily(modBlockFamily.getBaseBlock(), () ->
                    new ArrayList<>(modBlockFamily.getVariants().entrySet().stream()
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_SIGN))
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_HANGING_SIGN))
                            .map(p -> p.getValue().asItem().getDefaultInstance()).toList()));
        }
    }
}

