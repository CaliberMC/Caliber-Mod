package com.calibermc.caliber;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.entity.ModBlockEntities;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.crafting.ModRecipeSerializers;
import com.calibermc.caliber.item.CreativeTabs;
import com.calibermc.caliber.item.ModItems;
import com.calibermc.caliber.networking.ModNetworking;
import com.calibermc.caliber.world.inventory.ModMenuTypes;
import com.calibermc.caliber.world.inventory.kiln.KilnMenu;
import com.calibermc.caliber.world.inventory.woodcutter.WoodcutterMenu;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.RecipeBookCategories;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.client.RecipeBookRegistry;
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

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("Loading Caliber Mod");
//        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        ModRecipeSerializers.WOODCUTTING_TYPE = RecipeType.register("caliber:woodcutting");
        ModRecipeSerializers.ALLOYING_TYPE = RecipeType.register("caliber:alloying");

        RecipeBookRegistry.addCategoriesFinder(ModRecipeSerializers.WOODCUTTING_TYPE, (r) -> WoodcutterMenu.MAIN_CATEGORY);

        // Recipe book for kiln

        // finder of alloying type recipes for main category
        RecipeBookRegistry.addCategoriesFinder(ModRecipeSerializers.ALLOYING_TYPE, (r) -> KilnMenu.MAIN_CATEGORY);

        // furnace categories *remove if no need
        ImmutableList<RecipeBookCategories> furnaceCategories = ImmutableList.of(RecipeBookCategories.FURNACE_FOOD, RecipeBookCategories.FURNACE_BLOCKS, RecipeBookCategories.FURNACE_MISC);
        ImmutableList.Builder<RecipeBookCategories> categories = ImmutableList.<RecipeBookCategories>builder().add(KilnMenu.MAIN_CATEGORY).addAll(furnaceCategories);

        // finder all categories that works with kiln
        RecipeBookRegistry.addAggregateCategories(KilnMenu.KILN_SEARCH_CATEGORY, categories.build());

        RecipeBookRegistry.addCategoriesToType(KilnMenu.BOOK_TYPE,
                ImmutableList.<RecipeBookCategories>builder().add(KilnMenu.KILN_SEARCH_CATEGORY, KilnMenu.MAIN_CATEGORY).addAll(furnaceCategories).build());

        ModNetworking.registerMessages();
        CreativeTabs.setupCreativeTabs();
        ModBlocks.printCounts();
    }
}
