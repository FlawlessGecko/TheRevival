package com.FlawlessGecko.TheRevival.block.Pavers;

import java.util.List;

import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.init.ModBlocks;

import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class Blockironcover extends BlockTR {

	int x,y,z;
	private World World;
	private AxisAlignedBB Axisaligend;
	private List list;
	private Entity entity;
	
	public Blockironcover(){
		this.setBlockName("blockironcover");
		this.setBlockTextureName("blockironcover");
		this.setHarvestLevel("pickaxe", 5);
		this.setHardness(5);
		this.setStepSound(soundTypeLadder);
		this.setBlockBounds(0, 0, 0, 1,  1, (float)0.25);
		this.setBlockBoundsForItemRender();
		
		
		
}
	@Override
	public boolean isOpaqueCube(){
		return false;
	}

	
}

