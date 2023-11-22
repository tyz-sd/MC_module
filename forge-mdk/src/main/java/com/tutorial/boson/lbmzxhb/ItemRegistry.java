package com.tutorial.boson.lbmzxhb;


import com.tutorial.boson.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> eightBurger = ITEMS.register("eight_burger", EightBurger::new);
    public static RegistryObject<Item> burgerSword = ITEMS.register("burger_sword", BurgerSword::new);
}
