package com.github.thedcplaya.carbontools.ModRecipes;

import com.github.thedcplaya.carbontools.block.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.github.thedcplaya.carbontools.item.ModItems.*;

public class ModRecipes
{
    public static void init()

        {
            GameRegistry.addSmelting(ModBlocks.oreCarbon, new ItemStack(ingotCarbon), 0.7f);
        }


    }

