package com.FlawlessGecko.TheRevival.block.craftable;

import net.minecraft.world.World;

import com.FlawlessGecko.TheRevival.block.BlockTR;

public class BlockLampWood extends BlockTR {
public BlockLampWood(){
	this.setBlockName("blocklampwood");
	this.setBlockTextureName("blocklampwood");

	this.setLightLevel(1.0f);
	this.setStepSound(soundTypeWood);
	this.setHarvestLevel("axe", 0);
	this.setHardness(9);
}
public int tickRate(World p_149738_1_)
{
    return 2;
}
}
