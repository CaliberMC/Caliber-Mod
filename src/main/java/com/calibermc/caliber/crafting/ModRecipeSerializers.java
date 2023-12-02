package com.calibermc.caliber.crafting;

import com.calibermc.caliber.Caliber;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeSerializers {

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Caliber.MOD_ID);

    public static final RegistryObject<RecipeSerializer<KilnRecipe>> ALLOYING = RECIPE_SERIALIZERS.register("alloying", () -> new KilnRecipe.Serializer<>(KilnRecipe::new));
    public static final RegistryObject<RecipeSerializer<WoodcutterRecipe>> WOODCUTTING = RECIPE_SERIALIZERS.register("woodcutting", () -> new WoodcutterRecipe.Serializer<>(WoodcutterRecipe::new));

    public static RecipeType<WoodcutterRecipe> WOODCUTTING_TYPE;
    public static RecipeType<KilnRecipe> ALLOYING_TYPE;

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
    }
}
