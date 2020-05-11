package com.krassepizza.fridaymod.items.armor;

import com.krassepizza.fridaymod.Main;
import com.krassepizza.fridaymod.init.ModItems;
import com.krassepizza.fridaymod.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) //Manually added String name
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FridaymodTAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
