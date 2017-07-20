package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class itemEarthShovel extends ItemSpade {
	
	public itemEarthShovel (ToolMaterial mat) {
		super(mat);
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityUser.heal(1);
		return true;
	
	}

}
