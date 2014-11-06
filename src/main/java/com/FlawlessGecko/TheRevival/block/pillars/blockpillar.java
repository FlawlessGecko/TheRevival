package com.FlawlessGecko.TheRevival.block.pillars;

import com.FlawlessGecko.TheRevival.block.BlockTR;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class blockpillar extends BlockTR {
private World world;
@SideOnly(Side.CLIENT)
private IIcon sideicon;
@SideOnly(Side.CLIENT)
private IIcon bottemicon;
@SideOnly(Side.CLIENT)
private IIcon blockicon;






	public blockpillar(){
	this.setBlockName("blockpillar");
	this.setBlockTextureName("blockpillar");
	this.isCollidable();
	this.setHarvestLevel("pickaxe", 2);
	this.setHardness(15);
}
public boolean isCollidable()
{
    return true;
}
@Override
@SideOnly(Side.CLIENT)
public void registerBlockIcons (IIconRegister iconRegister)
{
    this.blockIcon = iconRegister.registerIcon("therevival:blockpillar_top");
    this.sideicon = iconRegister.registerIcon("therevival:blockpillar_side");
    this.bottemicon = iconRegister.registerIcon("therevival:blockpillar_top");
}

@SideOnly(Side.CLIENT)
public IIcon TopIcon(int side)
{
    return this.blockIcon;
}
@SideOnly(Side.CLIENT)
public IIcon sideIcon(int side)
{
    return this.sideicon;
}
@SideOnly(Side.CLIENT)
public IIcon bottemIcon(int side)
{
    return this.bottemicon;
}

@Override
@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int meta)
{
    int k = meta & 12;
    int l = meta & 3;
    return k == 0 && (side == 1 || side == 0) ? this.TopIcon(l) : (k == 4 && (side == 5 || side == 4) ? this.TopIcon(l) : (k == 8 && (side == 2 || side == 3) ? this.TopIcon(l) : this.sideIcon(l)));
}
public int func_150162_k(int p_150162_1_)
{
    return p_150162_1_ & 3;
}
public int PillarRotate(World world, int x, int y, int z, int dir, float min, float max, float size, int legth)
{
    int j1 = legth & 3;
    byte b0 = 0;

    switch (dir)
    {
        case 0:
        case 1:
            b0 = 0;
            break;
        case 2:
        case 3:
            b0 = 8;
            break;
        case 4:
        case 5:
            b0 = 4;
    }

    return j1 | b0;
}
public int getRenderType()
{
    return 31;
}
public ItemStack Stacking(int side)
{
    return new ItemStack(Item.getItemFromBlock(this), 1, this.func_150162_k(side));
}
}
