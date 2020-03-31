package bacon.init;

import java.util.ArrayList;
import java.util.List;

import bacon.items.FoodBase;
import bacon.items.FoodEffectBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Food
	public static final ItemFood COOKED_BACON = new FoodBase("cooked_bacon", 5, 0.3f, false);
	public static final Item GAY_BACON = new FoodEffectBase("gay_bacon", 4, 2.4f, false, new PotionEffect(MobEffects.JUMP_BOOST, (60*20), 4, false, true));
	public static final ItemFood RAW_BACON = new FoodBase("raw_bacon", 5, 0.3f, false);
}
