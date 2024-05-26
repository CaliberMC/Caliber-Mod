package com.calibermc.caliber.crafting;

import com.calibermc.caliber.Caliber;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;

import java.util.function.Supplier;

public class CaliberRecipeSerializers {

    public static final RegSupplier<RecipeSerializer<WoodcutterRecipe>> WOODCUTTING = RegHelper.registerRecipeSerializer(new ResourceLocation(Caliber.MOD_ID, "woodcutting"), () -> new WoodcutterRecipe.Serializer<>(WoodcutterRecipe::new));

    public static final Supplier<RecipeType<WoodcutterRecipe>> WOODCUTTING_TYPE = RegHelper.registerRecipeType(new ResourceLocation(Caliber.MOD_ID, "woodcutting"));

    public static void init() {
    }
}
