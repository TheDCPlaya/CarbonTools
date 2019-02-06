package com.github.thedcplaya.carbontools.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{

    //ore
    public static BlockOre oreCarbon = new BlockOre("ore_carbon");

    //block
    public static BlockCarbon blockCarbon = new BlockCarbon("carbon_block");


    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(
                oreCarbon,
                blockCarbon
        );
    }



    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                oreCarbon.createItemblock(),
                blockCarbon.createItemblock()
        );
    }

    public static void registerModels()
    {
        oreCarbon.registerItemModel(Item.getItemFromBlock(oreCarbon));
        blockCarbon.registerItemModel(Item.getItemFromBlock(blockCarbon));
    }


}
