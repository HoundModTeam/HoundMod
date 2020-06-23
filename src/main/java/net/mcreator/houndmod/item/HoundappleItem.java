
package net.mcreator.houndmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.houndmod.procedures.HoundappleFoodEatenProcedure;
import net.mcreator.houndmod.itemgroup.HoundModItemGroup;
import net.mcreator.houndmod.HoundmodModElements;

@HoundmodModElements.ModElement.Tag
public class HoundappleItem extends HoundmodModElements.ModElement {
	@ObjectHolder("houndmod:houndapple")
	public static final Item block = null;
	public HoundappleItem(HoundmodModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(HoundModItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(10).saturation(5f).setAlwaysEdible().build()));
			setRegistryName("houndapple");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				HoundappleFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
