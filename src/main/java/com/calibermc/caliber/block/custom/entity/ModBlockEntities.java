package com.calibermc.caliber.block.custom.entity;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.CaliberBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Caliber.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
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
}

