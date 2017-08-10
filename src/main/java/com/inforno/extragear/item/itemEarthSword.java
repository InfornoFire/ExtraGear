package com.inforno.extragear.item;

import java.util.Collection;
import java.util.UUID;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;



public class itemEarthSword extends ItemSword {
	
	public itemEarthSword (ToolMaterial mat) {
		super(mat);
		}
    
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
        itemStack.damageItem(1, entityUser);
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 60, 1));
		return true;
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == _Items.itemEarthIngot ? true : super.getIsRepairable(toRepair, repair);
    }
	
}