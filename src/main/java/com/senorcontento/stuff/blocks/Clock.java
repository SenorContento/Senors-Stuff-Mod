package com.senorcontento.stuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Clock extends Block {
	public Clock(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}