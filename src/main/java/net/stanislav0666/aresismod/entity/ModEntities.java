package net.stanislav0666.aresismod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stanislav0666.aresismod.AresisMod;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AresisMod.MODID);

    public static final DeferredRegister<EntityType<Heved>> HEVED =
            ENTITY_TYPES.register("heved", () ->EntityType.Builder.of(Heved::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("heved"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
