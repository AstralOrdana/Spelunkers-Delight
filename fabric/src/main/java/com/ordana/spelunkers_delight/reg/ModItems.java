package com.ordana.spelunkers_delight.reg;

import com.nhoryzon.mc.farmersdelight.item.ConsumableItem;
import com.ordana.spelunkers_delight.SpelunkersDelight;
import com.ordana.spelunkers_delight.items.CatFoodItem;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;

import java.util.function.Supplier;

public class ModItems {

    public static void init() {
    }

    public static <T extends Item> Supplier<T> regItem(String name, Supplier<T> itemSup) {
        return RegHelper.registerItem(SpelunkersDelight.res(name), itemSup);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties bottleFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    //drinks
    public static final Supplier<Item> TANGLE_BEER = regItem("tangle_beer", () ->
            new ConsumableItem(bowlFoodItem(ModFoods.TANGLE_BEER), true));
    public static final Supplier<Item> SPARKLING_WATER = regItem("sparkling_water", () ->
            new ConsumableItem(bottleFoodItem(ModFoods.SPARKLING_WATER), true));
    public static final Supplier<Item> SODA = regItem("soda", () ->
            new ConsumableItem(bowlFoodItem(ModFoods.SODA), true));
    public static final Supplier<Item> DIMENSIONAL_MILKSHAKE = regItem("dimensional_milkshake", () ->
            new Item(new Item.Properties().food(ModFoods.DIMENSIONAL_MILKSHAKE).stacksTo(16).rarity(Rarity.UNCOMMON)));

    //snacks
    public static final Supplier<Item> GLOWAMARI = regItem("glowamari", () ->
            new Item(new Item.Properties().food(ModFoods.GLOWAMARI)
                    .craftRemainder(BuiltInRegistries.ITEM.get(new ResourceLocation("spelunkery:glowstick")))));
    //public static final Supplier<Item> SALT_LICK = regItem("salt_lick", () ->
            //new Item(new Item.Properties().food(ModFoods.SALT_LICK)));
    public static final Supplier<Item> CAT_FOOD = regItem("cat_food", () ->
            new CatFoodItem(bowlFoodItem(ModFoods.CAT_FOOD)));

    //sweets
    public static final Supplier<Item> ROCK_CANDY = regItem("rock_candy", () ->
            new Item(new Item.Properties().food(ModFoods.ROCK_CANDY)));
    public static final Supplier<Item> SALTED_CARAMEL = regItem("salted_caramel", () ->
            new Item(new Item.Properties().food(ModFoods.SALTED_CARAMEL)));
    public static final Supplier<Item> SPRING_WATER_TAFFY = regItem("spring_water_taffy", () ->
            new Item(new Item.Properties().food(ModFoods.SPRING_WATER_TAFFY)));

    //meals
    public static final Supplier<Item> BUBCAP_STEW = regItem("bubcap_stew", () ->
            new ConsumableItem(bowlFoodItem(ModFoods.BUBCAP_STEW), true));
    public static final Supplier<Item> GRAY_SLOP = regItem("gray_slop", () ->
            new ConsumableItem(bowlFoodItem(ModFoods.GRAY_SLOP), true));
    public static final Supplier<Item> STONE_SOUP = regItem("stone_soup", () ->
            new ConsumableItem(bowlFoodItem(ModFoods.STONE_SOUP), true));
    public static final Supplier<Item> DIMENSIONAL_STEW = regItem("dimensional_stew", () ->
            new ConsumableItem(bowlFoodItem(ModFoods.DIMENSIONAL_STEW), true));

}