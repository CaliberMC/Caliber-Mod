package com.calibermc.caliber.command;

import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.util.player.IPlayerExtended;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.TimeArgument;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

public class CaliberCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("ptime")
                .requires((sourceStack) -> sourceStack.getEntity() instanceof Player && sourceStack.hasPermission(2))
                .then(Commands.literal("server").executes((context) -> setServerVal(context.getSource(), false)))
                .then(Commands.argument("tickable", BoolArgumentType.bool())
                        .then(Commands.literal("set")
                                .then(Commands.literal("day").executes((context) ->
                                        setTime(context.getSource(), 1000, BoolArgumentType.getBool(context, "tickable"))))
                                .then(Commands.literal("noon").executes((context) ->
                                        setTime(context.getSource(), 6000, BoolArgumentType.getBool(context, "tickable"))))
                                .then(Commands.literal("night").executes((context) ->
                                        setTime(context.getSource(), 13000, BoolArgumentType.getBool(context, "tickable"))))
                                .then(Commands.literal("midnight").executes((context) ->
                                        setTime(context.getSource(), 18000, BoolArgumentType.getBool(context, "tickable"))))
                                .then(Commands.argument("time", TimeArgument.time()).executes((context) ->
                                        setTime(context.getSource(), IntegerArgumentType.getInteger(context, "time"),
                                                BoolArgumentType.getBool(context, "tickable"))))
                        ).then(Commands.literal("add").then(Commands.argument("time", TimeArgument.time()).executes((context) ->
                                addTime(context.getSource(), IntegerArgumentType.getInteger(context, "time"),
                                        BoolArgumentType.getBool(context, "tickable")))))
                        .then(Commands.literal("query")
                                .then(Commands.literal("daytime").executes((context) -> queryTime(context.getSource(), false)))
                                .then(Commands.literal("day").executes((context) -> queryTime(context.getSource(), true))))
                ));
        dispatcher.register(Commands.literal("pweather").requires((context) -> context.hasPermission(2))
                .then(Commands.literal("server").executes((context) -> setServerVal(context.getSource(), true)))
                .then(Commands.literal("clear").executes((context) -> setRain(context.getSource(), false)))
                .then(Commands.literal("rain").executes((context) -> setRain(context.getSource(), true)))
        );


        dispatcher.register(Commands.literal("buildmode").requires((context) -> context.hasPermission(2))
                .then(Commands.literal("slab").executes((context) -> setBlockStateMode(context.getSource(), 0)))
                .then(Commands.literal("layer").executes((context) -> setBlockStateMode(context.getSource(), 1)))
        );
    }

    private static int setBlockStateMode(CommandSourceStack pSource, int mode) {
        CaliberCommonConfigs.MODE_BLOCKSTATE.set(mode);
        pSource.sendSuccess(new TextComponent("Set %s mode".formatted(mode == 0 ? "slab" : "layer")), true);
        return 0;
    }

    private static int setServerVal(CommandSourceStack pSource, boolean weather) throws CommandSyntaxException {
        if (pSource.getPlayerOrException() instanceof IPlayerExtended ex) {
            if (weather) {
                ex.caliber$clearRaining();
                pSource.sendSuccess(new TextComponent("Using server weather"), true);
            } else {
                ex.caliber$resetDayTime();
                pSource.sendSuccess(new TextComponent("Using server day time"), true);
            }
        }
        return 0;
    }

    private static int setRain(CommandSourceStack pSource, boolean isRaining) throws CommandSyntaxException {
        if (pSource.getPlayerOrException() instanceof IPlayerExtended ex) {
            ex.caliber$setRaining(isRaining);
            if (isRaining) {
                pSource.sendSuccess(new TranslatableComponent("commands.weather.set.rain"), true);
            } else {
                pSource.sendSuccess(new TranslatableComponent("commands.weather.set.clear"), true);
            }
        }
        return 0;
    }

    private static int getDayTime(ServerPlayer serverPlayer) {
        if (serverPlayer instanceof IPlayerExtended ex) {
            return (int) (ex.caliber$getDayTime() % 24000L);
        }
        return (int) (serverPlayer.level.getDayTime() % 24000L);
    }

    private static int queryTime(CommandSourceStack pSource, boolean day) throws CommandSyntaxException {
        ServerPlayer player = pSource.getPlayerOrException();
        int pTime = 0;
        if (player instanceof IPlayerExtended ex) {
            if (day) {
                pTime = (int) (ex.caliber$getDayTime() / 24000L % 2147483647L);
            } else {
                pTime = (int) (ex.caliber$getDayTime() % 24000L);
            }
        }
        pSource.sendSuccess(new TranslatableComponent("commands.time.query", pTime), false);
        return pTime;
    }

    public static int setTime(CommandSourceStack pSource, int pTime, boolean tickable) throws CommandSyntaxException {
        ServerPlayer player = pSource.getPlayerOrException();
        if (player instanceof IPlayerExtended ex) {
            ex.caliber$setDayTime(pTime, tickable);
        }
        pSource.sendSuccess(new TranslatableComponent("commands.time.set", pTime), true);
        return getDayTime(player);
    }

    public static int addTime(CommandSourceStack pSource, int pAmount, boolean tickable) throws CommandSyntaxException {
        ServerPlayer player = pSource.getPlayerOrException();
        if (player instanceof IPlayerExtended ex) {
            ex.caliber$setDayTime(ex.caliber$getDayTime() + pAmount, tickable);
        }
        int i = getDayTime(player);
        pSource.sendSuccess(new TranslatableComponent("commands.time.set", i), true);
        return i;
    }
}
