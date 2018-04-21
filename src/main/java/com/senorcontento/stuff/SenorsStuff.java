package com.senorcontento.stuff;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item; // For the abstract concept of Item!!!
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
@Mod(modid = SenorsStuff.MODID, name = SenorsStuff.NAME, version = SenorsStuff.VERSION, useMetadata = true)
public class SenorsStuff
{
	public static final String MODID = "senorsstuff";
	public static final String NAME = "SenorContento's Stuff";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("Initializing " + SenorsStuff.NAME);
		System.out.println(Blocks.DIRT.getLocalizedName() + ": " + Blocks.DIRT.getUnlocalizedName());
		SenorsStuffCreativeTab tab = new SenorsStuffCreativeTab(CreativeTabs.getNextID()); //Initializes The Tab for Creative Mode
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre-Initializing " + SenorsStuff.NAME);
		MinecraftForge.EVENT_BUS.register(new SenorsStuff());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post-Initializing " + SenorsStuff.NAME);
	}
	
	//Putting Registration of Items/Blocks in their own classes for Readability.
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		RegisterBlocks registerBlock = new RegisterBlocks();
		registerBlock.register(event);
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		RegisterItems registerItem = new RegisterItems();
		registerItem.register(event);
	}
}
