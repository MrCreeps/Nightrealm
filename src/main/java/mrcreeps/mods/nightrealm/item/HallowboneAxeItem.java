
package mrcreeps.mods.nightrealm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import mrcreeps.mods.nightrealm.NightrealmModElements;

@NightrealmModElements.ModElement.Tag
public class HallowboneAxeItem extends NightrealmModElements.ModElement {
	@ObjectHolder("nightrealm:hallowbone_axe")
	public static final Item block = null;

	public HallowboneAxeItem(NightrealmModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 270;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("hallowbone_axe"));
	}
}
