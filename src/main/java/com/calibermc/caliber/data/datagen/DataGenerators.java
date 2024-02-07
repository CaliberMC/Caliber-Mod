package com.calibermc.caliber.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.data.datagen.loot.CaliberBlockLootTables;
import com.calibermc.caliber.data.datagen.recipes.CaliberRecipeProvider;
import com.calibermc.caliber.data.datagen.recipes.ItemRecipeProvider;
import com.calibermc.caliber.data.datagen.recipes.MiscRecipeProvider;
import com.calibermc.caliberlib.data.datagen.ModLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Caliber.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        boolean run = true;

        // BlockStates, Loot and Models
        generator.addProvider(run, new CaliberBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(run, new ModLootTableProvider(generator, CaliberBlockLootTables::new));
        generator.addProvider(run, new CaliberItemModelProvider(generator, existingFileHelper));

        // Recipes
        generator.addProvider(run, new CaliberRecipeProvider(generator));
        generator.addProvider(run, new MiscRecipeProvider(generator));
        generator.addProvider(run, new ItemRecipeProvider(generator));

    }
}
