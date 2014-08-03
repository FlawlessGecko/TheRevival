package com.FlawlessGecko.TheRevival.block;

import net.minecraft.world.World;

public class blocksmoothstone extends BlockTR {
 
	public blocksmoothstone(){
	this.setBlockName("blocksmoothstone");
	this.setBlockTextureName("blocksmoothstone");
	this.setHarvestLevel("pickaxe", 1);
	this.setStepSound(soundTypeStone);
	this.getCanBlockGrass();
	}
}
