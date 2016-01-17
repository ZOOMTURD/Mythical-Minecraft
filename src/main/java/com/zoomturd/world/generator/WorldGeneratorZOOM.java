package com.zoomturd.world.generator;

import java.util.Random;

import com.zoomturd.Reference;
import com.zoomturd.blocks.ModBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneratorZOOM implements IWorldGenerator {

	private WorldGenerator celestialbronzeore;
	
	public WorldGeneratorZOOM() {
		//Causes crashes
		//this.celestialbronzeore = new WorldGenMinable(ModBlocks.celestialbronzeore.getDefaultState(), 8);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: 
			this.generator(celestialbronzeore, world, random, chunkX, chunkZ, 15, Reference.celestialbronzeoreminlevel, Reference.celestialbronzeoremaxlevel);
			break;
		case 1:
			break;
		case -1:
			break;
		}
	}
	private void generator(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int spawnchance, int minY, int maxY) {
		if (minY < 0 || maxY > 256 || minY > maxY)
			throw new IllegalArgumentException("Illegal Height Arguments");
		int heightdiff = maxY - minY + 1;
		for (int i = 0; i < spawnchance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minY + rand.nextInt(heightdiff);
			int z = chunkZ * 16 + rand.nextInt(16);
		}
	}
}
		
	


