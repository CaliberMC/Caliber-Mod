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
        plankBlocks();
        stainedPlanks();
        super.generate();
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


    private void stainedPlanks() {
        this.dropSelf(CaliberBlocks.STAINED_ACACIA_BUTTON.get());
//        this.dropSelf(CaliberBlocks.STAINED_ACACIA_DOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_ACACIA_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_ACACIA_TRAPDOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_ACACIA_WALL_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_BIRCH_BUTTON.get());
//        this.dropSelf(CaliberBlocks.STAINED_BIRCH_DOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_BIRCH_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_BIRCH_TRAPDOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_BIRCH_WALL_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_DARK_OAK_BUTTON.get());
//        this.dropSelf(CaliberBlocks.STAINED_DARK_OAK_DOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_DARK_OAK_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_DARK_OAK_TRAPDOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_DARK_OAK_WALL_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_JUNGLE_BUTTON.get());
//        this.dropSelf(CaliberBlocks.STAINED_JUNGLE_DOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_JUNGLE_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_JUNGLE_TRAPDOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_JUNGLE_WALL_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_OAK_BUTTON.get());
//        this.dropSelf(CaliberBlocks.STAINED_OAK_DOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_OAK_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_OAK_TRAPDOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_OAK_WALL_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_SPRUCE_BUTTON.get());
//        this.dropSelf(CaliberBlocks.STAINED_SPRUCE_DOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_SPRUCE_SIGN.get());
        this.dropSelf(CaliberBlocks.STAINED_SPRUCE_TRAPDOOR.get());
        this.dropSelf(CaliberBlocks.STAINED_SPRUCE_WALL_SIGN.get());
//        createSinglePropConditionTable(CaliberBlocks.STAINED_ACACIA_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(CaliberBlocks.STAINED_BIRCH_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(CaliberBlocks.STAINED_DARK_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(CaliberBlocks.STAINED_JUNGLE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(CaliberBlocks.STAINED_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(CaliberBlocks.STAINED_SPRUCE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
        this.add(CaliberBlocks.STAINED_ACACIA_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.STAINED_ACACIA_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(CaliberBlocks.STAINED_BIRCH_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.STAINED_DARK_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.STAINED_DARK_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(CaliberBlocks.STAINED_JUNGLE_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.STAINED_JUNGLE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(CaliberBlocks.STAINED_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.STAINED_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(CaliberBlocks.STAINED_SPRUCE_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.STAINED_SPRUCE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));

        this.add(CaliberBlocks.TALL_STAINED_ACACIA_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_STAINED_BIRCH_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_STAINED_JUNGLE_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_STAINED_OAK_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(CaliberBlocks.TALL_STAINED_SPRUCE_DOOR.get(), (block) ->
                createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));

//        createSinglePropConditionTable(CaliberBlocks.STAINED_ACACIA_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER);
//        createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        createSinglePropConditionTable(CaliberBlocks.TALL_STAINED_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM);
//        this.dropSelf(CaliberBlocks.TALL_STAINED_ACACIA_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_STAINED_BIRCH_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_STAINED_DARK_OAK_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_STAINED_JUNGLE_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_STAINED_OAK_DOOR.get());
//        this.dropSelf(CaliberBlocks.TALL_STAINED_SPRUCE_DOOR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CaliberBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}