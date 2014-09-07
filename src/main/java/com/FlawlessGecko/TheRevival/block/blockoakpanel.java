package com.FlawlessGecko.TheRevival.block;

public class blockoakpanel extends BlockTR {
public blockoakpanel(){
	this.setBlockName("blockoakpanel");
	this.setBlockTextureName("blockoakpanel");
	this.setStepSound(soundTypeWood);
	this.setHardness(11);
	
	this.setHarvestLevel("axe", 1);
}
}
