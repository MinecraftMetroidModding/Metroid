package com.aeyrial.metroidprimemod.entity.render;

import com.aeyrial.metroidprimemod.entity.EntitySeedling;
import com.aeyrial.metroidprimemod.entity.EntityZoomer;
import com.aeyrial.metroidprimemod.entity.model.ModelSeeder;
import com.aeyrial.metroidprimemod.entity.model.ModelWarWasp;
import com.aeyrial.metroidprimemod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSeedling extends RenderLiving<EntitySeedling>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/seedling.png");
	
	public RenderSeedling(RenderManager manager) {
		super(manager, new ModelSeeder(), 0.2F);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySeedling entity) {
		// TODO Auto-generated method stub
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntitySeedling entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}

