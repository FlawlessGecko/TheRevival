package com.FlawlessGecko.TheRevival.block;

import java.util.Random;

import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockLamp extends BlockTR {

	public BlockLamp( ) {
		super(Material.glass);

		this.setBlockName("blocklamp");
		this.setHardness(9);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeGlass);
		this.setTickRandomly(true);
		this.setBlockTextureName("blocklamp");
		this.setLightLevel(1f);
		
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		
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
