package com.calibermc.caliber.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.data.datagen.recipes.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Caliber.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new StoneRecipeProvider(generator));
        generator.addProvider(new StoneCustomRecipeProvider(generator));
        generator.addProvider(new MossyBlockRecipeProvider(generator));
        generator.addProvider(new MiscRecipeProvider(generator));
        generator.addProvider(new TudorBlockRecipeProvider(generator));
//        generator.addProvider(new ModRecipeProviderWood(generator));
        generator.addProvider(new ModLootTableProvider(generator));
        generator.addProvider(new ModBlockStateProvider(generator, existingFileHelper));
//        generator.addProvider(new ItemModelProvider(generator, existingFileHelper));
    }
}
