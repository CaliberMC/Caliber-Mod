package com.calibermc.caliber.data.datagen.models;

import com.calibermc.buildify.item.custom.Hammer;
import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.item.CaliberItems;
import com.calibermc.caliberlib.data.datagen.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CaliberItemModelProvider extends ModItemModelProvider {
    public CaliberItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Caliber.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        super.registerModels();
    }

}
