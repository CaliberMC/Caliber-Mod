package com.calibermc.caliber.event;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.event.loot.GrassStemsFromGrassModifier;
import com.calibermc.caliber.event.loot.ResinFromSpruceLeavesModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Caliber.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new GrassStemsFromGrassModifier.Serializer().setRegistryName
                        (new ResourceLocation(Caliber.MOD_ID, "grass_stems_from_grass")),
                new ResinFromSpruceLeavesModifier.Serializer().setRegistryName
                        (new ResourceLocation(Caliber.MOD_ID, "resin_from_spruce_leaves"))
        );
    }
}

