package com.github.thedcplaya.carbontools.item;

import com.github.thedcplaya.carbontools.CarbonTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    protected String name;

    public ItemBase(String name)
    {
     this.name = name;
     setTranslationKey(name);
     setRegistryName(name);
     setCreativeTab(CarbonTools.creativeTab);
    }

    public void registerItemModel()
    {
        CarbonTools.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab)
    {
    super.setCreativeTab(tab);
    return this;
    }
}
