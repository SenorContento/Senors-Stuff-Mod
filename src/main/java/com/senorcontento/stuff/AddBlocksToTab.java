package com.senorcontento.stuff;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

import com.senorcontento.stuff.blocks.Clock;

/*
 * Trying to set the CreativeTabs icon before the item/block is created results in a null icon.
 * Trying to set which tab an item goes into before creating the tab results in not being in the tab.
 * 
 * You can see the problem here... So, I am moved the adding to tab code to a separate class so it can
 * be called after the tab has been initialized.
 */
public class AddBlocksToTab {
	public static Block FastCobble = null;
	public static Block Clock = null;
	
	public void addToTab(CreativeTabs tab) {
		Block fc = FastCobble(tab);
	}
	
	public Block FastCobble(CreativeTabs tab) {
		FastCobble = Block.getBlockFromName(SenorsStuff.MODID + ":" + "fast_cobble");
		FastCobble.setCreativeTab(tab);
		
		return FastCobble;
	}
	
	/*public Block Clock() {
		Clock = Block.getBlockFromName(SenorsStuff.MODID + ":" + "clock");
		Clock.setCreativeTab(tab);
		
		return clock;
	}*/
}
