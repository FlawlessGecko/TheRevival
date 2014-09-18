package com.FlawlessGecko.TheRevival.block.gen;

import java.util.Random;

import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.init.ModItems;

import net.minecraft.item.Item;

public class blocksapphireore extends BlockTR {
public blocksapphireore(){
	super();
	this.setBlockTextureName("blocksapphireore");
	this.setBlockName("blocksapphireore");
	this.isCollidable();
	this.setHardness(8);
	this.setHarvestLevel("pickaxe", 2);
	
	
	
}
public int quantityDropped(Random p_149745_1_)
{
    return 10;
}

public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
    return ModItems.sapphire;
}

}