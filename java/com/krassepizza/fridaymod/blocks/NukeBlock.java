package com.krassepizza.fridaymod.blocks;

import java.util.Random;

import com.krassepizza.fridaymod.Main;
import com.krassepizza.fridaymod.init.ModBlocks;
import com.krassepizza.fridaymod.init.ModItems;
import com.krassepizza.fridaymod.util.IHasModel;
import com.krassepizza.fridaymod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class NukeBlock extends BlockTNT implements IHasModel
{	
	public static final PropertyBool EXPLODE = PropertyBool.create("explode");
	
	double radius = 100;
	int countdown = 50;

	public NukeBlock(String name, Material material) 
	{
		super();
		blockParticleGravity = 0.01F;
		setSoundType(SoundType.ANVIL);
		setHardness(20.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
	    setCreativeTab(Main.FridaymodTAB);
	    this.setDefaultState(this.blockState.getBaseState().withProperty(EXPLODE, Boolean.valueOf(false)));
	    
	    setUnlocalizedName(name);
		setRegistryName(name);
	    ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (worldIn.isBlockPowered(pos))
        {
            this.onBlockDestroyedByPlayer(worldIn, pos, state.withProperty(EXPLODE, Boolean.valueOf(true)));
            worldIn.setBlockToAir(pos);
        }
    }
	
	@Override
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return true;
	}

	
	public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(EXPLODE, Boolean.valueOf((meta & 1) > 0));
    }


    public int getMetaFromState(IBlockState state)
    {
        return ((Boolean)state.getValue(EXPLODE)).booleanValue() ? 1 : 0;
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {EXPLODE});
    }
    
    

	
	
	public boolean isFullCube(IBlockState state)
	{
		return true;
	}
	
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	//@Override
	//public TileEntity createNewTileEntity(World worldIn, int meta) {
	//
	//	return null;
	//}
	
	//public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	//{
	//	return Nuke_AABB;
	//}
	
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}
