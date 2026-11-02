package com.cartooncraft.animations;

import net.minecraft.entity.player.PlayerEntity;

public class CartoonTransformRegistry {
    public static float bodyBobY = 0f;
    public static float armSwingLeft = 0f;
    public static float armSwingRight = 0f;
    public static float legSwingLeft = 0f;
    public static float legSwingRight = 0f;
    public static float bodyTilt = 0f;
    public static float headNod = 0f;
    public static float squashY = 1f;
    public static float stretchY = 1f;

    public static void update(PlayerEntity player, float bobTimer, float swingPhase) {
        boolean moving = player.getVelocity().horizontalLength() > 0.05;
        boolean running = player.isSprinting();
        boolean jumping = !player.isOnGround();
        boolean swimming = player.isTouchingWater();
        boolean sneaking = player.isSneaking();

        if (jumping) {
            squashY = 0.85f;
            stretchY = 1.18f;
            bodyTilt = (float) Math.toRadians(-8);
            bodyBobY = 0;
            armSwingLeft = (float) Math.toRadians(-40);
            armSwingRight = (float) Math.toRadians(-40);
        } else if (swimming) {
            float phase = (float) (Math.sin(swingPhase * 2.0) * Math.toRadians(55));
            armSwingLeft = phase;
            armSwingRight = -phase;
            bodyTilt = (float) Math.toRadians(-20);
            bodyBobY = (float) (Math.sin(swingPhase) * 0.04);
            squashY = 1f;
            stretchY = 1f;
        } else if (sneaking) {
            squashY = 0.78f;
            stretchY = 1f;
            bodyTilt = (float) Math.toRadians(25);
            bodyBobY = -0.15f;
            headNod = (float) Math.toRadians(-15);
            armSwingLeft = (float) Math.toRadians(20);
            armSwingRight = (float) Math.toRadians(20);
        } else if (running) {
            float t = (float) (Math.sin(swingPhase * 2.2) * Math.toRadians(50));
            armSwingLeft = t;
            armSwingRight = -t;
            legSwingLeft = -t * 0.8f;
            legSwingRight = t * 0.8f;
            bodyTilt = (float) Math.toRadians(-14);
            bodyBobY = (float) (Math.abs(Math.sin(swingPhase * 2.2)) * 0.06);
            squashY = 1f;
            stretchY = 1f;
            headNod = 0;
        } else if (moving) {
            float t = (float) (Math.sin(swingPhase * 1.8) * Math.toRadians(35));
            armSwingLeft = t;
            armSwingRight = -t;
            legSwingLeft = -t * 0.7f;
            legSwingRight = t * 0.7f;
            bodyBobY = (float) (Math.abs(Math.sin(swingPhase * 1.8)) * 0.04);
            bodyTilt = 0;
            squashY = 1f;
            stretchY = 1f;
            headNod = 0;
        } else {
            headNod = (float) (Math.sin(bobTimer * 0.6) * Math.toRadians(4));
            bodyBobY = (float) (Math.sin(bobTimer * 0.9) * 0.01);
            armSwingLeft = (float) (Math.sin(bobTimer * 0.5) * Math.toRadians(6));
            armSwingRight = (float) (Math.sin(bobTimer * 0.5 + Math.PI) * Math.toRadians(6));
            bodyTilt = 0;
            squashY = 1f;
            stretchY = 1f;
            legSwingLeft = 0;
            legSwingRight = 0;
        }
    }
}
