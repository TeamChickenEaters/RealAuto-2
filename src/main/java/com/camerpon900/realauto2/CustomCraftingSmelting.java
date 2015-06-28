package com.camerpon900.realauto2;

import com.camerpon900.realauto2.blocks.Blocks;
import com.camerpon900.realauto2.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * Created by cameron on 25/06/2015.
 */
public class CustomCraftingSmelting {

    public static void registerSmelting() {
        GameRegistry.addSmelting(Blocks.blockCopOre, new ItemStack(Items.itemCopperIngot), 0.5f);
    }

}
