package com.FlawlessGecko.TheRevival.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;







import com.FlawlessGecko.TheRevival.block.BlockBlackstone;
import com.FlawlessGecko.TheRevival.block.BlockBrick;
import com.FlawlessGecko.TheRevival.block.BlockJasperore;
import com.FlawlessGecko.TheRevival.block.BlockLamp;
import com.FlawlessGecko.TheRevival.block.BlockLeather;
import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.block.Blockfence;
import com.FlawlessGecko.TheRevival.block.Blockstone;
import com.FlawlessGecko.TheRevival.block.Blockstoneybrick;
import com.FlawlessGecko.TheRevival.block.Blocktile;
import com.FlawlessGecko.TheRevival.block.blockPaver;
import com.FlawlessGecko.TheRevival.block.blockdecomposedgranite;
import com.FlawlessGecko.TheRevival.block.blocksapphireore;
import com.FlawlessGecko.TheRevival.block.blocksmoothstone;
import com.FlawlessGecko.TheRevival.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
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
	public static final BlockTR blockLeather = new BlockLeather();
	public static final BlockTR blockjasperore=new BlockJasperore();
	public static final BlockTR blockSapphire=new com.FlawlessGecko.TheRevival.block.BlockSapphire();
	public static final BlockTR blockpaver = new blockPaver();
	public static final BlockTR blockdecomposedgranite= new blockdecomposedgranite();
	public static final BlockTR blocksapphireore=new blocksapphireore();
	public static final BlockTR blocksmoothstone=new blocksmoothstone();
	
	public static final BlockTR doorsnow = new com.FlawlessGecko.TheRevival.block.doorsnow(Material.craftedSnow);
	//Init is where we store our blocks
	public static void init(){
		GameRegistry.registerBlock(blockbrick,"blockbrick");
		GameRegistry.registerBlock(blockfence, "blockfence");
		GameRegistry.registerBlock(blockblackstone, "blockblackstone");
		GameRegistry.registerBlock(blockstone, "blockstone");
		GameRegistry.registerBlock(blocklamp, "blocklamp");
		GameRegistry.registerBlock(blocktile, "blocktile");
		GameRegistry.registerBlock(blockstoneybrick, "blockstoneybrick");
		GameRegistry.registerBlock(blockLeather,"blockleather");
		GameRegistry.registerBlock(blockjasperore, "blockjasperore");
		GameRegistry.registerBlock(blockSapphire, "blocksapphire");
		GameRegistry.registerBlock(blockpaver,"blockpaver");
		GameRegistry.registerBlock(blockdecomposedgranite, "blockdecomposedgranite");
		GameRegistry.registerBlock(blocksmoothstone, "blocksmoothstone");
		GameRegistry.registerBlock(blocksapphireore, "blocksapphireore");
		
		GameRegistry.registerBlock(doorsnow, "doorsnow");
	}
}
