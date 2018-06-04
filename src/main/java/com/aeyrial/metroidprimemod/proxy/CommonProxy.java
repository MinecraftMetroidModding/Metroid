package com.aeyrial.metroidprimemod.proxy;

import net.minecraft.item.Item;

public class CommonProxy
{
	public void registerItemRenderer(Item item, int meta, String id) {}
	
	
	
	/**
	* We will call this method from our main mod class' FMLPreInitializationEvent method
	*/
	public void initialize() {
	// since we are not registering a tick handler that ticks on the server, we will not put anything here for now
	// but if you had a WorldTickEvent or PlayerTickEvent, for example, this is where you should register it
	// if you try to register the RenderTickHandler here, your game WILL crash
	}
	
}
