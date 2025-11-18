package net.stanislav0666.aresismod.item;

import net.stanislav0666.aresismod.AresisMod;
import net.stanislav0666.aresismod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier MOONSILVER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_MOONSILVER_TOOL, () -> Ingredient.of(ModItems.MOONSILVER_INGOT.get())),
            new ResourceLocation(AresisMod.MODID, "moonsilver"), List.of(Tiers.NETHERITE), List.of());

}