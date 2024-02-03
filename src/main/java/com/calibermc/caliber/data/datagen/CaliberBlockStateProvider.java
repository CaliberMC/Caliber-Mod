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
        stainedPlanks();
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

    private void stainedPlanks(){
        models().buttonInventory("stained_acacia_button_inventory", blockTexture(CaliberBlocks.STAINED_ACACIA.baseBlock()));
        models().buttonInventory("stained_birch_button_inventory", blockTexture(CaliberBlocks.STAINED_BIRCH.baseBlock()));
        models().buttonInventory("stained_dark_oak_button_inventory", blockTexture(CaliberBlocks.STAINED_DARK_OAK.baseBlock()));
        models().buttonInventory("stained_jungle_button_inventory", blockTexture(CaliberBlocks.STAINED_JUNGLE.baseBlock()));
        models().buttonInventory("stained_oak_button_inventory", blockTexture(CaliberBlocks.STAINED_OAK.baseBlock()));
        models().buttonInventory("stained_spruce_button_inventory", blockTexture(CaliberBlocks.STAINED_SPRUCE.baseBlock()));
        buttonBlock((ButtonBlock) CaliberBlocks.STAINED_ACACIA_BUTTON.get(), modLoc("block/stained_acacia_planks"));
        buttonBlock((ButtonBlock) CaliberBlocks.STAINED_BIRCH_BUTTON.get(), modLoc("block/stained_birch_planks"));
        buttonBlock((ButtonBlock) CaliberBlocks.STAINED_DARK_OAK_BUTTON.get(), modLoc("block/stained_dark_oak_planks"));
        buttonBlock((ButtonBlock) CaliberBlocks.STAINED_JUNGLE_BUTTON.get(), modLoc("block/stained_jungle_planks"));
        buttonBlock((ButtonBlock) CaliberBlocks.STAINED_OAK_BUTTON.get(), modLoc("block/stained_oak_planks"));
        buttonBlock((ButtonBlock) CaliberBlocks.STAINED_SPRUCE_BUTTON.get(), modLoc("block/stained_spruce_planks"));
        doorBlock((DoorBlock) CaliberBlocks.STAINED_ACACIA_DOOR.get(), modLoc("block/stained_acacia_door_bottom"), modLoc("block/stained_acacia_door_top"));
        doorBlock((DoorBlock) CaliberBlocks.STAINED_BIRCH_DOOR.get(), modLoc("block/stained_birch_door_bottom"), modLoc("block/stained_birch_door_top"));
        doorBlock((DoorBlock) CaliberBlocks.STAINED_DARK_OAK_DOOR.get(), modLoc("block/stained_dark_oak_door_bottom"), modLoc("block/stained_dark_oak_door_top"));
        doorBlock((DoorBlock) CaliberBlocks.STAINED_JUNGLE_DOOR.get(), modLoc("block/stained_jungle_door_bottom"), modLoc("block/stained_jungle_door_top"));
        doorBlock((DoorBlock) CaliberBlocks.STAINED_OAK_DOOR.get(), modLoc("block/stained_oak_door_bottom"), modLoc("block/stained_oak_door_top"));
        doorBlock((DoorBlock) CaliberBlocks.STAINED_SPRUCE_DOOR.get(), modLoc("block/stained_spruce_door_bottom"), modLoc("block/stained_spruce_door_top"));
        signBlock((StandingSignBlock) CaliberBlocks.STAINED_ACACIA_SIGN.get(), (WallSignBlock) CaliberBlocks.STAINED_ACACIA_WALL_SIGN.get(), modLoc("block/stained_acacia_planks"));
        signBlock((StandingSignBlock) CaliberBlocks.STAINED_BIRCH_SIGN.get(), (WallSignBlock) CaliberBlocks.STAINED_BIRCH_WALL_SIGN.get(), modLoc("block/stained_birch_planks"));
        signBlock((StandingSignBlock) CaliberBlocks.STAINED_DARK_OAK_SIGN.get(), (WallSignBlock) CaliberBlocks.STAINED_DARK_OAK_WALL_SIGN.get(), modLoc("block/stained_dark_oak_planks"));
        signBlock((StandingSignBlock) CaliberBlocks.STAINED_JUNGLE_SIGN.get(), (WallSignBlock) CaliberBlocks.STAINED_JUNGLE_WALL_SIGN.get(), modLoc("block/stained_jungle_planks"));
        signBlock((StandingSignBlock) CaliberBlocks.STAINED_OAK_SIGN.get(), (WallSignBlock) CaliberBlocks.STAINED_OAK_WALL_SIGN.get(), modLoc("block/stained_oak_planks"));
        signBlock((StandingSignBlock) CaliberBlocks.STAINED_SPRUCE_SIGN.get(), (WallSignBlock) CaliberBlocks.STAINED_SPRUCE_WALL_SIGN.get(), modLoc("block/stained_spruce_planks"));
        trapdoorBlock((TrapDoorBlock) CaliberBlocks.STAINED_ACACIA_TRAPDOOR.get(), modLoc("block/stained_acacia_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) CaliberBlocks.STAINED_BIRCH_TRAPDOOR.get(), modLoc("block/stained_birch_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) CaliberBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), modLoc("block/stained_dark_oak_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) CaliberBlocks.STAINED_JUNGLE_TRAPDOOR.get(), modLoc("block/stained_jungle_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) CaliberBlocks.STAINED_OAK_TRAPDOOR.get(), modLoc("block/stained_oak_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) CaliberBlocks.STAINED_SPRUCE_TRAPDOOR.get(), modLoc("block/stained_spruce_trapdoor"), true);
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_STAINED_ACACIA_DOOR.get(), modLoc("block/tall_stained_acacia_door_bottom"), modLoc("block/tall_stained_acacia_door_middle"), modLoc("block/tall_stained_acacia_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_STAINED_BIRCH_DOOR.get(), modLoc("block/tall_stained_birch_door_bottom"), modLoc("block/tall_stained_birch_door_middle"), modLoc("block/tall_stained_birch_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), modLoc("block/tall_stained_dark_oak_door_bottom"), modLoc("block/tall_stained_dark_oak_door_middle"), modLoc("block/tall_stained_dark_oak_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_STAINED_JUNGLE_DOOR.get(), modLoc("block/tall_stained_jungle_door_bottom"), modLoc("block/tall_stained_jungle_door_middle"), modLoc("block/tall_stained_jungle_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_STAINED_OAK_DOOR.get(), modLoc("block/tall_stained_oak_door_bottom"), modLoc("block/tall_stained_oak_door_middle"), modLoc("block/tall_stained_oak_door_top"));
        tallDoorBlock((TallDoorBlock) CaliberBlocks.TALL_STAINED_SPRUCE_DOOR.get(), modLoc("block/tall_stained_spruce_door_bottom"), modLoc("block/tall_stained_spruce_door_middle"), modLoc("block/tall_stained_spruce_door_top"));
    }
}
