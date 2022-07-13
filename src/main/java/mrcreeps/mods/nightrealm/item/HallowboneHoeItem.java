
package mrcreeps.mods.nightrealm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import mrcreeps.mods.nightrealm.NightrealmModElements;

@NightrealmModElements.ModElement.Tag
public class HallowboneHoeItem extends NightrealmModElements.ModElement {
	@ObjectHolder("nightrealm:hallowbone_hoe")
	public static final Item block = null;

	public HallowboneHoeItem(NightrealmModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 270;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}, 0, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("hallowbone_hoe"));
	}
}
