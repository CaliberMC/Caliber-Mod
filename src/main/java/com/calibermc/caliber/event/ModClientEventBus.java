package com.calibermc.caliber.event;


import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.client.AdjustReachOverlay;
import com.calibermc.caliber.client.BlockPickerScreen;
import com.calibermc.caliber.client.inventory.KilnScreen;
import com.calibermc.caliber.client.inventory.WoodcutterScreen;
import com.calibermc.caliber.crafting.ModRecipeSerializers;
import com.calibermc.caliber.networking.ModNetworking;
import com.calibermc.caliber.networking.ServerOpenBlockPickerMenu;
import com.calibermc.caliber.networking.ServerPressAdditionalKey;
import com.calibermc.caliber.util.player.IPlayerExtended;
import com.calibermc.caliber.world.inventory.ModMenuTypes;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.RecipeBookCategories;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.RecipeBookRegistry;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.client.gui.ForgeIngameGui;
import net.minecraftforge.client.gui.OverlayRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.lwjgl.glfw.GLFW;

import static com.calibermc.caliber.Caliber.MOD_ID;


@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEventBus {

    public static final KeyMapping BLOCK_PICKER = new KeyMapping("%s.key.block_picker_screen".formatted(Caliber.MOD_ID), GLFW.GLFW_KEY_V, "key.categories.%s".formatted(Caliber.MOD_ID));
    public static final KeyMapping COPY_BLOCK = new KeyMapping("%s.key.copy_block".formatted(Caliber.MOD_ID), GLFW.GLFW_KEY_B, "key.categories.%s".formatted(Caliber.MOD_ID));
    public static final KeyMapping ADJUST_REACH = new KeyMapping("%s.key.adjust_reach".formatted(Caliber.MOD_ID), GLFW.GLFW_KEY_N, "key.categories.%s".formatted(Caliber.MOD_ID));

    public static final KeyMapping ALLOW_ADDITIONAL = new KeyMapping("%s.key.allow_additional".formatted(Caliber.MOD_ID), GLFW.GLFW_KEY_M, "key.categories.%s".formatted(Caliber.MOD_ID));

    public static RecipeBookCategories KILN_SEARCH_CATEGORY, KILN_MAIN_CATEGORY, WOODCUTTER_MAIN_CATEGORY;

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {

    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {

    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        ClientRegistry.registerKeyBinding(BLOCK_PICKER);
        ClientRegistry.registerKeyBinding(ADJUST_REACH);
        ClientRegistry.registerKeyBinding(COPY_BLOCK);
        ClientRegistry.registerKeyBinding(ALLOW_ADDITIONAL);
        MenuScreens.register(ModMenuTypes.BLOCK_TYPE.get(), BlockPickerScreen::new);
        MenuScreens.register(ModMenuTypes.WOODCUTTER.get(), WoodcutterScreen::new);
        MenuScreens.register(ModMenuTypes.KILN.get(), KilnScreen::new);

        OverlayRegistry.registerOverlayAbove(ForgeIngameGui.HELMET_ELEMENT, "%s Adjust Distance".formatted(MOD_ID), new AdjustReachOverlay());

        KILN_SEARCH_CATEGORY = RecipeBookCategories.create("kiln_search", Items.COMPASS.getDefaultInstance());
        KILN_MAIN_CATEGORY = RecipeBookCategories.create("kiln_main", ModBlocks.KILN.get().asItem().getDefaultInstance());
        WOODCUTTER_MAIN_CATEGORY = RecipeBookCategories.create("woodcutter", ModBlocks.WOODCUTTER.get().asItem().getDefaultInstance());

        // Block Render Types
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOODCUTTER.get(), RenderType.cutout());

        RecipeBookRegistry.addCategoriesFinder(ModRecipeSerializers.WOODCUTTING_TYPE.get(), (r) -> WOODCUTTER_MAIN_CATEGORY);

        // Recipe book for kiln

        // finder of alloying type recipes for main category
        RecipeBookRegistry.addCategoriesFinder(ModRecipeSerializers.ALLOYING_TYPE.get(), (r) -> KILN_MAIN_CATEGORY);

        // furnace categories *remove if no need
        ImmutableList<RecipeBookCategories> furnaceCategories = ImmutableList.of(RecipeBookCategories.FURNACE_FOOD, RecipeBookCategories.FURNACE_BLOCKS, RecipeBookCategories.FURNACE_MISC);
        ImmutableList.Builder<RecipeBookCategories> categories = ImmutableList.<RecipeBookCategories>builder().add(KILN_MAIN_CATEGORY).addAll(furnaceCategories);

        // finder all categories that works with kiln
        RecipeBookRegistry.addAggregateCategories(KILN_SEARCH_CATEGORY, categories.build());

        RecipeBookRegistry.addCategoriesToType(Caliber.KILN_BOOK_TYPE,
                ImmutableList.<RecipeBookCategories>builder().add(KILN_SEARCH_CATEGORY, KILN_MAIN_CATEGORY).addAll(furnaceCategories).build());
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class Client {

        /**
         * LEFT_CONTROL + MIDDLE CLICK instead of or in addition to the keybind.
         */
        @SubscribeEvent
        public static void mouseInput(final InputEvent.RawMouseEvent event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player == null || mc.screen != null) return;
            if (event.getButton() == GLFW.GLFW_MOUSE_BUTTON_MIDDLE && event.getModifiers() == GLFW.GLFW_MOD_CONTROL) {
                if (mc.hitResult != null && mc.hitResult.getType() == HitResult.Type.BLOCK && mc.player.isCreative()) {
                    onPickBlock(mc.hitResult, mc.player, mc.level);
                    event.setCanceled(true);
                }
            }
        }

        @SubscribeEvent
        public static void keyInput(final InputEvent.KeyInputEvent event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player == null || mc.screen != null) return;
            if (BLOCK_PICKER.consumeClick() && !mc.player.getMainHandItem().isEmpty() && mc.player.isCreative()) {
                ModNetworking.INSTANCE.sendToServer(new ServerOpenBlockPickerMenu());
            }
            if (COPY_BLOCK.consumeClick()) {
                if (mc.hitResult != null && mc.hitResult.getType() == HitResult.Type.BLOCK && mc.player.isCreative()) {
                    onPickBlock(mc.hitResult, mc.player, mc.level);
                }
            }
            if (mc.player instanceof IPlayerExtended ex) {
                boolean b = ALLOW_ADDITIONAL.isDown();
                if (ex.caliber$additionalPressed() != b) {
                    ex.caliber$pressAdditional(b);
                    ModNetworking.INSTANCE.sendToServer(new ServerPressAdditionalKey(b));
                }
            }
        }

        public static void onPickBlock(HitResult target, Player player, Level level) {
            BlockEntity te = null;

            BlockPos pos = ((BlockHitResult) target).getBlockPos();
            BlockState state = level.getBlockState(pos);

            if (state.isAir())
                return;

            if (state.hasBlockEntity())
                te = level.getBlockEntity(pos);

            ItemStack result = state.getCloneItemStack(target, level, pos, player);

            if (result.isEmpty())
                return;

            // save blockstate
            CompoundTag compoundTag = result.getOrCreateTag();
            CompoundTag compoundTag3;
            if (compoundTag.contains("BlockStateTag", 10)) {
                compoundTag3 = compoundTag.getCompound("BlockStateTag");
            } else {
                compoundTag3 = new CompoundTag();
                compoundTag.put("BlockStateTag", compoundTag3);
            }
            state.getProperties().stream().filter(state::hasProperty).forEach((property) ->
                    compoundTag3.putString(property.getName(), serialize(state, property)));

            if (te != null)
                Minecraft.getInstance().addCustomNbtData(result, te);

            player.getInventory().setPickedItem(result);
            assert Minecraft.getInstance().gameMode != null;
            Minecraft.getInstance().gameMode.handleCreativeModeItemAdd(player.getItemInHand(InteractionHand.MAIN_HAND), 36 + player.getInventory().selected);
        }
    }

    private static <T extends Comparable<T>> String serialize(BlockState pBlockState, Property<T> pProperty) {
        T t = pBlockState.getValue(pProperty);
        return pProperty.getName(t);
    }
}
