package com.calibermc.caliber.mixin;

import net.minecraftforge.registries.DeferredRegister;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = DeferredRegister.class, remap = false)
public interface DeferredRegisterAccessor {

    @Accessor("modid")
    String modid();
}
