package com.FlawlessGecko.TheRevival.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockZombieFlesh extends BlockTR {
public BlockZombieFlesh(){
	this.setBlockTextureName("blockzombieflesh");
	this.setBlockName("blockzombieflesh");
	this.setStepSound(soundTypeStone);
	this.setTickRandomly(true);
	this.setHarvestLevel("pickaxe",1);
	this.setHardness(7);
}

public boolean canCreatureSpawn(EntityZombie entity,World world){
	return true;
}
public int quantityDropped(Random random)
{
    return 4;
}

public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
    return Items.rotten_flesh;
}
}
