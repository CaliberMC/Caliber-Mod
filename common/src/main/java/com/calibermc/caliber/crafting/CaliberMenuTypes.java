package com.calibermc.caliber.crafting;

import com.calibermc.caliber.Caliber;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

public class CaliberMenuTypes {

    public static final RegSupplier<MenuType<WoodcutterMenu>> WOODCUTTER = RegHelper.registerMenuType(new ResourceLocation(Caliber.MOD_ID, "woodcutter"), (i, inv, byteBuf) -> new WoodcutterMenu(i, inv));

    public static void init() {
    }
}
