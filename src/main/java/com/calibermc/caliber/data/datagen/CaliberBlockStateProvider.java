package com.calibermc.caliber.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
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
        terrainBlocks();
        metalBlocks();
        plasterBlocks();
        plankBlocks();
        stainedPlanks();
        super.registerStatesAndModels();
    }

    private void terrainBlocks() {
        simpleBlock(ModBlocks.BLACK_SAND.get());
        simpleBlock(ModBlocks.BROWN_SAND.get());
        simpleBlock(ModBlocks.ORANGE_SAND.get());
        simpleBlock(ModBlocks.WHITE_SAND.get());    // Maybe way to make item models?
//        simpleBlockItem(ModBlocks.BLACK_SAND.get(), itemModels().withExistingParent("black_sand", "caliber:block/black_sand"));
    }

    private void metalBlocks() {
        simpleBlock(ModBlocks.BRONZE_BLOCK.get());
        simpleBlock(ModBlocks.TIN_BLOCK.get());
        simpleBlock(ModBlocks.RAW_TIN_BLOCK.get());
        simpleBlock(ModBlocks.TIN_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_TIN_ORE.get());

        simpleBlock(ModBlocks.SILVER_BLOCK.get());
        simpleBlock(ModBlocks.RAW_SILVER_BLOCK.get());
        simpleBlock(ModBlocks.SILVER_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_SILVER_ORE.get());
    }

    private void plasterBlocks() {
        simpleBlock(ModBlocks.BEIGE_PLASTER_POWDER.get());
        simpleBlock(ModBlocks.BROWN_PLASTER_POWDER.get());
        simpleBlock(ModBlocks.OCHRE_PLASTER_POWDER.get());
        simpleBlock(ModBlocks.TAN_PLASTER_POWDER.get());
        simpleBlock(ModBlocks.WHITE_PLASTER_POWDER.get());
    }

    private void plankBlocks() {
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_ACACIA_DOOR.get(), modLoc("block/tall_acacia_door_bottom"), modLoc("block/tall_acacia_door_middle"), modLoc("block/tall_acacia_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_BIRCH_DOOR.get(), modLoc("block/tall_birch_door_bottom"), modLoc("block/tall_birch_door_middle"), modLoc("block/tall_birch_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_DARK_OAK_DOOR.get(), modLoc("block/tall_dark_oak_door_bottom"), modLoc("block/tall_dark_oak_door_middle"), modLoc("block/tall_dark_oak_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_JUNGLE_DOOR.get(), modLoc("block/tall_jungle_door_bottom"), modLoc("block/tall_jungle_door_middle"), modLoc("block/tall_jungle_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_OAK_DOOR.get(), modLoc("block/tall_oak_door_bottom"), modLoc("block/tall_oak_door_middle"), modLoc("block/tall_oak_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_SPRUCE_DOOR.get(), modLoc("block/tall_spruce_door_bottom"), modLoc("block/tall_spruce_door_middle"), modLoc("block/tall_spruce_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_CRIMSON_DOOR.get(), modLoc("block/tall_crimson_door_bottom"), modLoc("block/tall_crimson_door_middle"), modLoc("block/tall_crimson_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_WARPED_DOOR.get(), modLoc("block/tall_warped_door_bottom"), modLoc("block/tall_warped_door_middle"), modLoc("block/tall_warped_door_top"));
    }

    private void stainedPlanks(){
        models().buttonInventory("stained_acacia_button_inventory", blockTexture(ModBlocks.STAINED_ACACIA.baseBlock()));
        models().buttonInventory("stained_birch_button_inventory", blockTexture(ModBlocks.STAINED_BIRCH.baseBlock()));
        models().buttonInventory("stained_dark_oak_button_inventory", blockTexture(ModBlocks.STAINED_DARK_OAK.baseBlock()));
        models().buttonInventory("stained_jungle_button_inventory", blockTexture(ModBlocks.STAINED_JUNGLE.baseBlock()));
        models().buttonInventory("stained_oak_button_inventory", blockTexture(ModBlocks.STAINED_OAK.baseBlock()));
        models().buttonInventory("stained_spruce_button_inventory", blockTexture(ModBlocks.STAINED_SPRUCE.baseBlock()));
        buttonBlock((ButtonBlock) ModBlocks.STAINED_ACACIA_BUTTON.get(), modLoc("block/stained_acacia_planks"));
        buttonBlock((ButtonBlock) ModBlocks.STAINED_BIRCH_BUTTON.get(), modLoc("block/stained_birch_planks"));
        buttonBlock((ButtonBlock) ModBlocks.STAINED_DARK_OAK_BUTTON.get(), modLoc("block/stained_dark_oak_planks"));
        buttonBlock((ButtonBlock) ModBlocks.STAINED_JUNGLE_BUTTON.get(), modLoc("block/stained_jungle_planks"));
        buttonBlock((ButtonBlock) ModBlocks.STAINED_OAK_BUTTON.get(), modLoc("block/stained_oak_planks"));
        buttonBlock((ButtonBlock) ModBlocks.STAINED_SPRUCE_BUTTON.get(), modLoc("block/stained_spruce_planks"));
        doorBlock((DoorBlock) ModBlocks.STAINED_ACACIA_DOOR.get(), modLoc("block/stained_acacia_door_bottom"), modLoc("block/stained_acacia_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_BIRCH_DOOR.get(), modLoc("block/stained_birch_door_bottom"), modLoc("block/stained_birch_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_DARK_OAK_DOOR.get(), modLoc("block/stained_dark_oak_door_bottom"), modLoc("block/stained_dark_oak_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_JUNGLE_DOOR.get(), modLoc("block/stained_jungle_door_bottom"), modLoc("block/stained_jungle_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_OAK_DOOR.get(), modLoc("block/stained_oak_door_bottom"), modLoc("block/stained_oak_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_SPRUCE_DOOR.get(), modLoc("block/stained_spruce_door_bottom"), modLoc("block/stained_spruce_door_top"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_ACACIA_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_ACACIA_WALL_SIGN.get(), modLoc("block/stained_acacia_planks"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_BIRCH_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_BIRCH_WALL_SIGN.get(), modLoc("block/stained_birch_planks"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_DARK_OAK_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_DARK_OAK_WALL_SIGN.get(), modLoc("block/stained_dark_oak_planks"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_JUNGLE_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_JUNGLE_WALL_SIGN.get(), modLoc("block/stained_jungle_planks"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_OAK_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_OAK_WALL_SIGN.get(), modLoc("block/stained_oak_planks"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_SPRUCE_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_SPRUCE_WALL_SIGN.get(), modLoc("block/stained_spruce_planks"));
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_ACACIA_TRAPDOOR.get(), modLoc("block/stained_acacia_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_BIRCH_TRAPDOOR.get(), modLoc("block/stained_birch_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), modLoc("block/stained_dark_oak_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_JUNGLE_TRAPDOOR.get(), modLoc("block/stained_jungle_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_OAK_TRAPDOOR.get(), modLoc("block/stained_oak_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_SPRUCE_TRAPDOOR.get(), modLoc("block/stained_spruce_trapdoor"), true);
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_STAINED_ACACIA_DOOR.get(), modLoc("block/tall_stained_acacia_door_bottom"), modLoc("block/tall_stained_acacia_door_middle"), modLoc("block/tall_stained_acacia_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_STAINED_BIRCH_DOOR.get(), modLoc("block/tall_stained_birch_door_bottom"), modLoc("block/tall_stained_birch_door_middle"), modLoc("block/tall_stained_birch_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), modLoc("block/tall_stained_dark_oak_door_bottom"), modLoc("block/tall_stained_dark_oak_door_middle"), modLoc("block/tall_stained_dark_oak_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_STAINED_JUNGLE_DOOR.get(), modLoc("block/tall_stained_jungle_door_bottom"), modLoc("block/tall_stained_jungle_door_middle"), modLoc("block/tall_stained_jungle_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_STAINED_OAK_DOOR.get(), modLoc("block/tall_stained_oak_door_bottom"), modLoc("block/tall_stained_oak_door_middle"), modLoc("block/tall_stained_oak_door_top"));
        tallDoorBlock((TallDoorBlock) ModBlocks.TALL_STAINED_SPRUCE_DOOR.get(), modLoc("block/tall_stained_spruce_door_bottom"), modLoc("block/tall_stained_spruce_door_middle"), modLoc("block/tall_stained_spruce_door_top"));
    }
}
