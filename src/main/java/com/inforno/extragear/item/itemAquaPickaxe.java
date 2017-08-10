package com.inforno.extragear.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;

public class itemAquaPickaxe extends ItemPickaxe {
	
	public itemAquaPickaxe (ToolMaterial mat) {
		super(mat);
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
        itemStack.damageItem(2, entityUser);
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 60, 0));
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(4), 60, 0));
		return true;
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == _Items.itemAquaIngot ? true : super.getIsRepairable(toRepair, repair);
    }
	

}
