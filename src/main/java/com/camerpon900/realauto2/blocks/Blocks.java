package com.camerpon900.realauto2.blocks;

import com.camerpon900.realauto2.items.ItemWindmill;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by cameron on 24/06/2015.
 */
public class Blocks {

    public static Block blockWindmill;
    public static Block blockWindmillGround;
    public static Block blockCopOre;

    public static void registerVars() {
        blockWindmill = new BlockWindmill(Material.rock).setBlockName("blockWindmill");
        blockWindmillGround = new BlockWindmillGround(Material.ground).setBlockName("blockWindmillGround").setBlockTextureName("realauto2" + ":" + "BlockWindmillGround").setCreativeTab(CreativeTabs.tabRedstone);
        blockCopOre = new CopperOre(Material.rock).setBlockName("blockCopOre").setBlockTextureName("realauto2" + ":" + "BlockCopOre").setCreativeTab(CreativeTabs.tabBlock);
    }

    public static void registerBlocks() {
        GameRegistry.registerBlock(blockWindmill, "blockWindmill");
        GameRegistry.registerBlock(blockWindmillGround, "blockWindmillGround");
        GameRegistry.registerBlock(blockCopOre, "blockCopOre");
    }

}
