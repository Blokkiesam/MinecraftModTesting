package com.dimmerworld.tutorialmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabTutorial extends CreativeTabs {

	public CreativeTabTutorial(int index, String label) {
		super(index, label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Items.BAKED_POTATO;
	}

}
