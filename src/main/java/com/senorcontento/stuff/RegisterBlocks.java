package com.senorcontento.stuff;

import com.senorcontento.stuff.blocks.Clock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.RegistryEvent;

public class RegisterBlocks {
	public static Block FastCobble = null;
	
	public void register(RegistryEvent.Register<Block> event) {
		//event.getRegistry().registerAll(clock);//, block2, ...);
		
		Block fc = FastCobble();
		
		event.getRegistry().registerAll(fc);
	}
	
	public Block FastCobble() {
		FastCobble = new Block(Material.GRASS);
		FastCobble.setHardness((float) 0.5);
		FastCobble.setRegistryName(SenorsStuff.MODID + ":" + "fast_cobble");
		//System.out.println("COBBLE > " + Blocks.COBBLESTONE.getUnlocalizedName().substring(5));
		FastCobble.setUnlocalizedName(Blocks.COBBLESTONE.getUnlocalizedName().substring(5)); //FastCobble.getRegistryName().toString());
		//FastCobble.setCreativeTab(tab);
		
		System.out.println("Register Block: " + FastCobble.toString());
		return FastCobble;
	}
	
	/*public Block Clock() {
		Clock clock = new Clock();
		
		return clock;
	}*/
}
