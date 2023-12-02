package com.calibermc.caliber.world.inventory;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.world.inventory.kiln.KilnMenu;
import com.calibermc.caliber.world.inventory.woodcutter.WoodcutterMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Caliber.MOD_ID);

    public static final RegistryObject<MenuType<BlockPickerMenu>> BLOCK_TYPE = register("block_type", BlockPickerMenu::new);
    public static final RegistryObject<MenuType<WoodcutterMenu>> WOODCUTTER = register("woodcutter", WoodcutterMenu::new);
    public static final RegistryObject<MenuType<KilnMenu>> KILN = register("kiln", KilnMenu::new);

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> register(String name, MenuType.MenuSupplier<T> factory) {
        return CONTAINERS.register(name, () -> new MenuType<>(factory));
    }

    public static void register(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }
}
