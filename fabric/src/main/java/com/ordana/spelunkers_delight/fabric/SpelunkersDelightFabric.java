package com.ordana.spelunkers_delight.fabric;

import com.ordana.spelunkers_delight.SpelunkersDelight;
import com.ordana.spelunkers_delight.SpelunkersDelightClient;
import net.fabricmc.api.ModInitializer;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.mehvahdjukaar.moonlight.fabric.MLFabricSetupCallbacks;

public class SpelunkersDelightFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        SpelunkersDelight.commonInit();

        if (PlatHelper.getPhysicalSide().isClient()) {
            MLFabricSetupCallbacks.CLIENT_SETUP.add(SpelunkersDelightClient::init);
        }
    }
}
