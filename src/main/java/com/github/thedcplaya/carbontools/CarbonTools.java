package com.github.thedcplaya.carbontools;

import WorldGeneration.ModWorldGen;
import com.github.thedcplaya.carbontools.ModRecipes.ModRecipes;
import com.github.thedcplaya.carbontools.block.ModBlocks;
import com.github.thedcplaya.carbontools.item.ModItems;
import com.github.thedcplaya.carbontools.proxy.CommonProxy;
import com.github.thedcplaya.carbontools.util.CarbonToolsTab;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = CarbonTools.MODID, name = CarbonTools.NAME, version = CarbonTools.VERSION)
public class CarbonTools
{

    public static final String MODID = "carbontools";
    public static final String NAME = "CarbonTools";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(MODID)
    public static CarbonTools instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator( new ModWorldGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        ModRecipes.init();
    }

    @SidedProxy(serverSide = "com.github.thedcplaya.carbontools.proxy.CommonProxy", clientSide = "com.github.thedcplaya.carbontools.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

    }
    public static final CarbonToolsTab creativeTab = new CarbonToolsTab();


    public static final Item.ToolMaterial carbonToolMaterial = EnumHelper.addToolMaterial("CARBON", 25, 0, 6, 999999, 14);
    public static final ItemArmor.ArmorMaterial carbonArmorMaterial = EnumHelper.addArmorMaterial("CARBON", MODID + ":carbon", 0, new int[]{25, 25, 25, 25}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 500.0F);
}

