package com.inforno.extragear.armor;

import com.inforno.extragear.item._Items;
import com.inforno.extragear.mat._ArmorMats;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FlameArmor extends ItemArmor {

	public FlameArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(_ArmorMats.materialFlameArmor, renderIndexIn, equipmentSlotIn);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == _Armor.armorFlameHelmet
		    && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == _Armor.armorFlameChestplate
		    && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == _Armor.armorFlameLeggings
		    && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == _Armor.armorFlameBoots) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 20, 0));
		}
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == _Armor.armorFlameHelmet
			&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == _Armor.armorFlameChestplate
			&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == _Armor.armorFlameLeggings
			&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == _Armor.armorFlameBoots
			&& player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() == _Items.itemFlameSword) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 20, 0));
		}

	}

}
