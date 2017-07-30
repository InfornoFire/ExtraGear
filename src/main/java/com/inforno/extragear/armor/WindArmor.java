package com.inforno.extragear.armor;

import com.inforno.extragear.mat._ArmorMats;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class WindArmor extends ItemArmor {

	public WindArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(_ArmorMats.materialWindArmor, renderIndexIn, equipmentSlotIn);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == _Armor.armorWindHelmet
		    && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == _Armor.armorWindChestplate
		    && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == _Armor.armorWindLeggings
		    && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == _Armor.armorWindBoots) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(3), 20, 0));
		}

	}

}
