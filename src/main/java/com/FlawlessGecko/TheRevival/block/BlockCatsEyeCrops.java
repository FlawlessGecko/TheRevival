package com.FlawlessGecko.TheRevival.block;

import java.util.ArrayList;
import java.util.Random;

import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;
import com.FlawlessGecko.TheRevival.init.ModBlocks;
import com.FlawlessGecko.TheRevival.item.RecipeBlockCrops;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockCatsEyeCrops extends RecipeBlockCrops
{
	private IIcon[] growth1;
    public BlockCatsEyeCrops()
    {
        // Basic block setup
        setBlockName("therevival:cateyeCrops");
        setBlockTextureName("therevival:blockcatseye");
        this.setCreativeTab(CreativeTabTR.TR_TAB);
        this.setTickRandomly(true);
        float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 1.0F, 0.5F + f );
       
    }

    protected boolean canPlaceBlockOn(Block block)
    {
        return block == Blocks.grass;
    }

  
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        return super.canBlockStay(world, x, y, z);
    }

    
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        int l = world.getBlockMetadata(x, y, z);

        if (l < 3 && random.nextInt(10) == 0)
        {
            ++l;
            world.setBlockMetadataWithNotify(x, y, z, l, 2);
        }

        super.updateTick(world, x, y, z, random);
    }

  
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return meta >= 3 ? this.growth1[2] : (meta > 0 ? this.growth1[1] : this.growth1[0]);
    }

  
    public int getRenderType()
    {
        return 6;
    }

 
    @SuppressWarnings("unused")
	public void DropChance(World world, int x, int y, int z, int item1, float item2, int chance)
    {
        super.dropBlockAsItemWithChance(world, x, y, z, item1, item2, chance);
        
        if (false && !world.isRemote)
        {
            int j1 = 1;

            if (item1 >= 3)
            {
                j1 = 2 + world.rand.nextInt(1);

                if (chance > 0)
                {
                    j1 += world.rand.nextInt(chance + 1);
                }
            }

            for (int k1 = 0; k1 < j1; ++k1)
            {
                this.dropBlockAsItem(world, x, y, z, new ItemStack(Items.ender_eye));
            }
        }
    }

    public Item ItemsDropped(int drop, Random random, int prob)
    {
        return null;
    }

    
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z)
    {
        return Items.ender_eye;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iicon)
    {
        this.growth1 = new IIcon[3];

        for (int i = 0; i < this.growth1.length; ++i)
        {
            this.growth1[i] = iicon.registerIcon(this.getTextureName() + "_stage_" + i);
        }
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        int count = 1;

        if (metadata >= 3)
        {
            count = 2 + world.rand.nextInt(1) + (fortune > 0 ? world.rand.nextInt(fortune + 1) : 0);
        }

        for (int i = 0; i < count; i++)
        {
            ret.add(new ItemStack(Items.ender_eye));
        }

        return ret;
    }
}