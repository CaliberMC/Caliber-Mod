package com.calibermc.caliber.mixin;

import com.calibermc.caliber.util.player.IPlayerExtended;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.entity.LevelEntityGetter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Level.class)
public abstract class LevelMixin {

    @Shadow protected abstract LevelEntityGetter<Entity> getEntities();


    @Inject(method = "tickBlockEntities", at = @At("TAIL"))
    public void mixin$tick(CallbackInfo ci) {
        for (Entity entity : this.getEntities().getAll()) {
            if (entity instanceof IPlayerExtended l) {
                if (l.caliber$shouldTick() && l.caliber$playersDayTime()) {
                    l.caliber$setDayTime(l.caliber$getDayTime() + 1L, l.caliber$shouldTick());
                }

                if (entity.level.isClientSide) {
                    l.caliber$manageRaining();
                }
            }
        }
    }

    @Inject(method = "getRainLevel", at = @At("TAIL"), cancellable = true)
    public void mixin$getRainLevel(float pDelta, CallbackInfoReturnable<Float> cir) {
        for (Entity entity : this.getEntities().getAll()) {
            if (entity instanceof IPlayerExtended l && l.caliber$playersRaining() && entity.level.isClientSide) {
                cir.setReturnValue(l.caliber$getRainLevel(pDelta));
            }
        }
    }
}
