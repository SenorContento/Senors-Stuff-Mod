package com.senorcontento.stuff;

//import com.senorcontento.stuff.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item; // For the abstract concept of Item!!!
import net.minecraft.init.Items; // For a list of vanilla items, such as Items.DIAMOND (case-sensitive)
import net.minecraft.item.ItemStack; 
import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import javax.annotation.Nonnull;

@Mod(modid = SenorsStuff.MODID, version = SenorsStuff.VERSION)
public class SenorsStuff
{
  public static final String MODID = "senorsstuff";
  public static final String NAME = "SenorContento's Stuff";
  public static final String VERSION = "1.0";

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
    ModItems.init(event);
  }

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    System.out.println("Pre-Initializing " + SenorsStuff.NAME);
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    System.out.println("Post-Initializing " + SenorsStuff.NAME);
  }

  /*@SubscribeEvent
  public void registerBlocks(RegistryEvent.Register<Block> event) {
    event.getRegistry().registerAll(block1, block2, ...);
  }

  @SubscribeEvent
  public void registerItems(RegistryEvent.Register<Item> event) {
    event.getRegistry().registerAll(item1, item2, ...);
  }*/

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
