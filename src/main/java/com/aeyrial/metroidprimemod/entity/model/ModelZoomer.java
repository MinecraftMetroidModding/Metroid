package com.aeyrial.metroidprimemod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelZoomer extends ModelBase {
    public ModelRenderer field_78148_b0;
    public ModelRenderer field_78148_b1;
    public ModelRenderer field_78146_d;
    public ModelRenderer field_78144_f;
    public ModelRenderer field_78149_c;
    public ModelRenderer field_78147_e;
    public ModelRenderer VillagerHead;
    public ModelRenderer VillagerRightArm;
    public ModelRenderer VillagerLeftArm;
    public ModelRenderer VillagerHands;
    public ModelRenderer VillagerCoat;
    public ModelRenderer VillagerChest;
    public ModelRenderer VillagerNose;

    public ModelZoomer() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78144_f = new ModelRenderer(this, 0, 16);
        this.field_78144_f.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.field_78144_f.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerHead = new ModelRenderer(this, 0, 0);
        this.VillagerHead.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.VillagerHead.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.VillagerCoat = new ModelRenderer(this, 0, 38);
        this.VillagerCoat.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.VillagerCoat.addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F);
        this.VillagerLeftArm = new ModelRenderer(this, 44, 22);
        this.VillagerLeftArm.setRotationPoint(0.0F, -12.0F, -1.0F);
        this.VillagerLeftArm.addBox(4.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(VillagerLeftArm, -0.7499679795819634F, 0.0F, 0.0F);
        this.field_78148_b0 = new ModelRenderer(this, 18, 4);
        this.field_78148_b0.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b0.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(field_78148_b0, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78147_e = new ModelRenderer(this, 0, 16);
        this.field_78147_e.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.field_78147_e.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerRightArm = new ModelRenderer(this, 44, 22);
        this.VillagerRightArm.setRotationPoint(0.0F, -12.0F, -1.0F);
        this.VillagerRightArm.addBox(-8.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(VillagerRightArm, -0.7499679795819634F, 0.0F, 0.0F);
        this.VillagerNose = new ModelRenderer(this, 24, 0);
        this.VillagerNose.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.VillagerNose.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.field_78148_b1 = new ModelRenderer(this, 52, 0);
        this.field_78148_b1.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b1.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(field_78148_b1, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78146_d = new ModelRenderer(this, 0, 16);
        this.field_78146_d.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.field_78146_d.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerChest = new ModelRenderer(this, 16, 20);
        this.VillagerChest.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.VillagerChest.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.field_78149_c = new ModelRenderer(this, 0, 16);
        this.field_78149_c.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.field_78149_c.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerHands = new ModelRenderer(this, 40, 38);
        this.VillagerHands.setRotationPoint(0.0F, -12.0F, -1.0F);
        this.VillagerHands.addBox(-4.0F, 2.0F, -2.0F, 8, 4, 4, 0.0F);
        this.setRotateAngle(VillagerHands, -0.7499679795819634F, 0.0F, 0.0F);
        this.VillagerHead.addChild(this.VillagerNose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78144_f.render(f5);
        this.VillagerHead.render(f5);
        this.VillagerCoat.render(f5);
        this.VillagerLeftArm.render(f5);
        this.field_78148_b0.render(f5);
        this.field_78147_e.render(f5);
        this.VillagerRightArm.render(f5);
        this.field_78148_b1.render(f5);
        this.field_78146_d.render(f5);
        this.VillagerChest.render(f5);
        this.field_78149_c.render(f5);
        this.VillagerHands.render(f5);
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
