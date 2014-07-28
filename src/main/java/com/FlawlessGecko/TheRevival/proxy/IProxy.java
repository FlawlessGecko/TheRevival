package com.FlawlessGecko.TheRevival.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;

// IProxy is where it can Adjust where stuff is needed for proxys without chaning all.

public interface IProxy {

	
	public void registerRenderThings();
	public void registerTileEntitySpecialRenderer();

	
}
