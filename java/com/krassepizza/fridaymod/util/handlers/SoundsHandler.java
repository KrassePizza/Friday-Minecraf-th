package com.krassepizza.fridaymod.util.handlers;

import com.krassepizza.fridaymod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_JASON_AMBIENT, ENTITY_JASON_HURT, ENTITY_JASON_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_JASON_AMBIENT = registerSound("entity.jason.ambient");
		ENTITY_JASON_HURT = registerSound("entity.jason.hurt");
		ENTITY_JASON_DEATH = registerSound("entity.jason.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
