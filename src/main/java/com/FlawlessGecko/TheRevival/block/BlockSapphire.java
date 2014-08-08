package com.FlawlessGecko.TheRevival.block;

import net.minecraft.block.material.Material;

public class BlockSapphire extends BlockTR {

	public BlockSapphire(){
		super(Material.rock);
		this.setBlockName("BlockSapphire");
		this.setBlockTextureName("BlockSapphire");
		this.getCanBlockGrass();
		this.setHardness(4.0f);
		
	}
	
}
