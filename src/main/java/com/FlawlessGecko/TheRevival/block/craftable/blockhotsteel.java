package com.FlawlessGecko.TheRevival.block.craftable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;
import com.FlawlessGecko.TheRevival.init.ModBlocks;


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
	public Block onBlockPlacedBy(World world, EntityPlayer player, ItemStack stack, int x, int y, int z, ForgeDirection side, float hitX, float hitY, float hitZ, int meta) {
		return ModBlocks.blocksteel;
	}

}
