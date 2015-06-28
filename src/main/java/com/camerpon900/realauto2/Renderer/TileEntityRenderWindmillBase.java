package com.camerpon900.realauto2.Renderer;

import com.camerpon900.realauto2.RealAuto2;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by cameron on 21/06/2015.
 */
public class TileEntityRenderWindmillBase extends TileEntitySpecialRenderer {

    private final ResourceLocation textureWindmillBase = new ResourceLocation(RealAuto2.modid, "model/windmillBase.png");

    private int textureWidth = 32;
    private int textureHeight = 32;

    private float pixel = 1F/15F;

    public void renderTileEntityAt(TileEntity tileEntity, double distX, double distY, double distZ, float f) {
        GL11.glPushMatrix();
            GL11.glTranslatef((float)distX,(float)distY,(float)distZ);

            Tessellator tessellator = Tessellator.instance;
            bindTexture(textureWindmillBase);
            tessellator.startDrawingQuads();
            {

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 1) {
                    tessellator.addVertexWithUV(0.5,pixel*5,0.5,1F/textureWidth*(32),1F/textureHeight*(32));
                    tessellator.addVertexWithUV(0.5,pixel*5,0,1F/textureWidth*(32),1F/textureHeight*(8+16));
                    tessellator.addVertexWithUV(0,pixel*5,0,1F/textureWidth*(8+16),1F/textureHeight*(8+16));
                    tessellator.addVertexWithUV(0,pixel*5,0.5,1F/textureWidth*(8+16),1F/textureHeight*(32));
                }

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 2) {
                    tessellator.addVertexWithUV(0.5,pixel*5,1,1F/textureWidth*(32),1F/textureHeight*(8+16));
                    tessellator.addVertexWithUV(0.5,pixel*5,0,1F/textureWidth*(32),1F/textureHeight*(8));
                    tessellator.addVertexWithUV(0,pixel*5,0,1F/textureWidth*(8+16),1F/textureHeight*(8));
                    tessellator.addVertexWithUV(0,pixel*5,1,1F/textureWidth*(8+16),1F/textureHeight*(8+16));
                }

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 3) {
                    tessellator.addVertexWithUV(0.5,pixel*5,1,1F/textureWidth*(32),1F/textureHeight*(8));
                    tessellator.addVertexWithUV(0.5,pixel*5,0.5,1F/textureWidth*(32),1F/textureHeight*(0));
                    tessellator.addVertexWithUV(0,pixel*5,0.5,1F/textureWidth*(8+16),1F/textureHeight*(0));
                    tessellator.addVertexWithUV(0,pixel*5,1,1F/textureWidth*(8+16),1F/textureHeight*(8));
                }

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 4) {
                    tessellator.addVertexWithUV(1,pixel*5,0.5,1F/textureWidth*(8+16),1F/textureHeight*(32));
                    tessellator.addVertexWithUV(1,pixel*5,0,1F/textureWidth*(8+16),1F/textureHeight*(8+16));
                    tessellator.addVertexWithUV(0,pixel*5,0,1F/textureWidth*(8),1F/textureHeight*(8+16));
                    tessellator.addVertexWithUV(0,pixel*5,0.5,1F/textureWidth*(8),1F/textureHeight*(32));
                }

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 5) {
                    tessellator.addVertexWithUV(1,pixel*5,1,1F/textureWidth*(8+16),1F/textureHeight*(8+16));
                    tessellator.addVertexWithUV(1,pixel*5,0,1F/textureWidth*(8+16),1F/textureHeight*8);
                    tessellator.addVertexWithUV(0,pixel*5,0,1F/textureWidth*8,1F/textureHeight*8);
                    tessellator.addVertexWithUV(0,pixel*5,1,1F/textureWidth*8,1F/textureHeight*(8+16));
                }

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 6) {
                    tessellator.addVertexWithUV(1,pixel*5,1,1F/textureWidth*(8+16),1F/textureHeight*(8));
                    tessellator.addVertexWithUV(1,pixel*5,0.5,1F/textureWidth*(8+16),1F/textureHeight*(0));
                    tessellator.addVertexWithUV(0,pixel*5,0.5,1F/textureWidth*(8),1F/textureHeight*(0));
                    tessellator.addVertexWithUV(0,pixel*5,1,1F/textureWidth*(8),1F/textureHeight*(8));
                }

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 7) {
                    tessellator.addVertexWithUV(1,pixel*5,0.5,1F/textureWidth*(8+16),1F/textureHeight*(8));
                    tessellator.addVertexWithUV(1,pixel*5,0,1F/textureWidth*(8+16),1F/textureHeight*(0));
                    tessellator.addVertexWithUV(0.5,pixel*5,0,1F/textureWidth*(8),1F/textureHeight*(0));
                    tessellator.addVertexWithUV(0.5,pixel*5,0.5,1F/textureWidth*(8),1F/textureHeight*(8));
                }

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 8) {
                    tessellator.addVertexWithUV(1,pixel*5,1,1F/textureWidth*(8+16),1F/textureHeight*(8+16));
                    tessellator.addVertexWithUV(1,pixel*5,0,1F/textureWidth*(8+16),1F/textureHeight*(8));
                    tessellator.addVertexWithUV(0.5,pixel*5,0,1F/textureWidth*(8),1F/textureHeight*(8));
                    tessellator.addVertexWithUV(0.5,pixel*5,1,1F/textureWidth*(8),1F/textureHeight*(8+16));
                }

                if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord,tileEntity.yCoord,tileEntity.zCoord) == 9) {
                    tessellator.addVertexWithUV(1,pixel*5,1,1F/textureWidth*(8+16),1F/textureHeight*(8));
                    tessellator.addVertexWithUV(1,pixel*5,0.5,1F/textureWidth*(8+16),1F/textureHeight*(0));
                    tessellator.addVertexWithUV(0.5,pixel*5,0.5,1F/textureWidth*(8),1F/textureHeight*(0));
                    tessellator.addVertexWithUV(0.5,pixel*5,1,1F/textureWidth*(8),1F/textureHeight*(8));
                }
            }
            tessellator.draw();
        GL11.glPopMatrix();
    }

}
