package com.inforno.extragear.item;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class itemEmeraldSword extends ItemSword {
	
	public itemEmeraldSword (ToolMaterial mat) {
		super(mat);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Items.EMERALD ? true : super.getIsRepairable(toRepair, repair);
    }

}

