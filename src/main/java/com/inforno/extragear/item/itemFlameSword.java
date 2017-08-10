package com.inforno.extragear.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class itemFlameSword extends ItemSword {
	
	public itemFlameSword (ToolMaterial mat) {
		super(mat);
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
        itemStack.damageItem(1, entityUser);
		entityHit.setFire(11);
		return true;
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == _Items.itemFlameIngot ? true : super.getIsRepairable(toRepair, repair);
    }

}
