package net.stanislav0666.aresismod.rederer.entity;

import net.minecraft.client.renderer.entity.AbstractZombieRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HuskRenderer;
import net.minecraft.resources.ResourceLocation;
import net.stanislav0666.aresismod.AresisMod;


//@OnlyIn(Dist.CLIENT)
public class HevedRenderer extends HuskRenderer {
    private static final ResourceLocation HUSK_LOCATION = ResourceLocation.fromNamespaceAndPath(AresisMod.MODID, "textures/entity/heved.png");

    public HevedRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    //public static void register(IEventBus modEventBus) {
    //}

    public ResourceLocation getTextureLocation(AbstractZombieRenderer entity) {
        return HUSK_LOCATION;
    }
}