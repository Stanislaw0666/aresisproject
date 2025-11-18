package net.stanislav0666.aresismod.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stanislav0666.aresismod.AresisMod;
import net.stanislav0666.aresismod.AresisMod;
import yesman.epicfight.world.item.GreatswordItem;
import yesman.epicfight.world.item.SpearItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AresisMod.MODID);

    public static final RegistryObject<Item> MOONRUBY = ITEMS.register("moonruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOONSILVER_INGOT = ITEMS.register("moonsilver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MOONSILVER = ITEMS.register("raw_moonsilver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ESHVEDAKT_PATTERN_GREATSWORD = ITEMS.register("eshvedakt_pattern_greatsword", () -> new GreatswordItem(new Item.Properties().fireResistant(), ModToolTiers.MOONSILVER));

    public static final RegistryObject<Item> MOONSILVER_HALBERD = ITEMS.register("moonsilver_halberd", () -> new SpearItem(new Item.Properties().fireResistant(), ModToolTiers.MOONSILVER));

    public static final RegistryObject<Item> LIGHT_CULTIST_HELMET = ITEMS.register("light_cultist_helmet",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CULTIST, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_CULTIST_CHESTPLATE = ITEMS.register("light_cultist_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CULTIST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_CULTIST_LEGGINGS = ITEMS.register("light_cultist_leggings",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CULTIST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_CULTIST_BOOTS = ITEMS.register("light_cultist_boots",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CULTIST, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
