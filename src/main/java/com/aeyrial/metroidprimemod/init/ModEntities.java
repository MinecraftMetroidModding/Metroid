package com.aeyrial.metroidprimemod.init;

import com.aeyrial.metroidprimemod.Main;
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
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
