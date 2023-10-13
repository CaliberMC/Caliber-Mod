package com.calibermc.caliber.event;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.recipe.SmelterRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Caliber.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

//    @SubscribeEvent
//    public static void registerModifierSerializers(@Nonnull final RegisterEvent event) {
//
//
//        //Changed from RECIPE_TYPES to RECIPE_SERIALIZERS
//        event.register(ForgeRegistries.Keys.RECIPE_TYPES, helper -> {
//            helper.register(new ResourceLocation(Caliber.MOD_ID, SmelterRecipe.Type.ID),
//                    SmelterRecipe.Type.INSTANCE);
//        });
//    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, SmelterRecipe.Type.ID, SmelterRecipe.Type.INSTANCE);
    }


}
