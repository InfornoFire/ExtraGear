package com.inforno.extragear.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class itemWindAxe extends ItemAxe {
	
	public itemWindAxe (ToolMaterial material) {
		super(material, 16.0F, -3.0F);
		
	}
	
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		player.addPotionEffect((new PotionEffect(Potion.getPotionById(1), 60, 1)));
		return new ActionResult (EnumActionResult.SUCCESS, itemStack);
		
	}
	
}
