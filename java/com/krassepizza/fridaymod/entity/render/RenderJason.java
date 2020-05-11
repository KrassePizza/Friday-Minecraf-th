package com.krassepizza.fridaymod.entity.render;

import com.krassepizza.fridaymod.entity.EntityJason;
import com.krassepizza.fridaymod.entity.model.ModelJason;
import com.krassepizza.fridaymod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJason extends RenderLiving<EntityJason>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/jason.png");

	public RenderJason(RenderManager manager) 
	{
		super(manager, new ModelJason(), 1.0F); //letztes = Size
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityJason entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityJason entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}








//////////////// STIMMT MIT DEM VID ÜBEREIN ////////////////////////
