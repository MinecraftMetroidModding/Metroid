package com.aeyrial.metroidprimemod.init;

import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{
	private static void registerEntity()
	{
		EntityRegistry.registerModEntity(registryName, entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates, eggPrimary, eggSecondary);
	}
}
