package com.calibermc.caliber.item;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.compat.item.BiomesOPlentyItems;
import com.calibermc.caliber.compat.item.ChippedItems;
import com.calibermc.caliber.compat.item.CreateItems;
import com.calibermc.caliber.compat.item.RegionsUnexploredItems;
import com.calibermc.caliber.compat.ModCompats;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

public class CreativeTabs {

    public static final RegSupplier<CreativeModeTab> CALIBER_TAB = RegHelper.registerCreativeModeTab(new ResourceLocation(Caliber.MOD_ID, "caliber"),
            (b) -> b.title(Component.translatable("itemGroup.caliber"))
                    //.withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(CaliberBlocks.POLISHED_DIORITE.mainChild()))
                    .displayItems((pParameters, pOutput) -> {
                        for (Item entry : CaliberItems.values())
                        {
                            pOutput.accept(entry);
                        }
                        if (ModCompats.BOP) {
                            for (Item entry : BiomesOPlentyItems.values()) {
                                pOutput.accept(entry);
                            }
                        }
                        if (ModCompats.CHIPPED) {
                            for (Item entry : ChippedItems.values()) {
                                pOutput.accept(entry);
                            }
                        }
                        if (ModCompats.CREATE) {
                            for (Item entry : CreateItems.values()) {
                                pOutput.accept(entry);
                            }
                        }
                        if (ModCompats.REGIONS_UNEXPLORED) {
                            for (Item entry : RegionsUnexploredItems.values()) {
                                pOutput.accept(entry);
                            }
                        }

                    }).build());

    public static void init() {
    }
}
