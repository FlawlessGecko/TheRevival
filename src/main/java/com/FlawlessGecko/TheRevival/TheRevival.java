package com.FlawlessGecko.TheRevival;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.oredict.OreDictionary;

import com.FlawlessGecko.TheRevival.Gen.BlocksGenerator;
import com.FlawlessGecko.TheRevival.block.gen.BlockCatsEyeCrops;
import com.FlawlessGecko.TheRevival.handler.ConfigurationHandler;
import com.FlawlessGecko.TheRevival.handler.TRFuelHandler;
import com.FlawlessGecko.TheRevival.init.ModBlocks;
import com.FlawlessGecko.TheRevival.init.ModItems;
import com.FlawlessGecko.TheRevival.init.Recipes;
import com.FlawlessGecko.TheRevival.proxy.IProxy;
import com.FlawlessGecko.TheRevival.reference.Reference;
import com.FlawlessGecko.TheRevival.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID,name =Reference.MOD_NAME,version = Reference.VERSION,guiFactory =Reference.GUI_FACTORY_CLASS)
public class TheRevival {

	
	//Where you find your reference to Mod.
	@Mod.Instance(Reference.MOD_ID) 
	public static TheRevival instance;
	
	
	//Handles the Way the code is looked at from server side and client side
	// Like Rendering is on client and placing blocks on server side.
	
	@SidedProxy(clientSide =Reference.CLIENT_PROXY_CLASS,serverSide =Reference.SERVER_PROXY_CLASS)
	
	//IProxy is a way we can Controls where and when the other Proxys are used
	// Like do we need blocks to render on client side.
	public static IProxy proxy;
	public static BlockCatsEyeCrops RecipeBlockCrops =new BlockCatsEyeCrops();

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
		GameRegistry.registerBlock(RecipeBlockCrops, "RecipeBlockCrops");
		Recipes.init();
		LogHelper.info("Initialization Complete");
		GameRegistry.registerFuelHandler(new TRFuelHandler());

	}
	// wrap up and checking after other Mods have loaded.
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	
		LogHelper.info("Post Initialization Complete");
		//gets all names of currenly register blocks
		
		//for(String oreName : OreDictionary.getOreNames()){
			//LogHelper.info(oreName);
		}
		
	}
//}
