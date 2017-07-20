package com.inforno.extragear.item;

import java.util.Collection;
import java.util.UUID;

import com.google.common.base.Optional;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class itemEarthSword extends ItemSword {
	
	public itemEarthSword (ToolMaterial mat) {
		super(mat);
		}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityUser.heal(1);
		return true;
	
	//public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		//if(!world.isRemote) {
			//if(itemStack.getTagCompound() == null) { itemStack.setTagCompound(new NBTTagCompound()); }
			//if(player.isSneaking()) {
			//NBTTagCompound c = itemStack.getTagCompound();
			//if(c.getInterger()) {
			//	c.setInteger("mode", 0);
			//} else {
			//	c.setInteger("mode", 1);
			//}
			//itemStack.setTagCompound(c);
			//} else {
			//	if(itemStack.getTagCompound().hasKey("mode")) {
			//		player.addChatComponentMessage(new TextComponentString("Mode: Regen II" + itemStack.getTagCompound().getInteger("mode")));
			//	} else {
			//		player.addChatComponentMessage(new TextComponentString("Mode: Regen III" + itemStack.getTagCompound().getInteger("mode")));
			//	}
				
		//	}
		//}
		
		//return new ActionResult (EnumActionResult.SUCCESS, itemStack);
	
	}
}