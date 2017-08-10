package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class itemObsidianAxe extends ItemAxe {
	
	public itemObsidianAxe (ToolMaterial material) {
		super(material, 8.0F, -3.1F);
		
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN)? true : super.getIsRepairable(toRepair, repair);
    }
	
}
