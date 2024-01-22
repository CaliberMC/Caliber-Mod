package com.calibermc.caliber.event;


import com.calibermc.buildify.util.player.IPlayerExtended;
import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.entity.ModBlockEntities;
import com.calibermc.caliber.block.properties.BlockRenderLayers;
import com.calibermc.caliber.client.inventory.KilnScreen;
import com.calibermc.caliber.client.inventory.WoodcutterScreen;
import com.calibermc.caliber.crafting.ModRecipeSerializers;
import com.calibermc.caliber.networking.ModNetworking;
import com.calibermc.caliber.networking.ServerPressAdditionalKey;
import com.calibermc.caliber.world.inventory.ModMenuTypes;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.RecipeBookCategories;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.Items;
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
public class ModClientEventBus {

    public static final KeyMapping ALLOW_ADDITIONAL = new KeyMapping("%s.key.allow_additional".formatted(Caliber.MOD_ID), GLFW.GLFW_KEY_M, "key.categories.%s".formatted(Caliber.MOD_ID));

    public static RecipeBookCategories KILN_SEARCH_CATEGORY, KILN_MAIN_CATEGORY, WOODCUTTER_MAIN_CATEGORY;


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
        KILN_SEARCH_CATEGORY = RecipeBookCategories.create("kiln_search", Items.COMPASS.getDefaultInstance());
        KILN_MAIN_CATEGORY = RecipeBookCategories.create("kiln_main", ModBlocks.KILN.get().asItem().getDefaultInstance());
        WOODCUTTER_MAIN_CATEGORY = RecipeBookCategories.create("woodcutter", ModBlocks.WOODCUTTER.get().asItem().getDefaultInstance());

        // finder of woodcutting type recipes for main category
        event.registerRecipeCategoryFinder(ModRecipeSerializers.WOODCUTTING_TYPE.get(), (r) -> WOODCUTTER_MAIN_CATEGORY);

        // finder of alloying type recipes for main category
        event.registerRecipeCategoryFinder(ModRecipeSerializers.ALLOYING_TYPE.get(), (r) -> KILN_MAIN_CATEGORY);

        // furnace categories *remove if no need
        ImmutableList<RecipeBookCategories> furnaceCategories = ImmutableList.of(RecipeBookCategories.FURNACE_FOOD, RecipeBookCategories.FURNACE_BLOCKS, RecipeBookCategories.FURNACE_MISC);
        ImmutableList.Builder<RecipeBookCategories> categories = ImmutableList.<RecipeBookCategories>builder().add(KILN_MAIN_CATEGORY).addAll(furnaceCategories);

        // finder all categories that works with kiln
        event.registerAggregateCategory(KILN_SEARCH_CATEGORY, categories.build());

        event.registerBookCategories(Caliber.KILN_BOOK_TYPE,
                ImmutableList.<RecipeBookCategories>builder().add(KILN_SEARCH_CATEGORY, KILN_MAIN_CATEGORY).addAll(furnaceCategories).build());

    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        MenuScreens.register(ModMenuTypes.WOODCUTTER.get(), WoodcutterScreen::new);
        MenuScreens.register(ModMenuTypes.KILN.get(), KilnScreen::new);

        BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);

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
                    ModNetworking.INSTANCE.sendToServer(new ServerPressAdditionalKey(b));
                }
            }
        }
    }
}