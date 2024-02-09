package com.calibermc.caliber.item;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;

public class CreativeTabs {

    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Caliber.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CALIBER_TAB = CREATIVE_TABS.register("caliber",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.caliber"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(CaliberBlocks.POLISHED_DIORITE.baseBlock()))
                    .displayItems((pParameters, pOutput) -> {
                        for (RegistryObject<Item> entry : CaliberItems.ITEMS.getEntries()) {
                            pOutput.accept(entry.get());
                        }
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
