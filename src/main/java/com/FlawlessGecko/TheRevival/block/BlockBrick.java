package com.FlawlessGecko.TheRevival.block;

import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBrick extends BlockTR  {

	public BlockBrick(){
		super();
		this.setBlockName("blockbrick");
		this.setBlockTextureName("blockbrick");
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		this.setHardness(2.0f);
	}

	
	  public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	    @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 0;
	    }
}
