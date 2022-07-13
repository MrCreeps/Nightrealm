
package mrcreeps.mods.nightrealm.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import mrcreeps.mods.nightrealm.item.NightrealmItem;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FlintAndGoldTradeTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			trades.get(5).add(new BasicTrade(new ItemStack(Items.FLINT_AND_STEEL), new ItemStack(Items.GOLD_INGOT),
					new ItemStack(NightrealmItem.block), 1, 0, 0f));
		}
	}
}
