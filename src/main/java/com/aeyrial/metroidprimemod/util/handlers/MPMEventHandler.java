package com.aeyrial.metroidprimemod.util.handlers;
import com.aeyrial.metroidprimemod.util.handlers.SoundsHandler;

import net.minecraft.block.Block;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.client.audio.MovingSoundMinecart;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.client.event.sound.PlaySoundSourceEvent;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import scala.Console;




public class MPMEventHandler 
{
	Biome currentBiome = null;
	Biome previousBiome = null;
	
	@SubscribeEvent
	public void onMove(TickEvent.PlayerTickEvent event) {
		

		

		currentBiome = event.player.getEntityWorld().getBiome(event.player.getPosition());
		if(currentBiome == Biome.getBiome(0)&&(currentBiome!=previousBiome))
		{
			
			// stop current music
			
			
			event.player.world.playSound(event.player, event.player.getPosition(), SoundsHandler.AMBIENCE_TALLON_OVERWORLD_MAIN_THEME, SoundCategory.MUSIC, 0.5F, 1.0F);
//			MovingSound.this.getSound().
			System.out.println("Is the music playing?");
		}
		if((currentBiome!=previousBiome))
		{
			previousBiome = currentBiome;
			currentBiome = null;
		}
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
