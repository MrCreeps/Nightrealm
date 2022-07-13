package mrcreeps.mods.nightrealm.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import mrcreeps.mods.nightrealm.item.HallowboneStickItem;
import mrcreeps.mods.nightrealm.block.HallowbonePlanksBlock;
import mrcreeps.mods.nightrealm.block.HallowboneLogBlock;
import mrcreeps.mods.nightrealm.NightrealmMod;

import java.util.Map;

public class PurifierOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NightrealmMod.LOGGER.warn("Failed to load dependency entity for procedure PurifierOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == HallowboneLogBlock.block
				.asItem()) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.OAK_LOG);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == HallowbonePlanksBlock.block.asItem()) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == HallowboneStickItem.block) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.STICK);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
