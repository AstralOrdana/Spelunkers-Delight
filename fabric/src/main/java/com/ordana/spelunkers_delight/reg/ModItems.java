package com.ordana.spelunkers_delight.reg;

import com.ordana.spelunkers_delight.SpelunkersDelight;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.function.Supplier;

public class ModItems {

    public static void init() {
    }

    public static <T extends Item> Supplier<T> regItem(String name, Supplier<T> itemSup) {
        return RegHelper.registerItem(SpelunkersDelight.res(name), itemSup);
    }

    //drinks
    public static final Supplier<Item> TANGLE_BEER = regItem("tangle_beer", () ->
            new Item(new Item.Properties().food(ModFoods.TANGLE_BEER)));
    public static final Supplier<Item> SPARKLING_WATER = regItem("sparkling_water", () ->
            new Item(new Item.Properties().food(ModFoods.SPARKLING_WATER)));
    public static final Supplier<Item> SODA = regItem("soda", () ->
            new Item(new Item.Properties().food(ModFoods.SODA)));
    public static final Supplier<Item> DIMENSIONAL_MILKSHAKE = regItem("dimensional_milkshake", () ->
            new Item(new Item.Properties().food(ModFoods.DIMENSIONAL_MILKSHAKE).rarity(Rarity.UNCOMMON)));

    //snacks
    public static final Supplier<Item> GLOWAMARI = regItem("glowamari", () ->
            new Item(new Item.Properties().food(ModFoods.GLOWAMARI)));
    public static final Supplier<Item> SALT_LICK = regItem("salt_lick", () ->
            new Item(new Item.Properties().food(ModFoods.SALT_LICK)));
    public static final Supplier<Item> CAT_FOOD = regItem("cat_food", () ->
            new Item(new Item.Properties().food(ModFoods.CAT_FOOD)));

    //sweets
    public static final Supplier<Item> ROCK_CANDY = regItem("rock_candy", () ->
            new Item(new Item.Properties().food(ModFoods.ROCK_CANDY)));
    public static final Supplier<Item> SALTED_CARAMEL = regItem("salted_caramel", () ->
            new Item(new Item.Properties().food(ModFoods.SALTED_CARAMEL)));
    public static final Supplier<Item> SPRING_WATER_TAFFY = regItem("spring_water_taffy", () ->
            new Item(new Item.Properties().food(ModFoods.SPRING_WATER_TAFFY)));

    //meals
    public static final Supplier<Item> BUBCAP_STEW = regItem("bubcap_stew", () ->
            new Item(new Item.Properties().food(ModFoods.BUBCAP_STEW)));
    public static final Supplier<Item> GRAY_SLOP = regItem("gray_slop", () ->
            new Item(new Item.Properties().food(ModFoods.GRAY_SLOP)));
    public static final Supplier<Item> STONE_SOUP = regItem("stone_soup", () ->
            new Item(new Item.Properties().food(ModFoods.STONE_SOUP)));
    public static final Supplier<Item> DIMENSIONAL_STEW = regItem("dimensional_stew", () ->
            new Item(new Item.Properties().food(ModFoods.DIMENSIONAL_STEW).rarity(Rarity.UNCOMMON)));

}
