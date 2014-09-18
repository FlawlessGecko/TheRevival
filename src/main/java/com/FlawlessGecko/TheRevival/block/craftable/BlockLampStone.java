package com.FlawlessGecko.TheRevival.block.craftable;

import com.FlawlessGecko.TheRevival.block.BlockTR;

public class BlockLampStone extends BlockTR {
public BlockLampStone(){
	this.setBlockName("blocklampstone");
	this.setBlockTextureName("blocklampstone");
	this.setLightLevel(1.0f);
	this.setHardness(9);
	this.setHarvestLevel("pickaxe", 1);
	
	
}
}
