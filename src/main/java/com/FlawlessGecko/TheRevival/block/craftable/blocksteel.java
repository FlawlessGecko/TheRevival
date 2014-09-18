package com.FlawlessGecko.TheRevival.block.craftable;

import ibxm.Player;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;

public class blocksteel extends BlockTR {

	public blocksteel() {
		super(Material.rock);
		
		
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(10);
		this.setBlockTextureName("blocksteel");
		this.setBlockName("blocksteel");
	}
	
	public boolean canProvidePower()
    {
        return false;
    }

	}

