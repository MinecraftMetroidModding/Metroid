package com.aeyrial.metroidprimemod.util.handlers;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import scala.Console;


public class MPMEventHandler
{	
	//@SubscribeEvent
	//public void
	@SubscribeEvent
	public void onMove(TickEvent.PlayerTickEvent event, SoundEvent Music) {
		
//		event.player.getEntityWorld().getBiome(event.player.getPosition()) == Biome.getBiome(0)
		
		if(event.player.getEntityWorld().getBiome(event.player.getPosition()) == Biome.getBiome(0))
		{
		
			//System.out.println(event.player.getEntityWorld().getBiome(event.player.getPosition()) == Biome.getBiome(0));
			System.out.println("Did the music play?");
			
			//TO DO: Implement the following concept
//				if (i > someValue){
//					playSound
//				}
//			// Change onMove Vars and function call to allow the sound input (soundEvent Music)
			
			
		}
		
//		event.
		
//		World.class.GetBiomeGenForCoords(event.player.getPosition().getX(),event.player.getPosition().getZ());
		
		
		//EntityPlayer player = Minecraft.getMinecraft().player;
		
		//event.PlayerTickEvent(TickEvent.Phase.START, player);
		
		
		
		//System.out.println("Player Tick Event");
		//Console.out().print("Player Tick Event");
	}
	
	
	
	 
	 //Called when the client ticks. 
	@SubscribeEvent
	public void onClientTick(TickEvent.ClientTickEvent event) {

	}
	 
	 //Called when the server ticks. Usually 20 ticks a second. 
	@SubscribeEvent
	public void onServerTick(TickEvent.ServerTickEvent event) {
		
	}
	 

	 
	 //Called when the world ticks
	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {

		//biome check
			//play some sweet jazz
		
	}
	
	/* //Called when a new frame is displayed (See fps) 
	@SubscribeEvent
	public void onRenderTick(TickEvent.RenderTickEvent event) {

	}*/
	
}
