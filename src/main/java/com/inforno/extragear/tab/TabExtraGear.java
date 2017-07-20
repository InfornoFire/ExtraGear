package com.inforno.extragear.tab;

import com.inforno.extragear.item._Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabExtraGear extends CreativeTabs {

	public TabExtraGear(String n) {
		super(n);
	}
	
	public Item getTabIconItem() {
		return _Items.itemFlameSword;
	}

}
