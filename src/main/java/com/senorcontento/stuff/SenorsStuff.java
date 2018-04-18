package com.senorcontento.stuff;

//import com.senorcontento.stuff.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item; // For the abstract concept of Item!!!
import net.minecraft.item.ItemBlock;
import net.minecraft.init.Items; // For a list of vanilla items, such as Items.DIAMOND (case-sensitive)
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nonnull;

import com.senorcontento.stuff.blocks.*;
import com.senorcontento.stuff.items.*;

@Mod.EventBusSubscriber
@Mod(modid = SenorsStuff.MODID, name = SenorsStuff.NAME, version = SenorsStuff.VERSION, useMetadata = true)
public class SenorsStuff
{
  public static final String MODID = "senorsstuff";
  public static final String NAME = "SenorContento's Stuff";
  public static final String VERSION = "1.0";
  
  public static Block FastCobble = null;
  public static Item FastCobbleItem = null;

  private static SenorsStuffCreativeTab tab;

  public static CreativeTabs getCreativeTab() {
    return tab;
  }

  @EventHandler
  public void init(FMLInitializationEvent event)
  {
    System.out.println("Initializing " + SenorsStuff.NAME);
    System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName());
    tab = new SenorsStuffCreativeTab(CreativeTabs.getNextID(), "Senor's Stuff");
  }

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    System.out.println("Pre-Initializing " + SenorsStuff.NAME);
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    System.out.println("Post-Initializing " + SenorsStuff.NAME);
  }

  @SubscribeEvent
  public void registerBlocks(RegistryEvent.Register<Block> event) {
	  Clock clock = new Clock();
	  //event.getRegistry().registerAll(clock);//, block2, ...);
	  
	  FastCobble = new Block(Material.CACTUS);
	  FastCobble.setHardness((float) 0.5);
	  FastCobble.setRegistryName(MODID + ":" + "fast_cobble");
	  //FastCobble.setUnlocalizedName(MODID + ":" + "fast_cobble");
	  System.out.println("Register Block: " + FastCobble.toString());
	  
	  event.getRegistry().registerAll(FastCobble);
  }

  @SubscribeEvent
  public void registerItems(RegistryEvent.Register<Item> event) {
	  Scythe scythe = new Scythe();
	  //event.getRegistry().registerAll(scythe);//, item2, ...);
	  
	  FastCobbleItem = new ItemBlock(FastCobble).setRegistryName(FastCobble.getRegistryName());
	  
	  System.out.println("Register Item: " + FastCobbleItem.toString());
	  event.getRegistry().registerAll(FastCobbleItem);
  }

  private static class SenorsStuffCreativeTab extends CreativeTabs {
	  public SenorsStuffCreativeTab(int id) {
		  super(MODID);
    	}
	  
	  public SenorsStuffCreativeTab(int id, String name) {
		  super(MODID);
		}

    @Nonnull
    @Override
    public ItemStack getIconItemStack() {
      return new ItemStack(Items.DIAMOND);
    }

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}
  }
}
