package com.aeyrial.metroidprimemod.init;

import com.aeyrial.metroidprimemod.Main;
import com.aeyrial.metroidprimemod.entity.EntitySeedling;
import com.aeyrial.metroidprimemod.entity.EntityWarWasp;
import com.aeyrial.metroidprimemod.entity.EntityZoomer;
import com.aeyrial.metroidprimemod.entity.EntityZoomerConcept;
import com.aeyrial.metroidprimemod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{
	public static void registerEntities()
	{
		registerEntity("zoomer", EntityZoomer.class, Reference.ENTITY_ZOOMER, 50, 11437146, 000000);
		registerEntity("zoomer_concept", EntityZoomerConcept.class, Reference.ENTITY_ZOOMER_CONCEPT, 50, 11437146, 000000);
		registerEntity("war_wasp", EntityWarWasp.class, Reference.ENTITY_WAR_WASP, 50, 25500, 22011851);
		registerEntity("seedling", EntitySeedling.class, Reference.SEEDLING, 50, 25500, 22011851);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
