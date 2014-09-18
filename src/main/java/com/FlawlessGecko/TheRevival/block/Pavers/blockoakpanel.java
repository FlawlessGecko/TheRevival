package com.FlawlessGecko.TheRevival.block.Pavers;

import com.FlawlessGecko.TheRevival.block.BlockTR;

public class blockoakpanel extends BlockTR {
public blockoakpanel(){
	this.setBlockName("blockoakpanel");
	this.setBlockTextureName("blockoakpanel");
	this.setStepSound(soundTypeWood);
	this.setHardness(11);
	
	this.setHarvestLevel("axe", 1);
}
}
