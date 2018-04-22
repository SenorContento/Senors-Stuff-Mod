package com.senorcontento.stuff;

import com.senorcontento.stuff.blocks.Clock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.RegistryEvent;

public class RegisterBlocks {
	public static Block FastCobble = null;
	public static Clock Clock = null;
	
	public void register(RegistryEvent.Register<Block> event) {
		//event.getRegistry().registerAll(clock);//, block2, ...);
		
		// Initialize These Blocks
		FastCobble();
		Clock();
		
		event.getRegistry().registerAll(FastCobble, Clock);
	}
	
	public Block FastCobble() {
		FastCobble = new Block(Material.GRASS);
		FastCobble.setHardness((float) 0.5);
		FastCobble.setRegistryName(SenorsStuff.MODID + ":" + "fast_cobble");
		//System.out.println("COBBLE > " + Blocks.COBBLESTONE.getUnlocalizedName().substring(5));
		FastCobble.setUnlocalizedName(Blocks.COBBLESTONE.getUnlocalizedName().substring(5)); //FastCobble.getRegistryName().toString());
		
		System.out.println("Register Block: " + FastCobble.toString());
		return FastCobble;
	}
	
	public Block Clock() {
		Clock = new Clock(SenorsStuff.MODID + ":" + "clock", Material.TNT);
		
		return Clock;
	}
}
