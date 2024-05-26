package com.calibermc.caliber.entity.ai;

import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.util.GoalUtils;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;

public class TallDoorInteractGoal extends Goal {
   protected Mob mob;
   protected BlockPos doorPos = BlockPos.ZERO;
   protected boolean hasDoor;
   private boolean passed;
   private float doorOpenDirX;
   private float doorOpenDirZ;

   public TallDoorInteractGoal(Mob entity) {
      this.mob = entity;
      if (!GoalUtils.hasGroundPathNavigation(entity)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean isOpen() {
      if (!this.hasDoor) {
         return false;
      } else {
         BlockState blockstate = this.mob.getCommandSenderWorld().getBlockState(this.doorPos);
         if (!(blockstate.getBlock() instanceof TallDoorBlock)) {
            this.hasDoor = false;
            return false;
         } else {
            return blockstate.getValue(TallDoorBlock.OPEN);
         }
      }
   }

   protected void setOpen(boolean p_25196_) {
      if (this.hasDoor) {
         BlockState blockstate = this.mob.getCommandSenderWorld().getBlockState(this.doorPos);
         if (blockstate.getBlock() instanceof TallDoorBlock) {
            ((TallDoorBlock)blockstate.getBlock()).setOpen(this.mob, this.mob.getCommandSenderWorld(), blockstate, this.doorPos, p_25196_);
         }
      }

   }

   public boolean canUse() {
      if (!GoalUtils.hasGroundPathNavigation(this.mob)) {
         return false;
      } else if (!this.mob.horizontalCollision) {
         return false;
      } else {
         GroundPathNavigation groundpathnavigation = (GroundPathNavigation)this.mob.getNavigation();
         Path path = groundpathnavigation.getPath();
         if (path != null && !path.isDone() && groundpathnavigation.canOpenDoors()) {
            for(int i = 0; i < Math.min(path.getNextNodeIndex() + 2, path.getNodeCount()); ++i) {
               Node node = path.getNode(i);
               this.doorPos = new BlockPos(node.x, node.y + 1, node.z);
               if (!(this.mob.distanceToSqr((double)this.doorPos.getX(), this.mob.getY(), (double)this.doorPos.getZ()) > 2.25D)) {
                  this.hasDoor = TallDoorBlock.isWoodenDoor(this.mob.getCommandSenderWorld(), this.doorPos);
                  if (this.hasDoor) {
                     return true;
                  }
               }
            }

            this.doorPos = this.mob.blockPosition().above();
            this.hasDoor = TallDoorBlock.isWoodenDoor(this.mob.getCommandSenderWorld(), this.doorPos);
            return this.hasDoor;
         } else {
            return false;
         }
      }
   }

   public boolean canContinueToUse() {
      return !this.passed;
   }

   public void start() {
      this.passed = false;
      this.doorOpenDirX = (float)((double)this.doorPos.getX() + 0.5D - this.mob.getX());
      this.doorOpenDirZ = (float)((double)this.doorPos.getZ() + 0.5D - this.mob.getZ());
   }

   public boolean requiresUpdateEveryTick() {
      return true;
   }

   public void tick() {
      float f = (float)((double)this.doorPos.getX() + 0.5D - this.mob.getX());
      float f1 = (float)((double)this.doorPos.getZ() + 0.5D - this.mob.getZ());
      float f2 = this.doorOpenDirX * f + this.doorOpenDirZ * f1;
      if (f2 < 0.0F) {
         this.passed = true;
      }

   }
}
