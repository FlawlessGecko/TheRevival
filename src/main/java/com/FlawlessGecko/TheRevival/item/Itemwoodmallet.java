package com.FlawlessGecko.TheRevival.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
		this.setMaxDamage(128);
		this.setNoRepair();
		
		
	
	
	}
	 @SideOnly(Side.CLIENT)
	    public boolean isFull3D()
	    {
	        return this.bFull3D;
	    }
	  public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par4)
	    {
	    	List.add("Used for crafting");
	    	
	    }

	    	   @SideOnly(Side.CLIENT)
	    	    public boolean hasEffect(ItemStack par1ItemStack)           
	    	    {
	    	        return true;
	    	    }
	    	   
	    	   
	    	    @Override
	    	    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
	    	    {
	    	        return false;
	    	    }

	    	    @Override
	    	    public boolean getShareTag()
	    	    {
	    	        return true;
	    	    }

	    	    public boolean hasContainerItem(ItemStack itemStack)
	    	    {
	    	       return true;
	    	    }
	    	    @Override
	    	    public ItemStack getContainerItem(ItemStack itemStack)
	    	    {
	    	        ItemStack stack = itemStack.copy();

	    	        stack.setItemDamage(stack.getItemDamage() + 1);
	    	        stack.stackSize = 1;
	    	        
	    	        return stack;
	    	    }
	    	}
