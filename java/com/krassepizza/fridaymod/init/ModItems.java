package com.krassepizza.fridaymod.init;

import java.util.ArrayList;
import java.util.List;

import com.krassepizza.fridaymod.items.armor.ArmorModel;
import com.krassepizza.fridaymod.items.tools.ToolSword;
import com.krassepizza.fridaymod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	//Materials
	public static final ToolMaterial MATERIAL_JASON = EnumHelper.addToolMaterial("material_jason", 3, 560, 8.0F, 7.0F, 12);
	public static final ArmorMaterial ARMOR_MATERIAL_JASON = EnumHelper.addArmorMaterial("armor_material_jason", Reference.MOD_ID + ":hockeymask", 12, 
			new int[] {2, 7, 5, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	
	//Items
	public static final List<Item> ITEMS = new ArrayList<Item>();
		
	//Tools
	public static final ItemSword MACHETE = new ToolSword("machete", MATERIAL_JASON);
	
	//Armor
	public static final Item HOCKEYMASK = new ArmorModel("hockeymask", ARMOR_MATERIAL_JASON, 1, EntityEquipmentSlot.HEAD);

}
