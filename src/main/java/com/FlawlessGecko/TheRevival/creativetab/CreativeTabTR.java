package com.FlawlessGecko.TheRevival.creativetab;

import com.FlawlessGecko.TheRevival.init.ModItems;
import com.FlawlessGecko.TheRevival.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTR {
//We are adding our tab via new creativetab
	
public static final CreativeTabs TR_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
	@Override
	public Item getTabIconItem(){
		return ModItems.Itemironmallet;

}
};
}
