package com.FlawlessGecko.TheRevival.block.craftable;

import net.minecraft.block.material.Material;

import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;


public class blockhotsteel extends BlockTR {

	public blockhotsteel() {
		super(Material.rock);
		
		
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(6);
		this.setBlockTextureName("blockhotsteel");
		this.setBlockName("blockhotsteel");
	}
	
	public boolean canProvidePower()
    {
        return false;
    }

	}
