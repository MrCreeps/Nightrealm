
package mrcreeps.mods.nightrealm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import mrcreeps.mods.nightrealm.NightrealmModElements;

@NightrealmModElements.ModElement.Tag
public class HallowboneChestplateItem extends NightrealmModElements.ModElement {
	@ObjectHolder("nightrealm:hallowbone_chestplate")
	public static final Item block = null;

	public HallowboneChestplateItem(NightrealmModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("hallowbone_chestplate");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
