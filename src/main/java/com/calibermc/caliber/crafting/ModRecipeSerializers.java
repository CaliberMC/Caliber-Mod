package com.calibermc.caliber.crafting;

import com.calibermc.caliber.Caliber;
import cpw.mods.util.Lazy;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Recipe;
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

    private static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registry.RECIPE_TYPE_REGISTRY, Caliber.MOD_ID);

    public static final RegistryObject<RecipeType<WoodcutterRecipe>> WOODCUTTING_TYPE = RECIPE_TYPES.register("woodcutting", () -> registerRecipeType("woodcutting"));
    public static final RegistryObject<RecipeType<KilnRecipe>> ALLOYING_TYPE = RECIPE_TYPES.register("alloying", () -> registerRecipeType("alloying"));

    public static <T extends Recipe<?>> RecipeType<T> registerRecipeType(final String identifier) {
        return new RecipeType<>()
        {
            public String toString() {
                return Caliber.MOD_ID + ":" + identifier;
            }
        };
    }

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }
}
