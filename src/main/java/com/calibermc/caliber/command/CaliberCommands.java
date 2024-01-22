package com.calibermc.caliber.command;

import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public class CaliberCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("buildmode").requires((context) -> context.hasPermission(2))
                .then(Commands.literal("slab").executes((context) -> setBlockStateMode(context.getSource(), 0)))
                .then(Commands.literal("layer").executes((context) -> setBlockStateMode(context.getSource(), 1)))
        );
    }

    private static int setBlockStateMode(CommandSourceStack pSource, int mode) {
        CaliberCommonConfigs.MODE_BLOCKSTATE.set(mode);
        pSource.sendSuccess(() -> Component.literal("Set %s mode".formatted(mode == 0 ? "slab" : "layer")), true);
        return 0;
    }
}