package com.inforno.extragear.mat;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class _ToolMats {
	
	public static ToolMaterial materialFlame;
	public static ToolMaterial materialAqua;
	public static ToolMaterial materialEarth;
	public static ToolMaterial materialWind;
	public static ToolMaterial materialWindPaxel;
	
	public static ToolMaterial materialEmerald;
	public static ToolMaterial materialObsidian;
	
	public static final void preinit() {
		materialFlame = EnumHelper.addToolMaterial("materialFlame", 5, 2560, 15.0f, 16.0f, 15);
		materialAqua = EnumHelper.addToolMaterial("materialAqua", 5, 2560, 19.0f, 13.0f, 17);
		materialEarth = EnumHelper.addToolMaterial("materialEarth", 5, 2560, 17.0f, 11.0f, 17);
		materialWind = EnumHelper.addToolMaterial("materialWind", 5, 2560, 25.0f, 13.0f, 20);
		materialWindPaxel = EnumHelper.addToolMaterial("materialWindPaxel", 5, 5120, 50.0f, 17.0f, 20);
		
		materialEmerald = EnumHelper.addToolMaterial("materialEmerald", 3, 1561, 7.0f, 3.0f, 14);
		materialObsidian = EnumHelper.addToolMaterial("materialObsidian", 3, 250, 6.0F, 2.0F, 14);
	}

}