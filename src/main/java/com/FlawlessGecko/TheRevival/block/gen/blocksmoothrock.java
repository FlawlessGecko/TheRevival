package com.FlawlessGecko.TheRevival.block.gen;

import com.FlawlessGecko.TheRevival.block.BlockTR;

import net.minecraft.world.World;

public class blocksmoothrock extends BlockTR {
 
	public blocksmoothrock(){
	this.setBlockName("blocksmoothrock");
	this.setBlockTextureName("blocksmoothrock");
	this.setHarvestLevel("pickaxe", 1);
	this.setStepSound(soundTypeStone);

	this.setHardness(8);
	}
}
