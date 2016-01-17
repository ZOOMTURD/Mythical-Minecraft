package com.zoomturd.items;

import com.zoomturd.ctab;
import com.zoomturd.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ComponentItem extends Item
{
	public ComponentItem(String unlocalizedName) 
	{
        super();
        
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(mod.ctab);
    }
}
