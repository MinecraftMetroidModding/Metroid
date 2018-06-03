package com.aeyrial.metroidprimemod.entity.ai;

import javax.annotation.Nullable;

import com.aeyrial.metroidprimemod.util.handlers.SoundsHandler;
import com.aeyrial.metroidprimemod.entity.EntityZoomerConcept;
import com.google.common.base.Function;
import com.google.common.base.Predicates;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.minecraft.pathfinding.Path;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityAISpikeyTouch extends EntityAIBase
{
	
	 World world;
	    protected EntityCreature attacker;
	    /** An amount of decrementing ticks that allows the entity to attack once the tick reaches 0. */
	    protected int attackTick;
	    /** The speed with which the mob will approach the target */
	    double speedTowardsTarget;
	    /** When true, the mob will continue chasing its target, even if it can't find a path to them right now. */
	    boolean longMemory;
	    /** The PathEntity of our entity. */
	    Path path;
	    private int delayCounter;
	    private double targetX;
	    private double targetY;
	    private double targetZ;
	    protected final int attackInterval = 20;
	    private int failedPathFindingPenalty = 0;
	    private boolean canPenalize = false;
	    private SoundEvent ATTACK_EVENT;
	    
	    public EntityAISpikeyTouch(EntityCreature creature, double speedIn, boolean useLongMemory, SoundEvent ENTITY_ZOOMER_ATTACK)
	    {
	        this.attacker = creature;
	        this.world = creature.world;
	        this.longMemory = useLongMemory;
	        this.speedTowardsTarget = speedIn;
	        this.setMutexBits(8); // Allows this to run parallel to movement
	        this.ATTACK_EVENT = ENTITY_ZOOMER_ATTACK;
	    }
	    
	    /**
	     * Returns whether the EntityAIBase should begin execution.
	     */
	    public boolean shouldExecute()
	    {
   		    	
	        EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();

	        if (entitylivingbase == null)
	        {
	            return false;
	        }
	        else if (!entitylivingbase.isEntityAlive())
	        {
	            return false;
	        }
	        else
	        {
	            /*if (canPenalize)
	            {
	                if (--this.delayCounter <= 0)
	                {
	                    this.path = this.attacker.getNavigator().getPathToEntityLiving(entitylivingbase);
	                    this.delayCounter = 4 + this.attacker.getRNG().nextInt(7);
	                    return this.path != null;
	                }
	                else
	                {
	                    return true;
	                }
	            }*/
	            this.path = this.attacker.getNavigator().getPathToEntityLiving(entitylivingbase);

	            if (this.path != null)
	            {
	            	return true;
	            }
	            else
	            {
	                return this.getAttackReachSqr(entitylivingbase) >= this.attacker.getDistanceSq(entitylivingbase.posX, entitylivingbase.getEntityBoundingBox().minY, entitylivingbase.posZ);
	            }
	        }
	    }

	    /**
	     * Returns whether an in-progress EntityAIBase should continue executing
	     */
	    public boolean shouldContinueExecuting()
	    {
	        EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();

	        if (entitylivingbase != null)
	        {
	        	return false;
	        }
	        else if(entitylivingbase == null && true)
	        {
	        	return false;
	        }
	        else
	        {
	        	return true;
	        }


	        // Force exit early to stop zoomer concept getting 'stuck'
	        /*else if(this.path == null)
	        {
	        	return false;
	        }
	        
	        else if (!entitylivingbase.isEntityAlive())
	        {
	            return false;
	        }
	        else if (!this.longMemory)
	        {
	            return !this.attacker.getNavigator().noPath();
	        }
	        else if (!this.attacker.isWithinHomeDistanceFromPosition(new BlockPos(entitylivingbase)))
	        {
	            return false;
	        }
	        else
	        {
	            return !(entitylivingbase instanceof EntityPlayer) || !((EntityPlayer)entitylivingbase).isSpectator() && !((EntityPlayer)entitylivingbase).isCreative();
	        }*/
	    }

	    /**
	     * Execute a one shot task or start executing a continuous task
	     */
	    public void startExecuting()
	    {
	        //this.attacker.getNavigator().setPath(this.path, this.speedTowardsTarget);
	        this.delayCounter = 0;
	    }

	    /**
	     * Reset the task's internal state. Called when this task is interrupted by another one
	     */
	    public void resetTask()
	    {
	        EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();
	        
	        //;
	        
	        //if (entitylivingbase != null)
	        
	        if (entitylivingbase instanceof EntityPlayer && (((EntityPlayer)entitylivingbase).isSpectator() || ((EntityPlayer)entitylivingbase).isCreative()) || entitylivingbase instanceof EntityMob || entitylivingbase instanceof EntityAnimal)
	        {
	            this.attacker.setAttackTarget((EntityLivingBase)null);
	        }

	        //this.attacker.getNavigator().clearPath();
	    }

	    /**
	     * Keep ticking a continuous task that has already been started
	     */
	    public void updateTask()
	    {
	    	
	        EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();
	        //Zoomers don't change their look dir, that's not how they behave
	        //this.attacker.getLookHelper().setLookPositionWithEntity(entitylivingbase, 30.0F, 30.0F);
	        //this.path = null;
	        
	        double d0;
	        // Generated an error
	        //double d0 = this.attacker.getDistanceSq(entitylivingbase.posX, entitylivingbase.getEntityBoundingBox().minY, entitylivingbase.posZ);
	        if(entitylivingbase != null)
	        {
		        double dX = this.attacker.posX - entitylivingbase.posX;
		        double dY = this.attacker.posY - entitylivingbase.getEntityBoundingBox().minY;
		        double dZ = this.attacker.posZ - entitylivingbase.posZ;
		        d0 = dX * dX + dY * dY + dZ * dZ;
	        }
	        else 
	        {
	        	d0 = -1.0;
	        }

	        //return d0 * d0 + d1 * d1 + d2 * d2;
	        
	        --this.delayCounter;

	        /*if ((this.longMemory || this.attacker.getEntitySenses().canSee(entitylivingbase)) && this.delayCounter <= 0 && (this.targetX == 0.0D && this.targetY == 0.0D && this.targetZ == 0.0D || entitylivingbase.getDistanceSq(this.targetX, this.targetY, this.targetZ) >= 1.0D || this.attacker.getRNG().nextFloat() < 0.05F))
	        {
	            this.targetX = entitylivingbase.posX;
	            this.targetY = entitylivingbase.getEntityBoundingBox().minY;
	            this.targetZ = entitylivingbase.posZ;
	            this.delayCounter = 4 + this.attacker.getRNG().nextInt(7);

	            if (this.canPenalize)
	            {
	                this.delayCounter += failedPathFindingPenalty;
	                if (this.attacker.getNavigator().getPath() != null)
	                {
	                    net.minecraft.pathfinding.PathPoint finalPathPoint = this.attacker.getNavigator().getPath().getFinalPathPoint();
	                    if (finalPathPoint != null && entitylivingbase.getDistanceSq(finalPathPoint.x, finalPathPoint.y, finalPathPoint.z) < 1)
	                        failedPathFindingPenalty = 0;
	                    else
	                        failedPathFindingPenalty += 10;
	                }
	                else
	                {
	                    failedPathFindingPenalty += 10;
	                }
	            }

	            if (d0 > 1024.0D)
	            {
	                //this.delayCounter += 10;
	            }
	            else if (d0 > 256.0D)
	            {
	                //this.delayCounter += 5;
	            }

	            if (!this.attacker.getNavigator().tryMoveToEntityLiving(entitylivingbase, this.speedTowardsTarget))
	            {
	                //this.delayCounter += 15;
	            }
	        }*/

	        this.attackTick = Math.max(this.attackTick - 1, 0);
	        this.checkAndPerformAttack(entitylivingbase, d0);
	        entitylivingbase = null;
	    }

	    /*protected void checkAndPerformAttack(EntityLivingBase p_190102_1_, double p_190102_2_)
	    {
	        double d0 = this.getAttackReachSqr(p_190102_1_);

	        if (p_190102_2_ <= d0 && this.attackTick <= 0)
	        {
	            this.attackTick = 20;
	            this.attacker.swingArm(EnumHand.MAIN_HAND);
	            this.attacker.attackEntityAsMob(p_190102_1_); // ACTUAL ATTACK
	            //this.attacker.setAttackTarget((EntityLivingBase)null);
	        }
	    }*/
	    

	    
	    protected void checkAndPerformAttack(EntityLivingBase p_190102_1_, double p_190102_2_)
	    {
	        //SoundEvent SOME_EVENT = ENTITY_ZOOMER_ATTACK;
	        
	    	double d0 = this.getAttackReachSqr(p_190102_1_);

	        if (this.attackTick <= 0 && d0 != -1.0 && p_190102_2_ <= d0)
	        {
	            this.attackTick = 1;
	            this.attacker.swingArm(EnumHand.MAIN_HAND);
	            this.attacker.attackEntityAsMob(p_190102_1_);
	            
	            this.attacker.playSound(ATTACK_EVENT, 0.15F, 1.0F);
	        }
	        //ENTITY_ZOOMER_ATTACK = registerSound("entity.zoomer.attack");
	    }

		protected double getAttackReachSqr(EntityLivingBase attackTarget)
	    {
	    	if(attackTarget != null)
	    	{
	    		return (double)(0.8F * 1.0F * 0.8F * 1.0F + attackTarget.width);
	    	}
	    	else
	    	{
	    		return (double)(-1.0);
	    	}
	        
	    }
	    
		/*private SoundEvent getAttackSound()
		{
			return SoundsHandler.ENTITY_ZOOMER_ATTACK;
		}*/
}
