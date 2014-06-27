package com.FlawlessGecko.TheRevival;

import com.FlawlessGecko.TheRevival.proxy.IProxy;
import com.FlawlessGecko.TheRevival.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID,name =Reference.MOD_NAME,version = Reference.VERSION)
public class TheRevival {
	
	//Where you find your reference to Mod.
	@Mod.Instance(Reference.MOD_ID) 
	public static TheRevival instance;
	
	
	//Handles the Way the code is looked at from server side and client side
	// Like Rendering is on client and placing blocks on server side.
	
	@SidedProxy(clientSide ="com.FlawlessGecko.TheRevival.proxy.ClientProxy",serverSide ="com.FlawlessGecko.TheRevival.proxy.ServerProxy")
	
	//IProxy is a way we can Controls where and when the other Proxys are used
	// Like do we need blocks to render on client side.
	public static IProxy proxy;
	
	// Can be removed to own class meant for seeing blocks in my tab.
	public static CreativeTabs RevivalTab = new CreativeTabs("Revival"){

		@Override
		public Item getTabIconItem() {
			
			return Items.beef;
		}
		
	};
	
	
	public static Block blocklamp;
	public static Block blockstone;
	public static Block blockblackstone;	
	//Registration of Blocks and Items.Also network.
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		blockstone = new Blockstone();
		blockblackstone =new BlockBlackstone();
		blocklamp = new BlockLamp();
		
		GameRegistry.registerBlock(blockblackstone, "blockblackstone").setCreativeTab(RevivalTab);
		GameRegistry.registerBlock(blockstone, "blockstone").setCreativeTab(RevivalTab);
		GameRegistry.registerBlock(blocklamp, "blocklamp").setCreativeTab(RevivalTab);
	}
	//Gui's,recipes.TileEntities.
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
		
		
	}
	// wrap up and checking after other Mods have loaded.
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	
		
		
	}
}
