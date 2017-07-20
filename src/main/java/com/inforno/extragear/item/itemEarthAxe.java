package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class itemEarthAxe extends ItemAxe {
	
	public itemEarthAxe (ToolMaterial material) {
		super(material, 18.0F, -3.0F);
		
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityUser.heal(1);
		return true;
	}
	
}
