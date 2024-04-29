package com.calibermc.caliber.compat;

import com.calibermc.buildify.config.CommonConfigs;
import com.calibermc.buildify.util.BlockPickerStatesJson;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.data.CaliberBlockFamilies;
import com.calibermc.caliberlib.data.ModBlockFamily;

import java.util.ArrayList;

public class BuildifyBlockPicker {

    public static void init() {

        boolean useVanillaBlockFamilies = CommonConfigs.USE_VANILLA_BLOCK_FAMILIES.get();

        CaliberBlockFamilies.compat();

        for (ModBlockFamily modBlockFamily : CaliberBlockFamilies.getAllFamilies().toList()) {
            BlockPickerStatesJson.registerBlockFamily(modBlockFamily.getBaseBlock(), () ->
                    new ArrayList<>(modBlockFamily.getVariants().entrySet().stream()
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_SIGN))
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_HANGING_SIGN))
                            .filter(p -> {
                                if (useVanillaBlockFamilies)
                                    return true;
                                else
                                    return !p.getKey().equals(ModBlockFamily.Variant.BUTTON)
                                            && !p.getKey().equals(ModBlockFamily.Variant.DOOR)
                                            && !p.getKey().equals(ModBlockFamily.Variant.PRESSURE_PLATE)
                                            && !p.getKey().equals(ModBlockFamily.Variant.SIGN)
                                            && !p.getKey().equals(ModBlockFamily.Variant.HANGING_SIGN)
                                            && !p.getKey().equals(ModBlockFamily.Variant.TALL_DOOR)
                                            && !p.getKey().equals(ModBlockFamily.Variant.TRAPDOOR);
                            })
                            .map(p -> p.getValue().asItem().getDefaultInstance()).toList()));
        }
    }
}

