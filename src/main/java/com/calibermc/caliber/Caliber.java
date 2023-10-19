package com.calibermc.caliber;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.item.ModItems;
import com.calibermc.caliber.world.feature.ModConfiguredFeatures;
import com.calibermc.caliber.world.feature.ModPlacedFeatures;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Caliber.MOD_ID)
public class Caliber {
    public static final String MOD_ID = "caliber";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    // Very important Comment
    public Caliber() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

//        ModConfiguredFeatures.register(eventBus);
//        ModPlacedFeatures.register(eventBus);

//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_GRANITE_SLAB_VERTICAL.get(), RenderType.translucent());

        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CaliberClientConfigs.SPEC, "calibermod-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CaliberCommonConfigs.SPEC, "calibermod-common.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
