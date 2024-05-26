package com.calibermc.caliber.forge;

import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.forge.mixin.ForgeConfigSpecAccessor;
import net.mehvahdjukaar.moonlight.api.platform.configs.forge.ConfigSpecWrapper;
import net.minecraftforge.common.ForgeConfigSpec;

public class CaliberHelperImpl {

    public static void setBlockStateMode(int mode) {
        if (CaliberCommonConfigs.SPEC instanceof ConfigSpecWrapper spec) {
            ((ForgeConfigSpecAccessor)spec.getSpec()).childConfig().set("mode_blockstates", mode);
        }
    }
}
