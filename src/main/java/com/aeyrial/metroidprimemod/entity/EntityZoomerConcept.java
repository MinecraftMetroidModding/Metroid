package com.aeyrial.metroidprimemod.entity;

import javax.annotation.Nullable;

import com.aeyrial.metroidprimemod.entity.ai.EntityAICircleWander;
import com.aeyrial.metroidprimemod.entity.ai.EntityAINearestAttackableTargetVariant;
import com.aeyrial.metroidprimemod.entity.ai.EntityAISpikeyTouch;
import com.aeyrial.metroidprimemod.init.ModItems;
import com.aeyrial.metroidprimemod.util.handlers.LootTableHandler;
import com.aeyrial.metroidprimemod.util.handlers.SoundsHandler;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.monster.AbstractIllager;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityZoomerConcept extends EntityMob
{
	//EnumCreatureAttribute
	
	//protected static final DataParameter<Byte> AGGRESSIVE = EntityDataManager.<Byte>createKey(ZoomerConcept.class, DataSerializers.BYTE);
	
    private static final Predicate<Entity> NOT_UNDEAD = new Predicate<Entity>()
    {
        public boolean apply(@Nullable Entity p_apply_1_)
        {
            return p_apply_1_ instanceof EntityLivingBase && ((EntityLivingBase)p_apply_1_).getCreatureAttribute() != EnumCreatureAttribute.UNDEAD && ((EntityLivingBase)p_apply_1_).attackable();
        }
    };
	
	public EntityZoomerConcept(World worldIn)
	{
		super(worldIn);
		this.setSize(0.8F, 0.4F); // Must correspond to the texture sizing
        this.setPathPriority(PathNodeType.WATER, -1.0F);
        this.setPathPriority(PathNodeType.LAVA, -1.0F);
        this.setPathPriority(PathNodeType.DANGER_FIRE, -1.0F);
        this.setPathPriority(PathNodeType.DAMAGE_FIRE, -1.0F);
	}
	
	public EnumCreatureAttribute getCreatureAttribute()
	{
	    return EnumCreatureAttribute.UNDEAD;
	}
	
	
	@Override
	protected void initEntityAI()
	{
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAISpikeyTouch(this, 0.0D, false,this.getAttackSound()));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, ModItems.PHAZON_BLUE_ORE, false)); // Replace with alternative later
        this.tasks.addTask(4, new EntityAICircleWander(this, 1.0D));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        
        //this.targetTasks.addTask(2, new EntityAINearestAttackableTargetVariant(this, EntityLiving.class, 0, false, true, NOT_UNDEAD));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTargetVariant(this, EntityPlayer.class, 0, false, true, NOT_UNDEAD));
        //this.targetTasks.addTask(2, new EntityAINearestAttackableTargetVariant(this, EntityLivingBase.class, 0, false, true, NOT_UNDEAD));
        // Make an alternate AI task to regularly update the nearest enemy
        //this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, NOT_UNDEAD));
        
        
    }
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		//EntityZoomerConcept.getCreatureAttribute();
		/*getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);*/
		getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_SPEED);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(60.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);;
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.200D);;

	}
	@Override
	public float getEyeHeight()
	{
		return 0.2F;
	}
	
	//@Override
	/*public EntityZoomerConcept createChild(EntityAgeable ageable)
	{
		return new EntityZoomerConcept(world);
	}*/
	
	@Override
	protected ResourceLocation getLootTable()
	{
		return LootTableHandler.ZOOMER_CONCEPT;
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return SoundsHandler.ENTITY_ZOOMER_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		return SoundsHandler.ENTITY_ZOOMER_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundsHandler.ENTITY_ZOOMER_DEATH;
	}
	
    protected SoundEvent getAttackSound()
    {
        return SoundsHandler.ENTITY_ZOOMER_ATTACK;
    }

    protected void playAttackSound(BlockPos pos, Block blockIn)
    {
        this.playSound(this.getAttackSound(), 0.15F, 1.0F);
    }
	
	/*protected SoundEvent getAttackSound()
	{
		return SoundsHandler.ENTITY_ZOOMER_ATTACK;
	}*/
	
	
}
