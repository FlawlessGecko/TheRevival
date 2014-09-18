package com.FlawlessGecko.TheRevival.block.Pavers;

import com.FlawlessGecko.TheRevival.block.BlockTR;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class blockPaver extends BlockTR {
public blockPaver(){
	this.setBlockName("blockpaver");
	this.setBlockTextureName("blockpaver");
	this.setHardness(0.4f);
	this.setStepSound(soundTypeStone);
	this.setHarvestLevel("pickaxe", 1);
	this.setHardness(5);
	this.setBlockBounds(0, 0, 0, 1, (float) 0.2, 1);
	this.setLightLevel((float) 0.4);
}
@Override
public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
{
	int meta = world.getBlockMetadata(x, y, z);

	if (entity instanceof EntityLivingBase)
	{
		((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100));
		
	}
	  
}
@Override
public boolean isOpaqueCube()
{
	return false;
}
@SideOnly(Side.CLIENT)
public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
{
    return true;
}
public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side) {
	return true;
}
}
