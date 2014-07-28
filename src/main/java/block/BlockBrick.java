package block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creativetab.CreativeTabTR;

public class BlockBrick extends BlockTR  {

	public BlockBrick(){
		super();
		this.setBlockName("blockbrick");
		this.setBlockTextureName("blockbrick");
		this.setCreativeTab(CreativeTabTR.TR_TAB);
	}

	
	  public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	    @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 0;
	    }
}
