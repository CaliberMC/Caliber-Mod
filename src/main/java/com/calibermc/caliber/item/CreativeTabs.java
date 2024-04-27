package com.calibermc.caliber.item;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.compat.item.BiomesOPlentyItems;
import com.calibermc.caliber.compat.item.CreateItems;
import com.calibermc.caliber.compat.item.RegionsUnexploredItems;
import com.calibermc.caliber.compat.ModCompats;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

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
                        if (ModCompats.BOP) {
                            for (RegistryObject<Item> entry : BiomesOPlentyItems.ITEMS.getEntries()) {
                                pOutput.accept(entry.get());
                            }
                        }
                        if (ModCompats.CREATE) {
                            for (RegistryObject<Item> entry : CreateItems.ITEMS.getEntries()) {
                                pOutput.accept(entry.get());
                            }
                        }
                        if (ModCompats.REGIONS_UNEXPLORED) {
                            for (RegistryObject<Item> entry : RegionsUnexploredItems.ITEMS.getEntries()) {
                                pOutput.accept(entry.get());
                            }
                        }

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
