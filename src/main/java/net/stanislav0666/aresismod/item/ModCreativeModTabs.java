package net.stanislav0666.aresismod.item;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.stanislav0666.aresismod.AresisMod;
import net.stanislav0666.aresismod.AresisMod;
import net.stanislav0666.aresismod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AresisMod.MODID);

public static final RegistryObject<CreativeModeTab> ARESISMOD_TAB = CREATIVE_MODE_TABS.register("aresismod_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOONRUBY.get()))
                .title(Component.translatable("creativetab.aresismod_tab"))
                .displayItems((pParameters, p0utput) -> {
                    p0utput.accept(ModItems.MOONRUBY.get());
                    p0utput.accept(ModItems.MOONSILVER_INGOT.get());
                    p0utput.accept(ModItems.RAW_MOONSILVER.get());
                    p0utput.accept(ModBlocks.MOONSILVER_BLOCK.get());
                    p0utput.accept(ModItems.ESHVEDAKT_PATTERN_GREATSWORD.get());
                    p0utput.accept(ModItems.MOONSILVER_HALBERD.get());



                })

                .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
