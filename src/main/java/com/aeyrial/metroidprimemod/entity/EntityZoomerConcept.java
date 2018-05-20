package com.aeyrial.metroidprimemod.entity;

import com.aeyrial.metroidprimemod.init.ModItems;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityZoomerConcept extends EntityCow
{
	public EntityZoomerConcept(World worldIn)
	{
		super(worldIn);
		this.setSize(0.8F, 0.4F); // Must correspond to the texture sizing
	}
	
	@Override
	protected void initEntityAI()
	{
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, ModItems.PHAZON_BLUE_ORE, false)); // Replace with alternative later
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAILookIdle(this));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);;
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.125D);;
	}
	@Override
	public float getEyeHeight()
	{
		return 0.2F;
	}
	
	@Override
	public EntityCow createChild(EntityAgeable ageable)
	{
		return new EntityZoomerConcept(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return super.getDeathSound();
	}
	
	
}
