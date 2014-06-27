package com.FlawlessGecko.TheRevival;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.creativetab.CreativeTabs;

public class Blockstone extends Block {

	public Blockstone() {
		super(Material.rock);
		
		this.setBlockName("blockstone");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeStone);
		this.getCanBlockGrass();
		this.captureDrops(true);
		this.blockIIcon();
		this.setBlockTextureName("TheRevival"+ ":" + "blockstone");
		this.setBlockName("Granite");
	}

	private void blockIIcon() {
		
		
	}

	
		
	}


