package com.calibermc.caliber.event;


import com.calibermc.buildify.util.player.IPlayerExtended;
import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.block.custom.entity.CaliberBlockEntities;
import com.calibermc.caliber.block.properties.BlockRenderLayers;
import com.calibermc.caliber.client.inventory.WoodcutterScreen;
import com.calibermc.caliber.crafting.CaliberRecipeSerializers;
import com.calibermc.caliber.networking.CaliberNetworking;
import com.calibermc.caliber.networking.ServerPressAdditionalKey;
import com.calibermc.caliber.crafting.CaliberMenuTypes;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.RecipeBookCategories;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.event.RegisterRecipeBookCategoriesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.lwjgl.glfw.GLFW;

import static com.calibermc.caliber.Caliber.MOD_ID;


@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CaliberClientEventBus {

    public static final KeyMapping ALLOW_ADDITIONAL = new KeyMapping("%s.key.allow_additional".formatted(Caliber.MOD_ID), GLFW.GLFW_KEY_M, "key.categories.%s".formatted(Caliber.MOD_ID));

    public static RecipeBookCategories WOODCUTTER_MAIN_CATEGORY;


    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {

    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {

    }

    @SubscribeEvent
    public static void registerKeyMappings(final RegisterKeyMappingsEvent event) {
        event.register(ALLOW_ADDITIONAL);
    }

    @SubscribeEvent
    public static void registerRecipeBookCategories(final RegisterRecipeBookCategoriesEvent event) {
        WOODCUTTER_MAIN_CATEGORY = RecipeBookCategories.create("woodcutter", CaliberBlocks.WOODCUTTER.get().asItem().getDefaultInstance());

        // finder of woodcutting type recipes for main category
        event.registerRecipeCategoryFinder(CaliberRecipeSerializers.WOODCUTTING_TYPE.get(), (r) -> WOODCUTTER_MAIN_CATEGORY);

    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        MenuScreens.register(CaliberMenuTypes.WOODCUTTER.get(), WoodcutterScreen::new);

        // Set Block Render Types
        BlockRenderLayers.set();

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class Client {

        @SubscribeEvent
        public static void keyInput(final InputEvent.Key event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player == null || mc.screen != null) return;
            if (mc.player instanceof IPlayerExtended ex) {
                boolean b = ALLOW_ADDITIONAL.isDown();
                if (ex.buildify$additionalPressed() != b) {
                    ex.buildify$pressAdditional(b);
                    CaliberNetworking.INSTANCE.sendToServer(new ServerPressAdditionalKey(b));
                }
            }
        }
    }
}