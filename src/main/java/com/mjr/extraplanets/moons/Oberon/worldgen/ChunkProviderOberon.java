package com.mjr.extraplanets.moons.Oberon.worldgen;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;
import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.blocks.fluid.ExtraPlanets_Fluids;
import com.mjr.extraplanets.moons.Oberon.worldgen.village.MapGenVillageOberon;
import com.mjr.extraplanets.world.prefabs.ChunkProviderCustomSpace;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class ChunkProviderOberon extends ChunkProviderCustomSpace {
	private final BiomeDecoratorOberon biomeDecorator = new BiomeDecoratorOberon();
	public Random randomGenerator;

	private final MapGenCaveOberon caveGenerator = new MapGenCaveOberon();

	private final MapGenRavineOberon ravineGenerator = new MapGenRavineOberon();

	private final MapGenVillageOberon villageGenerator = new MapGenVillageOberon();

	public ChunkProviderOberon(World par1World, long seed, boolean mapFeaturesEnabled) {
		super(par1World, seed, mapFeaturesEnabled);
		this.waterBlock = ExtraPlanets_Fluids.methane;
	}

	@Override
	protected List<MapGenBaseMeta> getWorldGenerators() {
		List<MapGenBaseMeta> generators = Lists.newArrayList();
		generators.add(this.caveGenerator);
		return generators;
	}

	@Override
	public void onChunkProvide(int cX, int cZ, Block[] blocks, byte[] metadata) {
		this.ravineGenerator.func_151539_a(this, this.worldObj, cX, cZ, blocks);
	}

	@Override
	public void recreateStructures(int par1, int par2) {
		if (Config.oberonVillages)
			this.villageGenerator.func_151539_a(this, this.worldObj, par1, par2, (Block[]) null);
	}

	@Override
	public void decoratePlanet(World world, Random rand, int x, int z) {
		this.biomeDecorator.decorateChunk(world, rand, null, x, z);
	}

	@Override
	protected int getCraterProbability() {
		return 0;
	}

	@Override
	public void onPopulate(int cX, int cZ) {
		if (Config.oberonVillages)
			this.villageGenerator.generateStructuresInChunk(this.worldObj, this.rand, cX, cZ);
	}
}