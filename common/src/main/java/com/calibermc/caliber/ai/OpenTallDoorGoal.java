package com.calibermc.caliber.ai;

import net.minecraft.world.entity.Mob;

public class OpenTallDoorGoal extends TallDoorInteractGoal
{
   private final boolean closeDoor;
   private int forgetTime;

   public OpenTallDoorGoal(Mob entity, boolean close) {
      super(entity);
      this.mob = entity;
      this.closeDoor = close;
   }

   public boolean canContinueToUse() {
      return this.closeDoor && this.forgetTime > 0 && super.canContinueToUse();
   }

   public void start() {
      this.forgetTime = 20;
      this.setOpen(true);
   }

   public void stop() {
      this.setOpen(false);
   }

   public void tick() {
      --this.forgetTime;
      super.tick();
   }
}
