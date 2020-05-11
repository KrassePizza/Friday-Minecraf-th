package com.krassepizza.fridaymod.util.handlers;

import com.krassepizza.fridaymod.entity.EntityJason;
import com.krassepizza.fridaymod.entity.render.RenderJason;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityJason.class, new IRenderFactory<EntityJason>()
		{
			@Override
			public Render<? super EntityJason> createRenderFor(RenderManager manager)
			{
				return new RenderJason(manager);
			}
    	});
	}
}
