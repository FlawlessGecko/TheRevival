package com.FlawlessGecko.TheRevival.item;

import com.FlawlessGecko.TheRevival.TheRevival;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;


public class ItemCatsEyeSeeds extends ItemTR implements IPlantable
{
    private Block seeds;
    /** BlockID of the block the seeds can be planted on. */
    private Block soilBlockID;

    public ItemCatsEyeSeeds()
    {
    
        this.setTextureName("catseyeseeds");
        
    }

   
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int node, float node1, float n, float d)
    {
        if (node != 1)
        {
            return false;
        }
        else if (player.canPlayerEdit(x, y, z, node, itemstack) && player.canPlayerEdit(x, y + 1, z, node, itemstack))
        {
            if (world.getBlock(x, y, z).canSustainPlant(world, x, y, z, ForgeDirection.UP, this) && world.isAirBlock(x, y + 1, z)&&world.isBlockIndirectlyGettingPowered(x, y, z))
            {
                world.setBlock(x, y + 1, z, this.seeds);
                --itemstack.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
    {
        return seeds == TheRevival.RecipeBlockCrops ? EnumPlantType.Water : EnumPlantType.Crop;
    }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z)
    {
        return seeds;
    }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
    {
        return 3;
    }
}