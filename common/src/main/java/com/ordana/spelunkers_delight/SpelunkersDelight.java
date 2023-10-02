package com.ordana.spelunkers_delight;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SpelunkersDelight {

    public static final String MOD_ID = "spelunkers_delight";
    public static final Logger LOGGER = LogManager.getLogger();

    private static final String NAME = "spelunkers_delight";

    public static ResourceLocation res(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public static void commonInit() {

    }

}