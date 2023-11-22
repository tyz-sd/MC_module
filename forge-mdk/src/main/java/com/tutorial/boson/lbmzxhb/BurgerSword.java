package com.tutorial.boson.lbmzxhb;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BurgerSword extends SwordItem {
    private static final Food food = (new Food.Builder())
        .saturation(20)
        .hunger(0)
        .effect(() -> new EffectInstance(Effects.POISON, 3 * 20, 1), 1)
        .effect(() -> new EffectInstance(Effects.BLINDNESS, 3 * 20, 1), 1)
        .effect(() -> new EffectInstance(Effects.HUNGER, 3 * 20, 1), 1)
        .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 3 * 20, 1), 1)
        .build();
    public BurgerSword() {
        super(ModItemTier.BURGER, 3, -2.4F, new Item.Properties().food(food).group(ItemGroup.COMBAT));
    }

}
