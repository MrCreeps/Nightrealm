
package mrcreeps.mods.nightrealm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import mrcreeps.mods.nightrealm.NightrealmModElements;

@NightrealmModElements.ModElement.Tag
public class CinnabarSwordItem extends NightrealmModElements.ModElement {
	@ObjectHolder("nightrealm:cinnabar_sword")
	public static final Item block = null;

	public CinnabarSwordItem(NightrealmModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1827;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("cinnabar_sword"));
	}
}
