
package com.FlawlessGecko.TheRevival.Gen;
 
import java.util.Random;
 



import com.FlawlessGecko.TheRevival.TheRevival;
import com.FlawlessGecko.TheRevival.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
 
public class BlocksGenerator implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }
 
    private void generateEnd(World world, Random random, int x, int z)
    {
 
    }
 
    private void generateSurface(World world, Random random, int x, int z)
    {
    	
    	this.Add(ModBlocks.blockjasperore, world, random, x, z, 16, 16, 4 + random.nextInt(8), 5, 15, 50);
        this.Add(ModBlocks.blockblackstone, world, random, x, z, 16, 16, 4 + random.nextInt(25), 5, 15, 50);
        this.Add(ModBlocks.blockstone, world, random, x, z, 16, 16, 4 + random.nextInt(25), 5, 15, 50);
        this.Add(ModBlocks.blocksapphireore, world, random, x, z, 16, 16, 4 + random.nextInt(8), 5, 15, 50);
        this.Add(ModBlocks.blockdecomposedgranite, world, random, x, z, 16, 16, 4 + random.nextInt(15), 5, 15, 50);
        this.Add(ModBlocks.blocksmoothrock, world, random, x, z, 16, 16, 4 + random.nextInt(25), 5, 15, 50);
   
    }
 
    private void generateNether(World world, Random random, int x, int z)
    {
        int Xcoord = x + random.nextInt(16);
        int Ycoord = 10 + random.nextInt(128);
        int Zcoord = z + random.nextInt(16);
     
    }
 
     
    public void Add(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        assert maxY > minY ;
        assert maxX > 0 && maxX <= 16 ;
        assert minY > 0 ;
        assert maxY < 256 && maxY > 0 ; 
        assert maxZ > 0 && maxZ <= 16  ;
 
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}

