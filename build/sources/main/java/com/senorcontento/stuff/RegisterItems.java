package com.senorcontento.stuff;

import com.senorcontento.stuff.items.Scythe;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

public class RegisterItems {
	public static Item FastCobbleItem = null;
	
	public void register(RegistryEvent.Register<Item> event) {
		//event.getRegistry().registerAll(scythe);//, item2, ...);
		
		Item fc = FastCobble();
		
		event.getRegistry().registerAll(fc);
	}
	
	public Item FastCobble() {
		FastCobbleItem = new ItemBlock(RegisterBlocks.FastCobble).setRegistryName(RegisterBlocks.FastCobble.getRegistryName());
		ModelResourceLocation FastCobbleResource = new ModelResourceLocation(SenorsStuff.MODID + ":fast_cobble", "normal");
		ModelLoader.setCustomModelResourceLocation(FastCobbleItem, 0, FastCobbleResource);
		
		System.out.println("Register Item: " + FastCobbleItem.toString());
		return FastCobbleItem;
	}
	
	/*public Item Scythe() {
		Scythe scythe = new Scythe();
		
		return scythe;
	}*/
}
