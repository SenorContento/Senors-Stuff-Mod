package com.senorcontento.stuff;

import net.minecraft.item.Item;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;


import net.minecraftforge.fml.common.registry.GameRegistry; //DEPRECATED

public class ModItems
{
  
  public static Item scythe;

  @EventHandler
  public static void init(FMLInitializationEvent event)
  {
    scythe = new Item().setUnlocalizedName("senorsstuff:scythe").setCreativeTab(SenorsStuff.getCreativeTab());

    //GameRegistry.register(scythe, "Scythe"); //DEPRECATED
  }
}
