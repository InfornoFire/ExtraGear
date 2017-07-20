package com.inforno.extragear.proxy;

import com.inforno.extragear.block._Blocks;
import com.inforno.extragear.item._Items;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	public void preinit(FMLPreInitializationEvent e) {super.preinit(e); }
	public void init(FMLInitializationEvent e) {super.init(e); _Items.registerRenders(); _Blocks.registerRenders(); }
	public void postinit(FMLPostInitializationEvent e) {super.postinit(e); }

}
