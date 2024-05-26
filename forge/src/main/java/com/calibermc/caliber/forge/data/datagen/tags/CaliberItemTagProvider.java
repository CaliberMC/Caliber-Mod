package com.calibermc.caliber.forge.data.datagen.tags;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliberlib.forge.data.datagen.ModItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.calibermc.caliber.compat.ModCompats.blockManagerMODID;

public class CaliberItemTagProvider extends ModItemTagProvider {
    public CaliberItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                                  CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, Caliber.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        for (String modid : blockManagerMODID) {
            this.modid = modid;
            super.addTags(pProvider);
        }
    }
}

