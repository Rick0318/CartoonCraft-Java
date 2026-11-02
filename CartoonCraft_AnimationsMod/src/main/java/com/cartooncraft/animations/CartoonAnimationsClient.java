package com.cartooncraft.animations;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.entity.player.PlayerEntity;

public class CartoonAnimationsClient implements ClientModInitializer {
    private static float bobTimer = 0f;
    private static float swingPhase = 0f;

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;
            PlayerEntity player = client.player;
            bobTimer += 0.1f;
            swingPhase += 0.15f;
            CartoonTransformRegistry.update(player, bobTimer, swingPhase);
        });
    }
}
