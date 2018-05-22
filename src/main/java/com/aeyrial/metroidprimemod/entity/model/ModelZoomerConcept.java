package com.aeyrial.metroidprimemod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ZoomerConcept - Aeyrial
 * Created using Tabula 7.0.0
 */
public class ModelZoomerConcept extends ModelBase {
    public ModelRenderer RearMiddleRightLeg;
    public ModelRenderer FrontMiddleRightLeg;
    public ModelRenderer FrontMiddleLeftLeg;
    public ModelRenderer RearMiddleLeftLeg;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer RearRightLeg;
    public ModelRenderer RearLeftLeg;
    public ModelRenderer LeftMandible;
    public ModelRenderer RightMandible;
    public ModelRenderer LeftMiddleEye;
    public ModelRenderer RightMiddleEye;
    public ModelRenderer LeftEye;
    public ModelRenderer RightEye;
    public ModelRenderer Spike2;
    public ModelRenderer Spike2_1;
    public ModelRenderer Spike2_2;
    public ModelRenderer LeftMandibleHook;
    public ModelRenderer RightMandibleHook;
    public ModelRenderer Spine;
    public ModelRenderer Spinesub6;
    public ModelRenderer Spinesub7;
    public ModelRenderer Spinesub9;
    public ModelRenderer Spinesub10;
    public ModelRenderer Spinesub1;
    public ModelRenderer Spinesub5;
    public ModelRenderer Spinesub4;
    public ModelRenderer Spinesub3;
    public ModelRenderer Spinesub2;
    public ModelRenderer Spike1;
    public ModelRenderer Spike2_3;
    public ModelRenderer Spike3;
    public ModelRenderer Spike1_1;
    public ModelRenderer Spike2_4;
    public ModelRenderer Spike3_1;
    public ModelRenderer Spike4;
    public ModelRenderer Spike5;
    public ModelRenderer Spike6;

