package com.aeyrial.metroidprimemod.entity.render;

import com.aeyrial.metroidprimemod.entity.EntityZoomerConcept;
import com.aeyrial.metroidprimemod.entity.model.ModelZoomerConcept;
import com.aeyrial.metroidprimemod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZoomerConcept extends RenderLiving<EntityZoomerConcept>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/zoomer_concept.png");
	
	public RenderZoomerConcept(RenderManager manager)
	{
		super(manager, new ModelZoomerConcept(), 0.1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZoomerConcept entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityZoomerConcept entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
