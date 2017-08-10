package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class itemEmeraldPickaxe extends ItemPickaxe {
	
	public itemEmeraldPickaxe (ToolMaterial mat) {
		super(mat);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Items.EMERALD ? true : super.getIsRepairable(toRepair, repair);
    }
	
}
