package com.zoomturd.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item celestialbronzeingot;
	
	public static Item imperialgoldingot;
	
	public static Item stygianironingot;
	
	public static ItemModSword reapsting;
	
    public static void createItems() 
    {
     	
    	GameRegistry.registerItem(reapsting = new ItemModSword("reapsting", BONE), "reapsting");
    	
    	GameRegistry.registerItem(celestialbronzeingot = new IngotItem("celestialbronzeingot"), "celestialbronzeingot");
    	
    	GameRegistry.registerItem(imperialgoldingot = new IngotItem("imperialgoldingot"), "imperialgoldingot");
    	
    	GameRegistry.registerItem(stygianironingot = new IngotItem("stygianironingot"), "stygianironingot");
    }
    public static ToolMaterial BONE = EnumHelper.addToolMaterial("Bone", 3, 1738, 9.0F, 9, 21);
}

