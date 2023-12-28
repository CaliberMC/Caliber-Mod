package com.calibermc.caliber.data.datagen;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.custom.*;
import com.calibermc.caliber.block.management.BlockManager;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.shapes.*;
import com.calibermc.caliber.block.shapes.trim.ArchTrim;
import com.calibermc.caliber.block.shapes.trim.LargeArchTrim;
import com.calibermc.caliber.data.ModBlockFamily;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        this(gen, Caliber.MOD_ID, exFileHelper);
    }

    public ModBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    public String name(Block block) {
        return block.getRegistryName().getPath();
    }

    @Override
    protected void registerStatesAndModels() {
        terrainBlocks();
        metalBlocks();
        plasterBlocks();
        stainedPlanks();
        for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS) {
            for (Map.Entry<BlockManager.BlockAdditional, RegistryObject<Block>> e : blockManager.getBlocks().entrySet()) {
                try {
                    e.getKey().stateGenerator.accept(e.getValue(), this);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
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

    private void stainedPlanks(){
//        models().buttonInventory("stained_acacia_button", blockTexture(ModBlocks.STAINED_ACACIA_BUTTON.get()));
//        models().buttonInventory("stained_birch_button", blockTexture(ModBlocks.STAINED_BIRCH_BUTTON.get()));
//        models().buttonInventory("stained_dark_oak_button", blockTexture(ModBlocks.STAINED_DARK_OAK_BUTTON.get()));
//        models().buttonInventory("stained_jungle_button", blockTexture(ModBlocks.STAINED_JUNGLE_BUTTON.get()));
//        models().buttonInventory("stained_oak_button", blockTexture(ModBlocks.STAINED_OAK_BUTTON.get()));
//        models().buttonInventory("stained_spruce_button", blockTexture(ModBlocks.STAINED_SPRUCE_BUTTON.get()));
        models().buttonInventory("stained_acacia_button_inventory", blockTexture(ModBlocks.STAINED_ACACIA.baseBlock()));
        models().buttonInventory("stained_birch_button_inventory", blockTexture(ModBlocks.STAINED_BIRCH.baseBlock()));
        models().buttonInventory("stained_dark_oak_button_inventory", blockTexture(ModBlocks.STAINED_DARK_OAK.baseBlock()));
        models().buttonInventory("stained_jungle_button_inventory", blockTexture(ModBlocks.STAINED_JUNGLE.baseBlock()));
        models().buttonInventory("stained_oak_button_inventory", blockTexture(ModBlocks.STAINED_OAK.baseBlock()));
        models().buttonInventory("stained_spruce_button_inventory", blockTexture(ModBlocks.STAINED_SPRUCE.baseBlock()));
        buttonBlock((WoodButtonBlock) ModBlocks.STAINED_ACACIA_BUTTON.get(), modLoc("block/stained_acacia"));
        buttonBlock((WoodButtonBlock) ModBlocks.STAINED_BIRCH_BUTTON.get(), modLoc("block/stained_birch"));
        buttonBlock((WoodButtonBlock) ModBlocks.STAINED_DARK_OAK_BUTTON.get(), modLoc("block/stained_dark_oak"));
        buttonBlock((WoodButtonBlock) ModBlocks.STAINED_JUNGLE_BUTTON.get(), modLoc("block/stained_jungle"));
        buttonBlock((WoodButtonBlock) ModBlocks.STAINED_OAK_BUTTON.get(), modLoc("block/stained_oak"));
        buttonBlock((WoodButtonBlock) ModBlocks.STAINED_SPRUCE_BUTTON.get(), modLoc("block/stained_spruce"));
        doorBlock((DoorBlock) ModBlocks.STAINED_ACACIA_DOOR.get(), modLoc("block/stained_acacia_door_bottom"), modLoc("block/stained_acacia_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_BIRCH_DOOR.get(), modLoc("block/stained_birch_door_bottom"), modLoc("block/stained_birch_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_DARK_OAK_DOOR.get(), modLoc("block/stained_dark_oak_door_bottom"), modLoc("block/stained_dark_oak_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_JUNGLE_DOOR.get(), modLoc("block/stained_jungle_door_bottom"), modLoc("block/stained_jungle_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_OAK_DOOR.get(), modLoc("block/stained_oak_door_bottom"), modLoc("block/stained_oak_door_top"));
        doorBlock((DoorBlock) ModBlocks.STAINED_SPRUCE_DOOR.get(), modLoc("block/stained_spruce_door_bottom"), modLoc("block/stained_spruce_door_top"));
//        fenceBlock((FenceBlock) ModBlocks.STAINED_ACACIA_FENCE.get(), modLoc("block/stained_acacia"));
//        fenceBlock((FenceBlock) ModBlocks.STAINED_BIRCH_FENCE.get(), modLoc("block/stained_birch"));
//        fenceBlock((FenceBlock) ModBlocks.STAINED_DARK_OAK_FENCE.get(), modLoc("block/stained_dark_oak"));
//        fenceBlock((FenceBlock) ModBlocks.STAINED_JUNGLE_FENCE.get(), modLoc("block/stained_jungle"));
//        fenceBlock((FenceBlock) ModBlocks.STAINED_OAK_FENCE.get(), modLoc("block/stained_oak"));
//        fenceBlock((FenceBlock) ModBlocks.STAINED_SPRUCE_FENCE.get(), modLoc("block/stained_spruce"));
//        fenceGateBlock((FenceGateBlock) ModBlocks.STAINED_ACACIA_FENCE_GATE.get(), modLoc("block/stained_acacia"));
//        fenceGateBlock((FenceGateBlock) ModBlocks.STAINED_BIRCH_FENCE_GATE.get(), modLoc("block/stained_birch"));
//        fenceGateBlock((FenceGateBlock) ModBlocks.STAINED_DARK_OAK_FENCE_GATE.get(), modLoc("block/stained_dark_oak"));
//        fenceGateBlock((FenceGateBlock) ModBlocks.STAINED_JUNGLE_FENCE_GATE.get(), modLoc("block/stained_jungle"));
//        fenceGateBlock((FenceGateBlock) ModBlocks.STAINED_OAK_FENCE_GATE.get(), modLoc("block/stained_oak"));
//        fenceGateBlock((FenceGateBlock) ModBlocks.STAINED_SPRUCE_FENCE_GATE.get(), modLoc("block/stained_spruce"));
//        pressurePlateBlock((PressurePlateBlock) ModBlocks.STAINED_ACACIA_PRESSURE_PLATE.get(), modLoc("block/stained_acacia"));
//        pressurePlateBlock((PressurePlateBlock) ModBlocks.STAINED_BIRCH_PRESSURE_PLATE.get(), modLoc("block/stained_birch"));
//        pressurePlateBlock((PressurePlateBlock) ModBlocks.STAINED_DARK_OAK_PRESSURE_PLATE.get(), modLoc("block/stained_dark_oak"));
//        pressurePlateBlock((PressurePlateBlock) ModBlocks.STAINED_JUNGLE_PRESSURE_PLATE.get(), modLoc("block/stained_jungle"));
//        pressurePlateBlock((PressurePlateBlock) ModBlocks.STAINED_OAK_PRESSURE_PLATE.get(), modLoc("block/stained_oak"));
//        pressurePlateBlock((PressurePlateBlock) ModBlocks.STAINED_SPRUCE_PRESSURE_PLATE.get(), modLoc("block/stained_spruce"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_ACACIA_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_ACACIA_WALL_SIGN.get(), modLoc("block/stained_acacia"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_BIRCH_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_BIRCH_WALL_SIGN.get(), modLoc("block/stained_birch"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_DARK_OAK_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_DARK_OAK_WALL_SIGN.get(), modLoc("block/stained_dark_oak"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_JUNGLE_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_JUNGLE_WALL_SIGN.get(), modLoc("block/stained_jungle"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_OAK_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_OAK_WALL_SIGN.get(), modLoc("block/stained_oak"));
        signBlock((StandingSignBlock)ModBlocks.STAINED_SPRUCE_SIGN.get(), (WallSignBlock) ModBlocks.STAINED_SPRUCE_WALL_SIGN.get(), modLoc("block/stained_spruce"));
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_ACACIA_TRAPDOOR.get(), modLoc("block/stained_acacia_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_BIRCH_TRAPDOOR.get(), modLoc("block/stained_birch_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), modLoc("block/stained_dark_oak_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_JUNGLE_TRAPDOOR.get(), modLoc("block/stained_jungle_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_OAK_TRAPDOOR.get(), modLoc("block/stained_oak_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.STAINED_SPRUCE_TRAPDOOR.get(), modLoc("block/stained_spruce_trapdoor"), true);
    }


    public void archBlock(ArchBlock block) {
        archBlock(block, blockTexture(block));
    }

    public void archBlock(ArchBlock block, ResourceLocation texture) {
        archBlock(block, texture, texture, texture);
    }

    public void archBlock(ArchBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile archModel = models().withExistingParent(name(block), modLoc("block/templates/arch"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                trimModel = models().withExistingParent(name(block) + "_trim", modLoc("block/templates/arch_trim"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                trim2Model = models().withExistingParent(name(block) + "_trim2", modLoc("block/templates/arch_trim_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                crossModel = models().withExistingParent(name(block) + "_cross", modLoc("block/templates/arch_cross"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                cornerModel = models().withExistingParent(name(block) + "_corner", modLoc("block/templates/arch_corner"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                tModel = models().withExistingParent(name(block) + "_t", modLoc("block/templates/arch_t"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.NONE)
                .modelForState().modelFile(archModel).addModel()
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.FRONT)
                .modelForState().modelFile(trimModel).addModel()
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.BOTH)
                .modelForState().modelFile(trim2Model).addModel()
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.CROSS)
                .modelForState().modelFile(crossModel).addModel()
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.CORNER_LEFT)
                .modelForState().modelFile(cornerModel).rotationY(270).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.CORNER_RIGHT)
                .modelForState().modelFile(cornerModel).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.LEFT_T)
                .modelForState().modelFile(tModel).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.RIGHT_T)
                .modelForState().modelFile(tModel).rotationY(270).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.NORTH).with(ArchBlock.TYPE, ArchShape.T)
                .modelForState().modelFile(tModel).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.NONE)
                .modelForState().modelFile(archModel).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.FRONT)
                .modelForState().modelFile(trimModel).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.BOTH)
                .modelForState().modelFile(trim2Model).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.CROSS)
                .modelForState().modelFile(crossModel).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.CORNER_LEFT)
                .modelForState().modelFile(cornerModel).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.CORNER_RIGHT)
                .modelForState().modelFile(cornerModel).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.LEFT_T)
                .modelForState().modelFile(tModel).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.RIGHT_T)
                .modelForState().modelFile(tModel).addModel()
                .partialState().with(ArchBlock.FACING, Direction.EAST).with(ArchBlock.TYPE, ArchShape.T)
                .modelForState().modelFile(tModel).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.NONE)
                .modelForState().modelFile(archModel).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.FRONT)
                .modelForState().modelFile(trimModel).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.BOTH)
                .modelForState().modelFile(trim2Model).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.CROSS)
                .modelForState().modelFile(crossModel).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.CORNER_LEFT)
                .modelForState().modelFile(cornerModel).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.CORNER_RIGHT)
                .modelForState().modelFile(cornerModel).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.LEFT_T)
                .modelForState().modelFile(tModel).rotationY(270).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.RIGHT_T)
                .modelForState().modelFile(tModel).rotationY(90).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.SOUTH).with(ArchBlock.TYPE, ArchShape.T)
                .modelForState().modelFile(tModel).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.NONE)
                .modelForState().modelFile(archModel).rotationY(270).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.FRONT)
                .modelForState().modelFile(trimModel).rotationY(270).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.STRAIGHT).with(ArchBlock.TRIM, ArchTrim.BOTH)
                .modelForState().modelFile(trim2Model).rotationY(270).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.CROSS)
                .modelForState().modelFile(crossModel).rotationY(270).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.CORNER_LEFT)
                .modelForState().modelFile(cornerModel).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.CORNER_RIGHT)
                .modelForState().modelFile(cornerModel).rotationY(270).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.LEFT_T)
                .modelForState().modelFile(tModel).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.RIGHT_T)
                .modelForState().modelFile(tModel).rotationY(180).uvLock(true).addModel()
                .partialState().with(ArchBlock.FACING, Direction.WEST).with(ArchBlock.TYPE, ArchShape.T)
                .modelForState().modelFile(tModel).rotationY(270).uvLock(true).addModel();
    }

    public void archHalfBlock(HalfArchBlock block) {
        archHalfBlock(block, blockTexture(block));
    }

    public void archHalfBlock(HalfArchBlock block, ResourceLocation texture) {
        archHalfBlock(block, texture, texture, texture);
    }

    public void archHalfBlock(HalfArchBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile arch_half = models().withExistingParent(name(block), modLoc("block/templates/arch_half"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(HalfArchBlock.FACING, Direction.NORTH)
                .modelForState().modelFile(arch_half).addModel()
                .partialState().with(HalfArchBlock.FACING, Direction.EAST)
                .modelForState().modelFile(arch_half).rotationY(90).uvLock(true).addModel()
                .partialState().with(HalfArchBlock.FACING, Direction.SOUTH)
                .modelForState().modelFile(arch_half).rotationY(180).uvLock(true).addModel()
                .partialState().with(HalfArchBlock.FACING, Direction.WEST)
                .modelForState().modelFile(arch_half).rotationY(270).uvLock(true).addModel();
    }

    public void archLargeBlock(LargeArchBlock block) {
        archLargeBlock(block, blockTexture(block));
    }

    public void archLargeBlock(LargeArchBlock block, ResourceLocation texture) {
        archLargeBlock(block, texture, texture, texture);
    }

    public void archLargeBlock(LargeArchBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile arch_large = models().withExistingParent(name(block), modLoc("block/templates/arch_large"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                arch_large_trim = models().withExistingParent(name(block) + "_trim", modLoc("block/templates/arch_large_trim"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                arch_large_trim_left = models().withExistingParent(name(block) + "_trim_left", modLoc("block/templates/arch_large_trim_left"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                arch_large_trim_right = models().withExistingParent(name(block) + "_trim_right", modLoc("block/templates/arch_large_trim_right"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                arch_large_corner_inner = models().withExistingParent(name(block) + "_corner_inner", modLoc("block/templates/arch_large_corner_inner"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                arch_large_corner_outer = models().withExistingParent(name(block) + "_corner_outer", modLoc("block/templates/arch_large_corner_outer"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.NONE)
                .modelForState().modelFile(arch_large).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.LEFT)
                .modelForState().modelFile(arch_large_trim_left).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.RIGHT)
                .modelForState().modelFile(arch_large_trim).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.BOTH)
                .modelForState().modelFile(arch_large_trim).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_LEFT)
                .modelForState().modelFile(arch_large_corner_inner).rotationY(270).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_RIGHT)
                .modelForState().modelFile(arch_large_corner_inner).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_OUTER_LEFT)
                .modelForState().modelFile(arch_large_corner_outer).rotationY(270).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_OUTER_RIGHT)
                .modelForState().modelFile(arch_large_corner_outer).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.NONE)
                .modelForState().modelFile(arch_large).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.LEFT)
                .modelForState().modelFile(arch_large_trim_left).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.RIGHT)
                .modelForState().modelFile(arch_large_trim_right).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.BOTH)
                .modelForState().modelFile(arch_large_trim).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_LEFT)
                .modelForState().modelFile(arch_large_corner_inner).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_RIGHT)
                .modelForState().modelFile(arch_large_corner_inner).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_OUTER_LEFT)
                .modelForState().modelFile(arch_large_corner_outer).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_OUTER_RIGHT)
                .modelForState().modelFile(arch_large_corner_outer).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.NONE)
                .modelForState().modelFile(arch_large).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.LEFT)
                .modelForState().modelFile(arch_large_trim_left).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.RIGHT)
                .modelForState().modelFile(arch_large_trim_right).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.BOTH)
                .modelForState().modelFile(arch_large_trim).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_LEFT)
                .modelForState().modelFile(arch_large_corner_inner).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_RIGHT)
                .modelForState().modelFile(arch_large_corner_inner).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_OUTER_LEFT)
                .modelForState().modelFile(arch_large_corner_outer).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_OUTER_RIGHT)
                .modelForState().modelFile(arch_large_corner_outer).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.NONE)
                .modelForState().modelFile(arch_large).rotationY(270).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.LEFT)
                .modelForState().modelFile(arch_large_trim_left).rotationY(270).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.RIGHT)
                .modelForState().modelFile(arch_large_trim_right).rotationY(270).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeArchBlock.TYPE, LargeArchShape.STRAIGHT).with(LargeArchBlock.TRIM, LargeArchTrim.BOTH)
                .modelForState().modelFile(arch_large_trim).rotationY(270).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_LEFT)
                .modelForState().modelFile(arch_large_corner_inner).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_RIGHT)
                .modelForState().modelFile(arch_large_corner_inner).rotationY(270).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_OUTER_LEFT)
                .modelForState().modelFile(arch_large_corner_outer).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeArchBlock.TYPE, LargeArchShape.CORNER_OUTER_RIGHT)
                .modelForState().modelFile(arch_large_corner_outer).rotationY(270).uvLock(true).addModel();
    }

    public void archLargeHalfBlock(LargeHalfArchBlock block) {
        archLargeHalfBlock(block, blockTexture(block));
    }

    public void archLargeHalfBlock(LargeHalfArchBlock block, ResourceLocation texture) {
        archLargeHalfBlock(block, texture, texture, texture);
    }

    public void archLargeHalfBlock(LargeHalfArchBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile arch_large_half = models().withExistingParent(name(block), modLoc("block/templates/arch_large_half"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                arch_large_half_left = models().withExistingParent(name(block) + "_left", modLoc("block/templates/arch_large_half_left"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeHalfArchBlock.TYPE, LeftRightShape.RIGHT)
                .modelForState().modelFile(arch_large_half).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.NORTH).with(LargeHalfArchBlock.TYPE, LeftRightShape.LEFT)
                .modelForState().modelFile(arch_large_half_left).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeHalfArchBlock.TYPE, LeftRightShape.RIGHT)
                .modelForState().modelFile(arch_large_half).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.EAST).with(LargeHalfArchBlock.TYPE, LeftRightShape.LEFT)
                .modelForState().modelFile(arch_large_half_left).rotationY(90).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeHalfArchBlock.TYPE, LeftRightShape.RIGHT)
                .modelForState().modelFile(arch_large_half).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.SOUTH).with(LargeHalfArchBlock.TYPE, LeftRightShape.LEFT)
                .modelForState().modelFile(arch_large_half_left).rotationY(180).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeHalfArchBlock.TYPE, LeftRightShape.RIGHT)
                .modelForState().modelFile(arch_large_half).rotationY(270).uvLock(true).addModel()
                .partialState().with(LargeArchBlock.FACING, Direction.WEST).with(LargeHalfArchBlock.TYPE, LeftRightShape.LEFT)
                .modelForState().modelFile(arch_large_half_left).rotationY(270).uvLock(true).addModel();
    }

    public void arrowslitBlock(ArrowSlitBlock block) {
        arrowslitBlock(block, blockTexture(block));
    }

    public void arrowslitBlock(ArrowSlitBlock block, ResourceLocation texture) {
        arrowslitBlock(block, texture, texture, texture);
    }

    public void arrowslitBlock(ArrowSlitBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile arrowslit = models().withExistingParent(name(block), modLoc("block/templates/arrowslit"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(ArrowSlitBlock.FACING, Direction.NORTH)
                .modelForState().modelFile(arrowslit).addModel()
                .partialState().with(ArrowSlitBlock.FACING, Direction.EAST)
                .modelForState().modelFile(arrowslit).rotationY(90).addModel()
                .partialState().with(ArrowSlitBlock.FACING, Direction.SOUTH)
                .modelForState().modelFile(arrowslit).rotationY(180).addModel()
                .partialState().with(ArrowSlitBlock.FACING, Direction.WEST)
                .modelForState().modelFile(arrowslit).rotationY(270).addModel();
    }

    public void balustradeBlock(BalustradeBlock block) {
        balustradeBlock(block, blockTexture(block));
    }

    public void balustradeBlock(BalustradeBlock block, ResourceLocation texture) {
        balustradeBlock(block, texture, texture, texture);
    }

    public void balustradeBlock(BalustradeBlock block, ResourceLocation top, ResourceLocation bottom, ResourceLocation side) {
        ModelFile balustrade = models().withExistingParent(name(block), modLoc("block/templates/balustrade"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                balustrade_connected = models().withExistingParent(name(block) + "_connected", modLoc("block/templates/balustrade_connected"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(BalustradeBlock.TYPE, BalustradeShape.SINGLE)
                .modelForState().modelFile(balustrade).addModel()
                .partialState().with(BalustradeBlock.FACING, Direction.NORTH).with(BalustradeBlock.TYPE, BalustradeShape.CONNECTED)
                .modelForState().modelFile(balustrade_connected).addModel()
                .partialState().with(BalustradeBlock.FACING, Direction.EAST).with(BalustradeBlock.TYPE, BalustradeShape.CONNECTED)
                .modelForState().modelFile(balustrade_connected).rotationY(90).uvLock(true).addModel()
                .partialState().with(BalustradeBlock.FACING, Direction.SOUTH).with(BalustradeBlock.TYPE, BalustradeShape.CONNECTED)
                .modelForState().modelFile(balustrade_connected).rotationY(180).uvLock(true).addModel()
                .partialState().with(BalustradeBlock.FACING, Direction.WEST).with(BalustradeBlock.TYPE, BalustradeShape.CONNECTED)
                .modelForState().modelFile(balustrade_connected).rotationY(270).uvLock(true).addModel();
    }

    public void beamLintelBlock(BeamLintelBlock block) {
        beamLintelBlock(block, blockTexture(block));
    }

    public void beamLintelBlock(BeamLintelBlock block, ResourceLocation texture) {
        beamLintelBlock(block, texture, texture, texture);
    }

    public void beamLintelBlock(BeamLintelBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile beam_lintel_1 = models().withExistingParent(name(block) + "_1", modLoc("block/templates/beam_lintel_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                beam_lintel_2 = models().withExistingParent(name(block) + "_2", modLoc("block/templates/beam_lintel_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_lintel_3 = models().withExistingParent(name(block) + "_3", modLoc("block/templates/beam_lintel_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_lintel_4 = models().withExistingParent(name(block) + "_4", modLoc("block/templates/beam_lintel_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(BeamLintelBlock.FACING, Direction.NORTH).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 1)
                .modelForState().modelFile(beam_lintel_1).rotationX(180).rotationY(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.NORTH).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 2)
                .modelForState().modelFile(beam_lintel_2).rotationX(180).rotationY(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.NORTH).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 3)
                .modelForState().modelFile(beam_lintel_3).rotationX(180).rotationY(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.NORTH).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 4)
                .modelForState().modelFile(beam_lintel_4).rotationX(180).rotationY(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.NORTH).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 1)
                .modelForState().modelFile(beam_lintel_1).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.NORTH).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 2)
                .modelForState().modelFile(beam_lintel_2).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.NORTH).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 3)
                .modelForState().modelFile(beam_lintel_3).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.NORTH).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 4)
                .modelForState().modelFile(beam_lintel_4).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.EAST).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 1)
                .modelForState().modelFile(beam_lintel_1).rotationY(90).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.EAST).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 2)
                .modelForState().modelFile(beam_lintel_2).rotationY(90).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.EAST).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 3)
                .modelForState().modelFile(beam_lintel_3).rotationY(90).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.EAST).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 4)
                .modelForState().modelFile(beam_lintel_4).rotationY(90).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.EAST).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 1)
                .modelForState().modelFile(beam_lintel_1).rotationX(180).rotationY(270).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.EAST).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 2)
                .modelForState().modelFile(beam_lintel_2).rotationX(180).rotationY(270).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.EAST).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 3)
                .modelForState().modelFile(beam_lintel_3).rotationX(180).rotationY(270).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.EAST).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 4)
                .modelForState().modelFile(beam_lintel_4).rotationX(180).rotationY(270).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.SOUTH).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 1)
                .modelForState().modelFile(beam_lintel_1).rotationY(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.SOUTH).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 2)
                .modelForState().modelFile(beam_lintel_2).rotationY(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.SOUTH).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 3)
                .modelForState().modelFile(beam_lintel_3).rotationY(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.SOUTH).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 4)
                .modelForState().modelFile(beam_lintel_4).rotationY(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.SOUTH).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 1)
                .modelForState().modelFile(beam_lintel_1).rotationX(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.SOUTH).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 2)
                .modelForState().modelFile(beam_lintel_2).rotationX(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.SOUTH).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 3)
                .modelForState().modelFile(beam_lintel_3).rotationX(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.SOUTH).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 4)
                .modelForState().modelFile(beam_lintel_4).rotationX(180).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.WEST).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 1)
                .modelForState().modelFile(beam_lintel_1).rotationY(270).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.WEST).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 2)
                .modelForState().modelFile(beam_lintel_2).rotationY(270).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.WEST).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 3)
                .modelForState().modelFile(beam_lintel_3).rotationY(270).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.WEST).with(BeamLintelBlock.TYPE, TopBottomShape.TOP).with(BeamLintelBlock.BEAM, 4)
                .modelForState().modelFile(beam_lintel_4).rotationY(270).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.WEST).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 1)
                .modelForState().modelFile(beam_lintel_1).rotationX(180).rotationY(90).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.WEST).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 2)
                .modelForState().modelFile(beam_lintel_2).rotationX(180).rotationY(90).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.WEST).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 3)
                .modelForState().modelFile(beam_lintel_3).rotationX(180).rotationY(90).addModel()
                .partialState().with(BeamLintelBlock.FACING, Direction.WEST).with(BeamLintelBlock.TYPE, TopBottomShape.BOTTOM).with(BeamLintelBlock.BEAM, 4)
                .modelForState().modelFile(beam_lintel_4).rotationX(180).rotationY(90).addModel();
    }

    public void beamPostsBlock(BeamPostsBlock block) {
        beamPostsBlock(block, blockTexture(block));
    }

    public void beamPostsBlock(BeamPostsBlock block, ResourceLocation texture) {
        beamPostsBlock(block, texture, texture, texture);
    }

    public void beamPostsBlock(BeamPostsBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile beam_posts_1 = models().withExistingParent(name(block) + "_1", modLoc("block/templates/beam_posts_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                beam_posts_2 = models().withExistingParent(name(block) + "_2", modLoc("block/templates/beam_posts_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_posts_3 = models().withExistingParent(name(block) + "_3", modLoc("block/templates/beam_posts_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(BeamPostsBlock.FACING, Direction.NORTH).with(BeamPostsBlock.BEAM, 1)
                .modelForState().modelFile(beam_posts_1).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.NORTH).with(BeamPostsBlock.BEAM, 2)
                .modelForState().modelFile(beam_posts_2).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.NORTH).with(BeamPostsBlock.BEAM, 3)
                .modelForState().modelFile(beam_posts_3).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.EAST).with(BeamPostsBlock.BEAM, 1)
                .modelForState().modelFile(beam_posts_1).rotationY(90).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.EAST).with(BeamPostsBlock.BEAM, 2)
                .modelForState().modelFile(beam_posts_2).rotationY(90).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.EAST).with(BeamPostsBlock.BEAM, 3)
                .modelForState().modelFile(beam_posts_3).rotationY(90).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.SOUTH).with(BeamPostsBlock.BEAM, 1)
                .modelForState().modelFile(beam_posts_1).rotationY(180).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.SOUTH).with(BeamPostsBlock.BEAM, 2)
                .modelForState().modelFile(beam_posts_2).rotationY(180).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.SOUTH).with(BeamPostsBlock.BEAM, 3)
                .modelForState().modelFile(beam_posts_3).rotationY(180).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.WEST).with(BeamPostsBlock.BEAM, 1)
                .modelForState().modelFile(beam_posts_1).rotationY(270).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.WEST).with(BeamPostsBlock.BEAM, 2)
                .modelForState().modelFile(beam_posts_2).rotationY(270).addModel()
                .partialState().with(BeamPostsBlock.FACING, Direction.WEST).with(BeamPostsBlock.BEAM, 3)
                .modelForState().modelFile(beam_posts_3).rotationY(270).addModel();
    }

    public void beamHorizontalBlock(HorizontalBeamBlock block) {
        beamHorizontalBlock(block, blockTexture(block));
    }

    public void beamHorizontalBlock(HorizontalBeamBlock block, ResourceLocation texture) {
        beamHorizontalBlock(block, texture, texture, texture);
    }

    public void beamHorizontalBlock(HorizontalBeamBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile beam_horizontal_1 = models().withExistingParent(name(block) + "_1", modLoc("block/templates/beam_horizontal_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                beam_horizontal_2 = models().withExistingParent(name(block) + "_2", modLoc("block/templates/beam_horizontal_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_horizontal_3 = models().withExistingParent(name(block) + "_3", modLoc("block/templates/beam_horizontal_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_horizontal_4 = models().withExistingParent(name(block) + "_4", modLoc("block/templates/beam_horizontal_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_horizontal_5 = models().withExistingParent(name(block) + "_5", modLoc("block/templates/beam_horizontal_5"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_horizontal_6 = models().withExistingParent(name(block) + "_6", modLoc("block/templates/beam_horizontal_6"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_horizontal_1).rotationX(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_horizontal_2).rotationX(180).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_horizontal_3).rotationX(180).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_horizontal_4).rotationX(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_horizontal_5).rotationX(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_horizontal_6).rotationX(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_horizontal_1).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_horizontal_2).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_horizontal_3).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_horizontal_4).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_horizontal_5).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.NORTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_horizontal_6).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_horizontal_1).rotationX(180).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_horizontal_2).rotationX(180).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_horizontal_3).rotationX(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_horizontal_4).rotationX(180).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_horizontal_5).rotationX(180).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_horizontal_6).rotationX(180).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_horizontal_1).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_horizontal_2).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_horizontal_3).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_horizontal_4).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_horizontal_5).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.EAST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_horizontal_6).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_horizontal_1).rotationX(180).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_horizontal_2).rotationX(180).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_horizontal_3).rotationX(180).rotationY(90).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_horizontal_4).rotationX(180).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_horizontal_5).rotationX(180).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_horizontal_6).rotationX(180).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_horizontal_1).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_horizontal_2).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_horizontal_3).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_horizontal_4).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_horizontal_5).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.SOUTH).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_horizontal_6).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_horizontal_1).rotationX(180).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_horizontal_2).rotationX(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_horizontal_3).rotationX(180).rotationY(180).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_horizontal_4).rotationX(180).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_horizontal_5).rotationX(180).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.TOP).with(HorizontalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_horizontal_6).rotationX(180).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_horizontal_1).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_horizontal_2).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_horizontal_3).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_horizontal_4).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_horizontal_5).rotationY(270).addModel()
                .partialState().with(HorizontalBeamBlock.FACING, Direction.WEST).with(HorizontalBeamBlock.TYPE, TopBottomShape.BOTTOM).with(HorizontalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_horizontal_6).rotationY(270).addModel();
    }

    public void beamVerticalBlock(VerticalBeamBlock block) {
        beamVerticalBlock(block, blockTexture(block));
    }

    public void beamVerticalBlock(VerticalBeamBlock block, ResourceLocation texture) {
        beamVerticalBlock(block, texture, texture, texture);
    }

    public void beamVerticalBlock(VerticalBeamBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile beam_vertical_1 = models().withExistingParent(name(block) + "_1", modLoc("block/templates/beam_vertical_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                beam_vertical_2 = models().withExistingParent(name(block) + "_2", modLoc("block/templates/beam_vertical_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_vertical_3 = models().withExistingParent(name(block) + "_3", modLoc("block/templates/beam_vertical_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_vertical_4 = models().withExistingParent(name(block) + "_4", modLoc("block/templates/beam_vertical_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_vertical_5 = models().withExistingParent(name(block) + "_5", modLoc("block/templates/beam_vertical_5"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_vertical_6 = models().withExistingParent(name(block) + "_6", modLoc("block/templates/beam_vertical_6"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                beam_vertical_7 = models().withExistingParent(name(block) + "_7", modLoc("block/templates/beam_vertical_7"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(VerticalBeamBlock.FACING, Direction.NORTH).with(VerticalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_vertical_1).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.NORTH).with(VerticalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_vertical_2).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.NORTH).with(VerticalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_vertical_3).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.NORTH).with(VerticalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_vertical_4).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.NORTH).with(VerticalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_vertical_5).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.NORTH).with(VerticalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_vertical_6).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.NORTH).with(VerticalBeamBlock.BEAM, 7)
                .modelForState().modelFile(beam_vertical_7).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.EAST).with(VerticalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_vertical_1).rotationY(90).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.EAST).with(VerticalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_vertical_2).rotationY(90).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.EAST).with(VerticalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_vertical_3).rotationY(90).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.EAST).with(VerticalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_vertical_4).rotationY(90).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.EAST).with(VerticalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_vertical_5).rotationY(90).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.EAST).with(VerticalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_vertical_6).rotationY(90).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.EAST).with(VerticalBeamBlock.BEAM, 7)
                .modelForState().modelFile(beam_vertical_7).rotationY(90).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.SOUTH).with(VerticalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_vertical_1).rotationY(180).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.SOUTH).with(VerticalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_vertical_2).rotationY(180).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.SOUTH).with(VerticalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_vertical_3).rotationY(180).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.SOUTH).with(VerticalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_vertical_4).rotationY(180).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.SOUTH).with(VerticalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_vertical_5).rotationY(180).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.SOUTH).with(VerticalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_vertical_6).rotationY(180).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.SOUTH).with(VerticalBeamBlock.BEAM, 7)
                .modelForState().modelFile(beam_vertical_7).rotationY(180).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.WEST).with(VerticalBeamBlock.BEAM, 1)
                .modelForState().modelFile(beam_vertical_1).rotationY(270).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.WEST).with(VerticalBeamBlock.BEAM, 2)
                .modelForState().modelFile(beam_vertical_2).rotationY(270).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.WEST).with(VerticalBeamBlock.BEAM, 3)
                .modelForState().modelFile(beam_vertical_3).rotationY(270).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.WEST).with(VerticalBeamBlock.BEAM, 4)
                .modelForState().modelFile(beam_vertical_4).rotationY(270).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.WEST).with(VerticalBeamBlock.BEAM, 5)
                .modelForState().modelFile(beam_vertical_5).rotationY(270).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.WEST).with(VerticalBeamBlock.BEAM, 6)
                .modelForState().modelFile(beam_vertical_6).rotationY(270).addModel()
                .partialState().with(VerticalBeamBlock.FACING, Direction.WEST).with(VerticalBeamBlock.BEAM, 7)
                .modelForState().modelFile(beam_vertical_7).rotationY(270).addModel();
    }

    public void capitalBlock(CapitalBlock block) {
        capitalBlock(block, blockTexture(block));
    }

    public void capitalBlock(CapitalBlock block, ResourceLocation texture) {
        capitalBlock(block, texture, texture, texture);
    }

    public void capitalBlock(CapitalBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile capital = models().withExistingParent(name(block), modLoc("block/templates/capital"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                capital_top = models().withExistingParent(name(block) + "_top", modLoc("block/templates/capital_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(CapitalBlock.TYPE, CapitalShape.BOTTOM)
                .modelForState().modelFile(capital).addModel()
                .partialState().with(CapitalBlock.TYPE, CapitalShape.TOP)
                .modelForState().modelFile(capital_top).addModel();
    }

    public void cornerLayerBlock(CornerLayerBlock block) {
        cornerLayerBlock(block, blockTexture(block));
    }

    public void cornerLayerBlock(CornerLayerBlock block, ResourceLocation texture) {
        cornerLayerBlock(block, texture, texture, texture, texture);
    }

    public void cornerLayerBlock(CornerLayerBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom, ResourceLocation baseBlock) {
        ModelFile corner_layer_1 = models().withExistingParent(name(block) + "_layer_1", modLoc("block/templates/corner_layer_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                corner_layer_2 = models().withExistingParent(name(block) + "_layer_2", modLoc("block/templates/corner_layer_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                corner_layer_3 = models().withExistingParent(name(block) + "_layer_3", modLoc("block/templates/corner_layer_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                corner_layer_4 = models().withExistingParent(name(block) + "_layer_4", modLoc("block/templates/corner_layer_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                full_block = models().getExistingFile(baseBlock);

        getVariantBuilder(block)
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 1)
                .modelForState().modelFile(corner_layer_1).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 2)
                .modelForState().modelFile(corner_layer_2).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 3)
                .modelForState().modelFile(corner_layer_3).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 4)
                .modelForState().modelFile(corner_layer_4).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 1)
                .modelForState().modelFile(corner_layer_1).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 2)
                .modelForState().modelFile(corner_layer_2).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 3)
                .modelForState().modelFile(corner_layer_3).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 4)
                .modelForState().modelFile(corner_layer_4).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.NORTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 1)
                .modelForState().modelFile(corner_layer_1).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 2)
                .modelForState().modelFile(corner_layer_2).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 3)
                .modelForState().modelFile(corner_layer_3).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 4)
                .modelForState().modelFile(corner_layer_4).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 1)
                .modelForState().modelFile(corner_layer_1).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 2)
                .modelForState().modelFile(corner_layer_2).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 3)
                .modelForState().modelFile(corner_layer_3).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 4)
                .modelForState().modelFile(corner_layer_4).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.EAST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 1)
                .modelForState().modelFile(corner_layer_1).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 2)
                .modelForState().modelFile(corner_layer_2).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 3)
                .modelForState().modelFile(corner_layer_3).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 4)
                .modelForState().modelFile(corner_layer_4).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 1)
                .modelForState().modelFile(corner_layer_1).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 2)
                .modelForState().modelFile(corner_layer_2).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 3)
                .modelForState().modelFile(corner_layer_3).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 4)
                .modelForState().modelFile(corner_layer_4).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.SOUTH).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(90).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 1)
                .modelForState().modelFile(corner_layer_1).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 2)
                .modelForState().modelFile(corner_layer_2).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 3)
                .modelForState().modelFile(corner_layer_3).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 4)
                .modelForState().modelFile(corner_layer_4).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.RIGHT).with(CornerLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(270).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 1)
                .modelForState().modelFile(corner_layer_1).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 2)
                .modelForState().modelFile(corner_layer_2).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 3)
                .modelForState().modelFile(corner_layer_3).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 4)
                .modelForState().modelFile(corner_layer_4).rotationY(180).uvLock(true).addModel()
                .partialState().with(CornerLayerBlock.FACING, Direction.WEST).with(CornerLayerBlock.TYPE, CornerShape.LEFT).with(CornerLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(180).uvLock(true).addModel();
    }


    public void cornerSlabBlock(CornerSlabBlock block) {
        cornerSlabBlock(block, blockTexture(block));
    }

    public void cornerSlabBlock(CornerSlabBlock block, ResourceLocation texture) {
        cornerSlabBlock(block, texture, texture, texture);
    }

    public void cornerSlabBlock(CornerSlabBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile corner_slab = models().withExistingParent(name(block), modLoc("block/templates/corner_slab"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                corner_slab_top = models().withExistingParent(name(block) + "_top", modLoc("block/templates/corner_slab_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(CornerSlabBlock.FACING, Direction.NORTH).with(CornerSlabBlock.TYPE, CornerSlabShape.RIGHT)
                .modelForState().modelFile(corner_slab).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.NORTH).with(CornerSlabBlock.TYPE, CornerSlabShape.LEFT)
                .modelForState().modelFile(corner_slab).rotationY(270).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.NORTH).with(CornerSlabBlock.TYPE, CornerSlabShape.TOP_RIGHT)
                .modelForState().modelFile(corner_slab_top).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.NORTH).with(CornerSlabBlock.TYPE, CornerSlabShape.TOP_LEFT)
                .modelForState().modelFile(corner_slab_top).rotationY(270).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.EAST).with(CornerSlabBlock.TYPE, CornerSlabShape.RIGHT)
                .modelForState().modelFile(corner_slab).rotationY(90).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.EAST).with(CornerSlabBlock.TYPE, CornerSlabShape.LEFT)
                .modelForState().modelFile(corner_slab).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.EAST).with(CornerSlabBlock.TYPE, CornerSlabShape.TOP_RIGHT)
                .modelForState().modelFile(corner_slab_top).rotationY(90).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.EAST).with(CornerSlabBlock.TYPE, CornerSlabShape.TOP_LEFT)
                .modelForState().modelFile(corner_slab_top).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.SOUTH).with(CornerSlabBlock.TYPE, CornerSlabShape.RIGHT)
                .modelForState().modelFile(corner_slab).rotationY(180).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.SOUTH).with(CornerSlabBlock.TYPE, CornerSlabShape.LEFT)
                .modelForState().modelFile(corner_slab).rotationY(90).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.SOUTH).with(CornerSlabBlock.TYPE, CornerSlabShape.TOP_RIGHT)
                .modelForState().modelFile(corner_slab_top).rotationY(180).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.SOUTH).with(CornerSlabBlock.TYPE, CornerSlabShape.TOP_LEFT)
                .modelForState().modelFile(corner_slab_top).rotationY(90).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.WEST).with(CornerSlabBlock.TYPE, CornerSlabShape.RIGHT)
                .modelForState().modelFile(corner_slab).rotationY(270).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.WEST).with(CornerSlabBlock.TYPE, CornerSlabShape.LEFT)
                .modelForState().modelFile(corner_slab).rotationY(180).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.WEST).with(CornerSlabBlock.TYPE, CornerSlabShape.TOP_RIGHT)
                .modelForState().modelFile(corner_slab_top).rotationY(270).addModel()
                .partialState().with(CornerSlabBlock.FACING, Direction.WEST).with(CornerSlabBlock.TYPE, CornerSlabShape.TOP_LEFT)
                .modelForState().modelFile(corner_slab_top).rotationY(180).addModel();
    }

    public void cornerSlabVerticalBlock(VerticalCornerSlabBlock block) {
        cornerSlabVerticalBlock(block, blockTexture(block));
    }

    public void cornerSlabVerticalBlock(VerticalCornerSlabBlock block, ResourceLocation texture) {
        cornerSlabVerticalBlock(block, texture, texture, texture);
    }

    public void cornerSlabVerticalBlock(VerticalCornerSlabBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile corner_slab_vertical = models().withExistingParent(name(block), modLoc("block/templates/corner_slab_vertical"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                corner_slab_vertical_left = models().withExistingParent(name(block) + "_left", modLoc("block/templates/corner_slab_vertical_left"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                corner_slab_vertical_top = models().withExistingParent(name(block) + "_top", modLoc("block/templates/corner_slab_vertical_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                corner_slab_vertical_top_left = models().withExistingParent(name(block) + "_top_left", modLoc("block/templates/corner_slab_vertical_top_left"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.NORTH).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.RIGHT)
                .modelForState().modelFile(corner_slab_vertical).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.NORTH).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.LEFT)
                .modelForState().modelFile(corner_slab_vertical_left).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.NORTH).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.TOP_RIGHT)
                .modelForState().modelFile(corner_slab_vertical_top).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.NORTH).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.TOP_LEFT)
                .modelForState().modelFile(corner_slab_vertical_top_left).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.EAST).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.RIGHT)
                .modelForState().modelFile(corner_slab_vertical).rotationY(90).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.EAST).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.LEFT)
                .modelForState().modelFile(corner_slab_vertical_left).rotationY(90).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.EAST).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.TOP_RIGHT)
                .modelForState().modelFile(corner_slab_vertical_top).rotationY(90).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.EAST).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.TOP_LEFT)
                .modelForState().modelFile(corner_slab_vertical_top_left).rotationY(90).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.SOUTH).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.RIGHT)
                .modelForState().modelFile(corner_slab_vertical).rotationY(180).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.SOUTH).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.LEFT)
                .modelForState().modelFile(corner_slab_vertical_left).rotationY(180).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.SOUTH).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.TOP_RIGHT)
                .modelForState().modelFile(corner_slab_vertical_top).rotationY(180).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.SOUTH).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.TOP_LEFT)
                .modelForState().modelFile(corner_slab_vertical_top_left).rotationY(180).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.WEST).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.RIGHT)
                .modelForState().modelFile(corner_slab_vertical).rotationY(270).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.WEST).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.LEFT)
                .modelForState().modelFile(corner_slab_vertical_left).rotationY(270).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.WEST).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.TOP_RIGHT)
                .modelForState().modelFile(corner_slab_vertical_top).rotationY(270).addModel()
                .partialState().with(VerticalCornerSlabBlock.FACING, Direction.WEST).with(VerticalCornerSlabBlock.TYPE, VerticalCornerSlabShape.TOP_LEFT)
                .modelForState().modelFile(corner_slab_vertical_top_left).rotationY(270).addModel();
    }

    public void doorFrameBlock(DoorFrameBlock block) {
        doorFrameBlock(block, blockTexture(block));
    }

    public void doorFrameBlock(DoorFrameBlock block, ResourceLocation texture) {
        doorFrameBlock(block, texture, texture, texture);
    }

    public void doorFrameBlock(DoorFrameBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile door_frame_1 = models().withExistingParent(name(block) + "_1", modLoc("block/templates/door_frame_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                door_frame_2 = models().withExistingParent(name(block) + "_2", modLoc("block/templates/door_frame_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                door_frame_3 = models().withExistingParent(name(block) + "_3", modLoc("block/templates/door_frame_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(DoorFrameBlock.FACING, Direction.NORTH).with(DoorFrameBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_1).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.NORTH).with(DoorFrameBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_2).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.NORTH).with(DoorFrameBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_3).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.EAST).with(DoorFrameBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_1).rotationY(90).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.EAST).with(DoorFrameBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_2).rotationY(90).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.EAST).with(DoorFrameBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_3).rotationY(90).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.SOUTH).with(DoorFrameBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_1).rotationY(180).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.SOUTH).with(DoorFrameBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_2).rotationY(180).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.SOUTH).with(DoorFrameBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_3).rotationY(180).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.WEST).with(DoorFrameBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_1).rotationY(270).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.WEST).with(DoorFrameBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_2).rotationY(270).addModel()
                .partialState().with(DoorFrameBlock.FACING, Direction.WEST).with(DoorFrameBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_3).rotationY(270).addModel();
    }

    public void doorFrameLintelBlock(DoorFrameLintelBlock block) {
        doorFrameLintelBlock(block, blockTexture(block));
    }

    public void doorFrameLintelBlock(DoorFrameLintelBlock block, ResourceLocation texture) {
        doorFrameLintelBlock(block, texture, texture, texture);
    }

    public void doorFrameLintelBlock(DoorFrameLintelBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile door_frame_lintel_1 = models().withExistingParent(name(block) + "_1", modLoc("block/templates/door_frame_lintel_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                door_frame_lintel_2 = models().withExistingParent(name(block) + "_2", modLoc("block/templates/door_frame_lintel_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                door_frame_lintel_3 = models().withExistingParent(name(block) + "_3", modLoc("block/templates/door_frame_lintel_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                door_frame_lintel_4 = models().withExistingParent(name(block) + "_4", modLoc("block/templates/door_frame_lintel_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.NORTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_lintel_1).rotationX(180).rotationY(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.NORTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_lintel_2).rotationX(180).rotationY(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.NORTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_lintel_3).rotationX(180).rotationY(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.NORTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 4)
                .modelForState().modelFile(door_frame_lintel_4).rotationX(180).rotationY(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.NORTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_lintel_1).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.NORTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_lintel_2).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.NORTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_lintel_3).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.NORTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 4)
                .modelForState().modelFile(door_frame_lintel_4).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.EAST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_lintel_1).rotationY(90).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.EAST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_lintel_2).rotationY(90).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.EAST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_lintel_3).rotationY(90).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.EAST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 4)
                .modelForState().modelFile(door_frame_lintel_4).rotationY(90).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.EAST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_lintel_1).rotationX(180).rotationY(270).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.EAST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_lintel_2).rotationX(180).rotationY(270).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.EAST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_lintel_3).rotationX(180).rotationY(270).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.EAST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 4)
                .modelForState().modelFile(door_frame_lintel_4).rotationX(180).rotationY(270).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.SOUTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_lintel_1).rotationY(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.SOUTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_lintel_2).rotationY(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.SOUTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_lintel_3).rotationY(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.SOUTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 4)
                .modelForState().modelFile(door_frame_lintel_4).rotationY(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.SOUTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_lintel_1).rotationX(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.SOUTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_lintel_2).rotationX(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.SOUTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_lintel_3).rotationX(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.SOUTH).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 4)
                .modelForState().modelFile(door_frame_lintel_4).rotationX(180).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.WEST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_lintel_1).rotationY(270).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.WEST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_lintel_2).rotationY(270).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.WEST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_lintel_3).rotationY(270).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.WEST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.TOP).with(DoorFrameLintelBlock.BEAM, 4)
                .modelForState().modelFile(door_frame_lintel_4).rotationY(270).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.WEST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 1)
                .modelForState().modelFile(door_frame_lintel_1).rotationX(180).rotationY(90).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.WEST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 2)
                .modelForState().modelFile(door_frame_lintel_2).rotationX(180).rotationY(90).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.WEST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 3)
                .modelForState().modelFile(door_frame_lintel_3).rotationX(180).rotationY(90).addModel()
                .partialState().with(DoorFrameLintelBlock.FACING, Direction.WEST).with(DoorFrameLintelBlock.TYPE, TopBottomShape.BOTTOM).with(DoorFrameLintelBlock.BEAM, 4)
                .modelForState().modelFile(door_frame_lintel_4).rotationX(180).rotationY(90).addModel();
    }

    public void eighthBlock(EighthBlock block) {
        eighthBlock(block, blockTexture(block));
    }

    public void eighthBlock(EighthBlock block, ResourceLocation texture) {
        eighthBlock(block, texture, texture, texture);
    }

    public void eighthBlock(EighthBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile eighth = models().withExistingParent(name(block), modLoc("block/templates/eighth"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                eighth_left = models().withExistingParent(name(block) + "_left", modLoc("block/templates/eighth_left"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                eighth_top = models().withExistingParent(name(block) + "_top", modLoc("block/templates/eighth_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                eighth_top_left = models().withExistingParent(name(block) + "_top_left", modLoc("block/templates/eighth_top_left"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(EighthBlock.FACING, Direction.NORTH).with(EighthBlock.TYPE, EighthShape.RIGHT)
                .modelForState().modelFile(eighth).addModel()
                .partialState().with(EighthBlock.FACING, Direction.NORTH).with(EighthBlock.TYPE, EighthShape.LEFT)
                .modelForState().modelFile(eighth_left).addModel()
                .partialState().with(EighthBlock.FACING, Direction.NORTH).with(EighthBlock.TYPE, EighthShape.TOP_RIGHT)
                .modelForState().modelFile(eighth_top).addModel()
                .partialState().with(EighthBlock.FACING, Direction.NORTH).with(EighthBlock.TYPE, EighthShape.TOP_LEFT)
                .modelForState().modelFile(eighth_top_left).addModel()
                .partialState().with(EighthBlock.FACING, Direction.EAST).with(EighthBlock.TYPE, EighthShape.RIGHT)
                .modelForState().modelFile(eighth).rotationY(90).addModel()
                .partialState().with(EighthBlock.FACING, Direction.EAST).with(EighthBlock.TYPE, EighthShape.LEFT)
                .modelForState().modelFile(eighth_left).rotationY(90).addModel()
                .partialState().with(EighthBlock.FACING, Direction.EAST).with(EighthBlock.TYPE, EighthShape.TOP_RIGHT)
                .modelForState().modelFile(eighth_top).rotationY(90).addModel()
                .partialState().with(EighthBlock.FACING, Direction.EAST).with(EighthBlock.TYPE, EighthShape.TOP_LEFT)
                .modelForState().modelFile(eighth_top_left).rotationY(90).addModel()
                .partialState().with(EighthBlock.FACING, Direction.SOUTH).with(EighthBlock.TYPE, EighthShape.RIGHT)
                .modelForState().modelFile(eighth).rotationY(180).addModel()
                .partialState().with(EighthBlock.FACING, Direction.SOUTH).with(EighthBlock.TYPE, EighthShape.LEFT)
                .modelForState().modelFile(eighth_left).rotationY(180).addModel()
                .partialState().with(EighthBlock.FACING, Direction.SOUTH).with(EighthBlock.TYPE, EighthShape.TOP_RIGHT)
                .modelForState().modelFile(eighth_top).rotationY(180).addModel()
                .partialState().with(EighthBlock.FACING, Direction.SOUTH).with(EighthBlock.TYPE, EighthShape.TOP_LEFT)
                .modelForState().modelFile(eighth_top_left).rotationY(180).addModel()
                .partialState().with(EighthBlock.FACING, Direction.WEST).with(EighthBlock.TYPE, EighthShape.RIGHT)
                .modelForState().modelFile(eighth).rotationY(270).addModel()
                .partialState().with(EighthBlock.FACING, Direction.WEST).with(EighthBlock.TYPE, EighthShape.LEFT)
                .modelForState().modelFile(eighth_left).rotationY(270).addModel()
                .partialState().with(EighthBlock.FACING, Direction.WEST).with(EighthBlock.TYPE, EighthShape.TOP_RIGHT)
                .modelForState().modelFile(eighth_top).rotationY(270).addModel()
                .partialState().with(EighthBlock.FACING, Direction.WEST).with(EighthBlock.TYPE, EighthShape.TOP_LEFT)
                .modelForState().modelFile(eighth_top_left).rotationY(270).addModel();

    }

    public void pillarLayerBlock(PillarLayerBlock block) {
        pillarLayerBlock(block, blockTexture(block));
    }

    public void pillarLayerBlock(PillarLayerBlock block, ResourceLocation texture) {
        pillarLayerBlock(block, texture, texture, texture, texture);
    }

    public void pillarLayerBlock(PillarLayerBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom, ResourceLocation baseBlock) {
        ModelFile pillar_layer_1 = models().withExistingParent(name(block) + "_layer_1", modLoc("block/templates/pillar_layer_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                pillar_layer_2 = models().withExistingParent(name(block) + "_layer_2", modLoc("block/templates/pillar_layer_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                pillar_layer_3 = models().withExistingParent(name(block) + "_layer_3", modLoc("block/templates/pillar_layer_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                pillar_layer_4 = models().withExistingParent(name(block) + "_layer_4", modLoc("block/templates/pillar_layer_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                full_block = this.models().getExistingFile(baseBlock);

        getVariantBuilder(block)
                .partialState().with(PillarLayerBlock.LAYERS, 1)
                .modelForState().modelFile(pillar_layer_1).addModel()
                .partialState().with(PillarLayerBlock.LAYERS, 2)
                .modelForState().modelFile(pillar_layer_2).addModel()
                .partialState().with(PillarLayerBlock.LAYERS, 3)
                .modelForState().modelFile(pillar_layer_3).addModel()
                .partialState().with(PillarLayerBlock.LAYERS, 4)
                .modelForState().modelFile(pillar_layer_4).addModel()
                .partialState().with(PillarLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel();
    }
    
    public void quarterLayerBlock(QuarterLayerBlock block) {
        quarterLayerBlock(block, blockTexture(block));
    }
    
    public void quarterLayerBlock(QuarterLayerBlock block, ResourceLocation texture) {
        quarterLayerBlock(block, texture, texture, texture, texture);
    }

    public void quarterLayerBlock(QuarterLayerBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom, ResourceLocation baseBlock) {
        ModelFile quarter_layer_1 = models().withExistingParent(name(block) + "_layer_1", modLoc("block/templates/quarter_layer_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                quarter_layer_2 = models().withExistingParent(name(block) + "_layer_2", modLoc("block/templates/quarter_layer_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                quarter_layer_3 = models().withExistingParent(name(block) + "_layer_3", modLoc("block/templates/quarter_layer_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                quarter_layer_4 = models().withExistingParent(name(block) + "_layer_4", modLoc("block/templates/quarter_layer_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                quarter_top_layer_1 = models().withExistingParent(name(block) + "_top_layer_1", modLoc("block/templates/quarter_top_layer_1"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                quarter_top_layer_2 = models().withExistingParent(name(block) + "_top_layer_2", modLoc("block/templates/quarter_top_layer_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                quarter_top_layer_3 = models().withExistingParent(name(block) + "_top_layer_3", modLoc("block/templates/quarter_top_layer_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                quarter_top_layer_4 = models().withExistingParent(name(block) + "_top_layer_4", modLoc("block/templates/quarter_top_layer_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                full_block = this.models().getExistingFile(baseBlock);
        
        getVariantBuilder(block)
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_layer_1).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_layer_2).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_layer_3).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_layer_4).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_top_layer_1).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_top_layer_2).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_top_layer_3).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_top_layer_4).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.NORTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_layer_1).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_layer_2).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_layer_3).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_layer_4).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_top_layer_1).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_top_layer_2).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_top_layer_3).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_top_layer_4).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.EAST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(90).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_layer_1).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_layer_2).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_layer_3).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_layer_4).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_top_layer_1).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_top_layer_2).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_top_layer_3).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_top_layer_4).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.SOUTH).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(180).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_layer_1).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_layer_2).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_layer_3).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_layer_4).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.BOTTOM).with(QuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_top_layer_1).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_top_layer_2).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_top_layer_3).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_top_layer_4).rotationY(270).addModel()
                .partialState().with(QuarterLayerBlock.FACING, Direction.WEST).with(QuarterLayerBlock.TYPE, QuarterLayerShape.TOP).with(QuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(270).addModel();
    }

    public void quarterLayerVerticalBlock(VerticalQuarterLayerBlock block) {
        quarterLayerVerticalBlock(block, blockTexture(block));
    }

    public void quarterLayerVerticalBlock(VerticalQuarterLayerBlock block, ResourceLocation texture) {
        quarterLayerVerticalBlock(block, texture, texture, texture, texture);
    }

    public void quarterLayerVerticalBlock(VerticalQuarterLayerBlock block, ResourceLocation side, ResourceLocation left, ResourceLocation bottom, ResourceLocation baseBlock) {
        ModelFile quarter_vertical_layer_1 = models().withExistingParent(name(block) + "_layer_1", modLoc("block/templates/quarter_vertical_layer_1"))
                .texture("side", side)
                .texture("top", left)
                .texture("bottom", bottom),
                quarter_vertical_layer_2 = models().withExistingParent(name(block) + "_layer_2", modLoc("block/templates/quarter_vertical_layer_2"))
                        .texture("side", side)
                        .texture("top", left)
                        .texture("bottom", bottom),
                quarter_vertical_layer_3 = models().withExistingParent(name(block) + "_layer_3", modLoc("block/templates/quarter_vertical_layer_3"))
                        .texture("side", side)
                        .texture("top", left)
                        .texture("bottom", bottom),
                quarter_vertical_layer_4 = models().withExistingParent(name(block) + "_layer_4", modLoc("block/templates/quarter_vertical_layer_4"))
                        .texture("side", side)
                        .texture("top", left)
                        .texture("bottom", bottom),
                full_block = this.models().getExistingFile(baseBlock);
        
        getVariantBuilder(block)
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_vertical_layer_1).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_vertical_layer_2).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_vertical_layer_3).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_vertical_layer_4).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_vertical_layer_1).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_vertical_layer_2).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_vertical_layer_3).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_vertical_layer_4).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.NORTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_vertical_layer_1).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_vertical_layer_2).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_vertical_layer_3).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_vertical_layer_4).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_vertical_layer_1).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_vertical_layer_2).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_vertical_layer_3).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_vertical_layer_4).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.EAST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_vertical_layer_1).rotationY(180).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_vertical_layer_2).rotationY(180).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_vertical_layer_3).rotationY(180).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_vertical_layer_4).rotationY(180).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_vertical_layer_1).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_vertical_layer_2).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_vertical_layer_3).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_vertical_layer_4).rotationY(90).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.SOUTH).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_vertical_layer_1).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_vertical_layer_2).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_vertical_layer_3).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_vertical_layer_4).rotationY(270).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.RIGHT).with(VerticalQuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 1)
                .modelForState().modelFile(quarter_vertical_layer_1).rotationY(180).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 2)
                .modelForState().modelFile(quarter_vertical_layer_2).rotationY(180).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 3)
                .modelForState().modelFile(quarter_vertical_layer_3).rotationY(180).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 4)
                .modelForState().modelFile(quarter_vertical_layer_4).rotationY(180).addModel()
                .partialState().with(VerticalQuarterLayerBlock.FACING, Direction.WEST).with(VerticalQuarterLayerBlock.TYPE, LeftRightShape.LEFT).with(VerticalQuarterLayerBlock.LAYERS, 5)
                .modelForState().modelFile(full_block).addModel();
    }

    public void slabLayerBlock(SlabLayerBlock block) {
        slabLayerBlock(block, blockTexture(block));
    }
    
    public void slabLayerBlock(SlabLayerBlock block, ResourceLocation texture) {
        slabLayerBlock(block, texture, texture, texture, texture);
    }

    public void slabLayerBlock(SlabLayerBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom, ResourceLocation baseBlock) {
        ModelFile slab_layer_1 = models().withExistingParent(name(block) + "_layer_1", modLoc("block/templates/slab_layer_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                slab_layer_2 = models().withExistingParent(name(block) + "_layer_2", modLoc("block/templates/slab_layer_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_layer_3 = models().withExistingParent(name(block) + "_layer_3", modLoc("block/templates/slab_layer_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_layer_4 = models().withExistingParent(name(block) + "_layer_4", modLoc("block/templates/slab_layer_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_layer_5 = models().withExistingParent(name(block) + "_layer_5", modLoc("block/templates/slab_layer_5"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_layer_6 = models().withExistingParent(name(block) + "_layer_6", modLoc("block/templates/slab_layer_6"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_layer_7 = models().withExistingParent(name(block) + "_layer_7", modLoc("block/templates/slab_layer_7"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                full_block = this.models().getExistingFile(baseBlock);
                
                
        getVariantBuilder(block)
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.BOTTOM).with(SlabLayerBlock.LAYERS, 1)
                .modelForState().modelFile(slab_layer_1).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.BOTTOM).with(SlabLayerBlock.LAYERS, 2)
                .modelForState().modelFile(slab_layer_2).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.BOTTOM).with(SlabLayerBlock.LAYERS, 3)
                .modelForState().modelFile(slab_layer_3).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.BOTTOM).with(SlabLayerBlock.LAYERS, 4)
                .modelForState().modelFile(slab_layer_4).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.BOTTOM).with(SlabLayerBlock.LAYERS, 5)
                .modelForState().modelFile(slab_layer_5).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.BOTTOM).with(SlabLayerBlock.LAYERS, 6)
                .modelForState().modelFile(slab_layer_6).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.BOTTOM).with(SlabLayerBlock.LAYERS, 7)
                .modelForState().modelFile(slab_layer_7).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.BOTTOM).with(SlabLayerBlock.LAYERS, 8)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.TOP).with(SlabLayerBlock.LAYERS, 1)
                .modelForState().modelFile(slab_layer_1).rotationX(180).uvLock(true).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.TOP).with(SlabLayerBlock.LAYERS, 2)
                .modelForState().modelFile(slab_layer_2).rotationX(180).uvLock(true).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.TOP).with(SlabLayerBlock.LAYERS, 3)
                .modelForState().modelFile(slab_layer_3).rotationX(180).uvLock(true).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.TOP).with(SlabLayerBlock.LAYERS, 4)
                .modelForState().modelFile(slab_layer_4).rotationX(180).uvLock(true).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.TOP).with(SlabLayerBlock.LAYERS, 5)
                .modelForState().modelFile(slab_layer_5).rotationX(180).uvLock(true).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.TOP).with(SlabLayerBlock.LAYERS, 6)
                .modelForState().modelFile(slab_layer_6).rotationX(180).uvLock(true).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.TOP).with(SlabLayerBlock.LAYERS, 7)
                .modelForState().modelFile(slab_layer_7).rotationX(180).uvLock(true).addModel()
                .partialState().with(SlabLayerBlock.TYPE, SlabLayerShape.TOP).with(SlabLayerBlock.LAYERS, 8)
                .modelForState().modelFile(full_block).addModel();
    }

    public void slabVerticalLayerBlock(VerticalSlabLayerBlock block) {
        slabVerticalLayerBlock(block, blockTexture(block));
    }

    public void slabVerticalLayerBlock(VerticalSlabLayerBlock block, ResourceLocation texture) {
        slabVerticalLayerBlock(block, texture, texture, texture, texture);
    }

    public void slabVerticalLayerBlock(VerticalSlabLayerBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom, ResourceLocation baseBlock) {
        ModelFile slab_vertical_layer_1 = models().withExistingParent(name(block) + "_layer_1", modLoc("block/templates/slab_vertical_layer_1"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                slab_vertical_layer_2 = models().withExistingParent(name(block) + "_layer_2", modLoc("block/templates/slab_vertical_layer_2"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_vertical_layer_3 = models().withExistingParent(name(block) + "_layer_3", modLoc("block/templates/slab_vertical_layer_3"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_vertical_layer_4 = models().withExistingParent(name(block) + "_layer_4", modLoc("block/templates/slab_vertical_layer_4"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_vertical_layer_5 = models().withExistingParent(name(block) + "_layer_5", modLoc("block/templates/slab_vertical_layer_5"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_vertical_layer_6 = models().withExistingParent(name(block) + "_layer_6", modLoc("block/templates/slab_vertical_layer_6"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                slab_vertical_layer_7 = models().withExistingParent(name(block) + "_layer_7", modLoc("block/templates/slab_vertical_layer_7"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                full_block = this.models().getExistingFile(baseBlock);

        getVariantBuilder(block)
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.NORTH).with(VerticalSlabLayerBlock.LAYERS, 1)
                .modelForState().modelFile(slab_vertical_layer_1).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.NORTH).with(VerticalSlabLayerBlock.LAYERS, 2)
                .modelForState().modelFile(slab_vertical_layer_2).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.NORTH).with(VerticalSlabLayerBlock.LAYERS, 3)
                .modelForState().modelFile(slab_vertical_layer_3).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.NORTH).with(VerticalSlabLayerBlock.LAYERS, 4)
                .modelForState().modelFile(slab_vertical_layer_4).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.NORTH).with(VerticalSlabLayerBlock.LAYERS, 5)
                .modelForState().modelFile(slab_vertical_layer_5).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.NORTH).with(VerticalSlabLayerBlock.LAYERS, 6)
                .modelForState().modelFile(slab_vertical_layer_6).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.NORTH).with(VerticalSlabLayerBlock.LAYERS, 7)
                .modelForState().modelFile(slab_vertical_layer_7).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.NORTH).with(VerticalSlabLayerBlock.LAYERS, 8)
                .modelForState().modelFile(full_block).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.EAST).with(VerticalSlabLayerBlock.LAYERS, 1)
                .modelForState().modelFile(slab_vertical_layer_1).rotationY(90).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.EAST).with(VerticalSlabLayerBlock.LAYERS, 2)
                .modelForState().modelFile(slab_vertical_layer_2).rotationY(90).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.EAST).with(VerticalSlabLayerBlock.LAYERS, 3)
                .modelForState().modelFile(slab_vertical_layer_3).rotationY(90).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.EAST).with(VerticalSlabLayerBlock.LAYERS, 4)
                .modelForState().modelFile(slab_vertical_layer_4).rotationY(90).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.EAST).with(VerticalSlabLayerBlock.LAYERS, 5)
                .modelForState().modelFile(slab_vertical_layer_5).rotationY(90).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.EAST).with(VerticalSlabLayerBlock.LAYERS, 6)
                .modelForState().modelFile(slab_vertical_layer_6).rotationY(90).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.EAST).with(VerticalSlabLayerBlock.LAYERS, 7)
                .modelForState().modelFile(slab_vertical_layer_7).rotationY(90).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.EAST).with(VerticalSlabLayerBlock.LAYERS, 8)
                .modelForState().modelFile(full_block).rotationY(90).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.SOUTH).with(VerticalSlabLayerBlock.LAYERS, 1)
                .modelForState().modelFile(slab_vertical_layer_1).rotationY(180).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.SOUTH).with(VerticalSlabLayerBlock.LAYERS, 2)
                .modelForState().modelFile(slab_vertical_layer_2).rotationY(180).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.SOUTH).with(VerticalSlabLayerBlock.LAYERS, 3)
                .modelForState().modelFile(slab_vertical_layer_3).rotationY(180).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.SOUTH).with(VerticalSlabLayerBlock.LAYERS, 4)
                .modelForState().modelFile(slab_vertical_layer_4).rotationY(180).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.SOUTH).with(VerticalSlabLayerBlock.LAYERS, 5)
                .modelForState().modelFile(slab_vertical_layer_5).rotationY(180).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.SOUTH).with(VerticalSlabLayerBlock.LAYERS, 6)
                .modelForState().modelFile(slab_vertical_layer_6).rotationY(180).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.SOUTH).with(VerticalSlabLayerBlock.LAYERS, 7)
                .modelForState().modelFile(slab_vertical_layer_7).rotationY(180).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.SOUTH).with(VerticalSlabLayerBlock.LAYERS, 8)
                .modelForState().modelFile(full_block).rotationY(180).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.WEST).with(VerticalSlabLayerBlock.LAYERS, 1)
                .modelForState().modelFile(slab_vertical_layer_1).rotationY(270).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.WEST).with(VerticalSlabLayerBlock.LAYERS, 2)
                .modelForState().modelFile(slab_vertical_layer_2).rotationY(270).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.WEST).with(VerticalSlabLayerBlock.LAYERS, 3)
                .modelForState().modelFile(slab_vertical_layer_3).rotationY(270).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.WEST).with(VerticalSlabLayerBlock.LAYERS, 4)
                .modelForState().modelFile(slab_vertical_layer_4).rotationY(270).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.WEST).with(VerticalSlabLayerBlock.LAYERS, 5)
                .modelForState().modelFile(slab_vertical_layer_5).rotationY(270).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.WEST).with(VerticalSlabLayerBlock.LAYERS, 6)
                .modelForState().modelFile(slab_vertical_layer_6).rotationY(270).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.WEST).with(VerticalSlabLayerBlock.LAYERS, 7)
                .modelForState().modelFile(slab_vertical_layer_7).rotationY(270).uvLock(true).addModel()
                .partialState().with(VerticalSlabLayerBlock.FACING, Direction.WEST).with(VerticalSlabLayerBlock.LAYERS, 8)
                .modelForState().modelFile(full_block).addModel();
    }

    public void windowBlock(WindowBlock block) {
        windowBlock(block, blockTexture(block));
    }

    public void windowBlock(WindowBlock block, ResourceLocation texture) {
        windowBlock(block, texture, texture, texture);
    }

    public void windowBlock(WindowBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile window = models().withExistingParent(name(block), modLoc("block/templates/window"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                window_top = models().withExistingParent(name(block) + "_top", modLoc("block/templates/window_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                window_middle = models().withExistingParent(name(block) + "_middle", modLoc("block/templates/window_middle"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                window_bottom = models().withExistingParent(name(block) + "_bottom", modLoc("block/templates/window_bottom"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(WindowBlock.FACING, Direction.NORTH).with(WindowBlock.TYPE, WindowShape.TOP)
                .modelForState().modelFile(window_top).addModel()
                .partialState().with(WindowBlock.FACING, Direction.NORTH).with(WindowBlock.TYPE, WindowShape.MIDDLE)
                .modelForState().modelFile(window_middle).addModel()
                .partialState().with(WindowBlock.FACING, Direction.NORTH).with(WindowBlock.TYPE, WindowShape.BOTTOM)
                .modelForState().modelFile(window_bottom).addModel()
                .partialState().with(WindowBlock.FACING, Direction.NORTH).with(WindowBlock.TYPE, WindowShape.FULL_BLOCK)
                .modelForState().modelFile(window).addModel()
                .partialState().with(WindowBlock.FACING, Direction.EAST).with(WindowBlock.TYPE, WindowShape.TOP)
                .modelForState().modelFile(window_top).rotationY(90).addModel()
                .partialState().with(WindowBlock.FACING, Direction.EAST).with(WindowBlock.TYPE, WindowShape.MIDDLE)
                .modelForState().modelFile(window_middle).rotationY(90).addModel()
                .partialState().with(WindowBlock.FACING, Direction.EAST).with(WindowBlock.TYPE, WindowShape.BOTTOM)
                .modelForState().modelFile(window_bottom).rotationY(90).addModel()
                .partialState().with(WindowBlock.FACING, Direction.EAST).with(WindowBlock.TYPE, WindowShape.FULL_BLOCK)
                .modelForState().modelFile(window).rotationY(90).addModel()
                .partialState().with(WindowBlock.FACING, Direction.SOUTH).with(WindowBlock.TYPE, WindowShape.TOP)
                .modelForState().modelFile(window_top).rotationY(180).addModel()
                .partialState().with(WindowBlock.FACING, Direction.SOUTH).with(WindowBlock.TYPE, WindowShape.MIDDLE)
                .modelForState().modelFile(window_middle).rotationY(180).addModel()
                .partialState().with(WindowBlock.FACING, Direction.SOUTH).with(WindowBlock.TYPE, WindowShape.BOTTOM)
                .modelForState().modelFile(window_bottom).rotationY(180).addModel()
                .partialState().with(WindowBlock.FACING, Direction.SOUTH).with(WindowBlock.TYPE, WindowShape.FULL_BLOCK)
                .modelForState().modelFile(window).rotationY(180).addModel()
                .partialState().with(WindowBlock.FACING, Direction.WEST).with(WindowBlock.TYPE, WindowShape.TOP)
                .modelForState().modelFile(window_top).rotationY(270).addModel()
                .partialState().with(WindowBlock.FACING, Direction.WEST).with(WindowBlock.TYPE, WindowShape.MIDDLE)
                .modelForState().modelFile(window_middle).rotationY(270).addModel()
                .partialState().with(WindowBlock.FACING, Direction.WEST).with(WindowBlock.TYPE, WindowShape.BOTTOM)
                .modelForState().modelFile(window_bottom).rotationY(270).addModel()
                .partialState().with(WindowBlock.FACING, Direction.WEST).with(WindowBlock.TYPE, WindowShape.FULL_BLOCK)
                .modelForState().modelFile(window).rotationY(270).addModel();
    }

    public void windowHalfBlock(HalfWindowBlock block) {
        windowHalfBlock(block, blockTexture(block));
    }

    public void windowHalfBlock(HalfWindowBlock block, ResourceLocation texture) {
        windowHalfBlock(block, texture, texture, texture);
    }

    public void windowHalfBlock(HalfWindowBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile window_half = models().withExistingParent(name(block), modLoc("block/templates/window_half"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                window_half_top = models().withExistingParent(name(block) + "_trim", modLoc("block/templates/window_half_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                window_half_middle = models().withExistingParent(name(block) + "_trim2", modLoc("block/templates/window_half_middle"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                window_half_bottom = models().withExistingParent(name(block) + "_cross", modLoc("block/templates/window_half_bottom"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(HalfWindowBlock.FACING, Direction.NORTH).with(HalfWindowBlock.TYPE, WindowShape.TOP)
                .modelForState().modelFile(window_half_top).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.NORTH).with(HalfWindowBlock.TYPE, WindowShape.MIDDLE)
                .modelForState().modelFile(window_half_middle).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.NORTH).with(HalfWindowBlock.TYPE, WindowShape.BOTTOM)
                .modelForState().modelFile(window_half_bottom).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.NORTH).with(HalfWindowBlock.TYPE, WindowShape.FULL_BLOCK)
                .modelForState().modelFile(window_half).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.EAST).with(HalfWindowBlock.TYPE, WindowShape.TOP)
                .modelForState().modelFile(window_half_top).rotationY(90).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.EAST).with(HalfWindowBlock.TYPE, WindowShape.MIDDLE)
                .modelForState().modelFile(window_half_middle).rotationY(90).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.EAST).with(HalfWindowBlock.TYPE, WindowShape.BOTTOM)
                .modelForState().modelFile(window_half_bottom).rotationY(90).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.EAST).with(HalfWindowBlock.TYPE, WindowShape.FULL_BLOCK)
                .modelForState().modelFile(window_half).rotationY(90).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.SOUTH).with(HalfWindowBlock.TYPE, WindowShape.TOP)
                .modelForState().modelFile(window_half_top).rotationY(180).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.SOUTH).with(HalfWindowBlock.TYPE, WindowShape.MIDDLE)
                .modelForState().modelFile(window_half_middle).rotationY(180).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.SOUTH).with(HalfWindowBlock.TYPE, WindowShape.BOTTOM)
                .modelForState().modelFile(window_half_bottom).rotationY(180).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.SOUTH).with(HalfWindowBlock.TYPE, WindowShape.FULL_BLOCK)
                .modelForState().modelFile(window_half).rotationY(180).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.WEST).with(HalfWindowBlock.TYPE, WindowShape.TOP)
                .modelForState().modelFile(window_half_top).rotationY(270).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.WEST).with(HalfWindowBlock.TYPE, WindowShape.MIDDLE)
                .modelForState().modelFile(window_half_middle).rotationY(270).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.WEST).with(HalfWindowBlock.TYPE, WindowShape.BOTTOM)
                .modelForState().modelFile(window_half_bottom).rotationY(270).addModel()
                .partialState().with(HalfWindowBlock.FACING, Direction.WEST).with(HalfWindowBlock.TYPE, WindowShape.FULL_BLOCK)
                .modelForState().modelFile(window_half).rotationY(270).addModel();
    }

    public void roof22Block(Roof22Block block) {
        roof22Block(block, blockTexture(block));
    }
    
    public void roof22Block(Roof22Block block, ResourceLocation texture) {
        roof22Block(block, texture, texture, texture);
    }
    
    public void roof22Block(Roof22Block block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile roof_22 = models().withExistingParent(name(block), modLoc("block/templates/roof_22"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                roof_22_outer = models().withExistingParent(name(block) + "_outer", modLoc("block/templates/roof_22_outer"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_22_inner = models().withExistingParent(name(block) + "_inner", modLoc("block/templates/roof_22_inner"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_22_top = models().withExistingParent(name(block) + "_top", modLoc("block/templates/roof_22_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_22_top_outer = models().withExistingParent(name(block) + "_top_outer", modLoc("block/templates/roof_22_top_outer"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_22_top_inner = models().withExistingParent(name(block) + "_top_inner", modLoc("block/templates/roof_22_top_inner"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.STRAIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.OUTER_LEFT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_outer).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_outer).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.INNER_LEFT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_inner).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.INNER_RIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_inner).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.STRAIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.OUTER_LEFT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_outer).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_outer).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.INNER_LEFT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_inner).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.NORTH).with(Roof22Block.TYPE, RoofShape.INNER_RIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_inner).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.STRAIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.OUTER_LEFT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_outer).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_outer).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.INNER_LEFT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_inner).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.INNER_RIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_inner).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.STRAIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.OUTER_LEFT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_outer).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_outer).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.INNER_LEFT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_inner).rotationY(270).addModel()
                .partialState().with(Roof22Block.FACING, Direction.EAST).with(Roof22Block.TYPE, RoofShape.INNER_RIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_inner).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.STRAIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.OUTER_LEFT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_outer).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_outer).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.INNER_LEFT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_inner).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.INNER_RIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_inner).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.STRAIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.OUTER_LEFT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_outer).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_outer).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.INNER_LEFT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_inner).addModel()
                .partialState().with(Roof22Block.FACING, Direction.SOUTH).with(Roof22Block.TYPE, RoofShape.INNER_RIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_inner).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.STRAIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.OUTER_LEFT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_outer).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_outer).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.INNER_LEFT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_inner).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.INNER_RIGHT).with(Roof22Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_22_top_inner).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.STRAIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.OUTER_LEFT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_outer).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_outer).rotationY(180).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.INNER_LEFT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_inner).rotationY(90).addModel()
                .partialState().with(Roof22Block.FACING, Direction.WEST).with(Roof22Block.TYPE, RoofShape.INNER_RIGHT).with(Roof22Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_22_inner).rotationY(180).addModel();
    }



    public void roof45Block(Roof45Block block) {
        roof45Block(block, blockTexture(block));
    }

    public void roof45Block(Roof45Block block, ResourceLocation texture) {
        roof45Block(block, texture, texture, texture);
    }

    public void roof45Block(Roof45Block block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile roof_45 = models().withExistingParent(name(block), modLoc("block/templates/roof_45"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                roof_45_outer = models().withExistingParent(name(block) + "_outer", modLoc("block/templates/roof_45_outer"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_45_inner = models().withExistingParent(name(block) + "_inner", modLoc("block/templates/roof_45_inner"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(Roof45Block.FACING, Direction.NORTH).with(Roof45Block.TYPE, RoofShape.STRAIGHT)
                .modelForState().modelFile(roof_45).rotationY(270).addModel()
                .partialState().with(Roof45Block.FACING, Direction.NORTH).with(Roof45Block.TYPE, RoofShape.OUTER_LEFT)
                .modelForState().modelFile(roof_45_outer).rotationY(180).addModel()
                .partialState().with(Roof45Block.FACING, Direction.NORTH).with(Roof45Block.TYPE, RoofShape.OUTER_RIGHT)
                .modelForState().modelFile(roof_45_outer).rotationY(270).addModel()
                .partialState().with(Roof45Block.FACING, Direction.NORTH).with(Roof45Block.TYPE, RoofShape.INNER_LEFT)
                .modelForState().modelFile(roof_45_inner).rotationY(180).addModel()
                .partialState().with(Roof45Block.FACING, Direction.NORTH).with(Roof45Block.TYPE, RoofShape.INNER_RIGHT)
                .modelForState().modelFile(roof_45_inner).rotationY(270).addModel()
                .partialState().with(Roof45Block.FACING, Direction.EAST).with(Roof45Block.TYPE, RoofShape.STRAIGHT)
                .modelForState().modelFile(roof_45).addModel()
                .partialState().with(Roof45Block.FACING, Direction.EAST).with(Roof45Block.TYPE, RoofShape.OUTER_LEFT)
                .modelForState().modelFile(roof_45_outer).rotationY(270).addModel()
                .partialState().with(Roof45Block.FACING, Direction.EAST).with(Roof45Block.TYPE, RoofShape.OUTER_RIGHT)
                .modelForState().modelFile(roof_45_outer).addModel()
                .partialState().with(Roof45Block.FACING, Direction.EAST).with(Roof45Block.TYPE, RoofShape.INNER_LEFT)
                .modelForState().modelFile(roof_45_inner).rotationY(270).addModel()
                .partialState().with(Roof45Block.FACING, Direction.EAST).with(Roof45Block.TYPE, RoofShape.INNER_RIGHT)
                .modelForState().modelFile(roof_45_inner).addModel()
                .partialState().with(Roof45Block.FACING, Direction.SOUTH).with(Roof45Block.TYPE, RoofShape.STRAIGHT)
                .modelForState().modelFile(roof_45).rotationY(90).addModel()
                .partialState().with(Roof45Block.FACING, Direction.SOUTH).with(Roof45Block.TYPE, RoofShape.OUTER_LEFT)
                .modelForState().modelFile(roof_45_outer).addModel()
                .partialState().with(Roof45Block.FACING, Direction.SOUTH).with(Roof45Block.TYPE, RoofShape.OUTER_RIGHT)
                .modelForState().modelFile(roof_45_outer).rotationY(90).addModel()
                .partialState().with(Roof45Block.FACING, Direction.SOUTH).with(Roof45Block.TYPE, RoofShape.INNER_LEFT)
                .modelForState().modelFile(roof_45_inner).addModel()
                .partialState().with(Roof45Block.FACING, Direction.SOUTH).with(Roof45Block.TYPE, RoofShape.INNER_RIGHT)
                .modelForState().modelFile(roof_45_inner).rotationY(90).addModel()
                .partialState().with(Roof45Block.FACING, Direction.WEST).with(Roof45Block.TYPE, RoofShape.STRAIGHT)
                .modelForState().modelFile(roof_45).rotationY(180).addModel()
                .partialState().with(Roof45Block.FACING, Direction.WEST).with(Roof45Block.TYPE, RoofShape.OUTER_LEFT)
                .modelForState().modelFile(roof_45_outer).rotationY(90).addModel()
                .partialState().with(Roof45Block.FACING, Direction.WEST).with(Roof45Block.TYPE, RoofShape.OUTER_RIGHT)
                .modelForState().modelFile(roof_45_outer).rotationY(180).addModel()
                .partialState().with(Roof45Block.FACING, Direction.WEST).with(Roof45Block.TYPE, RoofShape.INNER_LEFT)
                .modelForState().modelFile(roof_45_inner).rotationY(90).addModel()
                .partialState().with(Roof45Block.FACING, Direction.WEST).with(Roof45Block.TYPE, RoofShape.INNER_RIGHT)
                .modelForState().modelFile(roof_45_inner).rotationY(180).addModel();
    }

    public void roof67Block(Roof67Block block) {
        roof67Block(block, blockTexture(block));
    }

    public void roof67Block(Roof67Block block, ResourceLocation texture) {
        roof67Block(block, texture, texture, texture);
    }

    public void roof67Block(Roof67Block block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile roof_67 = models().withExistingParent(name(block), modLoc("block/templates/roof_67"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                roof_67_outer = models().withExistingParent(name(block) + "_outer", modLoc("block/templates/roof_67_outer"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_67_inner = models().withExistingParent(name(block) + "_inner", modLoc("block/templates/roof_67_inner"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_67_top = models().withExistingParent(name(block) + "_top", modLoc("block/templates/roof_67_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_67_top_outer = models().withExistingParent(name(block) + "_top_outer", modLoc("block/templates/roof_67_top_outer"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_67_top_inner = models().withExistingParent(name(block) + "_top_inner", modLoc("block/templates/roof_67_top_inner"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_67_inventory = models().withExistingParent(name(block) + "_inventory", modLoc("block/templates/inv/roof_67_top_inventory"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.STRAIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.OUTER_LEFT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_outer).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_outer).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.INNER_LEFT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_inner).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.INNER_RIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_inner).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.STRAIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.OUTER_LEFT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_outer).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_outer).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.INNER_LEFT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_inner).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.NORTH).with(Roof67Block.TYPE, RoofShape.INNER_RIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_inner).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.STRAIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.OUTER_LEFT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_outer).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_outer).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.INNER_LEFT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_inner).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.INNER_RIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_inner).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.STRAIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.OUTER_LEFT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_outer).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_outer).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.INNER_LEFT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_inner).rotationY(270).addModel()
                .partialState().with(Roof67Block.FACING, Direction.EAST).with(Roof67Block.TYPE, RoofShape.INNER_RIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_inner).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.STRAIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.OUTER_LEFT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_outer).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_outer).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.INNER_LEFT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_inner).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.INNER_RIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_inner).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.STRAIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.OUTER_LEFT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_outer).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_outer).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.INNER_LEFT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_inner).addModel()
                .partialState().with(Roof67Block.FACING, Direction.SOUTH).with(Roof67Block.TYPE, RoofShape.INNER_RIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_inner).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.STRAIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.OUTER_LEFT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_outer).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_outer).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.INNER_LEFT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_inner).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.INNER_RIGHT).with(Roof67Block.HALF, Half.TOP)
                .modelForState().modelFile(roof_67_top_inner).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.STRAIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.OUTER_LEFT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_outer).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.OUTER_RIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_outer).rotationY(180).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.INNER_LEFT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_inner).rotationY(90).addModel()
                .partialState().with(Roof67Block.FACING, Direction.WEST).with(Roof67Block.TYPE, RoofShape.INNER_RIGHT).with(Roof67Block.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_67_inner).rotationY(180).addModel();
    }

    public void roofPeakBlock(RoofPeakBlock block) {
        roofPeakBlock(block, blockTexture(block));
    }

    public void roofPeakBlock(RoofPeakBlock block, ResourceLocation texture) {
        roofPeakBlock(block, texture, texture, texture);
    }

    public void roofPeakBlock(RoofPeakBlock block, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        ModelFile roof_peak = models().withExistingParent(name(block), modLoc("block/templates/roof_peak"))
                .texture("side", side)
                .texture("top", top)
                .texture("bottom", bottom),
                roof_peak_cap= models().withExistingParent(name(block) + "_cap", modLoc("block/templates/roof_peak_cap"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_cross = models().withExistingParent(name(block) + "_cross", modLoc("block/templates/roof_peak_cross"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_corner = models().withExistingParent(name(block) + "_corner", modLoc("block/templates/roof_peak_corner"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_t = models().withExistingParent(name(block) + "_t", modLoc("block/templates/roof_peak_t"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_end = models().withExistingParent(name(block) + "_end", modLoc("block/templates/roof_peak_end"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_top = models().withExistingParent(name(block) + "_top", modLoc("block/templates/roof_peak_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_top_cap = models().withExistingParent(name(block) + "_cap_top", modLoc("block/templates/roof_peak_cap_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_top_cross = models().withExistingParent(name(block) + "_cross_top", modLoc("block/templates/roof_peak_cross_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_top_corner = models().withExistingParent(name(block) + "_corner_top", modLoc("block/templates/roof_peak_corner_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_top_t = models().withExistingParent(name(block) + "_top_t", modLoc("block/templates/roof_peak_t_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom),
                roof_peak_end_top = models().withExistingParent(name(block) + "_end_top", modLoc("block/templates/roof_peak_end_top"))
                        .texture("side", side)
                        .texture("top", top)
                        .texture("bottom", bottom);

        getVariantBuilder(block)
                .partialState().with(RoofPeakBlock.TYPE, RoofPeakShape.CAP).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_cap).addModel()
                .partialState().with(RoofPeakBlock.TYPE, RoofPeakShape.CAP).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_cap).addModel()
                .partialState().with(RoofPeakBlock.TYPE, RoofPeakShape.CROSS).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_cross).addModel()
                .partialState().with(RoofPeakBlock.TYPE, RoofPeakShape.CROSS).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_cross).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.STRAIGHT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.STRAIGHT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_LEFT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_corner).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_LEFT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_corner).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_RIGHT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_corner).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_RIGHT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_corner).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.LEFT_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.LEFT_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.RIGHT_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.RIGHT_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.FACING_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_top_t).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.FACING_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_t).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.OPPOSITE_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_top_t).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.OPPOSITE_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_t).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.END_FACING).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_end).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.END_FACING).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_end_top).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.END_OPPOSITE).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_end).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.NORTH).with(RoofPeakBlock.TYPE, RoofPeakShape.END_OPPOSITE).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_end_top).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.STRAIGHT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.STRAIGHT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_LEFT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_corner).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_LEFT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_corner).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_RIGHT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_corner).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_RIGHT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_corner).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.LEFT_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.LEFT_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.RIGHT_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.RIGHT_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.FACING_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.FACING_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.OPPOSITE_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.OPPOSITE_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.END_FACING).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_end).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.END_FACING).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_end_top).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.END_OPPOSITE).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_end).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.EAST).with(RoofPeakBlock.TYPE, RoofPeakShape.END_OPPOSITE).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_end_top).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.STRAIGHT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.STRAIGHT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_LEFT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_corner).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_LEFT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_corner).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_RIGHT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_corner).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_RIGHT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_corner).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.LEFT_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.LEFT_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.RIGHT_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.RIGHT_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.FACING_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.FACING_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.OPPOSITE_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.OPPOSITE_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.END_FACING).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_end).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.END_FACING).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_end_top).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.END_OPPOSITE).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_end).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.SOUTH).with(RoofPeakBlock.TYPE, RoofPeakShape.END_OPPOSITE).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_end_top).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.STRAIGHT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.STRAIGHT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_LEFT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_corner).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_LEFT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_corner).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_RIGHT).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_corner).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.CORNER_RIGHT).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_corner).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.LEFT_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.LEFT_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.RIGHT_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.RIGHT_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(180).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.FACING_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.FACING_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.OPPOSITE_T).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_t).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.OPPOSITE_T).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_top_t).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.END_FACING).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_end).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.END_FACING).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_end_top).rotationY(270).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.END_OPPOSITE).with(RoofPeakBlock.HALF, Half.BOTTOM)
                .modelForState().modelFile(roof_peak_end).rotationY(90).addModel()
                .partialState().with(RoofPeakBlock.FACING, Direction.WEST).with(RoofPeakBlock.TYPE, RoofPeakShape.END_OPPOSITE).with(RoofPeakBlock.HALF, Half.TOP)
                .modelForState().modelFile(roof_peak_end_top).rotationY(90).addModel();
    }

    /* no need anymore, because BlockManager right now stateGenerator field
    private void tudorBlocks() {
        ImmutableMap.Builder<List<BlockManager>, Block> map = ImmutableMap.builder();
        // Beige, Brown, Ochre, Tan, White Plasters - Half-Timbered
        map.put(Lists.newArrayList(ModBlocks.TUDOR_ACACIA_BEIGE_PLASTER, ModBlocks.TUDOR_ACACIA_BROWN_PLASTER, ModBlocks.TUDOR_ACACIA_OCHRE_PLASTER, ModBlocks.TUDOR_ACACIA_TAN_PLASTER, ModBlocks.TUDOR_ACACIA_WHITE_PLASTER), Blocks.ACACIA_PLANKS);
        map.put(Lists.newArrayList(ModBlocks.TUDOR_BIRCH_BEIGE_PLASTER, ModBlocks.TUDOR_BIRCH_BROWN_PLASTER, ModBlocks.TUDOR_BIRCH_OCHRE_PLASTER, ModBlocks.TUDOR_BIRCH_TAN_PLASTER, ModBlocks.TUDOR_BIRCH_WHITE_PLASTER), Blocks.BIRCH_PLANKS);
        map.put(Lists.newArrayList(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER, ModBlocks.TUDOR_DARK_OAK_BROWN_PLASTER, ModBlocks.TUDOR_DARK_OAK_OCHRE_PLASTER, ModBlocks.TUDOR_DARK_OAK_TAN_PLASTER, ModBlocks.TUDOR_DARK_OAK_WHITE_PLASTER), Blocks.DARK_OAK_PLANKS);
        map.put(Lists.newArrayList(ModBlocks.TUDOR_JUNGLE_BEIGE_PLASTER, ModBlocks.TUDOR_JUNGLE_BROWN_PLASTER, ModBlocks.TUDOR_JUNGLE_OCHRE_PLASTER, ModBlocks.TUDOR_JUNGLE_TAN_PLASTER, ModBlocks.TUDOR_JUNGLE_WHITE_PLASTER), Blocks.JUNGLE_PLANKS);
        map.put(Lists.newArrayList(ModBlocks.TUDOR_OAK_BEIGE_PLASTER, ModBlocks.TUDOR_OAK_BROWN_PLASTER, ModBlocks.TUDOR_OAK_OCHRE_PLASTER, ModBlocks.TUDOR_OAK_TAN_PLASTER, ModBlocks.TUDOR_OAK_WHITE_PLASTER), Blocks.OAK_PLANKS);
        map.put(Lists.newArrayList(ModBlocks.TUDOR_SPRUCE_BEIGE_PLASTER, ModBlocks.TUDOR_SPRUCE_BROWN_PLASTER, ModBlocks.TUDOR_SPRUCE_OCHRE_PLASTER, ModBlocks.TUDOR_SPRUCE_TAN_PLASTER, ModBlocks.TUDOR_SPRUCE_WHITE_PLASTER), Blocks.SPRUCE_PLANKS);


        //Creates a simple block using the above data, can be replaced with a similar option like in ModItemModelProvider
        map.build().forEach((l, b) -> {
            for (BlockManager blockManager : l) {
                for (RegistryObject<Block> e : blockManager.getBlocks().values()) {
                    simpleBlock(e.get(), models().cubeBottomTop(e.getId().getPath(), modLoc("block/%s".formatted(e.getId().getPath())), blockTexture(b), blockTexture(b)));
                }
            }
        });
    }*/
}
