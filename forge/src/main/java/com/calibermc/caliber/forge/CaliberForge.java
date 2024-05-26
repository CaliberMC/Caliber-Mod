package com.calibermc.caliber.forge;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.crafting.CaliberRecipeSerializers;
import com.calibermc.caliber.event.CaliberEventBus;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.RecipeBookCategories;
import net.minecraft.client.gui.Gui;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.client.event.RegisterRecipeBookCategoriesEvent;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Caliber.MOD_ID)
public class CaliberForge {
    public CaliberForge() {
        // Submit our event bus to let architectury register our content on the right time
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        Caliber.init();
        if (PlatHelper.getPhysicalSide().isClient()) {
            MinecraftForge.EVENT_BUS.addListener(this::registerRecipeBookCategories);
        }
        MinecraftForge.EVENT_BUS.addListener(this::preventRightClick);
    }

    private void preventRightClick(final PlayerInteractEvent.RightClickBlock event) {
        if (CaliberEventBus.preventRightClick(event.getEntity(), event.getLevel(), event.getPos(), event.getHand())) {
            event.setCanceled(true);
        }
    }


    public static RecipeBookCategories WOODCUTTER_MAIN_CATEGORY;

    private void registerRecipeBookCategories(final RegisterRecipeBookCategoriesEvent event) {
        WOODCUTTER_MAIN_CATEGORY = RecipeBookCategories.create("woodcutter", CaliberBlocks.WOODCUTTER.get().asItem().getDefaultInstance());

        // finder of woodcutting type recipes for main category
        event.registerRecipeCategoryFinder(CaliberRecipeSerializers.WOODCUTTING_TYPE.get(), (r) -> WOODCUTTER_MAIN_CATEGORY);
    }
}
