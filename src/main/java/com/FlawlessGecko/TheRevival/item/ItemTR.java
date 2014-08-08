package com.FlawlessGecko.TheRevival.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;
import com.FlawlessGecko.TheRevival.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
//Provides a wrapper so dont need to retype baisc items stuff
public class ItemTR extends Item {
	public ItemTR(){
	
		super();
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		
	}
	  @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }

	    @Override
	    public String getUnlocalizedName(ItemStack itemStack)
	    {
	        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IIconRegister iconRegister)
	    {
	        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	    }

	    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }
	}
	
	

