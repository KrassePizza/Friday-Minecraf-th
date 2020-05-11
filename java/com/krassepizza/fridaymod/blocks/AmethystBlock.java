package com.krassepizza.fridaymod.blocks;

import com.krassepizza.fridaymod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AmethystBlock extends BlockBase 
{

	public AmethystBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.2F);
		setCreativeTab(Main.FridaymodTAB);
		//setLightOpacity(1);     1 = Transparent
		//setBlockUnbreakable();
	}

}
