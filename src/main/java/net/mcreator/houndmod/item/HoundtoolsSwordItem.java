
package net.mcreator.houndmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.houndmod.itemgroup.HoundModItemGroup;
import net.mcreator.houndmod.HoundmodModElements;

@HoundmodModElements.ModElement.Tag
public class HoundtoolsSwordItem extends HoundmodModElements.ModElement {
	@ObjectHolder("houndmod:houndtoolssword")
	public static final Item block = null;
	public HoundtoolsSwordItem(HoundmodModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 15;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HoundIngotItem.block, (int) (1)));
			}
		}, 3, 1f, new Item.Properties().group(HoundModItemGroup.tab)) {
		}.setRegistryName("houndtoolssword"));
	}
}
