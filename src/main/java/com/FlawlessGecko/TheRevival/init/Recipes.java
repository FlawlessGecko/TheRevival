package com.FlawlessGecko.TheRevival.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
public static void init(){
//here the Items stack are new blockItems stacks for items
// We use whatever letter the declare the recipe then add what we want each letter to be like 'a' means jasper
//ShapelessOre and Shaped ore are from forge and they allow us to use items registered under ore dictionary
GameRegistry.addRecipe(new ItemStack(ModItems.ItemLeafPoker)," a ","s s"," a ",'a',new ItemStack(ModItems.jasper),'s',new ItemStack(Items.stick));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blocktile,4), new ItemStack(ModBlocks.blockblackstone),new ItemStack(ModBlocks.blockstone));

GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockbrick,4),"b b","   ","b b",'b',new ItemStack(ModBlocks.blockblackstone));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockstoneybrick,4),"g g","   ","g g",'g',new ItemStack(ModBlocks.blockdecomposedgranite));

GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockwoodpaver,3),"d","d","d",'d',new ItemStack(Blocks.oak_stairs));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockpaver,3),"e","e","e",'e',new ItemStack(ModBlocks.blocksmoothrock));

GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockLampWood),"f f"," k ","f f",'f',new ItemStack(ModBlocks.blockwoodpaver),'k',new ItemStack(Blocks.glowstone));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blocklampstone),"t t"," v ","t t",'t',new ItemStack(ModBlocks.blockpaver),'v',new ItemStack(Blocks.glowstone));

GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockLeather),"lll","lll","lll",'l',new ItemStack(Items.leather));
GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockZombieflesh),"zxz","zxz","zxz",'z',new ItemStack(Items.rotten_flesh),'x',new ItemStack(ModBlocks.blocksmoothrock));

GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockSapphire),"rrr","rrr","rrr",'r',new ItemStack(ModItems.sapphire));

GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blocklamp,2), new ItemStack(Blocks.torch),new ItemStack(Blocks.glass));
GameRegistry.addShapedRecipe(new ItemStack(ModItems.Itemwoodmallet),"uuu"," y ",'u',new ItemStack(Blocks.planks),'y',new ItemStack(Items.stick));


}
}
