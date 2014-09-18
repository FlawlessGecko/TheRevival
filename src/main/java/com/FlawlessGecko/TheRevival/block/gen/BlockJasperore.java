package com.FlawlessGecko.TheRevival.block.gen;

import java.util.Random;

import com.FlawlessGecko.TheRevival.TheRevival;
import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.init.ModItems;
import com.FlawlessGecko.TheRevival.item.ItemTR;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockJasperore extends BlockTR {
public BlockJasperore(){
	super();
	this.setBlockTextureName("blockjasper");
	this.setBlockName("blockjasper");
	this.isCollidable();
	this.setHardness(7);
	this.setHarvestLevel("pickaxe", 1);
	
	
	
}
public int quantityDropped(Random p_149745_1_)
{
    return 10;
}

public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
    return ModItems.jasper;
}

}
	

