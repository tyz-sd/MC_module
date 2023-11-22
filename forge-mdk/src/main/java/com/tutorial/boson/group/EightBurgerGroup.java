package com.tutorial.boson.group;

import com.tutorial.boson.lbmzxhb.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EightBurgerGroup extends ItemGroup{
    public EightBurgerGroup() {
        super("eightburger_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.eightBurger.get());
    }
}