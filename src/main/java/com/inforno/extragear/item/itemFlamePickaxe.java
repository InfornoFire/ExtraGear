package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class itemFlamePickaxe extends ItemPickaxe {
	
	public itemFlamePickaxe (ToolMaterial mat) {
		super(mat);
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityHit.setFire(6);
		return true;
	}

}
