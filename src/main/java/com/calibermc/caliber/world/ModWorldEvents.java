package com.calibermc.caliber.world;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Caliber.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

//        ModTreeGeneration.generateTrees(event);
//        ModFlowerGeneration.generateFlowers(event);
    }
}
