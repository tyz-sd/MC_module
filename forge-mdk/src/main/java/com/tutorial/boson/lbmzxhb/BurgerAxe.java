package com.tutorial.boson.lbmzxhb;

import com.tutorial.boson.group.ModGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class BurgerAxe extends AxeItem {
    public BurgerAxe() {
        super(ModItemTier.BURGER, 2, -3f, (new Item.Properties()).group(ModGroup.itemGroup));
    }
}
