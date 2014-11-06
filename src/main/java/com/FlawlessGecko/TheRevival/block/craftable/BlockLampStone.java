package com.FlawlessGecko.TheRevival.block.craftable;

import net.minecraft.world.World;

import com.FlawlessGecko.TheRevival.block.BlockTR;

public class BlockLampStone extends BlockTR {
public BlockLampStone(){
	this.setBlockName("blocklampstone");
	this.setBlockTextureName("blocklampstone");
	this.setLightLevel(1.0f);
	this.setHardness(9);
	this.setHarvestLevel("pickaxe", 1);
	
	
}
public int tickRate(World p_149738_1_)
{
    return 2;
}
}
