package com.aeyrial.metroidprimemod.util.handlers;

import com.aeyrial.metroidprimemod.entity.EntityZoomer;
import com.aeyrial.metroidprimemod.entity.render.RenderZoomer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityZoomer.class, new IRenderFactory<EntityZoomer>()
		{
			@Override
			public Render<? super EntityZoomer> createRenderFor(RenderManager manager)
			{
				return new RenderZoomer(manager);
			}
		});
	}
}
