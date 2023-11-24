package com.tutorial.boson.lbmzxhb;


import com.tutorial.boson.Utils;
import com.tutorial.boson.group.ModGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemRegistry {
    private static final Food food = (new Food.Builder())
            .saturation(20)
            .hunger(0)
            .effect(() -> new EffectInstance(Effects.POISON, 3 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.BLINDNESS, 3 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.HUNGER, 3 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 3 * 20, 1), 1)
            .build();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> eightBurger = ITEMS.register("eight_burger", EightBurger::new);
    public static RegistryObject<Item> burgerSword = ITEMS.register("burger_sword", BurgerSword::new);
    public static final RegistryObject<Item> burgerAxe = ITEMS.register("burger_axe", BurgerAxe::new);
    public static final RegistryObject<Item> burgerHelmet = ITEMS.register("burger_helmet", () -> new ArmorItem(ModArmorMaterial.BURGER, EquipmentSlotType.HEAD, (new Item.Properties().food(food)).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> burgerChestplate = ITEMS.register("burger_chestplate", () -> new ArmorItem(ModArmorMaterial.BURGER, EquipmentSlotType.CHEST, (new Item.Properties().food(food)).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> burgerLeggings = ITEMS.register("burger_leggings", () -> new ArmorItem(ModArmorMaterial.BURGER, EquipmentSlotType.LEGS, (new Item.Properties().food(food)).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> burgerBoots = ITEMS.register("burger_boots", () -> new ArmorItem(ModArmorMaterial.BURGER, EquipmentSlotType.FEET, (new Item.Properties().food(food)).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> burgerBlock = ITEMS.register("burger_block", () -> new BlockItem(BlockRegistry.burgerBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));

}
