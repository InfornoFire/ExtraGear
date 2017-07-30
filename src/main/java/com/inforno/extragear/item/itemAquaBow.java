package com.inforno.extragear.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class itemAquaBow extends ItemBow {
	
	public itemAquaBow() {
		//Cause I feel like it
		this.setMaxDamage(999);
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack itemstack)
	{
		return 144000;
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack itemstack)
	{
		return EnumAction.BOW;
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 40, 0));
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 20, 0));
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(18), 60, 0));
		return true;
	}
	
}
