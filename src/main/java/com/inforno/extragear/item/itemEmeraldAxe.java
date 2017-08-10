package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class itemEmeraldAxe extends ItemAxe {
	
	public itemEmeraldAxe (ToolMaterial material) {
		super(material, 8.0F, -3.0F);
		
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Items.EMERALD ? true : super.getIsRepairable(toRepair, repair);
    }
	
}
