package com.FlawlessGecko.TheRevival.block.gen;

import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.creativetab.CreativeTabs;

public class Blockstone extends BlockTR {

	public Blockstone() {
		super(Material.rock);
		
		this.setBlockName("blockstone");
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		this.setStepSound(soundTypeStone);
		this.setBlockTextureName("blockstone");
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(8);
		
	}

	private void blockIIcon() {
		
		
	}

	
		
	}


