package com.cartooncraft.bosspets;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BossPetsMod implements ModInitializer {
    public static final String MOD_ID = "cartooncraft_bosspets";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static ItemGroup BOSS_PETS_GROUP;

    @Override
    public void onInitialize() {
        BossPetsRegistry.registerAll();
        BossPetsItems.registerAll();
        BossPetsGoals.registerAll();

        // Registrar la pestaña del creativo con el Boss Soul Gem como ícono
        BOSS_PETS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "boss_pets"),
            FabricItemGroup.builder()
                .displayName(Text.literal("CartoonCraft Boss Pets"))
                .icon(() -> new ItemStack(BossPetsItems.BOSS_SOUL_GEM))
                .entries((context, entries) -> {
                    entries.add(BossPetsItems.BOSS_SOUL_GEM);
                    entries.add(BossPetsItems.BOSS_ESSENCE);
                    entries.add(BossPetsItems.TOON_TETHER);
                })
                .build()
        );

        LOGGER.info("[CartoonCraft] Boss Pets initialized.");
    }
}
