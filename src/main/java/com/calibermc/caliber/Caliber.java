package com.calibermc.caliber;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.entity.ModBlockEntities;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.crafting.ModRecipeSerializers;
import com.calibermc.caliber.item.CreativeTabs;
import com.calibermc.caliber.item.ModItems;
import com.calibermc.caliber.networking.ModNetworking;
import com.calibermc.caliber.util.compat.BuildifyBlockPicker;
import com.calibermc.caliber.world.inventory.ModMenuTypes;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Caliber.MOD_ID)
public class Caliber {
    public static final String MOD_ID = "caliber";
    public static final RecipeBookType KILN_BOOK_TYPE = RecipeBookType.create("kiln");

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public Caliber() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModRecipeSerializers.register(eventBus);
        ModBlockEntities.register(eventBus);

//        ModConfiguredFeatures.register(eventBus);
//        ModPlacedFeatures.register(eventBus);

        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CaliberClientConfigs.SPEC, "calibermod-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CaliberCommonConfigs.SPEC, "calibermod-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Loading Caliber Mod");

        ModNetworking.registerMessages();
        CreativeTabs.setupCreativeTabs();
        ModBlocks.printBlockCounts();
        ModItems.printItemCounts();
//        ModRecipeProvider.printRecipeCounts();
        BuildifyBlockPicker.init();
    }
}
