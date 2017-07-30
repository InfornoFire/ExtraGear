package com.inforno.extragear.armor;

import com.inforno.extragear.mat._ArmorMats;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ObsidianArmor extends ItemArmor {

	public ObsidianArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(_ArmorMats.materialObsidianArmor, renderIndexIn, equipmentSlotIn);
	}

}
