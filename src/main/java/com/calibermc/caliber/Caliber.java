package com.calibermc.caliber;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliber.compat.block.ChippedBlocks;
import com.calibermc.caliber.compat.block.CreateBlocks;
import com.calibermc.caliber.compat.block.RegionsUnexploredBlocks;
import com.calibermc.caliber.compat.item.ChippedItems;
import com.calibermc.caliber.compat.item.CreateItems;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.crafting.CaliberRecipeSerializers;
import com.calibermc.caliber.item.CaliberItems;
import com.calibermc.caliber.item.CreativeTabs;
import com.calibermc.caliber.compat.item.BiomesOPlentyItems;
import com.calibermc.caliber.compat.item.RegionsUnexploredItems;
import com.calibermc.caliber.networking.CaliberNetworking;
import com.calibermc.caliber.compat.BuildifyBlockPicker;
import com.calibermc.caliber.crafting.CaliberMenuTypes;
import com.calibermc.caliber.compat.ModCompats;
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

    public static final Logger LOGGER = LogManager.getLogger();

//    public static ResourceLocation res(String name) {
//        return new ResourceLocation(MOD_ID, name);
//    }

    public Caliber() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CaliberItems.register(eventBus);
        CaliberBlocks.register(eventBus);
        CaliberBlocks.printBlockCounts();

        // COMPAT // || DataGenUtil.isDataGen
        if (ModCompats.BOP) {
            BiomesOPlentyItems.register(eventBus);
            BiomesOPlentyBlocks.register(eventBus);
            BiomesOPlentyBlocks.printBlockCounts();
        }

//        if (ModCompats.CHIPPED) {
//            ChippedItems.register(eventBus);
//            ChippedBlocks.register(eventBus);
//            ChippedBlocks.printBlockCounts();
//        }

        if (ModCompats.CREATE) {
            CreateItems.register(eventBus);
            CreateBlocks.register(eventBus);
            CreateBlocks.printBlockCounts();
        }

        if (ModCompats.REGIONS_UNEXPLORED) {
            RegionsUnexploredItems.register(eventBus);
            RegionsUnexploredBlocks.register(eventBus);
            RegionsUnexploredBlocks.printBlockCounts();
        }

        CaliberMenuTypes.register(eventBus);
        CaliberRecipeSerializers.register(eventBus);
        CreativeTabs.register(eventBus);

        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CaliberClientConfigs.SPEC, "calibermod-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CaliberCommonConfigs.SPEC, "calibermod-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Loading Caliber Mod");

        CaliberNetworking.registerMessages();
        CaliberBlocks.printBlockCounts();
        BuildifyBlockPicker.init();
    }

//    @SubscribeEvent
//    public void addPackFinders(AddPackFindersEvent event) {
//
//        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
//            registerBuiltinResourcePack(event, Component.literal("Caliber Mod"), "caliber_mod");
//        }
//    }
//
//    private static void registerBuiltinResourcePack(AddPackFindersEvent event, MutableComponent name, String folder) {
//        event.addRepositorySource((consumer, constructor) -> {
//            String path = Caliber.res(folder).toString();
//            IModFile file = ModList.get().getModFileById(Caliber.MOD_ID).getFile();
//            try (PathResourcePack pack = new PathResourcePack(
//                    path,
//                    file.findResource("resourcepacks/" + folder));) {
//
//                consumer.accept(constructor.create(
//                        Caliber.res(folder).toString(),
//                        name,
//                        false,
//                        () -> pack,
//                        pack.getMetadataSection(PackMetadataSection.SERIALIZER),
//                        Pack.Position.TOP,
//                        PackSource.BUILT_IN,
//                        false));
//
//            } catch (IOException e) {
//                if (!DatagenModLoader.isRunningDataGen())
//                    e.printStackTrace();
//            }
//        });
//    }
}
