package com.github.thedcplaya.carbontools.util;

import com.github.thedcplaya.carbontools.CarbonTools;
import com.github.thedcplaya.carbontools.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class CarbonToolsTab extends CreativeTabs
{
    public CarbonToolsTab()
    {
     super(CarbonTools.MODID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.ingotCarbon);
    }
}
