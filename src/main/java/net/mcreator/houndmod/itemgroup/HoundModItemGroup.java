
package net.mcreator.houndmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.houndmod.item.HoundIngotItem;
import net.mcreator.houndmod.HoundmodModElements;

@HoundmodModElements.ModElement.Tag
public class HoundModItemGroup extends HoundmodModElements.ModElement {
	public HoundModItemGroup(HoundmodModElements instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabhound_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(HoundIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
