package com.camerpon900.realauto2.Renderer;

import com.camerpon900.realauto2.RealAuto2;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by cameron on 20/06/2015.
 */
public class TileEntityRenderWindmill extends TileEntitySpecialRenderer {

    private final ResourceLocation textureWindmill = new ResourceLocation("realauto2", "model/windmill.png");

    private int textureWidth = 64;
    private int textureHeight = 32;

    public void renderTileEntityAt(TileEntity tileEntity, double distX, double distY, double distZ, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)distX,(float)distY,(float)distZ);

        Tessellator tessellator = Tessellator.instance;
        bindTexture(textureWindmill);
        tessellator.startDrawingQuads();
        {
            tessellator.addVertexWithUV(0,0,1,1,1);
            tessellator.addVertexWithUV(0,1,1,1/4,1/4);
            tessellator.addVertexWithUV(0,1,0,0,0);
            tessellator.addVertexWithUV(0,0,0,0,1);
            System.out.println("Bruh");
        }
        tessellator.draw();
        GL11.glPopMatrix();
    }

}
