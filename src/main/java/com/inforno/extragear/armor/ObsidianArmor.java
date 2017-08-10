package com.inforno.extragear.armor;

import com.inforno.extragear.item._Items;
import com.inforno.extragear.mat._ArmorMats;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ObsidianArmor extends ItemArmor {

	public ObsidianArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(_ArmorMats.materialObsidianArmor, renderIndexIn, equipmentSlotIn);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN) ? true : super.getIsRepairable(toRepair, repair);
    }

}
