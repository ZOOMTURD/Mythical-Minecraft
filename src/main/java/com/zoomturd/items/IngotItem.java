package com.zoomturd.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotItem extends Item
{
	public IngotItem(String unlocalizedName) 
	{
        super();
        
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
