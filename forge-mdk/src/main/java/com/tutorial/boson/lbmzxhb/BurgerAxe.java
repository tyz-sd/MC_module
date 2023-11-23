package com.tutorial.boson.lbmzxhb;

import com.tutorial.boson.group.ModGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BurgerAxe extends AxeItem {
    private static final Food food = (new Food.Builder())
            .saturation(20)
            .hunger(0)
            .effect(() -> new EffectInstance(Effects.POISON, 3 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.BLINDNESS, 3 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.HUNGER, 3 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 3 * 20, 1), 1)
            .build();
    public BurgerAxe() {
        super(ModItemTier.BURGER, 2, -3f, (new Item.Properties().food(food)).group(ModGroup.itemGroup));
    }
}
