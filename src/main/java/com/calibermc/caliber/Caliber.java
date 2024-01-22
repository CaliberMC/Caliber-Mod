package com.calibermc.caliber;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.entity.ModBlockEntities;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.crafting.ModRecipeSerializers;
import com.calibermc.caliber.event.loot.ModGlobalLootSerializers;
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

    public static final Logger LOGGER = LogManager.getLogger();

//    public static ResourceLocation res(String name) {
//        return new ResourceLocation(MOD_ID, name);
//    }

    public Caliber() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModRecipeSerializers.register(eventBus);
        ModBlockEntities.register(eventBus);
        CreativeTabs.register(eventBus);
        ModGlobalLootSerializers.register(eventBus);

        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CaliberClientConfigs.SPEC, "calibermod-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CaliberCommonConfigs.SPEC, "calibermod-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Loading Caliber Mod");

        ModNetworking.registerMessages();
        ModBlocks.printBlockCounts();
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
