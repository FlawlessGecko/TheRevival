package com.FlawlessGecko.TheRevival.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import ibxm.Player;

public class Itemwoodmallet extends ItemTR {
	public Itemwoodmallet(){
		this.setUnlocalizedName("woodmallet");
		this.setTextureName("woodmallet");
		this.setFull3D();
		this.setHarvestLevel("pickaxe", 2);
		this.setMaxStackSize(1);
		this.setMaxDamage(56);
		
		
	
	
	}
	  public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par4)
	    {
	    	List.add("Used for blocks");

	    }
	  public boolean showDurabilityBar(ItemStack stack)
	    {
	        return stack.isItemDamaged();
	    }
	  public boolean isDamaged(ItemStack stack)
	    {
	        return stack.getItemDamage() > 0;
	    }
	  public double getDurabilityForDisplay(ItemStack stack)
	    {
	        return (double)stack.getItemDamageForDisplay() / (double)stack.getMaxDamage();
	    }
	   public void setDamage(ItemStack stack, int damage)
	    {
	        stack.setItemDamage(damage);

	        if (stack.getItemDamage() < 0)
	        {
	            stack.setItemDamage(0);
	        }
	    }
}
