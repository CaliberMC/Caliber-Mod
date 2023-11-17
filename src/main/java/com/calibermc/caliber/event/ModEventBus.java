package com.calibermc.caliber.event;


import com.calibermc.caliber.Caliber;

import com.calibermc.caliber.command.CaliberCommands;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Caliber.MOD_ID)
public class ModEventBus {

    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        CaliberCommands.register(event.getDispatcher());
    }


}
