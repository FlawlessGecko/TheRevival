package com.FlawlessGecko.TheRevival.item;

import java.util.List;

import com.FlawlessGecko.TheRevival.TheRevival;
import com.FlawlessGecko.TheRevival.reference.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Itemironmallet extends ItemTR {
	public Itemironmallet(){
		this.setUnlocalizedName("ironmallet");
		this.setTextureName("ironmallet");
		this.setFull3D();
		this.setHarvestLevel("pickaxe", 2);
		this.setMaxStackSize(1);
		this.setMaxDamage(248);
		this.setNoRepair();
		
		
	
	
	}
	 @SideOnly(Side.CLIENT)
	    public boolean isFull3D()
	    {
	        return this.bFull3D;
	    }
	  public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par4)
	    {
	    	List.add("Used for upgraded crafting ");
	    	List.add("More uses per craft");
	    	
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
	    	    public void func_149828_a(World world, int x, int y, int z, int type)
	    	    {
	    	        world.playAuxSFX(1022, x, y, z, 0);
	    	    }

	    	    protected String getCraftSound(){
	    	    	return Reference.MOD_ID+"craft-iron";
	    	    }

}
