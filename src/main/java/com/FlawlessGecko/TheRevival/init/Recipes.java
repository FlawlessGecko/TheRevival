package com.FlawlessGecko.TheRevival.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
public static void init(){
//here the Items stack are new blockItems stacks for items
// We use whatever letter the declare the recipe then add what we want each letter to be like 'a' means jasper
//ShapelessOre and Shaped ore are from forge and they allow us to use items registered under ore dictionary

//tools
GameRegistry.addShapedRecipe(new ItemStack(ModItems.Itemwoodmallet),"uuu"," i "," i ",'u',new ItemStack(ModItems.jasper),'i',new ItemStack(Items.stick));
GameRegistry.addShapedRecipe(new ItemStack(ModItems.Itemironmallet),"uuu"," i "," i ",'u',new ItemStack(Items.iron_ingot),'i',new ItemStack(Items.stick));


//Pavers and Covers
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockwoodpaver,3),"d","d","d",'d',new ItemStack(Blocks.oak_stairs));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockpaver,3),"e","e","e",'e',new ItemStack(ModBlocks.blocksmoothrock));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockclaypaver,3),"h","h","h",'h',new ItemStack(Items.brick));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockironpaver,8),"j","j","j",'j',new ItemStack(Blocks.iron_block));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockquartzpaver,8),"t","t","t",'t',new ItemStack(Blocks.quartz_block));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockironcover,8),"yyy",'y',new ItemStack(Items.iron_ingot));


//Here is the smelting recipes in mod
GameRegistry.addSmelting(ModBlocks.blockoakpanel, new ItemStack (ModBlocks.blockblackendoak), 4);
GameRegistry.addSmelting(Blocks.iron_block, new ItemStack (ModBlocks.blockhotsteel), 4);


//Used with Wood mallet
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockcrushedcobble, 1), new ItemStack(Blocks.cobblestone), new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockdecomposedcobble, 2), new ItemStack(Blocks.cobblestone),new ItemStack(ModBlocks.blockdecomposedgranite), new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blocktile, 2), new ItemStack(ModBlocks.blockblackstone),new ItemStack(ModBlocks.blockstone), new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockblackstonepillar),new ItemStack(ModBlocks.blockblackstone),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blocklamp,1), new ItemStack(Blocks.torch),new ItemStack(Blocks.glass),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockbrick,4),"b b"," l ","b b",'b',new ItemStack(ModBlocks.blockblackstone),'l',new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockstoneybrick,4),"g g"," l ","g g",'g',new ItemStack(ModBlocks.blockdecomposedgranite),'l',new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockblocky,2),new ItemStack(ModBlocks.blocksmoothrock),new ItemStack(Blocks.cobblestone),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockredstone,3),new ItemStack(ModBlocks.blocksmoothrock),new ItemStack(Blocks.cobblestone),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.redstone_block));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockskystone,2),new ItemStack(ModBlocks.BlockSapphire),new ItemStack(Blocks.cobblestone),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockpillar,2),new ItemStack(ModBlocks.BlockSapphire),new ItemStack(Blocks.stone),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockquartzstone,2),new ItemStack(ModBlocks.blocksmoothrock),new ItemStack(Blocks.quartz_block),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockglowingbeacon,2),new ItemStack(ModBlocks.BlockSapphire),new ItemStack(Blocks.glass),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockbluesparkles,2),new ItemStack(ModBlocks.BlockSapphire),new ItemStack(ModBlocks.BlockSapphire),new ItemStack(Blocks.glass),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockoakpanel,2),new ItemStack(Blocks.wooden_pressure_plate),new ItemStack(Blocks.spruce_stairs),new ItemStack(ModItems.Itemwoodmallet, 1, OreDictionary.WILDCARD_VALUE));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockLampWood),"f f"," k ","f f",'f',new ItemStack(ModBlocks.blockwoodpaver),'k',new ItemStack(Blocks.glowstone));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blocklampstone),"t t"," v ","t t",'t',new ItemStack(ModBlocks.blockpaver),'v',new ItemStack(Blocks.glowstone));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockLeather),"lll","lll","lll",'l',new ItemStack(Items.leather));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockZombieflesh),"zxz","zxz","zxz",'z',new ItemStack(Items.rotten_flesh),'x',new ItemStack(ModBlocks.blocksmoothrock));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockSapphire),"rrr","rrr","rrr",'r',new ItemStack(ModItems.sapphire));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Blockgrass,2), new ItemStack(Blocks.grass),new ItemStack(Blocks.grass));


//Need The Iron Mallet for theese recipes
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blocksteel,6),new ItemStack(ModBlocks.blockhotsteel),new ItemStack(ModBlocks.blockhotsteel),new ItemStack(ModBlocks.blockhotsteel),new ItemStack(ModBlocks.blockhotsteel),new ItemStack(ModBlocks.blockhotsteel),new ItemStack(ModBlocks.blockhotsteel),new ItemStack(ModBlocks.blockhotsteel),new ItemStack(ModBlocks.blockhotsteel),
new ItemStack(ModItems.Itemironmallet, 1, OreDictionary.WILDCARD_VALUE));



//Ore Dictionary for other mods to implement my stuff
OreDictionary.registerOre("blockSteel", ModBlocks.blocksteel);
OreDictionary.registerOre("blockSapphire", ModBlocks.BlockSapphire);
OreDictionary.registerOre("oreSapphire", ModBlocks.blocksapphireore);
OreDictionary.registerOre("orejasper",ModBlocks.blockjasperore);
OreDictionary.registerOre("Jasper", ModItems.jasper);
OreDictionary.registerOre("Sapphire", ModItems.sapphire);

}
}
