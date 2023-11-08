package com.calibermc.caliber.networking;

import com.calibermc.caliber.world.inventory.BlockPickerMenu;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ServerSetBlockMenuSlot {
    private final int slotNum;
    private final ItemStack itemStack;

    public ServerSetBlockMenuSlot(int pSlotNum, ItemStack pItemStack) {
        this.slotNum = pSlotNum;
        this.itemStack = pItemStack.copy();
    }

    public ServerSetBlockMenuSlot(FriendlyByteBuf buffer) {
        this.slotNum = buffer.readShort();
        this.itemStack = buffer.readItem();
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.writeShort(this.slotNum);
        buffer.writeItemStack(this.itemStack, false);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer sender = ctx.get().getSender();
            if (sender != null) {
                boolean flag = this.slotNum < 0;
                boolean flag2 = this.itemStack.isEmpty() || this.itemStack.getDamageValue() >= 0 && this.itemStack.getCount() <= 64 && !this.itemStack.isEmpty();
                if (sender.containerMenu instanceof BlockPickerMenu && flag2) {
                    if (!flag) {
                        sender.containerMenu.getSlot(slotNum).set(this.itemStack);
                        sender.containerMenu.broadcastChanges();
                        sender.inventoryMenu.broadcastChanges();
                    } else {
                        sender.drop(this.itemStack, true);
                    }
                }
            }
        });
        ctx.get().setPacketHandled(true);
    }

}