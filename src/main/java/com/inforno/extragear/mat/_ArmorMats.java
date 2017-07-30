package com.inforno.extragear.mat;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class _ArmorMats {
	
	public static ArmorMaterial materialFlameArmor;
	public static ArmorMaterial materialAquaArmor;
	public static ArmorMaterial materialEarthArmor;
	public static ArmorMaterial materialWindArmor;
	
	public static ArmorMaterial materialEmeraldArmor;
	public static ArmorMaterial materialObsidianArmor;
	
	public static final void preinit() {
		
		materialFlameArmor = EnumHelper.addArmorMaterial("materialFlameArmor", "extragear:flame", 66, new int[]{4,7,8,4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
		materialAquaArmor = EnumHelper.addArmorMaterial("materialAquaArmor", "extragear:aqua", 66, new int[]{4,7,8,4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
		materialEarthArmor = EnumHelper.addArmorMaterial("materialEarthArmor", "extragear:earth", 66, new int[]{4,8,8,4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
		materialWindArmor = EnumHelper.addArmorMaterial("materialWindArmor", "extragear:wind", 66, new int[]{3,7,8,4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
		
		materialEmeraldArmor = EnumHelper.addArmorMaterial("materialEmeraldArmor", "extragear:emerald", 33, new int[]{3,6,8,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
		materialObsidianArmor = EnumHelper.addArmorMaterial("materialObsidianArmor", "extragear:obsidian", 15, new int[]{2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
		
	}

}
