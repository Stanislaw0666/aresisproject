package net.stanislav0666.aresismod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.stanislav0666.aresismod.block.ModBlocks;
import net.stanislav0666.aresismod.entity.ModEntities;
import net.stanislav0666.aresismod.event.ModEventBusEvents;
import net.stanislav0666.aresismod.item.ModCreativeModTabs;
import net.stanislav0666.aresismod.item.ModItems;
import net.stanislav0666.aresismod.rederer.entity.HevedRenderer;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AresisMod.MODID)
public class AresisMod {
    public static final String MODID = "aresismod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AresisMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);


        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModEntities.ENTITY_TYPES.register(modEventBus);

        //ModEventBusEvents.register(modEventBus);


        //ModEntities.register(modEventBus);

        //HevedRenderer.register(modEventBus);


        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Your setup code here
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Your creative tab code here
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
