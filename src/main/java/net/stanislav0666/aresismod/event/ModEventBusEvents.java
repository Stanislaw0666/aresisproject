package net.stanislav0666.aresismod.event;


import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.common.Mod;
import net.stanislav0666.aresismod.AresisMod;
import net.stanislav0666.aresismod.entity.Heved;
import net.stanislav0666.aresismod.entity.ModEntities;

@Mod.EventBusSubscriber(modid = AresisMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEventBusEvents {
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.HEVED.get(), Heved.createAttributes().build());
    }
}
