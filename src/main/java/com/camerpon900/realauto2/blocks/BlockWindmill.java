package com.camerpon900.realauto2.blocks;

import com.camerpon900.realauto2.Renderer.TileEntityWindmill;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by cameron on 20/06/2015.
 */
public class BlockWindmill extends BlockContainer {

    public BlockWindmill(Material material) {
        super(material);
    }

    public int getRenderType() {
        return -1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return  false;
    }

    public TileEntity createNewTileEntity(World var1, int var2){
        return new TileEntityWindmill();
    }

}
