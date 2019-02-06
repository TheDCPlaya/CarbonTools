package com.github.thedcplaya.carbontools.item.Tool;

import com.github.thedcplaya.carbontools.CarbonTools;
import net.minecraft.item.ItemSpade;

public class ItemShovel extends ItemSpade {

    private String name;

    public ItemShovel(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(CarbonTools.creativeTab);
    }

    public void registerItemModel() { CarbonTools.proxy.registerItemRenderer(this, 0, name); }
 }
