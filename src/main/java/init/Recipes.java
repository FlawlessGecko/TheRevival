package init;

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
GameRegistry.addRecipe(new ItemStack(ModItems.ItemLeafpoker)," a ","s s"," a ",'a',new ItemStack(ModItems.jasper),'s',new ItemStack(Items.stick));
GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blocktile), new ItemStack(ModBlocks.blockblackstone),new ItemStack(ModBlocks.blockstone));
}
}
