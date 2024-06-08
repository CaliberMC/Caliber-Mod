package com.calibermc.caliber.forge.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.forge.data.datagen.models.CaliberBlockStateProvider;
import com.calibermc.caliber.forge.data.datagen.models.CaliberItemModelProvider;
import com.calibermc.caliber.forge.data.datagen.recipes.CaliberRecipeProvider;
import com.calibermc.caliber.forge.data.datagen.recipes.ItemRecipeProvider;
import com.calibermc.caliber.forge.data.datagen.recipes.MiscRecipeProvider;
import com.calibermc.caliber.compat.ModCompats;
import com.calibermc.caliber.forge.data.datagen.tags.CaliberBlockTagProvider;
import com.calibermc.caliber.forge.data.datagen.tags.CaliberItemTagProvider;
import com.calibermc.caliberlib.forge.data.datagen.ModBlockStateProvider;
import com.calibermc.caliberlib.forge.data.datagen.ModItemModelProvider;
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
        generator.addProvider(event.includeClient(), new CaliberBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(event.includeClient(), new CaliberItemModelProvider(generator, existingFileHelper));
        // Recipes
        generator.addProvider(event.includeServer(), new CaliberRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new MiscRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new ItemRecipeProvider(generator));

        // Tags
        CaliberBlockTagProvider blockTagGenerator = generator.addProvider(event.includeServer(), new CaliberBlockTagProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new CaliberItemTagProvider(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

        // Compats
        if (ModCompats.BOP) {
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, "biomesoplenty", existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, "biomesoplenty", existingFileHelper));
        }

//        if (ModCompats.CHIPPED) {
//            generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, "chipped", existingFileHelper));
//            generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, "chipped", existingFileHelper));
//
//            generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, () -> new ModBlockLootTables("chipped") {
//                @Override
//                protected @NotNull Iterable<Block> getKnownBlocks() {
//                    return ChippedBlocks.BLOCKS.getEntries().stream().map(RegSupplier::get)::iterator;
//                }
//            }));
//        }

        if (ModCompats.CREATE) {
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, "create", existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, "create", existingFileHelper));
        }

        if (ModCompats.REGIONS_UNEXPLORED) {
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, "regions_unexplored", existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, "regions_unexplored", existingFileHelper));
        }
    }
}
