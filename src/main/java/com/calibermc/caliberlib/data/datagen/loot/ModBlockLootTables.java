package com.calibermc.caliberlib.data.datagen.loot;

import com.calibermc.caliberlib.block.management.BlockManager;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected final String modid;

    public ModBlockLootTables(String modid) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        this.modid = modid;
    }

    @Override
    protected void generate() {
        for (BlockManager blockManager : BlockManager.BLOCK_MANAGERS.get(this.modid)) {
            for (Map.Entry<BlockManager.BlockAdditional, Pair<ResourceLocation, Supplier<Block>>> e : blockManager.getBlocks().entrySet()) {
                try {
                    e.getKey().lootGen.accept(this, e.getValue().getSecond().get());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void add(Block pBlock, Function<Block, LootTable.Builder> pFactory) {
        super.add(pBlock, pFactory);
    }

    @Override
    public void add(Block pBlock, LootTable.Builder pLootTableBuilder) {
        super.add(pBlock, pLootTableBuilder);
    }

    @Override
    public void dropSelf(Block pBlock) {
        super.dropSelf(pBlock);
    }

    @NotNull
    public LootTable.Builder createSingleItemTableWithSilkTouch(Block pBlock, ItemLike pItem) {
        return super.createSingleItemTableWithSilkTouch(pBlock, pItem);
    }
}