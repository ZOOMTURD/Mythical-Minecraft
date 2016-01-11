package com.zoomturd;

import com.zoomturd.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ctab extends CreativeTabs{

	public static CreativeTabs ctab;


	public ctab(String label) {
		super(label);
	}


	@Override
	public Item getTabIconItem() {
		return ModItems.celestialbronzeingot;
	}

}