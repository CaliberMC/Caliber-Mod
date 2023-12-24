package com.calibermc.caliber.data.datagen.loot;

import com.calibermc.caliber.block.management.BlockManager;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Function;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        craftingTables();
        metalsAndOres();
        terrainBlocks();
        plasterBlocks();

        for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS) {
            for (Map.Entry<BlockManager.BlockAdditional, RegistryObject<Block>> e : blockManager.getBlocks().entrySet()) {
                try {
                    e.getKey().lootGen.accept(this, e.getValue().get());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
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

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    @Override
    public void add(Block pBlock, Function<Block, LootTable.Builder> pFactory) {
        super.add(pBlock, pFactory);
    }

    @Override
    public void add(Block pBlock, LootTable.Builder pLootTableBuilder) {
        super.add(pBlock, pLootTableBuilder);
    }

    @NotNull
    public static LootTable.Builder createSingleItemTableWithSilkTouch(Block pSilkTouchBlock, ItemLike pNoSilkTouchItemLike) {
        return createSilkTouchDispatchTable(pSilkTouchBlock, applyExplosionCondition(pSilkTouchBlock, LootItem.lootTableItem(pNoSilkTouchItemLike)));
    }
}