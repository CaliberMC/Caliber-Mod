package com.calibermc.caliber.util.player;

import net.minecraft.nbt.CompoundTag;

public interface IPlayerExtended {

    CompoundTag caliber$getTag();

    boolean caliber$additionalPressed();

    void caliber$pressAdditional(boolean pressed);

    void caliber$setDayTime(long dayTime, boolean shouldTick);

    void caliber$resetDayTime();

    long caliber$getDayTime();

    boolean caliber$shouldTick();

    boolean caliber$playersDayTime();

    boolean caliber$isRaining();

    boolean caliber$playersRaining();

    void caliber$setRaining(boolean raining);

    void caliber$clearRaining();

    void caliber$manageRaining();

    float caliber$getRainLevel(float pDelta);
}