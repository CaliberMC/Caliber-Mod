package com.calibermc.caliber.event.loot;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ResinFromSpruceLeavesModifier extends LootModifier {
    public static final Supplier<Codec<ResinFromSpruceLeavesModifier>> CODEC = () -> RecordCodecBuilder.create(inst ->
            LootModifier.codecStart(inst)
                    .and(ForgeRegistries.ITEMS.getCodec().fieldOf("addition").forGetter(m -> m.addition))
                    .apply(inst, ResinFromSpruceLeavesModifier::new)
    );

    private final Item addition;

    protected ResinFromSpruceLeavesModifier(LootItemCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @Nonnull
    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        // generatedLoot is the loot that would be dropped, if we wouldn't add or replace
        // anything!
        if(context.getRandom().nextFloat() > 0.3f) {
            generatedLoot.add(new ItemStack(addition, 1));
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
