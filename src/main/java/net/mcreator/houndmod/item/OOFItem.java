
package net.mcreator.houndmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.houndmod.itemgroup.HoundModItemGroup;
import net.mcreator.houndmod.HoundmodModElements;

@HoundmodModElements.ModElement.Tag
public class OOFItem extends HoundmodModElements.ModElement {
	@ObjectHolder("houndmod:oof")
	public static final Item block = null;
	public OOFItem(HoundmodModElements instance) {
		super(instance, 131);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, HoundmodModElements.sounds.get(new ResourceLocation("houndmod:offsound")),
					new Item.Properties().group(HoundModItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("oof");
		}
	}
}
