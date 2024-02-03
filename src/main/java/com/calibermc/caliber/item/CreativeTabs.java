package com.calibermc.caliber.item;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
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

//    private static final String[] GRANITE = new String[]{"black_granite", "brown_granite", "gray_granite", "pink_granite",
//            "granite", "red_granite", "white_granite"};
//    private static final String[] LIMESTONE = new String[]{"dark_limestone", "light_limestone", "pink_limestone",
//            "tan_limestone", "stone", "limestone"};
//    private static final String[] MARBLE = new String[]{"black_marble", "gray_marble", "pink_marble",
//            "red_marble", "white_marble"};
//    private static final String[] SANDSTONE = new String[]{"brown_sandstone", "orange_sandstone", "red_sandstone", "sandstone"};

    // Sorted
    private static List<Item> getItems() {
        return ForgeRegistries.ITEMS.getEntries().stream().map(Map.Entry::getValue).sorted((o, o1) -> {
            ResourceLocation str1 = ForgeRegistries.ITEMS.getKey(o);
            ResourceLocation str2 = ForgeRegistries.ITEMS.getKey(o1);
            assert str1 != null && str2 != null;
            return str1.compareTo(str2);
        }).toList();
    }

    // Sorted or Not Sorted via Config
//        private static List<Item> getItems() {
//            boolean shouldSort = CaliberClientConfigs.SORT_CREATIVE_INVENTORY.get();
////            boolean shouldSort = false;
//
//            // Retrieve all registered items as a stream of Map.Entry objects.
//            List<Item> items = ForgeRegistries.ITEMS.getEntries().stream()
//                    // Map each Map.Entry to its associated item.
//                    .map(Map.Entry::getValue)
//                    // Collect the items into a list.
//                    .toList();
//
//            // Conditionally sort the list if shouldSort is true.
//            if (shouldSort) {
//                items.sort((item1, item2) -> {
//                    ResourceLocation loc1 = ForgeRegistries.ITEMS.getKey(item1);
//                    ResourceLocation loc2 = ForgeRegistries.ITEMS.getKey(item2);
//
//                    // Use compareTo to compare the ResourceLocation strings.
//                    assert loc1 != null && loc2 != null;
//                    return loc1.compareTo(loc2);
//                });
//            }
//
//            return items;
//        }


    // Unsorted
//        private static List<Item> getItems() {
//            // Retrieve all registered items as a stream of Map.Entry objects.
//            return ForgeRegistries.ITEMS.getEntries().stream()
//                    // Map each Map.Entry to its associated item.
//                    .map(Map.Entry::getValue)
//                    // Collect the items into a list without sorting.
//                    .toList();
//        }
}
