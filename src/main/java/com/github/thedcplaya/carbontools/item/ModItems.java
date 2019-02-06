package com.github.thedcplaya.carbontools.item;

import com.github.thedcplaya.carbontools.CarbonTools;
import com.github.thedcplaya.carbontools.item.Tool.ItemAxe;
import com.github.thedcplaya.carbontools.item.Tool.ItemPickaxe;
import com.github.thedcplaya.carbontools.item.Tool.ItemShovel;
import com.github.thedcplaya.carbontools.item.Tool.ItemSword;
import com.github.thedcplaya.carbontools.item.armor.ItemArmor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    // Tools

    public static ItemSword carbonSword = new ItemSword(CarbonTools.carbonToolMaterial, "carbon_sword");
    public static ItemPickaxe carbonPickaxe = new ItemPickaxe(CarbonTools.carbonToolMaterial, "carbon_pickaxe");
    public static ItemAxe carbonAxe = new ItemAxe(CarbonTools.carbonToolMaterial, "carbon_axe");
    public static ItemShovel carbonShovel = new ItemShovel(CarbonTools.carbonToolMaterial, "carbon_shovel");


    // Armor

    public static ItemArmor carbonHelm = new ItemArmor(CarbonTools.carbonArmorMaterial, EntityEquipmentSlot.HEAD, "carbon_helm");
    public static ItemArmor carbonChestplate = new ItemArmor(CarbonTools.carbonArmorMaterial, EntityEquipmentSlot.CHEST, "carbon_chestplate");
    public static ItemArmor carbonLeggins = new ItemArmor(CarbonTools.carbonArmorMaterial, EntityEquipmentSlot.LEGS, "carbon_leggins");
    public static ItemArmor carbonBoots = new ItemArmor(CarbonTools.carbonArmorMaterial, EntityEquipmentSlot.FEET, "carbon_boots");

    //Items
    public static ItemBase ingotCarbon = new ItemBase("ingot_carbon");



    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll
                (
                        ingotCarbon,
                        carbonSword,
                        carbonPickaxe,
                        carbonAxe,
                        carbonShovel,
                        //armor
                        carbonHelm,
                        carbonChestplate,
                        carbonLeggins,
                        carbonBoots
                );
    }

    public static void registerModels()
    {
        //items
        ingotCarbon.registerItemModel();

        //Tools
        carbonSword.registerItemModel();
        carbonPickaxe.registerItemModel();
        carbonAxe.registerItemModel();
        carbonShovel.registerItemModel();

        //Armor
        carbonHelm.registerItemModel();
        carbonChestplate.registerItemModel();
        carbonLeggins.registerItemModel();
        carbonBoots.registerItemModel();
    }

}
