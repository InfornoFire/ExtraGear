package com.inforno.extragear.potion;

import net.minecraft.potion.Potion;

public class _Potion {

	public static Potion EarthBound;
	
	public static final void preinit() {
		
		EarthBound = new effectEarthBound(false, 0);
		
	}
	
}
