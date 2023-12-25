package com.calibermc.caliber.block.entity;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.custom.entity.ModSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Caliber.MOD_ID);

    public static final RegistryObject<BlockEntityType<KilnBlockEntity>> KILN =
            BLOCK_ENTITIES.register("kiln", () ->
                    BlockEntityType.Builder.of(KilnBlockEntity::new, ModBlocks.KILN.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.STAINED_ACACIA_WALL_SIGN.get(),
                            ModBlocks.STAINED_ACACIA_SIGN.get(),
                            ModBlocks.STAINED_BIRCH_WALL_SIGN.get(),
                            ModBlocks.STAINED_BIRCH_SIGN.get(),
                            ModBlocks.STAINED_DARK_OAK_WALL_SIGN.get(),
                            ModBlocks.STAINED_DARK_OAK_SIGN.get(),
                            ModBlocks.STAINED_JUNGLE_WALL_SIGN.get(),
                            ModBlocks.STAINED_JUNGLE_SIGN.get(),
                            ModBlocks.STAINED_OAK_WALL_SIGN.get(),
                            ModBlocks.STAINED_OAK_SIGN.get(),
                            ModBlocks.STAINED_SPRUCE_WALL_SIGN.get(),
                            ModBlocks.STAINED_SPRUCE_SIGN.get()).build(null));
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
