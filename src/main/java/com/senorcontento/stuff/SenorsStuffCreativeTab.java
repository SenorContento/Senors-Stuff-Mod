package com.senorcontento.stuff;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SenorsStuffCreativeTab extends CreativeTabs {
	private static final Block FastCobble = Block.getBlockFromName(SenorsStuff.MODID + ":" + "fast_cobble");
	private static String title = I18n.translateToLocal("tab.senorsstuff.name"); //http://www.i18nguy.com/origini18n.html

	public SenorsStuffCreativeTab(int id) {
		super(id, title);
	}
	
	public SenorsStuffCreativeTab(int id, String name) {
		super(id, name);
		title = name;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		return new ItemStack(FastCobble);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return getIconItemStack();
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return title;
	}
}