    public ModelZoomerConcept() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Spike4 = new ModelRenderer(this, 0, 0);
        this.Spike4.setRotationPoint(3.0F, 0.6F, 6.0F);
        this.Spike4.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike4, 0.0F, 0.0F, 2.356194490192345F);
        this.LeftEye = new ModelRenderer(this, 0, 0);
        this.LeftEye.setRotationPoint(0.8F, 20.0F, -5.5F);
        this.LeftEye.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Spinesub7 = new ModelRenderer(this, 0, 0);
        this.Spinesub7.setRotationPoint(-3.0F, 20.0F, 4.0F);
        this.Spinesub7.addBox(0.0F, 0.0F, 0.0F, 8, 1, 6, 0.0F);
        this.setRotateAngle(Spinesub7, 0.0F, 1.5707963267948966F, 0.0F);
        this.RightMandibleHook = new ModelRenderer(this, 0, 0);
        this.RightMandibleHook.setRotationPoint(0.5F, 0.0F, 3.1F);
        this.RightMandibleHook.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Spike3 = new ModelRenderer(this, 0, 0);
        this.Spike3.setRotationPoint(8.7F, 2.3F, 0.5F);
        this.Spike3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike3, 0.0F, 0.0F, 3.9269908169872414F);
        this.Spike2_3 = new ModelRenderer(this, 0, 0);
        this.Spike2_3.setRotationPoint(2.0F, 1.6F, 0.5F);
        this.Spike2_3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike2_3, 0.0F, 0.0F, 2.356194490192345F);
        this.Spike2 = new ModelRenderer(this, 0, 0);
        this.Spike2.setRotationPoint(0.5F, 20.0F, 2.0F);
        this.Spike2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike2, 0.0F, 0.0F, 3.141592653589793F);
        this.Spine = new ModelRenderer(this, 0, 0);
        this.Spine.setRotationPoint(-1.0F, 21.0F, 7.0F);
        this.Spine.addBox(0.0F, 0.0F, 0.0F, 14, 2, 2, 0.0F);
        this.setRotateAngle(Spine, 0.0F, 1.5707963267948966F, 0.0F);
        this.RightEye = new ModelRenderer(this, 0, 0);
        this.RightEye.setRotationPoint(-1.8F, 20.0F, -5.5F);
        this.RightEye.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 0, 0);
        this.FrontRightLeg.setRotationPoint(-1.5F, 21.0F, -5.5F);
        this.FrontRightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 0);
        this.FrontLeftLeg.setRotationPoint(0.5F, 21.0F, -5.5F);
        this.FrontLeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Spike6 = new ModelRenderer(this, 0, 0);
        this.Spike6.setRotationPoint(6.0F, 1.0F, 6.0F);
        this.Spike6.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike6, 0.0F, 0.0F, 3.9269908169872414F);
        this.LeftMandible = new ModelRenderer(this, 0, 0);
        this.LeftMandible.setRotationPoint(1.0F, 22.5F, -5.0F);
        this.LeftMandible.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(LeftMandible, 3.141592653589793F, 0.0F, 0.0F);
        this.RightMandible = new ModelRenderer(this, 0, 0);
        this.RightMandible.setRotationPoint(-2.0F, 22.5F, -5.0F);
        this.RightMandible.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(RightMandible, 3.141592653589793F, 0.0F, 0.0F);
        this.LeftMandibleHook = new ModelRenderer(this, 0, 0);
        this.LeftMandibleHook.setRotationPoint(-0.5F, 0.0F, 3.1F);
        this.LeftMandibleHook.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Spike5 = new ModelRenderer(this, 0, 0);
        this.Spike5.setRotationPoint(6.0F, 1.0F, 1.0F);
        this.Spike5.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike5, 0.0F, 0.0F, 3.9269908169872414F);
        this.LeftMiddleEye = new ModelRenderer(this, 0, 0);
        this.LeftMiddleEye.setRotationPoint(0.0F, 20.0F, -7.0F);
        this.LeftMiddleEye.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.FrontMiddleRightLeg = new ModelRenderer(this, 0, 0);
        this.FrontMiddleRightLeg.setRotationPoint(-3.5F, 21.0F, -3.0F);
        this.FrontMiddleRightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Spinesub3 = new ModelRenderer(this, 0, 0);
        this.Spinesub3.setRotationPoint(-3.0F, 21.0F, 5.0F);
        this.Spinesub3.addBox(0.0F, 0.0F, 0.0F, 10, 2, 6, 0.0F);
        this.setRotateAngle(Spinesub3, 0.0F, 1.5707963267948966F, 0.0F);
        this.RearMiddleRightLeg = new ModelRenderer(this, 0, 0);
        this.RearMiddleRightLeg.setRotationPoint(-3.5F, 21.0F, 2.0F);
        this.RearMiddleRightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Spike3_1 = new ModelRenderer(this, 0, 0);
        this.Spike3_1.setRotationPoint(3.0F, 0.6F, 1.0F);
        this.Spike3_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike3_1, 0.0F, 0.0F, 2.356194490192345F);
        this.Spinesub1 = new ModelRenderer(this, 0, 0);
        this.Spinesub1.setRotationPoint(-3.0F, 21.0F, -5.0F);
        this.Spinesub1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 10, 0.0F);
        this.Spinesub6 = new ModelRenderer(this, 0, 0);
        this.Spinesub6.setRotationPoint(-2.0F, 20.0F, 5.0F);
        this.Spinesub6.addBox(0.0F, 0.0F, 0.0F, 10, 1, 4, 0.0F);
        this.setRotateAngle(Spinesub6, 0.0F, 1.5707963267948966F, 0.0F);
        this.RearLeftLeg = new ModelRenderer(this, 0, 0);
        this.RearLeftLeg.setRotationPoint(0.5F, 21.0F, 4.5F);
        this.RearLeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Spike1 = new ModelRenderer(this, 0, 0);
        this.Spike1.setRotationPoint(5.5F, 1.0F, 0.5F);
        this.Spike1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(Spike1, 0.0F, 0.0F, 3.141592653589793F);
        this.Spinesub2 = new ModelRenderer(this, 0, 0);
        this.Spinesub2.setRotationPoint(-2.0F, 21.0F, 6.0F);
        this.Spinesub2.addBox(0.0F, 0.0F, 0.0F, 12, 2, 4, 0.0F);
        this.setRotateAngle(Spinesub2, 0.0F, 1.5707963267948966F, 0.0F);
        this.RearMiddleLeftLeg = new ModelRenderer(this, 0, 0);
        this.RearMiddleLeftLeg.setRotationPoint(2.5F, 21.0F, 2.0F);
        this.RearMiddleLeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Spike1_1 = new ModelRenderer(this, 0, 0);
        this.Spike1_1.setRotationPoint(6.0F, 1.0F, 3.5F);
        this.Spike1_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike1_1, 0.0F, 0.0F, 3.9269908169872414F);
        this.Spike2_2 = new ModelRenderer(this, 0, 0);
        this.Spike2_2.setRotationPoint(-0.5F, 22.7F, 6.0F);
        this.Spike2_2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Spike2_2, 2.356194490192345F, 0.0F, 0.0F);
        this.Spike2_4 = new ModelRenderer(this, 0, 0);
        this.Spike2_4.setRotationPoint(3.0F, 0.6F, 3.5F);
        this.Spike2_4.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike2_4, 0.0F, 0.0F, 2.356194490192345F);
        this.Spinesub10 = new ModelRenderer(this, 0, 0);
        this.Spinesub10.setRotationPoint(-2.0F, 19.0F, 4.0F);
        this.Spinesub10.addBox(0.0F, 0.0F, 0.0F, 8, 1, 4, 0.0F);
        this.setRotateAngle(Spinesub10, 0.0F, 1.5707963267948966F, 0.0F);
        this.RearRightLeg = new ModelRenderer(this, 0, 0);
        this.RearRightLeg.setRotationPoint(-1.5F, 21.0F, 4.5F);
        this.RearRightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.RightMiddleEye = new ModelRenderer(this, 0, 0);
        this.RightMiddleEye.setRotationPoint(-1.0F, 20.0F, -7.0F);
        this.RightMiddleEye.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.FrontMiddleLeftLeg = new ModelRenderer(this, 0, 0);
        this.FrontMiddleLeftLeg.setRotationPoint(2.5F, 21.0F, -3.0F);
        this.FrontMiddleLeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Spike2_1 = new ModelRenderer(this, 0, 0);
        this.Spike2_1.setRotationPoint(0.5F, 20.0F, -3.0F);
        this.Spike2_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Spike2_1, 0.0F, 0.0F, 3.141592653589793F);
        this.Spinesub5 = new ModelRenderer(this, 0, 0);
        this.Spinesub5.setRotationPoint(-1.0F, 20.0F, 6.0F);
        this.Spinesub5.addBox(0.0F, 0.0F, 0.0F, 12, 1, 2, 0.0F);
        this.setRotateAngle(Spinesub5, 0.0F, 1.5707963267948966F, 0.0F);
        this.Spinesub9 = new ModelRenderer(this, 0, 0);
        this.Spinesub9.setRotationPoint(-1.0F, 19.0F, 5.0F);
        this.Spinesub9.addBox(0.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F);
        this.setRotateAngle(Spinesub9, 0.0F, 1.5707963267948966F, 0.0F);
        this.Spinesub4 = new ModelRenderer(this, 0, 0);
        this.Spinesub4.setRotationPoint(-4.0F, 21.0F, -4.0F);
        this.Spinesub4.addBox(0.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F);
        this.Spinesub4.addChild(this.Spike4);
        this.RightMandible.addChild(this.RightMandibleHook);
        this.Spinesub9.addChild(this.Spike3);
        this.Spinesub9.addChild(this.Spike2_3);
        this.Spinesub4.addChild(this.Spike6);
        this.LeftMandible.addChild(this.LeftMandibleHook);
        this.Spinesub4.addChild(this.Spike5);
        this.Spinesub4.addChild(this.Spike3_1);
        this.Spinesub9.addChild(this.Spike1);
        this.Spinesub4.addChild(this.Spike1_1);
        this.Spinesub4.addChild(this.Spike2_4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.LeftEye.render(f5);
        this.Spinesub7.render(f5);
        this.Spike2.render(f5);
        this.Spine.render(f5);
        this.RightEye.render(f5);
        this.FrontRightLeg.render(f5);
        this.FrontLeftLeg.render(f5);
        this.LeftMandible.render(f5);
        this.RightMandible.render(f5);
        this.LeftMiddleEye.render(f5);
        this.FrontMiddleRightLeg.render(f5);
        this.Spinesub3.render(f5);
        this.RearMiddleRightLeg.render(f5);
        this.Spinesub1.render(f5);
        this.Spinesub6.render(f5);
        this.RearLeftLeg.render(f5);
        this.Spinesub2.render(f5);
        this.RearMiddleLeftLeg.render(f5);
        this.Spike2_2.render(f5);
        this.Spinesub10.render(f5);
        this.RearRightLeg.render(f5);
        this.RightMiddleEye.render(f5);
        this.FrontMiddleLeftLeg.render(f5);
        this.Spike2_1.render(f5);
        this.Spinesub5.render(f5);
        this.Spinesub9.render(f5);
        this.Spinesub4.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	this.FrontLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RearLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.FrontMiddleLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RearMiddleLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	this.FrontRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.RearRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.FrontMiddleLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.RearMiddleLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.LeftMandible.rotateAngleY = netHeadYaw * 0.017453292F * 0.6662F;
    	this.RightMandible.rotateAngleY = netHeadYaw * 0.017453292F * 0.6662F;
    }
}
