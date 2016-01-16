package com.zoomturd.items;


import com.zoomturd.ctab;

import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword {
	
	private static ToolMaterial material;
	public ItemModSword(String unlocalizedName) 
	{
        super(material);
        
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ctab.ctab);
    }
	public ItemModSword(String unlocalizedName, ToolMaterial material) {
	    super(material);
	    this.setUnlocalizedName(unlocalizedName);
	}
}
