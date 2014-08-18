package com.FlawlessGecko.TheRevival.block;

public class BlockLampWood extends BlockTR {
public BlockLampWood(){
	this.setBlockName("blocklampwood");
	this.setBlockTextureName("blocklampwood");

	this.setLightLevel(1.0f);
	this.setStepSound(soundTypeWood);
	this.setHarvestLevel("axe", 0);
	this.setHardness(9);
}
}
