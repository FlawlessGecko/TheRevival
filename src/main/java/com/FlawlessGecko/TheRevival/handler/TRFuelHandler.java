package com.FlawlessGecko.TheRevival.handler;

import com.FlawlessGecko.TheRevival.init.ModBlocks;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TRFuelHandler implements IFuelHandler{
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.blockofbones));
		return 1500;
		

}
}
