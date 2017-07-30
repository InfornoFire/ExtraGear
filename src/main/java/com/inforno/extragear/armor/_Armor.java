package com.inforno.extragear.armor;

import java.util.ArrayList;
import java.util.List;

import com.inforno.extragear.ModInfo;
import com.inforno.extragear.tab._Tabs;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class _Armor {
	
	private static final List<Item> items = new ArrayList<Item>();
	
	public static Item armorFlameHelmet, armorFlameChestplate, armorFlameLeggings, armorFlameBoots;
	public static Item armorAquaHelmet, armorAquaChestplate, armorAquaLeggings, armorAquaBoots;
	public static Item armorEarthHelmet, armorEarthChestplate, armorEarthLeggings, armorEarthBoots;
	public static Item armorWindHelmet, armorWindChestplate, armorWindLeggings, armorWindBoots;
	public static Item armorEmeraldHelmet, armorEmeraldChestplate, armorEmeraldLeggings, armorEmeraldBoots;
	public static Item armorObsidianHelmet, armorObsidianChestplate, armorObsidianLeggings, armorObsidianBoots;
	
	public static void preinit () {
		
		armorFlameHelmet = registerItem(new FlameArmor(1, EntityEquipmentSlot.HEAD), "flame_helmet");
		armorFlameChestplate = registerItem(new FlameArmor(1, EntityEquipmentSlot.CHEST), "flame_chestplate");
		armorFlameLeggings = registerItem(new FlameArmor(2, EntityEquipmentSlot.LEGS), "flame_leggings");
		armorFlameBoots = registerItem(new FlameArmor(1, EntityEquipmentSlot.FEET), "flame_boots");
		
		armorAquaHelmet = registerItem(new AquaArmor(1, EntityEquipmentSlot.HEAD), "aqua_helmet");
		armorAquaChestplate = registerItem(new AquaArmor(1, EntityEquipmentSlot.CHEST), "aqua_chestplate");
		armorAquaLeggings = registerItem(new AquaArmor(2, EntityEquipmentSlot.LEGS), "aqua_leggings");
		armorAquaBoots = registerItem(new AquaArmor(1, EntityEquipmentSlot.FEET), "aqua_boots");
		
		armorEarthHelmet = registerItem(new EarthArmor(1, EntityEquipmentSlot.HEAD), "earth_helmet");
		armorEarthChestplate = registerItem(new EarthArmor(1, EntityEquipmentSlot.CHEST), "earth_chestplate");
		armorEarthLeggings = registerItem(new EarthArmor(2, EntityEquipmentSlot.LEGS), "earth_leggings");
		armorEarthBoots = registerItem(new EarthArmor(1, EntityEquipmentSlot.FEET), "earth_boots");
		
		armorWindHelmet = registerItem(new WindArmor(1, EntityEquipmentSlot.HEAD), "wind_helmet");
		armorWindChestplate = registerItem(new WindArmor(1, EntityEquipmentSlot.CHEST), "wind_chestplate");
		armorWindLeggings = registerItem(new WindArmor(2, EntityEquipmentSlot.LEGS), "wind_leggings");
		armorWindBoots = registerItem(new WindArmor(1, EntityEquipmentSlot.FEET), "wind_boots");
		
		armorEmeraldHelmet = registerItem(new EmeraldArmor(1, EntityEquipmentSlot.HEAD), "emerald_helmet");
		armorEmeraldChestplate = registerItem(new EmeraldArmor(1, EntityEquipmentSlot.CHEST), "emerald_chestplate");
		armorEmeraldLeggings = registerItem(new EmeraldArmor(2, EntityEquipmentSlot.LEGS), "emerald_leggings");
		armorEmeraldBoots = registerItem(new EmeraldArmor(1, EntityEquipmentSlot.FEET), "emerald_boots");
		
		armorObsidianHelmet = registerItem(new ObsidianArmor(1, EntityEquipmentSlot.HEAD), "obsidian_helmet");
		armorObsidianChestplate = registerItem(new ObsidianArmor(1, EntityEquipmentSlot.CHEST), "obsidian_chestplate");
		armorObsidianLeggings = registerItem(new ObsidianArmor(2, EntityEquipmentSlot.LEGS), "obsidian_leggings");
		armorObsidianBoots = registerItem(new ObsidianArmor(1, EntityEquipmentSlot.FEET), "obsidian_boots");
	}
	
	public static void registerRenders() {
		for(Item i : items) {
			registerRender(i);
		}
	}
	
	public static final void registerRender(Item i) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, 
				new ModelResourceLocation(ModInfo.modid + ":" + i.getRegistryName().getResourcePath(), "inventory"));
	}
	public static Item registerItem(Item i, String n) {
		ResourceLocation r = new ResourceLocation(ModInfo.modid, n);
		i.setUnlocalizedName(n);
		i.setRegistryName(r);
		i.setCreativeTab(_Tabs.tabExtraGear);
		GameRegistry.register(i);
		items.add(i);
		return i;
	}

}
