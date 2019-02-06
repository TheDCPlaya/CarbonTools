package com.github.thedcplaya.carbontools.item.Tool;

import com.github.thedcplaya.carbontools.CarbonTools;



public class ItemSword extends net.minecraft.item.ItemSword {

    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        this.name = name;
        setCreativeTab(CarbonTools.creativeTab);
    }

    public void registerItemModel() {
        CarbonTools.proxy.registerItemRenderer(this, 0, name);
    }

}