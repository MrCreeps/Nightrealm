package mrcreeps.mods.nightrealm.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import mrcreeps.mods.nightrealm.item.CobaltPickaxeItem;
import mrcreeps.mods.nightrealm.item.CinnabarPickaxeItem;
import mrcreeps.mods.nightrealm.NightrealmMod;

import java.util.function.Supplier;
import java.util.Map;

public class CobaltPickaxeRecipeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NightrealmMod.LOGGER.warn("Failed to load dependency entity for procedure CobaltPickaxeRecipe!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (1)) >= 16) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == CinnabarPickaxeItem.block) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(CobaltPickaxeItem.block);
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
