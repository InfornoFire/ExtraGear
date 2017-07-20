package com.inforno.extragear.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class itemAquaSword extends ItemSword {
	
	public itemAquaSword (ToolMaterial mat) {
		super(mat);
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 100, 0));
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(4), 100, 0));
		return true;
	}
	

}
