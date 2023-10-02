package com.ordana.spelunkers_delight.reg;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes
    public static final MobEffect COMFORT = BuiltInRegistries.MOB_EFFECT.get(new ResourceLocation("farmersdelight:comfort"));
    public static final MobEffect NOURISHMENT = BuiltInRegistries.MOB_EFFECT.get(new ResourceLocation("farmersdelight:nourishment"));

    //drinks
    public static final FoodProperties TANGLE_BEER = (new FoodProperties.Builder())
            .alwaysEat().effect(new MobEffectInstance(MobEffects.ABSORPTION, SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties SPARKLING_WATER = (new FoodProperties.Builder())
            .alwaysEat().effect(new MobEffectInstance(MobEffects.JUMP, SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties SODA = (new FoodProperties.Builder())
            .alwaysEat().effect(new MobEffectInstance(MobEffects.ABSORPTION, SHORT_DURATION, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, BRIEF_DURATION, 0, false, false), 1.0f).build();
    public static final FoodProperties DIMENSIONAL_MILKSHAKE = (new FoodProperties.Builder())
            .alwaysEat().nutrition(RandomSource.create().nextIntBetweenInclusive(1, 20)).saturationMod(RandomSource.create().nextFloat())
            .build();


    //snacks
    public static final FoodProperties GLOWAMARI = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.6f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties SALT_LICK = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.4f).alwaysEat().fast()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION, 0), 1.0F).build();

    public static final FoodProperties CAT_FOOD = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2f).meat().build();

    //sweets
    public static final FoodProperties ROCK_CANDY = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.1f).fast()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION, 0, false, false), 1.0F).build();
    public static final FoodProperties SALTED_CARAMEL = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.3f).fast()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION, 0, false, false), 1.0F).build();
    public static final FoodProperties SPRING_WATER_TAFFY = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.6f).fast()
            .effect(new MobEffectInstance(MobEffects.JUMP, SHORT_DURATION, 0, false, false), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, BRIEF_DURATION, 0, false, false), 1.0f).build();


    //meals
    public static final FoodProperties BUBCAP_STEW = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f)
            .effect(new MobEffectInstance(COMFORT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties GRAY_SLOP = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8f)
            .effect(new MobEffectInstance(COMFORT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties STONE_SOUP = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(0.8f)
            .effect(new MobEffectInstance(COMFORT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties DIMENSIONAL_STEW = (new FoodProperties.Builder())
            .nutrition(RandomSource.create().nextIntBetweenInclusive(1, 20)).saturationMod(RandomSource.create().nextFloat())
            .build();

}
