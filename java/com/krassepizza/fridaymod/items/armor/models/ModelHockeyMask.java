package com.krassepizza.fridaymod.items.armor.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHockeyMask extends ModelBiped
{
	public ModelRenderer mask1;
	public ModelRenderer mask2;
	public ModelRenderer mask3;
	public ModelRenderer mask4;
	
	public ModelHockeyMask()
	{
		this.textureWidth = 128;
		this.textureHeight = 128;
		
		this.mask1 = new ModelRenderer(this, 110, 0); //46
		this.mask1.setRotationPoint(-4.0F, -8.0F, -4.0F);
		this.mask1.addBox(0.0F, -1.0F, 0.0F,  8, 10, 1, 0.0F);
		
		this.mask2 = new ModelRenderer(this, 106, 11);     //42
		this.mask2.setRotationPoint(-4.0F, -8.0F, -4.0F);
		this.mask2.addBox(-1.0F, 0.0F, 0.0F,  10, 8, 1, 0.0F);
		
		this.mask3 = new ModelRenderer(this, 110, 20); //46
		this.mask3.setRotationPoint(-4.0F, -8.0F, -4.0F);
		this.mask3.addBox(0.0F, 0.0F, -1.0F,  8, 8, 1, 0.0F);
		
		this.mask4 = new ModelRenderer(this, 103, 0); //36
		this.mask4.setRotationPoint(-4.0F, -8.0F, -4.0F);
		this.mask4.addBox(3.0F, 4.0F, -2.0F,  2, 1, 1, 0.0F);
		
		this.bipedHead.addChild(mask1);
		this.bipedHead.addChild(mask2);
		this.bipedHead.addChild(mask3);
		this.bipedHead.addChild(mask4);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
	}
	
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
