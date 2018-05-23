package com.aeyrial.metroidprimemod.entity.ai;

import java.util.Random;

import javax.annotation.Nullable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class EntityAICircleWander extends EntityAIBase
{
    protected final EntityCreature entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance;
    protected boolean mustUpdate;
    protected Vec3d vec3d_2 = null;
    protected int wanderDir = 0;

    public EntityAICircleWander(EntityCreature creatureIn, double speedIn)
    {
        this(creatureIn, speedIn, 120);
    }

    public EntityAICircleWander(EntityCreature creatureIn, double speedIn, int chance)
    {
        this.entity = creatureIn;
        this.speed = speedIn;
        this.executionChance = chance;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.mustUpdate)
        {
        	// This code allows for appropriate pauses in motion.
        	// Zoomers don't stop moving so we can comment this out.
        	
            /*if (this.entity.getIdleTime() >= 100)
            {
                return false;
            }*/

            /*if (this.entity.getRNG().nextInt(this.executionChance) != 0)
            {
                return false;
            }*/
        }

        Vec3d vec3d = this.getPosition();

        if (vec3d == null)
        {
            return false;
        }
        else
        {
            this.x = vec3d.x;
            this.y = vec3d.y;
            this.z = vec3d.z;
            vec3d_2 = vec3d;
            
            this.mustUpdate = false;
            return true;
        }
    }

    @Nullable
    protected Vec3d getPosition()
    {
    	wanderDir++;
    	if(wanderDir>=4){wanderDir = 0;}
    	
    	Random rand = new Random(); 
    	int value = rand.nextInt(8); 
        	
    	if (vec3d_2  == null)
    	{
    		return RandomPositionGenerator.findRandomTarget(this.entity, 2, 2);
    	  	
    	}
    	else if(wanderDir == 0)
    	{
    		return vec3d_2.addVector(value,0,0);
    	}
    	else if(wanderDir == 1)
    	{
    		return vec3d_2.addVector(0,0,value);
    	}
    	else if(wanderDir == 2)
    	{
    		return vec3d_2.addVector(-value,0,0);
    	}
    	else if(wanderDir == 3)
    	{
    		return vec3d_2.addVector(0,0,-value);
    	}
    	else
    	{
    		return RandomPositionGenerator.findRandomTarget(this.entity, 2, 2);
    	}
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting()
    {
        return !this.entity.getNavigator().noPath();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.entity.getLookHelper //.setLookPosition(this.x, this.y, this.z, this.speed);
    	this.entity.getNavigator().tryMoveToXYZ(this.x, this.y, this.z, this.speed);
    }

    /**
     * Makes task to bypass chance
     */
    public void makeUpdate()
    {
        this.mustUpdate = true;
    }

    /**
     * Changes task random possibility for execution
     */
    public void setExecutionChance(int newchance)
    {
        this.executionChance = newchance;
    }
}