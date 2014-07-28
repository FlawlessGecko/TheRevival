package block;

import com.FlawlessGecko.TheRevival.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creativetab.CreativeTabTR;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockTR extends Block {

	public BlockTR(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		
	}
	 @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }
	 @Override
	   @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	    }
	  protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }
	 
	 public BlockTR(){
	this(Material.rock);

}



}
