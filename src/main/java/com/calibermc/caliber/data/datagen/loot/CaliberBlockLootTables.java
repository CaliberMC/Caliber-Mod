package com.calibermc.caliber.data.datagen.loot;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliberlib.block.shapes.doors.TallDoorPart;
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
        plankBlocks();
        super.generate();
    }

    private void craftingTables() {
        this.dropSelf(CaliberBlocks.WOODCUTTER.get());
    }

    public void plankBlocks() {
        this.add(CaliberBlocks.TALL_ACACIA_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_BIRCH_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_DARK_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_JUNGLE_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_SPRUCE_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_CRIMSON_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_CRIMSON_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_WARPED_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_WARPED_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        createSinglePropConditionTable(CaliberBlocks.TALL_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_CRIMSON_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_WARPED_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);

//        this.dropSelf(CaliberBlocks.TALL_ACACIA_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_BIRCH_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_DARK_OAK_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_JUNGLE_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_OAK_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_SPRUCE_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_CRIMSON_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_WARPED_DOOR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CaliberBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}