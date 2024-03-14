package com.calibermc.caliber.data.datagen.loot;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliberlib.block.shapes.doors.TallDoorPart;
import com.calibermc.caliberlib.data.ModBlockFamily;
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
//        plankBlocks();
        super.generate();
    }

    private void craftingTables() {
        this.dropSelf(CaliberBlocks.WOODCUTTER.get());
    }

    public void plankBlocks() {
//        this.add(CaliberBlocks.ACACIA.get(ModBlockFamily.Variant.TALL_DOOR), (block) -> createSinglePropConditionTable(CaliberBlocks.ACACIA.get(ModBlockFamily.Variant.TALL_DOOR), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CaliberBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}