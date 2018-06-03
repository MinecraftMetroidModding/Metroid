package com.aeyrial.metroidprimemod.entity.render;

import com.aeyrial.metroidprimemod.entity.EntityWarWasp;
import com.aeyrial.metroidprimemod.entity.EntityZoomer;
import com.aeyrial.metroidprimemod.entity.model.ModelWarWasp;
import com.aeyrial.metroidprimemod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWarWasp extends RenderLiving<EntityWarWasp>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/warwasp.png");
	
	public RenderWarWasp(RenderManager manager) {
		super(manager, new ModelWarWasp(), 0.2F);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWarWasp entity) {
		// TODO Auto-generated method stub
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityWarWasp entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}

