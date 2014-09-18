package com.FlawlessGecko.TheRevival.block.craftable;

import com.FlawlessGecko.TheRevival.block.BlockTR;

public class blockbluesparkles extends BlockTR {
public blockbluesparkles(){
	this.setBlockName("blockbluesparkles");
	this.setBlockTextureName("blockbluesparkles");
	this.setStepSound(soundTypeStone);
	this.setHardness(11);
	this.setLightLevel(1);
	this.setLightOpacity(1);
	this.setHarvestLevel("pickaxe", 1);
}
}