package com.FlawlessGecko.TheRevival;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlackstone extends Block {

	public BlockBlackstone() {
		super(Material.rock);
		
		this.setBlockName("blockblackstone");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeStone);
		this.getCanBlockGrass();
		this.captureDrops(true);
		this.blockIIcon();
		this.setBlockTextureName("TheRevival"+ ":" + "blockblackstone");
		this.setBlockName("Blackmarble");
	}

	private void blockIIcon() {
		
		
	}

	
		
	}

