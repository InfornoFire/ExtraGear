package com.inforno.extragear.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class foodEarthApple extends ItemFood {

	public foodEarthApple() {
		super(4, 12, false);
		this.setAlwaysEdible();
	}
	
    public boolean hasEffect(ItemStack itemstack) {
	    	return true;
	}
    
	@Override
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player) {
        if (!world.isRemote) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(10), 600, 2));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(22), 3600, 4));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 6000, 1));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 6000, 0));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 6000, 0));
        }
	}

}
