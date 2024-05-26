package com.calibermc.caliber.forge.mixin;

import com.electronwill.nightconfig.core.Config;
import net.minecraftforge.common.ForgeConfigSpec;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = ForgeConfigSpec.class)
public interface ForgeConfigSpecAccessor {

    @Accessor("childConfig")
    Config childConfig();
}
