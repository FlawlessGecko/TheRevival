package block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creativetab.CreativeTabTR;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BlockLamp extends BlockTR {

	public BlockLamp( ) {
		super(Material.glass);

		this.setBlockName("blocklamp");
		this.setHardness(1);
		this.setStepSound(soundTypeGlass);
		this.getCanBlockGrass();
		this.setBlockTextureName("blocklamp");
		this.setLightLevel(1);
		this.setLightOpacity(0);
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		this.captureDrops();
	}
  public boolean captureDrops(){
	  return true;
  }
    }
