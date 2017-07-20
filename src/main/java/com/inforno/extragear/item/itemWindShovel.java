package com.inforno.extragear.item;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;

public class itemWindShovel extends ItemSpade {
	
	public itemWindShovel (ToolMaterial mat) {
		super(mat);
	}
	
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		player.addPotionEffect((new PotionEffect(Potion.getPotionById(1), 100, 0)));
		return new ActionResult (EnumActionResult.SUCCESS, itemStack);
		
	}

}
