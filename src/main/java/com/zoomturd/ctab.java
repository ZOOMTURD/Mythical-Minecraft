package com.zoomturd;

import com.zoomturd.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ctab extends CreativeTabs{

	public ctab(String label) {
		super(label);
		this.setBackgroundImageName("ctab.png");
	}


	@Override
	public Item getTabIconItem() {
		return ModItems.celestialbronzeingot;
	}

}