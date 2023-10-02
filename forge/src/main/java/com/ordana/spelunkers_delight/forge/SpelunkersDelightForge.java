package com.ordana.spelunkers_delight.forge;

import com.ordana.spelunkers_delight.SpelunkersDelight;
import net.minecraftforge.fml.common.Mod;

@Mod(SpelunkersDelight.MOD_ID)
public class SpelunkersDelightForge {

    public SpelunkersDelightForge() {
        SpelunkersDelight.commonInit();
        /*
        if (PlatformHelper.getEnv().isClient()) {
            ModidClient.init();
        }
        */
    }
}

