package com.calibermc.caliber.block.custom.entity;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CaliberBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Caliber.MOD_ID);

    public static final RegistryObject<BlockEntityType<CaliberSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(CaliberSignBlockEntity::new,
                            CaliberBlocks.STAINED_ACACIA_WALL_SIGN.get(),
                            CaliberBlocks.STAINED_ACACIA_SIGN.get(),
                            CaliberBlocks.STAINED_BIRCH_WALL_SIGN.get(),
                            CaliberBlocks.STAINED_BIRCH_SIGN.get(),
                            CaliberBlocks.STAINED_DARK_OAK_WALL_SIGN.get(),
                            CaliberBlocks.STAINED_DARK_OAK_SIGN.get(),
                            CaliberBlocks.STAINED_JUNGLE_WALL_SIGN.get(),
                            CaliberBlocks.STAINED_JUNGLE_SIGN.get(),
                            CaliberBlocks.STAINED_OAK_WALL_SIGN.get(),
                            CaliberBlocks.STAINED_OAK_SIGN.get(),
                            CaliberBlocks.STAINED_SPRUCE_WALL_SIGN.get(),
                            CaliberBlocks.STAINED_SPRUCE_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<CaliberHangingSignBlockEntity>> HANGING_SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("hanging_sign_block_entity", () ->
                    BlockEntityType.Builder.of(CaliberHangingSignBlockEntity::new,
                            CaliberBlocks.STAINED_ACACIA_WALL_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_ACACIA_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_BIRCH_WALL_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_BIRCH_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_DARK_OAK_WALL_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_DARK_OAK_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_JUNGLE_WALL_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_JUNGLE_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_OAK_WALL_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_OAK_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_SPRUCE_WALL_HANGING_SIGN.get(),
                            CaliberBlocks.STAINED_SPRUCE_HANGING_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

