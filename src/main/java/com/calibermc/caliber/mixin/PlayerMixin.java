package com.calibermc.caliber.mixin;

import com.calibermc.caliber.networking.ClientSetRaining;
import com.calibermc.caliber.networking.ClientSetTime;
import com.calibermc.caliber.networking.ModNetworking;
import com.calibermc.caliber.util.player.IPlayerExtended;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.network.PacketDistributor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Player.class)
public class PlayerMixin implements IPlayerExtended {

    @Unique private boolean caliber$shouldTick;
    @Unique private boolean caliber$playerDayTime;
    @Unique private long caliber$dayTime;

    @Unique private boolean caliber$playersRaining;
    @Unique private boolean caliber$isRaining;

    @Unique private float caliber$oRainLevel;

    @Unique private float caliber$rainLevel;

    @Override
    public void caliber$setDayTime(long dayTime, boolean shouldTick) {
        if (dayTime < 0L) {
            dayTime = -dayTime;
        }
        this.caliber$dayTime = dayTime;
        this.caliber$shouldTick = shouldTick;
        this.caliber$playerDayTime = true;
        if (((Player) (Object) this) instanceof ServerPlayer player) {
            ModNetworking.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new ClientSetTime(player.getUUID(), this.caliber$dayTime, this.caliber$shouldTick));
        }
    }

    @Override
    public void caliber$resetDayTime() {
        this.caliber$playerDayTime = false;
        if (((Player) (Object) this) instanceof ServerPlayer player) {
            ModNetworking.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new ClientSetTime(player.getUUID()));
        }
    }

    @Override
    public long caliber$getDayTime() {
        return this.caliber$dayTime;
    }

    @Override
    public boolean caliber$shouldTick() {
        return this.caliber$shouldTick;
    }

    @Override
    public boolean caliber$playersDayTime() {
        return this.caliber$playerDayTime;
    }

    @Override
    public boolean caliber$isRaining() {
        return this.caliber$isRaining;
    }

    @Override
    public void caliber$setRaining(boolean raining) {
        this.caliber$isRaining = raining;
        this.caliber$playersRaining = true;
        if (((Player) (Object) this) instanceof ServerPlayer player) {
            ModNetworking.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new ClientSetRaining(player.getUUID(), this.caliber$isRaining));
        }
    }

    @Override
    public void caliber$clearRaining() {
        this.caliber$playersRaining = false;
        if (((Player) (Object) this) instanceof ServerPlayer player) {
            ModNetworking.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new ClientSetRaining(player.getUUID()));
        }
    }

    @Override
    public void caliber$manageRaining() {
        this.caliber$oRainLevel = this.caliber$rainLevel;
        if (this.caliber$isRaining()) {
            this.caliber$rainLevel += 0.01F;
        } else {
            this.caliber$rainLevel -= 0.01F;
        }

        this.caliber$rainLevel = Mth.clamp(this.caliber$rainLevel, 0.0F, 1.0F);
    }

    @Override
    public float caliber$getRainLevel(float pDelta) {
        return Mth.lerp(pDelta, this.caliber$oRainLevel, this.caliber$rainLevel);
    }

    @Override
    public boolean caliber$playersRaining() {
        return this.caliber$playersRaining;
    }
}
