package com.FlawlessGecko.TheRevival.block;

import java.util.Random;

import com.FlawlessGecko.TheRevival.init.ModItems;

import net.minecraft.item.Item;

public class blocksapphireore extends BlockTR {
public blocksapphireore(){
	super();
	this.setBlockTextureName("blocksapphireore");
	this.setBlockName("blocksapphireore");
	this.isCollidable();
	this.setHardness(2.0f);
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