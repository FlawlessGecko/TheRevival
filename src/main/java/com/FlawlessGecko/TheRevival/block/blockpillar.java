package com.FlawlessGecko.TheRevival.block;

import net.minecraft.client.renderer.texture.IIconRegister;
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
@Override
@SideOnly(Side.CLIENT)
public IIcon getIcon (int side, int meta)
{
	return side == 1 ? this.blockIcon : (side == 0 ? this.bottemicon : this.sideicon);
}

}
