package com.calibermc.caliber.forge.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.forge.data.datagen.recipes.CaliberRecipeProvider;
import com.calibermc.caliber.forge.data.datagen.recipes.ItemRecipeProvider;
import com.calibermc.caliber.forge.data.datagen.recipes.MiscRecipeProvider;
import com.calibermc.caliber.forge.data.datagen.tags.CaliberBlockTagProvider;
import com.calibermc.caliber.forge.data.datagen.tags.CaliberItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Caliber.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    // TODO: Add Fusion Data Generators for connected textures in Create Blocks

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        boolean run = true;

        // BlockStates, Loot and Models
//        generator.addProvider(event.includeClient(), new CaliberBlockStateProvider(generator, existingFileHelper));
//        generator.addProvider(event.includeClient(), new CaliberItemModelProvider(generator, existingFileHelper));

        // Recipes
        generator.addProvider(event.includeServer(), new CaliberRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new MiscRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new ItemRecipeProvider(generator));

        // Tags
        CaliberBlockTagProvider blockTagGenerator = generator.addProvider(event.includeServer(), new CaliberBlockTagProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new CaliberItemTagProvider(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

    }
}
