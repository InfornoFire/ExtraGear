package com.inforno.extragear.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class itemObsidianSword extends ItemSword {
	
	public itemObsidianSword (ToolMaterial mat) {
		super(mat);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN)? true : super.getIsRepairable(toRepair, repair);
    }

}

