package com.inforno.extragear.armor;

import com.inforno.extragear.mat._ArmorMats;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class EmeraldArmor extends ItemArmor {

	public EmeraldArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(_ArmorMats.materialEmeraldArmor, renderIndexIn, equipmentSlotIn);
	}

}
