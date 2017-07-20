package com.inforno.extragear.item;

import java.util.ArrayList;
import java.util.List;

import com.inforno.extragear.ModInfo;
import com.inforno.extragear.mat._ToolMats;
import com.inforno.extragear.tab._Tabs;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class _Items {
	
	private static final List<Item> items = new ArrayList<Item>();
	
	public static Item itemPrimalIngot;
	public static Item itemFlameIngot;
	public static Item itemAquaIngot;
	public static Item itemEarthIngot;
	public static Item itemWindIngot;
	
	public static Item itemPrismarineStick;
	
	public static Item itemFlameSword;
	public static Item itemFlamePickaxe;
	public static Item itemFlameAxe;
	public static Item itemFlameShovel;
	public static Item itemFlameSycthe;
	
	public static Item itemAquaSword;
	public static Item itemAquaPickaxe;
	public static Item itemAquaAxe;
	public static Item itemAquaShovel;
	public static Item itemAquaSycthe;
	
	public static Item itemEarthSword;
	public static Item itemEarthPickaxe;
	public static Item itemEarthAxe;
	public static Item itemEarthShovel;
	public static Item itemEarthSycthe;
	
	public static Item itemWindSword;
	public static Item itemWindPickaxe;
	public static Item itemWindAxe;
	public static Item itemWindShovel;
	public static Item itemWindSycthe;
	
	public static Item itemEmeraldSword;
	public static Item itemEmeraldPickaxe;
	public static Item itemEmeraldAxe;
	public static Item itemEmeraldShovel;
	
	public static Item itemObsidianSword;
	public static Item itemObsidianPickaxe;
	public static Item itemObsidianAxe;
	public static Item itemObsidianShovel;
	
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
		
		itemAquaSword= registerItem(new itemAquaSword(_ToolMats.materialAqua), "aqua_sword");
		itemAquaPickaxe= registerItem(new itemAquaPickaxe(_ToolMats.materialAqua), "aqua_pickaxe");
		itemAquaAxe= registerItem(new itemAquaAxe(_ToolMats.materialAqua), "aqua_axe");
		itemAquaShovel= registerItem(new itemAquaShovel(_ToolMats.materialAqua), "aqua_shovel");
		
		itemEarthSword= registerItem(new itemEarthSword(_ToolMats.materialEarth), "earth_sword");
		itemEarthPickaxe= registerItem(new itemEarthPickaxe(_ToolMats.materialEarth), "earth_pickaxe");
		itemEarthAxe= registerItem(new itemEarthAxe(_ToolMats.materialEarth), "earth_axe");
		itemEarthShovel= registerItem(new itemEarthShovel(_ToolMats.materialEarth), "earth_shovel");
		
		itemWindSword= registerItem(new itemWindSword(_ToolMats.materialWind), "wind_sword");
		itemWindPickaxe= registerItem(new itemWindPickaxe(_ToolMats.materialWind), "wind_pickaxe");
		itemWindAxe= registerItem(new itemWindAxe(_ToolMats.materialWind), "wind_axe");
		itemWindShovel= registerItem(new itemWindShovel(_ToolMats.materialWind), "wind_shovel");
		
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
