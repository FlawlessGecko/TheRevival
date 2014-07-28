package block;

import creativetab.CreativeTabTR;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blocktile extends BlockTR {
	

		public Blocktile() {
			super(Material.rock);
			
			this.setBlockName("blocktile");
			this.setCreativeTab(CreativeTabTR.TR_TAB);
			this.setStepSound(soundTypeStone);
			this.setBlockTextureName("blocktile");
			this.setLightOpacity(0);
		}

		private void blockIIcon() {
			// TODO Auto-generated method stub
			
		}
	
}
