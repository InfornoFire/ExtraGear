package com.inforno.extragear.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockPrimalOre extends Block {
	
	public blockPrimalOre(Material mat) {
		super(mat);
		this.setHardness(10.0F);
		this.setResistance(20.0F);
		this.setHarvestLevel("pickaxe", 5);
		this.setLightLevel(0.2F);
	}

}
