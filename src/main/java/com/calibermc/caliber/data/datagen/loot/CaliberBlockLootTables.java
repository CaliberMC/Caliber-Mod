package com.calibermc.caliber.data.datagen.loot;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliberlib.block.shapes.doors.TallDoorPart;
import com.calibermc.caliber.item.ModItems;
import com.calibermc.caliberlib.data.datagen.loot.ModBlockLootTables;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.registries.RegistryObject;

public class CaliberBlockLootTables extends ModBlockLootTables {
    public CaliberBlockLootTables() {
        super(Caliber.MOD_ID);
    }

    @Override
    protected void generate() {
        craftingTables();
        metalsAndOres();
        terrainBlocks();
        plasterBlocks();
        plankBlocks();
        stainedPlanks();
        super.generate();
    }

    private void craftingTables() {
        this.dropSelf(ModBlocks.KILN.get());
        this.dropSelf(ModBlocks.WOODCUTTER.get());
    }

    private void metalsAndOres() {
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());

        add(ModBlocks.TIN_ORE.get(), (Block) ->
                createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        add(ModBlocks.DEEPSLATE_TIN_ORE.get(), (Block) ->
                createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());

        add(ModBlocks.SILVER_ORE.get(), (Block) ->
                createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        add(ModBlocks.DEEPSLATE_SILVER_ORE.get(), (Block) ->
                createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
    }

    private void terrainBlocks() {
        this.dropSelf(ModBlocks.BLACK_SAND.get());
        this.dropSelf(ModBlocks.BROWN_SAND.get());
        this.dropSelf(ModBlocks.ORANGE_SAND.get());
        this.dropSelf(ModBlocks.WHITE_SAND.get());
        this.dropSelf(ModBlocks.BLACK_SAND_LAYER.get());
        this.dropSelf(ModBlocks.BROWN_SAND_LAYER.get());
        this.dropSelf(ModBlocks.ORANGE_SAND_LAYER.get());
        this.dropSelf(ModBlocks.RED_SAND_LAYER.get());
        this.dropSelf(ModBlocks.SAND_LAYER.get());
        this.dropSelf(ModBlocks.SOUL_SAND_LAYER.get());
        this.dropSelf(ModBlocks.WHITE_SAND_LAYER.get());

        this.dropSelf(ModBlocks.CLAY_LAYER.get());
        this.dropSelf(ModBlocks.COARSE_DIRT_LAYER.get());
        this.dropSelf(ModBlocks.DIRT_LAYER.get());
//        this.dropSelf(ModBlocks.FARMLAND_LAYER.get());
        this.dropSelf(ModBlocks.GRAVEL_LAYER.get());
        this.dropSelf(ModBlocks.GRASS_LAYER.get());
        this.dropSelf(ModBlocks.MYCELIUM_LAYER.get());
        this.dropSelf(ModBlocks.PODZOL_LAYER.get());
        this.dropSelf(ModBlocks.ROOTED_DIRT_LAYER.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_LAYER.get());
        this.dropSelf(ModBlocks.CRIMSON_NYLIUM_LAYER.get());
        this.dropSelf(ModBlocks.WARPED_NYLIUM_LAYER.get());
    }

    private void plasterBlocks() {
        this.dropSelf(ModBlocks.BEIGE_PLASTER_POWDER.get());
        this.dropSelf(ModBlocks.BROWN_PLASTER_POWDER.get());
        this.dropSelf(ModBlocks.OCHRE_PLASTER_POWDER.get());
        this.dropSelf(ModBlocks.TAN_PLASTER_POWDER.get());
        this.dropSelf(ModBlocks.WHITE_PLASTER_POWDER.get());
    }

    public void plankBlocks() {
        this.add(ModBlocks.TALL_ACACIA_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_BIRCH_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_DARK_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_JUNGLE_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_SPRUCE_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_CRIMSON_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_CRIMSON_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_WARPED_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_WARPED_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        createSinglePropConditionTable(ModBlocks.TALL_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_CRIMSON_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_WARPED_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);

//        this.dropSelf(ModBlocks.TALL_ACACIA_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_BIRCH_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_DARK_OAK_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_JUNGLE_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_OAK_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_SPRUCE_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_CRIMSON_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_WARPED_DOOR.get());
    }


    private void stainedPlanks() {
        this.dropSelf(ModBlocks.STAINED_ACACIA_BUTTON.get());
//        this.dropSelf(ModBlocks.STAINED_ACACIA_DOOR.get());
        this.dropSelf(ModBlocks.STAINED_ACACIA_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_ACACIA_TRAPDOOR.get());
        this.dropSelf(ModBlocks.STAINED_ACACIA_WALL_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_BIRCH_BUTTON.get());
//        this.dropSelf(ModBlocks.STAINED_BIRCH_DOOR.get());
        this.dropSelf(ModBlocks.STAINED_BIRCH_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_BIRCH_TRAPDOOR.get());
        this.dropSelf(ModBlocks.STAINED_BIRCH_WALL_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_DARK_OAK_BUTTON.get());
//        this.dropSelf(ModBlocks.STAINED_DARK_OAK_DOOR.get());
        this.dropSelf(ModBlocks.STAINED_DARK_OAK_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_DARK_OAK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.STAINED_DARK_OAK_WALL_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_JUNGLE_BUTTON.get());
//        this.dropSelf(ModBlocks.STAINED_JUNGLE_DOOR.get());
        this.dropSelf(ModBlocks.STAINED_JUNGLE_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_JUNGLE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.STAINED_JUNGLE_WALL_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_OAK_BUTTON.get());
//        this.dropSelf(ModBlocks.STAINED_OAK_DOOR.get());
        this.dropSelf(ModBlocks.STAINED_OAK_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_OAK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.STAINED_OAK_WALL_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_SPRUCE_BUTTON.get());
//        this.dropSelf(ModBlocks.STAINED_SPRUCE_DOOR.get());
        this.dropSelf(ModBlocks.STAINED_SPRUCE_SIGN.get());
        this.dropSelf(ModBlocks.STAINED_SPRUCE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.STAINED_SPRUCE_WALL_SIGN.get());
//        createSinglePropConditionTable(ModBlocks.STAINED_ACACIA_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(ModBlocks.STAINED_BIRCH_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(ModBlocks.STAINED_DARK_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(ModBlocks.STAINED_JUNGLE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(ModBlocks.STAINED_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(ModBlocks.STAINED_SPRUCE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
        this.add(ModBlocks.STAINED_ACACIA_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.STAINED_ACACIA_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.STAINED_BIRCH_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_STAINED_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.STAINED_DARK_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.STAINED_DARK_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.STAINED_JUNGLE_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.STAINED_JUNGLE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.STAINED_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.STAINED_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.STAINED_SPRUCE_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.STAINED_SPRUCE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));

        this.add(ModBlocks.TALL_STAINED_ACACIA_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_STAINED_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_STAINED_BIRCH_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_STAINED_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_STAINED_JUNGLE_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_STAINED_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_STAINED_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_STAINED_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(ModBlocks.TALL_STAINED_SPRUCE_DOOR.get(), (block) ->
                createSinglePropConditionTable(ModBlocks.TALL_STAINED_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));

//        createSinglePropConditionTable(ModBlocks.STAINED_ACACIA_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(ModBlocks.TALL_STAINED_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_STAINED_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_STAINED_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(ModBlocks.TALL_STAINED_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        this.dropSelf(ModBlocks.TALL_STAINED_ACACIA_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_STAINED_BIRCH_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_STAINED_DARK_OAK_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_STAINED_JUNGLE_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_STAINED_OAK_DOOR.get());
//        this.dropSelf(ModBlocks.TALL_STAINED_SPRUCE_DOOR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}