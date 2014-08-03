package com.FlawlessGecko.TheRevival.block;

import net.minecraft.block.material.Material;

public class BlockLeather extends BlockTR {
 public BlockLeather(){
	 super();
	 this.setBlockName("blockleather");
	 this.setBlockTextureName("blockleather");
	 this.getCanBlockGrass();
	 this.blockMaterial(Material.cloth);
	 this.getAmbientOcclusionLightValue();
	 
 }

private void blockMaterial(Material cloth) {
	// TODO Auto-generated method stub
	
}
}
