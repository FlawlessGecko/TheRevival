/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package com.FlawlessGecko.TheRevival.Gen;
import java.util.Random;

import com.FlawlessGecko.TheRevival.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class VillageMine extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		Block checkBlock = world.getBlock(i, j, k);

		while (checkBlock != Blocks.air){
			distanceToAir++;
			checkBlock = world.getBlock(i, j + distanceToAir, k);
		}

		if (distanceToAir > 5){
			return false;
		}
		j += distanceToAir - 1;

		Block blockID = world.getBlock(i, j, k);
		Block blockIDAbove = world.getBlock(i, j+1, k);
		Block blockIDBelow = world.getBlock(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != Blocks.air){
				return false;
			}
			if (blockID == Blocks.air){
				return true;
			}else if (blockID == Blocks.snow ){
				return true;
			}
		}
		return false;
	}

	public VillageMine() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 10, j, k) || !LocationIsValidSpawn(world, i + 10, j, k + 9) || !LocationIsValidSpawn(world, i, j, k + 9))
		{
			return false;
		}

		world.setBlock(i + 0, j + 0, k + 1, Blocks.grass);
		world.setBlock(i + 0, j + 0, k + 2, Blocks.grass);
		world.setBlock(i + 0, j + 0, k + 3, Blocks.grass);
		world.setBlock(i + 0, j + 0, k + 4, Blocks.grass);
		world.setBlock(i + 0, j + 0, k + 5, Blocks.grass);
		world.setBlock(i + 0, j + 0, k + 6, Blocks.grass);
		world.setBlock(i + 0, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 0, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 0, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 0, j + 4, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 4, k + 1, ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 4, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 4, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 4, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 5, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 5, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 5, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 5, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 5, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 6, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 6, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 6, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 6, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 6, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 7, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 7, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 7, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 7, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 7, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 0, j + 7, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 1, j + 0, k + 0, Blocks.grass);
		world.setBlock(i + 1, j + 0, k + 5, Blocks.grass);
		world.setBlock(i + 1, j + 0, k + 6, Blocks.grass);
		world.setBlock(i + 1, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 1, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 1, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 1, j + 4, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 1, j + 4, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 1, j + 5, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 1, j + 5, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 1, j + 6, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 1, j + 6, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 1, j + 7, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 1, j + 7, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 0, k + 0, Blocks.redstone_lamp);
		world.setBlock(i + 2, j + 0, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 0, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 0, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 0, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 0, k + 5, Blocks.redstone_lamp);
		world.setBlock(i + 2, j + 0, k + 6, Blocks.grass);
		world.setBlock(i + 2, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 2, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 2, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 2, j + 1, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 1, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 1, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 1, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 2, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 2, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 2, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 2, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 3, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 3, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 3, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 3, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 3, k + 5, Blocks.redstone_lamp);
		world.setBlock(i + 2, j + 4, k + 6,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 5, k + 6,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 6, k + 6,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 7, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 7, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 7, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 7, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 7, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 7, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 2, j + 7, k + 6,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 0, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 0, k + 1, Blocks.chest, 14, k);
		world.setBlock(i + 3, j + 0, k + 2, Blocks.chest, 14, k);
		world.setBlock(i + 3, j + 0, k + 3, Blocks.chest, 14, k);
		world.setBlock(i + 3, j + 0, k + 4, Blocks.chest, 14, k);
		world.setBlock(i + 3, j + 0, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 3, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 3, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 3, j + 1, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 1, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 2, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 2, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 3, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 3, k + 1, Blocks.chest, 14, k);
		world.setBlock(i + 3, j + 3, k + 2, Blocks.chest, 14, k);
		world.setBlock(i + 3, j + 3, k + 3, Blocks.chest, 14, k);
		world.setBlock(i + 3, j + 3, k + 4, Blocks.chest, 14, k);
		world.setBlock(i + 3, j + 3, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 4, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 5, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 6, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 7, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 3, j + 7, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 0, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 0, k + 1, Blocks.chest, 14, k);
		world.setBlock(i + 4, j + 0, k + 2, Blocks.chest, 14, k);
		world.setBlock(i + 4, j + 0, k + 3, Blocks.chest, 14, k);
		world.setBlock(i + 4, j + 0, k + 4, Blocks.chest, 14, k);
		world.setBlock(i + 4, j + 0, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 4, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 4, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 4, j + 1, k + 4, Blocks.chest, 2, k);
		world.setBlock(i + 4, j + 1, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 2, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 3, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 3, k + 1, Blocks.chest, 14, k);
		world.setBlock(i + 4, j + 3, k + 2, Blocks.chest, 14, k);
		world.setBlock(i + 4, j + 3, k + 3, Blocks.chest, 14, k);
		world.setBlock(i + 4, j + 3, k + 4, Blocks.chest, 14, k);
		world.setBlock(i + 4, j + 3, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 4, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 5, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 6, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 7, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 4, j + 7, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 0, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 0, k + 1, Blocks.chest, 14, k);
		world.setBlock(i + 5, j + 0, k + 2, Blocks.chest, 14, k);
		world.setBlock(i + 5, j + 0, k + 3, Blocks.chest, 14, k);
		world.setBlock(i + 5, j + 0, k + 4, Blocks.chest, 14, k);
		world.setBlock(i + 5, j + 0, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 5, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 5, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 5, j + 1, k + 4, Blocks.chest, 2, k);
		world.setBlock(i + 5, j + 1, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 2, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 3, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 3, k + 1, Blocks.chest, 14, k);
		world.setBlock(i + 5, j + 3, k + 2, Blocks.chest, 14, k);
		world.setBlock(i + 5, j + 3, k + 3, Blocks.chest, 14, k);
		world.setBlock(i + 5, j + 3, k + 4, Blocks.chest, 14, k);
		world.setBlock(i + 5, j + 3, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 4, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 5, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 6, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 7, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 5, j + 7, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 0, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 0, k + 1, Blocks.chest, 14, k);
		world.setBlock(i + 6, j + 0, k + 2, Blocks.chest, 14, k);
		world.setBlock(i + 6, j + 0, k + 3, Blocks.chest, 14, k);
		world.setBlock(i + 6, j + 0, k + 4, Blocks.chest, 14, k);
		world.setBlock(i + 6, j + 0, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 6, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 6, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 6, j + 1, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 1, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 2, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 2, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 3, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 3, k + 1, Blocks.chest, 14, k);
		world.setBlock(i + 6, j + 3, k + 2, Blocks.chest, 14, k);
		world.setBlock(i + 6, j + 3, k + 3, Blocks.chest, 14, k);
		world.setBlock(i + 6, j + 3, k + 4, Blocks.chest, 14, k);
		world.setBlock(i + 6, j + 3, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 4, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 5, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 6, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 7, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 6, j + 7, k + 7,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 0, k + 0, Blocks.redstone_lamp);
		world.setBlock(i + 7, j + 0, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 0, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 0, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 0, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 0, k + 5, Blocks.redstone_lamp);
		world.setBlock(i + 7, j + 0, k + 6, Blocks.grass);
		world.setBlock(i + 7, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 7, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 7, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 7, j + 1, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 1, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 1, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 1, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 2, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 2, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 2, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 2, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 3, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 3, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 3, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 3, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 3, k + 5, Blocks.redstone_lamp);
		world.setBlock(i + 7, j + 4, k + 6,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 5, k + 6,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 6, k + 6,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 7, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 7, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 7, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 7, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 7, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 7, k + 5,ModBlocks.blockblackstone);
		world.setBlock(i + 7, j + 7, k + 6,ModBlocks.blockblackstone);
		world.setBlock(i + 8,k, j + 0, Blocks.grass);
		world.setBlock(i + 8,k, j + 0, Blocks.grass);
		world.setBlock(i + 8,k, j + 0, Blocks.grass);
		world.setBlock(i + 8,k, j + 0, Blocks.grass);
		world.setBlock(i + 8,k, j + 0, Blocks.grass);
		world.setBlock(i + 8,k, j + 0, Blocks.grass);
		world.setBlock(i + 8,k, j + 4, ModBlocks.blockblackstone);
		world.setBlock(i + 8,k, j + 4, ModBlocks.blockblackstone);
		world.setBlock(i + 8,k, j + 5, ModBlocks.blockblackstone);
		world.setBlock(i + 8,k, j + 5, ModBlocks.blockblackstone);
		world.setBlock(i + 8,k, j + 6, ModBlocks.blockblackstone);
		world.setBlock(i + 8,k, j + 6, ModBlocks.blockblackstone);
		world.setBlock(i + 8,k, j + 7, ModBlocks.blockblackstone);
		world.setBlock(i + 8,k, j + 7, ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 0, k + 0, Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 1, Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 2, Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 3, Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 4, Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 5, Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 6, Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 9, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 9, j + 4, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 4, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 4, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 4, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 4, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 5, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 5, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 5, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 5, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 5, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 6, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 6, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 6, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 6, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 6, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 7, k + 0,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 7, k + 1,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 7, k + 2,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 7, k + 3,ModBlocks.blockblackstone);
		world.setBlock(i + 9, j + 7, k + 4,ModBlocks.blockblackstone);
		world.setBlock(i + 10, j + 0, k + 0, Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 1, Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 2, Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 3, Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 4, Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 5, Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 6, Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 7, Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 8,Blocks.grass);
		world.setBlock(i + 10, j + 0, k + 9, Blocks.grass);
		world.setBlock(i + 1, j + 0, k + 1, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 0, k + 2, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 0, k + 3, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 0, k + 4, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 1, k + 1, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 1, k + 2, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 1, k + 3, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 1, k + 4, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 2, k + 1, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 2, k + 2, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 2, k + 3, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 2, k + 4, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 3, k + 1, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 3, k + 2, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 3, k + 3, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 3, k + 4, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 4, k + 1, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 4, k + 2, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 4, k + 3, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 4, k + 4, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 5, k + 1, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 5, k + 2, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 5, k + 3, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 5, k + 4, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 6, k + 1, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 6, k + 2, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 6, k + 3, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 6, k + 4, Blocks.lava, 8,k);
		world.setBlock(i + 1, j + 7, k + 1, Blocks.lava);
		world.setBlock(i + 1, j + 7, k + 2, Blocks.lava);
		world.setBlock(i + 1, j + 7, k + 3, Blocks.lava);
		world.setBlock(i + 1, j + 7, k + 4, Blocks.lava);
		world.setBlock(i + 2, j + 2, k + 5, Blocks.redstone_torch, 3, k);
		world.setBlock(i + 3, j + 0, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 3, j + 1, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 3, j + 2, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 3, j + 3, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 3, j + 4, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 3, j + 5, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 3, j + 6, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 3, j + 7, k + 6, Blocks.lava);
		world.setBlock(i + 4, j + 0, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 4, j + 1, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 4, j + 2, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 4, j + 3, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 4, j + 4, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 4, j + 5, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 4, j + 6, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 4, j + 7, k + 6, Blocks.lava);
		world.setBlock(i + 5, j + 0, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 5, j + 1, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 5, j + 2, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 5, j + 3, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 5, j + 4, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 5, j + 5, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 5, j + 6, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 5, j + 7, k + 6, Blocks.lava);
		world.setBlock(i + 6, j + 0, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 6, j + 1, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 6, j + 2, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 6, j + 3, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 6, j + 4, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 6, j + 5, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 6, j + 6, k + 6, Blocks.lava, 8,k);
		world.setBlock(i + 6, j + 7, k + 6, Blocks.lava);
		world.setBlock(i + 7, j + 2, k + 5, Blocks.redstone_torch, 1, k);
		world.setBlock(i + 8,k, j + 0, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 0, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 0, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 0, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 1, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 1, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 1, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 1, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 2, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 2, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 2, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 2, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 3, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 3, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 3, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 3, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 4, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 4, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 4, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 4, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 5, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 5, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 5, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 5, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 6, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 6, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 6, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 6, Blocks.lava, 8,k);
		world.setBlock(i + 8,k, j + 7, Blocks.lava);
		world.setBlock(i + 8,k, j + 7, Blocks.lava);
		world.setBlock(i + 8,k, j + 7, Blocks.lava);
		world.setBlock(i + 8,k, j + 7, Blocks.lava);

		return true;
	}
}