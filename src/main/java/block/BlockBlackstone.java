package block;

import creativetab.CreativeTabTR;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlackstone extends BlockTR {

	public BlockBlackstone() {
		super(Material.rock);
		
		this.setBlockName("blockblackstone");
		this.setCreativeTab(CreativeTabTR.TR_TAB);
		this.setStepSound(soundTypeStone);
		this.getCanBlockGrass();
		this.setBlockTextureName("blockblackstone");
		this.setBlockName("blockblackstone");
	}

	}

