package com.aeyrial.metroidprimemod.util.handlers;
import java.util.Random;

import com.aeyrial.metroidprimemod.util.handlers.SoundsHandler;

import net.minecraft.block.Block;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.client.audio.MovingSoundMinecart;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.Entity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.client.event.sound.PlaySoundSourceEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import scala.Console;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event; 



public class MPMEventHandler 
{
	Biome currentBiome = null;
//	Biome previousBiome = null;
	
	int counter = 0;
	
	@SubscribeEvent
	public void onMove(TickEvent.PlayerTickEvent event) {
		


		
		
		//Event event2 = ForgeEventFactory.onPlaySoundAtEntity(event.player, SoundsHandler.AMBIENCE_TALLON_OVERWORLD_MAIN_THEME, SoundCategory.MUSIC, Float.MAX_VALUE, 1.0F);
    	//PlaySoundAtEntityEvent event2 = new PlaySoundAtEntityEvent(event.player, SoundsHandler.AMBIENCE_TALLON_OVERWORLD_MAIN_THEME, SoundCategory.MUSIC, Float.MAX_VALUE, 1.0F);
		
		
		
		if(counter <= 0) { 
			currentBiome = event.player.getEntityWorld().getBiome(event.player.getPosition());
			
			//Two playing options:
			//event.player.getEntityWorld().playSound(event.player, event.player.getPosition(), SoundsHandler.AMBIENCE_SUNKEN_FRIGATE_MAIN_THEME, SoundCategory.MUSIC, 0.0F, 1.0F);
			//event.player.world.playSound(event.player, event.player.getPosition(), SoundsHandler.AMBIENCE_TALLON_OVERWORLD_MAIN_THEME, SoundCategory.MUSIC, 0.0F, 1.0F);
			
			/* Tallon Overworld Music */
			if((currentBiome == Biome.getBiome(3))  || (currentBiome == Biome.getBiome(4))   ||(currentBiome == Biome.getBiome(5))   || (currentBiome == Biome.getBiome(7))
			 ||(currentBiome == Biome.getBiome(21)) || (currentBiome == Biome.getBiome(23))  ||(currentBiome == Biome.getBiome(27))  || (currentBiome == Biome.getBiome(29))
			 ||(currentBiome == Biome.getBiome(32)) || (currentBiome == Biome.getBiome(132)) ||(currentBiome == Biome.getBiome(133)) || (currentBiome == Biome.getBiome(149))
			 ||(currentBiome == Biome.getBiome(151))|| (currentBiome == Biome.getBiome(155)) ||(currentBiome == Biome.getBiome(157)) || (currentBiome == Biome.getBiome(160))
			 ||(currentBiome == Biome.getBiome(164))|| (currentBiome == Biome.getBiome(167)))
			{
		    	event.player.getEntityWorld().playSound(event.player, event.player.getPosition(), SoundsHandler.AMBIENCE_TALLON_OVERWORLD_MAIN_THEME, SoundCategory.MUSIC, Float.MAX_VALUE, 1.0F);
		    	System.out.println("Tallon Overworld");
		    	counter = ((8*60)+24+5)*20;
		    	
			}
			/* Phendrana Drifts Music */
			else if((currentBiome == Biome.getBiome(10)) || (currentBiome == Biome.getBiome(11)) ||(currentBiome == Biome.getBiome(12))  ||(currentBiome == Biome.getBiome(30))
			 ||(currentBiome == Biome.getBiome(34)) || (currentBiome == Biome.getBiome(140))||(currentBiome == Biome.getBiome(158)))
			{

				event.player.getEntityWorld().playSound(event.player, event.player.getPosition(), SoundsHandler.AMBIENCE_PHENDRANA_DRIFTS_MAIN_THEME, SoundCategory.MUSIC, Float.MAX_VALUE, 1.0F);
				System.out.println("Phendrana Drifts");
				counter = ((7*60)+36+5)*20;
			}
			
			/* Chozo Ruins Music */
			else if((currentBiome == Biome.getBiome(2))  || (currentBiome == Biome.getBiome(35)) ||(currentBiome == Biome.getBiome(36))  ||(currentBiome == Biome.getBiome(37))
				  ||(currentBiome == Biome.getBiome(38)) || (currentBiome == Biome.getBiome(39)) ||(currentBiome == Biome.getBiome(130)) ||(currentBiome == Biome.getBiome(163))
			      ||(currentBiome == Biome.getBiome(165))|| (currentBiome == Biome.getBiome(166)))
			{
		    	event.player.getEntityWorld().playSound(event.player, event.player.getPosition(), SoundsHandler.AMBIENCE_CHOZO_RUINS, SoundCategory.MUSIC, Float.MAX_VALUE, 1.0F);
				System.out.println("Chozo Ruins");
				counter = ((9*60)+41+5)*20;
			}
			/* Phazon Mines Music */
			else if((currentBiome == Biome.getBiome(14)) || (currentBiome == Biome.getBiome(15)) ||(currentBiome == Biome.getBiome(131)) ||(currentBiome == Biome.getBiome(162)))
			{
				event.player.getEntityWorld().playSound(event.player, event.player.getPosition(), SoundsHandler.AMBIENCE_PHAZON_MINES, SoundCategory.MUSIC, Float.MAX_VALUE, 1.0F);
				System.out.println("Phazon Mines");
				counter = ((2*60)+5)*20;
			}
			/* Underwater Music */
			else if((currentBiome == Biome.getBiome(0))  || (currentBiome == Biome.getBiome(6))  ||(currentBiome == Biome.getBiome(16))  ||(currentBiome == Biome.getBiome(24))
				  ||(currentBiome == Biome.getBiome(25)) || (currentBiome == Biome.getBiome(26)) ||(currentBiome == Biome.getBiome(134)))
			{
				event.player.getEntityWorld().playSound(event.player, event.player.getPosition(), SoundsHandler.AMBIENCE_SUNKEN_FRIGATE, SoundCategory.MUSIC, Float.MAX_VALUE, 1.0F);
				System.out.println("Sunken Frigate");
				counter = ((8*60)+21+5)*20;
			}

//			previousBiome = currentBiome;
			currentBiome = null;

		
		}
		counter--;
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
    public static  PlaySoundAtEntityEvent onPlaySoundAtEntity(Entity entity, SoundEvent name, SoundCategory category, float volume, float pitch)
    {
        PlaySoundAtEntityEvent event = new PlaySoundAtEntityEvent(entity, name, category, volume, pitch);
        MinecraftForge.EVENT_BUS.post(event);
        return event;
    }


}
