package com.krassepizza.fridaymod.blocks;

import com.krassepizza.fridaymod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlackholeBlock extends BlockBase
{
	//public static final AxisAlignedBB Blackhole_AABB = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.1825D, 0.625D, 0.8125D);
	
	public BlackholeBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.SLIME);
		setHardness(0.0F);
		setResistance(150.0F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(0.0F);
		setLightOpacity(1);
		setBlockUnbreakable();
		setCreativeTab(Main.FridaymodTAB);
	}
	
	public boolean isFullCube(IBlockState state)
	{
		return true;
	}
	
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos) 
	{
		return true;
	}

	
	//public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	//{
	//	return Blackhole_AABB;
	//}
	
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
		boolean isSmoking = true;
		
		worldIn.createExplosion(entityIn, pos.getX(), pos.getY(), pos.getZ(), 30.0F, isSmoking);
		entityIn.world.removeEntity(entityIn);
		entityIn.attackEntityFrom(DamageSource.MAGIC, (float) 2000);

    }
}
