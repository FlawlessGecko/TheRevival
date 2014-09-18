package com.FlawlessGecko.TheRevival.init;

import com.FlawlessGecko.TheRevival.block.BlockTR;
import com.FlawlessGecko.TheRevival.block.Pavers.Blockironcover;
import com.FlawlessGecko.TheRevival.block.Pavers.Blockwoodpaver;
import com.FlawlessGecko.TheRevival.block.Pavers.blockPaver;
import com.FlawlessGecko.TheRevival.block.Pavers.blockclaypaver;
import com.FlawlessGecko.TheRevival.block.Pavers.blockironpaver;
import com.FlawlessGecko.TheRevival.block.Pavers.blockoakpanel;
import com.FlawlessGecko.TheRevival.block.Pavers.blockquartzpaver;
import com.FlawlessGecko.TheRevival.block.craftable.BlockBrick;
import com.FlawlessGecko.TheRevival.block.craftable.BlockLamp;
import com.FlawlessGecko.TheRevival.block.craftable.BlockLampStone;
import com.FlawlessGecko.TheRevival.block.craftable.BlockLampWood;
import com.FlawlessGecko.TheRevival.block.craftable.BlockLeather;
import com.FlawlessGecko.TheRevival.block.craftable.BlockSapphire;
import com.FlawlessGecko.TheRevival.block.craftable.BlockZombieFlesh;
import com.FlawlessGecko.TheRevival.block.craftable.Blockdecomposedcobble;
import com.FlawlessGecko.TheRevival.block.craftable.Blockgrass;
import com.FlawlessGecko.TheRevival.block.craftable.Blockstoneybrick;
import com.FlawlessGecko.TheRevival.block.craftable.Blocktile;
import com.FlawlessGecko.TheRevival.block.craftable.blockblackendoak;
import com.FlawlessGecko.TheRevival.block.craftable.blockblocky;
import com.FlawlessGecko.TheRevival.block.craftable.blockbluesparkles;
import com.FlawlessGecko.TheRevival.block.craftable.blockcrushedcobble;
import com.FlawlessGecko.TheRevival.block.craftable.blockglowingbeacon;
import com.FlawlessGecko.TheRevival.block.craftable.blockhotsteel;
import com.FlawlessGecko.TheRevival.block.craftable.blockquartzstone;
import com.FlawlessGecko.TheRevival.block.craftable.blockredstone;
import com.FlawlessGecko.TheRevival.block.craftable.blockskystone;
import com.FlawlessGecko.TheRevival.block.craftable.blocksteel;
import com.FlawlessGecko.TheRevival.block.gen.BlockBlackstone;
import com.FlawlessGecko.TheRevival.block.gen.BlockJasperore;
import com.FlawlessGecko.TheRevival.block.gen.Blockstone;
import com.FlawlessGecko.TheRevival.block.gen.blockdecomposedgranite;
import com.FlawlessGecko.TheRevival.block.gen.blocksapphireore;
import com.FlawlessGecko.TheRevival.block.gen.blocksmoothrock;
import com.FlawlessGecko.TheRevival.block.pillars.blockblackstonepillar;
import com.FlawlessGecko.TheRevival.block.pillars.blockpillar;
import com.FlawlessGecko.TheRevival.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
//Stops tinkering of blocks from other mods.
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
//New block and name from class
	public static final BlockTR blockbrick = new BlockBrick();
	public static final BlockTR blockwoodpaver = new Blockwoodpaver(null);
	public static final BlockTR blocktile = new Blocktile();
	public static final BlockTR blocklamp = new BlockLamp();
	public static final BlockTR blockstone= new Blockstone();
	public static final BlockTR blockblackstone = new BlockBlackstone();
	public static final BlockTR blockstoneybrick=new Blockstoneybrick();
	public static final BlockTR BlockLeather = new BlockLeather();
	public static final BlockTR blockjasperore=new BlockJasperore();
	public static final BlockTR BlockSapphire=new BlockSapphire();
	public static final BlockTR blockpaver = new blockPaver();
	public static final BlockTR blockironpaver = new blockironpaver();
	public static final BlockTR blockquartzpaver = new blockquartzpaver();
	public static final BlockTR blockclaypaver=new blockclaypaver();
	public static final BlockTR blockdecomposedcobble=new Blockdecomposedcobble();
	public static final BlockTR blockcrushedcobble=new blockcrushedcobble();
	public static final BlockTR blockblackstonepillar=new blockblackstonepillar();
	public static final BlockTR blockironcover=new Blockironcover();
	public static final BlockTR blockdecomposedgranite= new blockdecomposedgranite();
	public static final BlockTR blocksapphireore=new blocksapphireore();
	public static final BlockTR blocksmoothrock=new blocksmoothrock();
	public static final BlockTR Blockgrass = new Blockgrass();
	public static final BlockTR BlockLampWood = new BlockLampWood();
	public static final BlockTR blocklampstone=new BlockLampStone();
	public static final BlockTR BlockZombieflesh= new BlockZombieFlesh();
	public static final BlockTR blockskystone=new blockskystone();
	public static final BlockTR blockblocky=new blockblocky();
	public static final BlockTR blockredstone=new blockredstone();
	public static final BlockTR blockquartzstone=new blockquartzstone();
	public static final BlockTR blockpillar=new blockpillar();
	public static final BlockTR blockglowingbeacon=new blockglowingbeacon();
	public static final BlockTR blockoakpanel= new blockoakpanel();
	public static final BlockTR blockblackendoak= new blockblackendoak(); 
	public static final BlockTR blockbluesparkles=new blockbluesparkles();
	public static final BlockTR blocksteel=new blocksteel();
	public static final BlockTR blockhotsteel=new blockhotsteel();

	//Init is where we store our blocks
	public static void init(){
		GameRegistry.registerBlock(blockblackstonepillar, "blockblackstonepillar");
		GameRegistry.registerBlock(blockbrick,"blockbrick");
		GameRegistry.registerBlock(blockclaypaver, "blockclaypaver");
		GameRegistry.registerBlock(blockwoodpaver, "blockwoodpaver");
		GameRegistry.registerBlock(blockironpaver, "blockironpaver");
		GameRegistry.registerBlock(blockquartzpaver, "blockquartzpaver");
		GameRegistry.registerBlock(blockironcover, "blockironcover");
		GameRegistry.registerBlock(blockdecomposedcobble, "blockdecomposedcobble");
		GameRegistry.registerBlock(blockblackstone, "blockblackstone");
		GameRegistry.registerBlock(blockstone, "blockstone");
		GameRegistry.registerBlock(blocklamp, "blocklamp");
		GameRegistry.registerBlock(blocktile, "blocktile");
		GameRegistry.registerBlock(blockstoneybrick, "blockstoneybrick");
		GameRegistry.registerBlock(BlockLeather,"BlockLeather");
		GameRegistry.registerBlock(blockjasperore, "blockjasperore");
		GameRegistry.registerBlock(BlockSapphire, "BlockSapphire");
		GameRegistry.registerBlock(blockpaver,"blockpaver");
		GameRegistry.registerBlock(blockdecomposedgranite, "blockdecomposedgranite");
		GameRegistry.registerBlock(blocksmoothrock, "blocksmoothrock");
		GameRegistry.registerBlock(blocksapphireore, "blocksapphireore");
		GameRegistry.registerBlock(Blockgrass, "Blockgrass");
		GameRegistry.registerBlock(BlockLampWood, "BlockLampWood");
		GameRegistry.registerBlock(blocklampstone, "blocklampstone");
		GameRegistry.registerBlock(BlockZombieflesh, "BlockZombieflesh");
		GameRegistry.registerBlock(blockcrushedcobble, "blockcrushedcobble");
		GameRegistry.registerBlock(blockskystone, "blockskystone");
		GameRegistry.registerBlock(blockblocky, "blockblocky");
		GameRegistry.registerBlock(blockredstone, "blockredstone");
		GameRegistry.registerBlock(blockquartzstone, "blockquartzstone");
		GameRegistry.registerBlock(blockglowingbeacon, "blockglowingbeacon");
		GameRegistry.registerBlock(blockpillar, "blockpillar");
		GameRegistry.registerBlock(blockoakpanel, "bloakoakpanel");
		GameRegistry.registerBlock(blockblackendoak, "blockblackendoak");
		GameRegistry.registerBlock(blockbluesparkles, "blockbluesparkles");
		GameRegistry.registerBlock(blocksteel, "blocksteel");
		GameRegistry.registerBlock(blockhotsteel, "blockhotsteel");

	}
}
