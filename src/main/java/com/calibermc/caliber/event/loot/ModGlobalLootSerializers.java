package com.calibermc.caliber.event.loot;

import com.calibermc.caliber.Caliber;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGlobalLootSerializers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLOBAL_LOOT_MODIFIERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Caliber.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> RESIN_FROM_SPRUCE_LEAVES = GLOBAL_LOOT_MODIFIERS.register("resin_from_spruce_leaves", ResinFromSpruceLeavesModifier.CODEC);

    public static void register(IEventBus eventBus) {
        GLOBAL_LOOT_MODIFIERS.register(eventBus);
    }
}
