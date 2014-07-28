package init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


import com.FlawlessGecko.TheRevival.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import block.BlockBlackstone;
import block.BlockBrick;
import block.BlockJasperore;
import block.BlockLamp;
import block.BlockLeather;
import block.BlockTR;
import block.Blockfence;
import block.Blockstone;
import block.Blockstoneybrick;
import block.Blocktile;
//Stops tinkering of blocks from other mods.
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
//New block and name from class
	public static final BlockTR blockbrick = new BlockBrick();
	public static final BlockTR blockfence = new Blockfence(null);
	public static final BlockTR blocktile = new Blocktile();
	public static final BlockTR blocklamp = new BlockLamp();
	public static final BlockTR blockstone= new Blockstone();
	public static final BlockTR blockblackstone = new BlockBlackstone();
	public static final BlockTR blockstoneybrick=new Blockstoneybrick();
	public static final BlockTR BlockLeather = new BlockLeather();
	public static final BlockTR blockjasperore=new BlockJasperore();
	public static final BlockTR BlockSapphire=new block.BlockSapphire();
	
	public static final BlockTR doorsnow = new block.doorsnow(Material.craftedSnow);
	//Init is where we store our blocks
	public static void init(){
		GameRegistry.registerBlock(blockbrick,"blockbrick");
		GameRegistry.registerBlock(blockfence, "blockfence");
		GameRegistry.registerBlock(blockblackstone, "blockblackstone");
		GameRegistry.registerBlock(blockstone, "blockstone");
		GameRegistry.registerBlock(blocklamp, "blocklamp");
		GameRegistry.registerBlock(blocktile, "blocktile");
		GameRegistry.registerBlock(blockstoneybrick, "blockstoneybrick");
		GameRegistry.registerBlock(BlockLeather,"blockleather");
		GameRegistry.registerBlock(blockjasperore, "blockjasperore");
		GameRegistry.registerBlock(BlockSapphire, "blocksapphire");
		
		GameRegistry.registerBlock(doorsnow, "doorsnow");
	}
}
