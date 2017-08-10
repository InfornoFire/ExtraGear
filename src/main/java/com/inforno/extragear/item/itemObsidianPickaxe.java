package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class itemObsidianPickaxe extends ItemPickaxe {
	
	public itemObsidianPickaxe (ToolMaterial mat) {
		super(mat);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN)? true : super.getIsRepairable(toRepair, repair);
    }
	
}
