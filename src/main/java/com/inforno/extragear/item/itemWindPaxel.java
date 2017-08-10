package com.inforno.extragear.item;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class itemWindPaxel extends ItemPickaxe{

	protected itemWindPaxel(ToolMaterial mat) {
		super(mat);
	}
	
	@Override
	public Set<String> getToolClasses(ItemStack itemStack) {
	    return ImmutableSet.of("pickaxe", "shovel", "axe");
	}
    
	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.GRASS, Blocks.GRASS_PATH, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND, Blocks.SOUL_SAND, Blocks.MYCELIUM, 
		    Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.CHORUS_FLOWER, Blocks.CHORUS_PLANT, Blocks.LEAVES, Blocks.LEAVES2 });
	
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();
        return block == Blocks.SNOW_LAYER ? true : block == Blocks.SNOW;
    }
    
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == _Items.itemWindIngot ? true : super.getIsRepairable(toRepair, repair);
    }

}
