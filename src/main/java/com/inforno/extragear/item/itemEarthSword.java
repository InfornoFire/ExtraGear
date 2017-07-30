package com.inforno.extragear.item;

import java.util.Collection;
import java.util.UUID;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;



public class itemEarthSword extends ItemSword {
	
	public itemEarthSword (ToolMaterial mat) {
		super(mat);
		}
    
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 60, 1));
		return true;
	}
	
}