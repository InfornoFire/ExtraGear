package com.inforno.extragear.proxy;

import com.inforno.extragear.armor._Armor;
import com.inforno.extragear.block._Blocks;
import com.inforno.extragear.item._Items;
import com.inforno.extragear.mat._ArmorMats;
import com.inforno.extragear.mat._ToolMats;
import com.inforno.extragear.recipe._Recipes;
import com.inforno.extragear.tab._Tabs;
import com.inforno.extragear.world._WorldGen;
import com.inforno.extragear.world._WorldGenMinable;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy {

	public void preinit(FMLPreInitializationEvent e) {
		_Tabs.preinit();
		_ToolMats.preinit();
		_ArmorMats.preinit();
		_Blocks.preinit();
		_Items.preinit();
		_Armor.preinit();
	}

	public void init(FMLInitializationEvent e) {
		_Recipes.init();
		GameRegistry.registerWorldGenerator(new _WorldGen(), 0);
	}

	public void postinit(FMLPostInitializationEvent e) {}

}
