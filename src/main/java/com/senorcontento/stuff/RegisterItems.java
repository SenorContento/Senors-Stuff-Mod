package com.senorcontento.stuff;

import com.senorcontento.stuff.items.Scythe;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

public class RegisterItems {
	public static Item FastCobbleItem = null;
	public static Item ClockItem = null;
	
	public void register(RegistryEvent.Register<Item> event) {
		//event.getRegistry().registerAll(scythe);//, item2, ...);
		
		FastCobble();
		Clock();
		
		event.getRegistry().registerAll(FastCobbleItem, ClockItem);
	}
	
	public Item FastCobble() {
		FastCobbleItem = new ItemBlock(RegisterBlocks.FastCobble).setRegistryName(RegisterBlocks.FastCobble.getRegistryName());
		ModelResourceLocation FastCobbleResource = new ModelResourceLocation(SenorsStuff.MODID + ":fast_cobble", "inventory");
		ModelLoader.setCustomModelResourceLocation(FastCobbleItem, 0, FastCobbleResource);
		System.out.println("RN: " + RegisterBlocks.FastCobble.getRegistryName());
		System.out.println("FC: " + FastCobbleResource.toString());
		
		System.out.println("Register Item: " + FastCobbleItem.getUnlocalizedName().toString());
		return FastCobbleItem;
	}
	
	public Item Clock() {
		ClockItem = new ItemBlock(RegisterBlocks.Clock).setRegistryName(RegisterBlocks.Clock.getRegistryName());
		ModelResourceLocation ClockResource = new ModelResourceLocation(SenorsStuff.MODID + ":clock", "inventory"); //WTF - Changes FastCobble, but Not Clock
		ModelLoader.setCustomModelResourceLocation(ClockItem, 0, ClockResource); //WTF
		
		System.out.println("RN: " + RegisterBlocks.Clock.getRegistryName());
		System.out.println("CR: " + ClockResource.toString());
		
		System.out.println("Register Item: " + ClockItem.getUnlocalizedName().toString());
		return ClockItem;
	}
	
	/*public Item Scythe() {
		Scythe scythe = new Scythe();
		
		return scythe;
	}*/
}
