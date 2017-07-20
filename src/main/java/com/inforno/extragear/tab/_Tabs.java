package com.inforno.extragear.tab;

import net.minecraft.creativetab.CreativeTabs;

public class _Tabs {
	
	public static CreativeTabs tabExtraGear;
	
	public static final void preinit() {
		tabExtraGear = new TabExtraGear("tabExtraGear");
	}

}
