package com.calibermc.caliber.crafting;

import com.calibermc.caliber.Caliber;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CaliberMenuTypes {

    public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Caliber.MOD_ID);

    public static final RegistryObject<MenuType<WoodcutterMenu>> WOODCUTTER = register("woodcutter", WoodcutterMenu::new);

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> register(String name, MenuType.MenuSupplier<T> factory) {
        return CONTAINERS.register(name, () -> new MenuType<>(factory, FeatureFlagSet.of()));
    }

    public static void register(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }
}
