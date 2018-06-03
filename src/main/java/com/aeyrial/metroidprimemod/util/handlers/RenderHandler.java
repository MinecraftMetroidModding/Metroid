package com.aeyrial.metroidprimemod.util.handlers;

import com.aeyrial.metroidprimemod.entity.EntityWarWasp;
import com.aeyrial.metroidprimemod.entity.EntityZoomer;
import com.aeyrial.metroidprimemod.entity.EntityZoomerConcept;
import com.aeyrial.metroidprimemod.entity.render.RenderWarWasp;
import com.aeyrial.metroidprimemod.entity.render.RenderZoomer;
import com.aeyrial.metroidprimemod.entity.render.RenderZoomerConcept;

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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityZoomerConcept.class, new IRenderFactory<EntityZoomerConcept>()
		{
			@Override
			public Render<? super EntityZoomerConcept> createRenderFor(RenderManager manager)
			{
				return new RenderZoomerConcept(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWarWasp.class, new IRenderFactory<EntityWarWasp>()
		{
			@Override
			public Render<? super EntityWarWasp> createRenderFor(RenderManager manager)
			{
				return new RenderWarWasp(manager);
			}
		});
	}
	
	
}
