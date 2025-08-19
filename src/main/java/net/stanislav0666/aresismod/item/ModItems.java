package net.stanislav0666.aresismod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stanislav0666.aresismod.AresisMod;
import net.stanislav0666.aresismod.AresisMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AresisMod.MODID);

    public static final RegistryObject<Item> MOONRUBY = ITEMS.register("moonruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOONSILVER_INGOT = ITEMS.register("moonsilver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MOONSILVER = ITEMS.register("raw_moonsilver",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
