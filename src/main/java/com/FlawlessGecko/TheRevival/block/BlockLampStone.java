package com.FlawlessGecko.TheRevival.block;

public class BlockLampStone extends BlockTR {
public BlockLampStone(){
	this.setBlockName("blocklampstone");
	this.setBlockTextureName("blocklampstone");
	this.getCanBlockGrass();
	this.setLightLevel(1.0f);
	this.setHardness(1.0f);
	this.setHarvestLevel("pickaxe", 0);
	
	
}
}
