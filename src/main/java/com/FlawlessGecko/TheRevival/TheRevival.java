package com.FlawlessGecko.TheRevival;

import com.FlawlessGecko.TheRevival.Gen.BlocksGenerator;
import com.FlawlessGecko.TheRevival.block.BlockBlackstone;
import com.FlawlessGecko.TheRevival.block.BlockLamp;
import com.FlawlessGecko.TheRevival.block.Blockstone;
import com.FlawlessGecko.TheRevival.block.Blocktile;
import com.FlawlessGecko.TheRevival.handler.ConfigurationHandler;
import com.FlawlessGecko.TheRevival.init.ModBlocks;
import com.FlawlessGecko.TheRevival.init.ModItems;
import com.FlawlessGecko.TheRevival.init.Recipes;
import com.FlawlessGecko.TheRevival.proxy.ClientProxy;
import com.FlawlessGecko.TheRevival.proxy.IProxy;
import com.FlawlessGecko.TheRevival.reference.Reference;
import com.FlawlessGecko.TheRevival.utility.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID,name =Reference.MOD_NAME,version = Reference.VERSION,guiFactory =Reference.GUI_FACTORY_CLASS)
public class TheRevival {
	//nbt stores our data for itemstack like enchant/damage/name tags/books
	//items stack store the nbt data //named binary tag
	//nbt stroes extra data like itemstack
	//nbt Read and writes from disk
	
	//Where you find your reference to Mod.
	@Mod.Instance(Reference.MOD_ID) 
	public static TheRevival instance;
	
	
	//Handles the Way the code is looked at from server side and client side
	// Like Rendering is on client and placing blocks on server side.
	
	@SidedProxy(clientSide =Reference.CLIENT_PROXY_CLASS,serverSide =Reference.SERVER_PROXY_CLASS)
	
	//IProxy is a way we can Controls where and when the other Proxys are used
	// Like do we need blocks to render on client side.
	public static IProxy proxy;
	
	public static BlocksGenerator worldGen = new BlocksGenerator();
	
	//Registration of Blocks and Items.Also network.
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Loads The config for blocks,items,
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Pre Initialization Complete");
		
		proxy.registerRenderThings();
		ModItems.init();
		ModBlocks.init();
		
		
		//move these to ModBlocks
		
		GameRegistry.registerWorldGenerator(worldGen, 1);
		
	}
	//Gui and handlers
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		Recipes.init();
		LogHelper.info("Initialization Complete");
		
	}
	// wrap up and checking after other Mods have loaded.
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	
		LogHelper.info("Post Initialization Complete");
		//gets all names of currenly register blocks
		
		/*for(String oreName : OreDictionary.getOreNames()){
			LogHelper.info(oreName);
		}
		*/
	}
}
