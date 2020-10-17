package bacon.items;

import bacon.Main;
import bacon.init.ModItems;
import bacon.tabs.CreativeTab;
import bacon.util.IHasModel;
import bacon.util.Reference;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {

	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.BaconTab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
