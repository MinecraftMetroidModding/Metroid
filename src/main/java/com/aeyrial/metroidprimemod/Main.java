package com.aeyrial.metroidprimemod;

import com.aeyrial.metroidprimemod.init.ModBlocks;
import com.aeyrial.metroidprimemod.init.ModCrafting;
import com.aeyrial.metroidprimemod.init.ModItems;
import com.aeyrial.metroidprimemod.proxy.CommonProxy;
import com.aeyrial.metroidprimemod.util.Reference;
import com.aeyrial.metroidprimemod.util.handlers.MPMEventHandler;
import com.aeyrial.metroidprimemod.util.handlers.RegistryHandler;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModClassLoader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import scala.Console;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){RegistryHandler.preInitRegistries();}
	
	@EventHandler
	public static void init(FMLInitializationEvent event){RegistryHandler.initRegistries();}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){}
	
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	// IMPORTANT: Be sure to register your handler on the correct bus!!! (see below)

	// the majority of events use the MinecraftForge event bus:
	//MinecraftForge.EVENT_BUS.register(new MPMEventHandler());

	// but some are on the FML bus:
	FMLCommonHandler.instance().bus().register(new MPMEventHandler());
	
	
	}
	
	
	//FMLCommonHandler.bus().register();
	
	// Phase phase, EntityPlayer player

	//Called whenever the player is updated or ticked. 
	
	
}
