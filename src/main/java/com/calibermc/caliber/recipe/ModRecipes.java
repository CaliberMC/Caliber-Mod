package com.calibermc.caliber.recipe;

import com.calibermc.caliber.Caliber;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Caliber.MOD_ID);

    public static final RegistryObject<RecipeSerializer<SmelterRecipe>> SMELTING_SERIALIZER =
            SERIALIZERS.register("alloying", () -> SmelterRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
