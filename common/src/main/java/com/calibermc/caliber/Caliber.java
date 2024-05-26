package com.calibermc.caliber;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.command.CaliberCommands;
import com.calibermc.caliber.compat.BuildifyBlockPicker;
import com.calibermc.caliber.compat.ModCompats;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliber.compat.block.ChippedBlocks;
import com.calibermc.caliber.compat.block.CreateBlocks;
import com.calibermc.caliber.compat.block.RegionsUnexploredBlocks;
import com.calibermc.caliber.compat.item.BiomesOPlentyItems;
import com.calibermc.caliber.compat.item.ChippedItems;
import com.calibermc.caliber.compat.item.CreateItems;
import com.calibermc.caliber.compat.item.RegionsUnexploredItems;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.crafting.CaliberMenuTypes;
import com.calibermc.caliber.crafting.CaliberRecipeSerializers;
import com.calibermc.caliber.item.CaliberItems;
import com.calibermc.caliber.item.CreativeTabs;
import com.calibermc.caliber.networking.CaliberNetworking;
import com.calibermc.caliberlib.dynamicpack.ClientDynamicResourcesHandler;
import com.calibermc.caliberlib.dynamicpack.ServerDynamicResourcesHandler;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Caliber {
    public static final String MOD_ID = "caliber";
    public static final Logger LOGGER = LogManager.getLogger();

    public static void init() {
        LOGGER.info("Loading Caliber Mod");

        if (PlatHelper.getPhysicalSide().isClient()) {
            CaliberClient.init();
        }

        CaliberItems.init();
        CaliberBlocks.init();
        CaliberBlocks.printBlockCounts();

        registerResources("caliber");

        // COMPAT // || DataGenUtil.isDataGen
        if (ModCompats.BOP) {
            BiomesOPlentyItems.init();
            BiomesOPlentyBlocks.init();
            BiomesOPlentyBlocks.printBlockCounts();
            registerResources("biomesoplenty");
        }

        if (ModCompats.CHIPPED) {
            ChippedItems.init();
            ChippedBlocks.init();
            ChippedBlocks.printBlockCounts();
            registerResources("chipped");
        }

        if (ModCompats.CREATE) {
            CreateItems.init();
            CreateBlocks.init();
            CreateBlocks.printBlockCounts();
            registerResources("create");
        }

        if (ModCompats.REGIONS_UNEXPLORED) {
            RegionsUnexploredItems.init();
            RegionsUnexploredBlocks.init();
            RegionsUnexploredBlocks.printBlockCounts();
            registerResources("regions_unexplored");
        }

        CaliberMenuTypes.init();
        CaliberRecipeSerializers.init();
        CreativeTabs.init();

        LOGGER.info("Loading Caliber Mod");

        CaliberNetworking.init();
        CaliberBlocks.printBlockCounts();
        BuildifyBlockPicker.init();


        CaliberClientConfigs.init();
        CaliberCommonConfigs.init();
        RegHelper.addCommandRegistration((d, c, s) -> CaliberCommands.register(d));
    }

    private static void registerResources(String modid) {
        if (PlatHelper.getPhysicalSide().isClient()) {
            ClientDynamicResourcesHandler.registerResourceHandler(modid);
        }
        ServerDynamicResourcesHandler.registerResourceHandler(modid);
    }
}
