package com.krassepizza.fridaymod.tabs;

import com.krassepizza.fridaymod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FridaymodTab extends CreativeTabs
{

	public FridaymodTab(String label)
	{
		super("fridaymodtab");
		this.setBackgroundImageName("fridaymod.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.HOCKEYMASK);
	}
	
}