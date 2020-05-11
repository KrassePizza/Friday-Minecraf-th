package com.krassepizza.fridaymod.entity;

import com.krassepizza.fridaymod.util.handlers.LootTableHandler;
import com.krassepizza.fridaymod.util.handlers.SoundsHandler;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.storage.loot.LootTableList;

public class EntityJason extends EntityZombie //EntityEnderman
{

	public EntityJason(World worldIn) 
	{
		super(worldIn);
		this.setSize(2.0F, 3.0F);
		this.isImmuneToFire = true;

	}
	
	@Override
	protected void initEntityAI()
    {
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D, 0.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.applyEntityAI();
    }
	
	@Override
	protected void applyEntityAI()
    {
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }
	
	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(500.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(100.0D);
    }
	
	@Override
	public float getEyeHeight()
	{
		return 3.0F;
	}
	
	
	@Override
	protected boolean shouldBurnInDay()
    {
        return false;
    }
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return SoundsHandler.ENTITY_JASON_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		return SoundEvents.ENTITY_GENERIC_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundsHandler.ENTITY_JASON_DEATH;
	}
	
	@Override
    protected ResourceLocation getLootTable()
    {
        return LootTableHandler.JASON;
    }

	
	@Override
	public boolean getCanSpawnHere()
    {
        BlockPos blockpos = new BlockPos(MathHelper.floor(this.posX), 0, MathHelper.floor(this.posZ));
        Chunk chunk = this.world.getChunkFromBlockCoords(blockpos);

        if (this.world.getWorldInfo().getTerrainType().handleSlimeSpawnReduction(rand, world))
        {
            return false;
        }
        else
        {
            if (this.world.getDifficulty() != EnumDifficulty.PEACEFUL)
            {
                Biome biome = this.world.getBiome(blockpos);

                if (biome == Biomes.SWAMPLAND && this.posY > 40.0D && this.posY < 90.0D && this.rand.nextFloat() < 0.5F && this.rand.nextFloat() < this.world.getCurrentMoonPhaseFactor() && this.world.getLightFromNeighbors(new BlockPos(this)) <= this.rand.nextInt(5))
                {
                    return super.getCanSpawnHere();
                }

                if (this.rand.nextInt(10) == 0 && chunk.getRandomWithSeed(987234911L).nextInt(10) == 0 && this.posY < 40.0D)
                {
                    return super.getCanSpawnHere();
                }
            }

            return false;
        }
    }
}


////////////////////// PASST ///////////////////////
