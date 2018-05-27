package com.aeyrial.metroidprimemod.util.handlers;

import com.aeyrial.metroidprimemod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
	public static SoundEvent ENTITY_ZOOMER_AMBIENT, ENTITY_ZOOMER_HURT, ENTITY_ZOOMER_DEATH, ENTITY_ZOOMER_ATTACK;
	
	public static void registerSounds()
	{
		ENTITY_ZOOMER_AMBIENT = registerSound("entity.zoomer.ambient");
		ENTITY_ZOOMER_HURT = registerSound("entity.zoomer.hurt");
		ENTITY_ZOOMER_DEATH = registerSound("entity.zoomer.death");
		ENTITY_ZOOMER_ATTACK = registerSound("entity.zoomer.attack");
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
