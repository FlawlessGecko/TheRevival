package com.FlawlessGecko.TheRevival.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockglowingbeacon extends BlockTR {

	public blockglowingbeacon( ) {
		super(Material.glass);

		this.setBlockName("blockglowingbeacon");
		this.setHardness(9);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeGlass);
		this.setTickRandomly(true);
		this.setBlockTextureName("blockglowingbeacon");
		this.setLightLevel(1f);
		
		
		
	}
	  @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 1;
	    }
	  public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side) {
			return true;
		}   
	  @Override
	  public boolean isOpaqueCube()
	  {
	  	return false;
	  }
}