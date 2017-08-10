package com.inforno.extragear.item;

import java.util.ArrayList;
import java.util.List;

import com.inforno.extragear.ModInfo;
import com.inforno.extragear.mat._ToolMats;
import com.inforno.extragear.mat._ArmorMats;
import com.inforno.extragear.tab._Tabs;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class _Items {
	
	private static final List<Item> items = new ArrayList<Item>();
	
	public static Item itemPrimalIngot, itemFlameIngot, itemAquaIngot, itemEarthIngot, itemWindIngot;
	public static Item itemPrismarineStick;
	public static Item itemFlameSword, itemFlamePickaxe, itemFlameAxe, itemFlameShovel;
	public static Item itemFlameScythe;
	public static Item itemAquaSword, itemAquaPickaxe, itemAquaAxe, itemAquaShovel;
	public static Item itemAquaBow;
	public static Item itemAquaDagger;
	public static Item itemEarthSword, itemEarthPickaxe, itemEarthAxe, itemEarthShovel;
	public static Item foodEarthApple;
	public static Item itemWindSword, itemWindPickaxe, itemWindAxe, itemWindShovel;
	public static Item itemWindPaxel;
	public static Item itemEmeraldSword, itemEmeraldPickaxe, itemEmeraldAxe, itemEmeraldShovel;
	public static Item itemObsidianSword, itemObsidianPickaxe, itemObsidianAxe, itemObsidianShovel;
	
	public static final void preinit() {
		
		itemPrimalIngot= registerItem(new Item(), "primal_ingot");
		itemFlameIngot= registerItem(new Item(), "flame_ingot");
		itemAquaIngot= registerItem(new Item(), "aqua_ingot");
		itemEarthIngot= registerItem(new Item(), "earth_ingot");
		itemWindIngot= registerItem(new Item(), "wind_ingot");
		
		itemPrismarineStick= registerItem(new Item(), "prismarine_stick");
		
		itemFlameSword= registerItem(new itemFlameSword(_ToolMats.materialFlame), "flame_sword");
		itemFlamePickaxe= registerItem(new itemFlamePickaxe(_ToolMats.materialFlame), "flame_pickaxe");
		itemFlameAxe= registerItem(new itemFlameAxe(_ToolMats.materialFlame), "flame_axe");
		itemFlameShovel= registerItem(new itemFlameShovel(_ToolMats.materialFlame), "flame_shovel");
		itemFlameScythe= registerItem(new itemFlameScythe(_ToolMats.materialFlame), "flame_scythe");
		
		itemAquaSword= registerItem(new itemAquaSword(_ToolMats.materialAqua), "aqua_sword");
		itemAquaPickaxe= registerItem(new itemAquaPickaxe(_ToolMats.materialAqua), "aqua_pickaxe");
		itemAquaAxe= registerItem(new itemAquaAxe(_ToolMats.materialAqua), "aqua_axe");
		itemAquaShovel= registerItem(new itemAquaShovel(_ToolMats.materialAqua), "aqua_shovel");
		itemAquaDagger= registerItem(new itemAquaDagger(_ToolMats.materialAqua), "aqua_dagger");
		//itemAquaBow= registerItem(new itemAquaBow(), "aqua_bow");
		
		itemEarthSword= registerItem(new itemEarthSword(_ToolMats.materialEarth), "earth_sword");
		itemEarthPickaxe= registerItem(new itemEarthPickaxe(_ToolMats.materialEarth), "earth_pickaxe");
		itemEarthAxe= registerItem(new itemEarthAxe(_ToolMats.materialEarth), "earth_axe");
		itemEarthShovel= registerItem(new itemEarthShovel(_ToolMats.materialEarth), "earth_shovel");
		foodEarthApple= registerItem(new foodEarthApple(), "earth_apple");
		
		itemWindSword= registerItem(new itemWindSword(_ToolMats.materialWind), "wind_sword");
		itemWindPickaxe= registerItem(new itemWindPickaxe(_ToolMats.materialWind), "wind_pickaxe");
		itemWindAxe= registerItem(new itemWindAxe(_ToolMats.materialWind), "wind_axe");
		itemWindShovel= registerItem(new itemWindShovel(_ToolMats.materialWind), "wind_shovel");
		itemWindPaxel= registerItem(new itemWindPaxel(_ToolMats.materialWindPaxel), "wind_paxel");
		
		itemEmeraldSword= registerItem(new itemEmeraldSword(_ToolMats.materialEmerald), "emerald_sword");
		itemEmeraldPickaxe= registerItem(new itemEmeraldPickaxe(_ToolMats.materialEmerald), "emerald_pickaxe");
		itemEmeraldAxe= registerItem(new itemEmeraldAxe(_ToolMats.materialEmerald), "emerald_axe");
		itemEmeraldShovel= registerItem(new itemEmeraldShovel(_ToolMats.materialEmerald), "emerald_shovel");

		itemObsidianSword= registerItem(new itemObsidianSword(_ToolMats.materialObsidian), "obsidian_sword");
		itemObsidianPickaxe= registerItem(new itemObsidianPickaxe(_ToolMats.materialObsidian), "obsidian_pickaxe");
		itemObsidianAxe= registerItem(new itemObsidianAxe(_ToolMats.materialObsidian), "obsidian_axe");
		itemObsidianShovel= registerItem(new itemObsidianShovel(_ToolMats.materialObsidian), "obsidian_shovel");
	}

	public static final void registerRenders() {
		for(Item i : items) {
			registerRender(i);
		}

	}
	
	public static final void registerRender(Item i) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, 
				new ModelResourceLocation(ModInfo.modid + ":" + i.getRegistryName().getResourcePath(), "inventory"));
	}
	public static final Item registerItem(Item i, String n) {
		ResourceLocation r = new ResourceLocation(ModInfo.modid, n);
		i.setUnlocalizedName(n);
		i.setRegistryName(r);
		GameRegistry.register(i);
		i.setCreativeTab(_Tabs.tabExtraGear);
		items.add(i);
		return i;
	}

}
