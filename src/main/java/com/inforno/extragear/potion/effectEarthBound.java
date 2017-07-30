package com.inforno.extragear.potion;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class effectEarthBound extends Potion {

	public static final ResourceLocation icon = new ResourceLocation("earthbound");
	
	protected effectEarthBound(boolean isBadEffectIn, int liquidColorIn) {
		super(isBadEffectIn, liquidColorIn);
		
	}

}