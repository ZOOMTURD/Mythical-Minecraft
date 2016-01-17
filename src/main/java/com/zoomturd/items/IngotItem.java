package com.zoomturd.items;

import com.zoomturd.ctab;
import com.zoomturd.mod;

import net.minecraft.item.Item;

public class IngotItem extends Item
{
	public IngotItem(String unlocalizedName) 
	{
        super();
        
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(mod.ctab);
    }
}
