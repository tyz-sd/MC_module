package com.tutorial.boson.lbmzxhb;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class BurgerSword extends SwordItem {
    public BurgerSword() {
        super(ModItemTier.BURGER, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT));
    }

}
