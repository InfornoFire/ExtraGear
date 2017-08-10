package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class itemFlameAxe extends ItemAxe {
	
	public itemFlameAxe (ToolMaterial material) {
		super(material, 21.0F, -3.0F);
		
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
        itemStack.damageItem(2, entityUser);
		entityHit.setFire(6);
		return true;
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == _Items.itemFlameIngot ? true : super.getIsRepairable(toRepair, repair);
    }
	
}
