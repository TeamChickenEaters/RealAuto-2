package com.camerpon900.realauto2.items;

import com.camerpon900.realauto2.RealAuto2;
import com.camerpon900.realauto2.blocks.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by cameron on 20/06/2015.
 */
public class ItemWindmill extends Item
{

    public boolean onItemUse(ItemStack itemStack, EntityPlayer Player, World world, int x, int y, int z, int side, float x2, float y2, float z2) {
        if(!world.isRemote) {
            if(side==1)
                world.setBlock(x,y+1,z, Blocks.blockWindmill);
            return true;
        }

        return false;
    }

}
