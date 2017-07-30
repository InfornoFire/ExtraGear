package com.inforno.extragear.armor;

import com.inforno.extragear.mat._ArmorMats;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class EarthArmor extends ItemArmor {

	public EarthArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(_ArmorMats.materialEarthArmor, renderIndexIn, equipmentSlotIn);
	}

}
