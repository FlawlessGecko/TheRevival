package com.FlawlessGecko.TheRevival.block;

import java.util.Random;

import com.FlawlessGecko.TheRevival.TheRevival;
import com.FlawlessGecko.TheRevival.init.ModBlocks;
import com.FlawlessGecko.TheRevival.reference.Names;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Blockgrass extends BlockTR {
	
	private IIcon[] blockTop, blockSide;
	 
	
	public Blockgrass() {
		super(Material.grass);
		this.setTickRandomly(true);
		this.setBlockName("grass");
		this.setBlockTextureName("grass");
		this.setStepSound(soundTypeGrass);
		
	}

	public void updateTick(World world, int x, int y, int z, Random random) {
		if (!world.isRemote) {
			if (world.getBlockLightValue(x, y + 1, z) < 4
					&& world.getBlockLightOpacity(x, y + 1, z) > 2) {
				world.setBlock(x, y, z, Blocks.dirt);
			} else if (world.getBlockLightValue(x, y + 1, z) >= 9) {
				for (int l = 0; l < 4; ++l) {
					int i1 = x + random.nextInt(3) - 1;
					int j1 = y + random.nextInt(5) - 3;
					int k1 = z + random.nextInt(3) - 1;
					Block block = world.getBlock(i1, j1 + 1, k1);

					if (world.getBlock(i1, j1, k1) == Blocks.dirt
							&& world.getBlockMetadata(i1, j1, k1) == 0
							&& world.getBlockLightValue(i1, j1 + 1, k1) >= 4
							&& world.getBlockLightOpacity(i1, j1 + 1, k1) <= 2) {
						world.setBlock(i1, j1, k1, this);
					}
				}
			}
		}
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		return Blocks.dirt.getItemDropped(0, p_149650_2_, p_149650_3_);
	}
	   @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        this.blockTop = new IIcon[Names.Blocks.BLOCKGRASS.length()];
	        this.blockSide = new IIcon[Names.Blocks.BLOCKDIRT.length()];

	        for (int i = 0; i < Names.Blocks.BLOCKGRASS.length(); i++)
	        {
	            blockTop[i] = iconRegister.registerIcon(String.format(getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	            blockSide[i] = iconRegister.registerIcon(String.format(getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	        }
	    
}}