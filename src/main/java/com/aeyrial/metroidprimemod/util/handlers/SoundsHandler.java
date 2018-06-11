package com.aeyrial.metroidprimemod.util.handlers;

import com.aeyrial.metroidprimemod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
	public static SoundEvent ENTITY_ZOOMER_AMBIENT, ENTITY_ZOOMER_HURT, ENTITY_ZOOMER_DEATH, ENTITY_ZOOMER_ATTACK,
	AMBIENCE_TALLON_OVERWORLD,AMBIENCE_SUNKEN_FRIGATE, AMBIENCE_PHENDRANA_DRIFTS, AMBIENCE_PHAZON_MINES, 
	AMBIENCE_CHOZO_RUINS, SILENCE1, SILENCE2, SILENCE3, SILENCE4,
	
	AMBIENCE_TALLON_OVERWORLD_MAIN_THEME, AMBIENCE_PHENDRANA_DRIFTS_MAIN_THEME, AMBIENCE_CHOZO_RUINS_MAIN_THEME, AMBIENCE_SUNKEN_FRIGATE_MAIN_THEME, AMBIENCE_PHAZON_MINES_MAIN_THEME;
	
	
	public static void registerSounds()
	{
		ENTITY_ZOOMER_AMBIENT = registerSound("entity.zoomer.ambient");
		ENTITY_ZOOMER_HURT = registerSound("entity.zoomer.hurt");
		ENTITY_ZOOMER_DEATH = registerSound("entity.zoomer.death");
		ENTITY_ZOOMER_ATTACK = registerSound("entity.zoomer.attack");
		AMBIENCE_TALLON_OVERWORLD = registerSound("ambience.tallon_overworld");
		AMBIENCE_SUNKEN_FRIGATE = registerSound("ambience.sunken_frigate");
		AMBIENCE_PHENDRANA_DRIFTS = registerSound("ambience.phendrana_drifts");
		AMBIENCE_PHAZON_MINES = registerSound("ambience.phazon_mines");
		AMBIENCE_CHOZO_RUINS = registerSound("ambience.chozo_ruins");
		SILENCE1 = registerSound("ambience.silence1");
		SILENCE2 = registerSound("ambience.silence2");
		SILENCE3 = registerSound("ambience.silence3");
		SILENCE4 = registerSound("ambience.silence4");
		AMBIENCE_TALLON_OVERWORLD_MAIN_THEME = registerSound("ambience.tallon_overworld_main_theme");
		AMBIENCE_CHOZO_RUINS_MAIN_THEME = registerSound("ambience.chozo_ruins_main_theme");
		AMBIENCE_PHAZON_MINES_MAIN_THEME = registerSound("ambience.phazon_mines_main_theme");
		AMBIENCE_PHENDRANA_DRIFTS_MAIN_THEME = registerSound("ambience.phendrana_drifts_main_theme");
		AMBIENCE_SUNKEN_FRIGATE_MAIN_THEME = registerSound("ambience.sunken_frigate_main_theme");
		
		
	}
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
		
	}
}
