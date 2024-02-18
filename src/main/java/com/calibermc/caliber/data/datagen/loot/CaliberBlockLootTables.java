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
//        this.add(CaliberBlocks.ACACIA_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.ACACIA_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.BAMBOO_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.BAMBOO_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.BIRCH_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.BIRCH_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.CHERRY_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.CHERRY_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.DARK_OAK_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.DARK_OAK_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.JUNGLE_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.JUNGLE_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.MANGROVE_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.MANGROVE_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.OAK_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.OAK_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.SPRUCE_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.SPRUCE_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.CRIMSON_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.CRIMSON_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(CaliberBlocks.WARPED_TALL_DOOR.baseBlock(), (block) -> createSinglePropConditionTable(CaliberBlocks.WARPED_TALL_DOOR.baseBlock(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.ACACIA_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.ACACIA_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.BAMBOO_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.BAMBOO_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.BIRCH_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.BIRCH_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.CHERRY_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.CHERRY_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.DARK_OAK_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.DARK_OAK_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.JUNGLE_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.JUNGLE_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.MANGROVE_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.MANGROVE_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.OAK_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.OAK_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.SPRUCE_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.SPRUCE_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.CRIMSON_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.CRIMSON_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.WARPED_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(CaliberBlocks.WARPED_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CaliberBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}