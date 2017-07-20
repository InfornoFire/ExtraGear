package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class itemAquaAxe extends ItemAxe {
	
	public itemAquaAxe (ToolMaterial material) {
		super(material, 18.0F, -3.0F);
		
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 60, 0));
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(4), 60, 0));
		return true;
	}
	
}
