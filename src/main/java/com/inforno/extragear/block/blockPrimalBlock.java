package com.inforno.extragear.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockPrimalBlock extends Block {
	
	public blockPrimalBlock(Material mat) {
		super(mat);
		this.setHardness(13.0F);
		this.setResistance(20.0F);
		this.setHarvestLevel("pickaxe", 5);
		this.setLightLevel(1.0F);
	}

}
