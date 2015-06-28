package com.camerpon900.realauto2.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by cameron on 24/06/2015.
 */
public class ItemRedBread extends ItemFood {

    private PotionEffect[] effects;

    public ItemRedBread(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavourite, PotionEffect... effects) {
        super(healAmount, saturationModifier, wolvesFavourite);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName("realauto2" + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabFood);
        this.effects = effects;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);

        for (int i = 0; i < effects.length; i ++) {
            if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
                player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
        }
    }


}
