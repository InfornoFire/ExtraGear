package com.inforno.extragear.recipe;

import com.inforno.extragear.block._Blocks;
import com.inforno.extragear.item._Items;
import com.jcraft.jorbis.Block;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class _Recipes {
	
	public static final void init() {
		registerRecipes();
		registerSmelting();
	}
	
	private static final void registerRecipes() {
		addRecipe(new ItemStack(_Items.itemFlameSword, 1), new Object[ ] { " f ", "idi", " b ", Character.valueOf('f'), _Blocks.blockFlameBlock, Character.valueOf('i'), _Items.itemFlameIngot,Character.valueOf('d'), Items.DIAMOND_SWORD, Character.valueOf('b'), Items.BLAZE_ROD, });
		addRecipe(new ItemStack(_Items.itemFlamePickaxe, 1), new Object[ ] { " f ", "fdf", " b ", Character.valueOf('f'), _Items.itemFlameIngot, Character.valueOf('d'), Items.DIAMOND_PICKAXE, Character.valueOf('b'), Items.BLAZE_ROD, });
		addRecipe(new ItemStack(_Items.itemFlameAxe, 1), new Object[ ] { " f ", "idi", " b ", Character.valueOf('f'), _Blocks.blockFlameBlock, Character.valueOf('i'), _Items.itemFlameIngot, Character.valueOf('d'), Items.DIAMOND_AXE, Character.valueOf('b'), Items.BLAZE_ROD, });
		addRecipe(new ItemStack(_Items.itemFlameShovel, 1), new Object[ ] { " f ", "fdf", " b ", Character.valueOf('f'), _Items.itemFlameIngot, Character.valueOf('d'), Items.DIAMOND_SHOVEL, Character.valueOf('b'), Items.BLAZE_ROD, });
		
		addRecipe(new ItemStack(_Items.itemPrismarineStick, 1), new Object[ ] { "   ", " p ", " p ", Character.valueOf('p'), Items.PRISMARINE_SHARD, });
		
		addRecipe(new ItemStack(_Items.itemAquaSword, 1), new Object[ ] { " a ", "idi", " p ", Character.valueOf('a'), _Blocks.blockAquaBlock, Character.valueOf('i'), _Items.itemAquaIngot, Character.valueOf('d'), Items.DIAMOND_SWORD, Character.valueOf('p'), _Items.itemPrismarineStick, });
		addRecipe(new ItemStack(_Items.itemAquaPickaxe, 1), new Object[ ] { " a ", "ada", " p ", Character.valueOf('a'), _Items.itemAquaIngot, Character.valueOf('d'), Items.DIAMOND_PICKAXE, Character.valueOf('p'), _Items.itemPrismarineStick, });
		addRecipe(new ItemStack(_Items.itemAquaAxe, 1), new Object[ ] { " a ", "idi", " p ", Character.valueOf('a'), _Blocks.blockAquaBlock, Character.valueOf('i'), _Items.itemAquaIngot, Character.valueOf('d'), Items.DIAMOND_AXE, Character.valueOf('p'), _Items.itemPrismarineStick, });
		addRecipe(new ItemStack(_Items.itemAquaShovel, 1), new Object[ ] { " a ", "ada", " p ", Character.valueOf('a'), _Items.itemAquaIngot, Character.valueOf('d'), Items.DIAMOND_SHOVEL, Character.valueOf('p'), _Items.itemPrismarineStick, });
		
		addRecipe(new ItemStack(_Items.itemEarthSword, 1), new Object[ ] { " e ", "idi", " s ", Character.valueOf('e'), _Blocks.blockEarthBlock, Character.valueOf('i'), _Items.itemEarthIngot, Character.valueOf('d'), Items.DIAMOND_SWORD, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemEarthPickaxe, 1), new Object[ ] { " e ", "ede", " s ", Character.valueOf('e'), _Items.itemEarthIngot, Character.valueOf('d'), Items.DIAMOND_PICKAXE, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemEarthAxe, 1), new Object[ ] { " e ", "idi", " s ", Character.valueOf('e'), _Blocks.blockEarthBlock, Character.valueOf('i'), _Items.itemEarthIngot, Character.valueOf('d'), Items.DIAMOND_AXE, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemEarthShovel, 1), new Object[ ] { " e ", "ede", " s ", Character.valueOf('e'), _Items.itemEarthIngot, Character.valueOf('d'), Items.DIAMOND_SHOVEL, Character.valueOf('s'), Items.STICK, });
		
		addRecipe(new ItemStack(_Items.itemWindSword, 1), new Object[ ] { " w ", "idi", " s ", Character.valueOf('w'), _Blocks.blockWindBlock, Character.valueOf('i'), _Items.itemWindIngot, Character.valueOf('d'), Items.DIAMOND_SWORD, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemWindPickaxe, 1), new Object[ ] { " w ", "wdw", " s ", Character.valueOf('w'), _Items.itemWindIngot, Character.valueOf('d'), Items.DIAMOND_PICKAXE, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemWindAxe, 1), new Object[ ] { " w ", "idi", " s ", Character.valueOf('w'), _Blocks.blockWindBlock, Character.valueOf('i'), _Items.itemWindIngot, Character.valueOf('d'), Items.DIAMOND_AXE, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemWindShovel, 1), new Object[ ] { " w ", "wdw", " s ", Character.valueOf('w'), _Items.itemWindIngot, Character.valueOf('d'), Items.DIAMOND_SHOVEL, Character.valueOf('s'), Items.STICK, });
		
		addRecipe(new ItemStack(_Items.itemEmeraldSword, 1), new Object[ ] { " e ", " e ", " s ", Character.valueOf('e'), Items.EMERALD, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemEmeraldPickaxe, 1), new Object[ ] { "eee", " s ", " s ", Character.valueOf('e'), Items.EMERALD, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemEmeraldAxe, 1), new Object[ ] { "ee ", "es ", " s ", Character.valueOf('e'), Items.EMERALD, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemEmeraldShovel, 1), new Object[ ] { " e ", " s ", " s ", Character.valueOf('e'), Items.EMERALD, Character.valueOf('s'), Items.STICK, });
		
		addRecipe(new ItemStack(_Items.itemObsidianSword, 1), new Object[ ] { " o ", " o ", " s ", Character.valueOf('o'), Blocks.OBSIDIAN, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemObsidianPickaxe, 1), new Object[ ] { "ooo", " s ", " s ", Character.valueOf('o'), Blocks.OBSIDIAN, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemObsidianAxe, 1), new Object[ ] { "oo ", "os ", " s ", Character.valueOf('o'), Blocks.OBSIDIAN, Character.valueOf('s'), Items.STICK, });
		addRecipe(new ItemStack(_Items.itemObsidianShovel, 1), new Object[ ] { " o ", " s ", " s ", Character.valueOf('o'), Blocks.OBSIDIAN, Character.valueOf('s'), Items.STICK, });
		
		addRecipeShapeless(new ItemStack(_Items.itemPrimalIngot, 9), new ItemStack(_Blocks.blockPrimalBlock));
		addRecipeShapeless(new ItemStack(_Items.itemFlameIngot, 9), new ItemStack(_Blocks.blockFlameBlock));
		addRecipeShapeless(new ItemStack(_Items.itemAquaIngot, 9), new ItemStack(_Blocks.blockAquaBlock));
		addRecipeShapeless(new ItemStack(_Items.itemEarthIngot, 9), new ItemStack(_Blocks.blockEarthBlock));
		addRecipeShapeless(new ItemStack(_Items.itemWindIngot, 9), new ItemStack(_Blocks.blockWindBlock));
		
		addRecipe(new ItemStack(_Blocks.blockPrimalBlock, 1), new Object[ ] { "ppp", "ppp", "ppp", Character.valueOf('p'), _Items.itemPrimalIngot, });
		addRecipe(new ItemStack(_Blocks.blockFlameBlock, 1), new Object[ ] { "fff", "fff", "fff", Character.valueOf('f'), _Items.itemFlameIngot, });
		addRecipe(new ItemStack(_Blocks.blockAquaBlock, 1), new Object[ ] { "aaa", "aaa", "aaa", Character.valueOf('a'), _Items.itemAquaIngot, });
		addRecipe(new ItemStack(_Blocks.blockEarthBlock, 1), new Object[ ] { "eee", "eee", "eee", Character.valueOf('e'), _Items.itemEarthIngot, });
		addRecipe(new ItemStack(_Blocks.blockWindBlock, 1), new Object[ ] { "www", "www", "www", Character.valueOf('w'), _Items.itemWindIngot, });
		
		addRecipe(new ItemStack(_Items.itemFlameIngot, 1), new Object[ ] { "bbb", "bpb", "bbb", Character.valueOf('p'), _Items.itemPrimalIngot, Character.valueOf('b'), Items.BLAZE_POWDER, });
		addRecipe(new ItemStack(_Items.itemAquaIngot, 1), new Object[ ] { "sss", "sps", "sss", Character.valueOf('p'), _Items.itemPrimalIngot, Character.valueOf('s'), Items.PRISMARINE_SHARD, });
		addRecipe(new ItemStack(_Items.itemEarthIngot, 1), new Object[ ] { "lll", "lpl", "lll", Character.valueOf('p'), _Items.itemPrimalIngot, Character.valueOf('l'), Blocks.LEAVES, });
		addRecipe(new ItemStack(_Items.itemWindIngot, 1), new Object[ ] { "fff", "fpf", "fff", Character.valueOf('p'), _Items.itemPrimalIngot, Character.valueOf('f'), Items.FEATHER, });
	}
	
	private static final void registerSmelting() {
		addSmelting(new ItemStack(_Blocks.blockPrimalOre), new ItemStack(_Items.itemPrimalIngot), 10);
	}
	
	public static final void addRecipe(ItemStack out, Object... in) {
		GameRegistry.addRecipe(new ShapedOreRecipe(out, in));
	}
	
	private static final void addRecipeShapeless(ItemStack out, Object... in) {
		GameRegistry.addRecipe(new ShapelessOreRecipe(out, in));
	}
	
	private static final void addSmelting(ItemStack in, ItemStack out, float xp) {
		GameRegistry.addSmelting(in, out, xp);
	}
	
}
