package com.inforno.extragear.armor;

import com.inforno.extragear.item._Items;
import com.inforno.extragear.mat._ArmorMats;

import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class EmeraldArmor extends ItemArmor {

	public EmeraldArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(_ArmorMats.materialEmeraldArmor, renderIndexIn, equipmentSlotIn);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Items.EMERALD ? true : super.getIsRepairable(toRepair, repair);
    }

}
