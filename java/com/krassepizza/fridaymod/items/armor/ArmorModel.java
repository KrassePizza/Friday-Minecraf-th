package com.krassepizza.fridaymod.items.armor;

import com.krassepizza.fridaymod.Main;
import com.krassepizza.fridaymod.init.ModItems;
import com.krassepizza.fridaymod.items.armor.models.ModelHockeyMask;
import com.krassepizza.fridaymod.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorModel extends ItemArmor implements IHasModel
{
	public ArmorModel(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FridaymodTAB);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
	{
		if(itemStack != ItemStack.EMPTY) 
		{
			if(itemStack.getItem() instanceof ItemArmor)
			{
				ModelHockeyMask model = new ModelHockeyMask();
				
				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				
				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.rightArmPose = _default.rightArmPose;
				model.leftArmPose = _default.leftArmPose;
				
				return model;
			}
		}
		
		return null;
	}

}
