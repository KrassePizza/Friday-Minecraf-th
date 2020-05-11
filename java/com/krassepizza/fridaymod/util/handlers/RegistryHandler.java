package com.krassepizza.fridaymod.util.handlers;

import com.krassepizza.fridaymod.init.ModBlocks;
import com.krassepizza.fridaymod.init.ModEntities;
import com.krassepizza.fridaymod.init.ModItems;
import com.krassepizza.fridaymod.util.IHasModel;
import com.krassepizza.fridaymod.world.gen.WorldGenCustomStructures;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
	}
	
	public static void preInitRegistries()
	{
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
	}
	
	public static void initRegistries()
	{
		SoundsHandler.registerSounds();
	}

}
