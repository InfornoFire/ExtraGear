package com.inforno.extragear.block;

import java.util.ArrayList;
import java.util.List;

import com.inforno.extragear.ModInfo;
import com.inforno.extragear.item._Items;
import com.inforno.extragear.tab._Tabs;
import com.inforno.extragear.world._WorldGen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class _Blocks {
	
	private static final List<Block> blocks = new ArrayList<Block>();
	
	public static Block blockPrimalOre;
	public static Block blockPrimalBlock;
	public static Block blockFlameBlock;
	public static Block blockAquaBlock;
	public static Block blockEarthBlock;
	public static Block blockWindBlock;
	
	public static final void preinit() {
		blockPrimalOre = registerBlock(new blockPrimalOre(Material.ROCK), "primal_ore");
		blockPrimalBlock = registerBlock(new blockPrimalBlock(Material.IRON), "primal_block");
		blockFlameBlock = registerBlock(new blockPrimalBlock(Material.IRON), "flame_block");
		blockAquaBlock = registerBlock(new blockPrimalBlock(Material.IRON), "aqua_block");
		blockEarthBlock = registerBlock(new blockPrimalBlock(Material.IRON), "earth_block");
		blockWindBlock = registerBlock(new blockPrimalBlock(Material.IRON), "wind_block");
	}
	
	public static final void registerRenders() { }
	
	private static final Block registerBlock(Block b, String n) {
		ResourceLocation r = new ResourceLocation(ModInfo.modid, n);
				
		b.setUnlocalizedName(n);
		b.setRegistryName(r);
		
		GameRegistry.register(b);
		b.setCreativeTab(_Tabs.tabExtraGear);
		_Items.registerItem(new ItemBlock(b), n);
		blocks.add(b);
		return b;
	}

}
