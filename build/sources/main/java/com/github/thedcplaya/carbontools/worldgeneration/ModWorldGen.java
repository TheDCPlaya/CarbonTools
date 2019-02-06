package com.github.thedcplaya.carbontools.worldgeneration;

import com.github.thedcplaya.carbontools.block.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    private int veinCount = 5;
    private int maxY = 35;
    private int minY = 7;
    private int veinSize = 6;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
                         IChunkProvider chunkProvider) {

        if (!world.provider.isSurfaceWorld()) {
            return;
        }

        for (int i = 0; i < veinCount; i++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = random.nextInt(maxY - minY) + minY;
            int z = chunkZ * 16 + random.nextInt(16);
            (new WorldGenMinable(ModBlocks.oreCarbon.getDefaultState(), veinSize)).generate(world, random,
                    new BlockPos(x, y, z));
        }

    }
}