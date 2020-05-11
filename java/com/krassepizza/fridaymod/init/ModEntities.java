package com.krassepizza.fridaymod.init;

import com.krassepizza.fridaymod.Main;
import com.krassepizza.fridaymod.entity.EntityJason;
import com.krassepizza.fridaymod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities 
{
	public static void registerEntities()
	{
		registerEntity("jason", EntityJason.class, Reference.ENTITY_JASON, 220, 43650, 000000);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}

///////////////////// PASST //////////////////////////