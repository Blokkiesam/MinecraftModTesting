package com.dimmerworld.tutorialmod.proxy;

import com.dimmerworld.tutorialmod.item.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void preinit(FMLPreInitializationEvent event) {
		
	}
	@Override
	public void init(FMLInitializationEvent event) {
ModItems.registerRenders();
	}
	@Override
	public void postinit(FMLPostInitializationEvent event) {

	}

}
