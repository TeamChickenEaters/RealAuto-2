package com.camerpon900.realauto2.blocks;

import com.camerpon900.realauto2.RealAuto2;
import com.camerpon900.realauto2.Renderer.TileEntityWindmillBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

/**
 * Created by cameron on 20/06/2015.
 */
public class BlockWindmillGround extends BlockContainer{

    public BlockWindmillGround(Material material) {
        super(material);

        this.setBlockBounds(0,0,0,1,0.3f,1);
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public int getRenderType() {
        return -1;
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock) {
        updateTheBlockStructure(world, x, y, z);
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        updateTheBlockStructure(world, x, y, z);
    }

    public void updateTheBlockStructure(World world, int x, int y, int z) {
        isMultiBlockStructure(world, x, y, z);
    }

    public boolean isMultiBlockStructure(World world, int x1, int y1, int z1) {
        boolean mStructure = false;

        boolean checkCurrentStructure = true;

        for(int x2 = 0; x2 < 3; x2++) {
            for(int z2 = 0; z2 < 3; z2++) {
                if(!mStructure) {
                    checkCurrentStructure = true;

                    for(int x3 = 0; x3 < 3; x3++) {
                        for(int z3 = 0; z3 < 3; z3++) {
                            if(checkCurrentStructure && !world.getBlock(x1+x2-x3,y1,z1+z2-z3).equals(Blocks.blockWindmillGround)) {
                                checkCurrentStructure = false;
                            }
                        }
                    }

                    if(checkCurrentStructure) {
                        for(int x3 = 0; x3 < 3; x3++){
                            for(int z3 = 0; z3 < 3; z3++) {
                                world.setBlockMetadataWithNotify(x1+x2-x3, y1, z1+z2-z3, x3*3+z3, 2);
                            }
                        }
                    }
                }

                mStructure = checkCurrentStructure;
            }
        }

        if(mStructure) return true;

        if(world.getBlockMetadata(x1, y1, z1) > 0) world.setBlockMetadataWithNotify(x1,y1,z1,0,3);

        return false;
    }

    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityWindmillBase();
    }

}
