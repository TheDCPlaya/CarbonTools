package com.github.thedcplaya.carbontools.item.armor;

import com.github.thedcplaya.carbontools.CarbonTools;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemArmor extends net.minecraft.item.ItemArmor
{
    private String name;

    public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(CarbonTools.creativeTab);
    }

    public void registerItemModel() {
        CarbonTools.proxy.registerItemRenderer(this, 0, name);
    }
}