
package net.mcreator.houndmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.houndmod.itemgroup.HoundModItemGroup;
import net.mcreator.houndmod.HoundmodModElements;

@HoundmodModElements.ModElement.Tag
public class TitaniumPickaxeItem extends HoundmodModElements.ModElement {
	@ObjectHolder("houndmod:titaniumpickaxe")
	public static final Item block = null;
	public TitaniumPickaxeItem(HoundmodModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(HoundModItemGroup.tab)) {
		}.setRegistryName("titaniumpickaxe"));
	}
}
