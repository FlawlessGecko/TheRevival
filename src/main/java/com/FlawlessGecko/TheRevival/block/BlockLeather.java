package com.FlawlessGecko.TheRevival.block;

import java.util.Random;

import com.FlawlessGecko.TheRevival.init.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockLeather extends BlockTR {
 public BlockLeather(){
	 super();
	 this.setBlockName("blockleather");
	 this.setBlockTextureName("blockleather");
	 this.getCanBlockGrass();
	 this.blockMaterial(Material.cloth);
	 this.getAmbientOcclusionLightValue();
	 this.setStepSound(soundTypeCloth);
	 this.setHarvestLevel("axe", 1);
	 this.setHardness(1.0f);
	 
	 
	 
 }

private void blockMaterial(Material cloth) {
	// TODO Auto-generated method stub
	
}
public boolean canCreatureSpawn(EntityCow entity,World world){
	return true;
}
public int quantityDropped(Random random)
{
    return 8;
}

public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
    return Items.leather;
}
}

