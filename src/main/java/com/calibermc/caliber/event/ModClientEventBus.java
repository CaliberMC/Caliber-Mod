package com.calibermc.caliber.event;


import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.client.AdjustReachOverlay;
import com.calibermc.caliber.client.BlockPickerScreen;
import com.calibermc.caliber.networking.ModNetworking;
import com.calibermc.caliber.networking.ServerOpenBlockPickerMenu;
import com.calibermc.caliber.world.inventory.ModMenuTypes;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
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


    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {

    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {

    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        // register key V
        ClientRegistry.registerKeyBinding(BLOCK_PICKER);
        ClientRegistry.registerKeyBinding(ADJUST_REACH);
        ClientRegistry.registerKeyBinding(COPY_BLOCK);
        MenuScreens.register(ModMenuTypes.BLOCK_TYPE.get(), BlockPickerScreen::new);

        OverlayRegistry.registerOverlayAbove(ForgeIngameGui.HELMET_ELEMENT, "%s Adjust Distance".formatted(MOD_ID), new AdjustReachOverlay());
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class Client {

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
