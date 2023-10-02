package com.ordana.spelunkers_delight.reg;

import com.ordana.spelunkers_delight.SpelunkersDelight;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {

    public static void init() {
    }

    public static <T extends Item> Supplier<T> regItem(String name, Supplier<T> itemSup) {
        return RegHelper.registerItem(SpelunkersDelight.res(name), itemSup);
    }



}
