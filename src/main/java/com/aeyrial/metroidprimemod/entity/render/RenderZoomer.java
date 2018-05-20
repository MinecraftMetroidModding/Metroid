package com.aeyrial.metroidprimemod.entity.render;

import com.aeyrial.metroidprimemod.entity.EntityZoomer;
import com.aeyrial.metroidprimemod.entity.model.ModelZoomer;
import com.aeyrial.metroidprimemod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZoomer extends RenderLiving<EntityZoomer>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/zoomer.png");
	
	public RenderZoomer(RenderManager manager)
	{
		super(manager, new ModelZoomer(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZoomer entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityZoomer entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
