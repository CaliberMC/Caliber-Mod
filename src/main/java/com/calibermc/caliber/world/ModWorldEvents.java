package com.calibermc.caliber.world;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.config.CaliberClientConfigs;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.networking.ServerAdjustReach;
import com.calibermc.caliber.world.gen.ModOreGeneration;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Caliber.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        boolean generateOres = CaliberCommonConfigs.WORLD_GEN_ORES.get();
        if (generateOres) {
            ModOreGeneration.generateOres(event);
        }

//        ModTreeGeneration.generateTrees(event);
//        ModFlowerGeneration.generateFlowers(event);
    }

    @SubscribeEvent
    public static void entityJoinWorld(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof LivingEntity entity) {
            ServerAdjustReach.setModifier(entity, -1, ForgeMod.ATTACK_RANGE.get(), ForgeMod.REACH_DISTANCE.get());
        }
    }

    @SubscribeEvent
    public static void playerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.START && !event.player.isCreative()) {
            ServerAdjustReach.setModifier(event.player, -1, ForgeMod.ATTACK_RANGE.get(), ForgeMod.REACH_DISTANCE.get());
        }
    }
}
