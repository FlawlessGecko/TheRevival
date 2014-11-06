package com.FlawlessGecko.TheRevival.block.gen;

import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlackstone extends BlockTR {

	public BlockBlackstone() {
		super(Material.rock);
		
		this.setBlockName("blockblackstone");
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(10);
		this.setBlockTextureName("blockblackstone");
	}

	}

