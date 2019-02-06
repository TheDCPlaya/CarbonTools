package com.github.thedcplaya.carbontools.modrecipes;

import com.github.thedcplaya.carbontools.block.ModBlocks;
import com.github.thedcplaya.carbontools.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.github.thedcplaya.carbontools.item.ModItems.ingotCarbon;

public class ModRecipes
{
    public static void init()

    {
        GameRegistry.addSmelting(ModBlocks.oreCarbon, new ItemStack(ingotCarbon), 0.7f);
    }
}