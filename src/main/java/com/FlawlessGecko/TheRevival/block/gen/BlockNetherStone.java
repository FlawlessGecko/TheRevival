package com.FlawlessGecko.TheRevival.block.gen;

import com.FlawlessGecko.TheRevival.block.BlockTR;

public class BlockNetherStone  extends BlockTR{

	public BlockNetherStone(){
		
		this.setBlockName("blocknetherstone");
		this.setBlockTextureName("blocknetherstone");
		
		 this.setStepSound(soundTypeCloth);
		 this.setHarvestLevel("pickaxe", 1);
		 this.setHardness(5);
	}
	
}
