package com.camerpon900.realauto2;

import com.camerpon900.realauto2.items.Items;
import com.camerpon900.realauto2.Renderer.TileEntityWindmill;
import com.camerpon900.realauto2.Renderer.TileEntityWindmillBase;
import com.camerpon900.realauto2.blocks.Blocks;
import com.camerpon900.realauto2.common.RealAuto2CoProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="realauto2", name="RealAuto 2", version="1.7.2-10")
public class RealAuto2
{

    public static String modid = "realauto2";

    @ Mod.Instance("realauto2")
    public static RealAuto2 instance;

    @SidedProxy(clientSide="com.camerpon900.realauto2.client.RealAuto2CProxy",serverSide="com.camerpon900.realauto2.common.RealAuto2CoProxy")
    public static RealAuto2CoProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Items.registerVars();
        Items.registerItems();

        Blocks.registerVars();
        Blocks.registerBlocks();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.registerProxies();
        GameRegistry.registerTileEntity(TileEntityWindmill.class, "Windmill");
        GameRegistry.registerTileEntity(TileEntityWindmillBase.class, "WindmillBase");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}
