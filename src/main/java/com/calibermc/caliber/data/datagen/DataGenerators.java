package com.calibermc.caliber.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.compat.block.BiomesOPlentyBlocks;
import com.calibermc.caliber.compat.block.CreateBlocks;
import com.calibermc.caliber.compat.block.RegionsUnexploredBlocks;
import com.calibermc.caliber.data.datagen.loot.CaliberBlockLootTables;
import com.calibermc.caliber.data.datagen.models.CaliberBlockStateProvider;
import com.calibermc.caliber.data.datagen.models.CaliberItemModelProvider;
import com.calibermc.caliber.data.datagen.recipes.CaliberRecipeProvider;
import com.calibermc.caliber.data.datagen.recipes.ItemRecipeProvider;
import com.calibermc.caliber.data.datagen.recipes.MiscRecipeProvider;
import com.calibermc.caliber.compat.ModCompats;
import com.calibermc.caliber.data.datagen.tags.CaliberBlockTagProvider;
import com.calibermc.caliber.data.datagen.tags.CaliberItemTagProvider;
import com.calibermc.caliberlib.data.datagen.ModBlockStateProvider;
import com.calibermc.caliberlib.data.datagen.ModBlockTagProvider;
import com.calibermc.caliberlib.data.datagen.ModItemModelProvider;
import com.calibermc.caliberlib.data.datagen.ModLootTableProvider;
import com.calibermc.caliberlib.data.datagen.loot.ModBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

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
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, CaliberBlockLootTables::new));
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

            generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, () -> new ModBlockLootTables("biomesoplenty") {
                @Override
                protected @NotNull Iterable<Block> getKnownBlocks() {
                    return BiomesOPlentyBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
                }
            }));
        }

        if (ModCompats.CREATE) {
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, "create", existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, "create", existingFileHelper));

            generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, () -> new ModBlockLootTables("create") {
                @Override
                protected @NotNull Iterable<Block> getKnownBlocks() {
                    return CreateBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
                }
            }));
        }

        if (ModCompats.REGIONS_UNEXPLORED) {
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, "regions_unexplored", existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, "regions_unexplored", existingFileHelper));

            generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, () -> new ModBlockLootTables("regions_unexplored") {
                @Override
                protected @NotNull Iterable<Block> getKnownBlocks() {
                    return RegionsUnexploredBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
                }
            }));
        }
    }
}
