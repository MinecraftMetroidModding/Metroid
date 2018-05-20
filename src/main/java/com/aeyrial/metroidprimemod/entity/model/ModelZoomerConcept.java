package com.aeyrial.metroidprimemod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

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

    public ModelZoomerConcept() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.RearRightLeg = new ModelRenderer(this, 0, 0);
        this.RearRightLeg.setRotationPoint(-2.0F, 23.0F, 5.0F);
        this.RearRightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.RearMiddleRightLeg = new ModelRenderer(this, 0, 0);
        this.RearMiddleRightLeg.setRotationPoint(-4.0F, 23.0F, 2.0F);
        this.RearMiddleRightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Spine = new ModelRenderer(this, 0, 0);
        this.Spine.setRotationPoint(-1.0F, 21.0F, 7.0F);
        this.Spine.addBox(0.0F, 0.0F, 0.0F, 14, 2, 2, 0.0F);
        this.setRotateAngle(Spine, 0.0F, 1.5707963267948966F, 0.0F);
        this.Spinesub7 = new ModelRenderer(this, 0, 0);
        this.Spinesub7.setRotationPoint(-3.0F, 20.0F, 4.0F);
        this.Spinesub7.addBox(0.0F, 0.0F, 0.0F, 8, 1, 6, 0.0F);
        this.setRotateAngle(Spinesub7, 0.0F, 1.5707963267948966F, 0.0F);
        this.Spinesub4 = new ModelRenderer(this, 0, 0);
        this.Spinesub4.setRotationPoint(-4.0F, 21.0F, -4.0F);
        this.Spinesub4.addBox(0.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F);
        this.FrontMiddleRightLeg = new ModelRenderer(this, 0, 0);
        this.FrontMiddleRightLeg.setRotationPoint(-4.0F, 23.0F, -3.0F);
        this.FrontMiddleRightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Spinesub3 = new ModelRenderer(this, 0, 0);
        this.Spinesub3.setRotationPoint(-3.0F, 21.0F, 5.0F);
        this.Spinesub3.addBox(0.0F, 0.0F, 0.0F, 10, 2, 6, 0.0F);
        this.setRotateAngle(Spinesub3, 0.0F, 1.5707963267948966F, 0.0F);
        this.RearMiddleLeftLeg = new ModelRenderer(this, 0, 0);
        this.RearMiddleLeftLeg.setRotationPoint(3.0F, 23.0F, 2.0F);
        this.RearMiddleLeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Spinesub1 = new ModelRenderer(this, 0, 0);
        this.Spinesub1.setRotationPoint(-3.0F, 21.0F, -5.0F);
        this.Spinesub1.addBox(0.0F, 0.0F, 0.0F, 6, 2, 10, 0.0F);
        this.RearLeftLeg = new ModelRenderer(this, 0, 0);
        this.RearLeftLeg.setRotationPoint(1.0F, 23.0F, 5.0F);
        this.RearLeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 0);
        this.FrontLeftLeg.setRotationPoint(1.0F, 23.0F, -6.0F);
        this.FrontLeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Spinesub6 = new ModelRenderer(this, 0, 0);
        this.Spinesub6.setRotationPoint(-2.0F, 20.0F, 5.0F);
        this.Spinesub6.addBox(0.0F, 0.0F, 0.0F, 10, 1, 4, 0.0F);
        this.setRotateAngle(Spinesub6, 0.0F, 1.5707963267948966F, 0.0F);
        this.Spinesub10 = new ModelRenderer(this, 0, 0);
        this.Spinesub10.setRotationPoint(-2.0F, 19.0F, 4.0F);
        this.Spinesub10.addBox(0.0F, 0.0F, 0.0F, 8, 1, 4, 0.0F);
        this.setRotateAngle(Spinesub10, 0.0F, 1.5707963267948966F, 0.0F);
        this.Spinesub2 = new ModelRenderer(this, 0, 0);
        this.Spinesub2.setRotationPoint(-2.0F, 21.0F, 6.0F);
        this.Spinesub2.addBox(0.0F, 0.0F, 0.0F, 12, 2, 4, 0.0F);
        this.setRotateAngle(Spinesub2, 0.0F, 1.5707963267948966F, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 0, 0);
        this.FrontRightLeg.setRotationPoint(-2.0F, 23.0F, -6.0F);
        this.FrontRightLeg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.FrontMiddleLeftLeg = new ModelRenderer(this, 0, 0);
        this.FrontMiddleLeftLeg.setRotationPoint(3.0F, 23.0F, -3.0F);
        this.FrontMiddleLeftLeg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Spinesub5 = new ModelRenderer(this, 0, 0);
        this.Spinesub5.setRotationPoint(-1.0F, 20.0F, 6.0F);
        this.Spinesub5.addBox(0.0F, 0.0F, 0.0F, 12, 1, 2, 0.0F);
        this.setRotateAngle(Spinesub5, 0.0F, 1.5707963267948966F, 0.0F);
        this.Spinesub9 = new ModelRenderer(this, 0, 0);
        this.Spinesub9.setRotationPoint(-1.0F, 19.0F, 5.0F);
        this.Spinesub9.addBox(0.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F);
        this.setRotateAngle(Spinesub9, 0.0F, 1.5707963267948966F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.RearRightLeg.render(f5);
        this.RearMiddleRightLeg.render(f5);
        this.Spine.render(f5);
        this.Spinesub7.render(f5);
        this.Spinesub4.render(f5);
        this.FrontMiddleRightLeg.render(f5);
        this.Spinesub3.render(f5);
        this.RearMiddleLeftLeg.render(f5);
        this.Spinesub1.render(f5);
        this.RearLeftLeg.render(f5);
        this.FrontLeftLeg.render(f5);
        this.Spinesub6.render(f5);
        this.Spinesub10.render(f5);
        this.Spinesub2.render(f5);
        this.FrontRightLeg.render(f5);
        this.FrontMiddleLeftLeg.render(f5);
        this.Spinesub5.render(f5);
        this.Spinesub9.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
