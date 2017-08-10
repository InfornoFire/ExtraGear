package com.inforno.extragear.armor;

import java.util.Random;

import com.inforno.extragear.item._Items;
import com.inforno.extragear.mat._ArmorMats;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EarthArmor extends ItemArmor {

	public EarthArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(_ArmorMats.materialEarthArmor, renderIndexIn, equipmentSlotIn);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == _Items.itemEarthIngot ? true : super.getIsRepairable(toRepair, repair);
    }

}
