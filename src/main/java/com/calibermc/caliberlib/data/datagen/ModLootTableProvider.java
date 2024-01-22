package com.calibermc.caliberlib.data.datagen;

import com.calibermc.caliberlib.data.datagen.loot.ModBlockLootTables;
import com.google.common.collect.ImmutableList;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.*;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ModLootTableProvider extends LootTableProvider {
    private final List<SubProviderEntry> loot_tables;

    public ModLootTableProvider(DataGenerator pGenerator, Supplier<LootTableSubProvider> provider) {
        super(pGenerator.getPackOutput(), BuiltInLootTables.all(), List.of());
        this.loot_tables = ImmutableList.of(new SubProviderEntry(provider, LootContextParamSets.BLOCK));
    }

    @Override
    public List<SubProviderEntry> getTables() {
        return this.loot_tables;
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker) {
        map.forEach((id, table) -> LootDataType.TABLE.runValidation(validationtracker, new LootDataId<>(LootDataType.TABLE, id), table));
    }
}
