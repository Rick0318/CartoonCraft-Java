package com.cartooncraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CartoonCraft implements ModInitializer {
    public static final String MOD_ID = "cartooncraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("CartoonCraft Java initialized.");
    }
}
