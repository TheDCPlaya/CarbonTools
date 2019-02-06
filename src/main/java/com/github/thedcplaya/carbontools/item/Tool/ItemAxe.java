package com.github.thedcplaya.carbontools.item.Tool;

import com.github.thedcplaya.carbontools.CarbonTools;

public class ItemAxe extends net.minecraft.item.ItemAxe {

    private String name;

    public ItemAxe(ToolMaterial material, String name) {
        super(material, 10f, -3.1f);
        setRegistryName(name);
        setTranslationKey(name);
        this.name = name;
        setCreativeTab(CarbonTools.creativeTab);
    }

    public void registerItemModel() {
        CarbonTools.proxy.registerItemRenderer(this, 0, name);
    }

}