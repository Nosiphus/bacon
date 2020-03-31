package bacon.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import bacon.init.ModBlocks;
import bacon.init.ModItems;

public class CreativeTab {

	public static CreativeTabs BaconTab = new CreativeTabs("Bacon")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModItems.COOKED_BACON);
		}
	};
	
}
