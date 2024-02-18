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
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.ACACIA_DOOR.baseBlock(), modLoc("block/acacia_door_bottom"), modLoc("block/acacia_door_middle"), modLoc("block/acacia_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.BAMBOO_DOOR.baseBlock(), modLoc("block/bamboo_door_bottom"), modLoc("block/bamboo_door_middle"), modLoc("block/bamboo_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.BIRCH_DOOR.baseBlock(), modLoc("block/birch_door_bottom"), modLoc("block/birch_door_middle"), modLoc("block/birch_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.CHERRY_DOOR.baseBlock(), modLoc("block/cherry_door_bottom"), modLoc("block/cherry_door_middle"), modLoc("block/cherry_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.DARK_OAK_DOOR.baseBlock(), modLoc("block/dark_oak_door_bottom"), modLoc("block/dark_oak_door_middle"), modLoc("block/dark_oak_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.JUNGLE_DOOR.baseBlock(), modLoc("block/jungle_door_bottom"), modLoc("block/jungle_door_middle"), modLoc("block/jungle_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.MANGROVE_DOOR.baseBlock(), modLoc("block/mangrove_door_bottom"), modLoc("block/mangrove_door_middle"), modLoc("block/mangrove_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.OAK_DOOR.baseBlock(), modLoc("block/oak_door_bottom"), modLoc("block/oak_door_middle"), modLoc("block/oak_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.SPRUCE_DOOR.baseBlock(), modLoc("block/spruce_door_bottom"), modLoc("block/spruce_door_middle"), modLoc("block/spruce_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.CRIMSON_DOOR.baseBlock(), modLoc("block/crimson_door_bottom"), modLoc("block/crimson_door_middle"), modLoc("block/crimson_door_top"));
//        tallDoorBlock((TallDoorBlock)CaliberBlocks.WARPED_DOOR.baseBlock(), modLoc("block/warped_door_bottom"), modLoc("block/warped_door_middle"), modLoc("block/warped_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.ACACIA_TALL_DOOR.get(), modLoc("block/acacia_tall_door_bottom"), modLoc("block/acacia_tall_door_middle"), modLoc("block/acacia_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.BAMBOO_TALL_DOOR.get(), modLoc("block/bamboo_tall_door_bottom"), modLoc("block/bamboo_tall_door_middle"), modLoc("block/bamboo_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.BIRCH_TALL_DOOR.get(), modLoc("block/birch_tall_door_bottom"), modLoc("block/birch_tall_door_middle"), modLoc("block/birch_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.CHERRY_TALL_DOOR.get(), modLoc("block/cherry_tall_door_bottom"), modLoc("block/cherry_tall_door_middle"), modLoc("block/cherry_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.DARK_OAK_TALL_DOOR.get(), modLoc("block/dark_oak_tall_door_bottom"), modLoc("block/dark_oak_tall_door_middle"), modLoc("block/dark_oak_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.JUNGLE_TALL_DOOR.get(), modLoc("block/jungle_tall_door_bottom"), modLoc("block/jungle_tall_door_middle"), modLoc("block/jungle_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.MANGROVE_TALL_DOOR.get(), modLoc("block/mangrove_tall_door_bottom"), modLoc("block/mangrove_tall_door_middle"), modLoc("block/mangrove_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.OAK_TALL_DOOR.get(), modLoc("block/oak_tall_door_bottom"), modLoc("block/oak_tall_door_middle"), modLoc("block/oak_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.SPRUCE_TALL_DOOR.get(), modLoc("block/spruce_tall_door_bottom"), modLoc("block/spruce_tall_door_middle"), modLoc("block/spruce_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.CRIMSON_TALL_DOOR.get(), modLoc("block/crimson_tall_door_bottom"), modLoc("block/crimson_tall_door_middle"), modLoc("block/crimson_tall_door_top"));
        tallDoorBlock((TallDoorBlock)CaliberBlocks.WARPED_TALL_DOOR.get(), modLoc("block/warped_tall_door_bottom"), modLoc("block/warped_tall_door_middle"), modLoc("block/warped_tall_door_top"));
    }
}
