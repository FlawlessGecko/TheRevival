package com.FlawlessGecko.TheRevival.item;

import java.util.Random;

import com.FlawlessGecko.TheRevival.creativetab.CreativeTabTR;
import com.FlawlessGecko.TheRevival.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class RecipeBlockCrops extends BlockBush implements IGrowable
{

    protected int maxGrowthStage = 3;



    @SideOnly(Side.CLIENT)
    protected IIcon[] iIcon;
    private IIcon[] growth1;
    public RecipeBlockCrops()
    {
     // Basic block setup
        setTickRandomly(true);
        this.setCreativeTab(CreativeTabTR.TR_TAB);
        float f = 0.5F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 1.0F, 0.5F + f);
        setCreativeTab((CreativeTabs)null);
        setHardness(0.0F);
        setStepSound(soundTypeGrass);
        disableStats();
    }

    @Override
    protected boolean canPlaceBlockOn(Block parBlock)
    {
        return parBlock == Blocks.grass;
    }

    public void addGrowStage(World parWorld, Random parRand, int parX, int parY, int parZ)

    {
        int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + 

              MathHelper.getRandomIntegerInRange(parRand, 2,20);

        if (growStage > maxGrowthStage)
        {
         growStage = maxGrowthStage;
        }

        parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return meta >= 3 ? this.growth1[2] : (meta > 0 ? this.growth1[1] : this.growth1[0]);
    }
    
    @Override
    public int getRenderType()
    {
        return 6; 
    }
    public boolean func_149851_a(World world, int x, int y, int z, boolean chances)
    {
        return world.getBlockMetadata(x, y, z) != 3;
    }

    public boolean func_149852_a(World world, Random random, int x, int y, int z)
    {
        return false;
    }
    @Override
    public Item getItemDropped(int exam, Random random, int parFortune)
    {
        return Item.getItemFromBlock(this);
    }
    
 
   
   
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z)
    {
        return ModItems.ItemCatsEyeSeeds;
    }
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        this.checkAndDropBlock(world, x, y, z);
    }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z)
    {
        return this;
    }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
    }

    @Override
	public void func_149853_b(World parWorld, Random parRand, int parX, int parY, int parZ)
    {
        addGrowStage(parWorld, parRand, parX, parY, parZ);
    }
   
}

