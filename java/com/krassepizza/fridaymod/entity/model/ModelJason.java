// Date: 22.04.2020 14:16:49
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.krassepizza.fridaymod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelJason extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer mask1;
    ModelRenderer mask2;
    ModelRenderer mask3;
    ModelRenderer mask4;
    ModelRenderer machete1;
    ModelRenderer machete2;
    ModelRenderer machete3;
  
  public ModelJason()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      head = new ModelRenderer(this, 0, 43);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, -8F, 0F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 20, 59);
      body.addBox(-4F, 0F, -2F, 14, 18, 9);
      body.setRotationPoint(-3F, -8F, -1F);
      body.setTextureSize(128, 128);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 0, 59);
      rightarm.addBox(-3F, -2F, -2F, 5, 16, 5);
      rightarm.setRotationPoint(-9F, -5F, 0F);
      rightarm.setTextureSize(128, 128);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 66, 59);
      leftarm.addBox(-1F, -2F, -2F, 5, 16, 5);
      leftarm.setRotationPoint(8F, -5F, 0F);
      leftarm.setTextureSize(128, 128);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 20, 86);
      rightleg.addBox(-2F, 0F, -2F, 5, 14, 5);
      rightleg.setRotationPoint(-4F, 10F, 0F);
      rightleg.setTextureSize(128, 128);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 46, 86);
      leftleg.addBox(-2F, 0F, -2F, 5, 14, 5);
      leftleg.setRotationPoint(4F, 10F, 0F);
      leftleg.setTextureSize(128, 128);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      mask1 = new ModelRenderer(this, 111, 0);
      mask1.addBox(-4F, -8F, -4F, 8, 10, 1);
      mask1.setRotationPoint(0F, -9F, 0F);
      mask1.setTextureSize(128, 128);
      mask1.mirror = true;
      setRotation(mask1, 0F, 0F, 0F);
      mask2 = new ModelRenderer(this, 107, 11);
      mask2.addBox(-5F, -8F, -4F, 10, 8, 1);
      mask2.setRotationPoint(0F, -8F, 0F);
      mask2.setTextureSize(128, 128);
      mask2.mirror = true;
      setRotation(mask2, 0F, 0F, 0F);
      mask3 = new ModelRenderer(this, 110, 19);
      mask3.addBox(-4F, -8F, -5F, 8, 8, 1);
      mask3.setRotationPoint(0F, -8F, 0F); //0 -8 0 OFFSET -4. -8. -5
      mask3.setTextureSize(128, 128);
      mask3.mirror = true;
      setRotation(mask3, 0F, 0F, 0F);
      mask4 = new ModelRenderer(this, 103, 0);
      mask4.addBox(-1F, -4F, -6F, 2, 1, 1);
      mask4.setRotationPoint(0F, -8F, 0F); //-3F, -8F, -1F
      mask4.setTextureSize(128, 128);
      mask4.mirror = true;
      setRotation(mask4, 0F, 0F, 0F);
      machete1 = new ModelRenderer(this, 60, 0);
      machete1.addBox(-1F, 11F, -4F, 1, 2, 2);
      machete1.setRotationPoint(-9F, -5F, 0F);
      machete1.setTextureSize(128, 128);
      machete1.mirror = true;
      setRotation(machete1, 0F, 0F, 0F);
      machete2 = new ModelRenderer(this, 60, 4);
      machete2.addBox(-1F, 11F, -16F, 1, 3, 12);
      machete2.setRotationPoint(-9F, -5F, 0F);
      machete2.setTextureSize(128, 128);
      machete2.mirror = true;
      setRotation(machete2, 0F, 0F, 0F);
      machete3 = new ModelRenderer(this, 60, 19);
      machete3.addBox(-1F, 11F, -17F, 1, 2, 1);
      machete3.setRotationPoint(-9F, -5F, 0F);
      machete3.setTextureSize(128, 128);
      machete3.mirror = true;
      setRotation(machete3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    mask1.render(f5);
    mask2.render(f5);
    mask3.render(f5);
    mask4.render(f5);
    machete1.render(f5);
    machete2.render(f5);
    machete3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
	  this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * -1.4F * f1;
	  
	  this.leftarm.rotateAngleX = MathHelper.cos(f * 0.0662F + (float)Math.PI) * -0.4F * f1;
	  this.rightarm.rotateAngleX = MathHelper.cos(f * 0.0662F + (float)Math.PI) * 0.4F * f1;
	  
	  this.machete1.rotateAngleX = MathHelper.cos(f * 0.0662F + (float)Math.PI) * 0.4F * f1;
	  this.machete2.rotateAngleX = MathHelper.cos(f * 0.0662F + (float)Math.PI) * 0.4F * f1;
	  this.machete3.rotateAngleX = MathHelper.cos(f * 0.0662F + (float)Math.PI) * 0.4F * f1;
	  
	  this.head.rotateAngleY = f3 * 0.017453292F;
	  this.head.rotateAngleX = f4 * 0.017453292F;
	  
	  this.mask1.rotateAngleY = f3 * 0.017453292F;
	  this.mask1.rotateAngleX = f4 * 0.017453292F;
	  
	  this.mask2.rotateAngleY = f3 * 0.017453292F;
	  this.mask2.rotateAngleX = f4 * 0.017453292F;
	  
	  this.mask3.rotateAngleY = f3 * 0.017453292F;
	  this.mask3.rotateAngleX = f4 * 0.017453292F;
	  
	  this.mask4.rotateAngleY = f3 * 0.017453292F;
	  this.mask4.rotateAngleX = f4 * 0.017453292F;
    //super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}