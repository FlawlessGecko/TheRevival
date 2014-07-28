package init;

import com.FlawlessGecko.TheRevival.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import item.ItemLeafPoker;
import item.ItemTR;
import item.Itemjasper;
//stops the Tinker of registry.
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
//where we declare the Item name and new item
public static final ItemTR ItemLeafpoker = new ItemLeafPoker();
public static final ItemTR jasper = new Itemjasper();

//This is Where we register our new blocks
public static void init(){
	GameRegistry.registerItem(ItemLeafpoker, "TreePoker");
	GameRegistry.registerItem(jasper, "jasper");
}
}
