package com.camerpon900.realauto2.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

/**
 * Created by cameron on 24/06/2015.
 */
public class Items {

    public static Item itemWindmill;
    public static Item itemRedBread;
    public static Item itemCopperIngot;

    public static void registerVars() {
        itemWindmill = new ItemWindmill().setUnlocalizedName("itemWindmill").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("diamond");
        itemRedBread = new ItemRedBread("itemRedBread", 2, 0.2f, false, new PotionEffect(Potion.moveSpeed.id, 1200, 1), new PotionEffect(Potion.jump.id, 600, 0), new PotionEffect(Potion.regeneration.id, 200, 1)).setAlwaysEdible();
        itemCopperIngot = new ItemCopperIngot().setUnlocalizedName("itemCopperIngot").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setTextureName("realauto2" + ":" + "itemCopperIngot");
    }

    public static void registerItems() {
        GameRegistry.registerItem(itemWindmill, "itemWindmill");
        GameRegistry.registerItem(itemRedBread, "itemRedBread");
        GameRegistry.registerItem(itemCopperIngot, "itemCopperIngot");
    }

}
