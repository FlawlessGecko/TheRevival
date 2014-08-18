package com.FlawlessGecko.TheRevival.init;

import com.FlawlessGecko.TheRevival.item.ItemLeafPoker;
import com.FlawlessGecko.TheRevival.item.ItemSapphire;
import com.FlawlessGecko.TheRevival.item.ItemTR;
import com.FlawlessGecko.TheRevival.item.Itemjasper;
import com.FlawlessGecko.TheRevival.reference.Reference;
import com.FlawlessGecko.TheRevival.item.Itemwoodmallet;

import cpw.mods.fml.common.registry.GameRegistry;
//stops the Tinker of registry.
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
//where we declare the Item name and new item
public static final ItemTR ItemLeafPoker = new ItemLeafPoker();
public static final ItemTR jasper = new Itemjasper();
public static final ItemTR sapphire = new ItemSapphire();
public static final ItemTR Itemwoodmallet = new Itemwoodmallet();

//This is Where we register our new blocks
public static void init(){
	GameRegistry.registerItem(ItemLeafPoker, "ItemLeafPoker");
	GameRegistry.registerItem(jasper, "jasper");
	GameRegistry.registerItem(sapphire, "sapphire");
	GameRegistry.registerItem(Itemwoodmallet, "Itemwoodmallet");
}
}