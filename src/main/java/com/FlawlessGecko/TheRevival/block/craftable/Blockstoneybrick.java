package com.FlawlessGecko.TheRevival.block.craftable;

import com.FlawlessGecko.TheRevival.block.BlockTR;

public class Blockstoneybrick extends BlockTR {
public Blockstoneybrick(){
	super();
	this.setBlockName("blockstoneybrick");
	this.setBlockTextureName("blockstoneybrick");
	this.setHarvestLevel("pickaxe", 1);
	this.setHardness(7);
	this.setStepSound(soundTypeStone);
	
}
}
