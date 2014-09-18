package com.FlawlessGecko.TheRevival.block.craftable;

import com.FlawlessGecko.TheRevival.block.BlockTR;

import net.minecraft.block.material.Material;

public class BlockSapphire extends BlockTR {

	public BlockSapphire(){
		super(Material.rock);
		this.setBlockName("BlockSapphire");
		this.setBlockTextureName("BlockSapphire");
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(8);
		
	}
	
}
