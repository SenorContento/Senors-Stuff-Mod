package com.senorcontento.stuff;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

import com.senorcontento.stuff.blocks.Clock;

/*
 * Trying to set the CreativeTabs icon before the item/block is created results in a null icon.
 * Trying to set which tab an item goes into before creating the tab results in not being in the tab.
 * 
 * You can see the problem here... So, I am moved the adding to tab code to a separate class so it can
 * be called after the tab has been initialized.
 */
public class AddItemsToTab {
	public static Item Scythe = null;
	
	public void addToTab(CreativeTabs tab) {
		//Item grimReaperScythe = Scythe(tab); // Item Does Not Exist Yet
	}
	
	public Item Scythe(CreativeTabs tab) {
		Scythe = Item.getByNameOrId(SenorsStuff.MODID + ":" + "scythe");
		Scythe.setCreativeTab(tab);
		
		return Scythe;
	}
}
