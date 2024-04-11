package com.calibermc.caliber.data.datagen.models;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliberlib.data.datagen.ModBlockStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.*;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CaliberBlockStateProvider extends ModBlockStateProvider {
    public CaliberBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Caliber.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        plankBlocks();
        super.registerStatesAndModels();
    }

    private void plankBlocks() {
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.ACACIA_TALL_DOOR.get(), modLoc("block/acacia_tall_door_bottom"), modLoc("block/acacia_tall_door_middle"), modLoc("block/acacia_tall_door_top"));

    }
}
