package block;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creativetab.CreativeTabTR;

public class Blockfence extends BlockTR {

	private Object iconFront;
	private Object iconLeft;

	public Blockfence(World world) {
		super();
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		this.setBlockTextureName("blockfence");
		this.setBlockName("blockfence");
		this.setStepSound(soundTypeWood);
		this.beginLeavesDecay(world, 25, 30, 10);
		this.setBlockBounds(0, 0, 0,1, (float) 0.5, 1);
		this.getItemDropped(Items.stick, 2,5);
		}

	private Item getItemDropped(Item stick, int i, int j) {
		return Items.stick;
		
	}
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	public boolean renderAsNormalBlock(){
		return false;
	}
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
        return true;
    }
	public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side) {
		return false;
	}
	 
	@Override
	//TODO:		onEntityCollidedWithBlock()
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{
		int meta = world.getBlockMetadata(x, y, z);

		if (entity instanceof EntityLivingBase)
		{
			((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 100));
			((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.hunger.id, 100));
		}
		  
	}
		
}
		


