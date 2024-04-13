package com.calibermc.caliber.data.datagen.tags;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliberlib.data.datagen.ModBlockTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.calibermc.caliber.compat.ModCompats.blockManagerMODID;

public class CaliberBlockTagProvider extends ModBlockTagProvider {
    public CaliberBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Caliber.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        for (String modid : blockManagerMODID) {
            this.modid = modid;
            super.addTags(pProvider);
        }
    }
}



