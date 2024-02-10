package com.calibermc.caliber.data.datagen;

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
        plankBlocks();
        super.registerStatesAndModels();
    }

    private void plankBlocks() {
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_ACACIA_DOOR.get(), modLoc("block/tall_acacia_door_bottom"), modLoc("block/tall_acacia_door_middle"), modLoc("block/tall_acacia_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_BIRCH_DOOR.get(), modLoc("block/tall_birch_door_bottom"), modLoc("block/tall_birch_door_middle"), modLoc("block/tall_birch_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_DARK_OAK_DOOR.get(), modLoc("block/tall_dark_oak_door_bottom"), modLoc("block/tall_dark_oak_door_middle"), modLoc("block/tall_dark_oak_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_JUNGLE_DOOR.get(), modLoc("block/tall_jungle_door_bottom"), modLoc("block/tall_jungle_door_middle"), modLoc("block/tall_jungle_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_OAK_DOOR.get(), modLoc("block/tall_oak_door_bottom"), modLoc("block/tall_oak_door_middle"), modLoc("block/tall_oak_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_SPRUCE_DOOR.get(), modLoc("block/tall_spruce_door_bottom"), modLoc("block/tall_spruce_door_middle"), modLoc("block/tall_spruce_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_CRIMSON_DOOR.get(), modLoc("block/tall_crimson_door_bottom"), modLoc("block/tall_crimson_door_middle"), modLoc("block/tall_crimson_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_WARPED_DOOR.get(), modLoc("block/tall_warped_door_bottom"), modLoc("block/tall_warped_door_middle"), modLoc("block/tall_warped_door_top"));
    }
}
