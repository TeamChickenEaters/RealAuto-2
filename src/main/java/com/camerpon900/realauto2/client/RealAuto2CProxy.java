package com.camerpon900.realauto2.client;

import com.camerpon900.realauto2.Renderer.TileEntityRenderWindmill;
import com.camerpon900.realauto2.Renderer.TileEntityRenderWindmillBase;
import com.camerpon900.realauto2.Renderer.TileEntityWindmill;
import com.camerpon900.realauto2.Renderer.TileEntityWindmillBase;
import com.camerpon900.realauto2.common.RealAuto2CoProxy;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by cameron on 20/06/2015.
 */
public class RealAuto2CProxy extends RealAuto2CoProxy {

    public void registerProxies() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, new TileEntityRenderWindmill());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmillBase.class, new TileEntityRenderWindmillBase());
    }

}
