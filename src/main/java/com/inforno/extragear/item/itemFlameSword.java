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
		entityHit.setFire(11);
		return true;
	}
	

}
